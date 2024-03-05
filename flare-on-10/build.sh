#!/bin/bash

cd /home/adiami/Desktop/flare-on-10
filename=$(echo $1 | cut -f  1 -d ".")
package=$(head $filename/AndroidManifest.xml | egrep -oh 'package=\"[A-Za-z\.0-9]*"\s' | cut -f 2 -d "\"")

echo 'package = '$package
echo $filename
echo -e "\n\n\t1. Decompile APK and generate JAVA source\n\t2. Build APK and sign\n\t3. Delete all"

read choise

UNSIGNED_APK=$filename-unsigned.apk
ALIGEND_APK=$filename-aligned.apk
SIGNED_APK=$filename-signed.apk

case $choise in
    1 )
    apktool d -f -o $filename/ $1
    apktool b -f -o $UNSIGNED_APK $filename/
    dex2jar -o $filename.jar $UNSIGNED_APK
    jadx -d $filename/src $filename.jar
    echo -e '\n\n\t Add android:debuggable="true" to strings.xml'
    ;;
    2 )
    rm -f $SIGNED_APK
    adb uninstall $package
    apktool b -f -o $UNSIGNED_APK $1
    keytool -genkey -v -keystore my.keystore -keyalg RSA -keysize 2048 -validity 10000 -alias flare_app
    zipalign -vp 4 $UNSIGNED_APK $ALIGEND_APK
    apksigner sign --ks-key-alias flare_app --ks my.keystore $ALIGEND_APK
    adb install $ALIGEND_APK
    ;;
    3 )
    rm -rfv .idea $filename $filename.jar flare-on-10.iml $filename-*
    clear
    ls -alh
    ;;
esac





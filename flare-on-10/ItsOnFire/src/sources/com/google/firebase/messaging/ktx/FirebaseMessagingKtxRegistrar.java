package com.google.firebase.messaging.ktx;

import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n��\u0018��2\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0016¨\u0006\u0006"}, d2 = {"Lcom/google/firebase/messaging/ktx/FirebaseMessagingKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "()V", "getComponents", "", "Lcom/google/firebase/components/Component;", "com.google.firebase-firebase-messaging-ktx"}, k = 1, mv = {1, 7, 1}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:com/google/firebase/messaging/ktx/FirebaseMessagingKtxRegistrar.class */
public final class FirebaseMessagingKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    @NotNull
    public List<Component<?>> getComponents() {
        List<Component<?>> listOf;
        listOf = CollectionsKt__CollectionsJVMKt.listOf(LibraryVersionComponent.create(MessagingKt.LIBRARY_NAME, "23.1.2"));
        return listOf;
    }
}

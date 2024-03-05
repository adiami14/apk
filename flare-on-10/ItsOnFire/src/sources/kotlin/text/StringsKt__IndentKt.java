package kotlin.text;

import androidx.appcompat.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"��\u001e\n��\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000b\u001a!\u0010��\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0002\b\u0004\u001a\u0011\u0010\u0005\u001a\u00020\u0006*\u00020\u0002H\u0002¢\u0006\u0002\b\u0007\u001a\u0014\u0010\b\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u001aJ\u0010\t\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001H\u0082\b¢\u0006\u0002\b\u000e\u001a\u0014\u0010\u000f\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u001a\u001e\u0010\u0011\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u001a\n\u0010\u0013\u001a\u00020\u0002*\u00020\u0002\u001a\u0014\u0010\u0014\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0002¨\u0006\u0015"}, d2 = {"getIndentFunction", "Lkotlin/Function1;", "", "indent", "getIndentFunction$StringsKt__IndentKt", "indentWidth", "", "indentWidth$StringsKt__IndentKt", "prependIndent", "reindent", "", "resultSizeEstimate", "indentAddFunction", "indentCutFunction", "reindent$StringsKt__IndentKt", "replaceIndent", "newIndent", "replaceIndentByMargin", "marginPrefix", "trimIndent", "trimMargin", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkedTextViewStyle, xs = "kotlin/text/StringsKt")
/* loaded from: ItsOnFire.jar:kotlin/text/StringsKt__IndentKt.class */
public class StringsKt__IndentKt extends StringsKt__AppendableKt {
    private static final Function1<String, String> getIndentFunction$StringsKt__IndentKt(final String str) {
        return str.length() == 0 ? new Function1<String, String>() { // from class: kotlin.text.StringsKt__IndentKt$getIndentFunction$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final String invoke(@NotNull String line) {
                Intrinsics.checkNotNullParameter(line, "line");
                return line;
            }
        } : new Function1<String, String>() { // from class: kotlin.text.StringsKt__IndentKt$getIndentFunction$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final String invoke(@NotNull String line) {
                Intrinsics.checkNotNullParameter(line, "line");
                return str + line;
            }
        };
    }

    private static final int indentWidth$StringsKt__IndentKt(String str) {
        int length = str.length();
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            } else if (!CharsKt__CharJVMKt.isWhitespace(str.charAt(i2))) {
                break;
            } else {
                i2++;
            }
        }
        int i3 = i2;
        if (i2 == -1) {
            i3 = str.length();
        }
        return i3;
    }

    @NotNull
    public static final String prependIndent(@NotNull String str, @NotNull final String indent) {
        Sequence map;
        String joinToString$default;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(indent, "indent");
        map = SequencesKt___SequencesKt.map(StringsKt__StringsKt.lineSequence(str), new Function1<String, String>() { // from class: kotlin.text.StringsKt__IndentKt$prependIndent$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final String invoke(@NotNull String it) {
                boolean isBlank;
                String str2;
                Intrinsics.checkNotNullParameter(it, "it");
                isBlank = StringsKt__StringsJVMKt.isBlank(it);
                if (isBlank) {
                    str2 = it;
                    if (it.length() < indent.length()) {
                        str2 = indent;
                    }
                } else {
                    str2 = indent + it;
                }
                return str2;
            }
        });
        joinToString$default = SequencesKt___SequencesKt.joinToString$default(map, "\n", null, null, 0, null, null, 62, null);
        return joinToString$default;
    }

    public static /* synthetic */ String prependIndent$default(String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str2 = "    ";
        }
        return prependIndent(str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final java.lang.String reindent$StringsKt__IndentKt(java.util.List<java.lang.String> r11, int r12, kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.String> r13, kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.String> r14) {
        /*
            r0 = r11
            int r0 = kotlin.collections.CollectionsKt.getLastIndex(r0)
            r15 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r16 = r0
            r0 = r11
            java.util.Iterator r0 = r0.iterator()
            r17 = r0
            r0 = 0
            r18 = r0
        L1a:
            r0 = r17
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L91
            r0 = r17
            java.lang.Object r0 = r0.next()
            r11 = r0
            r0 = r18
            if (r0 >= 0) goto L34
            kotlin.collections.CollectionsKt.throwIndexOverflow()
        L34:
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0
            r19 = r0
            r0 = r18
            if (r0 == 0) goto L46
            r0 = r18
            r1 = r15
            if (r0 != r1) goto L53
        L46:
            r0 = r19
            boolean r0 = kotlin.text.StringsKt.isBlank(r0)
            if (r0 == 0) goto L53
            r0 = 0
            r11 = r0
            goto L7e
        L53:
            r0 = r14
            r1 = r19
            java.lang.Object r0 = r0.invoke(r1)
            java.lang.String r0 = (java.lang.String) r0
            r20 = r0
            r0 = r19
            r11 = r0
            r0 = r20
            if (r0 == 0) goto L7e
            r0 = r13
            r1 = r20
            java.lang.Object r0 = r0.invoke(r1)
            java.lang.String r0 = (java.lang.String) r0
            r11 = r0
            r0 = r11
            if (r0 != 0) goto L7e
            r0 = r19
            r11 = r0
            goto L7e
        L7e:
            r0 = r11
            if (r0 == 0) goto L8b
            r0 = r16
            r1 = r11
            boolean r0 = r0.add(r1)
        L8b:
            int r18 = r18 + 1
            goto L1a
        L91:
            r0 = r16
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r3 = r12
            r2.<init>(r3)
            java.lang.String r2 = "\n"
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 124(0x7c, float:1.74E-43)
            r9 = 0
            java.lang.Appendable r0 = kotlin.collections.CollectionsKt.joinTo$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.StringBuilder r0 = (java.lang.StringBuilder) r0
            java.lang.String r0 = r0.toString()
            r11 = r0
            r0 = r11
            java.lang.String r1 = "mapIndexedNotNull { inde…\"\\n\")\n        .toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r0 = r11
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.StringsKt__IndentKt.reindent$StringsKt__IndentKt(java.util.List, int, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0137 A[SYNTHETIC] */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String replaceIndent(@org.jetbrains.annotations.NotNull java.lang.String r11, @org.jetbrains.annotations.NotNull java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.StringsKt__IndentKt.replaceIndent(java.lang.String, java.lang.String):java.lang.String");
    }

    public static /* synthetic */ String replaceIndent$default(String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str2 = "";
        }
        return replaceIndent(str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0115 A[SYNTHETIC] */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String replaceIndentByMargin(@org.jetbrains.annotations.NotNull java.lang.String r11, @org.jetbrains.annotations.NotNull java.lang.String r12, @org.jetbrains.annotations.NotNull java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.StringsKt__IndentKt.replaceIndentByMargin(java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    public static /* synthetic */ String replaceIndentByMargin$default(String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str2 = "";
        }
        if ((i2 & 2) != 0) {
            str3 = "|";
        }
        return replaceIndentByMargin(str, str2, str3);
    }

    @NotNull
    public static String trimIndent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return replaceIndent(str, "");
    }

    @NotNull
    public static final String trimMargin(@NotNull String str, @NotNull String marginPrefix) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(marginPrefix, "marginPrefix");
        return replaceIndentByMargin(str, "", marginPrefix);
    }

    public static /* synthetic */ String trimMargin$default(String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str2 = "|";
        }
        return trimMargin(str, str2);
    }
}

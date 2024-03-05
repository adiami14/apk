package androidx.compose.foundation.text.selection;

import androidx.appcompat.R;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
@Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/foundation/text/selection/SelectionAdjustment$Companion$Word$1$adjust$1.class */
public final /* synthetic */ class SelectionAdjustment$Companion$Word$1$adjust$1 extends FunctionReferenceImpl implements Function1<Integer, TextRange> {
    public SelectionAdjustment$Companion$Word$1$adjust$1(Object obj) {
        super(1, obj, TextLayoutResult.class, "getWordBoundary", "getWordBoundary--jx7JFs(I)J", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ TextRange invoke(Integer num) {
        return TextRange.m4463boximpl(m1062invokejx7JFs(num.intValue()));
    }

    /* renamed from: invoke--jx7JFs  reason: not valid java name */
    public final long m1062invokejx7JFs(int i2) {
        return ((TextLayoutResult) this.receiver).m4458getWordBoundaryjx7JFs(i2);
    }
}

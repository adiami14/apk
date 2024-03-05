package androidx.compose.ui.layout;

import androidx.appcompat.R;
import androidx.compose.ui.geometry.Size;
import kotlin.Metadata;
@Metadata(d1 = {"��\u0010\n��\n\u0002\u0010\u0007\n��\n\u0002\u0018\u0002\n\u0002\b\n\u001a%\u0010��\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\b\u0010\u0006\u001a%\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u0006\u001a%\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\f\u0010\u0006\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"computeFillHeight", "", "srcSize", "Landroidx/compose/ui/geometry/Size;", "dstSize", "computeFillHeight-iLBOSCw", "(JJ)F", "computeFillMaxDimension", "computeFillMaxDimension-iLBOSCw", "computeFillMinDimension", "computeFillMinDimension-iLBOSCw", "computeFillWidth", "computeFillWidth-iLBOSCw", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/layout/ContentScaleKt.class */
public final class ContentScaleKt {
    /* renamed from: access$computeFillHeight-iLBOSCw  reason: not valid java name */
    public static final /* synthetic */ float m3902access$computeFillHeightiLBOSCw(long j2, long j3) {
        return m3906computeFillHeightiLBOSCw(j2, j3);
    }

    /* renamed from: access$computeFillMaxDimension-iLBOSCw  reason: not valid java name */
    public static final /* synthetic */ float m3903access$computeFillMaxDimensioniLBOSCw(long j2, long j3) {
        return m3907computeFillMaxDimensioniLBOSCw(j2, j3);
    }

    /* renamed from: access$computeFillMinDimension-iLBOSCw  reason: not valid java name */
    public static final /* synthetic */ float m3904access$computeFillMinDimensioniLBOSCw(long j2, long j3) {
        return m3908computeFillMinDimensioniLBOSCw(j2, j3);
    }

    /* renamed from: access$computeFillWidth-iLBOSCw  reason: not valid java name */
    public static final /* synthetic */ float m3905access$computeFillWidthiLBOSCw(long j2, long j3) {
        return m3909computeFillWidthiLBOSCw(j2, j3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: computeFillHeight-iLBOSCw  reason: not valid java name */
    public static final float m3906computeFillHeightiLBOSCw(long j2, long j3) {
        return Size.m2236getHeightimpl(j3) / Size.m2236getHeightimpl(j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: computeFillMaxDimension-iLBOSCw  reason: not valid java name */
    public static final float m3907computeFillMaxDimensioniLBOSCw(long j2, long j3) {
        return Math.max(m3909computeFillWidthiLBOSCw(j2, j3), m3906computeFillHeightiLBOSCw(j2, j3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: computeFillMinDimension-iLBOSCw  reason: not valid java name */
    public static final float m3908computeFillMinDimensioniLBOSCw(long j2, long j3) {
        return Math.min(m3909computeFillWidthiLBOSCw(j2, j3), m3906computeFillHeightiLBOSCw(j2, j3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: computeFillWidth-iLBOSCw  reason: not valid java name */
    public static final float m3909computeFillWidthiLBOSCw(long j2, long j3) {
        return Size.m2239getWidthimpl(j3) / Size.m2239getWidthimpl(j2);
    }
}

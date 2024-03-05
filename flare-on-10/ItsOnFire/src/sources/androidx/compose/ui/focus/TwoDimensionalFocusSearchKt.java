package androidx.compose.ui.focus;

import androidx.appcompat.R;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.ModifiedFocusNode;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"��,\n��\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\b\u001a5\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a5\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\f\u001a\f\u0010\u0012\u001a\u00020\u0006*\u00020\u0006H\u0002\u001a1\u0010\u0013\u001a\u0004\u0018\u00010\u0014*\b\u0012\u0004\u0012\u00020\u00140\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0002ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a\f\u0010\u0019\u001a\u00020\u0006*\u00020\u0006H\u0002\u001a#\u0010\u001a\u001a\u0004\u0018\u00010\u0014*\u00020\u00142\u0006\u0010\t\u001a\u00020\nH��ø\u0001��ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001c\"\u000e\u0010��\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n��\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n��\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"InvalidFocusDirection", "", "NoActiveChild", "beamBeats", "", "source", "Landroidx/compose/ui/geometry/Rect;", "rect1", "rect2", "direction", "Landroidx/compose/ui/focus/FocusDirection;", "beamBeats-I7lrPNg", "(Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;I)Z", "isBetterCandidate", "proposedCandidate", "currentCandidate", "focusedRect", "isBetterCandidate-I7lrPNg", "bottomRight", "findBestCandidate", "Landroidx/compose/ui/node/ModifiedFocusNode;", "", "focusRect", "findBestCandidate-4WY_MpI", "(Ljava/util/List;Landroidx/compose/ui/geometry/Rect;I)Landroidx/compose/ui/node/ModifiedFocusNode;", "topLeft", "twoDimensionalFocusSearch", "twoDimensionalFocusSearch-Mxy_nc0", "(Landroidx/compose/ui/node/ModifiedFocusNode;I)Landroidx/compose/ui/node/ModifiedFocusNode;", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/focus/TwoDimensionalFocusSearchKt.class */
public final class TwoDimensionalFocusSearchKt {
    @NotNull
    private static final String InvalidFocusDirection = "This function should only be used for 2-D focus search";
    @NotNull
    private static final String NoActiveChild = "ActiveParent must have a focusedChild";

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/ui/focus/TwoDimensionalFocusSearchKt$WhenMappings.class */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            iArr[FocusStateImpl.Inactive.ordinal()] = 1;
            iArr[FocusStateImpl.Deactivated.ordinal()] = 2;
            iArr[FocusStateImpl.ActiveParent.ordinal()] = 3;
            iArr[FocusStateImpl.DeactivatedParent.ordinal()] = 4;
            iArr[FocusStateImpl.Active.ordinal()] = 5;
            iArr[FocusStateImpl.Captured.ordinal()] = 6;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0064, code lost:
        if (m2126beamBeats_I7lrPNg$majorAxisDistance2(r6, r8, r5) < beamBeats_I7lrPNg$majorAxisDistanceToFarEdge(r7, r8, r5)) goto L8;
     */
    /* renamed from: beamBeats-I7lrPNg  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final boolean m2125beamBeatsI7lrPNg(androidx.compose.ui.geometry.Rect r5, androidx.compose.ui.geometry.Rect r6, androidx.compose.ui.geometry.Rect r7, int r8) {
        /*
            r0 = r7
            r1 = r8
            r2 = r5
            boolean r0 = beamBeats_I7lrPNg$inSourceBeam(r0, r1, r2)
            r9 = r0
            r0 = 0
            r10 = r0
            r0 = r10
            r11 = r0
            r0 = r9
            if (r0 != 0) goto L6a
            r0 = r6
            r1 = r8
            r2 = r5
            boolean r0 = beamBeats_I7lrPNg$inSourceBeam(r0, r1, r2)
            if (r0 != 0) goto L24
            r0 = r10
            r11 = r0
            goto L6a
        L24:
            r0 = r7
            r1 = r8
            r2 = r5
            boolean r0 = beamBeats_I7lrPNg$isInDirectionOfSearch(r0, r1, r2)
            if (r0 != 0) goto L33
        L2d:
            r0 = 1
            r11 = r0
            goto L6a
        L33:
            androidx.compose.ui.focus.FocusDirection$Companion r0 = androidx.compose.ui.focus.FocusDirection.Companion
            r12 = r0
            r0 = r8
            r1 = r12
            int r1 = r1.m2099getLeftdhqQ8s()
            boolean r0 = androidx.compose.ui.focus.FocusDirection.m2091equalsimpl0(r0, r1)
            if (r0 != 0) goto L2d
            r0 = r8
            r1 = r12
            int r1 = r1.m2103getRightdhqQ8s()
            boolean r0 = androidx.compose.ui.focus.FocusDirection.m2091equalsimpl0(r0, r1)
            if (r0 == 0) goto L53
            goto L2d
        L53:
            r0 = r10
            r11 = r0
            r0 = r6
            r1 = r8
            r2 = r5
            float r0 = m2126beamBeats_I7lrPNg$majorAxisDistance2(r0, r1, r2)
            r1 = r7
            r2 = r8
            r3 = r5
            float r1 = beamBeats_I7lrPNg$majorAxisDistanceToFarEdge(r1, r2, r3)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L6a
            goto L2d
        L6a:
            r0 = r11
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.TwoDimensionalFocusSearchKt.m2125beamBeatsI7lrPNg(androidx.compose.ui.geometry.Rect, androidx.compose.ui.geometry.Rect, androidx.compose.ui.geometry.Rect, int):boolean");
    }

    private static final boolean beamBeats_I7lrPNg$inSourceBeam(Rect rect, int i2, Rect rect2) {
        boolean z;
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m2091equalsimpl0(i2, companion.m2099getLeftdhqQ8s()) ? true : FocusDirection.m2091equalsimpl0(i2, companion.m2103getRightdhqQ8s())) {
            if (rect.getBottom() > rect2.getTop() && rect.getTop() < rect2.getBottom()) {
                z = true;
            }
            z = false;
        } else {
            if (!(FocusDirection.m2091equalsimpl0(i2, companion.m2104getUpdhqQ8s()) ? true : FocusDirection.m2091equalsimpl0(i2, companion.m2097getDowndhqQ8s()))) {
                throw new IllegalStateException(InvalidFocusDirection.toString());
            }
            if (rect.getRight() > rect2.getLeft() && rect.getLeft() < rect2.getRight()) {
                z = true;
            }
            z = false;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003f, code lost:
        if (r6.getRight() <= r4.getLeft()) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
        if (r6.getTop() >= r4.getBottom()) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0073, code lost:
        if (r6.getBottom() <= r4.getTop()) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001f, code lost:
        if (r6.getLeft() >= r4.getRight()) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0025, code lost:
        r9 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final boolean beamBeats_I7lrPNg$isInDirectionOfSearch(androidx.compose.ui.geometry.Rect r4, int r5, androidx.compose.ui.geometry.Rect r6) {
        /*
            androidx.compose.ui.focus.FocusDirection$Companion r0 = androidx.compose.ui.focus.FocusDirection.Companion
            r7 = r0
            r0 = r5
            r1 = r7
            int r1 = r1.m2099getLeftdhqQ8s()
            boolean r0 = androidx.compose.ui.focus.FocusDirection.m2091equalsimpl0(r0, r1)
            r8 = r0
            r0 = 1
            r9 = r0
            r0 = r8
            if (r0 == 0) goto L2b
            r0 = r6
            float r0 = r0.getLeft()
            r1 = r4
            float r1 = r1.getRight()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L25
            goto L76
        L25:
            r0 = 0
            r9 = r0
            goto L76
        L2b:
            r0 = r5
            r1 = r7
            int r1 = r1.m2103getRightdhqQ8s()
            boolean r0 = androidx.compose.ui.focus.FocusDirection.m2091equalsimpl0(r0, r1)
            if (r0 == 0) goto L45
            r0 = r6
            float r0 = r0.getRight()
            r1 = r4
            float r1 = r1.getLeft()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L25
            goto L76
        L45:
            r0 = r5
            r1 = r7
            int r1 = r1.m2104getUpdhqQ8s()
            boolean r0 = androidx.compose.ui.focus.FocusDirection.m2091equalsimpl0(r0, r1)
            if (r0 == 0) goto L5f
            r0 = r6
            float r0 = r0.getTop()
            r1 = r4
            float r1 = r1.getBottom()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L25
            goto L76
        L5f:
            r0 = r5
            r1 = r7
            int r1 = r1.m2097getDowndhqQ8s()
            boolean r0 = androidx.compose.ui.focus.FocusDirection.m2091equalsimpl0(r0, r1)
            if (r0 == 0) goto L79
            r0 = r6
            float r0 = r0.getBottom()
            r1 = r4
            float r1 = r1.getTop()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L25
        L76:
            r0 = r9
            return r0
        L79:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "This function should only be used for 2-D focus search"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.TwoDimensionalFocusSearchKt.beamBeats_I7lrPNg$isInDirectionOfSearch(androidx.compose.ui.geometry.Rect, int, androidx.compose.ui.geometry.Rect):boolean");
    }

    /* renamed from: beamBeats_I7lrPNg$majorAxisDistance-2  reason: not valid java name */
    private static final float m2126beamBeats_I7lrPNg$majorAxisDistance2(Rect rect, int i2, Rect rect2) {
        float top;
        float bottom;
        float top2;
        float bottom2;
        float f2;
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (!FocusDirection.m2091equalsimpl0(i2, companion.m2099getLeftdhqQ8s())) {
            if (FocusDirection.m2091equalsimpl0(i2, companion.m2103getRightdhqQ8s())) {
                top = rect.getLeft();
                bottom = rect2.getRight();
            } else if (FocusDirection.m2091equalsimpl0(i2, companion.m2104getUpdhqQ8s())) {
                top2 = rect2.getTop();
                bottom2 = rect.getBottom();
            } else if (!FocusDirection.m2091equalsimpl0(i2, companion.m2097getDowndhqQ8s())) {
                throw new IllegalStateException(InvalidFocusDirection.toString());
            } else {
                top = rect.getTop();
                bottom = rect2.getBottom();
            }
            f2 = top - bottom;
            return Math.max(0.0f, f2);
        }
        top2 = rect2.getLeft();
        bottom2 = rect.getRight();
        f2 = top2 - bottom2;
        return Math.max(0.0f, f2);
    }

    private static final float beamBeats_I7lrPNg$majorAxisDistanceToFarEdge(Rect rect, int i2, Rect rect2) {
        float bottom;
        float bottom2;
        float top;
        float top2;
        float f2;
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (!FocusDirection.m2091equalsimpl0(i2, companion.m2099getLeftdhqQ8s())) {
            if (FocusDirection.m2091equalsimpl0(i2, companion.m2103getRightdhqQ8s())) {
                bottom = rect.getRight();
                bottom2 = rect2.getRight();
            } else if (FocusDirection.m2091equalsimpl0(i2, companion.m2104getUpdhqQ8s())) {
                top = rect2.getTop();
                top2 = rect.getTop();
            } else if (!FocusDirection.m2091equalsimpl0(i2, companion.m2097getDowndhqQ8s())) {
                throw new IllegalStateException(InvalidFocusDirection.toString());
            } else {
                bottom = rect.getBottom();
                bottom2 = rect2.getBottom();
            }
            f2 = bottom - bottom2;
            return Math.max(1.0f, f2);
        }
        top = rect2.getLeft();
        top2 = rect.getLeft();
        f2 = top - top2;
        return Math.max(1.0f, f2);
    }

    private static final Rect bottomRight(Rect rect) {
        return new Rect(rect.getRight(), rect.getBottom(), rect.getRight(), rect.getBottom());
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0087  */
    /* renamed from: findBestCandidate-4WY_MpI  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final androidx.compose.ui.node.ModifiedFocusNode m2127findBestCandidate4WY_MpI(java.util.List<androidx.compose.ui.node.ModifiedFocusNode> r5, androidx.compose.ui.geometry.Rect r6, int r7) {
        /*
            Method dump skipped, instructions count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.TwoDimensionalFocusSearchKt.m2127findBestCandidate4WY_MpI(java.util.List, androidx.compose.ui.geometry.Rect, int):androidx.compose.ui.node.ModifiedFocusNode");
    }

    /* renamed from: isBetterCandidate-I7lrPNg  reason: not valid java name */
    private static final boolean m2128isBetterCandidateI7lrPNg(Rect rect, Rect rect2, Rect rect3, int i2) {
        boolean z = true;
        if (!isBetterCandidate_I7lrPNg$isCandidate(rect, i2, rect3) || (isBetterCandidate_I7lrPNg$isCandidate(rect2, i2, rect3) && !m2125beamBeatsI7lrPNg(rect3, rect, rect2, i2) && (m2125beamBeatsI7lrPNg(rect3, rect2, rect, i2) || isBetterCandidate_I7lrPNg$weightedDistance(i2, rect3, rect) >= isBetterCandidate_I7lrPNg$weightedDistance(i2, rect3, rect2)))) {
            z = false;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003d, code lost:
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0063, code lost:
        if (r6.getRight() > r4.getLeft()) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
        if (r6.getRight() >= r4.getRight()) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0095, code lost:
        if (r6.getTop() < r4.getBottom()) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a1, code lost:
        if (r6.getTop() <= r4.getTop()) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c7, code lost:
        if (r6.getBottom() > r4.getTop()) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d3, code lost:
        if (r6.getBottom() >= r4.getBottom()) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d8, code lost:
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002b, code lost:
        if (r6.getLeft() < r4.getRight()) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
        if (r6.getLeft() <= r4.getLeft()) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final boolean isBetterCandidate_I7lrPNg$isCandidate(androidx.compose.ui.geometry.Rect r4, int r5, androidx.compose.ui.geometry.Rect r6) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.TwoDimensionalFocusSearchKt.isBetterCandidate_I7lrPNg$isCandidate(androidx.compose.ui.geometry.Rect, int, androidx.compose.ui.geometry.Rect):boolean");
    }

    private static final float isBetterCandidate_I7lrPNg$majorAxisDistance(Rect rect, int i2, Rect rect2) {
        float top;
        float bottom;
        float top2;
        float bottom2;
        float f2;
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (!FocusDirection.m2091equalsimpl0(i2, companion.m2099getLeftdhqQ8s())) {
            if (FocusDirection.m2091equalsimpl0(i2, companion.m2103getRightdhqQ8s())) {
                top = rect.getLeft();
                bottom = rect2.getRight();
            } else if (FocusDirection.m2091equalsimpl0(i2, companion.m2104getUpdhqQ8s())) {
                top2 = rect2.getTop();
                bottom2 = rect.getBottom();
            } else if (!FocusDirection.m2091equalsimpl0(i2, companion.m2097getDowndhqQ8s())) {
                throw new IllegalStateException(InvalidFocusDirection.toString());
            } else {
                top = rect.getTop();
                bottom = rect2.getBottom();
            }
            f2 = top - bottom;
            return Math.max(0.0f, f2);
        }
        top2 = rect2.getLeft();
        bottom2 = rect.getRight();
        f2 = top2 - bottom2;
        return Math.max(0.0f, f2);
    }

    private static final float isBetterCandidate_I7lrPNg$minorAxisDistance(Rect rect, int i2, Rect rect2) {
        float f2;
        float left;
        float left2;
        float width;
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m2091equalsimpl0(i2, companion.m2099getLeftdhqQ8s()) ? true : FocusDirection.m2091equalsimpl0(i2, companion.m2103getRightdhqQ8s())) {
            f2 = 2;
            left = rect2.getTop() + (rect2.getHeight() / f2);
            left2 = rect.getTop();
            width = rect.getHeight();
        } else {
            if (!(FocusDirection.m2091equalsimpl0(i2, companion.m2104getUpdhqQ8s()) ? true : FocusDirection.m2091equalsimpl0(i2, companion.m2097getDowndhqQ8s()))) {
                throw new IllegalStateException(InvalidFocusDirection.toString());
            }
            f2 = 2;
            left = rect2.getLeft() + (rect2.getWidth() / f2);
            left2 = rect.getLeft();
            width = rect.getWidth();
        }
        return left - (left2 + (width / f2));
    }

    private static final long isBetterCandidate_I7lrPNg$weightedDistance(int i2, Rect rect, Rect rect2) {
        long abs = Math.abs(isBetterCandidate_I7lrPNg$majorAxisDistance(rect2, i2, rect));
        long abs2 = Math.abs(isBetterCandidate_I7lrPNg$minorAxisDistance(rect2, i2, rect));
        return (13 * abs * abs) + (abs2 * abs2);
    }

    private static final Rect topLeft(Rect rect) {
        return new Rect(rect.getLeft(), rect.getTop(), rect.getLeft(), rect.getTop());
    }

    @Nullable
    /* renamed from: twoDimensionalFocusSearch-Mxy_nc0  reason: not valid java name */
    public static final ModifiedFocusNode m2129twoDimensionalFocusSearchMxy_nc0(@NotNull ModifiedFocusNode twoDimensionalFocusSearch, int i2) {
        ModifiedFocusNode m2129twoDimensionalFocusSearchMxy_nc0;
        Rect bottomRight;
        Object firstOrNull;
        Intrinsics.checkNotNullParameter(twoDimensionalFocusSearch, "$this$twoDimensionalFocusSearch");
        ModifiedFocusNode modifiedFocusNode = twoDimensionalFocusSearch;
        switch (WhenMappings.$EnumSwitchMapping$0[twoDimensionalFocusSearch.getFocusState().ordinal()]) {
            case 1:
                break;
            case 2:
                modifiedFocusNode = null;
                break;
            case 3:
            case 4:
                ModifiedFocusNode focusedChild = twoDimensionalFocusSearch.getFocusedChild();
                if (focusedChild != null) {
                    if (focusedChild.getFocusState() != FocusStateImpl.ActiveParent || (m2129twoDimensionalFocusSearchMxy_nc0 = m2129twoDimensionalFocusSearchMxy_nc0(focusedChild, i2)) == null) {
                        ModifiedFocusNode findActiveFocusNode = FocusTraversalKt.findActiveFocusNode(twoDimensionalFocusSearch);
                        Rect focusRect = findActiveFocusNode == null ? null : findActiveFocusNode.focusRect();
                        if (focusRect != null) {
                            modifiedFocusNode = m2127findBestCandidate4WY_MpI(twoDimensionalFocusSearch.focusableChildren(true), focusRect, i2);
                            break;
                        } else {
                            throw new IllegalStateException(NoActiveChild.toString());
                        }
                    } else {
                        return m2129twoDimensionalFocusSearchMxy_nc0;
                    }
                } else {
                    throw new IllegalStateException(NoActiveChild.toString());
                }
                break;
            case 5:
            case 6:
                List<ModifiedFocusNode> focusableChildren = twoDimensionalFocusSearch.focusableChildren(true);
                if (focusableChildren.size() > 1) {
                    FocusDirection.Companion companion = FocusDirection.Companion;
                    if (FocusDirection.m2091equalsimpl0(i2, companion.m2103getRightdhqQ8s()) ? true : FocusDirection.m2091equalsimpl0(i2, companion.m2097getDowndhqQ8s())) {
                        bottomRight = topLeft(twoDimensionalFocusSearch.focusRect());
                    } else {
                        if (!(FocusDirection.m2091equalsimpl0(i2, companion.m2099getLeftdhqQ8s()) ? true : FocusDirection.m2091equalsimpl0(i2, companion.m2104getUpdhqQ8s()))) {
                            throw new IllegalStateException(InvalidFocusDirection.toString());
                        }
                        bottomRight = bottomRight(twoDimensionalFocusSearch.focusRect());
                    }
                    modifiedFocusNode = m2127findBestCandidate4WY_MpI(focusableChildren, bottomRight, i2);
                    break;
                } else {
                    firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) focusableChildren);
                    return (ModifiedFocusNode) firstOrNull;
                }
            default:
                throw new NoWhenBranchMatchedException();
        }
        return modifiedFocusNode;
    }
}

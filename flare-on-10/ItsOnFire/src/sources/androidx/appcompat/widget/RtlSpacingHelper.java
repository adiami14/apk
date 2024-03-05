package androidx.appcompat.widget;
/* loaded from: ItsOnFire.jar:androidx/appcompat/widget/RtlSpacingHelper.class */
class RtlSpacingHelper {
    public static final int UNDEFINED = Integer.MIN_VALUE;
    private int mLeft = 0;
    private int mRight = 0;
    private int mStart = Integer.MIN_VALUE;
    private int mEnd = Integer.MIN_VALUE;
    private int mExplicitLeft = 0;
    private int mExplicitRight = 0;
    private boolean mIsRtl = false;
    private boolean mIsRelative = false;

    public int getEnd() {
        return this.mIsRtl ? this.mLeft : this.mRight;
    }

    public int getLeft() {
        return this.mLeft;
    }

    public int getRight() {
        return this.mRight;
    }

    public int getStart() {
        return this.mIsRtl ? this.mRight : this.mLeft;
    }

    public void setAbsolute(int i2, int i3) {
        this.mIsRelative = false;
        if (i2 != Integer.MIN_VALUE) {
            this.mExplicitLeft = i2;
            this.mLeft = i2;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.mExplicitRight = i3;
            this.mRight = i3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
        if (r5 != Integer.MIN_VALUE) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005f, code lost:
        if (r5 != Integer.MIN_VALUE) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setDirection(boolean r4) {
        /*
            r3 = this;
            r0 = r4
            r1 = r3
            boolean r1 = r1.mIsRtl
            if (r0 != r1) goto L9
            return
        L9:
            r0 = r3
            r1 = r4
            r0.mIsRtl = r1
            r0 = r3
            boolean r0 = r0.mIsRelative
            if (r0 == 0) goto L65
            r0 = r4
            if (r0 == 0) goto L3f
            r0 = r3
            int r0 = r0.mEnd
            r5 = r0
            r0 = r5
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L27
            goto L2c
        L27:
            r0 = r3
            int r0 = r0.mExplicitLeft
            r5 = r0
        L2c:
            r0 = r3
            r1 = r5
            r0.mLeft = r1
            r0 = r3
            int r0 = r0.mStart
            r5 = r0
            r0 = r5
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L6d
            goto L72
        L3f:
            r0 = r3
            int r0 = r0.mStart
            r5 = r0
            r0 = r5
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L4d
            goto L52
        L4d:
            r0 = r3
            int r0 = r0.mExplicitLeft
            r5 = r0
        L52:
            r0 = r3
            r1 = r5
            r0.mLeft = r1
            r0 = r3
            int r0 = r0.mEnd
            r5 = r0
            r0 = r5
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L6d
            goto L72
        L65:
            r0 = r3
            r1 = r3
            int r1 = r1.mExplicitLeft
            r0.mLeft = r1
        L6d:
            r0 = r3
            int r0 = r0.mExplicitRight
            r5 = r0
        L72:
            r0 = r3
            r1 = r5
            r0.mRight = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.RtlSpacingHelper.setDirection(boolean):void");
    }

    public void setRelative(int i2, int i3) {
        this.mStart = i2;
        this.mEnd = i3;
        this.mIsRelative = true;
        if (this.mIsRtl) {
            if (i3 != Integer.MIN_VALUE) {
                this.mLeft = i3;
            }
            if (i2 != Integer.MIN_VALUE) {
                this.mRight = i2;
                return;
            }
            return;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.mLeft = i2;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.mRight = i3;
        }
    }
}

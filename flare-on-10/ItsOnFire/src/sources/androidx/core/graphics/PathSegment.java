package androidx.core.graphics;

import android.graphics.PointF;
import androidx.annotation.NonNull;
import androidx.core.util.Preconditions;
/* loaded from: ItsOnFire.jar:androidx/core/graphics/PathSegment.class */
public final class PathSegment {
    private final PointF mEnd;
    private final float mEndFraction;
    private final PointF mStart;
    private final float mStartFraction;

    public PathSegment(@NonNull PointF pointF, float f2, @NonNull PointF pointF2, float f3) {
        this.mStart = (PointF) Preconditions.checkNotNull(pointF, "start == null");
        this.mStartFraction = f2;
        this.mEnd = (PointF) Preconditions.checkNotNull(pointF2, "end == null");
        this.mEndFraction = f3;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj instanceof PathSegment) {
            PathSegment pathSegment = (PathSegment) obj;
            if (Float.compare(this.mStartFraction, pathSegment.mStartFraction) != 0 || Float.compare(this.mEndFraction, pathSegment.mEndFraction) != 0 || !this.mStart.equals(pathSegment.mStart) || !this.mEnd.equals(pathSegment.mEnd)) {
                z = false;
            }
            return z;
        }
        return false;
    }

    @NonNull
    public PointF getEnd() {
        return this.mEnd;
    }

    public float getEndFraction() {
        return this.mEndFraction;
    }

    @NonNull
    public PointF getStart() {
        return this.mStart;
    }

    public float getStartFraction() {
        return this.mStartFraction;
    }

    public int hashCode() {
        int hashCode = this.mStart.hashCode();
        float f2 = this.mStartFraction;
        int i2 = 0;
        int floatToIntBits = f2 != 0.0f ? Float.floatToIntBits(f2) : 0;
        int hashCode2 = this.mEnd.hashCode();
        float f3 = this.mEndFraction;
        if (f3 != 0.0f) {
            i2 = Float.floatToIntBits(f3);
        }
        return (((((hashCode * 31) + floatToIntBits) * 31) + hashCode2) * 31) + i2;
    }

    public String toString() {
        return "PathSegment{start=" + this.mStart + ", startFraction=" + this.mStartFraction + ", end=" + this.mEnd + ", endFraction=" + this.mEndFraction + '}';
    }
}

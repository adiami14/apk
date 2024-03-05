package androidx.customview.widget;

import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/* loaded from: ItsOnFire.jar:androidx/customview/widget/FocusStrategy.class */
class FocusStrategy {

    /* loaded from: ItsOnFire.jar:androidx/customview/widget/FocusStrategy$BoundsAdapter.class */
    public interface BoundsAdapter<T> {
        void obtainBounds(T t2, Rect rect);
    }

    /* loaded from: ItsOnFire.jar:androidx/customview/widget/FocusStrategy$CollectionAdapter.class */
    public interface CollectionAdapter<T, V> {
        V get(T t2, int i2);

        int size(T t2);
    }

    /* loaded from: ItsOnFire.jar:androidx/customview/widget/FocusStrategy$SequentialComparator.class */
    public static class SequentialComparator<T> implements Comparator<T> {
        private final BoundsAdapter<T> mAdapter;
        private final boolean mIsLayoutRtl;
        private final Rect mTemp1 = new Rect();
        private final Rect mTemp2 = new Rect();

        public SequentialComparator(boolean z, BoundsAdapter<T> boundsAdapter) {
            this.mIsLayoutRtl = z;
            this.mAdapter = boundsAdapter;
        }

        @Override // java.util.Comparator
        public int compare(T t2, T t3) {
            Rect rect = this.mTemp1;
            Rect rect2 = this.mTemp2;
            this.mAdapter.obtainBounds(t2, rect);
            this.mAdapter.obtainBounds(t3, rect2);
            int i2 = rect.top;
            int i3 = rect2.top;
            int i4 = -1;
            if (i2 < i3) {
                return -1;
            }
            if (i2 > i3) {
                return 1;
            }
            int i5 = rect.left;
            int i6 = rect2.left;
            if (i5 < i6) {
                if (this.mIsLayoutRtl) {
                    i4 = 1;
                }
                return i4;
            } else if (i5 > i6) {
                if (!this.mIsLayoutRtl) {
                    i4 = 1;
                }
                return i4;
            } else {
                int i7 = rect.bottom;
                int i8 = rect2.bottom;
                if (i7 < i8) {
                    return -1;
                }
                if (i7 > i8) {
                    return 1;
                }
                int i9 = rect.right;
                int i10 = rect2.right;
                if (i9 < i10) {
                    if (this.mIsLayoutRtl) {
                        i4 = 1;
                    }
                    return i4;
                } else if (i9 > i10) {
                    if (!this.mIsLayoutRtl) {
                        i4 = 1;
                    }
                    return i4;
                } else {
                    return 0;
                }
            }
        }
    }

    private FocusStrategy() {
    }

    private static boolean beamBeats(int i2, @NonNull Rect rect, @NonNull Rect rect2, @NonNull Rect rect3) {
        boolean beamsOverlap = beamsOverlap(i2, rect, rect2);
        boolean z = false;
        if (beamsOverlap(i2, rect, rect3) || !beamsOverlap) {
            return false;
        }
        if (!isToDirectionOf(i2, rect, rect3) || i2 == 17 || i2 == 66) {
            return true;
        }
        if (majorAxisDistance(i2, rect, rect2) < majorAxisDistanceToFarEdge(i2, rect, rect3)) {
            z = true;
        }
        return z;
    }

    private static boolean beamsOverlap(int i2, @NonNull Rect rect, @NonNull Rect rect2) {
        boolean z = true;
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            if (rect2.right < rect.left || rect2.left > rect.right) {
                z = false;
            }
            return z;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <L, T> T findNextFocusInAbsoluteDirection(@androidx.annotation.NonNull L r5, @androidx.annotation.NonNull androidx.customview.widget.FocusStrategy.CollectionAdapter<L, T> r6, @androidx.annotation.NonNull androidx.customview.widget.FocusStrategy.BoundsAdapter<T> r7, @androidx.annotation.Nullable T r8, @androidx.annotation.NonNull android.graphics.Rect r9, int r10) {
        /*
            android.graphics.Rect r0 = new android.graphics.Rect
            r1 = r0
            r2 = r9
            r1.<init>(r2)
            r11 = r0
            r0 = 0
            r12 = r0
            r0 = r10
            r1 = 17
            if (r0 == r1) goto L63
            r0 = r10
            r1 = 33
            if (r0 == r1) goto L4f
            r0 = r10
            r1 = 66
            if (r0 == r1) goto L42
            r0 = r10
            r1 = 130(0x82, float:1.82E-43)
            if (r0 != r1) goto L38
            r0 = r9
            int r0 = r0.height()
            r1 = 1
            int r0 = r0 + r1
            int r0 = -r0
            r13 = r0
            goto L58
        L38:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1.<init>(r2)
            throw r0
        L42:
            r0 = r9
            int r0 = r0.width()
            r1 = 1
            int r0 = r0 + r1
            int r0 = -r0
            r13 = r0
            goto L6c
        L4f:
            r0 = r9
            int r0 = r0.height()
            r1 = 1
            int r0 = r0 + r1
            r13 = r0
        L58:
            r0 = r11
            r1 = 0
            r2 = r13
            r0.offset(r1, r2)
            goto L74
        L63:
            r0 = r9
            int r0 = r0.width()
            r1 = 1
            int r0 = r0 + r1
            r13 = r0
        L6c:
            r0 = r11
            r1 = r13
            r2 = 0
            r0.offset(r1, r2)
        L74:
            r0 = 0
            r14 = r0
            r0 = r6
            r1 = r5
            int r0 = r0.size(r1)
            r15 = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r1 = r0
            r1.<init>()
            r16 = r0
            r0 = r12
            r13 = r0
        L8d:
            r0 = r13
            r1 = r15
            if (r0 >= r1) goto Ld1
            r0 = r6
            r1 = r5
            r2 = r13
            java.lang.Object r0 = r0.get(r1, r2)
            r17 = r0
            r0 = r17
            r1 = r8
            if (r0 != r1) goto La8
            goto Lcb
        La8:
            r0 = r7
            r1 = r17
            r2 = r16
            r0.obtainBounds(r1, r2)
            r0 = r10
            r1 = r9
            r2 = r16
            r3 = r11
            boolean r0 = isBetterCandidate(r0, r1, r2, r3)
            if (r0 == 0) goto Lcb
            r0 = r11
            r1 = r16
            r0.set(r1)
            r0 = r17
            r14 = r0
        Lcb:
            int r13 = r13 + 1
            goto L8d
        Ld1:
            r0 = r14
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.customview.widget.FocusStrategy.findNextFocusInAbsoluteDirection(java.lang.Object, androidx.customview.widget.FocusStrategy$CollectionAdapter, androidx.customview.widget.FocusStrategy$BoundsAdapter, java.lang.Object, android.graphics.Rect, int):java.lang.Object");
    }

    public static <L, T> T findNextFocusInRelativeDirection(@NonNull L l2, @NonNull CollectionAdapter<L, T> collectionAdapter, @NonNull BoundsAdapter<T> boundsAdapter, @Nullable T t2, int i2, boolean z, boolean z2) {
        int size = collectionAdapter.size(l2);
        ArrayList arrayList = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(collectionAdapter.get(l2, i3));
        }
        Collections.sort(arrayList, new SequentialComparator(z, boundsAdapter));
        if (i2 != 1) {
            if (i2 == 2) {
                return (T) getNextFocusable(t2, arrayList, z2);
            }
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
        }
        return (T) getPreviousFocusable(t2, arrayList, z2);
    }

    private static <T> T getNextFocusable(T t2, ArrayList<T> arrayList, boolean z) {
        int size = arrayList.size();
        int lastIndexOf = (t2 == null ? -1 : arrayList.lastIndexOf(t2)) + 1;
        if (lastIndexOf < size) {
            return arrayList.get(lastIndexOf);
        }
        if (!z || size <= 0) {
            return null;
        }
        return arrayList.get(0);
    }

    private static <T> T getPreviousFocusable(T t2, ArrayList<T> arrayList, boolean z) {
        int size = arrayList.size();
        int indexOf = (t2 == null ? size : arrayList.indexOf(t2)) - 1;
        if (indexOf >= 0) {
            return arrayList.get(indexOf);
        }
        if (!z || size <= 0) {
            return null;
        }
        return arrayList.get(size - 1);
    }

    private static int getWeightedDistanceFor(int i2, int i3) {
        return (i2 * 13 * i2) + (i3 * i3);
    }

    private static boolean isBetterCandidate(int i2, @NonNull Rect rect, @NonNull Rect rect2, @NonNull Rect rect3) {
        boolean z = false;
        if (isCandidate(rect, rect2, i2)) {
            if (isCandidate(rect, rect3, i2) && !beamBeats(i2, rect, rect2, rect3)) {
                if (beamBeats(i2, rect, rect3, rect2)) {
                    return false;
                }
                if (getWeightedDistanceFor(majorAxisDistance(i2, rect, rect2), minorAxisDistance(i2, rect, rect2)) < getWeightedDistanceFor(majorAxisDistance(i2, rect, rect3), minorAxisDistance(i2, rect, rect3))) {
                    z = true;
                }
                return z;
            }
            return true;
        }
        return false;
    }

    private static boolean isCandidate(@NonNull Rect rect, @NonNull Rect rect2, int i2) {
        boolean z = true;
        if (i2 == 17) {
            int i3 = rect.right;
            int i4 = rect2.right;
            return (i3 > i4 || rect.left >= i4) && rect.left > rect2.left;
        } else if (i2 == 33) {
            int i5 = rect.bottom;
            int i6 = rect2.bottom;
            return (i5 > i6 || rect.top >= i6) && rect.top > rect2.top;
        } else if (i2 == 66) {
            int i7 = rect.left;
            int i8 = rect2.left;
            return (i7 < i8 || rect.right <= i8) && rect.right < rect2.right;
        } else if (i2 == 130) {
            int i9 = rect.top;
            int i10 = rect2.top;
            if ((i9 >= i10 && rect.bottom > i10) || rect.bottom >= rect2.bottom) {
                z = false;
            }
            return z;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    private static boolean isToDirectionOf(int i2, @NonNull Rect rect, @NonNull Rect rect2) {
        boolean z = true;
        if (i2 == 17) {
            return rect.left >= rect2.right;
        } else if (i2 == 33) {
            return rect.top >= rect2.bottom;
        } else if (i2 == 66) {
            return rect.right <= rect2.left;
        } else if (i2 == 130) {
            if (rect.bottom > rect2.top) {
                z = false;
            }
            return z;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    private static int majorAxisDistance(int i2, @NonNull Rect rect, @NonNull Rect rect2) {
        return Math.max(0, majorAxisDistanceRaw(i2, rect, rect2));
    }

    private static int majorAxisDistanceRaw(int i2, @NonNull Rect rect, @NonNull Rect rect2) {
        int i3;
        int i4;
        if (i2 == 17) {
            i3 = rect.left;
            i4 = rect2.right;
        } else if (i2 == 33) {
            i3 = rect.top;
            i4 = rect2.bottom;
        } else if (i2 == 66) {
            i3 = rect2.left;
            i4 = rect.right;
        } else if (i2 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        } else {
            i3 = rect2.top;
            i4 = rect.bottom;
        }
        return i3 - i4;
    }

    private static int majorAxisDistanceToFarEdge(int i2, @NonNull Rect rect, @NonNull Rect rect2) {
        return Math.max(1, majorAxisDistanceToFarEdgeRaw(i2, rect, rect2));
    }

    private static int majorAxisDistanceToFarEdgeRaw(int i2, @NonNull Rect rect, @NonNull Rect rect2) {
        int i3;
        int i4;
        if (i2 == 17) {
            i3 = rect.left;
            i4 = rect2.left;
        } else if (i2 == 33) {
            i3 = rect.top;
            i4 = rect2.top;
        } else if (i2 == 66) {
            i3 = rect2.right;
            i4 = rect.right;
        } else if (i2 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        } else {
            i3 = rect2.bottom;
            i4 = rect.bottom;
        }
        return i3 - i4;
    }

    private static int minorAxisDistance(int i2, @NonNull Rect rect, @NonNull Rect rect2) {
        int height;
        int i3;
        int height2;
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            height = rect.left + (rect.width() / 2);
            i3 = rect2.left;
            height2 = rect2.width();
            return Math.abs(height - (i3 + (height2 / 2)));
        }
        height = rect.top + (rect.height() / 2);
        i3 = rect2.top;
        height2 = rect2.height();
        return Math.abs(height - (i3 + (height2 / 2)));
    }
}

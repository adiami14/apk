package kotlin.ranges;

import androidx.appcompat.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��2\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010��\n��\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018�� \u00152\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0015B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\u0011\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003H\u0096\u0002J\u0013\u0010\r\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u000bH\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u0014\u0010\u0005\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\b¨\u0006\u0016"}, d2 = {"Lkotlin/ranges/CharRange;", "Lkotlin/ranges/CharProgression;", "Lkotlin/ranges/ClosedRange;", "", "start", "endInclusive", "(CC)V", "getEndInclusive", "()Ljava/lang/Character;", "getStart", "contains", "", "value", "equals", "other", "", "hashCode", "", "isEmpty", "toString", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:kotlin/ranges/CharRange.class */
public final class CharRange extends CharProgression implements ClosedRange<Character> {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final CharRange EMPTY = new CharRange(1, 0);

    @Metadata(d1 = {"��\u0014\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n��\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/ranges/CharRange$Companion;", "", "()V", "EMPTY", "Lkotlin/ranges/CharRange;", "getEMPTY", "()Lkotlin/ranges/CharRange;", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:kotlin/ranges/CharRange$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CharRange getEMPTY() {
            return CharRange.EMPTY;
        }
    }

    public CharRange(char c2, char c3) {
        super(c2, c3, 1);
    }

    public boolean contains(char c2) {
        return Intrinsics.compare((int) getFirst(), (int) c2) <= 0 && Intrinsics.compare((int) c2, (int) getLast()) <= 0;
    }

    @Override // kotlin.ranges.ClosedRange
    public /* bridge */ /* synthetic */ boolean contains(Character ch) {
        return contains(ch.charValue());
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
        if (getLast() == r0.getLast()) goto L7;
     */
    @Override // kotlin.ranges.CharProgression
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r4) {
        /*
            r3 = this;
            r0 = r4
            boolean r0 = r0 instanceof kotlin.ranges.CharRange
            if (r0 == 0) goto L3a
            r0 = r3
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L18
            r0 = r4
            kotlin.ranges.CharRange r0 = (kotlin.ranges.CharRange) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L35
        L18:
            r0 = r3
            char r0 = r0.getFirst()
            r5 = r0
            r0 = r4
            kotlin.ranges.CharRange r0 = (kotlin.ranges.CharRange) r0
            r4 = r0
            r0 = r5
            r1 = r4
            char r1 = r1.getFirst()
            if (r0 != r1) goto L3a
            r0 = r3
            char r0 = r0.getLast()
            r1 = r4
            char r1 = r1.getLast()
            if (r0 != r1) goto L3a
        L35:
            r0 = 1
            r6 = r0
            goto L3c
        L3a:
            r0 = 0
            r6 = r0
        L3c:
            r0 = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ranges.CharRange.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.ranges.ClosedRange
    @NotNull
    public Character getEndInclusive() {
        return Character.valueOf(getLast());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.ranges.ClosedRange
    @NotNull
    public Character getStart() {
        return Character.valueOf(getFirst());
    }

    @Override // kotlin.ranges.CharProgression
    public int hashCode() {
        int last;
        if (isEmpty()) {
            last = -1;
        } else {
            last = getLast() + (getFirst() * 31);
        }
        return last;
    }

    @Override // kotlin.ranges.CharProgression, kotlin.ranges.ClosedRange
    public boolean isEmpty() {
        return Intrinsics.compare((int) getFirst(), (int) getLast()) > 0;
    }

    @Override // kotlin.ranges.CharProgression
    @NotNull
    public String toString() {
        return getFirst() + ".." + getLast();
    }
}

package kotlin.jvm.internal;

import java.io.Serializable;
/* loaded from: ItsOnFire.jar:kotlin/jvm/internal/Ref.class */
public class Ref {

    /* loaded from: ItsOnFire.jar:kotlin/jvm/internal/Ref$BooleanRef.class */
    public static final class BooleanRef implements Serializable {
        public boolean element;

        public String toString() {
            return String.valueOf(this.element);
        }
    }

    /* loaded from: ItsOnFire.jar:kotlin/jvm/internal/Ref$ByteRef.class */
    public static final class ByteRef implements Serializable {
        public byte element;

        public String toString() {
            return String.valueOf((int) this.element);
        }
    }

    /* loaded from: ItsOnFire.jar:kotlin/jvm/internal/Ref$CharRef.class */
    public static final class CharRef implements Serializable {
        public char element;

        public String toString() {
            return String.valueOf(this.element);
        }
    }

    /* loaded from: ItsOnFire.jar:kotlin/jvm/internal/Ref$DoubleRef.class */
    public static final class DoubleRef implements Serializable {
        public double element;

        public String toString() {
            return String.valueOf(this.element);
        }
    }

    /* loaded from: ItsOnFire.jar:kotlin/jvm/internal/Ref$FloatRef.class */
    public static final class FloatRef implements Serializable {
        public float element;

        public String toString() {
            return String.valueOf(this.element);
        }
    }

    /* loaded from: ItsOnFire.jar:kotlin/jvm/internal/Ref$IntRef.class */
    public static final class IntRef implements Serializable {
        public int element;

        public String toString() {
            return String.valueOf(this.element);
        }
    }

    /* loaded from: ItsOnFire.jar:kotlin/jvm/internal/Ref$LongRef.class */
    public static final class LongRef implements Serializable {
        public long element;

        public String toString() {
            return String.valueOf(this.element);
        }
    }

    /* loaded from: ItsOnFire.jar:kotlin/jvm/internal/Ref$ObjectRef.class */
    public static final class ObjectRef<T> implements Serializable {
        public T element;

        public String toString() {
            return String.valueOf(this.element);
        }
    }

    /* loaded from: ItsOnFire.jar:kotlin/jvm/internal/Ref$ShortRef.class */
    public static final class ShortRef implements Serializable {
        public short element;

        public String toString() {
            return String.valueOf((int) this.element);
        }
    }

    private Ref() {
    }
}
package com.google.firebase.components;
/* loaded from: ItsOnFire.jar:com/google/firebase/components/Dependency.class */
public final class Dependency {
    private final Qualified<?> anInterface;
    private final int injection;
    private final int type;

    private Dependency(Qualified<?> qualified, int i2, int i3) {
        this.anInterface = (Qualified) Preconditions.checkNotNull(qualified, "Null dependency anInterface.");
        this.type = i2;
        this.injection = i3;
    }

    private Dependency(Class<?> cls, int i2, int i3) {
        this(Qualified.unqualified(cls), i2, i3);
    }

    public static Dependency deferred(Qualified<?> qualified) {
        return new Dependency(qualified, 0, 2);
    }

    public static Dependency deferred(Class<?> cls) {
        return new Dependency(cls, 0, 2);
    }

    private static String describeInjection(int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    return "deferred";
                }
                throw new AssertionError("Unsupported injection: " + i2);
            }
            return "provider";
        }
        return "direct";
    }

    @Deprecated
    public static Dependency optional(Class<?> cls) {
        return new Dependency(cls, 0, 0);
    }

    public static Dependency optionalProvider(Qualified<?> qualified) {
        return new Dependency(qualified, 0, 1);
    }

    public static Dependency optionalProvider(Class<?> cls) {
        return new Dependency(cls, 0, 1);
    }

    public static Dependency required(Qualified<?> qualified) {
        return new Dependency(qualified, 1, 0);
    }

    public static Dependency required(Class<?> cls) {
        return new Dependency(cls, 1, 0);
    }

    public static Dependency requiredProvider(Qualified<?> qualified) {
        return new Dependency(qualified, 1, 1);
    }

    public static Dependency requiredProvider(Class<?> cls) {
        return new Dependency(cls, 1, 1);
    }

    public static Dependency setOf(Qualified<?> qualified) {
        return new Dependency(qualified, 2, 0);
    }

    public static Dependency setOf(Class<?> cls) {
        return new Dependency(cls, 2, 0);
    }

    public static Dependency setOfProvider(Qualified<?> qualified) {
        return new Dependency(qualified, 2, 1);
    }

    public static Dependency setOfProvider(Class<?> cls) {
        return new Dependency(cls, 2, 1);
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof Dependency) {
            Dependency dependency = (Dependency) obj;
            z = false;
            if (this.anInterface.equals(dependency.anInterface)) {
                z = false;
                if (this.type == dependency.type) {
                    z = false;
                    if (this.injection == dependency.injection) {
                        z = true;
                    }
                }
            }
        }
        return z;
    }

    public Qualified<?> getInterface() {
        return this.anInterface;
    }

    public int hashCode() {
        int hashCode = this.anInterface.hashCode();
        return this.injection ^ ((((hashCode ^ 1000003) * 1000003) ^ this.type) * 1000003);
    }

    public boolean isDeferred() {
        return this.injection == 2;
    }

    public boolean isDirectInjection() {
        return this.injection == 0;
    }

    public boolean isRequired() {
        boolean z = true;
        if (this.type != 1) {
            z = false;
        }
        return z;
    }

    public boolean isSet() {
        return this.type == 2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.anInterface);
        sb.append(", type=");
        int i2 = this.type;
        sb.append(i2 == 1 ? "required" : i2 == 0 ? "optional" : "set");
        sb.append(", injection=");
        sb.append(describeInjection(this.injection));
        sb.append("}");
        return sb.toString();
    }
}

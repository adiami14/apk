package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty;
/* loaded from: ItsOnFire.jar:kotlin/jvm/internal/PropertyReference.class */
public abstract class PropertyReference extends CallableReference implements KProperty {
    public PropertyReference() {
    }

    @SinceKotlin(version = "1.1")
    public PropertyReference(Object obj) {
        super(obj);
    }

    @SinceKotlin(version = "1.4")
    public PropertyReference(Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) != 1 ? false : true);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PropertyReference)) {
            if (obj instanceof KProperty) {
                return obj.equals(compute());
            }
            return false;
        }
        PropertyReference propertyReference = (PropertyReference) obj;
        if (!getOwner().equals(propertyReference.getOwner()) || !getName().equals(propertyReference.getName()) || !getSignature().equals(propertyReference.getSignature()) || !Intrinsics.areEqual(getBoundReceiver(), propertyReference.getBoundReceiver())) {
            z = false;
        }
        return z;
    }

    @Override // kotlin.jvm.internal.CallableReference
    @SinceKotlin(version = "1.1")
    public KProperty getReflected() {
        return (KProperty) super.getReflected();
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // kotlin.reflect.KProperty
    @SinceKotlin(version = "1.1")
    public boolean isConst() {
        return getReflected().isConst();
    }

    @Override // kotlin.reflect.KProperty
    @SinceKotlin(version = "1.1")
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        KCallable compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + Reflection.REFLECTION_NOT_AVAILABLE;
    }
}

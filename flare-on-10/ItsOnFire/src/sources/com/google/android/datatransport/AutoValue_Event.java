package com.google.android.datatransport;

import androidx.annotation.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: ItsOnFire.jar:com/google/android/datatransport/AutoValue_Event.class */
public final class AutoValue_Event<T> extends Event<T> {
    private final Integer code;
    private final T payload;
    private final Priority priority;

    public AutoValue_Event(@Nullable Integer num, T t2, Priority priority) {
        this.code = num;
        if (t2 == null) {
            throw new NullPointerException("Null payload");
        }
        this.payload = t2;
        if (priority == null) {
            throw new NullPointerException("Null priority");
        }
        this.priority = priority;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
        if (r3.priority.equals(r0.getPriority()) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 1
            r5 = r0
            r0 = r4
            r1 = r3
            if (r0 != r1) goto L9
            r0 = 1
            return r0
        L9:
            r0 = r4
            boolean r0 = r0 instanceof com.google.android.datatransport.Event
            if (r0 == 0) goto L56
            r0 = r4
            com.google.android.datatransport.Event r0 = (com.google.android.datatransport.Event) r0
            r4 = r0
            r0 = r3
            java.lang.Integer r0 = r0.code
            r6 = r0
            r0 = r6
            if (r0 != 0) goto L28
            r0 = r4
            java.lang.Integer r0 = r0.getCode()
            if (r0 != 0) goto L52
            goto L33
        L28:
            r0 = r6
            r1 = r4
            java.lang.Integer r1 = r1.getCode()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L52
        L33:
            r0 = r3
            T r0 = r0.payload
            r1 = r4
            java.lang.Object r1 = r1.getPayload()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L52
            r0 = r3
            com.google.android.datatransport.Priority r0 = r0.priority
            r1 = r4
            com.google.android.datatransport.Priority r1 = r1.getPriority()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L52
            goto L54
        L52:
            r0 = 0
            r5 = r0
        L54:
            r0 = r5
            return r0
        L56:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.datatransport.AutoValue_Event.equals(java.lang.Object):boolean");
    }

    @Override // com.google.android.datatransport.Event
    @Nullable
    public Integer getCode() {
        return this.code;
    }

    @Override // com.google.android.datatransport.Event
    public T getPayload() {
        return this.payload;
    }

    @Override // com.google.android.datatransport.Event
    public Priority getPriority() {
        return this.priority;
    }

    public int hashCode() {
        Integer num = this.code;
        return this.priority.hashCode() ^ (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.payload.hashCode()) * 1000003);
    }

    public String toString() {
        return "Event{code=" + this.code + ", payload=" + this.payload + ", priority=" + this.priority + "}";
    }
}

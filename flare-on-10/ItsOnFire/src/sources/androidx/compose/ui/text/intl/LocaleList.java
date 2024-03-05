package androidx.compose.ui.text.intl;

import androidx.appcompat.R;
import androidx.compose.runtime.Immutable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Immutable
@Metadata(d1 = {"��F\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010��\n\u0002\b\u0005\n\u0002\u0010(\n\u0002\b\u0003\b\u0007\u0018�� !2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u001b\b\u0016\u0012\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0007\"\u00020\u0002¢\u0006\u0002\u0010\bB\u0013\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\n¢\u0006\u0002\u0010\u000bJ\u0011\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0002H\u0096\u0002J\u0016\u0010\u0015\u001a\u00020\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0016J\u0013\u0010\u0017\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\u0011\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u000fH\u0086\u0002J\b\u0010\u001c\u001a\u00020\u000fH\u0016J\b\u0010\u001d\u001a\u00020\u0013H\u0016J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001fH\u0096\u0002J\b\u0010 \u001a\u00020\u0004H\u0016R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\n¢\u0006\b\n��\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n��\u001a\u0004\b\u0010\u0010\u0011¨\u0006\""}, d2 = {"Landroidx/compose/ui/text/intl/LocaleList;", "", "Landroidx/compose/ui/text/intl/Locale;", "languageTags", "", "(Ljava/lang/String;)V", "locales", "", "([Landroidx/compose/ui/text/intl/Locale;)V", "localeList", "", "(Ljava/util/List;)V", "getLocaleList", "()Ljava/util/List;", "size", "", "getSize", "()I", "contains", "", "element", "containsAll", "elements", "equals", "other", "", "get", "i", "hashCode", "isEmpty", "iterator", "", "toString", "Companion", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/text/intl/LocaleList.class */
public final class LocaleList implements Collection<Locale>, KMappedMarker {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private final List<Locale> localeList;
    private final int size;

    @Metadata(d1 = {"��\u0014\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/text/intl/LocaleList$Companion;", "", "()V", "current", "Landroidx/compose/ui/text/intl/LocaleList;", "getCurrent", "()Landroidx/compose/ui/text/intl/LocaleList;", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/ui/text/intl/LocaleList$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final LocaleList getCurrent() {
            List<PlatformLocale> current = PlatformLocaleKt.getPlatformLocaleDelegate().getCurrent();
            ArrayList arrayList = new ArrayList(current.size());
            int size = current.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(new Locale(current.get(i2)));
            }
            return new LocaleList(arrayList);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LocaleList(@org.jetbrains.annotations.NotNull java.lang.String r8) {
        /*
            r7 = this;
            r0 = r8
            java.lang.String r1 = "languageTags"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r8
            r1 = 1
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = r1
            r3 = 0
            java.lang.String r4 = ","
            r2[r3] = r4
            r2 = 0
            r3 = 0
            r4 = 6
            r5 = 0
            java.util.List r0 = kotlin.text.StringsKt.split$default(r0, r1, r2, r3, r4, r5)
            r9 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r2 = r9
            int r2 = r2.size()
            r1.<init>(r2)
            r8 = r0
            r0 = r9
            int r0 = r0.size()
            r10 = r0
            r0 = 0
            r11 = r0
            r0 = 0
            r12 = r0
        L34:
            r0 = r12
            r1 = r10
            if (r0 >= r1) goto L58
            r0 = r8
            r1 = r9
            r2 = r12
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.CharSequence r1 = kotlin.text.StringsKt.trim(r1)
            java.lang.String r1 = r1.toString()
            boolean r0 = r0.add(r1)
            int r12 = r12 + 1
            goto L34
        L58:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r2 = r8
            int r2 = r2.size()
            r1.<init>(r2)
            r9 = r0
            r0 = r8
            int r0 = r0.size()
            r10 = r0
            r0 = r11
            r12 = r0
        L71:
            r0 = r12
            r1 = r10
            if (r0 >= r1) goto L96
            r0 = r9
            androidx.compose.ui.text.intl.Locale r1 = new androidx.compose.ui.text.intl.Locale
            r2 = r1
            r3 = r8
            r4 = r12
            java.lang.Object r3 = r3.get(r4)
            java.lang.String r3 = (java.lang.String) r3
            r2.<init>(r3)
            boolean r0 = r0.add(r1)
            int r12 = r12 + 1
            goto L71
        L96:
            r0 = r7
            r1 = r9
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.intl.LocaleList.<init>(java.lang.String):void");
    }

    public LocaleList(@NotNull List<Locale> localeList) {
        Intrinsics.checkNotNullParameter(localeList, "localeList");
        this.localeList = localeList;
        this.size = localeList.size();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LocaleList(@org.jetbrains.annotations.NotNull androidx.compose.ui.text.intl.Locale... r4) {
        /*
            r3 = this;
            r0 = r4
            java.lang.String r1 = "locales"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r3
            r1 = r4
            java.util.List r1 = kotlin.collections.ArraysKt.toList(r1)
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.intl.LocaleList.<init>(androidx.compose.ui.text.intl.Locale[]):void");
    }

    @Override // java.util.Collection
    public boolean add(Locale locale) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends Locale> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(@NotNull Locale element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return this.localeList.contains(element);
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Locale) {
            return contains((Locale) obj);
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return this.localeList.containsAll(elements);
    }

    @Override // java.util.Collection
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocaleList) && Intrinsics.areEqual(this.localeList, ((LocaleList) obj).localeList);
    }

    @NotNull
    public final Locale get(int i2) {
        return this.localeList.get(i2);
    }

    @NotNull
    public final List<Locale> getLocaleList() {
        return this.localeList;
    }

    public int getSize() {
        return this.size;
    }

    @Override // java.util.Collection
    public int hashCode() {
        return this.localeList.hashCode();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.localeList.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<Locale> iterator() {
        return this.localeList.iterator();
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeIf(Predicate<? super Locale> predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) CollectionToArray.toArray(this, array);
    }

    @NotNull
    public String toString() {
        return "LocaleList(localeList=" + this.localeList + ')';
    }
}

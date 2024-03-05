package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: ItsOnFire.jar:androidx/emoji2/text/SpannableBuilder.class */
public final class SpannableBuilder extends SpannableStringBuilder {
    @NonNull
    private final Class<?> mWatcherClass;
    @NonNull
    private final List<WatcherWrapper> mWatchers;

    /* loaded from: ItsOnFire.jar:androidx/emoji2/text/SpannableBuilder$WatcherWrapper.class */
    public static class WatcherWrapper implements TextWatcher, SpanWatcher {
        private final AtomicInteger mBlockCalls = new AtomicInteger(0);
        public final Object mObject;

        public WatcherWrapper(Object obj) {
            this.mObject = obj;
        }

        private boolean isEmojiSpan(Object obj) {
            return obj instanceof EmojiSpan;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ((TextWatcher) this.mObject).afterTextChanged(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            ((TextWatcher) this.mObject).beforeTextChanged(charSequence, i2, i3, i4);
        }

        public final void blockCalls() {
            this.mBlockCalls.incrementAndGet();
        }

        @Override // android.text.SpanWatcher
        public void onSpanAdded(Spannable spannable, Object obj, int i2, int i3) {
            if (this.mBlockCalls.get() <= 0 || !isEmojiSpan(obj)) {
                ((SpanWatcher) this.mObject).onSpanAdded(spannable, obj, i2, i3);
            }
        }

        @Override // android.text.SpanWatcher
        public void onSpanChanged(Spannable spannable, Object obj, int i2, int i3, int i4, int i5) {
            if (this.mBlockCalls.get() <= 0 || !isEmojiSpan(obj)) {
                ((SpanWatcher) this.mObject).onSpanChanged(spannable, obj, i2, i3, i4, i5);
            }
        }

        @Override // android.text.SpanWatcher
        public void onSpanRemoved(Spannable spannable, Object obj, int i2, int i3) {
            if (this.mBlockCalls.get() <= 0 || !isEmojiSpan(obj)) {
                ((SpanWatcher) this.mObject).onSpanRemoved(spannable, obj, i2, i3);
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            ((TextWatcher) this.mObject).onTextChanged(charSequence, i2, i3, i4);
        }

        public final void unblockCalls() {
            this.mBlockCalls.decrementAndGet();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public SpannableBuilder(@NonNull Class<?> cls) {
        this.mWatchers = new ArrayList();
        Preconditions.checkNotNull(cls, "watcherClass cannot be null");
        this.mWatcherClass = cls;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public SpannableBuilder(@NonNull Class<?> cls, @NonNull CharSequence charSequence) {
        super(charSequence);
        this.mWatchers = new ArrayList();
        Preconditions.checkNotNull(cls, "watcherClass cannot be null");
        this.mWatcherClass = cls;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public SpannableBuilder(@NonNull Class<?> cls, @NonNull CharSequence charSequence, int i2, int i3) {
        super(charSequence, i2, i3);
        this.mWatchers = new ArrayList();
        Preconditions.checkNotNull(cls, "watcherClass cannot be null");
        this.mWatcherClass = cls;
    }

    private void blockWatchers() {
        for (int i2 = 0; i2 < this.mWatchers.size(); i2++) {
            this.mWatchers.get(i2).blockCalls();
        }
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static SpannableBuilder create(@NonNull Class<?> cls, @NonNull CharSequence charSequence) {
        return new SpannableBuilder(cls, charSequence);
    }

    private void fireWatchers() {
        for (int i2 = 0; i2 < this.mWatchers.size(); i2++) {
            this.mWatchers.get(i2).onTextChanged(this, 0, length(), length());
        }
    }

    private WatcherWrapper getWatcherFor(Object obj) {
        for (int i2 = 0; i2 < this.mWatchers.size(); i2++) {
            WatcherWrapper watcherWrapper = this.mWatchers.get(i2);
            if (watcherWrapper.mObject == obj) {
                return watcherWrapper;
            }
        }
        return null;
    }

    private boolean isWatcher(@NonNull Class<?> cls) {
        return this.mWatcherClass == cls;
    }

    private boolean isWatcher(@Nullable Object obj) {
        return obj != null && isWatcher(obj.getClass());
    }

    private void unblockwatchers() {
        for (int i2 = 0; i2 < this.mWatchers.size(); i2++) {
            this.mWatchers.get(i2).unblockCalls();
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @NonNull
    public SpannableStringBuilder append(char c2) {
        super.append(c2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @NonNull
    public SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @NonNull
    public SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i2, int i3) {
        super.append(charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder append(CharSequence charSequence, Object obj, int i2) {
        super.append(charSequence, obj, i2);
        return this;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void beginBatchEdit() {
        blockWatchers();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder delete(int i2, int i3) {
        super.delete(i2, i3);
        return this;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void endBatchEdit() {
        unblockwatchers();
        fireWatchers();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanEnd(@Nullable Object obj) {
        WatcherWrapper watcherWrapper = obj;
        if (isWatcher(obj)) {
            WatcherWrapper watcherFor = getWatcherFor(obj);
            watcherWrapper = obj;
            if (watcherFor != null) {
                watcherWrapper = watcherFor;
            }
        }
        return super.getSpanEnd(watcherWrapper);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanFlags(@Nullable Object obj) {
        WatcherWrapper watcherWrapper = obj;
        if (isWatcher(obj)) {
            WatcherWrapper watcherFor = getWatcherFor(obj);
            watcherWrapper = obj;
            if (watcherFor != null) {
                watcherWrapper = watcherFor;
            }
        }
        return super.getSpanFlags(watcherWrapper);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanStart(@Nullable Object obj) {
        WatcherWrapper watcherWrapper = obj;
        if (isWatcher(obj)) {
            WatcherWrapper watcherFor = getWatcherFor(obj);
            watcherWrapper = obj;
            if (watcherFor != null) {
                watcherWrapper = watcherFor;
            }
        }
        return super.getSpanStart(watcherWrapper);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    @SuppressLint({"UnknownNullness"})
    public <T> T[] getSpans(int i2, int i3, @NonNull Class<T> cls) {
        if (isWatcher((Class<?>) cls)) {
            WatcherWrapper[] watcherWrapperArr = (WatcherWrapper[]) super.getSpans(i2, i3, WatcherWrapper.class);
            T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, watcherWrapperArr.length));
            for (int i4 = 0; i4 < watcherWrapperArr.length; i4++) {
                tArr[i4] = watcherWrapperArr[i4].mObject;
            }
            return tArr;
        }
        return (T[]) super.getSpans(i2, i3, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder insert(int i2, CharSequence charSequence) {
        super.insert(i2, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder insert(int i2, CharSequence charSequence, int i3, int i4) {
        super.insert(i2, charSequence, i3, i4);
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (isWatcher((java.lang.Class<?>) r8) != false) goto L8;
     */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int nextSpanTransition(int r6, int r7, @androidx.annotation.Nullable java.lang.Class r8) {
        /*
            r5 = this;
            r0 = r8
            if (r0 == 0) goto Lf
            r0 = r8
            r9 = r0
            r0 = r5
            r1 = r8
            boolean r0 = r0.isWatcher(r1)
            if (r0 == 0) goto L13
        Lf:
            java.lang.Class<androidx.emoji2.text.SpannableBuilder$WatcherWrapper> r0 = androidx.emoji2.text.SpannableBuilder.WatcherWrapper.class
            r9 = r0
        L13:
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r9
            int r0 = super.nextSpanTransition(r1, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.SpannableBuilder.nextSpanTransition(int, int, java.lang.Class):int");
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void removeSpan(@Nullable Object obj) {
        WatcherWrapper watcherWrapper;
        if (isWatcher(obj)) {
            WatcherWrapper watcherFor = getWatcherFor(obj);
            watcherWrapper = watcherFor;
            if (watcherFor != null) {
                obj = watcherFor;
                watcherWrapper = watcherFor;
            }
        } else {
            watcherWrapper = null;
        }
        super.removeSpan(obj);
        if (watcherWrapper != null) {
            this.mWatchers.remove(watcherWrapper);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder replace(int i2, int i3, CharSequence charSequence) {
        blockWatchers();
        super.replace(i2, i3, charSequence);
        unblockwatchers();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder replace(int i2, int i3, CharSequence charSequence, int i4, int i5) {
        blockWatchers();
        super.replace(i2, i3, charSequence, i4, i5);
        unblockwatchers();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void setSpan(@Nullable Object obj, int i2, int i3, int i4) {
        WatcherWrapper watcherWrapper = obj;
        if (isWatcher(obj)) {
            watcherWrapper = new WatcherWrapper(obj);
            this.mWatchers.add(watcherWrapper);
        }
        super.setSpan(watcherWrapper, i2, i3, i4);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    @SuppressLint({"UnknownNullness"})
    public CharSequence subSequence(int i2, int i3) {
        return new SpannableBuilder(this.mWatcherClass, this, i2, i3);
    }
}

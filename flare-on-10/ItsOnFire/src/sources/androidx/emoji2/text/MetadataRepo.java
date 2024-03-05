package androidx.emoji2.text;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.os.TraceCompat;
import androidx.core.util.Preconditions;
import androidx.emoji2.text.flatbuffer.MetadataList;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
@AnyThread
@RequiresApi(19)
/* loaded from: ItsOnFire.jar:androidx/emoji2/text/MetadataRepo.class */
public final class MetadataRepo {
    private static final int DEFAULT_ROOT_SIZE = 1024;
    private static final String S_TRACE_CREATE_REPO = "EmojiCompat.MetadataRepo.create";
    @NonNull
    private final char[] mEmojiCharArray;
    @NonNull
    private final MetadataList mMetadataList;
    @NonNull
    private final Node mRootNode = new Node(1024);
    @NonNull
    private final Typeface mTypeface;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: ItsOnFire.jar:androidx/emoji2/text/MetadataRepo$Node.class */
    public static class Node {
        private final SparseArray<Node> mChildren;
        private EmojiMetadata mData;

        private Node() {
            this(1);
        }

        public Node(int i2) {
            this.mChildren = new SparseArray<>(i2);
        }

        public Node get(int i2) {
            SparseArray<Node> sparseArray = this.mChildren;
            return sparseArray == null ? null : sparseArray.get(i2);
        }

        public final EmojiMetadata getData() {
            return this.mData;
        }

        public void put(@NonNull EmojiMetadata emojiMetadata, int i2, int i3) {
            Node node = get(emojiMetadata.getCodepointAt(i2));
            Node node2 = node;
            if (node == null) {
                node2 = new Node();
                this.mChildren.put(emojiMetadata.getCodepointAt(i2), node2);
            }
            if (i3 > i2) {
                node2.put(emojiMetadata, i2 + 1, i3);
            } else {
                node2.mData = emojiMetadata;
            }
        }
    }

    private MetadataRepo(@NonNull Typeface typeface, @NonNull MetadataList metadataList) {
        this.mTypeface = typeface;
        this.mMetadataList = metadataList;
        this.mEmojiCharArray = new char[metadataList.listLength() * 2];
        constructIndex(metadataList);
    }

    private void constructIndex(MetadataList metadataList) {
        int listLength = metadataList.listLength();
        for (int i2 = 0; i2 < listLength; i2++) {
            EmojiMetadata emojiMetadata = new EmojiMetadata(this, i2);
            Character.toChars(emojiMetadata.getId(), this.mEmojiCharArray, i2 * 2);
            put(emojiMetadata);
        }
    }

    @NonNull
    public static MetadataRepo create(@NonNull AssetManager assetManager, @NonNull String str) throws IOException {
        try {
            TraceCompat.beginSection(S_TRACE_CREATE_REPO);
            MetadataRepo metadataRepo = new MetadataRepo(Typeface.createFromAsset(assetManager, str), MetadataListReader.read(assetManager, str));
            TraceCompat.endSection();
            return metadataRepo;
        } catch (Throwable th) {
            TraceCompat.endSection();
            throw th;
        }
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.TESTS})
    public static MetadataRepo create(@NonNull Typeface typeface) {
        try {
            TraceCompat.beginSection(S_TRACE_CREATE_REPO);
            MetadataRepo metadataRepo = new MetadataRepo(typeface, new MetadataList());
            TraceCompat.endSection();
            return metadataRepo;
        } catch (Throwable th) {
            TraceCompat.endSection();
            throw th;
        }
    }

    @NonNull
    public static MetadataRepo create(@NonNull Typeface typeface, @NonNull InputStream inputStream) throws IOException {
        try {
            TraceCompat.beginSection(S_TRACE_CREATE_REPO);
            MetadataRepo metadataRepo = new MetadataRepo(typeface, MetadataListReader.read(inputStream));
            TraceCompat.endSection();
            return metadataRepo;
        } catch (Throwable th) {
            TraceCompat.endSection();
            throw th;
        }
    }

    @NonNull
    public static MetadataRepo create(@NonNull Typeface typeface, @NonNull ByteBuffer byteBuffer) throws IOException {
        try {
            TraceCompat.beginSection(S_TRACE_CREATE_REPO);
            MetadataRepo metadataRepo = new MetadataRepo(typeface, MetadataListReader.read(byteBuffer));
            TraceCompat.endSection();
            return metadataRepo;
        } catch (Throwable th) {
            TraceCompat.endSection();
            throw th;
        }
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public char[] getEmojiCharArray() {
        return this.mEmojiCharArray;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public MetadataList getMetadataList() {
        return this.mMetadataList;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int getMetadataVersion() {
        return this.mMetadataList.version();
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Node getRootNode() {
        return this.mRootNode;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Typeface getTypeface() {
        return this.mTypeface;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @VisibleForTesting
    public void put(@NonNull EmojiMetadata emojiMetadata) {
        Preconditions.checkNotNull(emojiMetadata, "emoji metadata cannot be null");
        Preconditions.checkArgument(emojiMetadata.getCodepointsLength() > 0, "invalid metadata codepoint length");
        this.mRootNode.put(emojiMetadata, 0, emojiMetadata.getCodepointsLength() - 1);
    }
}

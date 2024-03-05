.class Landroidx/profileinstaller/ProfileTranscoder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/RequiresApi;
    value = 0x13
.end annotation


# static fields
.field private static final HOT:I = 0x1

.field private static final INLINE_CACHE_MEGAMORPHIC_ENCODING:I = 0x7

.field private static final INLINE_CACHE_MISSING_TYPES_ENCODING:I = 0x6

.field public static final MAGIC_PROF:[B

.field public static final MAGIC_PROFM:[B

.field private static final POST_STARTUP:I = 0x4

.field private static final STARTUP:I = 0x2


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x4

    new-array v1, v0, [B

    fill-array-data v1, :array_0

    sput-object v1, Landroidx/profileinstaller/ProfileTranscoder;->MAGIC_PROF:[B

    new-array v0, v0, [B

    fill-array-data v0, :array_1

    sput-object v0, Landroidx/profileinstaller/ProfileTranscoder;->MAGIC_PROFM:[B

    return-void

    :array_0
    .array-data 1
        0x70t
        0x72t
        0x6ft
        0x0t
    .end array-data

    :array_1
    .array-data 1
        0x70t
        0x72t
        0x6dt
        0x0t
    .end array-data
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static createCompressibleBody([Landroidx/profileinstaller/DexProfileData;[B)[B
    .locals 8
    .param p0    # [Landroidx/profileinstaller/DexProfileData;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # [B
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    array-length v0, p0

    const/4 v1, 0x0

    move v2, v1

    move v3, v2

    :goto_0
    if-ge v2, v0, :cond_0

    aget-object v4, p0, v2

    iget-object v5, v4, Landroidx/profileinstaller/DexProfileData;->apkName:Ljava/lang/String;

    iget-object v6, v4, Landroidx/profileinstaller/DexProfileData;->dexName:Ljava/lang/String;

    invoke-static {v5, v6, p1}, Landroidx/profileinstaller/ProfileTranscoder;->generateDexKey(Ljava/lang/String;Ljava/lang/String;[B)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroidx/profileinstaller/Encoding;->utf8Length(Ljava/lang/String;)I

    move-result v5

    add-int/lit8 v5, v5, 0x10

    iget v6, v4, Landroidx/profileinstaller/DexProfileData;->classSetSize:I

    mul-int/lit8 v6, v6, 0x2

    add-int/2addr v5, v6

    iget v6, v4, Landroidx/profileinstaller/DexProfileData;->hotMethodRegionSize:I

    add-int/2addr v5, v6

    iget v4, v4, Landroidx/profileinstaller/DexProfileData;->numMethodIds:I

    invoke-static {v4}, Landroidx/profileinstaller/ProfileTranscoder;->getMethodBitmapStorageSize(I)I

    move-result v4

    add-int/2addr v5, v4

    add-int/2addr v3, v5

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0, v3}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    sget-object v2, Landroidx/profileinstaller/ProfileVersion;->V009_O_MR1:[B

    invoke-static {p1, v2}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v2

    if-eqz v2, :cond_1

    array-length v2, p0

    :goto_1
    if-ge v1, v2, :cond_3

    aget-object v4, p0, v1

    iget-object v5, v4, Landroidx/profileinstaller/DexProfileData;->apkName:Ljava/lang/String;

    iget-object v6, v4, Landroidx/profileinstaller/DexProfileData;->dexName:Ljava/lang/String;

    invoke-static {v5, v6, p1}, Landroidx/profileinstaller/ProfileTranscoder;->generateDexKey(Ljava/lang/String;Ljava/lang/String;[B)Ljava/lang/String;

    move-result-object v5

    invoke-static {v0, v4, v5}, Landroidx/profileinstaller/ProfileTranscoder;->writeLineHeader(Ljava/io/OutputStream;Landroidx/profileinstaller/DexProfileData;Ljava/lang/String;)V

    invoke-static {v0, v4}, Landroidx/profileinstaller/ProfileTranscoder;->writeLineData(Ljava/io/OutputStream;Landroidx/profileinstaller/DexProfileData;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    array-length v2, p0

    move v4, v1

    :goto_2
    if-ge v4, v2, :cond_2

    aget-object v5, p0, v4

    iget-object v6, v5, Landroidx/profileinstaller/DexProfileData;->apkName:Ljava/lang/String;

    iget-object v7, v5, Landroidx/profileinstaller/DexProfileData;->dexName:Ljava/lang/String;

    invoke-static {v6, v7, p1}, Landroidx/profileinstaller/ProfileTranscoder;->generateDexKey(Ljava/lang/String;Ljava/lang/String;[B)Ljava/lang/String;

    move-result-object v6

    invoke-static {v0, v5, v6}, Landroidx/profileinstaller/ProfileTranscoder;->writeLineHeader(Ljava/io/OutputStream;Landroidx/profileinstaller/DexProfileData;Ljava/lang/String;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_2
    array-length p1, p0

    :goto_3
    if-ge v1, p1, :cond_3

    aget-object v2, p0, v1

    invoke-static {v0, v2}, Landroidx/profileinstaller/ProfileTranscoder;->writeLineData(Ljava/io/OutputStream;Landroidx/profileinstaller/DexProfileData;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_3
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result p0

    if-ne p0, v3, :cond_4

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p0

    return-object p0

    :cond_4
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p1, "The bytes saved do not match expectation. actual="

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " expected="

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Landroidx/profileinstaller/Encoding;->error(Ljava/lang/String;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0
.end method

.method private static generateDexKey(Ljava/lang/String;Ljava/lang/String;[B)Ljava/lang/String;
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # [B
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const-string v0, "classes.dex"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2}, Landroidx/profileinstaller/ProfileVersion;->dexKeySeparator([B)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static getMethodBitmapStorageSize(I)I
    .locals 0

    mul-int/lit8 p0, p0, 0x2

    invoke-static {p0}, Landroidx/profileinstaller/ProfileTranscoder;->roundUpToByte(I)I

    move-result p0

    div-int/lit8 p0, p0, 0x8

    return p0
.end method

.method private static methodFlagBitmapIndex(III)I
    .locals 1

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x4

    if-ne p0, v0, :cond_0

    add-int/2addr p1, p2

    return p1

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Unexpected flag: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Landroidx/profileinstaller/Encoding;->error(Ljava/lang/String;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0

    :cond_1
    return p1

    :cond_2
    const-string p0, "HOT methods are not stored in the bitmap"

    invoke-static {p0}, Landroidx/profileinstaller/Encoding;->error(Ljava/lang/String;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0
.end method

.method private static readClasses(Ljava/io/InputStream;Landroidx/profileinstaller/DexProfileData;)V
    .locals 3
    .param p0    # Ljava/io/InputStream;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Landroidx/profileinstaller/DexProfileData;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget v2, p1, Landroidx/profileinstaller/DexProfileData;->classSetSize:I

    if-ge v0, v2, :cond_0

    invoke-static {p0}, Landroidx/profileinstaller/Encoding;->readUInt16(Ljava/io/InputStream;)I

    move-result v2

    add-int/2addr v1, v2

    iget-object v2, p1, Landroidx/profileinstaller/DexProfileData;->classes:[I

    aput v1, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private static readFlagsFromBitmap(Ljava/util/BitSet;II)I
    .locals 2
    .param p0    # Ljava/util/BitSet;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x2

    invoke-static {v0, p1, p2}, Landroidx/profileinstaller/ProfileTranscoder;->methodFlagBitmapIndex(III)I

    move-result v1

    invoke-virtual {p0, v1}, Ljava/util/BitSet;->get(I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x4

    invoke-static {v1, p1, p2}, Landroidx/profileinstaller/ProfileTranscoder;->methodFlagBitmapIndex(III)I

    move-result p1

    invoke-virtual {p0, p1}, Ljava/util/BitSet;->get(I)Z

    move-result p0

    if-eqz p0, :cond_1

    or-int/lit8 v0, v0, 0x4

    :cond_1
    return v0
.end method

.method public static readHeader(Ljava/io/InputStream;[B)[B
    .locals 1
    .param p0    # Ljava/io/InputStream;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # [B
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    array-length v0, p1

    invoke-static {p0, v0}, Landroidx/profileinstaller/Encoding;->read(Ljava/io/InputStream;I)[B

    move-result-object v0

    invoke-static {p1, v0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Landroidx/profileinstaller/ProfileVersion;->V010_P:[B

    array-length p1, p1

    invoke-static {p0, p1}, Landroidx/profileinstaller/Encoding;->read(Ljava/io/InputStream;I)[B

    move-result-object p0

    return-object p0

    :cond_0
    const-string p0, "Invalid magic"

    invoke-static {p0}, Landroidx/profileinstaller/Encoding;->error(Ljava/lang/String;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0
.end method

.method private static readHotMethodRegion(Ljava/io/InputStream;Landroidx/profileinstaller/DexProfileData;)V
    .locals 5
    .param p0    # Ljava/io/InputStream;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Landroidx/profileinstaller/DexProfileData;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0}, Ljava/io/InputStream;->available()I

    move-result v0

    iget v1, p1, Landroidx/profileinstaller/DexProfileData;->hotMethodRegionSize:I

    sub-int/2addr v0, v1

    const/4 v1, 0x0

    :cond_0
    invoke-virtual {p0}, Ljava/io/InputStream;->available()I

    move-result v2

    if-le v2, v0, :cond_1

    invoke-static {p0}, Landroidx/profileinstaller/Encoding;->readUInt16(Ljava/io/InputStream;)I

    move-result v2

    add-int/2addr v1, v2

    iget-object v2, p1, Landroidx/profileinstaller/DexProfileData;->methods:Ljava/util/TreeMap;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p0}, Landroidx/profileinstaller/Encoding;->readUInt16(Ljava/io/InputStream;)I

    move-result v2

    :goto_0
    if-lez v2, :cond_0

    invoke-static {p0}, Landroidx/profileinstaller/ProfileTranscoder;->skipInlineCache(Ljava/io/InputStream;)V

    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Ljava/io/InputStream;->available()I

    move-result p0

    if-ne p0, v0, :cond_2

    return-void

    :cond_2
    const-string p0, "Read too much data during profile line parse"

    invoke-static {p0}, Landroidx/profileinstaller/Encoding;->error(Ljava/lang/String;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0
.end method

.method public static readMeta(Ljava/io/InputStream;[B[Landroidx/profileinstaller/DexProfileData;)[Landroidx/profileinstaller/DexProfileData;
    .locals 4
    .param p0    # Ljava/io/InputStream;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # [B
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    sget-object v0, Landroidx/profileinstaller/ProfileVersion;->METADATA_V001_N:[B

    invoke-static {p1, v0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {p0}, Landroidx/profileinstaller/Encoding;->readUInt8(Ljava/io/InputStream;)I

    move-result p1

    invoke-static {p0}, Landroidx/profileinstaller/Encoding;->readUInt32(Ljava/io/InputStream;)J

    move-result-wide v0

    invoke-static {p0}, Landroidx/profileinstaller/Encoding;->readUInt32(Ljava/io/InputStream;)J

    move-result-wide v2

    long-to-int v2, v2

    long-to-int v0, v0

    invoke-static {p0, v2, v0}, Landroidx/profileinstaller/Encoding;->readCompressed(Ljava/io/InputStream;II)[B

    move-result-object v0

    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result p0

    if-gtz p0, :cond_0

    new-instance p0, Ljava/io/ByteArrayInputStream;

    invoke-direct {p0, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    :try_start_0
    invoke-static {p0, p1, p2}, Landroidx/profileinstaller/ProfileTranscoder;->readMetadataForNBody(Ljava/io/InputStream;I[Landroidx/profileinstaller/DexProfileData;)[Landroidx/profileinstaller/DexProfileData;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_1
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p0

    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1

    :cond_0
    const-string p0, "Content found after the end of file"

    invoke-static {p0}, Landroidx/profileinstaller/Encoding;->error(Ljava/lang/String;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0

    :cond_1
    const-string p0, "Unsupported meta version"

    invoke-static {p0}, Landroidx/profileinstaller/Encoding;->error(Ljava/lang/String;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0
.end method

.method private static readMetadataForNBody(Ljava/io/InputStream;I[Landroidx/profileinstaller/DexProfileData;)[Landroidx/profileinstaller/DexProfileData;
    .locals 6
    .param p0    # Ljava/io/InputStream;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0}, Ljava/io/InputStream;->available()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    new-array p0, v1, [Landroidx/profileinstaller/DexProfileData;

    return-object p0

    :cond_0
    array-length v0, p2

    if-ne p1, v0, :cond_4

    new-array v0, p1, [Ljava/lang/String;

    new-array v2, p1, [I

    move v3, v1

    :goto_0
    if-ge v3, p1, :cond_1

    invoke-static {p0}, Landroidx/profileinstaller/Encoding;->readUInt16(Ljava/io/InputStream;)I

    move-result v4

    invoke-static {p0}, Landroidx/profileinstaller/Encoding;->readUInt16(Ljava/io/InputStream;)I

    move-result v5

    aput v5, v2, v3

    invoke-static {p0, v4}, Landroidx/profileinstaller/Encoding;->readString(Ljava/io/InputStream;I)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v0, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    if-ge v1, p1, :cond_3

    aget-object v3, p2, v1

    iget-object v4, v3, Landroidx/profileinstaller/DexProfileData;->dexName:Ljava/lang/String;

    aget-object v5, v0, v1

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    aget v4, v2, v1

    iput v4, v3, Landroidx/profileinstaller/DexProfileData;->classSetSize:I

    new-array v4, v4, [I

    iput-object v4, v3, Landroidx/profileinstaller/DexProfileData;->classes:[I

    invoke-static {p0, v3}, Landroidx/profileinstaller/ProfileTranscoder;->readClasses(Ljava/io/InputStream;Landroidx/profileinstaller/DexProfileData;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    const-string p0, "Order of dexfiles in metadata did not match baseline"

    invoke-static {p0}, Landroidx/profileinstaller/Encoding;->error(Ljava/lang/String;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0

    :cond_3
    return-object p2

    :cond_4
    const-string p0, "Mismatched number of dex files found in metadata"

    invoke-static {p0}, Landroidx/profileinstaller/Encoding;->error(Ljava/lang/String;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0
.end method

.method private static readMethodBitmap(Ljava/io/InputStream;Landroidx/profileinstaller/DexProfileData;)V
    .locals 6
    .param p0    # Ljava/io/InputStream;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Landroidx/profileinstaller/DexProfileData;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget v0, p1, Landroidx/profileinstaller/DexProfileData;->numMethodIds:I

    mul-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Landroidx/profileinstaller/Encoding;->bitsToBytes(I)I

    move-result v0

    invoke-static {p0, v0}, Landroidx/profileinstaller/Encoding;->read(Ljava/io/InputStream;I)[B

    move-result-object p0

    invoke-static {p0}, Ljava/util/BitSet;->valueOf([B)Ljava/util/BitSet;

    move-result-object p0

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget v2, p1, Landroidx/profileinstaller/DexProfileData;->numMethodIds:I

    if-ge v1, v2, :cond_2

    invoke-static {p0, v1, v2}, Landroidx/profileinstaller/ProfileTranscoder;->readFlagsFromBitmap(Ljava/util/BitSet;II)I

    move-result v2

    if-eqz v2, :cond_1

    iget-object v3, p1, Landroidx/profileinstaller/DexProfileData;->methods:Ljava/util/TreeMap;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    if-nez v3, :cond_0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    :cond_0
    iget-object v4, p1, Landroidx/profileinstaller/DexProfileData;->methods:Ljava/util/TreeMap;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    or-int/2addr v2, v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v4, v5, v2}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public static readProfile(Ljava/io/InputStream;[BLjava/lang/String;)[Landroidx/profileinstaller/DexProfileData;
    .locals 4
    .param p0    # Ljava/io/InputStream;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # [B
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    sget-object v0, Landroidx/profileinstaller/ProfileVersion;->V010_P:[B

    invoke-static {p1, v0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {p0}, Landroidx/profileinstaller/Encoding;->readUInt8(Ljava/io/InputStream;)I

    move-result p1

    invoke-static {p0}, Landroidx/profileinstaller/Encoding;->readUInt32(Ljava/io/InputStream;)J

    move-result-wide v0

    invoke-static {p0}, Landroidx/profileinstaller/Encoding;->readUInt32(Ljava/io/InputStream;)J

    move-result-wide v2

    long-to-int v2, v2

    long-to-int v0, v0

    invoke-static {p0, v2, v0}, Landroidx/profileinstaller/Encoding;->readCompressed(Ljava/io/InputStream;II)[B

    move-result-object v0

    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result p0

    if-gtz p0, :cond_0

    new-instance p0, Ljava/io/ByteArrayInputStream;

    invoke-direct {p0, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    :try_start_0
    invoke-static {p0, p2, p1}, Landroidx/profileinstaller/ProfileTranscoder;->readUncompressedBody(Ljava/io/InputStream;Ljava/lang/String;I)[Landroidx/profileinstaller/DexProfileData;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_1
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p0

    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1

    :cond_0
    const-string p0, "Content found after the end of file"

    invoke-static {p0}, Landroidx/profileinstaller/Encoding;->error(Ljava/lang/String;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0

    :cond_1
    const-string p0, "Unsupported version"

    invoke-static {p0}, Landroidx/profileinstaller/Encoding;->error(Ljava/lang/String;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0
.end method

.method private static readUncompressedBody(Ljava/io/InputStream;Ljava/lang/String;I)[Landroidx/profileinstaller/DexProfileData;
    .locals 17
    .param p0    # Ljava/io/InputStream;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    move-object/from16 v0, p0

    move/from16 v1, p2

    invoke-virtual/range {p0 .. p0}, Ljava/io/InputStream;->available()I

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    new-array v0, v3, [Landroidx/profileinstaller/DexProfileData;

    return-object v0

    :cond_0
    new-array v2, v1, [Landroidx/profileinstaller/DexProfileData;

    move v4, v3

    :goto_0
    if-ge v4, v1, :cond_1

    invoke-static/range {p0 .. p0}, Landroidx/profileinstaller/Encoding;->readUInt16(Ljava/io/InputStream;)I

    move-result v5

    invoke-static/range {p0 .. p0}, Landroidx/profileinstaller/Encoding;->readUInt16(Ljava/io/InputStream;)I

    move-result v11

    invoke-static/range {p0 .. p0}, Landroidx/profileinstaller/Encoding;->readUInt32(Ljava/io/InputStream;)J

    move-result-wide v6

    invoke-static/range {p0 .. p0}, Landroidx/profileinstaller/Encoding;->readUInt32(Ljava/io/InputStream;)J

    move-result-wide v9

    invoke-static/range {p0 .. p0}, Landroidx/profileinstaller/Encoding;->readUInt32(Ljava/io/InputStream;)J

    move-result-wide v12

    new-instance v16, Landroidx/profileinstaller/DexProfileData;

    invoke-static {v0, v5}, Landroidx/profileinstaller/Encoding;->readString(Ljava/io/InputStream;I)Ljava/lang/String;

    move-result-object v8

    long-to-int v5, v6

    long-to-int v13, v12

    new-array v14, v11, [I

    new-instance v15, Ljava/util/TreeMap;

    invoke-direct {v15}, Ljava/util/TreeMap;-><init>()V

    move-object/from16 v6, v16

    move-object/from16 v7, p1

    move v12, v5

    invoke-direct/range {v6 .. v15}, Landroidx/profileinstaller/DexProfileData;-><init>(Ljava/lang/String;Ljava/lang/String;JIII[ILjava/util/TreeMap;)V

    aput-object v16, v2, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    if-ge v3, v1, :cond_2

    aget-object v4, v2, v3

    invoke-static {v0, v4}, Landroidx/profileinstaller/ProfileTranscoder;->readHotMethodRegion(Ljava/io/InputStream;Landroidx/profileinstaller/DexProfileData;)V

    invoke-static {v0, v4}, Landroidx/profileinstaller/ProfileTranscoder;->readClasses(Ljava/io/InputStream;Landroidx/profileinstaller/DexProfileData;)V

    invoke-static {v0, v4}, Landroidx/profileinstaller/ProfileTranscoder;->readMethodBitmap(Ljava/io/InputStream;Landroidx/profileinstaller/DexProfileData;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_2
    return-object v2
.end method

.method private static roundUpToByte(I)I
    .locals 0

    add-int/lit8 p0, p0, 0x8

    add-int/lit8 p0, p0, -0x1

    and-int/lit8 p0, p0, -0x8

    return p0
.end method

.method private static setMethodBitmapBit([BIILandroidx/profileinstaller/DexProfileData;)V
    .locals 1
    .param p0    # [B
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Landroidx/profileinstaller/DexProfileData;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget p3, p3, Landroidx/profileinstaller/DexProfileData;->numMethodIds:I

    invoke-static {p1, p2, p3}, Landroidx/profileinstaller/ProfileTranscoder;->methodFlagBitmapIndex(III)I

    move-result p1

    div-int/lit8 p2, p1, 0x8

    aget-byte p3, p0, p2

    rem-int/lit8 p1, p1, 0x8

    const/4 v0, 0x1

    shl-int p1, v0, p1

    or-int/2addr p1, p3

    int-to-byte p1, p1

    aput-byte p1, p0, p2

    return-void
.end method

.method private static skipInlineCache(Ljava/io/InputStream;)V
    .locals 2
    .param p0    # Ljava/io/InputStream;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-static {p0}, Landroidx/profileinstaller/Encoding;->readUInt16(Ljava/io/InputStream;)I

    invoke-static {p0}, Landroidx/profileinstaller/Encoding;->readUInt8(Ljava/io/InputStream;)I

    move-result v0

    const/4 v1, 0x6

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x7

    if-ne v0, v1, :cond_1

    return-void

    :cond_1
    :goto_0
    if-lez v0, :cond_3

    invoke-static {p0}, Landroidx/profileinstaller/Encoding;->readUInt8(Ljava/io/InputStream;)I

    invoke-static {p0}, Landroidx/profileinstaller/Encoding;->readUInt8(Ljava/io/InputStream;)I

    move-result v1

    :goto_1
    if-lez v1, :cond_2

    invoke-static {p0}, Landroidx/profileinstaller/Encoding;->readUInt16(Ljava/io/InputStream;)I

    add-int/lit8 v1, v1, -0x1

    goto :goto_1

    :cond_2
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method public static transcodeAndWriteBody(Ljava/io/OutputStream;[B[Landroidx/profileinstaller/DexProfileData;)Z
    .locals 2
    .param p0    # Ljava/io/OutputStream;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # [B
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # [Landroidx/profileinstaller/DexProfileData;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    sget-object v0, Landroidx/profileinstaller/ProfileVersion;->V010_P:[B

    invoke-static {p1, v0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-static {p0, p2}, Landroidx/profileinstaller/ProfileTranscoder;->writeProfileForP(Ljava/io/OutputStream;[Landroidx/profileinstaller/DexProfileData;)V

    return v1

    :cond_0
    sget-object v0, Landroidx/profileinstaller/ProfileVersion;->V005_O:[B

    invoke-static {p1, v0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p0, p2}, Landroidx/profileinstaller/ProfileTranscoder;->writeProfileForO(Ljava/io/OutputStream;[Landroidx/profileinstaller/DexProfileData;)V

    return v1

    :cond_1
    sget-object v0, Landroidx/profileinstaller/ProfileVersion;->V009_O_MR1:[B

    invoke-static {p1, v0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {p0, p2}, Landroidx/profileinstaller/ProfileTranscoder;->writeProfileForO_MR1(Ljava/io/OutputStream;[Landroidx/profileinstaller/DexProfileData;)V

    return v1

    :cond_2
    sget-object v0, Landroidx/profileinstaller/ProfileVersion;->V001_N:[B

    invoke-static {p1, v0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {p0, p2}, Landroidx/profileinstaller/ProfileTranscoder;->writeProfileForN(Ljava/io/OutputStream;[Landroidx/profileinstaller/DexProfileData;)V

    return v1

    :cond_3
    const/4 p0, 0x0

    return p0
.end method

.method private static writeClasses(Ljava/io/OutputStream;Landroidx/profileinstaller/DexProfileData;)V
    .locals 5
    .param p0    # Ljava/io/OutputStream;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Landroidx/profileinstaller/DexProfileData;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object p1, p1, Landroidx/profileinstaller/DexProfileData;->classes:[I

    array-length v0, p1

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v1, v0, :cond_0

    aget v3, p1, v1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v4

    sub-int/2addr v4, v2

    invoke-static {p0, v4}, Landroidx/profileinstaller/Encoding;->writeUInt16(Ljava/io/OutputStream;I)V

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static writeHeader(Ljava/io/OutputStream;[B)V
    .locals 1
    .param p0    # Ljava/io/OutputStream;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    sget-object v0, Landroidx/profileinstaller/ProfileTranscoder;->MAGIC_PROF:[B

    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write([B)V

    invoke-virtual {p0, p1}, Ljava/io/OutputStream;->write([B)V

    return-void
.end method

.method private static writeLineData(Ljava/io/OutputStream;Landroidx/profileinstaller/DexProfileData;)V
    .locals 0
    .param p0    # Ljava/io/OutputStream;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Landroidx/profileinstaller/DexProfileData;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-static {p0, p1}, Landroidx/profileinstaller/ProfileTranscoder;->writeMethodsWithInlineCaches(Ljava/io/OutputStream;Landroidx/profileinstaller/DexProfileData;)V

    invoke-static {p0, p1}, Landroidx/profileinstaller/ProfileTranscoder;->writeClasses(Ljava/io/OutputStream;Landroidx/profileinstaller/DexProfileData;)V

    invoke-static {p0, p1}, Landroidx/profileinstaller/ProfileTranscoder;->writeMethodBitmap(Ljava/io/OutputStream;Landroidx/profileinstaller/DexProfileData;)V

    return-void
.end method

.method private static writeLineHeader(Ljava/io/OutputStream;Landroidx/profileinstaller/DexProfileData;Ljava/lang/String;)V
    .locals 2
    .param p0    # Ljava/io/OutputStream;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Landroidx/profileinstaller/DexProfileData;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-static {p2}, Landroidx/profileinstaller/Encoding;->utf8Length(Ljava/lang/String;)I

    move-result v0

    invoke-static {p0, v0}, Landroidx/profileinstaller/Encoding;->writeUInt16(Ljava/io/OutputStream;I)V

    iget v0, p1, Landroidx/profileinstaller/DexProfileData;->classSetSize:I

    invoke-static {p0, v0}, Landroidx/profileinstaller/Encoding;->writeUInt16(Ljava/io/OutputStream;I)V

    iget v0, p1, Landroidx/profileinstaller/DexProfileData;->hotMethodRegionSize:I

    int-to-long v0, v0

    invoke-static {p0, v0, v1}, Landroidx/profileinstaller/Encoding;->writeUInt32(Ljava/io/OutputStream;J)V

    iget-wide v0, p1, Landroidx/profileinstaller/DexProfileData;->dexChecksum:J

    invoke-static {p0, v0, v1}, Landroidx/profileinstaller/Encoding;->writeUInt32(Ljava/io/OutputStream;J)V

    iget p1, p1, Landroidx/profileinstaller/DexProfileData;->numMethodIds:I

    int-to-long v0, p1

    invoke-static {p0, v0, v1}, Landroidx/profileinstaller/Encoding;->writeUInt32(Ljava/io/OutputStream;J)V

    invoke-static {p0, p2}, Landroidx/profileinstaller/Encoding;->writeString(Ljava/io/OutputStream;Ljava/lang/String;)V

    return-void
.end method

.method private static writeMethodBitmap(Ljava/io/OutputStream;Landroidx/profileinstaller/DexProfileData;)V
    .locals 5
    .param p0    # Ljava/io/OutputStream;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Landroidx/profileinstaller/DexProfileData;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget v0, p1, Landroidx/profileinstaller/DexProfileData;->numMethodIds:I

    invoke-static {v0}, Landroidx/profileinstaller/ProfileTranscoder;->getMethodBitmapStorageSize(I)I

    move-result v0

    new-array v0, v0, [B

    iget-object v1, p1, Landroidx/profileinstaller/DexProfileData;->methods:Ljava/util/TreeMap;

    invoke-virtual {v1}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    and-int/lit8 v4, v2, 0x2

    if-eqz v4, :cond_1

    const/4 v4, 0x2

    invoke-static {v0, v4, v3, p1}, Landroidx/profileinstaller/ProfileTranscoder;->setMethodBitmapBit([BIILandroidx/profileinstaller/DexProfileData;)V

    :cond_1
    and-int/lit8 v2, v2, 0x4

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    invoke-static {v0, v2, v3, p1}, Landroidx/profileinstaller/ProfileTranscoder;->setMethodBitmapBit([BIILandroidx/profileinstaller/DexProfileData;)V

    goto :goto_0

    :cond_2
    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write([B)V

    return-void
.end method

.method private static writeMethodsWithInlineCaches(Ljava/io/OutputStream;Landroidx/profileinstaller/DexProfileData;)V
    .locals 4
    .param p0    # Ljava/io/OutputStream;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Landroidx/profileinstaller/DexProfileData;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object p1, p1, Landroidx/profileinstaller/DexProfileData;->methods:Ljava/util/TreeMap;

    invoke-virtual {p1}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    and-int/lit8 v2, v2, 0x1

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    sub-int v1, v3, v1

    invoke-static {p0, v1}, Landroidx/profileinstaller/Encoding;->writeUInt16(Ljava/io/OutputStream;I)V

    invoke-static {p0, v0}, Landroidx/profileinstaller/Encoding;->writeUInt16(Ljava/io/OutputStream;I)V

    move v1, v3

    goto :goto_0

    :cond_1
    return-void
.end method

.method private static writeProfileForN(Ljava/io/OutputStream;[Landroidx/profileinstaller/DexProfileData;)V
    .locals 7
    .param p0    # Ljava/io/OutputStream;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # [Landroidx/profileinstaller/DexProfileData;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    array-length v0, p1

    invoke-static {p0, v0}, Landroidx/profileinstaller/Encoding;->writeUInt16(Ljava/io/OutputStream;I)V

    array-length v0, p1

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_2

    aget-object v3, p1, v2

    iget-object v4, v3, Landroidx/profileinstaller/DexProfileData;->apkName:Ljava/lang/String;

    iget-object v5, v3, Landroidx/profileinstaller/DexProfileData;->dexName:Ljava/lang/String;

    sget-object v6, Landroidx/profileinstaller/ProfileVersion;->V001_N:[B

    invoke-static {v4, v5, v6}, Landroidx/profileinstaller/ProfileTranscoder;->generateDexKey(Ljava/lang/String;Ljava/lang/String;[B)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroidx/profileinstaller/Encoding;->utf8Length(Ljava/lang/String;)I

    move-result v5

    invoke-static {p0, v5}, Landroidx/profileinstaller/Encoding;->writeUInt16(Ljava/io/OutputStream;I)V

    iget-object v5, v3, Landroidx/profileinstaller/DexProfileData;->methods:Ljava/util/TreeMap;

    invoke-virtual {v5}, Ljava/util/TreeMap;->size()I

    move-result v5

    invoke-static {p0, v5}, Landroidx/profileinstaller/Encoding;->writeUInt16(Ljava/io/OutputStream;I)V

    iget-object v5, v3, Landroidx/profileinstaller/DexProfileData;->classes:[I

    array-length v5, v5

    invoke-static {p0, v5}, Landroidx/profileinstaller/Encoding;->writeUInt16(Ljava/io/OutputStream;I)V

    iget-wide v5, v3, Landroidx/profileinstaller/DexProfileData;->dexChecksum:J

    invoke-static {p0, v5, v6}, Landroidx/profileinstaller/Encoding;->writeUInt32(Ljava/io/OutputStream;J)V

    invoke-static {p0, v4}, Landroidx/profileinstaller/Encoding;->writeString(Ljava/io/OutputStream;Ljava/lang/String;)V

    iget-object v4, v3, Landroidx/profileinstaller/DexProfileData;->methods:Ljava/util/TreeMap;

    invoke-virtual {v4}, Ljava/util/TreeMap;->keySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-static {p0, v5}, Landroidx/profileinstaller/Encoding;->writeUInt16(Ljava/io/OutputStream;I)V

    goto :goto_1

    :cond_0
    iget-object v3, v3, Landroidx/profileinstaller/DexProfileData;->classes:[I

    array-length v4, v3

    move v5, v1

    :goto_2
    if-ge v5, v4, :cond_1

    aget v6, v3, v5

    invoke-static {p0, v6}, Landroidx/profileinstaller/Encoding;->writeUInt16(Ljava/io/OutputStream;I)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method private static writeProfileForO(Ljava/io/OutputStream;[Landroidx/profileinstaller/DexProfileData;)V
    .locals 8
    .param p0    # Ljava/io/OutputStream;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # [Landroidx/profileinstaller/DexProfileData;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    array-length v0, p1

    invoke-static {p0, v0}, Landroidx/profileinstaller/Encoding;->writeUInt8(Ljava/io/OutputStream;I)V

    array-length v0, p1

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_2

    aget-object v3, p1, v2

    iget-object v4, v3, Landroidx/profileinstaller/DexProfileData;->methods:Ljava/util/TreeMap;

    invoke-virtual {v4}, Ljava/util/TreeMap;->size()I

    move-result v4

    mul-int/lit8 v4, v4, 0x4

    iget-object v5, v3, Landroidx/profileinstaller/DexProfileData;->apkName:Ljava/lang/String;

    iget-object v6, v3, Landroidx/profileinstaller/DexProfileData;->dexName:Ljava/lang/String;

    sget-object v7, Landroidx/profileinstaller/ProfileVersion;->V005_O:[B

    invoke-static {v5, v6, v7}, Landroidx/profileinstaller/ProfileTranscoder;->generateDexKey(Ljava/lang/String;Ljava/lang/String;[B)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroidx/profileinstaller/Encoding;->utf8Length(Ljava/lang/String;)I

    move-result v6

    invoke-static {p0, v6}, Landroidx/profileinstaller/Encoding;->writeUInt16(Ljava/io/OutputStream;I)V

    iget-object v6, v3, Landroidx/profileinstaller/DexProfileData;->classes:[I

    array-length v6, v6

    invoke-static {p0, v6}, Landroidx/profileinstaller/Encoding;->writeUInt16(Ljava/io/OutputStream;I)V

    int-to-long v6, v4

    invoke-static {p0, v6, v7}, Landroidx/profileinstaller/Encoding;->writeUInt32(Ljava/io/OutputStream;J)V

    iget-wide v6, v3, Landroidx/profileinstaller/DexProfileData;->dexChecksum:J

    invoke-static {p0, v6, v7}, Landroidx/profileinstaller/Encoding;->writeUInt32(Ljava/io/OutputStream;J)V

    invoke-static {p0, v5}, Landroidx/profileinstaller/Encoding;->writeString(Ljava/io/OutputStream;Ljava/lang/String;)V

    iget-object v4, v3, Landroidx/profileinstaller/DexProfileData;->methods:Ljava/util/TreeMap;

    invoke-virtual {v4}, Ljava/util/TreeMap;->keySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-static {p0, v5}, Landroidx/profileinstaller/Encoding;->writeUInt16(Ljava/io/OutputStream;I)V

    invoke-static {p0, v1}, Landroidx/profileinstaller/Encoding;->writeUInt16(Ljava/io/OutputStream;I)V

    goto :goto_1

    :cond_0
    iget-object v3, v3, Landroidx/profileinstaller/DexProfileData;->classes:[I

    array-length v4, v3

    move v5, v1

    :goto_2
    if-ge v5, v4, :cond_1

    aget v6, v3, v5

    invoke-static {p0, v6}, Landroidx/profileinstaller/Encoding;->writeUInt16(Ljava/io/OutputStream;I)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method private static writeProfileForO_MR1(Ljava/io/OutputStream;[Landroidx/profileinstaller/DexProfileData;)V
    .locals 1
    .param p0    # Ljava/io/OutputStream;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # [Landroidx/profileinstaller/DexProfileData;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    sget-object v0, Landroidx/profileinstaller/ProfileVersion;->V009_O_MR1:[B

    invoke-static {p1, v0}, Landroidx/profileinstaller/ProfileTranscoder;->createCompressibleBody([Landroidx/profileinstaller/DexProfileData;[B)[B

    move-result-object v0

    array-length p1, p1

    invoke-static {p0, p1}, Landroidx/profileinstaller/Encoding;->writeUInt8(Ljava/io/OutputStream;I)V

    invoke-static {p0, v0}, Landroidx/profileinstaller/Encoding;->writeCompressed(Ljava/io/OutputStream;[B)V

    return-void
.end method

.method private static writeProfileForP(Ljava/io/OutputStream;[Landroidx/profileinstaller/DexProfileData;)V
    .locals 1
    .param p0    # Ljava/io/OutputStream;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # [Landroidx/profileinstaller/DexProfileData;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    sget-object v0, Landroidx/profileinstaller/ProfileVersion;->V010_P:[B

    invoke-static {p1, v0}, Landroidx/profileinstaller/ProfileTranscoder;->createCompressibleBody([Landroidx/profileinstaller/DexProfileData;[B)[B

    move-result-object v0

    array-length p1, p1

    invoke-static {p0, p1}, Landroidx/profileinstaller/Encoding;->writeUInt8(Ljava/io/OutputStream;I)V

    invoke-static {p0, v0}, Landroidx/profileinstaller/Encoding;->writeCompressed(Ljava/io/OutputStream;[B)V

    return-void
.end method

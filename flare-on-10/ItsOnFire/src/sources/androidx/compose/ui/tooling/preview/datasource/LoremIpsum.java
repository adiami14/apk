package androidx.compose.ui.tooling.preview.datasource;

import androidx.appcompat.R;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import com.google.firebase.messaging.ServiceStarter;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(d1 = {"�� \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018��2\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0002R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n��¨\u0006\f"}, d2 = {"Landroidx/compose/ui/tooling/preview/datasource/LoremIpsum;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "", "()V", "words", "", "(I)V", "values", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", "generateLoremIpsum", "ui-tooling-preview_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/tooling/preview/datasource/LoremIpsum.class */
public final class LoremIpsum implements PreviewParameterProvider<String> {
    private final int words;

    public LoremIpsum() {
        this(ServiceStarter.ERROR_UNKNOWN);
    }

    public LoremIpsum(int i2) {
        this.words = i2;
    }

    private final String generateLoremIpsum(int i2) {
        List list;
        Sequence generateSequence;
        Sequence take;
        String joinToString$default;
        final Ref.IntRef intRef = new Ref.IntRef();
        list = LoremIpsumKt.LOREM_IPSUM_SOURCE;
        final int size = list.size();
        generateSequence = SequencesKt__SequencesKt.generateSequence(new Function0<String>() { // from class: androidx.compose.ui.tooling.preview.datasource.LoremIpsum$generateLoremIpsum$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                List list2;
                list2 = LoremIpsumKt.LOREM_IPSUM_SOURCE;
                Ref.IntRef intRef2 = Ref.IntRef.this;
                int i3 = intRef2.element;
                intRef2.element = i3 + 1;
                return (String) list2.get(i3 % size);
            }
        });
        take = SequencesKt___SequencesKt.take(generateSequence, i2);
        joinToString$default = SequencesKt___SequencesKt.joinToString$default(take, " ", null, null, 0, null, null, 62, null);
        return joinToString$default;
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public int getCount() {
        return PreviewParameterProvider.DefaultImpls.getCount(this);
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    @NotNull
    public Sequence<String> getValues() {
        Sequence<String> sequenceOf;
        sequenceOf = SequencesKt__SequencesKt.sequenceOf(generateLoremIpsum(this.words));
        return sequenceOf;
    }
}

package androidx.compose.ui.graphics.vector;

import androidx.appcompat.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
@Metadata(d1 = {"��\u0019\n��\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001��\b\n\u0018��2\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0006\u001a\u00020\u0007H\u0096\u0002J\t\u0010\b\u001a\u00020\u0002H\u0096\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n��\u001a\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"androidx/compose/ui/graphics/vector/VectorGroup$iterator$1", "", "Landroidx/compose/ui/graphics/vector/VectorNode;", "it", "getIt", "()Ljava/util/Iterator;", "hasNext", "", "next", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: ItsOnFire.jar:androidx/compose/ui/graphics/vector/VectorGroup$iterator$1.class */
public final class VectorGroup$iterator$1 implements Iterator<VectorNode>, KMappedMarker {
    @NotNull
    private final Iterator<VectorNode> it;
    public final /* synthetic */ VectorGroup this$0;

    public VectorGroup$iterator$1(VectorGroup vectorGroup) {
        List list;
        this.this$0 = vectorGroup;
        list = vectorGroup.children;
        this.it = list.iterator();
    }

    @NotNull
    public final Iterator<VectorNode> getIt() {
        return this.it;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.it.hasNext();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    @NotNull
    public VectorNode next() {
        return this.it.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

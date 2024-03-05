package kotlin.contracts;

import androidx.appcompat.R;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.internal.ContractsDsl;
import org.jetbrains.annotations.NotNull;
@SinceKotlin(version = "1.3")
@ContractsDsl
@Metadata(d1 = {"��\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n��\bg\u0018��2\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H§\u0004¨\u0006\u0006"}, d2 = {"Lkotlin/contracts/SimpleEffect;", "Lkotlin/contracts/Effect;", "implies", "Lkotlin/contracts/ConditionalEffect;", "booleanExpression", "", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
@ExperimentalContracts
/* loaded from: ItsOnFire.jar:kotlin/contracts/SimpleEffect.class */
public interface SimpleEffect extends Effect {
    @ContractsDsl
    @ExperimentalContracts
    @NotNull
    ConditionalEffect implies(boolean z);
}
package androidx.compose.ui.platform;

import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.SpannableString;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.annotation.IntRange;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.collection.ArraySet;
import androidx.collection.SparseArrayCompat;
import androidx.compose.ui.R;
import androidx.compose.ui.TempListUtilsKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.node.HitTestResult;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AccessibilityIterators;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.CustomAccessibilityAction;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsNodeKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsWrapper;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.platform.AndroidAccessibilitySpannableString_androidKt;
import androidx.core.app.NotificationCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import l.n;
import l.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"��\u009e\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b��\u0018�� Æ\u00012\u00020\u0001:\fÇ\u0001È\u0001Æ\u0001É\u0001Ê\u0001Ë\u0001B\u0013\u0012\b\u0010\u0085\u0001\u001a\u00030\u0084\u0001¢\u0006\u0006\bÄ\u0001\u0010Å\u0001J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\u0018\u0010\f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J=\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J?\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\"\u0010$\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00022\b\u0010#\u001a\u0004\u0018\u00010\"H\u0002J*\u0010&\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u00132\b\u0010#\u001a\u0004\u0018\u00010\"H\u0002J\u001c\u0010+\u001a\u0004\u0018\u00010*2\b\u0010'\u001a\u0004\u0018\u00010\u00062\u0006\u0010)\u001a\u00020(H\u0002J\u0010\u0010,\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J/\u00100\u001a\u0004\u0018\u00018��\"\b\b��\u0010.*\u00020-2\b\u0010\u001d\u001a\u0004\u0018\u00018��2\b\b\u0001\u0010/\u001a\u00020\u0002H\u0002¢\u0006\u0004\b0\u00101J\u0010\u00104\u001a\u00020\n2\u0006\u00103\u001a\u000202H\u0002J\u001e\u00107\u001a\u00020\n2\u0006\u00103\u001a\u0002022\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u000205H\u0002J\b\u00108\u001a\u00020\nH\u0002J\b\u00109\u001a\u00020\nH\u0002J\u001e\u0010=\u001a\u00020\r2\u0006\u0010:\u001a\u00020\u00022\f\u0010<\u001a\b\u0012\u0004\u0012\u00020;0\u0012H\u0002J\u0010\u0010?\u001a\u00020\n2\u0006\u0010>\u001a\u00020;H\u0002J\"\u0010B\u001a\u00020\n2\u0006\u0010@\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\b\u0010A\u001a\u0004\u0018\u00010\u0013H\u0002J\u0018\u0010F\u001a\u00020\n2\u0006\u0010C\u001a\u00020\u00062\u0006\u0010E\u001a\u00020DH\u0002J\u0010\u0010G\u001a\u00020\u00022\u0006\u0010:\u001a\u00020\u0002H\u0002J(\u0010K\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010H\u001a\u00020\u00022\u0006\u0010I\u001a\u00020\r2\u0006\u0010J\u001a\u00020\rH\u0002J\u0010\u0010L\u001a\u00020\n2\u0006\u0010@\u001a\u00020\u0002H\u0002J(\u0010P\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010M\u001a\u00020\u00022\u0006\u0010N\u001a\u00020\u00022\u0006\u0010O\u001a\u00020\rH\u0002J\u0010\u0010Q\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010R\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010S\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u001c\u0010U\u001a\u0004\u0018\u00010T2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010H\u001a\u00020\u0002H\u0002J\u0014\u0010V\u001a\u0004\u0018\u00010\u00132\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\u000e\u0010Y\u001a\u0004\u0018\u00010X*\u00020WH\u0002J-\u0010`\u001a\u00020\r2\u0006\u0010Z\u001a\u00020\r2\u0006\u0010[\u001a\u00020\u00022\u0006\u0010]\u001a\u00020\\H��ø\u0001��ø\u0001\u0001¢\u0006\u0004\b^\u0010_J;\u0010`\u001a\u00020\r2\f\u0010c\u001a\b\u0012\u0004\u0012\u00020b0a2\u0006\u0010Z\u001a\u00020\r2\u0006\u0010[\u001a\u00020\u00022\u0006\u0010]\u001a\u00020\\H\u0001ø\u0001��ø\u0001\u0001¢\u0006\u0004\bd\u0010eJ \u0010g\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010f\u001a\u00020\u0006H\u0007J\u001f\u0010j\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H\u0001¢\u0006\u0004\bh\u0010iJ\u000e\u0010l\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020kJ\u001f\u0010r\u001a\u00020\u00022\u0006\u0010n\u001a\u00020m2\u0006\u0010o\u001a\u00020mH\u0001¢\u0006\u0004\bp\u0010qJ\u0010\u0010v\u001a\u00020u2\u0006\u0010t\u001a\u00020sH\u0016J\u000f\u0010y\u001a\u00020\nH��¢\u0006\u0004\bw\u0010xJ\u0013\u0010z\u001a\u00020\nH\u0086@ø\u0001��¢\u0006\u0004\bz\u0010{J\u0017\u0010~\u001a\u00020\n2\u0006\u00103\u001a\u000202H��¢\u0006\u0004\b|\u0010}J'\u0010\u0083\u0001\u001a\u00020\n2\u0013\u0010\u0080\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020b0\u007fH\u0001¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001d\u0010\u0085\u0001\u001a\u00030\u0084\u00018\u0006¢\u0006\u0010\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R)\u0010\u0089\u0001\u001a\u00020\u00028��@��X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0018\u0010\u0090\u0001\u001a\u00030\u008f\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R)\u0010\u0092\u0001\u001a\u00020\r8��@��X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0006\b\u0096\u0001\u0010\u0097\u0001R\u0018\u0010\u0099\u0001\u001a\u00030\u0098\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0019\u0010\u009b\u0001\u001a\u00020u8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R\u0019\u0010\u009d\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u008a\u0001R'\u0010\u009f\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020-0\u009e\u00010\u009e\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R,\u0010¡\u0001\u001a\u0015\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u00020\u007f0\u009e\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¡\u0001\u0010 \u0001R\u0019\u0010¢\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¢\u0001\u0010\u008a\u0001R\u001b\u0010£\u0001\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b£\u0001\u0010¤\u0001R\u001d\u0010¥\u0001\u001a\b\u0012\u0004\u0012\u000202058\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001R\u001e\u0010¨\u0001\u001a\t\u0012\u0004\u0012\u00020\n0§\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¨\u0001\u0010©\u0001R\u0019\u0010ª\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bª\u0001\u0010\u0093\u0001R\u001c\u0010¬\u0001\u001a\u0005\u0018\u00010«\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¬\u0001\u0010\u00ad\u0001R+\u0010c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020b0\u007f8B@\u0002X\u0082\u000e¢\u0006\u000f\n\u0005\bc\u0010®\u0001\u001a\u0006\b¯\u0001\u0010°\u0001R\u001f\u0010±\u0001\u001a\b\u0012\u0004\u0012\u00020\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b±\u0001\u0010¦\u0001R=\u0010³\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020D0²\u00018��@��X\u0081\u000e¢\u0006\u001f\n\u0006\b³\u0001\u0010®\u0001\u0012\u0005\b¶\u0001\u0010x\u001a\u0006\b´\u0001\u0010°\u0001\"\u0006\bµ\u0001\u0010\u0082\u0001R\u0019\u0010·\u0001\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b·\u0001\u0010¸\u0001R\u0019\u0010¹\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¹\u0001\u0010\u0093\u0001R\u0018\u0010»\u0001\u001a\u00030º\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b»\u0001\u0010¼\u0001R\u001e\u0010¾\u0001\u001a\t\u0012\u0004\u0012\u00020;0½\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¾\u0001\u0010¿\u0001R$\u0010Á\u0001\u001a\u000f\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\n0À\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÁ\u0001\u0010Â\u0001R\u0017\u0010Ã\u0001\u001a\u00020\r8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÃ\u0001\u0010\u0095\u0001\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006Ì\u0001"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;", "Landroidx/core/view/AccessibilityDelegateCompat;", "", "virtualViewId", "Landroid/view/accessibility/AccessibilityNodeInfo;", "createNodeInfo", "Landroidx/compose/ui/semantics/SemanticsNode;", "node", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "info", "", "setContentInvalid", "setText", "", "isAccessibilityFocused", "requestAccessibilityFocus", "eventType", "contentChangeType", "", "", "contentDescription", "sendEventForVirtualView", "(IILjava/lang/Integer;Ljava/util/List;)Z", "Landroid/view/accessibility/AccessibilityEvent;", NotificationCompat.CATEGORY_EVENT, "sendEvent", "fromIndex", "toIndex", "itemCount", NotificationCompat.MessagingStyle.Message.KEY_TEXT, "createTextSelectionChangedEvent", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityEvent;", "clearAccessibilityFocus", "action", "Landroid/os/Bundle;", "arguments", "performActionHelper", "extraDataKey", "addExtraDataToAccessibilityNodeInfoHelper", "textNode", "Landroidx/compose/ui/geometry/Rect;", "bounds", "Landroid/graphics/RectF;", "toScreenCoords", "updateHoveredVirtualView", "", "T", "size", "trimToSize", "(Ljava/lang/CharSequence;I)Ljava/lang/CharSequence;", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "notifySubtreeAccessibilityStateChangedIfNeeded", "Landroidx/collection/ArraySet;", "subtreeChangedSemanticsNodesIds", "sendSubtreeChangeAccessibilityEvents", "checkForSemanticsChanges", "updateSemanticsNodesCopyAndPanes", "id", "Landroidx/compose/ui/platform/ScrollObservationScope;", "oldScrollObservationScopes", "registerScrollingId", "scrollObservationScope", "sendScrollEventIfNeeded", "semanticsNodeId", "title", "sendPaneChangeEvents", "newNode", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy;", "oldNode", "sendSemanticsStructureChangeEvents", "semanticsNodeIdToAccessibilityVirtualNodeId", "granularity", "forward", "extendSelection", "traverseAtGranularity", "sendPendingTextTraversedAtGranularityEvent", "start", "end", "traversalMode", "setAccessibilitySelection", "getAccessibilitySelectionStart", "getAccessibilitySelectionEnd", "isAccessibilitySelectionExtendable", "Landroidx/compose/ui/platform/AccessibilityIterators$TextSegmentIterator;", "getIteratorForGranularity", "getIterableTextForAccessibility", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "Landroidx/compose/ui/text/AnnotatedString;", "getTextForTextField", "vertical", "direction", "Landroidx/compose/ui/geometry/Offset;", "position", "canScroll-0AR0LA0$ui_release", "(ZIJ)Z", "canScroll", "", "Landroidx/compose/ui/platform/SemanticsNodeWithAdjustedBounds;", "currentSemanticsNodes", "canScroll-moWRBKg$ui_release", "(Ljava/util/Collection;ZIJ)Z", "semanticsNode", "populateAccessibilityNodeInfoProperties", "createEvent$ui_release", "(II)Landroid/view/accessibility/AccessibilityEvent;", "createEvent", "Landroid/view/MotionEvent;", "dispatchHoverEvent", "", "x", "y", "hitTestSemanticsAt$ui_release", "(FF)I", "hitTestSemanticsAt", "Landroid/view/View;", "host", "Landroidx/core/view/accessibility/AccessibilityNodeProviderCompat;", "getAccessibilityNodeProvider", "onSemanticsChange$ui_release", "()V", "onSemanticsChange", "boundsUpdatesEventLoop", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onLayoutChange$ui_release", "(Landroidx/compose/ui/node/LayoutNode;)V", "onLayoutChange", "", "newSemanticsNodes", "sendSemanticsPropertyChangeEvents$ui_release", "(Ljava/util/Map;)V", "sendSemanticsPropertyChangeEvents", "Landroidx/compose/ui/platform/AndroidComposeView;", "view", "Landroidx/compose/ui/platform/AndroidComposeView;", "getView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "hoveredVirtualViewId", "I", "getHoveredVirtualViewId$ui_release", "()I", "setHoveredVirtualViewId$ui_release", "(I)V", "Landroid/view/accessibility/AccessibilityManager;", "accessibilityManager", "Landroid/view/accessibility/AccessibilityManager;", "accessibilityForceEnabledForTesting", "Z", "getAccessibilityForceEnabledForTesting$ui_release", "()Z", "setAccessibilityForceEnabledForTesting$ui_release", "(Z)V", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "nodeProvider", "Landroidx/core/view/accessibility/AccessibilityNodeProviderCompat;", "focusedVirtualViewId", "Landroidx/collection/SparseArrayCompat;", "actionIdToLabel", "Landroidx/collection/SparseArrayCompat;", "labelToActionId", "accessibilityCursorPosition", "previousTraversedNode", "Ljava/lang/Integer;", "subtreeChangedLayoutNodes", "Landroidx/collection/ArraySet;", "Ll/n;", "boundsUpdateChannel", "Ll/n;", "currentSemanticsNodesInvalidated", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$PendingTextTraversedEvent;", "pendingTextTraversedEvent", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$PendingTextTraversedEvent;", "Ljava/util/Map;", "getCurrentSemanticsNodes", "()Ljava/util/Map;", "paneDisplayed", "", "previousSemanticsNodes", "getPreviousSemanticsNodes$ui_release", "setPreviousSemanticsNodes$ui_release", "getPreviousSemanticsNodes$ui_release$annotations", "previousSemanticsRoot", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy;", "checkingForSemanticsChanges", "Ljava/lang/Runnable;", "semanticsChangeChecker", "Ljava/lang/Runnable;", "", "scrollObservationScopes", "Ljava/util/List;", "Lkotlin/Function1;", "sendScrollEventIfNeededLambda", "Lkotlin/jvm/functions/Function1;", "isAccessibilityEnabled", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;)V", "Companion", "Api24Impl", "Api28Impl", "MyNodeProvider", "PendingTextTraversedEvent", "SemanticsNodeCopy", "ui_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: ItsOnFire.jar:androidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat.class */
public final class AndroidComposeViewAccessibilityDelegateCompat extends AccessibilityDelegateCompat {
    public static final int AccessibilityCursorPositionUndefined = -1;
    public static final int AccessibilitySliderStepsCount = 20;
    @NotNull
    public static final String ClassName = "android.view.View";
    @NotNull
    public static final String ExtraDataTestTagKey = "androidx.compose.ui.semantics.testTag";
    public static final int InvalidId = Integer.MIN_VALUE;
    @NotNull
    public static final String LogTag = "AccessibilityDelegate";
    public static final int ParcelSafeTextLength = 100000;
    public static final long SendRecurringAccessibilityEventsIntervalMillis = 100;
    public static final long TextTraversedEventTimeoutMillis = 1000;
    private int accessibilityCursorPosition;
    private boolean accessibilityForceEnabledForTesting;
    @NotNull
    private final android.view.accessibility.AccessibilityManager accessibilityManager;
    @NotNull
    private SparseArrayCompat<SparseArrayCompat<CharSequence>> actionIdToLabel;
    @NotNull
    private final n<Unit> boundsUpdateChannel;
    private boolean checkingForSemanticsChanges;
    @NotNull
    private Map<Integer, SemanticsNodeWithAdjustedBounds> currentSemanticsNodes;
    private boolean currentSemanticsNodesInvalidated;
    private int focusedVirtualViewId;
    @NotNull
    private final Handler handler;
    private int hoveredVirtualViewId;
    @NotNull
    private SparseArrayCompat<Map<CharSequence, Integer>> labelToActionId;
    @NotNull
    private AccessibilityNodeProviderCompat nodeProvider;
    @NotNull
    private ArraySet<Integer> paneDisplayed;
    @Nullable
    private PendingTextTraversedEvent pendingTextTraversedEvent;
    @NotNull
    private Map<Integer, SemanticsNodeCopy> previousSemanticsNodes;
    @NotNull
    private SemanticsNodeCopy previousSemanticsRoot;
    @Nullable
    private Integer previousTraversedNode;
    @NotNull
    private final List<ScrollObservationScope> scrollObservationScopes;
    @NotNull
    private final Runnable semanticsChangeChecker;
    @NotNull
    private final Function1<ScrollObservationScope, Unit> sendScrollEventIfNeededLambda;
    @NotNull
    private final ArraySet<LayoutNode> subtreeChangedLayoutNodes;
    @NotNull
    private final AndroidComposeView view;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final int[] AccessibilityActionsResourceIds = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    @Metadata(d1 = {"��\f\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0003\b\u0002\u0018�� \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$Api24Impl;", "", "()V", "Companion", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$Api24Impl.class */
    public static final class Api24Impl {
        @NotNull
        public static final Companion Companion = new Companion(null);

        @Metadata(d1 = {"��\u001e\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\b\u0087\u0003\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$Api24Impl$Companion;", "", "()V", "addSetProgressAction", "", "info", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "semanticsNode", "Landroidx/compose/ui/semantics/SemanticsNode;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
        @RequiresApi(24)
        /* loaded from: ItsOnFire.jar:androidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$Api24Impl$Companion.class */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final void addSetProgressAction(@NotNull AccessibilityNodeInfoCompat info, @NotNull SemanticsNode semanticsNode) {
                boolean enabled;
                AccessibilityAction accessibilityAction;
                Intrinsics.checkNotNullParameter(info, "info");
                Intrinsics.checkNotNullParameter(semanticsNode, "semanticsNode");
                enabled = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
                if (!enabled || (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getSetProgress())) == null) {
                    return;
                }
                info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16908349, accessibilityAction.getLabel()));
            }
        }
    }

    @Metadata(d1 = {"��\f\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0003\b\u0002\u0018�� \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$Api28Impl;", "", "()V", "Companion", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$Api28Impl.class */
    public static final class Api28Impl {
        @NotNull
        public static final Companion Companion = new Companion(null);

        @Metadata(d1 = {"�� \n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\u0003\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$Api28Impl$Companion;", "", "()V", "setScrollEventDelta", "", NotificationCompat.CATEGORY_EVENT, "Landroid/view/accessibility/AccessibilityEvent;", "deltaX", "", "deltaY", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
        @RequiresApi(28)
        /* loaded from: ItsOnFire.jar:androidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$Api28Impl$Companion.class */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final void setScrollEventDelta(@NotNull AccessibilityEvent event, int i2, int i3) {
                Intrinsics.checkNotNullParameter(event, "event");
                event.setScrollDeltaX(i2);
                event.setScrollDeltaY(i3);
            }
        }
    }

    @Metadata(d1 = {"��*\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0010\u0015\n��\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n��R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n��R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n��R\u000e\u0010\n\u001a\u00020\tX\u0086T¢\u0006\u0002\n��R\u000e\u0010\u000b\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n��R\u000e\u0010\f\u001a\u00020\tX\u0086T¢\u0006\u0002\n��R\u000e\u0010\r\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n��R\u000e\u0010\u000e\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n��R\u000e\u0010\u0010\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n��¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$Companion;", "", "()V", "AccessibilityActionsResourceIds", "", "AccessibilityCursorPositionUndefined", "", "AccessibilitySliderStepsCount", "ClassName", "", "ExtraDataTestTagKey", "InvalidId", "LogTag", "ParcelSafeTextLength", "SendRecurringAccessibilityEventsIntervalMillis", "", "TextTraversedEventTimeoutMillis", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"��4\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n��\n\u0002\u0010\b\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000e\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0004\u0018��2\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\"\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$MyNodeProvider;", "Landroid/view/accessibility/AccessibilityNodeProvider;", "(Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;)V", "addExtraDataToAccessibilityNodeInfo", "", "virtualViewId", "", "info", "Landroid/view/accessibility/AccessibilityNodeInfo;", "extraDataKey", "", "arguments", "Landroid/os/Bundle;", "createAccessibilityNodeInfo", "performAction", "", "action", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$MyNodeProvider.class */
    public final class MyNodeProvider extends AccessibilityNodeProvider {
        public final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat this$0;

        public MyNodeProvider(AndroidComposeViewAccessibilityDelegateCompat this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.this$0 = this$0;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i2, @NotNull AccessibilityNodeInfo info, @NotNull String extraDataKey, @Nullable Bundle bundle) {
            Intrinsics.checkNotNullParameter(info, "info");
            Intrinsics.checkNotNullParameter(extraDataKey, "extraDataKey");
            this.this$0.addExtraDataToAccessibilityNodeInfoHelper(i2, info, extraDataKey, bundle);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        @Nullable
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i2) {
            return this.this$0.createNodeInfo(i2);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i2, int i3, @Nullable Bundle bundle) {
            return this.this$0.performActionHelper(i2, i3, bundle);
        }
    }

    @Metadata(d1 = {"�� \n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000b\b\u0002\u0018��2\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n��\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n��\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n��\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n��\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n��\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$PendingTextTraversedEvent;", "", "node", "Landroidx/compose/ui/semantics/SemanticsNode;", "action", "", "granularity", "fromIndex", "toIndex", "traverseTime", "", "(Landroidx/compose/ui/semantics/SemanticsNode;IIIIJ)V", "getAction", "()I", "getFromIndex", "getGranularity", "getNode", "()Landroidx/compose/ui/semantics/SemanticsNode;", "getToIndex", "getTraverseTime", "()J", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$PendingTextTraversedEvent.class */
    public static final class PendingTextTraversedEvent {
        private final int action;
        private final int fromIndex;
        private final int granularity;
        @NotNull
        private final SemanticsNode node;
        private final int toIndex;
        private final long traverseTime;

        public PendingTextTraversedEvent(@NotNull SemanticsNode node, int i2, int i3, int i4, int i5, long j2) {
            Intrinsics.checkNotNullParameter(node, "node");
            this.node = node;
            this.action = i2;
            this.granularity = i3;
            this.fromIndex = i4;
            this.toIndex = i5;
            this.traverseTime = j2;
        }

        public final int getAction() {
            return this.action;
        }

        public final int getFromIndex() {
            return this.fromIndex;
        }

        public final int getGranularity() {
            return this.granularity;
        }

        @NotNull
        public final SemanticsNode getNode() {
            return this.node;
        }

        public final int getToIndex() {
            return this.toIndex;
        }

        public final long getTraverseTime() {
            return this.traverseTime;
        }
    }

    @Metadata(d1 = {"��6\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n��\b\u0001\u0018��2\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\u0010\bJ\u0006\u0010\u0011\u001a\u00020\u0012R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\b\n��\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n��\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy;", "", "semanticsNode", "Landroidx/compose/ui/semantics/SemanticsNode;", "currentSemanticsNodes", "", "", "Landroidx/compose/ui/platform/SemanticsNodeWithAdjustedBounds;", "(Landroidx/compose/ui/semantics/SemanticsNode;Ljava/util/Map;)V", "children", "", "getChildren", "()Ljava/util/Set;", "unmergedConfig", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "getUnmergedConfig", "()Landroidx/compose/ui/semantics/SemanticsConfiguration;", "hasPaneTitle", "", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    @VisibleForTesting
    /* loaded from: ItsOnFire.jar:androidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy.class */
    public static final class SemanticsNodeCopy {
        @NotNull
        private final Set<Integer> children;
        @NotNull
        private final SemanticsConfiguration unmergedConfig;

        public SemanticsNodeCopy(@NotNull SemanticsNode semanticsNode, @NotNull Map<Integer, SemanticsNodeWithAdjustedBounds> currentSemanticsNodes) {
            Intrinsics.checkNotNullParameter(semanticsNode, "semanticsNode");
            Intrinsics.checkNotNullParameter(currentSemanticsNodes, "currentSemanticsNodes");
            this.unmergedConfig = semanticsNode.getUnmergedConfig$ui_release();
            this.children = new LinkedHashSet();
            List<SemanticsNode> replacedChildren$ui_release = semanticsNode.getReplacedChildren$ui_release();
            int size = replacedChildren$ui_release.size();
            for (int i2 = 0; i2 < size; i2++) {
                SemanticsNode semanticsNode2 = replacedChildren$ui_release.get(i2);
                if (currentSemanticsNodes.containsKey(Integer.valueOf(semanticsNode2.getId()))) {
                    getChildren().add(Integer.valueOf(semanticsNode2.getId()));
                }
            }
        }

        @NotNull
        public final Set<Integer> getChildren() {
            return this.children;
        }

        @NotNull
        public final SemanticsConfiguration getUnmergedConfig() {
            return this.unmergedConfig;
        }

        public final boolean hasPaneTitle() {
            return this.unmergedConfig.contains(SemanticsProperties.INSTANCE.getPaneTitle());
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: ItsOnFire.jar:androidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$WhenMappings.class */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ToggleableState.values().length];
            iArr[ToggleableState.On.ordinal()] = 1;
            iArr[ToggleableState.Off.ordinal()] = 2;
            iArr[ToggleableState.Indeterminate.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AndroidComposeViewAccessibilityDelegateCompat(@NotNull AndroidComposeView view) {
        Map<Integer, SemanticsNodeWithAdjustedBounds> emptyMap;
        Map emptyMap2;
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
        this.hoveredVirtualViewId = Integer.MIN_VALUE;
        Object systemService = view.getContext().getSystemService("accessibility");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        }
        this.accessibilityManager = (android.view.accessibility.AccessibilityManager) systemService;
        this.handler = new Handler(Looper.getMainLooper());
        this.nodeProvider = new AccessibilityNodeProviderCompat(new MyNodeProvider(this));
        this.focusedVirtualViewId = Integer.MIN_VALUE;
        this.actionIdToLabel = new SparseArrayCompat<>();
        this.labelToActionId = new SparseArrayCompat<>();
        this.accessibilityCursorPosition = -1;
        this.subtreeChangedLayoutNodes = new ArraySet<>();
        this.boundsUpdateChannel = q.d(-1, null, null, 6, null);
        this.currentSemanticsNodesInvalidated = true;
        emptyMap = MapsKt__MapsKt.emptyMap();
        this.currentSemanticsNodes = emptyMap;
        this.paneDisplayed = new ArraySet<>();
        this.previousSemanticsNodes = new LinkedHashMap();
        SemanticsNode unmergedRootSemanticsNode = view.getSemanticsOwner().getUnmergedRootSemanticsNode();
        emptyMap2 = MapsKt__MapsKt.emptyMap();
        this.previousSemanticsRoot = new SemanticsNodeCopy(unmergedRootSemanticsNode, emptyMap2);
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(@NotNull View view2) {
                Intrinsics.checkNotNullParameter(view2, "view");
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(@NotNull View view2) {
                Intrinsics.checkNotNullParameter(view2, "view");
                AndroidComposeViewAccessibilityDelegateCompat.this.handler.removeCallbacks(AndroidComposeViewAccessibilityDelegateCompat.this.semanticsChangeChecker);
            }
        });
        this.semanticsChangeChecker = new Runnable() { // from class: androidx.compose.ui.platform.f
            @Override // java.lang.Runnable
            public final void run() {
                AndroidComposeViewAccessibilityDelegateCompat.m4147semanticsChangeChecker$lambda26(AndroidComposeViewAccessibilityDelegateCompat.this);
            }
        };
        this.scrollObservationScopes = new ArrayList();
        this.sendScrollEventIfNeededLambda = new Function1<ScrollObservationScope, Unit>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendScrollEventIfNeededLambda$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ScrollObservationScope scrollObservationScope) {
                invoke2(scrollObservationScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull ScrollObservationScope it) {
                Intrinsics.checkNotNullParameter(it, "it");
                AndroidComposeViewAccessibilityDelegateCompat.this.sendScrollEventIfNeeded(it);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addExtraDataToAccessibilityNodeInfoHelper(int i2, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        String str2;
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes().get(Integer.valueOf(i2));
        SemanticsNode semanticsNode = semanticsNodeWithAdjustedBounds == null ? null : semanticsNodeWithAdjustedBounds.getSemanticsNode();
        if (semanticsNode == null) {
            return;
        }
        String iterableTextForAccessibility = getIterableTextForAccessibility(semanticsNode);
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsActions semanticsActions = SemanticsActions.INSTANCE;
        if (!unmergedConfig$ui_release.contains(semanticsActions.getGetTextLayoutResult()) || bundle == null || !Intrinsics.areEqual(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            SemanticsConfiguration unmergedConfig$ui_release2 = semanticsNode.getUnmergedConfig$ui_release();
            SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
            if (!unmergedConfig$ui_release2.contains(semanticsProperties.getTestTag()) || bundle == null || !Intrinsics.areEqual(str, ExtraDataTestTagKey) || (str2 = (String) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties.getTestTag())) == null) {
                return;
            }
            accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
            return;
        }
        int i3 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
        int i4 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
        if (i4 > 0 && i3 >= 0) {
            if (i3 < (iterableTextForAccessibility == null ? Integer.MAX_VALUE : iterableTextForAccessibility.length())) {
                ArrayList arrayList = new ArrayList();
                Function1 function1 = (Function1) ((AccessibilityAction) semanticsNode.getUnmergedConfig$ui_release().get(semanticsActions.getGetTextLayoutResult())).getAction();
                if (Intrinsics.areEqual(function1 == null ? null : (Boolean) function1.invoke(arrayList), Boolean.TRUE)) {
                    TextLayoutResult textLayoutResult = (TextLayoutResult) arrayList.get(0);
                    ArrayList arrayList2 = new ArrayList();
                    for (int i5 = 0; i5 < i4; i5++) {
                        int i6 = i5 + i3;
                        if (i6 >= textLayoutResult.getLayoutInput().getText().length()) {
                            arrayList2.add(null);
                        } else {
                            arrayList2.add(toScreenCoords(semanticsNode, textLayoutResult.getBoundingBox(i6)));
                        }
                    }
                    Bundle extras = accessibilityNodeInfo.getExtras();
                    Object[] array = arrayList2.toArray(new RectF[0]);
                    if (array == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    }
                    extras.putParcelableArray(str, (Parcelable[]) array);
                    return;
                }
                return;
            }
        }
        Log.e(LogTag, "Invalid arguments for accessibility character locations");
    }

    private final void checkForSemanticsChanges() {
        sendSemanticsStructureChangeEvents(this.view.getSemanticsOwner().getUnmergedRootSemanticsNode(), this.previousSemanticsRoot);
        sendSemanticsPropertyChangeEvents$ui_release(getCurrentSemanticsNodes());
        updateSemanticsNodesCopyAndPanes();
    }

    private final boolean clearAccessibilityFocus(int i2) {
        if (isAccessibilityFocused(i2)) {
            this.focusedVirtualViewId = Integer.MIN_VALUE;
            this.view.invalidate();
            sendEventForVirtualView$default(this, i2, 65536, null, null, 12, null);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AccessibilityNodeInfo createNodeInfo(int i2) {
        AccessibilityNodeInfoCompat obtain = AccessibilityNodeInfoCompat.obtain();
        Intrinsics.checkNotNullExpressionValue(obtain, "obtain()");
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes().get(Integer.valueOf(i2));
        View view = null;
        if (semanticsNodeWithAdjustedBounds == null) {
            obtain.recycle();
            return null;
        }
        SemanticsNode semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode();
        int i3 = -1;
        if (i2 == -1) {
            ViewParent parentForAccessibility = ViewCompat.getParentForAccessibility(this.view);
            if (parentForAccessibility instanceof View) {
                view = (View) parentForAccessibility;
            }
            obtain.setParent(view);
        } else if (semanticsNode.getParent() == null) {
            throw new IllegalStateException("semanticsNode " + i2 + " has null parent");
        } else {
            SemanticsNode parent = semanticsNode.getParent();
            Intrinsics.checkNotNull(parent);
            int id = parent.getId();
            if (id != this.view.getSemanticsOwner().getUnmergedRootSemanticsNode().getId()) {
                i3 = id;
            }
            obtain.setParent(this.view, i3);
        }
        obtain.setSource(this.view, i2);
        Rect adjustedBounds = semanticsNodeWithAdjustedBounds.getAdjustedBounds();
        long mo3864localToScreenMKHz9U = this.view.mo3864localToScreenMKHz9U(OffsetKt.Offset(adjustedBounds.left, adjustedBounds.top));
        long mo3864localToScreenMKHz9U2 = this.view.mo3864localToScreenMKHz9U(OffsetKt.Offset(adjustedBounds.right, adjustedBounds.bottom));
        obtain.setBoundsInScreen(new Rect((int) Math.floor(Offset.m2167getXimpl(mo3864localToScreenMKHz9U)), (int) Math.floor(Offset.m2168getYimpl(mo3864localToScreenMKHz9U)), (int) Math.ceil(Offset.m2167getXimpl(mo3864localToScreenMKHz9U2)), (int) Math.ceil(Offset.m2168getYimpl(mo3864localToScreenMKHz9U2))));
        populateAccessibilityNodeInfoProperties(i2, obtain, semanticsNode);
        return obtain.unwrap();
    }

    private final AccessibilityEvent createTextSelectionChangedEvent(int i2, Integer num, Integer num2, Integer num3, String str) {
        AccessibilityEvent createEvent$ui_release = createEvent$ui_release(i2, 8192);
        if (num != null) {
            createEvent$ui_release.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            createEvent$ui_release.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            createEvent$ui_release.setItemCount(num3.intValue());
        }
        if (str != null) {
            createEvent$ui_release.getText().add(str);
        }
        return createEvent$ui_release;
    }

    private final int getAccessibilitySelectionEnd(SemanticsNode semanticsNode) {
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        return (unmergedConfig$ui_release.contains(semanticsProperties.getContentDescription()) || !semanticsNode.getUnmergedConfig$ui_release().contains(semanticsProperties.getTextSelectionRange())) ? this.accessibilityCursorPosition : TextRange.m4470getEndimpl(((TextRange) semanticsNode.getUnmergedConfig$ui_release().get(semanticsProperties.getTextSelectionRange())).m4479unboximpl());
    }

    private final int getAccessibilitySelectionStart(SemanticsNode semanticsNode) {
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        return (unmergedConfig$ui_release.contains(semanticsProperties.getContentDescription()) || !semanticsNode.getUnmergedConfig$ui_release().contains(semanticsProperties.getTextSelectionRange())) ? this.accessibilityCursorPosition : TextRange.m4475getStartimpl(((TextRange) semanticsNode.getUnmergedConfig$ui_release().get(semanticsProperties.getTextSelectionRange())).m4479unboximpl());
    }

    private final Map<Integer, SemanticsNodeWithAdjustedBounds> getCurrentSemanticsNodes() {
        if (this.currentSemanticsNodesInvalidated) {
            this.currentSemanticsNodes = AndroidComposeViewAccessibilityDelegateCompat_androidKt.getAllUncoveredSemanticsNodesToMap(this.view.getSemanticsOwner());
            this.currentSemanticsNodesInvalidated = false;
        }
        return this.currentSemanticsNodes;
    }

    private final String getIterableTextForAccessibility(SemanticsNode semanticsNode) {
        boolean isTextField;
        Object firstOrNull;
        String text;
        if (semanticsNode == null) {
            return null;
        }
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (unmergedConfig$ui_release.contains(semanticsProperties.getContentDescription())) {
            return TempListUtilsKt.fastJoinToString$default((List) semanticsNode.getUnmergedConfig$ui_release().get(semanticsProperties.getContentDescription()), ",", null, null, 0, null, null, 62, null);
        }
        isTextField = AndroidComposeViewAccessibilityDelegateCompat_androidKt.isTextField(semanticsNode);
        if (isTextField) {
            AnnotatedString textForTextField = getTextForTextField(semanticsNode.getUnmergedConfig$ui_release());
            return textForTextField == null ? null : textForTextField.getText();
        }
        List list = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties.getText());
        if (list == null) {
            text = null;
        } else {
            firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) list);
            AnnotatedString annotatedString = (AnnotatedString) firstOrNull;
            text = annotatedString == null ? null : annotatedString.getText();
        }
        return text;
    }

    private final AccessibilityIterators.TextSegmentIterator getIteratorForGranularity(SemanticsNode semanticsNode, int i2) {
        AccessibilityIterators.ParagraphTextSegmentIterator companion;
        AccessibilityIterators.LineTextSegmentIterator lineTextSegmentIterator;
        if (semanticsNode == null) {
            return null;
        }
        String iterableTextForAccessibility = getIterableTextForAccessibility(semanticsNode);
        if (iterableTextForAccessibility == null || iterableTextForAccessibility.length() == 0) {
            return null;
        }
        if (i2 == 1) {
            AccessibilityIterators.CharacterTextSegmentIterator.Companion companion2 = AccessibilityIterators.CharacterTextSegmentIterator.Companion;
            Locale locale = this.view.getContext().getResources().getConfiguration().locale;
            Intrinsics.checkNotNullExpressionValue(locale, "view.context.resources.configuration.locale");
            companion = companion2.getInstance(locale);
        } else if (i2 != 2) {
            if (i2 != 4) {
                if (i2 == 8) {
                    companion = AccessibilityIterators.ParagraphTextSegmentIterator.Companion.getInstance();
                } else if (i2 != 16) {
                    return null;
                }
            }
            SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
            SemanticsActions semanticsActions = SemanticsActions.INSTANCE;
            if (unmergedConfig$ui_release.contains(semanticsActions.getGetTextLayoutResult())) {
                ArrayList arrayList = new ArrayList();
                Function1 function1 = (Function1) ((AccessibilityAction) semanticsNode.getUnmergedConfig$ui_release().get(semanticsActions.getGetTextLayoutResult())).getAction();
                if (Intrinsics.areEqual(function1 == null ? null : (Boolean) function1.invoke(arrayList), Boolean.TRUE)) {
                    TextLayoutResult textLayoutResult = (TextLayoutResult) arrayList.get(0);
                    if (i2 == 4) {
                        AccessibilityIterators.LineTextSegmentIterator companion3 = AccessibilityIterators.LineTextSegmentIterator.Companion.getInstance();
                        companion3.initialize(iterableTextForAccessibility, textLayoutResult);
                        lineTextSegmentIterator = companion3;
                    } else {
                        AccessibilityIterators.PageTextSegmentIterator companion4 = AccessibilityIterators.PageTextSegmentIterator.Companion.getInstance();
                        companion4.initialize(iterableTextForAccessibility, textLayoutResult, semanticsNode);
                        lineTextSegmentIterator = companion4;
                    }
                    return lineTextSegmentIterator;
                }
                return null;
            }
            return null;
        } else {
            AccessibilityIterators.WordTextSegmentIterator.Companion companion5 = AccessibilityIterators.WordTextSegmentIterator.Companion;
            Locale locale2 = this.view.getContext().getResources().getConfiguration().locale;
            Intrinsics.checkNotNullExpressionValue(locale2, "view.context.resources.configuration.locale");
            companion = companion5.getInstance(locale2);
        }
        companion.initialize(iterableTextForAccessibility);
        lineTextSegmentIterator = companion;
        return lineTextSegmentIterator;
    }

    @VisibleForTesting
    public static /* synthetic */ void getPreviousSemanticsNodes$ui_release$annotations() {
    }

    private final AnnotatedString getTextForTextField(SemanticsConfiguration semanticsConfiguration) {
        return (AnnotatedString) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SemanticsProperties.INSTANCE.getEditableText());
    }

    private final boolean isAccessibilityEnabled() {
        return this.accessibilityForceEnabledForTesting || (this.accessibilityManager.isEnabled() && this.accessibilityManager.isTouchExplorationEnabled());
    }

    private final boolean isAccessibilityFocused(int i2) {
        return this.focusedVirtualViewId == i2;
    }

    private final boolean isAccessibilitySelectionExtendable(SemanticsNode semanticsNode) {
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        return !unmergedConfig$ui_release.contains(semanticsProperties.getContentDescription()) && semanticsNode.getUnmergedConfig$ui_release().contains(semanticsProperties.getEditableText());
    }

    private final void notifySubtreeAccessibilityStateChangedIfNeeded(LayoutNode layoutNode) {
        if (this.subtreeChangedLayoutNodes.add(layoutNode)) {
            this.boundsUpdateChannel.T(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x07f9, code lost:
        if (r10 != false) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x0829, code lost:
        if (r42 != false) goto L270;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x08aa, code lost:
        if (r10 != false) goto L303;
     */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02b1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x025d -> B:81:0x0271). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:88:0x0288 -> B:76:0x023a). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:91:0x02a5 -> B:76:0x023a). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean performActionHelper(int r10, int r11, android.os.Bundle r12) {
        /*
            Method dump skipped, instructions count: 2800
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.performActionHelper(int, int, android.os.Bundle):boolean");
    }

    private static final boolean performActionHelper$canScroll(ScrollAxisRange scrollAxisRange, float f2) {
        return (f2 < 0.0f && scrollAxisRange.getValue().invoke().floatValue() > 0.0f) || (f2 > 0.0f && scrollAxisRange.getValue().invoke().floatValue() < scrollAxisRange.getMaxValue().invoke().floatValue());
    }

    private static final float performActionHelper$scrollDelta(float f2, float f3) {
        if (!(Math.signum(f2) == Math.signum(f3))) {
            f2 = 0.0f;
        } else if (Math.abs(f2) >= Math.abs(f3)) {
            f2 = f3;
        }
        return f2;
    }

    private static final boolean populateAccessibilityNodeInfoProperties$canScrollBackward(ScrollAxisRange scrollAxisRange) {
        return (scrollAxisRange.getValue().invoke().floatValue() > 0.0f && !scrollAxisRange.getReverseScrolling()) || (scrollAxisRange.getValue().invoke().floatValue() < scrollAxisRange.getMaxValue().invoke().floatValue() && scrollAxisRange.getReverseScrolling());
    }

    private static final boolean populateAccessibilityNodeInfoProperties$canScrollForward(ScrollAxisRange scrollAxisRange) {
        return (scrollAxisRange.getValue().invoke().floatValue() < scrollAxisRange.getMaxValue().invoke().floatValue() && !scrollAxisRange.getReverseScrolling()) || (scrollAxisRange.getValue().invoke().floatValue() > 0.0f && scrollAxisRange.getReverseScrolling());
    }

    private final boolean registerScrollingId(int i2, List<ScrollObservationScope> list) {
        boolean z;
        ScrollObservationScope findById = AndroidComposeViewAccessibilityDelegateCompat_androidKt.findById(list, i2);
        if (findById != null) {
            z = false;
        } else {
            findById = new ScrollObservationScope(i2, this.scrollObservationScopes, null, null, null, null);
            z = true;
        }
        this.scrollObservationScopes.add(findById);
        return z;
    }

    private final boolean requestAccessibilityFocus(int i2) {
        if (isAccessibilityEnabled() && !isAccessibilityFocused(i2)) {
            int i3 = this.focusedVirtualViewId;
            if (i3 != Integer.MIN_VALUE) {
                sendEventForVirtualView$default(this, i3, 65536, null, null, 12, null);
            }
            this.focusedVirtualViewId = i2;
            this.view.invalidate();
            sendEventForVirtualView$default(this, i2, 32768, null, null, 12, null);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: semanticsChangeChecker$lambda-26  reason: not valid java name */
    public static final void m4147semanticsChangeChecker$lambda26(AndroidComposeViewAccessibilityDelegateCompat this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.checkForSemanticsChanges();
        this$0.checkingForSemanticsChanges = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int semanticsNodeIdToAccessibilityVirtualNodeId(int i2) {
        if (i2 == this.view.getSemanticsOwner().getUnmergedRootSemanticsNode().getId()) {
            return -1;
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean sendEvent(AccessibilityEvent accessibilityEvent) {
        if (isAccessibilityEnabled()) {
            return this.view.getParent().requestSendAccessibilityEvent(this.view, accessibilityEvent);
        }
        return false;
    }

    private final boolean sendEventForVirtualView(int i2, int i3, Integer num, List<String> list) {
        if (i2 == Integer.MIN_VALUE || !isAccessibilityEnabled()) {
            return false;
        }
        AccessibilityEvent createEvent$ui_release = createEvent$ui_release(i2, i3);
        if (num != null) {
            createEvent$ui_release.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            createEvent$ui_release.setContentDescription(TempListUtilsKt.fastJoinToString$default(list, ",", null, null, 0, null, null, 62, null));
        }
        return sendEvent(createEvent$ui_release);
    }

    public static /* synthetic */ boolean sendEventForVirtualView$default(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, int i2, int i3, Integer num, List list, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            num = null;
        }
        if ((i4 & 8) != 0) {
            list = null;
        }
        return androidComposeViewAccessibilityDelegateCompat.sendEventForVirtualView(i2, i3, num, list);
    }

    private final void sendPaneChangeEvents(int i2, int i3, String str) {
        AccessibilityEvent createEvent$ui_release = createEvent$ui_release(semanticsNodeIdToAccessibilityVirtualNodeId(i2), 32);
        createEvent$ui_release.setContentChangeTypes(i3);
        if (str != null) {
            createEvent$ui_release.getText().add(str);
        }
        sendEvent(createEvent$ui_release);
    }

    private final void sendPendingTextTraversedAtGranularityEvent(int i2) {
        PendingTextTraversedEvent pendingTextTraversedEvent = this.pendingTextTraversedEvent;
        if (pendingTextTraversedEvent != null) {
            if (i2 != pendingTextTraversedEvent.getNode().getId()) {
                return;
            }
            if (SystemClock.uptimeMillis() - pendingTextTraversedEvent.getTraverseTime() <= 1000) {
                AccessibilityEvent createEvent$ui_release = createEvent$ui_release(semanticsNodeIdToAccessibilityVirtualNodeId(pendingTextTraversedEvent.getNode().getId()), 131072);
                createEvent$ui_release.setFromIndex(pendingTextTraversedEvent.getFromIndex());
                createEvent$ui_release.setToIndex(pendingTextTraversedEvent.getToIndex());
                createEvent$ui_release.setAction(pendingTextTraversedEvent.getAction());
                createEvent$ui_release.setMovementGranularity(pendingTextTraversedEvent.getGranularity());
                createEvent$ui_release.getText().add(getIterableTextForAccessibility(pendingTextTraversedEvent.getNode()));
                sendEvent(createEvent$ui_release);
            }
        }
        this.pendingTextTraversedEvent = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendScrollEventIfNeeded(final ScrollObservationScope scrollObservationScope) {
        if (scrollObservationScope.isValid()) {
            this.view.getSnapshotObserver().observeReads$ui_release(scrollObservationScope, this.sendScrollEventIfNeededLambda, new Function0<Unit>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendScrollEventIfNeeded$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX WARN: Code restructure failed: missing block: B:24:0x0093, code lost:
                    if (r16 == false) goto L30;
                 */
                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void invoke2() {
                    /*
                        Method dump skipped, instructions count: 364
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendScrollEventIfNeeded$1.invoke2():void");
                }
            });
        }
    }

    private final void sendSemanticsStructureChangeEvents(SemanticsNode semanticsNode, SemanticsNodeCopy semanticsNodeCopy) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List<SemanticsNode> replacedChildren$ui_release = semanticsNode.getReplacedChildren$ui_release();
        int size = replacedChildren$ui_release.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                for (Integer num : semanticsNodeCopy.getChildren()) {
                    if (!linkedHashSet.contains(Integer.valueOf(num.intValue()))) {
                    }
                }
                List<SemanticsNode> replacedChildren$ui_release2 = semanticsNode.getReplacedChildren$ui_release();
                int size2 = replacedChildren$ui_release2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    SemanticsNode semanticsNode2 = replacedChildren$ui_release2.get(i3);
                    if (getCurrentSemanticsNodes().containsKey(Integer.valueOf(semanticsNode2.getId()))) {
                        SemanticsNodeCopy semanticsNodeCopy2 = getPreviousSemanticsNodes$ui_release().get(Integer.valueOf(semanticsNode2.getId()));
                        Intrinsics.checkNotNull(semanticsNodeCopy2);
                        sendSemanticsStructureChangeEvents(semanticsNode2, semanticsNodeCopy2);
                    }
                }
                return;
            }
            SemanticsNode semanticsNode3 = replacedChildren$ui_release.get(i2);
            if (getCurrentSemanticsNodes().containsKey(Integer.valueOf(semanticsNode3.getId()))) {
                if (!semanticsNodeCopy.getChildren().contains(Integer.valueOf(semanticsNode3.getId()))) {
                    break;
                }
                linkedHashSet.add(Integer.valueOf(semanticsNode3.getId()));
            }
            i2++;
        }
        notifySubtreeAccessibilityStateChangedIfNeeded(semanticsNode.getLayoutNode$ui_release());
    }

    private final void sendSubtreeChangeAccessibilityEvents(LayoutNode layoutNode, ArraySet<Integer> arraySet) {
        LayoutNode findClosestParentNode;
        LayoutNode findClosestParentNode2;
        if (layoutNode.isAttached() && !this.view.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(layoutNode)) {
            SemanticsWrapper outerSemantics = SemanticsNodeKt.getOuterSemantics(layoutNode);
            SemanticsWrapper semanticsWrapper = outerSemantics;
            if (outerSemantics == null) {
                findClosestParentNode2 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.findClosestParentNode(layoutNode, new Function1<LayoutNode, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$semanticsWrapper$1
                    @Override // kotlin.jvm.functions.Function1
                    @NotNull
                    public final Boolean invoke(@NotNull LayoutNode it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return Boolean.valueOf(SemanticsNodeKt.getOuterSemantics(it) != null);
                    }
                });
                SemanticsWrapper outerSemantics2 = findClosestParentNode2 == null ? null : SemanticsNodeKt.getOuterSemantics(findClosestParentNode2);
                semanticsWrapper = outerSemantics2;
                if (outerSemantics2 == null) {
                    return;
                }
            }
            SemanticsWrapper semanticsWrapper2 = semanticsWrapper;
            if (!semanticsWrapper.collapsedSemanticsConfiguration().isMergingSemanticsOfDescendants()) {
                findClosestParentNode = AndroidComposeViewAccessibilityDelegateCompat_androidKt.findClosestParentNode(layoutNode, new Function1<LayoutNode, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1
                    @Override // kotlin.jvm.functions.Function1
                    @NotNull
                    public final Boolean invoke(@NotNull LayoutNode it) {
                        SemanticsConfiguration collapsedSemanticsConfiguration;
                        Intrinsics.checkNotNullParameter(it, "it");
                        SemanticsWrapper outerSemantics3 = SemanticsNodeKt.getOuterSemantics(it);
                        boolean z = true;
                        if (outerSemantics3 == null || (collapsedSemanticsConfiguration = outerSemantics3.collapsedSemanticsConfiguration()) == null || !collapsedSemanticsConfiguration.isMergingSemanticsOfDescendants()) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    }
                });
                if (findClosestParentNode == null) {
                    semanticsWrapper2 = semanticsWrapper;
                } else {
                    semanticsWrapper2 = SemanticsNodeKt.getOuterSemantics(findClosestParentNode);
                    if (semanticsWrapper2 == null) {
                        semanticsWrapper2 = semanticsWrapper;
                    }
                }
            }
            int id = semanticsWrapper2.getModifier().getId();
            if (arraySet.add(Integer.valueOf(id))) {
                sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(id), 2048, 1, null, 8, null);
            }
        }
    }

    private final boolean setAccessibilitySelection(SemanticsNode semanticsNode, int i2, int i3, boolean z) {
        String iterableTextForAccessibility;
        boolean enabled;
        boolean booleanValue;
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsActions semanticsActions = SemanticsActions.INSTANCE;
        if (unmergedConfig$ui_release.contains(semanticsActions.getSetSelection())) {
            enabled = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
            if (enabled) {
                Function3 function3 = (Function3) ((AccessibilityAction) semanticsNode.getUnmergedConfig$ui_release().get(semanticsActions.getSetSelection())).getAction();
                if (function3 == null) {
                    booleanValue = false;
                } else {
                    Boolean bool = (Boolean) function3.invoke(Integer.valueOf(i2), Integer.valueOf(i3), Boolean.valueOf(z));
                    booleanValue = bool == null ? false : bool.booleanValue();
                }
                return booleanValue;
            }
        }
        if ((i2 == i3 && i3 == this.accessibilityCursorPosition) || (iterableTextForAccessibility = getIterableTextForAccessibility(semanticsNode)) == null) {
            return false;
        }
        if (i2 < 0 || i2 != i3 || i3 > iterableTextForAccessibility.length()) {
            i2 = -1;
        }
        this.accessibilityCursorPosition = i2;
        boolean z2 = false;
        if (iterableTextForAccessibility.length() > 0) {
            z2 = true;
        }
        int semanticsNodeIdToAccessibilityVirtualNodeId = semanticsNodeIdToAccessibilityVirtualNodeId(semanticsNode.getId());
        Integer num = null;
        Integer valueOf = z2 ? Integer.valueOf(this.accessibilityCursorPosition) : null;
        Integer valueOf2 = z2 ? Integer.valueOf(this.accessibilityCursorPosition) : null;
        if (z2) {
            num = Integer.valueOf(iterableTextForAccessibility.length());
        }
        sendEvent(createTextSelectionChangedEvent(semanticsNodeIdToAccessibilityVirtualNodeId, valueOf, valueOf2, num, iterableTextForAccessibility));
        sendPendingTextTraversedAtGranularityEvent(semanticsNode.getId());
        return true;
    }

    private final void setContentInvalid(SemanticsNode semanticsNode, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig$ui_release();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (unmergedConfig$ui_release.contains(semanticsProperties.getError())) {
            accessibilityNodeInfoCompat.setContentInvalid(true);
            accessibilityNodeInfoCompat.setError((CharSequence) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties.getError()));
        }
    }

    private final void setText(SemanticsNode semanticsNode, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        Object firstOrNull;
        SpannableString accessibilitySpannableString;
        AnnotatedString textForTextField = getTextForTextField(semanticsNode.getUnmergedConfig$ui_release());
        SpannableString spannableString = (SpannableString) trimToSize(textForTextField == null ? null : AndroidAccessibilitySpannableString_androidKt.toAccessibilitySpannableString(textForTextField, this.view.getDensity(), this.view.getFontLoader()), ParcelSafeTextLength);
        List list = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getText());
        if (list == null) {
            accessibilitySpannableString = null;
        } else {
            firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) list);
            AnnotatedString annotatedString = (AnnotatedString) firstOrNull;
            accessibilitySpannableString = annotatedString == null ? null : AndroidAccessibilitySpannableString_androidKt.toAccessibilitySpannableString(annotatedString, this.view.getDensity(), this.view.getFontLoader());
        }
        SpannableString spannableString2 = (SpannableString) trimToSize(accessibilitySpannableString, ParcelSafeTextLength);
        SpannableString spannableString3 = spannableString;
        if (spannableString == null) {
            spannableString3 = spannableString2;
        }
        accessibilityNodeInfoCompat.setText(spannableString3);
    }

    private final RectF toScreenCoords(SemanticsNode semanticsNode, androidx.compose.ui.geometry.Rect rect) {
        if (semanticsNode == null) {
            return null;
        }
        androidx.compose.ui.geometry.Rect m2205translatek4lQ0M = rect.m2205translatek4lQ0M(semanticsNode.m4327getPositionInRootF1C5BW0());
        androidx.compose.ui.geometry.Rect boundsInRoot = semanticsNode.getBoundsInRoot();
        androidx.compose.ui.geometry.Rect intersect = m2205translatek4lQ0M.overlaps(boundsInRoot) ? m2205translatek4lQ0M.intersect(boundsInRoot) : null;
        RectF rectF = null;
        if (intersect != null) {
            long mo3864localToScreenMKHz9U = this.view.mo3864localToScreenMKHz9U(OffsetKt.Offset(intersect.getLeft(), intersect.getTop()));
            long mo3864localToScreenMKHz9U2 = this.view.mo3864localToScreenMKHz9U(OffsetKt.Offset(intersect.getRight(), intersect.getBottom()));
            rectF = new RectF(Offset.m2167getXimpl(mo3864localToScreenMKHz9U), Offset.m2168getYimpl(mo3864localToScreenMKHz9U), Offset.m2167getXimpl(mo3864localToScreenMKHz9U2), Offset.m2168getYimpl(mo3864localToScreenMKHz9U2));
        }
        return rectF;
    }

    private final boolean traverseAtGranularity(SemanticsNode semanticsNode, int i2, boolean z, boolean z2) {
        AccessibilityIterators.TextSegmentIterator iteratorForGranularity;
        int i3;
        int i4;
        int id = semanticsNode.getId();
        Integer num = this.previousTraversedNode;
        if (num == null || id != num.intValue()) {
            this.accessibilityCursorPosition = -1;
            this.previousTraversedNode = Integer.valueOf(semanticsNode.getId());
        }
        String iterableTextForAccessibility = getIterableTextForAccessibility(semanticsNode);
        if ((iterableTextForAccessibility == null || iterableTextForAccessibility.length() == 0) || (iteratorForGranularity = getIteratorForGranularity(semanticsNode, i2)) == null) {
            return false;
        }
        int accessibilitySelectionEnd = getAccessibilitySelectionEnd(semanticsNode);
        int i5 = accessibilitySelectionEnd;
        if (accessibilitySelectionEnd == -1) {
            i5 = z ? 0 : iterableTextForAccessibility.length();
        }
        int[] following = z ? iteratorForGranularity.following(i5) : iteratorForGranularity.preceding(i5);
        if (following == null) {
            return false;
        }
        int i6 = following[0];
        int i7 = following[1];
        if (z2 && isAccessibilitySelectionExtendable(semanticsNode)) {
            int accessibilitySelectionStart = getAccessibilitySelectionStart(semanticsNode);
            i3 = accessibilitySelectionStart;
            if (accessibilitySelectionStart == -1) {
                i3 = z ? i6 : i7;
            }
            i4 = z ? i7 : i6;
        } else {
            i3 = z ? i7 : i6;
            i4 = i3;
        }
        this.pendingTextTraversedEvent = new PendingTextTraversedEvent(semanticsNode, z ? 256 : 512, i2, i6, i7, SystemClock.uptimeMillis());
        setAccessibilitySelection(semanticsNode, i3, i4, true);
        return true;
    }

    private final <T extends CharSequence> T trimToSize(T t2, @IntRange(from = 1) int i2) {
        if (i2 > 0) {
            boolean z = true;
            if (t2 != null) {
                z = t2.length() == 0;
            }
            if (z || t2.length() <= i2) {
                return t2;
            }
            int i3 = i2 - 1;
            int i4 = i2;
            if (Character.isHighSurrogate(t2.charAt(i3))) {
                i4 = i2;
                if (Character.isLowSurrogate(t2.charAt(i2))) {
                    i4 = i3;
                }
            }
            return (T) t2.subSequence(0, i4);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    private final void updateHoveredVirtualView(int i2) {
        int i3 = this.hoveredVirtualViewId;
        if (i3 == i2) {
            return;
        }
        this.hoveredVirtualViewId = i2;
        sendEventForVirtualView$default(this, i2, 128, null, null, 12, null);
        sendEventForVirtualView$default(this, i3, 256, null, null, 12, null);
    }

    private final void updateSemanticsNodesCopyAndPanes() {
        boolean hasPaneTitle;
        String str;
        boolean hasPaneTitle2;
        Iterator<Integer> it = this.paneDisplayed.iterator();
        while (it.hasNext()) {
            Integer id = it.next();
            SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes().get(id);
            SemanticsNode semanticsNode = semanticsNodeWithAdjustedBounds == null ? null : semanticsNodeWithAdjustedBounds.getSemanticsNode();
            if (semanticsNode != null) {
                hasPaneTitle2 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.hasPaneTitle(semanticsNode);
                if (!hasPaneTitle2) {
                }
            }
            this.paneDisplayed.remove(id);
            Intrinsics.checkNotNullExpressionValue(id, "id");
            int intValue = id.intValue();
            SemanticsNodeCopy semanticsNodeCopy = this.previousSemanticsNodes.get(id);
            if (semanticsNodeCopy == null) {
                str = null;
            } else {
                SemanticsConfiguration unmergedConfig = semanticsNodeCopy.getUnmergedConfig();
                str = unmergedConfig == null ? null : (String) SemanticsConfigurationKt.getOrNull(unmergedConfig, SemanticsProperties.INSTANCE.getPaneTitle());
            }
            sendPaneChangeEvents(intValue, 32, str);
        }
        this.previousSemanticsNodes.clear();
        for (Map.Entry<Integer, SemanticsNodeWithAdjustedBounds> entry : getCurrentSemanticsNodes().entrySet()) {
            hasPaneTitle = AndroidComposeViewAccessibilityDelegateCompat_androidKt.hasPaneTitle(entry.getValue().getSemanticsNode());
            if (hasPaneTitle && this.paneDisplayed.add(entry.getKey())) {
                sendPaneChangeEvents(entry.getKey().intValue(), 16, (String) entry.getValue().getSemanticsNode().getUnmergedConfig$ui_release().get(SemanticsProperties.INSTANCE.getPaneTitle()));
            }
            this.previousSemanticsNodes.put(entry.getKey(), new SemanticsNodeCopy(entry.getValue().getSemanticsNode(), getCurrentSemanticsNodes()));
        }
        this.previousSemanticsRoot = new SemanticsNodeCopy(this.view.getSemanticsOwner().getUnmergedRootSemanticsNode(), getCurrentSemanticsNodes());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x020b  */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:97:0x0205 -> B:31:0x00dd). Please submit an issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object boundsUpdatesEventLoop(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            Method dump skipped, instructions count: 545
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.boundsUpdatesEventLoop(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: canScroll-0AR0LA0$ui_release  reason: not valid java name */
    public final boolean m4148canScroll0AR0LA0$ui_release(boolean z, int i2, long j2) {
        return m4149canScrollmoWRBKg$ui_release(getCurrentSemanticsNodes().values(), z, i2, j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0112 A[SYNTHETIC] */
    @androidx.annotation.VisibleForTesting(otherwise = 2)
    /* renamed from: canScroll-moWRBKg$ui_release  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m4149canScrollmoWRBKg$ui_release(@org.jetbrains.annotations.NotNull java.util.Collection<androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds> r6, boolean r7, int r8, long r9) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.m4149canScrollmoWRBKg$ui_release(java.util.Collection, boolean, int, long):boolean");
    }

    @VisibleForTesting
    @NotNull
    public final AccessibilityEvent createEvent$ui_release(int i2, int i3) {
        boolean isPassword;
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i3);
        Intrinsics.checkNotNullExpressionValue(obtain, "obtain(eventType)");
        obtain.setEnabled(true);
        obtain.setClassName(ClassName);
        obtain.setPackageName(this.view.getContext().getPackageName());
        obtain.setSource(this.view, i2);
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes().get(Integer.valueOf(i2));
        if (semanticsNodeWithAdjustedBounds != null) {
            isPassword = AndroidComposeViewAccessibilityDelegateCompat_androidKt.isPassword(semanticsNodeWithAdjustedBounds.getSemanticsNode());
            obtain.setPassword(isPassword);
        }
        return obtain;
    }

    public final boolean dispatchHoverEvent(@NotNull MotionEvent event) {
        boolean dispatchGenericMotionEvent;
        Intrinsics.checkNotNullParameter(event, "event");
        if (isAccessibilityEnabled()) {
            int action = event.getAction();
            boolean z = true;
            if (action == 7 || action == 9) {
                int hitTestSemanticsAt$ui_release = hitTestSemanticsAt$ui_release(event.getX(), event.getY());
                boolean dispatchGenericMotionEvent2 = this.view.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(event);
                updateHoveredVirtualView(hitTestSemanticsAt$ui_release);
                if (hitTestSemanticsAt$ui_release == Integer.MIN_VALUE) {
                    z = dispatchGenericMotionEvent2;
                }
                return z;
            } else if (action != 10) {
                return false;
            } else {
                if (this.hoveredVirtualViewId != Integer.MIN_VALUE) {
                    updateHoveredVirtualView(Integer.MIN_VALUE);
                    dispatchGenericMotionEvent = true;
                } else {
                    dispatchGenericMotionEvent = this.view.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(event);
                }
                return dispatchGenericMotionEvent;
            }
        }
        return false;
    }

    public final boolean getAccessibilityForceEnabledForTesting$ui_release() {
        return this.accessibilityForceEnabledForTesting;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    @NotNull
    public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(@NotNull View host) {
        Intrinsics.checkNotNullParameter(host, "host");
        return this.nodeProvider;
    }

    public final int getHoveredVirtualViewId$ui_release() {
        return this.hoveredVirtualViewId;
    }

    @NotNull
    public final Map<Integer, SemanticsNodeCopy> getPreviousSemanticsNodes$ui_release() {
        return this.previousSemanticsNodes;
    }

    @NotNull
    public final AndroidComposeView getView() {
        return this.view;
    }

    @VisibleForTesting
    public final int hitTestSemanticsAt$ui_release(float f2, float f3) {
        Object lastOrNull;
        LayoutNode layoutNode$ui_release;
        SemanticsWrapper semanticsWrapper = null;
        Owner.DefaultImpls.measureAndLayout$default(this.view, false, 1, null);
        HitTestResult hitTestResult = new HitTestResult();
        LayoutNode.m4054hitTestSemanticsM_7yMNQ$ui_release$default(this.view.getRoot(), OffsetKt.Offset(f2, f3), hitTestResult, false, false, 12, null);
        lastOrNull = CollectionsKt___CollectionsKt.lastOrNull((List<? extends Object>) hitTestResult);
        SemanticsWrapper semanticsWrapper2 = (SemanticsWrapper) lastOrNull;
        if (semanticsWrapper2 != null && (layoutNode$ui_release = semanticsWrapper2.getLayoutNode$ui_release()) != null) {
            semanticsWrapper = SemanticsNodeKt.getOuterSemantics(layoutNode$ui_release);
        }
        int i2 = Integer.MIN_VALUE;
        if (semanticsWrapper != null) {
            SemanticsNode semanticsNode = new SemanticsNode(semanticsWrapper, false);
            SemanticsWrapper findWrapperToGetBounds$ui_release = semanticsNode.findWrapperToGetBounds$ui_release();
            i2 = Integer.MIN_VALUE;
            if (!semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getInvisibleToUser())) {
                i2 = Integer.MIN_VALUE;
                if (!findWrapperToGetBounds$ui_release.isTransparent()) {
                    i2 = Integer.MIN_VALUE;
                    if (this.view.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(semanticsWrapper.getLayoutNode$ui_release()) == null) {
                        i2 = semanticsNodeIdToAccessibilityVirtualNodeId(semanticsWrapper.getModifier().getId());
                    }
                }
            }
        }
        return i2;
    }

    public final void onLayoutChange$ui_release(@NotNull LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.currentSemanticsNodesInvalidated = true;
        if (isAccessibilityEnabled()) {
            notifySubtreeAccessibilityStateChangedIfNeeded(layoutNode);
        }
    }

    public final void onSemanticsChange$ui_release() {
        this.currentSemanticsNodesInvalidated = true;
        if (!isAccessibilityEnabled() || this.checkingForSemanticsChanges) {
            return;
        }
        this.checkingForSemanticsChanges = true;
        this.handler.post(this.semanticsChangeChecker);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0118, code lost:
        if (r10.getUnmergedConfig$ui_release().isMergingSemanticsOfDescendants() == false) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0966  */
    @androidx.annotation.VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void populateAccessibilityNodeInfoProperties(int r8, @org.jetbrains.annotations.NotNull androidx.core.view.accessibility.AccessibilityNodeInfoCompat r9, @org.jetbrains.annotations.NotNull androidx.compose.ui.semantics.SemanticsNode r10) {
        /*
            Method dump skipped, instructions count: 3528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.populateAccessibilityNodeInfoProperties(int, androidx.core.view.accessibility.AccessibilityNodeInfoCompat, androidx.compose.ui.semantics.SemanticsNode):void");
    }

    @VisibleForTesting
    public final void sendSemanticsPropertyChangeEvents$ui_release(@NotNull Map<Integer, SemanticsNodeWithAdjustedBounds> newSemanticsNodes) {
        boolean propertiesDeleted;
        boolean z;
        int semanticsNodeIdToAccessibilityVirtualNodeId;
        Integer num;
        String str;
        boolean isTextField;
        int coerceAtMost;
        String text;
        boolean accessibilityEquals;
        Intrinsics.checkNotNullParameter(newSemanticsNodes, "newSemanticsNodes");
        ArrayList arrayList = new ArrayList(this.scrollObservationScopes);
        this.scrollObservationScopes.clear();
        for (Integer num2 : newSemanticsNodes.keySet()) {
            int intValue = num2.intValue();
            SemanticsNodeCopy semanticsNodeCopy = this.previousSemanticsNodes.get(Integer.valueOf(intValue));
            if (semanticsNodeCopy != null) {
                SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = newSemanticsNodes.get(Integer.valueOf(intValue));
                SemanticsNode semanticsNode = semanticsNodeWithAdjustedBounds == null ? null : semanticsNodeWithAdjustedBounds.getSemanticsNode();
                Intrinsics.checkNotNull(semanticsNode);
                Iterator<Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object>> it = semanticsNode.getUnmergedConfig$ui_release().iterator();
                boolean z2 = false;
                while (true) {
                    boolean z3 = z2;
                    if (it.hasNext()) {
                        Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object> next = it.next();
                        SemanticsPropertyKey<?> key = next.getKey();
                        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
                        if (((Intrinsics.areEqual(key, semanticsProperties.getHorizontalScrollAxisRange()) || Intrinsics.areEqual(next.getKey(), semanticsProperties.getVerticalScrollAxisRange())) ? registerScrollingId(intValue, arrayList) : false) || !Intrinsics.areEqual(next.getValue(), SemanticsConfigurationKt.getOrNull(semanticsNodeCopy.getUnmergedConfig(), next.getKey()))) {
                            SemanticsPropertyKey<?> key2 = next.getKey();
                            if (Intrinsics.areEqual(key2, semanticsProperties.getPaneTitle())) {
                                Object value = next.getValue();
                                if (value == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                }
                                String str2 = (String) value;
                                z = z3;
                                if (semanticsNodeCopy.hasPaneTitle()) {
                                    sendPaneChangeEvents(intValue, 8, str2);
                                    z = z3;
                                }
                            } else {
                                if (Intrinsics.areEqual(key2, semanticsProperties.getStateDescription()) ? true : Intrinsics.areEqual(key2, semanticsProperties.getToggleableState())) {
                                    sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(intValue), 2048, 64, null, 8, null);
                                    semanticsNodeIdToAccessibilityVirtualNodeId = semanticsNodeIdToAccessibilityVirtualNodeId(intValue);
                                    num = 0;
                                } else {
                                    if (!Intrinsics.areEqual(key2, semanticsProperties.getProgressBarRangeInfo())) {
                                        if (Intrinsics.areEqual(key2, semanticsProperties.getSelected())) {
                                            Role role = (Role) SemanticsConfigurationKt.getOrNull(semanticsNode.getConfig(), semanticsProperties.getRole());
                                            if (role == null ? false : Role.m4310equalsimpl0(role.m4313unboximpl(), Role.Companion.m4319getTabo7Vup1c())) {
                                                if (Intrinsics.areEqual(SemanticsConfigurationKt.getOrNull(semanticsNode.getConfig(), semanticsProperties.getSelected()), Boolean.TRUE)) {
                                                    AccessibilityEvent createEvent$ui_release = createEvent$ui_release(semanticsNodeIdToAccessibilityVirtualNodeId(intValue), 4);
                                                    SemanticsNode semanticsNode2 = new SemanticsNode(semanticsNode.getOuterSemanticsNodeWrapper$ui_release(), true);
                                                    List list = (List) SemanticsConfigurationKt.getOrNull(semanticsNode2.getConfig(), semanticsProperties.getContentDescription());
                                                    String fastJoinToString$default = list == null ? null : TempListUtilsKt.fastJoinToString$default(list, ",", null, null, 0, null, null, 62, null);
                                                    List list2 = (List) SemanticsConfigurationKt.getOrNull(semanticsNode2.getConfig(), semanticsProperties.getText());
                                                    String fastJoinToString$default2 = list2 == null ? null : TempListUtilsKt.fastJoinToString$default(list2, ",", null, null, 0, null, null, 62, null);
                                                    if (fastJoinToString$default != null) {
                                                        createEvent$ui_release.setContentDescription(fastJoinToString$default);
                                                        Unit unit = Unit.INSTANCE;
                                                    }
                                                    if (fastJoinToString$default2 != null) {
                                                        createEvent$ui_release.getText().add(fastJoinToString$default2);
                                                    }
                                                    sendEvent(createEvent$ui_release);
                                                    z = z3;
                                                } else {
                                                    semanticsNodeIdToAccessibilityVirtualNodeId = semanticsNodeIdToAccessibilityVirtualNodeId(intValue);
                                                    num = 0;
                                                }
                                            }
                                        } else if (Intrinsics.areEqual(key2, semanticsProperties.getContentDescription())) {
                                            int semanticsNodeIdToAccessibilityVirtualNodeId2 = semanticsNodeIdToAccessibilityVirtualNodeId(intValue);
                                            Object value2 = next.getValue();
                                            if (value2 == null) {
                                                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                                            }
                                            sendEventForVirtualView(semanticsNodeIdToAccessibilityVirtualNodeId2, 2048, 4, (List) value2);
                                            z = z3;
                                        } else {
                                            str = "";
                                            if (Intrinsics.areEqual(key2, semanticsProperties.getEditableText())) {
                                                isTextField = AndroidComposeViewAccessibilityDelegateCompat_androidKt.isTextField(semanticsNode);
                                                if (isTextField) {
                                                    AnnotatedString textForTextField = getTextForTextField(semanticsNodeCopy.getUnmergedConfig());
                                                    AnnotatedString annotatedString = textForTextField;
                                                    if (textForTextField == null) {
                                                        annotatedString = "";
                                                    }
                                                    AnnotatedString textForTextField2 = getTextForTextField(semanticsNode.getUnmergedConfig$ui_release());
                                                    str = textForTextField2 != null ? textForTextField2 : "";
                                                    int length = annotatedString.length();
                                                    int length2 = str.length();
                                                    coerceAtMost = RangesKt___RangesKt.coerceAtMost(length, length2);
                                                    int i2 = 0;
                                                    while (i2 < coerceAtMost && annotatedString.charAt(i2) == str.charAt(i2)) {
                                                        i2++;
                                                    }
                                                    int i3 = 0;
                                                    while (i3 < coerceAtMost - i2 && annotatedString.charAt((length - 1) - i3) == str.charAt((length2 - 1) - i3)) {
                                                        i3++;
                                                    }
                                                    AccessibilityEvent createEvent$ui_release2 = createEvent$ui_release(semanticsNodeIdToAccessibilityVirtualNodeId(intValue), 16);
                                                    createEvent$ui_release2.setFromIndex(i2);
                                                    createEvent$ui_release2.setRemovedCount((length - i3) - i2);
                                                    createEvent$ui_release2.setAddedCount((length2 - i3) - i2);
                                                    createEvent$ui_release2.setBeforeText(annotatedString);
                                                    createEvent$ui_release2.getText().add(trimToSize(str, ParcelSafeTextLength));
                                                    sendEvent(createEvent$ui_release2);
                                                    z = z3;
                                                } else {
                                                    semanticsNodeIdToAccessibilityVirtualNodeId = semanticsNodeIdToAccessibilityVirtualNodeId(intValue);
                                                    num = 2;
                                                }
                                            } else if (Intrinsics.areEqual(key2, semanticsProperties.getTextSelectionRange())) {
                                                AnnotatedString textForTextField3 = getTextForTextField(semanticsNode.getUnmergedConfig$ui_release());
                                                if (textForTextField3 != null && (text = textForTextField3.getText()) != null) {
                                                    str = text;
                                                }
                                                long m4479unboximpl = ((TextRange) semanticsNode.getUnmergedConfig$ui_release().get(semanticsProperties.getTextSelectionRange())).m4479unboximpl();
                                                sendEvent(createTextSelectionChangedEvent(semanticsNodeIdToAccessibilityVirtualNodeId(intValue), Integer.valueOf(TextRange.m4475getStartimpl(m4479unboximpl)), Integer.valueOf(TextRange.m4470getEndimpl(m4479unboximpl)), Integer.valueOf(str.length()), (String) trimToSize(str, ParcelSafeTextLength)));
                                                sendPendingTextTraversedAtGranularityEvent(semanticsNode.getId());
                                                z = z3;
                                            } else if (Intrinsics.areEqual(key2, semanticsProperties.getHorizontalScrollAxisRange()) ? true : Intrinsics.areEqual(key2, semanticsProperties.getVerticalScrollAxisRange())) {
                                                notifySubtreeAccessibilityStateChangedIfNeeded(semanticsNode.getLayoutNode$ui_release());
                                                ScrollObservationScope findById = AndroidComposeViewAccessibilityDelegateCompat_androidKt.findById(this.scrollObservationScopes, intValue);
                                                Intrinsics.checkNotNull(findById);
                                                findById.setHorizontalScrollAxisRange((ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties.getHorizontalScrollAxisRange()));
                                                findById.setVerticalScrollAxisRange((ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), semanticsProperties.getVerticalScrollAxisRange()));
                                                sendScrollEventIfNeeded(findById);
                                                z = z3;
                                            } else if (Intrinsics.areEqual(key2, semanticsProperties.getFocused())) {
                                                Object value3 = next.getValue();
                                                if (value3 == null) {
                                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                                                }
                                                if (((Boolean) value3).booleanValue()) {
                                                    sendEvent(createEvent$ui_release(semanticsNodeIdToAccessibilityVirtualNodeId(semanticsNode.getId()), 8));
                                                }
                                                semanticsNodeIdToAccessibilityVirtualNodeId = semanticsNodeIdToAccessibilityVirtualNodeId(semanticsNode.getId());
                                                num = 0;
                                            } else {
                                                SemanticsActions semanticsActions = SemanticsActions.INSTANCE;
                                                if (Intrinsics.areEqual(key2, semanticsActions.getCustomActions())) {
                                                    List list3 = (List) semanticsNode.getUnmergedConfig$ui_release().get(semanticsActions.getCustomActions());
                                                    List list4 = (List) SemanticsConfigurationKt.getOrNull(semanticsNodeCopy.getUnmergedConfig(), semanticsActions.getCustomActions());
                                                    if (list4 != null) {
                                                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                                                        int size = list3.size();
                                                        for (int i4 = 0; i4 < size; i4++) {
                                                            linkedHashSet.add(((CustomAccessibilityAction) list3.get(i4)).getLabel());
                                                        }
                                                        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                                                        int size2 = list4.size();
                                                        for (int i5 = 0; i5 < size2; i5++) {
                                                            linkedHashSet2.add(((CustomAccessibilityAction) list4.get(i5)).getLabel());
                                                        }
                                                        z = (linkedHashSet.containsAll(linkedHashSet2) && linkedHashSet2.containsAll(linkedHashSet)) ? false : true;
                                                    } else {
                                                        z = z3;
                                                        if (!list3.isEmpty()) {
                                                            z2 = true;
                                                        }
                                                    }
                                                } else if (next.getValue() instanceof AccessibilityAction) {
                                                    Object value4 = next.getValue();
                                                    if (value4 == null) {
                                                        throw new NullPointerException("null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                                                    }
                                                    accessibilityEquals = AndroidComposeViewAccessibilityDelegateCompat_androidKt.accessibilityEquals((AccessibilityAction) value4, SemanticsConfigurationKt.getOrNull(semanticsNodeCopy.getUnmergedConfig(), next.getKey()));
                                                    z2 = !accessibilityEquals;
                                                } else {
                                                    z2 = true;
                                                }
                                            }
                                        }
                                    }
                                    sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(intValue), 2048, 64, null, 8, null);
                                    semanticsNodeIdToAccessibilityVirtualNodeId = semanticsNodeIdToAccessibilityVirtualNodeId(intValue);
                                    num = 0;
                                }
                                sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId, 2048, num, null, 8, null);
                                z = z3;
                            }
                        } else {
                            z = z3;
                        }
                        z2 = z;
                    } else {
                        boolean z4 = z3;
                        if (!z3) {
                            propertiesDeleted = AndroidComposeViewAccessibilityDelegateCompat_androidKt.propertiesDeleted(semanticsNode, semanticsNodeCopy);
                            z4 = propertiesDeleted;
                        }
                        if (z4) {
                            sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(intValue), 2048, 0, null, 8, null);
                        }
                    }
                }
            }
        }
    }

    public final void setAccessibilityForceEnabledForTesting$ui_release(boolean z) {
        this.accessibilityForceEnabledForTesting = z;
    }

    public final void setHoveredVirtualViewId$ui_release(int i2) {
        this.hoveredVirtualViewId = i2;
    }

    public final void setPreviousSemanticsNodes$ui_release(@NotNull Map<Integer, SemanticsNodeCopy> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.previousSemanticsNodes = map;
    }
}

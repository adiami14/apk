package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import androidx.core.app.SharedElementCallback;
import androidx.core.os.CancellationSignal;
import androidx.core.util.Preconditions;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewGroupCompat;
import androidx.fragment.app.FragmentAnim;
import androidx.fragment.app.SpecialEffectsController;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: ItsOnFire.jar:androidx/fragment/app/DefaultSpecialEffectsController.class */
class DefaultSpecialEffectsController extends SpecialEffectsController {

    /* renamed from: androidx.fragment.app.DefaultSpecialEffectsController$10  reason: invalid class name */
    /* loaded from: ItsOnFire.jar:androidx/fragment/app/DefaultSpecialEffectsController$10.class */
    public static /* synthetic */ class AnonymousClass10 {
        public static final /* synthetic */ int[] $SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State;

        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0036 -> B:21:0x0014). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x003a -> B:19:0x001f). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x003e -> B:25:0x002a). Please submit an issue!!! */
        static {
            int[] iArr = new int[SpecialEffectsController.Operation.State.values().length];
            $SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State = iArr;
            try {
                iArr[SpecialEffectsController.Operation.State.GONE.ordinal()] = 1;
            } catch (NoSuchFieldError e2) {
            }
            try {
                $SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State[SpecialEffectsController.Operation.State.INVISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError e3) {
            }
            try {
                $SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State[SpecialEffectsController.Operation.State.REMOVED.ordinal()] = 3;
            } catch (NoSuchFieldError e4) {
            }
            try {
                $SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State[SpecialEffectsController.Operation.State.VISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError e5) {
            }
        }
    }

    /* loaded from: ItsOnFire.jar:androidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo.class */
    public static class AnimationInfo extends SpecialEffectsInfo {
        @Nullable
        private FragmentAnim.AnimationOrAnimator mAnimation;
        private boolean mIsPop;
        private boolean mLoadedAnim;

        public AnimationInfo(@NonNull SpecialEffectsController.Operation operation, @NonNull CancellationSignal cancellationSignal, boolean z) {
            super(operation, cancellationSignal);
            this.mLoadedAnim = false;
            this.mIsPop = z;
        }

        @Nullable
        public FragmentAnim.AnimationOrAnimator getAnimation(@NonNull Context context) {
            if (this.mLoadedAnim) {
                return this.mAnimation;
            }
            FragmentAnim.AnimationOrAnimator loadAnimation = FragmentAnim.loadAnimation(context, getOperation().getFragment(), getOperation().getFinalState() == SpecialEffectsController.Operation.State.VISIBLE, this.mIsPop);
            this.mAnimation = loadAnimation;
            this.mLoadedAnim = true;
            return loadAnimation;
        }
    }

    /* loaded from: ItsOnFire.jar:androidx/fragment/app/DefaultSpecialEffectsController$SpecialEffectsInfo.class */
    public static class SpecialEffectsInfo {
        @NonNull
        private final SpecialEffectsController.Operation mOperation;
        @NonNull
        private final CancellationSignal mSignal;

        public SpecialEffectsInfo(@NonNull SpecialEffectsController.Operation operation, @NonNull CancellationSignal cancellationSignal) {
            this.mOperation = operation;
            this.mSignal = cancellationSignal;
        }

        public void completeSpecialEffect() {
            this.mOperation.completeSpecialEffect(this.mSignal);
        }

        @NonNull
        public SpecialEffectsController.Operation getOperation() {
            return this.mOperation;
        }

        @NonNull
        public CancellationSignal getSignal() {
            return this.mSignal;
        }

        public boolean isVisibilityUnchanged() {
            SpecialEffectsController.Operation.State state;
            SpecialEffectsController.Operation.State from = SpecialEffectsController.Operation.State.from(this.mOperation.getFragment().mView);
            SpecialEffectsController.Operation.State finalState = this.mOperation.getFinalState();
            return from == finalState || !(from == (state = SpecialEffectsController.Operation.State.VISIBLE) || finalState == state);
        }
    }

    /* loaded from: ItsOnFire.jar:androidx/fragment/app/DefaultSpecialEffectsController$TransitionInfo.class */
    public static class TransitionInfo extends SpecialEffectsInfo {
        private final boolean mOverlapAllowed;
        @Nullable
        private final Object mSharedElementTransition;
        @Nullable
        private final Object mTransition;

        public TransitionInfo(@NonNull SpecialEffectsController.Operation operation, @NonNull CancellationSignal cancellationSignal, boolean z, boolean z2) {
            super(operation, cancellationSignal);
            boolean z3;
            Object obj;
            if (operation.getFinalState() == SpecialEffectsController.Operation.State.VISIBLE) {
                Fragment fragment = operation.getFragment();
                this.mTransition = z ? fragment.getReenterTransition() : fragment.getEnterTransition();
                Fragment fragment2 = operation.getFragment();
                z3 = z ? fragment2.getAllowReturnTransitionOverlap() : fragment2.getAllowEnterTransitionOverlap();
            } else {
                Fragment fragment3 = operation.getFragment();
                this.mTransition = z ? fragment3.getReturnTransition() : fragment3.getExitTransition();
                z3 = true;
            }
            this.mOverlapAllowed = z3;
            if (z2) {
                Fragment fragment4 = operation.getFragment();
                obj = z ? fragment4.getSharedElementReturnTransition() : fragment4.getSharedElementEnterTransition();
            } else {
                obj = null;
            }
            this.mSharedElementTransition = obj;
        }

        @Nullable
        private FragmentTransitionImpl getHandlingImpl(Object obj) {
            if (obj == null) {
                return null;
            }
            FragmentTransitionImpl fragmentTransitionImpl = FragmentTransition.PLATFORM_IMPL;
            if (fragmentTransitionImpl == null || !fragmentTransitionImpl.canHandle(obj)) {
                FragmentTransitionImpl fragmentTransitionImpl2 = FragmentTransition.SUPPORT_IMPL;
                if (fragmentTransitionImpl2 == null || !fragmentTransitionImpl2.canHandle(obj)) {
                    throw new IllegalArgumentException("Transition " + obj + " for fragment " + getOperation().getFragment() + " is not a valid framework Transition or AndroidX Transition");
                }
                return fragmentTransitionImpl2;
            }
            return fragmentTransitionImpl;
        }

        @Nullable
        public FragmentTransitionImpl getHandlingImpl() {
            FragmentTransitionImpl handlingImpl = getHandlingImpl(this.mTransition);
            FragmentTransitionImpl handlingImpl2 = getHandlingImpl(this.mSharedElementTransition);
            if (handlingImpl == null || handlingImpl2 == null || handlingImpl == handlingImpl2) {
                if (handlingImpl == null) {
                    handlingImpl = handlingImpl2;
                }
                return handlingImpl;
            }
            throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + getOperation().getFragment() + " returned Transition " + this.mTransition + " which uses a different Transition  type than its shared element transition " + this.mSharedElementTransition);
        }

        @Nullable
        public Object getSharedElementTransition() {
            return this.mSharedElementTransition;
        }

        @Nullable
        public Object getTransition() {
            return this.mTransition;
        }

        public boolean hasSharedElementTransition() {
            return this.mSharedElementTransition != null;
        }

        public boolean isOverlapAllowed() {
            return this.mOverlapAllowed;
        }
    }

    public DefaultSpecialEffectsController(@NonNull ViewGroup viewGroup) {
        super(viewGroup);
    }

    private void startAnimations(@NonNull List<AnimationInfo> list, @NonNull List<SpecialEffectsController.Operation> list2, boolean z, @NonNull Map<SpecialEffectsController.Operation, Boolean> map) {
        StringBuilder sb;
        String str;
        FragmentAnim.AnimationOrAnimator animation;
        final ViewGroup container = getContainer();
        Context context = container.getContext();
        ArrayList arrayList = new ArrayList();
        boolean z2 = false;
        for (final AnimationInfo animationInfo : list) {
            if (animationInfo.isVisibilityUnchanged() || (animation = animationInfo.getAnimation(context)) == null) {
                animationInfo.completeSpecialEffect();
            } else {
                final Animator animator = animation.animator;
                if (animator == null) {
                    arrayList.add(animationInfo);
                } else {
                    final SpecialEffectsController.Operation operation = animationInfo.getOperation();
                    Fragment fragment = operation.getFragment();
                    if (Boolean.TRUE.equals(map.get(operation))) {
                        if (FragmentManager.isLoggingEnabled(2)) {
                            Log.v(FragmentManager.TAG, "Ignoring Animator set on " + fragment + " as this Fragment was involved in a Transition.");
                        }
                        animationInfo.completeSpecialEffect();
                    } else {
                        boolean z3 = operation.getFinalState() == SpecialEffectsController.Operation.State.GONE;
                        if (z3) {
                            list2.remove(operation);
                        }
                        final View view = fragment.mView;
                        container.startViewTransition(view);
                        final boolean z4 = z3;
                        animator.addListener(new AnimatorListenerAdapter() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.2
                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public void onAnimationEnd(Animator animator2) {
                                container.endViewTransition(view);
                                if (z4) {
                                    operation.getFinalState().applyState(view);
                                }
                                animationInfo.completeSpecialEffect();
                            }
                        });
                        animator.setTarget(view);
                        animator.start();
                        animationInfo.getSignal().setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.3
                            @Override // androidx.core.os.CancellationSignal.OnCancelListener
                            public void onCancel() {
                                animator.end();
                            }
                        });
                        z2 = true;
                    }
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            final AnimationInfo animationInfo2 = (AnimationInfo) it.next();
            SpecialEffectsController.Operation operation2 = animationInfo2.getOperation();
            Fragment fragment2 = operation2.getFragment();
            if (z) {
                if (FragmentManager.isLoggingEnabled(2)) {
                    sb = new StringBuilder();
                    sb.append("Ignoring Animation set on ");
                    sb.append(fragment2);
                    str = " as Animations cannot run alongside Transitions.";
                    sb.append(str);
                    Log.v(FragmentManager.TAG, sb.toString());
                }
                animationInfo2.completeSpecialEffect();
            } else if (z2) {
                if (FragmentManager.isLoggingEnabled(2)) {
                    sb = new StringBuilder();
                    sb.append("Ignoring Animation set on ");
                    sb.append(fragment2);
                    str = " as Animations cannot run alongside Animators.";
                    sb.append(str);
                    Log.v(FragmentManager.TAG, sb.toString());
                }
                animationInfo2.completeSpecialEffect();
            } else {
                final View view2 = fragment2.mView;
                Animation animation2 = (Animation) Preconditions.checkNotNull(((FragmentAnim.AnimationOrAnimator) Preconditions.checkNotNull(animationInfo2.getAnimation(context))).animation);
                if (operation2.getFinalState() != SpecialEffectsController.Operation.State.REMOVED) {
                    view2.startAnimation(animation2);
                    animationInfo2.completeSpecialEffect();
                } else {
                    container.startViewTransition(view2);
                    FragmentAnim.EndViewTransitionAnimation endViewTransitionAnimation = new FragmentAnim.EndViewTransitionAnimation(animation2, container, view2);
                    endViewTransitionAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.4
                        @Override // android.view.animation.Animation.AnimationListener
                        public void onAnimationEnd(Animation animation3) {
                            container.post(new Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.4.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                                    container.endViewTransition(view2);
                                    animationInfo2.completeSpecialEffect();
                                }
                            });
                        }

                        @Override // android.view.animation.Animation.AnimationListener
                        public void onAnimationRepeat(Animation animation3) {
                        }

                        @Override // android.view.animation.Animation.AnimationListener
                        public void onAnimationStart(Animation animation3) {
                        }
                    });
                    view2.startAnimation(endViewTransitionAnimation);
                }
                animationInfo2.getSignal().setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.5
                    @Override // androidx.core.os.CancellationSignal.OnCancelListener
                    public void onCancel() {
                        view2.clearAnimation();
                        container.endViewTransition(view2);
                        animationInfo2.completeSpecialEffect();
                    }
                });
            }
        }
    }

    @NonNull
    private Map<SpecialEffectsController.Operation, Boolean> startTransitions(@NonNull List<TransitionInfo> list, @NonNull List<SpecialEffectsController.Operation> list2, final boolean z, @Nullable final SpecialEffectsController.Operation operation, @Nullable final SpecialEffectsController.Operation operation2) {
        View view;
        SpecialEffectsController.Operation operation3;
        View view2;
        DefaultSpecialEffectsController defaultSpecialEffectsController;
        SpecialEffectsController.Operation operation4;
        SharedElementCallback enterTransitionCallback;
        SharedElementCallback exitTransitionCallback;
        final View view3;
        String findKeyForValue;
        DefaultSpecialEffectsController defaultSpecialEffectsController2 = this;
        SpecialEffectsController.Operation operation5 = operation;
        SpecialEffectsController.Operation operation6 = operation2;
        HashMap hashMap = new HashMap();
        FragmentTransitionImpl fragmentTransitionImpl = null;
        for (TransitionInfo transitionInfo : list) {
            if (!transitionInfo.isVisibilityUnchanged()) {
                FragmentTransitionImpl handlingImpl = transitionInfo.getHandlingImpl();
                if (fragmentTransitionImpl == null) {
                    fragmentTransitionImpl = handlingImpl;
                } else if (handlingImpl != null && fragmentTransitionImpl != handlingImpl) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + transitionInfo.getOperation().getFragment() + " returned Transition " + transitionInfo.getTransition() + " which uses a different Transition  type than other Fragments.");
                }
            }
        }
        if (fragmentTransitionImpl == null) {
            for (TransitionInfo transitionInfo2 : list) {
                hashMap.put(transitionInfo2.getOperation(), Boolean.FALSE);
                transitionInfo2.completeSpecialEffect();
            }
            return hashMap;
        }
        View view4 = new View(getContainer().getContext());
        final Rect rect = new Rect();
        ArrayList<View> arrayList = new ArrayList<>();
        ArrayList<View> arrayList2 = new ArrayList<>();
        ArrayMap arrayMap = new ArrayMap();
        Iterator<TransitionInfo> it = list.iterator();
        Object obj = null;
        View view5 = null;
        boolean z2 = false;
        final FragmentTransitionImpl fragmentTransitionImpl2 = fragmentTransitionImpl;
        while (true) {
            view = view4;
            if (!it.hasNext()) {
                break;
            }
            TransitionInfo next = it.next();
            if (!next.hasSharedElementTransition() || operation5 == null || operation6 == null) {
                DefaultSpecialEffectsController defaultSpecialEffectsController3 = defaultSpecialEffectsController2;
                SpecialEffectsController.Operation operation7 = operation5;
                operation3 = operation6;
                view2 = view;
                defaultSpecialEffectsController = defaultSpecialEffectsController3;
                operation4 = operation7;
            } else {
                Object wrapTransitionInSet = fragmentTransitionImpl2.wrapTransitionInSet(fragmentTransitionImpl2.cloneTransition(next.getSharedElementTransition()));
                ArrayList<String> sharedElementSourceNames = operation2.getFragment().getSharedElementSourceNames();
                ArrayList<String> sharedElementSourceNames2 = operation.getFragment().getSharedElementSourceNames();
                ArrayList<String> sharedElementTargetNames = operation.getFragment().getSharedElementTargetNames();
                for (int i2 = 0; i2 < sharedElementTargetNames.size(); i2++) {
                    int indexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i2));
                    if (indexOf != -1) {
                        sharedElementSourceNames.set(indexOf, sharedElementSourceNames2.get(i2));
                    }
                }
                ArrayList<String> sharedElementTargetNames2 = operation2.getFragment().getSharedElementTargetNames();
                Fragment fragment = operation.getFragment();
                if (z) {
                    enterTransitionCallback = fragment.getEnterTransitionCallback();
                    exitTransitionCallback = operation2.getFragment().getExitTransitionCallback();
                } else {
                    enterTransitionCallback = fragment.getExitTransitionCallback();
                    exitTransitionCallback = operation2.getFragment().getEnterTransitionCallback();
                }
                int size = sharedElementSourceNames.size();
                for (int i3 = 0; i3 < size; i3++) {
                    arrayMap.put(sharedElementSourceNames.get(i3), sharedElementTargetNames2.get(i3));
                }
                ArrayMap<String, View> arrayMap2 = new ArrayMap<>();
                defaultSpecialEffectsController2.findNamedViews(arrayMap2, operation.getFragment().mView);
                arrayMap2.retainAll(sharedElementSourceNames);
                if (enterTransitionCallback != null) {
                    enterTransitionCallback.onMapSharedElements(sharedElementSourceNames, arrayMap2);
                    for (int size2 = sharedElementSourceNames.size() - 1; size2 >= 0; size2--) {
                        String str = sharedElementSourceNames.get(size2);
                        View view6 = arrayMap2.get(str);
                        if (view6 == null) {
                            arrayMap.remove(str);
                        } else if (!str.equals(ViewCompat.getTransitionName(view6))) {
                            arrayMap.put(ViewCompat.getTransitionName(view6), (String) arrayMap.remove(str));
                        }
                    }
                } else {
                    arrayMap.retainAll(arrayMap2.keySet());
                }
                final ArrayMap<String, View> arrayMap3 = new ArrayMap<>();
                defaultSpecialEffectsController2.findNamedViews(arrayMap3, operation2.getFragment().mView);
                arrayMap3.retainAll(sharedElementTargetNames2);
                arrayMap3.retainAll(arrayMap.values());
                if (exitTransitionCallback != null) {
                    exitTransitionCallback.onMapSharedElements(sharedElementTargetNames2, arrayMap3);
                    for (int size3 = sharedElementTargetNames2.size() - 1; size3 >= 0; size3--) {
                        String str2 = sharedElementTargetNames2.get(size3);
                        View view7 = arrayMap3.get(str2);
                        if (view7 == null) {
                            String findKeyForValue2 = FragmentTransition.findKeyForValue(arrayMap, str2);
                            if (findKeyForValue2 != null) {
                                arrayMap.remove(findKeyForValue2);
                            }
                        } else if (!str2.equals(ViewCompat.getTransitionName(view7)) && (findKeyForValue = FragmentTransition.findKeyForValue(arrayMap, str2)) != null) {
                            arrayMap.put(findKeyForValue, ViewCompat.getTransitionName(view7));
                        }
                    }
                } else {
                    FragmentTransition.retainValues(arrayMap, arrayMap3);
                }
                defaultSpecialEffectsController2.retainMatchingViews(arrayMap2, arrayMap.keySet());
                defaultSpecialEffectsController2.retainMatchingViews(arrayMap3, arrayMap.values());
                if (arrayMap.isEmpty()) {
                    arrayList.clear();
                    arrayList2.clear();
                    defaultSpecialEffectsController = defaultSpecialEffectsController2;
                    view2 = view;
                    obj = null;
                    operation3 = operation2;
                    operation4 = operation;
                } else {
                    FragmentTransition.callSharedElementStartEnd(operation2.getFragment(), operation.getFragment(), z, arrayMap2, true);
                    OneShotPreDrawListener.add(getContainer(), new Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.6
                        @Override // java.lang.Runnable
                        public void run() {
                            FragmentTransition.callSharedElementStartEnd(operation2.getFragment(), operation.getFragment(), z, arrayMap3, false);
                        }
                    });
                    arrayList.addAll(arrayMap2.values());
                    if (!sharedElementSourceNames.isEmpty()) {
                        view5 = arrayMap2.get(sharedElementSourceNames.get(0));
                        fragmentTransitionImpl2.setEpicenter(wrapTransitionInSet, view5);
                    }
                    arrayList2.addAll(arrayMap3.values());
                    if (!sharedElementTargetNames2.isEmpty() && (view3 = arrayMap3.get(sharedElementTargetNames2.get(0))) != null) {
                        OneShotPreDrawListener.add(getContainer(), new Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.7
                            @Override // java.lang.Runnable
                            public void run() {
                                fragmentTransitionImpl2.getBoundsOnScreen(view3, rect);
                            }
                        });
                        z2 = true;
                    }
                    defaultSpecialEffectsController = this;
                    fragmentTransitionImpl2.setSharedElementTargets(wrapTransitionInSet, view, arrayList);
                    view2 = view;
                    fragmentTransitionImpl2.scheduleRemoveTargets(wrapTransitionInSet, null, null, null, null, wrapTransitionInSet, arrayList2);
                    Boolean bool = Boolean.TRUE;
                    operation4 = operation;
                    hashMap.put(operation4, bool);
                    operation3 = operation2;
                    hashMap.put(operation3, bool);
                    obj = wrapTransitionInSet;
                }
            }
            view4 = view2;
            SpecialEffectsController.Operation operation8 = operation3;
            defaultSpecialEffectsController2 = defaultSpecialEffectsController;
            operation5 = operation4;
            operation6 = operation8;
            arrayList = arrayList;
        }
        ArrayList<View> arrayList3 = arrayList;
        SpecialEffectsController.Operation operation9 = operation6;
        ArrayList arrayList4 = new ArrayList();
        Object obj2 = null;
        View view8 = view5;
        Object obj3 = null;
        for (TransitionInfo transitionInfo3 : list) {
            if (transitionInfo3.isVisibilityUnchanged()) {
                hashMap.put(transitionInfo3.getOperation(), Boolean.FALSE);
                transitionInfo3.completeSpecialEffect();
            } else {
                Object cloneTransition = fragmentTransitionImpl2.cloneTransition(transitionInfo3.getTransition());
                SpecialEffectsController.Operation operation10 = transitionInfo3.getOperation();
                boolean z3 = obj != null && (operation10 == operation5 || operation10 == operation9);
                if (cloneTransition != null) {
                    final ArrayList<View> arrayList5 = new ArrayList<>();
                    defaultSpecialEffectsController2.captureTransitioningViews(arrayList5, operation10.getFragment().mView);
                    if (z3) {
                        if (operation10 == operation5) {
                            arrayList5.removeAll(arrayList3);
                        } else {
                            arrayList5.removeAll(arrayList2);
                        }
                    }
                    if (arrayList5.isEmpty()) {
                        fragmentTransitionImpl2.addTarget(cloneTransition, view);
                    } else {
                        fragmentTransitionImpl2.addTargets(cloneTransition, arrayList5);
                        fragmentTransitionImpl2.scheduleRemoveTargets(cloneTransition, cloneTransition, arrayList5, null, null, null, null);
                        if (operation10.getFinalState() == SpecialEffectsController.Operation.State.GONE) {
                            list2.remove(operation10);
                            ArrayList<View> arrayList6 = new ArrayList<>(arrayList5);
                            arrayList6.remove(operation10.getFragment().mView);
                            fragmentTransitionImpl2.scheduleHideFragmentView(cloneTransition, operation10.getFragment().mView, arrayList6);
                            OneShotPreDrawListener.add(getContainer(), new Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.8
                                @Override // java.lang.Runnable
                                public void run() {
                                    FragmentTransition.setViewVisibility(arrayList5, 4);
                                }
                            });
                        }
                    }
                    if (operation10.getFinalState() == SpecialEffectsController.Operation.State.VISIBLE) {
                        arrayList4.addAll(arrayList5);
                        if (z2) {
                            fragmentTransitionImpl2.setEpicenter(cloneTransition, rect);
                        }
                    } else {
                        fragmentTransitionImpl2.setEpicenter(cloneTransition, view8);
                    }
                    hashMap.put(operation10, Boolean.TRUE);
                    if (transitionInfo3.isOverlapAllowed()) {
                        obj2 = fragmentTransitionImpl2.mergeTransitionsTogether(obj2, cloneTransition, null);
                    } else {
                        obj3 = fragmentTransitionImpl2.mergeTransitionsTogether(obj3, cloneTransition, null);
                    }
                } else if (!z3) {
                    hashMap.put(operation10, Boolean.FALSE);
                    transitionInfo3.completeSpecialEffect();
                }
            }
        }
        Object mergeTransitionsInSequence = fragmentTransitionImpl2.mergeTransitionsInSequence(obj2, obj3, obj);
        for (final TransitionInfo transitionInfo4 : list) {
            if (!transitionInfo4.isVisibilityUnchanged()) {
                Object transition = transitionInfo4.getTransition();
                SpecialEffectsController.Operation operation11 = transitionInfo4.getOperation();
                boolean z4 = obj != null && (operation11 == operation5 || operation11 == operation9);
                if (transition != null || z4) {
                    if (ViewCompat.isLaidOut(getContainer())) {
                        fragmentTransitionImpl2.setListenerForTransitionEnd(transitionInfo4.getOperation().getFragment(), mergeTransitionsInSequence, transitionInfo4.getSignal(), new Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.9
                            @Override // java.lang.Runnable
                            public void run() {
                                transitionInfo4.completeSpecialEffect();
                            }
                        });
                    } else {
                        if (FragmentManager.isLoggingEnabled(2)) {
                            Log.v(FragmentManager.TAG, "SpecialEffectsController: Container " + getContainer() + " has not been laid out. Completing operation " + operation11);
                        }
                        transitionInfo4.completeSpecialEffect();
                    }
                }
            }
        }
        if (ViewCompat.isLaidOut(getContainer())) {
            FragmentTransition.setViewVisibility(arrayList4, 4);
            ArrayList<String> prepareSetNameOverridesReordered = fragmentTransitionImpl2.prepareSetNameOverridesReordered(arrayList2);
            fragmentTransitionImpl2.beginDelayedTransition(getContainer(), mergeTransitionsInSequence);
            fragmentTransitionImpl2.setNameOverridesReordered(getContainer(), arrayList3, arrayList2, prepareSetNameOverridesReordered, arrayMap);
            FragmentTransition.setViewVisibility(arrayList4, 0);
            fragmentTransitionImpl2.swapSharedElementTargets(obj, arrayList3, arrayList2);
            return hashMap;
        }
        return hashMap;
    }

    public void applyContainerChanges(@NonNull SpecialEffectsController.Operation operation) {
        operation.getFinalState().applyState(operation.getFragment().mView);
    }

    public void captureTransitioningViews(ArrayList<View> arrayList, View view) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (ViewGroupCompat.isTransitionGroup(viewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt.getVisibility() == 0) {
                captureTransitioningViews(arrayList, childAt);
            }
        }
    }

    @Override // androidx.fragment.app.SpecialEffectsController
    public void executeOperations(@NonNull List<SpecialEffectsController.Operation> list, boolean z) {
        SpecialEffectsController.Operation operation = null;
        SpecialEffectsController.Operation operation2 = null;
        for (SpecialEffectsController.Operation operation3 : list) {
            SpecialEffectsController.Operation.State from = SpecialEffectsController.Operation.State.from(operation3.getFragment().mView);
            int i2 = AnonymousClass10.$SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State[operation3.getFinalState().ordinal()];
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                if (from == SpecialEffectsController.Operation.State.VISIBLE && operation == null) {
                    operation = operation3;
                }
            } else if (i2 == 4 && from != SpecialEffectsController.Operation.State.VISIBLE) {
                operation2 = operation3;
            }
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        final ArrayList<SpecialEffectsController.Operation> arrayList3 = new ArrayList(list);
        for (final SpecialEffectsController.Operation operation4 : list) {
            CancellationSignal cancellationSignal = new CancellationSignal();
            operation4.markStartedSpecialEffect(cancellationSignal);
            arrayList.add(new AnimationInfo(operation4, cancellationSignal, z));
            CancellationSignal cancellationSignal2 = new CancellationSignal();
            operation4.markStartedSpecialEffect(cancellationSignal2);
            boolean z2 = false;
            if (z) {
                if (operation4 != operation) {
                    arrayList2.add(new TransitionInfo(operation4, cancellationSignal2, z, z2));
                    operation4.addCompletionListener(new Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (arrayList3.contains(operation4)) {
                                arrayList3.remove(operation4);
                                DefaultSpecialEffectsController.this.applyContainerChanges(operation4);
                            }
                        }
                    });
                }
                z2 = true;
                arrayList2.add(new TransitionInfo(operation4, cancellationSignal2, z, z2));
                operation4.addCompletionListener(new Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (arrayList3.contains(operation4)) {
                            arrayList3.remove(operation4);
                            DefaultSpecialEffectsController.this.applyContainerChanges(operation4);
                        }
                    }
                });
            } else {
                if (operation4 != operation2) {
                    arrayList2.add(new TransitionInfo(operation4, cancellationSignal2, z, z2));
                    operation4.addCompletionListener(new Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (arrayList3.contains(operation4)) {
                                arrayList3.remove(operation4);
                                DefaultSpecialEffectsController.this.applyContainerChanges(operation4);
                            }
                        }
                    });
                }
                z2 = true;
                arrayList2.add(new TransitionInfo(operation4, cancellationSignal2, z, z2));
                operation4.addCompletionListener(new Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (arrayList3.contains(operation4)) {
                            arrayList3.remove(operation4);
                            DefaultSpecialEffectsController.this.applyContainerChanges(operation4);
                        }
                    }
                });
            }
        }
        Map<SpecialEffectsController.Operation, Boolean> startTransitions = startTransitions(arrayList2, arrayList3, z, operation, operation2);
        startAnimations(arrayList, arrayList3, startTransitions.containsValue(Boolean.TRUE), startTransitions);
        for (SpecialEffectsController.Operation operation5 : arrayList3) {
            applyContainerChanges(operation5);
        }
        arrayList3.clear();
    }

    public void findNamedViews(Map<String, View> map, @NonNull View view) {
        String transitionName = ViewCompat.getTransitionName(view);
        if (transitionName != null) {
            map.put(transitionName, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt.getVisibility() == 0) {
                    findNamedViews(map, childAt);
                }
            }
        }
    }

    public void retainMatchingViews(@NonNull ArrayMap<String, View> arrayMap, @NonNull Collection<String> collection) {
        Iterator<Map.Entry<String, View>> it = arrayMap.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(ViewCompat.getTransitionName(it.next().getValue()))) {
                it.remove();
            }
        }
    }
}

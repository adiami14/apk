package androidx.fragment.app;

import android.content.Context;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import androidx.core.app.SharedElementCallback;
import androidx.core.os.CancellationSignal;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: ItsOnFire.jar:androidx/fragment/app/FragmentTransition.class */
public class FragmentTransition {
    private static final int[] INVERSE_OPS = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};
    public static final FragmentTransitionImpl PLATFORM_IMPL = new FragmentTransitionCompat21();
    public static final FragmentTransitionImpl SUPPORT_IMPL = resolveSupportImpl();

    /* loaded from: ItsOnFire.jar:androidx/fragment/app/FragmentTransition$Callback.class */
    public interface Callback {
        void onComplete(@NonNull Fragment fragment, @NonNull CancellationSignal cancellationSignal);

        void onStart(@NonNull Fragment fragment, @NonNull CancellationSignal cancellationSignal);
    }

    /* loaded from: ItsOnFire.jar:androidx/fragment/app/FragmentTransition$FragmentContainerTransition.class */
    public static class FragmentContainerTransition {
        public Fragment firstOut;
        public boolean firstOutIsPop;
        public BackStackRecord firstOutTransaction;
        public Fragment lastIn;
        public boolean lastInIsPop;
        public BackStackRecord lastInTransaction;
    }

    private FragmentTransition() {
    }

    private static void addSharedElementsWithMatchingNames(ArrayList<View> arrayList, ArrayMap<String, View> arrayMap, Collection<String> collection) {
        for (int size = arrayMap.size() - 1; size >= 0; size--) {
            View valueAt = arrayMap.valueAt(size);
            if (collection.contains(ViewCompat.getTransitionName(valueAt))) {
                arrayList.add(valueAt);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0084, code lost:
        if (r0.mAdded != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f3, code lost:
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0138, code lost:
        if (r0.mHidden == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x013b, code lost:
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01d1, code lost:
        if (r5.firstOut == null) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void addToFirstInLastOut(androidx.fragment.app.BackStackRecord r4, androidx.fragment.app.FragmentTransaction.Op r5, android.util.SparseArray<androidx.fragment.app.FragmentTransition.FragmentContainerTransition> r6, boolean r7, boolean r8) {
        /*
            Method dump skipped, instructions count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentTransition.addToFirstInLastOut(androidx.fragment.app.BackStackRecord, androidx.fragment.app.FragmentTransaction$Op, android.util.SparseArray, boolean, boolean):void");
    }

    public static void calculateFragments(BackStackRecord backStackRecord, SparseArray<FragmentContainerTransition> sparseArray, boolean z) {
        int size = backStackRecord.mOps.size();
        for (int i2 = 0; i2 < size; i2++) {
            addToFirstInLastOut(backStackRecord, backStackRecord.mOps.get(i2), sparseArray, false, z);
        }
    }

    private static ArrayMap<String, String> calculateNameOverrides(int i2, ArrayList<BackStackRecord> arrayList, ArrayList<Boolean> arrayList2, int i3, int i4) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        ArrayMap<String, String> arrayMap = new ArrayMap<>();
        while (true) {
            i4--;
            if (i4 < i3) {
                return arrayMap;
            }
            BackStackRecord backStackRecord = arrayList.get(i4);
            if (backStackRecord.interactsWith(i2)) {
                boolean booleanValue = arrayList2.get(i4).booleanValue();
                ArrayList<String> arrayList5 = backStackRecord.mSharedElementSourceNames;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (booleanValue) {
                        arrayList4 = backStackRecord.mSharedElementSourceNames;
                        arrayList3 = backStackRecord.mSharedElementTargetNames;
                    } else {
                        arrayList3 = backStackRecord.mSharedElementSourceNames;
                        arrayList4 = backStackRecord.mSharedElementTargetNames;
                    }
                    for (int i5 = 0; i5 < size; i5++) {
                        String str = arrayList3.get(i5);
                        String str2 = arrayList4.get(i5);
                        String remove = arrayMap.remove(str2);
                        if (remove != null) {
                            arrayMap.put(str, remove);
                        } else {
                            arrayMap.put(str, str2);
                        }
                    }
                }
            }
        }
    }

    public static void calculatePopFragments(BackStackRecord backStackRecord, SparseArray<FragmentContainerTransition> sparseArray, boolean z) {
        if (backStackRecord.mManager.getContainer().onHasView()) {
            for (int size = backStackRecord.mOps.size() - 1; size >= 0; size--) {
                addToFirstInLastOut(backStackRecord, backStackRecord.mOps.get(size), sparseArray, true, z);
            }
        }
    }

    public static void callSharedElementStartEnd(Fragment fragment, Fragment fragment2, boolean z, ArrayMap<String, View> arrayMap, boolean z2) {
        SharedElementCallback enterTransitionCallback = z ? fragment2.getEnterTransitionCallback() : fragment.getEnterTransitionCallback();
        if (enterTransitionCallback != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = arrayMap == null ? 0 : arrayMap.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList2.add(arrayMap.keyAt(i2));
                arrayList.add(arrayMap.valueAt(i2));
            }
            if (z2) {
                enterTransitionCallback.onSharedElementStart(arrayList2, arrayList, null);
            } else {
                enterTransitionCallback.onSharedElementEnd(arrayList2, arrayList, null);
            }
        }
    }

    private static boolean canHandleAll(FragmentTransitionImpl fragmentTransitionImpl, List<Object> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!fragmentTransitionImpl.canHandle(list.get(i2))) {
                return false;
            }
        }
        return true;
    }

    public static ArrayMap<String, View> captureInSharedElements(FragmentTransitionImpl fragmentTransitionImpl, ArrayMap<String, String> arrayMap, Object obj, FragmentContainerTransition fragmentContainerTransition) {
        SharedElementCallback enterTransitionCallback;
        ArrayList<String> arrayList;
        String findKeyForValue;
        Fragment fragment = fragmentContainerTransition.lastIn;
        View view = fragment.getView();
        if (arrayMap.isEmpty() || obj == null || view == null) {
            arrayMap.clear();
            return null;
        }
        ArrayMap<String, View> arrayMap2 = new ArrayMap<>();
        fragmentTransitionImpl.findNamedViews(arrayMap2, view);
        BackStackRecord backStackRecord = fragmentContainerTransition.lastInTransaction;
        if (fragmentContainerTransition.lastInIsPop) {
            enterTransitionCallback = fragment.getExitTransitionCallback();
            arrayList = backStackRecord.mSharedElementSourceNames;
        } else {
            enterTransitionCallback = fragment.getEnterTransitionCallback();
            arrayList = backStackRecord.mSharedElementTargetNames;
        }
        if (arrayList != null) {
            arrayMap2.retainAll(arrayList);
            arrayMap2.retainAll(arrayMap.values());
        }
        if (enterTransitionCallback != null) {
            enterTransitionCallback.onMapSharedElements(arrayList, arrayMap2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view2 = arrayMap2.get(str);
                if (view2 == null) {
                    String findKeyForValue2 = findKeyForValue(arrayMap, str);
                    if (findKeyForValue2 != null) {
                        arrayMap.remove(findKeyForValue2);
                    }
                } else if (!str.equals(ViewCompat.getTransitionName(view2)) && (findKeyForValue = findKeyForValue(arrayMap, str)) != null) {
                    arrayMap.put(findKeyForValue, ViewCompat.getTransitionName(view2));
                }
            }
        } else {
            retainValues(arrayMap, arrayMap2);
        }
        return arrayMap2;
    }

    private static ArrayMap<String, View> captureOutSharedElements(FragmentTransitionImpl fragmentTransitionImpl, ArrayMap<String, String> arrayMap, Object obj, FragmentContainerTransition fragmentContainerTransition) {
        SharedElementCallback exitTransitionCallback;
        ArrayList<String> arrayList;
        if (arrayMap.isEmpty() || obj == null) {
            arrayMap.clear();
            return null;
        }
        Fragment fragment = fragmentContainerTransition.firstOut;
        ArrayMap<String, View> arrayMap2 = new ArrayMap<>();
        fragmentTransitionImpl.findNamedViews(arrayMap2, fragment.requireView());
        BackStackRecord backStackRecord = fragmentContainerTransition.firstOutTransaction;
        if (fragmentContainerTransition.firstOutIsPop) {
            exitTransitionCallback = fragment.getEnterTransitionCallback();
            arrayList = backStackRecord.mSharedElementTargetNames;
        } else {
            exitTransitionCallback = fragment.getExitTransitionCallback();
            arrayList = backStackRecord.mSharedElementSourceNames;
        }
        if (arrayList != null) {
            arrayMap2.retainAll(arrayList);
        }
        if (exitTransitionCallback != null) {
            exitTransitionCallback.onMapSharedElements(arrayList, arrayMap2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view = arrayMap2.get(str);
                if (view == null) {
                    arrayMap.remove(str);
                } else if (!str.equals(ViewCompat.getTransitionName(view))) {
                    arrayMap.put(ViewCompat.getTransitionName(view), arrayMap.remove(str));
                }
            }
        } else {
            arrayMap.retainAll(arrayMap2.keySet());
        }
        return arrayMap2;
    }

    private static FragmentTransitionImpl chooseImpl(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object exitTransition = fragment.getExitTransition();
            if (exitTransition != null) {
                arrayList.add(exitTransition);
            }
            Object returnTransition = fragment.getReturnTransition();
            if (returnTransition != null) {
                arrayList.add(returnTransition);
            }
            Object sharedElementReturnTransition = fragment.getSharedElementReturnTransition();
            if (sharedElementReturnTransition != null) {
                arrayList.add(sharedElementReturnTransition);
            }
        }
        if (fragment2 != null) {
            Object enterTransition = fragment2.getEnterTransition();
            if (enterTransition != null) {
                arrayList.add(enterTransition);
            }
            Object reenterTransition = fragment2.getReenterTransition();
            if (reenterTransition != null) {
                arrayList.add(reenterTransition);
            }
            Object sharedElementEnterTransition = fragment2.getSharedElementEnterTransition();
            if (sharedElementEnterTransition != null) {
                arrayList.add(sharedElementEnterTransition);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        FragmentTransitionImpl fragmentTransitionImpl = PLATFORM_IMPL;
        if (fragmentTransitionImpl == null || !canHandleAll(fragmentTransitionImpl, arrayList)) {
            FragmentTransitionImpl fragmentTransitionImpl2 = SUPPORT_IMPL;
            if (fragmentTransitionImpl2 == null || !canHandleAll(fragmentTransitionImpl2, arrayList)) {
                if (fragmentTransitionImpl == null && fragmentTransitionImpl2 == null) {
                    return null;
                }
                throw new IllegalArgumentException("Invalid Transition types");
            }
            return fragmentTransitionImpl2;
        }
        return fragmentTransitionImpl;
    }

    public static ArrayList<View> configureEnteringExitingViews(FragmentTransitionImpl fragmentTransitionImpl, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        ArrayList<View> arrayList2;
        if (obj != null) {
            ArrayList<View> arrayList3 = new ArrayList<>();
            View view2 = fragment.getView();
            if (view2 != null) {
                fragmentTransitionImpl.captureTransitioningViews(arrayList3, view2);
            }
            if (arrayList != null) {
                arrayList3.removeAll(arrayList);
            }
            arrayList2 = arrayList3;
            if (!arrayList3.isEmpty()) {
                arrayList3.add(view);
                fragmentTransitionImpl.addTargets(obj, arrayList3);
                arrayList2 = arrayList3;
            }
        } else {
            arrayList2 = null;
        }
        return arrayList2;
    }

    private static Object configureSharedElementsOrdered(final FragmentTransitionImpl fragmentTransitionImpl, ViewGroup viewGroup, final View view, final ArrayMap<String, String> arrayMap, final FragmentContainerTransition fragmentContainerTransition, final ArrayList<View> arrayList, final ArrayList<View> arrayList2, final Object obj, Object obj2) {
        Rect rect;
        final Fragment fragment = fragmentContainerTransition.lastIn;
        final Fragment fragment2 = fragmentContainerTransition.firstOut;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        final boolean z = fragmentContainerTransition.lastInIsPop;
        Object sharedElementTransition = arrayMap.isEmpty() ? null : getSharedElementTransition(fragmentTransitionImpl, fragment, fragment2, z);
        ArrayMap<String, View> captureOutSharedElements = captureOutSharedElements(fragmentTransitionImpl, arrayMap, sharedElementTransition, fragmentContainerTransition);
        if (arrayMap.isEmpty()) {
            sharedElementTransition = null;
        } else {
            arrayList.addAll(captureOutSharedElements.values());
        }
        if (obj == null && obj2 == null && sharedElementTransition == null) {
            return null;
        }
        callSharedElementStartEnd(fragment, fragment2, z, captureOutSharedElements, true);
        if (sharedElementTransition != null) {
            Rect rect2 = new Rect();
            fragmentTransitionImpl.setSharedElementTargets(sharedElementTransition, view, arrayList);
            setOutEpicenter(fragmentTransitionImpl, sharedElementTransition, obj2, captureOutSharedElements, fragmentContainerTransition.firstOutIsPop, fragmentContainerTransition.firstOutTransaction);
            rect = rect2;
            if (obj != null) {
                fragmentTransitionImpl.setEpicenter(obj, rect2);
                rect = rect2;
            }
        } else {
            rect = null;
        }
        final Object obj3 = sharedElementTransition;
        final Rect rect3 = rect;
        OneShotPreDrawListener.add(viewGroup, new Runnable() { // from class: androidx.fragment.app.FragmentTransition.6
            @Override // java.lang.Runnable
            public void run() {
                ArrayMap<String, View> captureInSharedElements = FragmentTransition.captureInSharedElements(FragmentTransitionImpl.this, arrayMap, obj3, fragmentContainerTransition);
                if (captureInSharedElements != null) {
                    arrayList2.addAll(captureInSharedElements.values());
                    arrayList2.add(view);
                }
                FragmentTransition.callSharedElementStartEnd(fragment, fragment2, z, captureInSharedElements, false);
                Object obj4 = obj3;
                if (obj4 != null) {
                    FragmentTransitionImpl.this.swapSharedElementTargets(obj4, arrayList, arrayList2);
                    View inEpicenterView = FragmentTransition.getInEpicenterView(captureInSharedElements, fragmentContainerTransition, obj, z);
                    if (inEpicenterView != null) {
                        FragmentTransitionImpl.this.getBoundsOnScreen(inEpicenterView, rect3);
                    }
                }
            }
        });
        return sharedElementTransition;
    }

    private static Object configureSharedElementsReordered(final FragmentTransitionImpl fragmentTransitionImpl, ViewGroup viewGroup, View view, ArrayMap<String, String> arrayMap, FragmentContainerTransition fragmentContainerTransition, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        Rect rect;
        View view2;
        final Fragment fragment = fragmentContainerTransition.lastIn;
        final Fragment fragment2 = fragmentContainerTransition.firstOut;
        if (fragment != null) {
            fragment.requireView().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        final boolean z = fragmentContainerTransition.lastInIsPop;
        Object sharedElementTransition = arrayMap.isEmpty() ? null : getSharedElementTransition(fragmentTransitionImpl, fragment, fragment2, z);
        ArrayMap<String, View> captureOutSharedElements = captureOutSharedElements(fragmentTransitionImpl, arrayMap, sharedElementTransition, fragmentContainerTransition);
        final ArrayMap<String, View> captureInSharedElements = captureInSharedElements(fragmentTransitionImpl, arrayMap, sharedElementTransition, fragmentContainerTransition);
        if (arrayMap.isEmpty()) {
            if (captureOutSharedElements != null) {
                captureOutSharedElements.clear();
            }
            if (captureInSharedElements != null) {
                captureInSharedElements.clear();
            }
            obj3 = null;
        } else {
            addSharedElementsWithMatchingNames(arrayList, captureOutSharedElements, arrayMap.keySet());
            addSharedElementsWithMatchingNames(arrayList2, captureInSharedElements, arrayMap.values());
            obj3 = sharedElementTransition;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        callSharedElementStartEnd(fragment, fragment2, z, captureOutSharedElements, true);
        if (obj3 != null) {
            arrayList2.add(view);
            fragmentTransitionImpl.setSharedElementTargets(obj3, view, arrayList);
            setOutEpicenter(fragmentTransitionImpl, obj3, obj2, captureOutSharedElements, fragmentContainerTransition.firstOutIsPop, fragmentContainerTransition.firstOutTransaction);
            Rect rect2 = new Rect();
            view2 = getInEpicenterView(captureInSharedElements, fragmentContainerTransition, obj, z);
            if (view2 != null) {
                fragmentTransitionImpl.setEpicenter(obj, rect2);
            }
            rect = rect2;
        } else {
            rect = null;
            view2 = null;
        }
        final View view3 = view2;
        final Rect rect3 = rect;
        OneShotPreDrawListener.add(viewGroup, new Runnable() { // from class: androidx.fragment.app.FragmentTransition.5
            @Override // java.lang.Runnable
            public void run() {
                FragmentTransition.callSharedElementStartEnd(Fragment.this, fragment2, z, captureInSharedElements, false);
                View view4 = view3;
                if (view4 != null) {
                    fragmentTransitionImpl.getBoundsOnScreen(view4, rect3);
                }
            }
        });
        return obj3;
    }

    private static void configureTransitionsOrdered(@NonNull ViewGroup viewGroup, FragmentContainerTransition fragmentContainerTransition, View view, ArrayMap<String, String> arrayMap, final Callback callback) {
        Fragment fragment = fragmentContainerTransition.lastIn;
        final Fragment fragment2 = fragmentContainerTransition.firstOut;
        FragmentTransitionImpl chooseImpl = chooseImpl(fragment2, fragment);
        if (chooseImpl == null) {
            return;
        }
        boolean z = fragmentContainerTransition.lastInIsPop;
        boolean z2 = fragmentContainerTransition.firstOutIsPop;
        Object enterTransition = getEnterTransition(chooseImpl, fragment, z);
        Object exitTransition = getExitTransition(chooseImpl, fragment2, z2);
        ArrayList arrayList = new ArrayList();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object configureSharedElementsOrdered = configureSharedElementsOrdered(chooseImpl, viewGroup, view, arrayMap, fragmentContainerTransition, arrayList, arrayList2, enterTransition, exitTransition);
        if (enterTransition == null && configureSharedElementsOrdered == null && exitTransition == null) {
            return;
        }
        ArrayList<View> configureEnteringExitingViews = configureEnteringExitingViews(chooseImpl, exitTransition, fragment2, arrayList, view);
        if (configureEnteringExitingViews == null || configureEnteringExitingViews.isEmpty()) {
            exitTransition = null;
        }
        chooseImpl.addTarget(enterTransition, view);
        Object mergeTransitions = mergeTransitions(chooseImpl, enterTransition, exitTransition, configureSharedElementsOrdered, fragment, fragmentContainerTransition.lastInIsPop);
        if (fragment2 != null && configureEnteringExitingViews != null && (configureEnteringExitingViews.size() > 0 || arrayList.size() > 0)) {
            final CancellationSignal cancellationSignal = new CancellationSignal();
            callback.onStart(fragment2, cancellationSignal);
            chooseImpl.setListenerForTransitionEnd(fragment2, mergeTransitions, cancellationSignal, new Runnable() { // from class: androidx.fragment.app.FragmentTransition.3
                @Override // java.lang.Runnable
                public void run() {
                    Callback.this.onComplete(fragment2, cancellationSignal);
                }
            });
        }
        if (mergeTransitions != null) {
            ArrayList<View> arrayList3 = new ArrayList<>();
            chooseImpl.scheduleRemoveTargets(mergeTransitions, enterTransition, arrayList3, exitTransition, configureEnteringExitingViews, configureSharedElementsOrdered, arrayList2);
            scheduleTargetChange(chooseImpl, viewGroup, fragment, view, arrayList2, enterTransition, arrayList3, exitTransition, configureEnteringExitingViews);
            chooseImpl.setNameOverridesOrdered(viewGroup, arrayList2, arrayMap);
            chooseImpl.beginDelayedTransition(viewGroup, mergeTransitions);
            chooseImpl.scheduleNameReset(viewGroup, arrayList2, arrayMap);
        }
    }

    private static void configureTransitionsReordered(@NonNull ViewGroup viewGroup, FragmentContainerTransition fragmentContainerTransition, View view, ArrayMap<String, String> arrayMap, final Callback callback) {
        Fragment fragment = fragmentContainerTransition.lastIn;
        final Fragment fragment2 = fragmentContainerTransition.firstOut;
        FragmentTransitionImpl chooseImpl = chooseImpl(fragment2, fragment);
        if (chooseImpl == null) {
            return;
        }
        boolean z = fragmentContainerTransition.lastInIsPop;
        boolean z2 = fragmentContainerTransition.firstOutIsPop;
        ArrayList<View> arrayList = new ArrayList<>();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object enterTransition = getEnterTransition(chooseImpl, fragment, z);
        Object exitTransition = getExitTransition(chooseImpl, fragment2, z2);
        Object configureSharedElementsReordered = configureSharedElementsReordered(chooseImpl, viewGroup, view, arrayMap, fragmentContainerTransition, arrayList2, arrayList, enterTransition, exitTransition);
        if (enterTransition == null && configureSharedElementsReordered == null && exitTransition == null) {
            return;
        }
        ArrayList<View> configureEnteringExitingViews = configureEnteringExitingViews(chooseImpl, exitTransition, fragment2, arrayList2, view);
        ArrayList<View> configureEnteringExitingViews2 = configureEnteringExitingViews(chooseImpl, enterTransition, fragment, arrayList, view);
        setViewVisibility(configureEnteringExitingViews2, 4);
        Object mergeTransitions = mergeTransitions(chooseImpl, enterTransition, exitTransition, configureSharedElementsReordered, fragment, z);
        if (fragment2 != null && configureEnteringExitingViews != null && (configureEnteringExitingViews.size() > 0 || arrayList2.size() > 0)) {
            final CancellationSignal cancellationSignal = new CancellationSignal();
            callback.onStart(fragment2, cancellationSignal);
            chooseImpl.setListenerForTransitionEnd(fragment2, mergeTransitions, cancellationSignal, new Runnable() { // from class: androidx.fragment.app.FragmentTransition.1
                @Override // java.lang.Runnable
                public void run() {
                    Callback.this.onComplete(fragment2, cancellationSignal);
                }
            });
        }
        if (mergeTransitions != null) {
            replaceHide(chooseImpl, exitTransition, fragment2, configureEnteringExitingViews);
            ArrayList<String> prepareSetNameOverridesReordered = chooseImpl.prepareSetNameOverridesReordered(arrayList);
            chooseImpl.scheduleRemoveTargets(mergeTransitions, enterTransition, configureEnteringExitingViews2, exitTransition, configureEnteringExitingViews, configureSharedElementsReordered, arrayList);
            chooseImpl.beginDelayedTransition(viewGroup, mergeTransitions);
            chooseImpl.setNameOverridesReordered(viewGroup, arrayList2, arrayList, prepareSetNameOverridesReordered, arrayMap);
            setViewVisibility(configureEnteringExitingViews2, 0);
            chooseImpl.swapSharedElementTargets(configureSharedElementsReordered, arrayList2, arrayList);
        }
    }

    private static FragmentContainerTransition ensureContainer(FragmentContainerTransition fragmentContainerTransition, SparseArray<FragmentContainerTransition> sparseArray, int i2) {
        FragmentContainerTransition fragmentContainerTransition2 = fragmentContainerTransition;
        if (fragmentContainerTransition == null) {
            fragmentContainerTransition2 = new FragmentContainerTransition();
            sparseArray.put(i2, fragmentContainerTransition2);
        }
        return fragmentContainerTransition2;
    }

    public static String findKeyForValue(ArrayMap<String, String> arrayMap, String str) {
        int size = arrayMap.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (str.equals(arrayMap.valueAt(i2))) {
                return arrayMap.keyAt(i2);
            }
        }
        return null;
    }

    private static Object getEnterTransition(FragmentTransitionImpl fragmentTransitionImpl, Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        return fragmentTransitionImpl.cloneTransition(z ? fragment.getReenterTransition() : fragment.getEnterTransition());
    }

    private static Object getExitTransition(FragmentTransitionImpl fragmentTransitionImpl, Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        return fragmentTransitionImpl.cloneTransition(z ? fragment.getReturnTransition() : fragment.getExitTransition());
    }

    public static View getInEpicenterView(ArrayMap<String, View> arrayMap, FragmentContainerTransition fragmentContainerTransition, Object obj, boolean z) {
        ArrayList<String> arrayList;
        BackStackRecord backStackRecord = fragmentContainerTransition.lastInTransaction;
        if (obj == null || arrayMap == null || (arrayList = backStackRecord.mSharedElementSourceNames) == null || arrayList.isEmpty()) {
            return null;
        }
        return arrayMap.get((z ? backStackRecord.mSharedElementSourceNames : backStackRecord.mSharedElementTargetNames).get(0));
    }

    private static Object getSharedElementTransition(FragmentTransitionImpl fragmentTransitionImpl, Fragment fragment, Fragment fragment2, boolean z) {
        if (fragment == null || fragment2 == null) {
            return null;
        }
        return fragmentTransitionImpl.wrapTransitionInSet(fragmentTransitionImpl.cloneTransition(z ? fragment2.getSharedElementReturnTransition() : fragment.getSharedElementEnterTransition()));
    }

    private static Object mergeTransitions(FragmentTransitionImpl fragmentTransitionImpl, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z) {
        return (obj == null || obj2 == null || fragment == null) ? true : z ? fragment.getAllowReturnTransitionOverlap() : fragment.getAllowEnterTransitionOverlap() ? fragmentTransitionImpl.mergeTransitionsTogether(obj2, obj, obj3) : fragmentTransitionImpl.mergeTransitionsInSequence(obj2, obj, obj3);
    }

    private static void replaceHide(FragmentTransitionImpl fragmentTransitionImpl, Object obj, Fragment fragment, final ArrayList<View> arrayList) {
        if (fragment != null && obj != null && fragment.mAdded && fragment.mHidden && fragment.mHiddenChanged) {
            fragment.setHideReplaced(true);
            fragmentTransitionImpl.scheduleHideFragmentView(obj, fragment.getView(), arrayList);
            OneShotPreDrawListener.add(fragment.mContainer, new Runnable() { // from class: androidx.fragment.app.FragmentTransition.2
                @Override // java.lang.Runnable
                public void run() {
                    FragmentTransition.setViewVisibility(arrayList, 4);
                }
            });
        }
    }

    private static FragmentTransitionImpl resolveSupportImpl() {
        try {
            return (FragmentTransitionImpl) Class.forName("androidx.transition.FragmentTransitionSupport").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e2) {
            return null;
        }
    }

    public static void retainValues(@NonNull ArrayMap<String, String> arrayMap, @NonNull ArrayMap<String, View> arrayMap2) {
        for (int size = arrayMap.size() - 1; size >= 0; size--) {
            if (!arrayMap2.containsKey(arrayMap.valueAt(size))) {
                arrayMap.removeAt(size);
            }
        }
    }

    private static void scheduleTargetChange(final FragmentTransitionImpl fragmentTransitionImpl, ViewGroup viewGroup, final Fragment fragment, final View view, final ArrayList<View> arrayList, final Object obj, final ArrayList<View> arrayList2, final Object obj2, final ArrayList<View> arrayList3) {
        OneShotPreDrawListener.add(viewGroup, new Runnable() { // from class: androidx.fragment.app.FragmentTransition.4
            @Override // java.lang.Runnable
            public void run() {
                Object obj3 = obj;
                if (obj3 != null) {
                    fragmentTransitionImpl.removeTarget(obj3, view);
                    arrayList2.addAll(FragmentTransition.configureEnteringExitingViews(fragmentTransitionImpl, obj, fragment, arrayList, view));
                }
                if (arrayList3 != null) {
                    if (obj2 != null) {
                        ArrayList<View> arrayList4 = new ArrayList<>();
                        arrayList4.add(view);
                        fragmentTransitionImpl.replaceTargets(obj2, arrayList3, arrayList4);
                    }
                    arrayList3.clear();
                    arrayList3.add(view);
                }
            }
        });
    }

    private static void setOutEpicenter(FragmentTransitionImpl fragmentTransitionImpl, Object obj, Object obj2, ArrayMap<String, View> arrayMap, boolean z, BackStackRecord backStackRecord) {
        ArrayList<String> arrayList = backStackRecord.mSharedElementSourceNames;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        View view = arrayMap.get((z ? backStackRecord.mSharedElementTargetNames : backStackRecord.mSharedElementSourceNames).get(0));
        fragmentTransitionImpl.setEpicenter(obj, view);
        if (obj2 != null) {
            fragmentTransitionImpl.setEpicenter(obj2, view);
        }
    }

    public static void setViewVisibility(ArrayList<View> arrayList, int i2) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i2);
        }
    }

    public static void startTransitions(@NonNull Context context, @NonNull FragmentContainer fragmentContainer, ArrayList<BackStackRecord> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3, boolean z, Callback callback) {
        ViewGroup viewGroup;
        SparseArray sparseArray = new SparseArray();
        for (int i4 = i2; i4 < i3; i4++) {
            BackStackRecord backStackRecord = arrayList.get(i4);
            if (arrayList2.get(i4).booleanValue()) {
                calculatePopFragments(backStackRecord, sparseArray, z);
            } else {
                calculateFragments(backStackRecord, sparseArray, z);
            }
        }
        if (sparseArray.size() != 0) {
            View view = new View(context);
            int size = sparseArray.size();
            for (int i5 = 0; i5 < size; i5++) {
                int keyAt = sparseArray.keyAt(i5);
                ArrayMap<String, String> calculateNameOverrides = calculateNameOverrides(keyAt, arrayList, arrayList2, i2, i3);
                FragmentContainerTransition fragmentContainerTransition = (FragmentContainerTransition) sparseArray.valueAt(i5);
                if (fragmentContainer.onHasView() && (viewGroup = (ViewGroup) fragmentContainer.onFindViewById(keyAt)) != null) {
                    if (z) {
                        configureTransitionsReordered(viewGroup, fragmentContainerTransition, view, calculateNameOverrides, callback);
                    } else {
                        configureTransitionsOrdered(viewGroup, fragmentContainerTransition, view, calculateNameOverrides, callback);
                    }
                }
            }
        }
    }

    public static boolean supportsTransition() {
        return (PLATFORM_IMPL == null && SUPPORT_IMPL == null) ? false : true;
    }
}

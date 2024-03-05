package com.google.firebase.tracing;

import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.ComponentRegistrarProcessor;
import com.google.firebase.tracing.ComponentMonitor;
import java.util.ArrayList;
import java.util.List;
/* loaded from: ItsOnFire.jar:com/google/firebase/tracing/ComponentMonitor.class */
public class ComponentMonitor implements ComponentRegistrarProcessor {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$processRegistrar$0(String str, Component component, ComponentContainer componentContainer) {
        try {
            FirebaseTrace.pushTrace(str);
            Object create = component.getFactory().create(componentContainer);
            FirebaseTrace.popTrace();
            return create;
        } catch (Throwable th) {
            FirebaseTrace.popTrace();
            throw th;
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrarProcessor
    public List<Component<?>> processRegistrar(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (final Component<?> component : componentRegistrar.getComponents()) {
            final String name = component.getName();
            Component<?> component2 = component;
            if (name != null) {
                component2 = component.withFactory(new ComponentFactory() { // from class: e.a
                    @Override // com.google.firebase.components.ComponentFactory
                    public final Object create(ComponentContainer componentContainer) {
                        Object lambda$processRegistrar$0;
                        lambda$processRegistrar$0 = ComponentMonitor.lambda$processRegistrar$0(name, component, componentContainer);
                        return lambda$processRegistrar$0;
                    }
                });
            }
            arrayList.add(component2);
        }
        return arrayList;
    }
}

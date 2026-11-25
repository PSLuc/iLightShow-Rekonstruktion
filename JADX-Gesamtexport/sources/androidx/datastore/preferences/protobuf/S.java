package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import p096s.AbstractC0916i;

/* JADX INFO: loaded from: classes.dex */
public final class S {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final S f6818c = new S();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f6820b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D f6819a = new D();

    public final V a(Class cls) {
        V vX;
        Class cls2;
        AbstractC0438x.a("messageType", cls);
        ConcurrentHashMap concurrentHashMap = this.f6820b;
        V v6 = (V) concurrentHashMap.get(cls);
        if (v6 != null) {
            return v6;
        }
        D d6 = this.f6819a;
        d6.getClass();
        Class cls3 = W.f6827a;
        if (!AbstractC0436v.class.isAssignableFrom(cls) && (cls2 = W.f6827a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        U uA = ((C) d6.f6789a).a(cls);
        if ((uA.f6826d & 2) == 2) {
            boolean zIsAssignableFrom = AbstractC0436v.class.isAssignableFrom(cls);
            AbstractC0436v abstractC0436v = uA.f6823a;
            if (zIsAssignableFrom) {
                vX = new M(W.f6829c, AbstractC0431p.f6899a, abstractC0436v);
            } else {
                b0 b0Var = W.f6828b;
                C0430o c0430o = AbstractC0431p.f6900b;
                if (c0430o == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                vX = new M(b0Var, c0430o, abstractC0436v);
            }
        } else if (AbstractC0436v.class.isAssignableFrom(cls)) {
            C0430o c0430o2 = null;
            N n6 = O.f6817b;
            A a6 = B.f6786b;
            d0 d0Var = W.f6829c;
            if (AbstractC0916i.d(uA.a()) != 1) {
                c0430o2 = AbstractC0431p.f6899a;
            }
            C0430o c0430o3 = c0430o2;
            H h6 = I.f6796b;
            int[] iArr = L.f6799n;
            if (!(uA instanceof U)) {
                uA.getClass();
                throw new ClassCastException();
            }
            vX = L.x(uA, n6, a6, d0Var, c0430o3, h6);
        } else {
            C0430o c0430o4 = null;
            N n7 = O.f6816a;
            A a7 = B.f6785a;
            b0 b0Var2 = W.f6828b;
            if (AbstractC0916i.d(uA.a()) != 1 && (c0430o4 = AbstractC0431p.f6900b) == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            C0430o c0430o5 = c0430o4;
            H h7 = I.f6795a;
            int[] iArr2 = L.f6799n;
            if (!(uA instanceof U)) {
                uA.getClass();
                throw new ClassCastException();
            }
            vX = L.x(uA, n7, a7, b0Var2, c0430o5, h7);
        }
        V v7 = (V) concurrentHashMap.putIfAbsent(cls, vX);
        return v7 != null ? v7 : vX;
    }
}

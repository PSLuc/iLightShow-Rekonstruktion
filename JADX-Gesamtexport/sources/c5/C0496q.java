package c5;

import java.lang.ref.SoftReference;

/* JADX INFO: renamed from: c5.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0496q extends ClassValue {
    @Override // java.lang.ClassValue
    public final Object computeValue(Class cls) {
        E4.k.f("type", cls);
        T t6 = new T();
        t6.f7416a = new SoftReference(null);
        return t6;
    }
}

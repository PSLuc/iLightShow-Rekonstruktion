package c5;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class i0 extends r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final K4.b f7458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0477b f7459c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(K4.b bVar, Y4.a aVar) {
        super(aVar);
        E4.k.f("eSerializer", aVar);
        this.f7458b = bVar;
        a5.g descriptor = aVar.getDescriptor();
        E4.k.f("elementDesc", descriptor);
        this.f7459c = new C0477b(descriptor, 0);
    }

    @Override // c5.AbstractC0475a
    public final Object a() {
        return new ArrayList();
    }

    @Override // c5.AbstractC0475a
    public final int b(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        E4.k.f("<this>", arrayList);
        return arrayList.size();
    }

    @Override // c5.AbstractC0475a
    public final Iterator c(Object obj) {
        Object[] objArr = (Object[]) obj;
        E4.k.f("<this>", objArr);
        return E4.k.j(objArr);
    }

    @Override // c5.AbstractC0475a
    public final int d(Object obj) {
        Object[] objArr = (Object[]) obj;
        E4.k.f("<this>", objArr);
        return objArr.length;
    }

    @Override // c5.AbstractC0475a
    public final Object g(Object obj) {
        E4.k.f("<this>", null);
        p089q4.k.a0(null);
        throw null;
    }

    @Override // Y4.a
    public final a5.g getDescriptor() {
        return this.f7459c;
    }

    @Override // c5.AbstractC0475a
    public final Object h(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        E4.k.f("<this>", arrayList);
        K4.b bVar = this.f7458b;
        E4.k.f("eClass", bVar);
        Object objNewInstance = Array.newInstance((Class<?>) p020d2.n.s(bVar), arrayList.size());
        E4.k.d("null cannot be cast to non-null type kotlin.Array<E of kotlinx.serialization.internal.PlatformKt.toNativeArrayImpl>", objNewInstance);
        Object[] array = arrayList.toArray((Object[]) objNewInstance);
        E4.k.e("toArray(...)", array);
        return array;
    }

    @Override // c5.r
    public final void i(Object obj, int i, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        E4.k.f("<this>", arrayList);
        arrayList.add(i, obj2);
    }
}

package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class P extends p105t3.C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8036a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f8037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f8038c;

    public P(TypeAdapters$34 typeAdapters$34, Class cls) {
        this.f8038c = typeAdapters$34;
        this.f8037b = cls;
    }

    @Override // p105t3.C
    public final Object a(p138z3.a aVar) throws IOException {
        switch (this.f8036a) {
            case 0:
                Object objA = ((TypeAdapters$34) this.f8038c).i.a(aVar);
                if (objA != null) {
                    Class cls = (Class) this.f8037b;
                    if (!cls.isInstance(objA)) {
                        throw new JsonSyntaxException("Expected a " + cls.getName() + " but was " + objA.getClass().getName() + "; at path " + aVar.J());
                    }
                }
                return objA;
            default:
                if (aVar.f0() == 9) {
                    aVar.b0();
                    return null;
                }
                Collection collection = (Collection) ((p116v3.m) this.f8038c).l();
                aVar.b();
                while (aVar.L()) {
                    collection.add(((p105t3.C) ((C0626t) this.f8037b).f8136c).a(aVar));
                }
                aVar.s();
                return collection;
        }
    }

    @Override // p105t3.C
    public final void b(p138z3.c cVar, Object obj) throws IOException {
        switch (this.f8036a) {
            case 0:
                ((TypeAdapters$34) this.f8038c).i.b(cVar, obj);
                break;
            default:
                Collection collection = (Collection) obj;
                if (collection != null) {
                    cVar.c();
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        ((C0626t) this.f8037b).b(cVar, it.next());
                    }
                    cVar.s();
                } else {
                    cVar.G();
                }
                break;
        }
    }

    public P(p105t3.m mVar, Type type, p105t3.C c6, p116v3.m mVar2) {
        this.f8037b = new C0626t(mVar, c6, type);
        this.f8038c = mVar2;
    }
}

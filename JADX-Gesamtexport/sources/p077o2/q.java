package p077o2;

import com.fasterxml.jackson.core.JsonGenerationException;
import p003a2.a;
import p015c2.InterfaceC0472c;
import p071n2.e;

/* JADX INFO: loaded from: classes.dex */
public abstract class q extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f10661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0472c f10662b;

    public q(o oVar, InterfaceC0472c interfaceC0472c) {
        this.f10661a = oVar;
        this.f10662b = interfaceC0472c;
    }

    @Override // p071n2.e
    public String b() {
        return null;
    }

    @Override // p071n2.e
    public a e(T1.e eVar, a aVar) throws JsonGenerationException {
        if (aVar.f6159c == null) {
            Object obj = aVar.f6157a;
            Class cls = aVar.f6158b;
            o oVar = this.f10661a;
            aVar.f6159c = cls == null ? oVar.b(obj) : oVar.c(cls, obj);
        }
        if (aVar.f6159c == null) {
            return null;
        }
        eVar.v0(aVar);
        return aVar;
    }

    @Override // p071n2.e
    public a f(T1.e eVar, a aVar) {
        if (aVar == null) {
            return null;
        }
        eVar.w0(aVar);
        return aVar;
    }
}

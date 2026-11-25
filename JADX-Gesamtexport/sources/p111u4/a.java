package p111u4;

import D4.e;
import S1.h0;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h f12746h;

    public a(h hVar) {
        this.f12746h = hVar;
    }

    @Override // p111u4.i
    public i D(h hVar) {
        return h0.t(this, hVar);
    }

    @Override // p111u4.i
    public g J(h hVar) {
        return h0.m(this, hVar);
    }

    @Override // p111u4.i
    public final Object T(Object obj, e eVar) {
        return eVar.d(obj, this);
    }

    @Override // p111u4.g
    public final h getKey() {
        return this.f12746h;
    }

    @Override // p111u4.i
    public final i o(i iVar) {
        return h0.u(this, iVar);
    }
}

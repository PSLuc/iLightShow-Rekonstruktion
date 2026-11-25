package com.nanjoran.ilightshow.Services;

import P4.AbstractC0336x;
import P4.InterfaceC0335w;
import com.nanjoran.ilightshow.Model.Presets.UMPreset;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class J extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f8278l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f8279m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ M f8280n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(M m6, p111u4.d dVar) {
        super(2, dVar);
        this.f8280n = m6;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        J j4 = new J(this.f8280n, dVar);
        j4.f8279m = obj;
        return j4;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        return ((J) b((InterfaceC0335w) obj, (p111u4.d) obj2)).o(p084p4.x.f10867a);
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        InterfaceC0335w interfaceC0335w;
        v4.a aVar = v4.a.f13292h;
        int i = this.f8278l;
        M m6 = this.f8280n;
        if (i == 0) {
            S1.V.O(obj);
            InterfaceC0335w interfaceC0335w2 = (InterfaceC0335w) this.f8279m;
            m6.f8311F.setValue(Boolean.TRUE);
            interfaceC0335w = interfaceC0335w2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC0335w = (InterfaceC0335w) this.f8279m;
            try {
                S1.V.O(obj);
            } catch (CancellationException unused) {
            }
        }
        while (AbstractC0336x.m(interfaceC0335w)) {
            UMPreset uMPresetG = m6.g();
            boolean z5 = false;
            if (uMPresetG != null && uMPresetG.getStrobeDropsWhite()) {
                z5 = true;
            }
            M.e(m6, z5);
            this.f8279m = interfaceC0335w;
            this.f8278l = 1;
            if (AbstractC0336x.e(150L, this) == aVar) {
                return aVar;
            }
        }
        m6.f8311F.setValue(Boolean.FALSE);
        return p084p4.x.f10867a;
    }
}

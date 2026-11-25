package N3;

import N.InterfaceC0203a0;
import java.util.Set;
import p035g0.C0704e;
import p035g0.C0709j;
import p035g0.C0710k;

/* JADX INFO: renamed from: N3.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0299x0 implements D4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4317h;
    public final /* synthetic */ Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f4318j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f4319k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ N.V0 f4320l;

    public /* synthetic */ C0299x0(Object obj, Object obj2, Object obj3, N.V0 v6, int i) {
        this.f4317h = i;
        this.i = obj;
        this.f4318j = obj2;
        this.f4319k = obj3;
        this.f4320l = v6;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        D3.h hVar;
        switch (this.f4317h) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                D3.j jVar = (D3.j) this.f4318j;
                D3.j jVar2 = (D3.j) this.f4319k;
                InterfaceC0203a0 interfaceC0203a0 = (InterfaceC0203a0) this.f4320l;
                String str = (String) this.i;
                interfaceC0203a0.setValue(zBooleanValue ? p089q4.A.W((Set) interfaceC0203a0.getValue(), str) : p089q4.A.V((Set) interfaceC0203a0.getValue(), str));
                if (!((Set) interfaceC0203a0.getValue()).isEmpty() && (hVar = jVar.f806h) != null) {
                    hVar.i = null;
                }
                D3.h hVar2 = jVar2.f806h;
                if (hVar2 != null) {
                    hVar2.i = zBooleanValue ? jVar.f799a : null;
                }
                break;
            default:
                p044i0.d dVar = (p044i0.d) obj;
                C0704e c0704e = (C0704e) this.i;
                E4.k.f("$beam", c0704e);
                C0704e c0704e2 = (C0704e) this.f4318j;
                E4.k.f("$beamWhite", c0704e2);
                N.V0 v6 = (N.V0) this.f4319k;
                E4.k.f("$beamColor$delegate", v6);
                N.V0 v7 = this.f4320l;
                E4.k.f("$whiteAlpha$delegate", v7);
                E4.k.f("$this$Canvas", dVar);
                long j4 = ((p035g0.r) v6.getValue()).f9087a;
                p006b.a.s(dVar, c0704e, new C0709j(j4, 5, C0710k.f9071a.a(j4, 5)), 1.0f);
                p006b.a.s(dVar, c0704e2, null, ((Number) v7.getValue()).floatValue());
                break;
        }
        return p084p4.x.f10867a;
    }
}

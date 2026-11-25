package L;

import p123x.AbstractC1078k;
import p123x.C1072e;
import p123x.InterfaceC1073f;
import p123x.InterfaceC1074g;

/* JADX INFO: renamed from: L.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0160n extends E4.l implements D4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p113v0.N f2846h;
    public final /* synthetic */ int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p113v0.N f2847j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1073f f2848k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f2849l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p113v0.N f2850m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ p113v0.H f2851n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1074g f2852o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0160n(p113v0.N n6, int i, p113v0.N n7, InterfaceC1073f interfaceC1073f, long j4, p113v0.N n8, p113v0.H h6, InterfaceC1074g interfaceC1074g, int i3) {
        super(1);
        this.f2846h = n6;
        this.i = i;
        this.f2847j = n7;
        this.f2848k = interfaceC1073f;
        this.f2849l = j4;
        this.f2850m = n8;
        this.f2851n = h6;
        this.f2852o = interfaceC1074g;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        int iMax;
        int iH;
        p113v0.M m6 = (p113v0.M) obj;
        p113v0.N n6 = this.f2846h;
        int i = n6.i;
        int i3 = this.i;
        int i6 = 0;
        p113v0.M.f(m6, n6, 0, (i3 - i) / 2);
        C1072e c1072e = AbstractC1078k.f13781e;
        InterfaceC1073f interfaceC1073f = this.f2848k;
        boolean zA = E4.k.a(interfaceC1073f, c1072e);
        p113v0.N n7 = this.f2847j;
        p113v0.N n8 = this.f2850m;
        long j4 = this.f2849l;
        if (zA) {
            int iH2 = S0.a.h(j4);
            int i7 = n7.f13137h;
            iMax = (iH2 - i7) / 2;
            int i8 = n6.f13137h;
            if (iMax < i8) {
                iH = i8 - iMax;
            } else if (i7 + iMax > S0.a.h(j4) - n8.f13137h) {
                iH = (S0.a.h(j4) - n8.f13137h) - (n7.f13137h + iMax);
            }
            iMax += iH;
        } else if (E4.k.a(interfaceC1073f, AbstractC1078k.f13778b)) {
            iMax = (S0.a.h(j4) - n7.f13137h) - n8.f13137h;
        } else {
            iMax = Math.max(this.f2851n.H(AbstractC0169q.f2880b), n6.f13137h);
        }
        InterfaceC1074g interfaceC1074g = this.f2852o;
        if (E4.k.a(interfaceC1074g, c1072e)) {
            i6 = (i3 - n7.i) / 2;
        } else if (E4.k.a(interfaceC1074g, AbstractC1078k.f13780d)) {
            i6 = i3 - n7.i;
        }
        p113v0.M.f(m6, n7, iMax, i6);
        p113v0.M.f(m6, n8, S0.a.h(j4) - n8.f13137h, (i3 - n8.i) / 2);
        return p084p4.x.f10867a;
    }
}

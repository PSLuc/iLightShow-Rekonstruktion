package androidx.compose.ui.draw;

import E4.k;
import Z.c;
import Z.n;
import p019d0.h;
import p030f0.f;
import p035g0.C0709j;
import p053k0.b;
import p113v0.C1025h;
import p124x0.AbstractC1098f;
import p124x0.Q;

/* JADX INFO: loaded from: classes.dex */
final class PainterElement extends Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f6684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f6685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1025h f6686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f6687d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0709j f6688e;

    public PainterElement(b bVar, c cVar, C1025h c1025h, float f6, C0709j c0709j) {
        this.f6684a = bVar;
        this.f6685b = cVar;
        this.f6686c = c1025h;
        this.f6687d = f6;
        this.f6688e = c0709j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PainterElement)) {
            return false;
        }
        PainterElement painterElement = (PainterElement) obj;
        return k.a(this.f6684a, painterElement.f6684a) && k.a(this.f6685b, painterElement.f6685b) && k.a(this.f6686c, painterElement.f6686c) && Float.compare(this.f6687d, painterElement.f6687d) == 0 && k.a(this.f6688e, painterElement.f6688e);
    }

    public final int hashCode() {
        int i = p012c.k.i(this.f6687d, (this.f6686c.hashCode() + ((this.f6685b.hashCode() + p012c.k.m(true, this.f6684a.hashCode() * 31, 31)) * 31)) * 31, 31);
        C0709j c0709j = this.f6688e;
        return i + (c0709j == null ? 0 : c0709j.hashCode());
    }

    @Override // p124x0.Q
    public final n l() {
        h hVar = new h();
        hVar.f8575u = this.f6684a;
        hVar.f8576v = true;
        hVar.f8577w = this.f6685b;
        hVar.f8578x = this.f6686c;
        hVar.f8579y = this.f6687d;
        hVar.f8580z = this.f6688e;
        return hVar;
    }

    @Override // p124x0.Q
    public final void m(n nVar) {
        h hVar = (h) nVar;
        boolean z5 = hVar.f8576v;
        b bVar = this.f6684a;
        boolean z6 = (z5 && f.a(hVar.f8575u.d(), bVar.d())) ? false : true;
        hVar.f8575u = bVar;
        hVar.f8576v = true;
        hVar.f8577w = this.f6685b;
        hVar.f8578x = this.f6686c;
        hVar.f8579y = this.f6687d;
        hVar.f8580z = this.f6688e;
        if (z6) {
            AbstractC1098f.m(hVar);
        }
        AbstractC1098f.l(hVar);
    }

    public final String toString() {
        return "PainterElement(painter=" + this.f6684a + ", sizeToIntrinsics=true, alignment=" + this.f6685b + ", contentScale=" + this.f6686c + ", alpha=" + this.f6687d + ", colorFilter=" + this.f6688e + ')';
    }
}

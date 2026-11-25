package p058l0;

import E4.k;
import G4.a;
import android.graphics.Path;
import p035g0.AbstractC0712m;
import p035g0.C0706g;
import p035g0.C0707h;
import p035g0.H;
import p044i0.d;
import p044i0.h;
import p084p4.g;
import p089q4.u;

/* JADX INFO: renamed from: l0.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0825h extends C {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AbstractC0712m f10294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f10295c = 1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f10296d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f10297e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f10298f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AbstractC0712m f10299g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f10300h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f10301j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f10302k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f10303l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f10304m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f10305n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f10306o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f10307p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public h f10308q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C0706g f10309r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C0706g f10310s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f10311t;

    public C0825h() {
        int i = G.f10217a;
        this.f10296d = u.f11237h;
        this.f10297e = 1.0f;
        this.f10300h = 0;
        this.i = 0;
        this.f10301j = 4.0f;
        this.f10303l = 1.0f;
        this.f10305n = true;
        this.f10306o = true;
        C0706g c0706gH = H.h();
        this.f10309r = c0706gH;
        this.f10310s = c0706gH;
        this.f10311t = a.y(g.i, C0824g.i);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    @Override // p058l0.C
    public final void a(d dVar) {
        d dVar2;
        h hVar;
        if (this.f10305n) {
            AbstractC0819b.d(this.f10296d, this.f10309r);
            e();
        } else if (this.f10307p) {
            e();
        }
        this.f10305n = false;
        this.f10307p = false;
        AbstractC0712m abstractC0712m = this.f10294b;
        if (abstractC0712m != null) {
            dVar2 = dVar;
            d.t(dVar2, this.f10310s, abstractC0712m, this.f10295c, null, 56);
        } else {
            dVar2 = dVar;
        }
        AbstractC0712m abstractC0712m2 = this.f10299g;
        if (abstractC0712m2 != null) {
            h hVar2 = this.f10308q;
            if (this.f10306o || hVar2 == null) {
                h hVar3 = new h(this.f10298f, this.f10301j, this.f10300h, this.i, 16);
                this.f10308q = hVar3;
                this.f10306o = false;
                hVar = hVar3;
            } else {
                hVar = hVar2;
            }
            d.t(dVar2, this.f10310s, abstractC0712m2, this.f10297e, hVar, 48);
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, p4.f] */
    public final void e() {
        Path path;
        float f6 = this.f10302k;
        C0706g c0706g = this.f10309r;
        if (f6 == 0.0f && this.f10303l == 1.0f) {
            this.f10310s = c0706g;
            return;
        }
        if (k.a(this.f10310s, c0706g)) {
            this.f10310s = H.h();
        } else {
            Path.FillType fillType = this.f10310s.f9063a.getFillType();
            Path.FillType fillType2 = Path.FillType.EVEN_ODD;
            boolean z5 = fillType == fillType2;
            this.f10310s.f9063a.rewind();
            C0706g c0706g2 = this.f10310s;
            c0706g2.getClass();
            if (!z5) {
                fillType2 = Path.FillType.WINDING;
            }
            c0706g2.f9063a.setFillType(fillType2);
        }
        ?? r6 = this.f10311t;
        C0707h c0707h = (C0707h) r6.getValue();
        if (c0706g != null) {
            c0707h.getClass();
            path = c0706g.f9063a;
        } else {
            path = null;
        }
        c0707h.f9067a.setPath(path, false);
        float length = ((C0707h) r6.getValue()).f9067a.getLength();
        float f7 = this.f10302k;
        float f8 = this.f10304m;
        float f9 = ((f7 + f8) % 1.0f) * length;
        float f10 = ((this.f10303l + f8) % 1.0f) * length;
        if (f9 <= f10) {
            ((C0707h) r6.getValue()).a(f9, f10, this.f10310s);
        } else {
            ((C0707h) r6.getValue()).a(f9, length, this.f10310s);
            ((C0707h) r6.getValue()).a(0.0f, f10, this.f10310s);
        }
    }

    public final String toString() {
        return this.f10309r.toString();
    }
}

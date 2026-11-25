package p093r2;

import K.y;
import java.util.Collections;
import java.util.List;
import p015c2.C;
import p046i2.AbstractC0771g;
import p046i2.r;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static final b[] i = new b[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f11748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C f11749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f11750c = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b[] f11751d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public H1.d f11752e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f11753f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AbstractC0771g f11754g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public y f11755h;

    public d(r rVar) {
        this.f11748a = rVar;
    }

    public final c a() {
        b[] bVarArr;
        if (this.f11754g != null && this.f11749b.k(p015c2.r.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
            this.f11754g.m(this.f11749b.k(p015c2.r.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        H1.d dVar = this.f11752e;
        if (dVar != null) {
            ((AbstractC0771g) dVar.f1757h).m(this.f11749b.k(p015c2.r.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        List list = this.f11750c;
        if (list == null || list.isEmpty()) {
            if (this.f11752e == null && this.f11755h == null) {
                return null;
            }
            bVarArr = i;
        } else {
            List list2 = this.f11750c;
            bVarArr = (b[]) list2.toArray(new b[list2.size()]);
            if (this.f11749b.k(p015c2.r.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
                for (b bVar : bVarArr) {
                    C c6 = this.f11749b;
                    bVar.getClass();
                    bVar.f11737o.m(c6.k(p015c2.r.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
                }
            }
        }
        b[] bVarArr2 = this.f11751d;
        if (bVarArr2 == null || bVarArr2.length == this.f11750c.size()) {
            return new c(this.f11748a.f9562a, this, bVarArr, this.f11751d);
        }
        throw new IllegalStateException(String.format("Mismatch between `properties` size (%d), `filteredProperties` (%s): should have as many (or `null` for latter)", Integer.valueOf(this.f11750c.size()), Integer.valueOf(this.f11751d.length)));
    }
}

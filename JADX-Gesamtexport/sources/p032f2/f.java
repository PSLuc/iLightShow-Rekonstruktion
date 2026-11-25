package p032f2;

import S1.EnumC0352n;
import com.fasterxml.jackson.databind.DatabindException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p015c2.A;
import p015c2.B;
import p015c2.C0474e;
import p015c2.z;
import p037g2.C0719c;
import p037g2.t;
import p046i2.C0772h;
import p046i2.r;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0474e f8901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p015c2.f f8902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f8903c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f8904d = new LinkedHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f8905e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public HashMap f8906f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public HashSet f8907g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public HashSet f8908h;
    public t i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p037g2.r f8909j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public p f8910k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f8911l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public C0772h f8912m;

    public f(p015c2.f fVar, r rVar) {
        this.f8903c = rVar;
        this.f8902b = fVar;
        this.f8901a = fVar.f7249l;
    }

    public final Map a(Collection collection) {
        B bD = this.f8901a.d();
        Iterator it = collection.iterator();
        HashMap map = null;
        while (it.hasNext()) {
            r rVar = (r) it.next();
            List listD = bD.D(rVar.e());
            if (listD != null && !listD.isEmpty()) {
                if (map == null) {
                    map = new HashMap();
                }
                map.put(rVar.f8933j.f7195h, listD);
            }
        }
        return map == null ? Collections.EMPTY_MAP : map;
    }

    public final void b(Collection collection) {
        C0474e c0474e = this.f8901a;
        c0474e.getClass();
        if (c0474e.k(p015c2.r.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                try {
                    ((r) it.next()).m(c0474e);
                } catch (IllegalArgumentException e6) {
                    c(e6);
                    throw null;
                }
            }
        }
        p pVar = this.f8910k;
        if (pVar != null) {
            try {
                pVar.getClass();
                pVar.i.m(c0474e.k(p015c2.r.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
            } catch (IllegalArgumentException e7) {
                c(e7);
                throw null;
            }
        }
        C0772h c0772h = this.f8912m;
        if (c0772h != null) {
            try {
                c0772h.m(c0474e.k(p015c2.r.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
            } catch (IllegalArgumentException e8) {
                c(e8);
                throw null;
            }
        }
    }

    public final void c(IllegalArgumentException illegalArgumentException) throws DatabindException {
        try {
            this.f8902b.H0(this.f8903c, illegalArgumentException.getMessage(), new Object[0]);
            throw null;
        } catch (DatabindException e6) {
            if (e6.getCause() == null) {
                e6.initCause(illegalArgumentException);
            }
            throw e6;
        }
    }

    public final void d(String str) {
        if (this.f8907g == null) {
            this.f8907g = new HashSet();
        }
        this.f8907g.add(str);
    }

    public final void e(r rVar) {
        LinkedHashMap linkedHashMap = this.f8904d;
        A a6 = rVar.f8933j;
        r rVar2 = (r) linkedHashMap.put(a6.f7195h, rVar);
        if (rVar2 == null || rVar2 == rVar) {
            return;
        }
        throw new IllegalArgumentException("Duplicate property '" + a6.f7195h + "' for " + this.f8903c.f9562a);
    }

    public final d f() {
        Collection collectionValues = this.f8904d.values();
        b(collectionValues);
        Map mapA = a(collectionValues);
        Boolean boolB = this.f8903c.d().b(EnumC0352n.i);
        C0474e c0474e = this.f8901a;
        C0719c c0719c = new C0719c(boolB == null ? c0474e.k(p015c2.r.ACCEPT_CASE_INSENSITIVE_PROPERTIES) : boolB.booleanValue(), collectionValues, mapA, c0474e.i.f8684m);
        c0719c.g();
        boolean zK = c0474e.k(p015c2.r.DEFAULT_VIEW_INCLUSION);
        boolean z5 = !zK;
        if (zK) {
            Iterator it = collectionValues.iterator();
            while (it.hasNext()) {
                if (((r) it.next()).v()) {
                    z5 = true;
                    break;
                }
            }
        }
        boolean z6 = z5;
        if (this.f8909j != null) {
            c0719c = c0719c.m(new t(this.f8909j, z.f7337o));
        }
        return new d(this, this.f8903c, c0719c, this.f8906f, this.f8907g, this.f8911l, this.f8908h, z6);
    }
}

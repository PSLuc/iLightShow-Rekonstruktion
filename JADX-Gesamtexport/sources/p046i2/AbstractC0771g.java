package p046i2;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Member;
import java.util.HashMap;
import p035g0.C0715p;
import p109u2.i;

/* JADX INFO: renamed from: i2.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0771g extends q implements Serializable {
    public final transient J i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final transient C0715p f9546j;

    public AbstractC0771g(J j4, C0715p c0715p) {
        this.i = j4;
        this.f9546j = c0715p;
    }

    @Override // p046i2.q
    public final Annotation f(Class cls) {
        C0715p c0715p = this.f9546j;
        if (c0715p == null) {
            return null;
        }
        return c0715p.d(cls);
    }

    public final void m(boolean z5) {
        Member memberP = p();
        if (memberP != null) {
            i.e(memberP, z5);
        }
    }

    public abstract Class n();

    public String o() {
        return n().getName() + "#" + getName();
    }

    public abstract Member p();

    public abstract Object q(Object obj);

    public final boolean r(Class cls) {
        HashMap map;
        C0715p c0715p = this.f9546j;
        if (c0715p == null || (map = (HashMap) c0715p.i) == null) {
            return false;
        }
        return map.containsKey(cls);
    }

    public final boolean s(Class[] clsArr) {
        C0715p c0715p = this.f9546j;
        if (c0715p == null || ((HashMap) c0715p.i) == null) {
            return false;
        }
        for (Class cls : clsArr) {
            if (((HashMap) c0715p.i).containsKey(cls)) {
                return true;
            }
        }
        return false;
    }

    public abstract q t(C0715p c0715p);
}

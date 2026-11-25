package p104t2;

import T1.e;
import T1.k;
import p003a2.a;
import p015c2.E;
import p015c2.h;
import p015c2.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class j extends h implements m {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final m f12512s = m.f12529n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final h f12513p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final h[] f12514q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final m f12515r;

    public j(Class cls, m mVar, h hVar, h[] hVarArr, int i, Object obj, Object obj2, boolean z5) {
        super(cls, i, obj, obj2, z5);
        this.f12515r = mVar == null ? f12512s : mVar;
        this.f12513p = hVar;
        this.f12514q = hVarArr;
    }

    public static void x0(Class cls, StringBuilder sb, boolean z5) {
        if (!cls.isPrimitive()) {
            sb.append('L');
            String name = cls.getName();
            int length = name.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = name.charAt(i);
                if (cCharAt == '.') {
                    cCharAt = '/';
                }
                sb.append(cCharAt);
            }
            if (z5) {
                sb.append(';');
                return;
            }
            return;
        }
        if (cls == Boolean.TYPE) {
            sb.append('Z');
            return;
        }
        if (cls == Byte.TYPE) {
            sb.append('B');
            return;
        }
        if (cls == Short.TYPE) {
            sb.append('S');
            return;
        }
        if (cls == Character.TYPE) {
            sb.append('C');
            return;
        }
        if (cls == Integer.TYPE) {
            sb.append('I');
            return;
        }
        if (cls == Long.TYPE) {
            sb.append('J');
            return;
        }
        if (cls == Float.TYPE) {
            sb.append('F');
        } else if (cls == Double.TYPE) {
            sb.append('D');
        } else {
            if (cls != Void.TYPE) {
                throw new IllegalStateException("Unrecognized primitive type: ".concat(cls.getName()));
            }
            sb.append('V');
        }
    }

    @Override // p015c2.h
    public final h W(Class cls) {
        h hVarW;
        h[] hVarArr;
        if (cls == this.f7281k) {
            return this;
        }
        if (cls.isInterface() && (hVarArr = this.f12514q) != null) {
            for (h hVar : hVarArr) {
                h hVarW2 = hVar.W(cls);
                if (hVarW2 != null) {
                    return hVarW2;
                }
            }
        }
        h hVar2 = this.f12513p;
        if (hVar2 == null || (hVarW = hVar2.W(cls)) == null) {
            return null;
        }
        return hVarW;
    }

    @Override // p015c2.h
    public m X() {
        return this.f12515r;
    }

    @Override // p015c2.m
    public final void c(e eVar, E e6) {
        eVar.s0(y0());
    }

    @Override // p015c2.m
    public final void d(e eVar, E e6, p071n2.e eVar2) {
        a aVar = new a(k.VALUE_STRING, this);
        eVar2.e(eVar, aVar);
        c(eVar, e6);
        eVar2.f(eVar, aVar);
    }

    @Override // p015c2.h
    public h d0() {
        return this.f12513p;
    }

    public String y0() {
        return this.f7281k.getName();
    }
}

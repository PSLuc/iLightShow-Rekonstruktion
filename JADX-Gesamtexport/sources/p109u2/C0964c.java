package p109u2;

import B.AbstractC0013g0;
import F.C0068j;

/* JADX INFO: renamed from: u2.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0964c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f12680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0068j f12681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0068j f12682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12683d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f12684e;

    public final Object a(int i) {
        switch (this.f12684e) {
            case 0:
                return new boolean[i];
            case 1:
                return new byte[i];
            case 2:
                return new double[i];
            case 3:
                return new float[i];
            case 4:
                return new int[i];
            case 5:
                return new long[i];
            default:
                return new short[i];
        }
    }

    public final Object b(int i, Object obj) {
        C0068j c0068j = new C0068j(i, obj);
        if (this.f12681b == null) {
            this.f12682c = c0068j;
            this.f12681b = c0068j;
        } else {
            C0068j c0068j2 = this.f12682c;
            if (((C0068j) c0068j2.f1184d) != null) {
                throw new IllegalStateException();
            }
            c0068j2.f1184d = c0068j;
            this.f12682c = c0068j;
        }
        this.f12683d += i;
        return a(i < 16384 ? i + i : i + (i >> 2));
    }

    public final Object c(int i, Object obj) {
        int i3 = this.f12683d + i;
        Object objA = a(i3);
        int i6 = 0;
        for (C0068j c0068j = this.f12681b; c0068j != null; c0068j = (C0068j) c0068j.f1184d) {
            Object obj2 = c0068j.f1183c;
            int i7 = c0068j.f1182b;
            System.arraycopy(obj2, 0, objA, i6, i7);
            i6 += i7;
        }
        System.arraycopy(obj, 0, objA, i6, i);
        int i8 = i6 + i;
        if (i8 == i3) {
            return objA;
        }
        throw new IllegalStateException(AbstractC0013g0.g("Should have gotten ", i3, i8, " entries, got "));
    }

    public final Object d() {
        C0068j c0068j = this.f12682c;
        if (c0068j != null) {
            this.f12680a = c0068j.f1183c;
        }
        this.f12682c = null;
        this.f12681b = null;
        this.f12683d = 0;
        Object obj = this.f12680a;
        return obj == null ? a(12) : obj;
    }
}

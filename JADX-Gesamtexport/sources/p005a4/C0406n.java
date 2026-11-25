package p005a4;

import R3.c;
import p027e3.a;
import p043h4.b;
import p043h4.f;

/* JADX INFO: renamed from: a4.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0406n extends b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object[] f6285h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile boolean f6286j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f6287k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c f6288l;

    public C0406n(c cVar, Object[] objArr, int i) {
        this.f6287k = i;
        this.f6285h = objArr;
        this.f6288l = cVar;
    }

    @Override // u5.c
    public final void cancel() {
        this.f6286j = true;
    }

    @Override // X3.h
    public final void clear() {
        this.i = this.f6285h.length;
    }

    @Override // u5.c
    public final void e(long j4) {
        if (f.f(j4) && a.O(this, j4) == 0) {
            if (j4 == Long.MAX_VALUE) {
                switch (this.f6287k) {
                    case 0:
                        Object[] objArr = this.f6285h;
                        int length = objArr.length;
                        X3.a aVar = (X3.a) this.f6288l;
                        for (int i = this.i; i != length; i++) {
                            if (!this.f6286j) {
                                Object obj = objArr[i];
                                if (obj == null) {
                                    aVar.onError(new NullPointerException("array element is null"));
                                } else {
                                    aVar.g(obj);
                                }
                            }
                            break;
                        }
                        if (!this.f6286j) {
                            aVar.b();
                            break;
                        }
                        break;
                    default:
                        Object[] objArr2 = this.f6285h;
                        int length2 = objArr2.length;
                        c cVar = this.f6288l;
                        for (int i3 = this.i; i3 != length2; i3++) {
                            if (!this.f6286j) {
                                Object obj2 = objArr2[i3];
                                if (obj2 == null) {
                                    cVar.onError(new NullPointerException("array element is null"));
                                } else {
                                    cVar.c(obj2);
                                }
                            }
                            break;
                        }
                        if (!this.f6286j) {
                            cVar.b();
                            break;
                        }
                        break;
                }
            }
            switch (this.f6287k) {
                case 0:
                    Object[] objArr3 = this.f6285h;
                    int length3 = objArr3.length;
                    int i6 = this.i;
                    X3.a aVar2 = (X3.a) this.f6288l;
                    do {
                        long j6 = 0;
                        while (true) {
                            if (j6 != j4 && i6 != length3) {
                                if (!this.f6286j) {
                                    Object obj3 = objArr3[i6];
                                    if (obj3 == null) {
                                        aVar2.onError(new NullPointerException("array element is null"));
                                    } else {
                                        if (aVar2.g(obj3)) {
                                            j6++;
                                        }
                                        i6++;
                                    }
                                }
                                break;
                            } else if (i6 == length3) {
                                if (!this.f6286j) {
                                    aVar2.b();
                                }
                                break;
                            } else {
                                j4 = get();
                                if (j6 == j4) {
                                }
                            }
                        }
                        this.i = i6;
                        j4 = addAndGet(-j6);
                    } while (j4 != 0);
                    break;
                default:
                    Object[] objArr4 = this.f6285h;
                    int length4 = objArr4.length;
                    int i7 = this.i;
                    c cVar2 = this.f6288l;
                    do {
                        long j7 = 0;
                        while (true) {
                            if (j7 != j4 && i7 != length4) {
                                if (!this.f6286j) {
                                    Object obj4 = objArr4[i7];
                                    if (obj4 == null) {
                                        cVar2.onError(new NullPointerException("array element is null"));
                                    } else {
                                        cVar2.c(obj4);
                                        j7++;
                                        i7++;
                                    }
                                }
                                break;
                            } else if (i7 == length4) {
                                if (!this.f6286j) {
                                    cVar2.b();
                                }
                                break;
                            } else {
                                j4 = get();
                                if (j7 == j4) {
                                }
                            }
                        }
                        this.i = i7;
                        j4 = addAndGet(-j7);
                    } while (j4 != 0);
                    break;
            }
        }
    }

    @Override // X3.d
    public final int i(int i) {
        return 1;
    }

    @Override // X3.h
    public final boolean isEmpty() {
        return this.i == this.f6285h.length;
    }

    @Override // X3.h
    public final Object poll() {
        int i = this.i;
        Object[] objArr = this.f6285h;
        if (i == objArr.length) {
            return null;
        }
        this.i = i + 1;
        Object obj = objArr[i];
        W3.b.a("array element is null", obj);
        return obj;
    }
}

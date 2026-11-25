package p005a4;

import R3.c;
import p027e3.a;
import p043h4.b;
import p043h4.f;

/* JADX INFO: loaded from: classes.dex */
public final class C extends b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f6176h;
    public int i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile boolean f6177j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f6178k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c f6179l;

    public C(c cVar, int i, int i3) {
        this.f6178k = i3;
        this.f6176h = i;
        this.f6179l = cVar;
    }

    @Override // u5.c
    public final void cancel() {
        this.f6177j = true;
    }

    @Override // X3.h
    public final void clear() {
        this.i = this.f6176h;
    }

    @Override // u5.c
    public final void e(long j4) {
        if (f.f(j4) && a.O(this, j4) == 0) {
            if (j4 == Long.MAX_VALUE) {
                switch (this.f6178k) {
                    case 0:
                        int i = this.f6176h;
                        X3.a aVar = (X3.a) this.f6179l;
                        for (int i3 = this.i; i3 != i; i3++) {
                            if (!this.f6177j) {
                                aVar.g(Integer.valueOf(i3));
                            }
                            break;
                        }
                        if (!this.f6177j) {
                            aVar.b();
                            break;
                        }
                        break;
                    default:
                        int i6 = this.f6176h;
                        c cVar = this.f6179l;
                        for (int i7 = this.i; i7 != i6; i7++) {
                            if (!this.f6177j) {
                                cVar.c(Integer.valueOf(i7));
                            }
                            break;
                        }
                        if (!this.f6177j) {
                            cVar.b();
                            break;
                        }
                        break;
                }
            }
            switch (this.f6178k) {
                case 0:
                    int i8 = this.f6176h;
                    int i9 = this.i;
                    X3.a aVar2 = (X3.a) this.f6179l;
                    do {
                        long j6 = 0;
                        while (true) {
                            if (j6 != j4 && i9 != i8) {
                                if (!this.f6177j) {
                                    if (aVar2.g(Integer.valueOf(i9))) {
                                        j6++;
                                    }
                                    i9++;
                                }
                                break;
                            } else if (i9 == i8) {
                                if (!this.f6177j) {
                                    aVar2.b();
                                }
                                break;
                            } else {
                                j4 = get();
                                if (j6 == j4) {
                                }
                            }
                        }
                        this.i = i9;
                        j4 = addAndGet(-j6);
                    } while (j4 != 0);
                    break;
                default:
                    int i10 = this.f6176h;
                    int i11 = this.i;
                    c cVar2 = this.f6179l;
                    do {
                        long j7 = 0;
                        while (true) {
                            if (j7 != j4 && i11 != i10) {
                                if (!this.f6177j) {
                                    cVar2.c(Integer.valueOf(i11));
                                    j7++;
                                    i11++;
                                }
                                break;
                            } else if (i11 == i10) {
                                if (!this.f6177j) {
                                    cVar2.b();
                                }
                                break;
                            } else {
                                j4 = get();
                                if (j7 == j4) {
                                }
                            }
                        }
                        this.i = i11;
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
        return this.i == this.f6176h;
    }

    @Override // X3.h
    public final Object poll() {
        int i = this.i;
        if (i == this.f6176h) {
            return null;
        }
        this.i = i + 1;
        return Integer.valueOf(i);
    }
}

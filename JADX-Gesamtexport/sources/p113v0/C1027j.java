package p113v0;

import S0.a;

/* JADX INFO: renamed from: v0.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1027j implements E {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f13169h;
    public final E i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f13170j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f13171k;

    public /* synthetic */ C1027j(E e6, int i, int i3, int i6) {
        this.f13169h = i6;
        this.i = e6;
        this.f13170j = i;
        this.f13171k = i3;
    }

    @Override // p113v0.E
    public final int U(int i) {
        switch (this.f13169h) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.i.U(i);
    }

    @Override // p113v0.E
    public final int Y(int i) {
        switch (this.f13169h) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.i.Y(i);
    }

    @Override // p113v0.E
    public final int Z(int i) {
        switch (this.f13169h) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.i.Z(i);
    }

    @Override // p113v0.E
    public final N c(long j4) {
        switch (this.f13169h) {
            case 0:
                int i = this.f13171k;
                int i3 = this.f13170j;
                E e6 = this.i;
                if (i == 1) {
                    return new C1028k(i3 == 2 ? e6.Y(a.g(j4)) : e6.U(a.g(j4)), a.c(j4) ? a.g(j4) : 32767, 0);
                }
                return new C1028k(a.d(j4) ? a.h(j4) : 32767, i3 == 2 ? e6.d(a.h(j4)) : e6.Z(a.h(j4)), 0);
            case 1:
                int i6 = this.f13171k;
                int i7 = this.f13170j;
                E e7 = this.i;
                if (i6 == 1) {
                    return new C1028k(i7 == 2 ? e7.Y(a.g(j4)) : e7.U(a.g(j4)), a.c(j4) ? a.g(j4) : 32767, 1);
                }
                return new C1028k(a.d(j4) ? a.h(j4) : 32767, i7 == 2 ? e7.d(a.h(j4)) : e7.Z(a.h(j4)), 1);
            default:
                int i8 = this.f13171k;
                int i9 = this.f13170j;
                E e8 = this.i;
                if (i8 == 1) {
                    return new C1028k(i9 == 2 ? e8.Y(a.g(j4)) : e8.U(a.g(j4)), a.c(j4) ? a.g(j4) : 32767, 2);
                }
                return new C1028k(a.d(j4) ? a.h(j4) : 32767, i9 == 2 ? e8.d(a.h(j4)) : e8.Z(a.h(j4)), 2);
        }
    }

    @Override // p113v0.E
    public final int d(int i) {
        switch (this.f13169h) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.i.d(i);
    }

    @Override // p113v0.E
    public final Object i() {
        switch (this.f13169h) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.i.i();
    }
}

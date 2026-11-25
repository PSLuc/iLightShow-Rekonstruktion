package p123x;

import S0.b;
import S0.k;
import p113v0.H;

/* JADX INFO: renamed from: x.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1072e implements InterfaceC1074g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f13767b;

    public C1072e(int i) {
        this.f13766a = i;
        switch (i) {
            case 1:
                this.f13767b = 0;
                break;
            case 2:
                this.f13767b = 0;
                break;
            case 3:
                this.f13767b = 0;
                break;
            default:
                this.f13767b = 0;
                break;
        }
    }

    @Override // p123x.InterfaceC1073f, p123x.InterfaceC1076i
    public final float a() {
        switch (this.f13766a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return this.f13767b;
    }

    @Override // p123x.InterfaceC1073f
    public final void b(b bVar, int i, int[] iArr, k kVar, int[] iArr2) {
        switch (this.f13766a) {
            case 0:
                if (kVar != k.f4897h) {
                    AbstractC1078k.a(i, iArr, iArr2, true);
                } else {
                    AbstractC1078k.a(i, iArr, iArr2, false);
                }
                break;
            case 1:
                if (kVar != k.f4897h) {
                    AbstractC1078k.d(i, iArr, iArr2, true);
                } else {
                    AbstractC1078k.d(i, iArr, iArr2, false);
                }
                break;
            case 2:
                if (kVar != k.f4897h) {
                    AbstractC1078k.e(i, iArr, iArr2, true);
                } else {
                    AbstractC1078k.e(i, iArr, iArr2, false);
                }
                break;
            default:
                if (kVar != k.f4897h) {
                    AbstractC1078k.f(i, iArr, iArr2, true);
                } else {
                    AbstractC1078k.f(i, iArr, iArr2, false);
                }
                break;
        }
    }

    @Override // p123x.InterfaceC1076i
    public final void c(int i, H h6, int[] iArr, int[] iArr2) {
        switch (this.f13766a) {
            case 0:
                AbstractC1078k.a(i, iArr, iArr2, false);
                break;
            case 1:
                AbstractC1078k.d(i, iArr, iArr2, false);
                break;
            case 2:
                AbstractC1078k.e(i, iArr, iArr2, false);
                break;
            default:
                AbstractC1078k.f(i, iArr, iArr2, false);
                break;
        }
    }

    public final String toString() {
        switch (this.f13766a) {
            case 0:
                return "Arrangement#Center";
            case 1:
                return "Arrangement#SpaceAround";
            case 2:
                return "Arrangement#SpaceBetween";
            default:
                return "Arrangement#SpaceEvenly";
        }
    }
}

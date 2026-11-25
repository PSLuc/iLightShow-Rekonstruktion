package p123x;

import p113v0.H;

/* JADX INFO: renamed from: x.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1071d implements InterfaceC1076i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13764a;

    @Override // p123x.InterfaceC1076i
    public final void c(int i, H h6, int[] iArr, int[] iArr2) {
        switch (this.f13764a) {
            case 0:
                AbstractC1078k.c(i, iArr, iArr2, false);
                break;
            default:
                AbstractC1078k.b(iArr, iArr2, false);
                break;
        }
    }

    public final String toString() {
        switch (this.f13764a) {
            case 0:
                return "Arrangement#Bottom";
            default:
                return "Arrangement#Top";
        }
    }
}

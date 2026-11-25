package p130y0;

import E0.f;
import java.util.ArrayList;
import p124x0.g0;

/* JADX INFO: renamed from: y0.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1169z0 implements g0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f14570h;
    public final ArrayList i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Float f14571j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Float f14572k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public f f14573l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public f f14574m = null;

    public C1169z0(int i, ArrayList arrayList) {
        this.f14570h = i;
        this.i = arrayList;
    }

    @Override // p124x0.g0
    public final boolean z() {
        return this.i.contains(this);
    }
}

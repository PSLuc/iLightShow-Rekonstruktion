package p092r1;

import p111u4.d;
import p122w4.c;

/* JADX INFO: renamed from: r1.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0902x extends c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public J f11715k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public U f11716l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f11717m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f11718n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ J f11719o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f11720p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0902x(J j4, d dVar) {
        super(dVar);
        this.f11719o = j4;
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        this.f11718n = obj;
        this.f11720p |= Integer.MIN_VALUE;
        return J.e(this.f11719o, false, this);
    }
}

package p092r1;

import E4.w;
import java.io.Serializable;
import p122w4.c;

/* JADX INFO: loaded from: classes.dex */
public final class A extends c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f11551k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f11552l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Serializable f11553m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public w f11554n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f11555o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f11556p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f11557q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ J f11558r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f11559s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(J j4, c cVar) {
        super(cVar);
        this.f11558r = j4;
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        this.f11557q = obj;
        this.f11559s |= Integer.MIN_VALUE;
        return J.f(this.f11558r, false, this);
    }
}

package d5;

import S1.h0;
import c5.D;
import c5.p0;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class t implements a5.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t f8627b = new t();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f8628c = "kotlinx.serialization.json.JsonObject";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ D f8629a;

    public t() {
        p0 p0Var = p0.f7477a;
        l lVar = l.f8619a;
        p0 p0Var2 = p0.f7477a;
        l lVar2 = l.f8619a;
        a5.g descriptor = p0Var2.getDescriptor();
        a5.g descriptor2 = lVar2.getDescriptor();
        E4.k.f("keyDesc", descriptor);
        E4.k.f("valueDesc", descriptor2);
        this.f8629a = new D("kotlin.collections.LinkedHashMap", descriptor, descriptor2);
    }

    @Override // a5.g
    public final int a(String str) {
        E4.k.f("name", str);
        return this.f8629a.a(str);
    }

    @Override // a5.g
    public final String b() {
        return f8628c;
    }

    @Override // a5.g
    public final h0 c() {
        this.f8629a.getClass();
        return a5.j.f6376l;
    }

    @Override // a5.g
    public final List d() {
        this.f8629a.getClass();
        return p089q4.u.f11237h;
    }

    @Override // a5.g
    public final int e() {
        this.f8629a.getClass();
        return 2;
    }

    @Override // a5.g
    public final String f(int i) {
        this.f8629a.getClass();
        return String.valueOf(i);
    }

    @Override // a5.g
    public final boolean g() {
        this.f8629a.getClass();
        return false;
    }

    @Override // a5.g
    public final boolean i() {
        this.f8629a.getClass();
        return false;
    }

    @Override // a5.g
    public final List j(int i) {
        this.f8629a.j(i);
        return p089q4.u.f11237h;
    }

    @Override // a5.g
    public final a5.g k(int i) {
        return this.f8629a.k(i);
    }

    @Override // a5.g
    public final boolean l(int i) {
        this.f8629a.l(i);
        return false;
    }
}

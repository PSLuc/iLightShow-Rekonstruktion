package p046i2;

import S1.h0;
import p015c2.A;
import p109u2.i;

/* JADX INFO: loaded from: classes.dex */
public final class C {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C f9475f = new C(A.f7194l, Object.class, null, false, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A f9476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f9477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Class f9478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Class f9479d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f9480e;

    public C(A a6, Class cls, Class cls2, boolean z5, Class cls3) {
        this.f9476a = a6;
        this.f9479d = cls;
        this.f9477b = cls2;
        this.f9480e = z5;
        this.f9478c = cls3 == null ? h0.class : cls3;
    }

    public final String toString() {
        return "ObjectIdInfo: propName=" + this.f9476a + ", scope=" + i.z(this.f9479d) + ", generatorType=" + i.z(this.f9477b) + ", alwaysAsId=" + this.f9480e;
    }
}

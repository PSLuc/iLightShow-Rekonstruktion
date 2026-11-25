package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class D {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0433s f6788b = new C0433s(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f6789a;

    public D(C0427l c0427l) {
        AbstractC0438x.a("output", c0427l);
        this.f6789a = c0427l;
        c0427l.f6890m = this;
    }

    public void a(int i, Object obj, V v6) {
        C0427l c0427l = (C0427l) this.f6789a;
        c0427l.n0(i, 3);
        v6.e((AbstractC0416a) obj, c0427l.f6890m);
        c0427l.n0(i, 4);
    }

    public D() {
        S s6 = S.f6818c;
        J j4 = f6788b;
        try {
            j4 = (J) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
        }
        J[] jArr = {C0433s.f6923b, j4};
        C c6 = new C();
        c6.f6787a = jArr;
        Charset charset = AbstractC0438x.f6926a;
        this.f6789a = c6;
    }
}

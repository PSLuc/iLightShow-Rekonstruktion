package com.google.protobuf;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class C {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0647o f8152b = new C0647o(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B f8153a;

    public C() {
        G g6;
        try {
            g6 = (G) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            g6 = f8152b;
        }
        G[] gArr = {C0647o.f8221b, g6};
        B b6 = new B();
        b6.f8151a = gArr;
        Charset charset = AbstractC0652u.f8224a;
        this.f8153a = b6;
    }
}

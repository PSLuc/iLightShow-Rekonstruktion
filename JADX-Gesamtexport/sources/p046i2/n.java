package p046i2;

import java.lang.annotation.Annotation;
import p035g0.C0715p;
import p109u2.InterfaceC0963b;

/* JADX INFO: loaded from: classes.dex */
public final class n extends q {
    public static final n i = new n();

    @Override // p046i2.q
    public final q a(Annotation annotation) {
        Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
        p pVar = new p();
        pVar.i = clsAnnotationType;
        pVar.f9559j = annotation;
        return pVar;
    }

    @Override // p046i2.q
    public final C0715p b() {
        return new C0715p(6, false);
    }

    @Override // p046i2.q
    public final InterfaceC0963b d() {
        return q.f9560h;
    }

    @Override // p046i2.q
    public final boolean i(Annotation annotation) {
        return false;
    }
}

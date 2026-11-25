package p046i2;

import java.lang.annotation.Annotation;
import java.util.HashMap;
import p009b2.k;
import p035g0.C0715p;
import p109u2.InterfaceC0963b;

/* JADX INFO: loaded from: classes.dex */
public final class p extends q {
    public Class i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Annotation f9559j;

    @Override // p046i2.q
    public final q a(Annotation annotation) {
        Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
        Class<? extends Annotation> cls = this.i;
        if (cls != clsAnnotationType) {
            return new o(cls, this.f9559j, clsAnnotationType, annotation);
        }
        this.f9559j = annotation;
        return this;
    }

    @Override // p046i2.q
    public final C0715p b() {
        Annotation annotation = this.f9559j;
        HashMap map = new HashMap(4);
        map.put(this.i, annotation);
        return new C0715p(6, map);
    }

    @Override // p046i2.q
    public final InterfaceC0963b d() {
        return new k(this.i, this.f9559j);
    }

    @Override // p046i2.q
    public final boolean i(Annotation annotation) {
        return annotation.annotationType() == this.i;
    }
}

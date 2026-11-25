package p046i2;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import p015c2.B;
import p035g0.C0715p;
import p109u2.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0715p[] f9575b = new C0715p[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Annotation[] f9576c = new Annotation[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B f9577a;

    public v(B b6) {
        this.f9577a = b6;
    }

    public final q a(q qVar, Annotation[] annotationArr) {
        for (Annotation annotation : annotationArr) {
            qVar = qVar.a(annotation);
            if (this.f9577a.l0(annotation)) {
                qVar = d(qVar, annotation);
            }
        }
        return qVar;
    }

    public final q b(Annotation[] annotationArr) {
        q qVarA = n.i;
        for (Annotation annotation : annotationArr) {
            qVarA = qVarA.a(annotation);
            if (this.f9577a.l0(annotation)) {
                qVarA = d(qVarA, annotation);
            }
        }
        return qVarA;
    }

    public final q c(q qVar, Annotation[] annotationArr) {
        for (Annotation annotation : annotationArr) {
            if (!qVar.i(annotation)) {
                qVar = qVar.a(annotation);
                B b6 = this.f9577a;
                if (b6.l0(annotation)) {
                    for (Annotation annotation2 : i.j(annotation.annotationType())) {
                        if (!(annotation2 instanceof Target) && !(annotation2 instanceof Retention) && !qVar.i(annotation2)) {
                            qVar = qVar.a(annotation2);
                            if (b6.l0(annotation2)) {
                                qVar = d(qVar, annotation2);
                            }
                        }
                    }
                }
            }
        }
        return qVar;
    }

    public final q d(q qVar, Annotation annotation) {
        for (Annotation annotation2 : i.j(annotation.annotationType())) {
            if (!(annotation2 instanceof Target) && !(annotation2 instanceof Retention)) {
                if (!this.f9577a.l0(annotation2)) {
                    qVar = qVar.a(annotation2);
                } else if (!qVar.i(annotation2)) {
                    qVar = d(qVar.a(annotation2), annotation2);
                }
            }
        }
        return qVar;
    }
}

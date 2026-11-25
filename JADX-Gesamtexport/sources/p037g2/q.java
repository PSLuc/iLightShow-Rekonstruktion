package p037g2;

import com.fasterxml.jackson.databind.exc.InvalidNullException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import p015c2.A;
import p015c2.f;
import p015c2.h;
import p015c2.j;
import p032f2.l;
import p109u2.i;

/* JADX INFO: loaded from: classes.dex */
public final class q implements l, Serializable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final q f9155j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final q f9156k;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f9157h;
    public final Object i;

    static {
        Object obj = null;
        int i = 0;
        f9155j = new q(i, obj);
        f9156k = new q(i, obj);
    }

    public /* synthetic */ q(int i, Object obj) {
        this.f9157h = i;
        this.i = obj;
    }

    public static boolean a(l lVar) {
        return lVar == f9155j;
    }

    @Override // p032f2.l
    public final Object getNullValue(f fVar) throws InvalidNullException {
        String str;
        Object obj = this.i;
        switch (this.f9157h) {
            case 0:
                return obj;
            case 1:
                return ((j) obj).getEmptyValue(fVar);
            default:
                int i = InvalidNullException.f7688l;
                Annotation[] annotationArr = i.f12697a;
                A a6 = (A) obj;
                if (a6 == null) {
                    str = "<UNKNOWN>";
                } else {
                    str = "\"" + a6 + "\"";
                }
                throw new InvalidNullException(fVar.f7252o, "Invalid `null` value encountered for property ".concat(str));
        }
    }

    public q(A a6, h hVar) {
        this.f9157h = 2;
        this.i = a6;
    }
}

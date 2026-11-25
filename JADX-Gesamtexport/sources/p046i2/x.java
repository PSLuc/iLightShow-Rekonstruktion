package p046i2;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p026e2.o;
import p050j2.a;
import p109u2.i;

/* JADX INFO: loaded from: classes.dex */
public final class x extends y {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Set f9579f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(o oVar, C0766b c0766b) {
        super(oVar, null);
        String[] strArr = null;
        RuntimeException runtimeException = a.f9713e;
        if (runtimeException != null) {
            throw runtimeException;
        }
        a aVar = a.f9712d;
        Class cls = c0766b.f9525j;
        Object[] objArrA = aVar.a(cls);
        if (objArrA != null) {
            String[] strArr2 = new String[objArrA.length];
            for (int i = 0; i < objArrA.length; i++) {
                try {
                    strArr2[i] = (String) aVar.f9715b.invoke(objArrA[i], null);
                } catch (Exception e6) {
                    throw new IllegalArgumentException(String.format("Failed to access name of field #%d (of %d) of Record type %s", Integer.valueOf(i), Integer.valueOf(objArrA.length), i.z(cls)), e6);
                }
            }
            strArr = strArr2;
        }
        this.f9579f = strArr == null ? Collections.EMPTY_SET : new HashSet(Arrays.asList(strArr));
    }

    @Override // p046i2.y
    public final String c(C0772h c0772h, String str) {
        return this.f9579f.contains(str) ? str : super.c(c0772h, str);
    }
}

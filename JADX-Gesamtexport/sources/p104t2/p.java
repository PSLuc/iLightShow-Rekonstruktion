package p104t2;

import B.AbstractC0013g0;
import java.io.Serializable;
import java.util.ArrayList;
import p015c2.h;
import p109u2.i;

/* JADX INFO: loaded from: classes.dex */
public final class p implements Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n f12556h;

    public p(n nVar) {
        this.f12556h = nVar;
    }

    public static IllegalArgumentException a(o oVar, String str) {
        int i = oVar.f12554b;
        String str2 = oVar.f12553a;
        StringBuilder sbO = AbstractC0013g0.o("Failed to parse type '", str2, "' (remaining: '", str2.substring(i), "'): ");
        sbO.append(str);
        return new IllegalArgumentException(sbO.toString());
    }

    public final h b(o oVar) {
        n nVar = this.f12556h;
        if (!oVar.hasMoreTokens()) {
            throw a(oVar, "Unexpected end-of-string");
        }
        String strNextToken = oVar.nextToken();
        try {
            nVar.getClass();
            Class clsK = n.k(strNextToken);
            if (oVar.hasMoreTokens()) {
                String strNextToken2 = oVar.nextToken();
                if ("<".equals(strNextToken2)) {
                    ArrayList arrayList = new ArrayList();
                    while (oVar.hasMoreTokens()) {
                        arrayList.add(b(oVar));
                        if (!oVar.hasMoreTokens()) {
                            break;
                        }
                        String strNextToken3 = oVar.nextToken();
                        if (">".equals(strNextToken3)) {
                            h[] hVarArr = m.f12528m;
                            if (!arrayList.isEmpty()) {
                                hVarArr = (h[]) arrayList.toArray(hVarArr);
                            }
                            return nVar.c(null, clsK, m.c(clsK, hVarArr));
                        }
                        if (!",".equals(strNextToken3)) {
                            throw a(oVar, "Unexpected token '" + strNextToken3 + "', expected ',' or '>')");
                        }
                    }
                    throw a(oVar, "Unexpected end-of-string");
                }
                oVar.f12555c = strNextToken2;
            }
            return nVar.c(null, clsK, m.f12529n);
        } catch (Exception e6) {
            i.E(e6);
            throw a(oVar, "Cannot locate class '" + strNextToken + "', problem: " + e6.getMessage());
        }
    }
}

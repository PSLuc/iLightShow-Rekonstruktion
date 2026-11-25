package B;

import F.C0074p;
import N.C0208d;
import N.C0217h0;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.spotify.sdk.android.auth.LoginActivity;
import java.io.IOException;
import java.io.Serializable;
import java.io.StringReader;
import java.net.URLDecoder;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import p035g0.C0706g;
import p080p.C0833e;

/* JADX INFO: renamed from: B.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0025m0 implements p035g0.M, Callback, I1.e, R3.f, p105t3.v, p105t3.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f371h;
    public Object i;

    public /* synthetic */ C0025m0(int i, Object obj) {
        this.f371h = i;
        this.i = obj;
    }

    @Override // p035g0.M
    public p035g0.E a(long j4, S0.k kVar, S0.b bVar) {
        return new p035g0.B((C0706g) this.i);
    }

    @Override // I1.e
    public void b(int i, Serializable serializable) {
        if (i == 6 || i == 7 || i == 8) {
        }
        ((ProfileInstallReceiver) this.i).setResultCode(i);
    }

    public void c(Object obj, Object obj2) {
        p080p.x xVar = (p080p.x) this.i;
        int iD = xVar.d(obj);
        boolean z5 = iD < 0;
        Object obj3 = z5 ? null : xVar.f10798c[iD];
        if (obj3 != null) {
            if (obj3 instanceof p080p.A) {
                ((p080p.A) obj3).a(obj2);
            } else if (obj3 != obj2) {
                p080p.A a6 = new p080p.A();
                a6.a(obj3);
                a6.a(obj2);
                obj2 = a6;
            }
            obj2 = obj3;
        }
        if (!z5) {
            xVar.f10798c[iD] = obj2;
            return;
        }
        int i = ~iD;
        xVar.f10797b[i] = obj;
        xVar.f10798c[i] = obj2;
    }

    public androidx.lifecycle.O d(E4.f fVar) {
        String str;
        Class cls = fVar.f1064a;
        E4.k.f("jClass", cls);
        String canonicalName = null;
        if (!cls.isAnonymousClass() && !cls.isLocalClass()) {
            boolean zIsArray = cls.isArray();
            HashMap map = E4.f.f1062c;
            if (zIsArray) {
                Class<?> componentType = cls.getComponentType();
                if (componentType.isPrimitive() && (str = (String) map.get(componentType.getName())) != null) {
                    canonicalName = str.concat("Array");
                }
                if (canonicalName == null) {
                    canonicalName = "kotlin.Array";
                }
            } else {
                canonicalName = (String) map.get(cls.getName());
                if (canonicalName == null) {
                    canonicalName = cls.getCanonicalName();
                }
            }
        }
        if (canonicalName != null) {
            return ((C0031p0) this.i).m(fVar, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // R3.f
    public void e(R3.g gVar) {
        p017c4.e eVar;
        p017c4.d dVar = new p017c4.d(gVar);
        gVar.d(dVar);
        loop0: while (true) {
            AtomicReference atomicReference = (AtomicReference) this.i;
            p017c4.e eVar2 = (p017c4.e) atomicReference.get();
            p017c4.d[] dVarArr = p017c4.e.f7363m;
            if (eVar2 == null || eVar2.i.get() == dVarArr) {
                p017c4.e eVar3 = new p017c4.e(atomicReference);
                while (true) {
                    if (atomicReference.compareAndSet(eVar2, eVar3)) {
                        eVar = eVar3;
                    } else if (atomicReference.get() != eVar2) {
                    }
                }
            } else {
                eVar = eVar2;
            }
            while (true) {
                AtomicReference atomicReference2 = eVar.i;
                p017c4.d[] dVarArr2 = (p017c4.d[]) atomicReference2.get();
                if (dVarArr2 == dVarArr) {
                    break;
                }
                int length = dVarArr2.length;
                p017c4.d[] dVarArr3 = new p017c4.d[length + 1];
                System.arraycopy(dVarArr2, 0, dVarArr3, 0, length);
                dVarArr3[length] = dVar;
                do {
                    if (atomicReference2.compareAndSet(dVarArr2, dVarArr3)) {
                        break loop0;
                    }
                } while (atomicReference2.get() == dVarArr2);
            }
        }
        if (dVar.compareAndSet(null, eVar)) {
            return;
        }
        eVar.e(dVar);
    }

    public N.V0 f() {
        p119w1.h hVarA = p119w1.h.a();
        if (hVarA.b() == 1) {
            return new O0.l(true);
        }
        C0217h0 c0217h0K = C0208d.K(Boolean.FALSE, N.U.f3673m);
        hVarA.g(new O0.h(c0217h0K, this));
        return c0217h0K;
    }

    public void g() {
    }

    public boolean h(Object obj, Object obj2) {
        p080p.x xVar = (p080p.x) this.i;
        Object objE = xVar.e(obj);
        if (objE == null) {
            return false;
        }
        if (!(objE instanceof p080p.A)) {
            if (!objE.equals(obj2)) {
                return false;
            }
            xVar.g(obj);
            return true;
        }
        p080p.A a6 = (p080p.A) objE;
        boolean zJ = a6.j(obj2);
        if (zJ && a6.g()) {
            xVar.g(obj);
        }
        return zJ;
    }

    public void i(Object obj) {
        boolean zG;
        p080p.x xVar = (p080p.x) this.i;
        long[] jArr = xVar.f10796a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j4 = jArr[i];
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i - length)) >>> 31);
                for (int i6 = 0; i6 < i3; i6++) {
                    if ((255 & j4) < 128) {
                        int i7 = (i << 3) + i6;
                        Object obj2 = xVar.f10797b[i7];
                        Object obj3 = xVar.f10798c[i7];
                        if (obj3 instanceof p080p.A) {
                            E4.k.d("null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScope$lambda$3>", obj3);
                            p080p.A a6 = (p080p.A) obj3;
                            a6.j(obj);
                            zG = a6.g();
                        } else {
                            zG = obj3 == obj;
                        }
                        if (zG) {
                            xVar.h(i7);
                        }
                    }
                    j4 >>= 8;
                }
                if (i3 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public void j(M0.w wVar, long j4, boolean z5, C0074p c0074p) {
        ((F.P) this.i).n(G0.I.b(F.P.a((F.P) this.i, wVar, j4, z5, false, c0074p, false)) ? EnumC0011f0.f313j : EnumC0011f0.i);
    }

    @Override // okhttp3.Callback
    public void onFailure(Call call, IOException iOException) {
        int i = this.f371h;
        E4.k.f("call", call);
        E4.k.f("e", iOException);
        switch (i) {
            case 4:
                int i3 = H3.j.f1793n;
                break;
            case 5:
                String string = iOException.toString();
                ((H3.k) this.i).getClass();
                E4.k.f("str", string);
                break;
            default:
                com.nanjoran.ilightshow.Services.z0 z0Var = com.nanjoran.ilightshow.Services.z0.f8505f;
                com.nanjoran.ilightshow.Services.z0 z0Var2 = com.nanjoran.ilightshow.Services.z0.f8505f;
                iOException.getLocalizedMessage();
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:129:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:138:0x03e7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:139:0x03e9 A[Catch: Exception -> 0x04c3, TryCatch #1 {Exception -> 0x04c3, blocks: (B:63:0x01df, B:64:0x020f, B:66:0x0215, B:68:0x0225, B:83:0x027e, B:69:0x022a, B:71:0x0236, B:72:0x023a, B:74:0x0246, B:75:0x024b, B:77:0x0257, B:78:0x025c, B:80:0x0268, B:82:0x0272, B:88:0x0289, B:90:0x029f, B:95:0x02d7, B:98:0x02e5, B:101:0x030a, B:103:0x0323, B:108:0x035b, B:111:0x0369, B:113:0x0389, B:115:0x038f, B:117:0x0393, B:119:0x0399, B:124:0x03a2, B:128:0x03ce, B:130:0x03d3, B:132:0x03db, B:134:0x03df, B:144:0x03fa, B:146:0x03fe, B:148:0x0404, B:150:0x040a, B:151:0x0411, B:153:0x0419, B:170:0x04a3, B:172:0x04bd, B:155:0x0421, B:160:0x046e, B:162:0x0472, B:163:0x0479, B:165:0x0485, B:167:0x0489, B:168:0x0490, B:169:0x04a0, B:158:0x0466, B:139:0x03e9, B:141:0x03f1, B:171:0x04ab, B:104:0x032c, B:105:0x0332, B:107:0x034b, B:91:0x02a8, B:92:0x02ae, B:94:0x02c7, B:173:0x04c0), top: B:178:0x01df }] */
    /* JADX WARN: Code duplicated, block: B:155:0x0421 A[Catch: Exception -> 0x04c3, TryCatch #1 {Exception -> 0x04c3, blocks: (B:63:0x01df, B:64:0x020f, B:66:0x0215, B:68:0x0225, B:83:0x027e, B:69:0x022a, B:71:0x0236, B:72:0x023a, B:74:0x0246, B:75:0x024b, B:77:0x0257, B:78:0x025c, B:80:0x0268, B:82:0x0272, B:88:0x0289, B:90:0x029f, B:95:0x02d7, B:98:0x02e5, B:101:0x030a, B:103:0x0323, B:108:0x035b, B:111:0x0369, B:113:0x0389, B:115:0x038f, B:117:0x0393, B:119:0x0399, B:124:0x03a2, B:128:0x03ce, B:130:0x03d3, B:132:0x03db, B:134:0x03df, B:144:0x03fa, B:146:0x03fe, B:148:0x0404, B:150:0x040a, B:151:0x0411, B:153:0x0419, B:170:0x04a3, B:172:0x04bd, B:155:0x0421, B:160:0x046e, B:162:0x0472, B:163:0x0479, B:165:0x0485, B:167:0x0489, B:168:0x0490, B:169:0x04a0, B:158:0x0466, B:139:0x03e9, B:141:0x03f1, B:171:0x04ab, B:104:0x032c, B:105:0x0332, B:107:0x034b, B:91:0x02a8, B:92:0x02ae, B:94:0x02c7, B:173:0x04c0), top: B:178:0x01df }] */
    /* JADX WARN: Code duplicated, block: B:157:0x0464  */
    /* JADX WARN: Code duplicated, block: B:158:0x0466 A[Catch: Exception -> 0x04c3, TryCatch #1 {Exception -> 0x04c3, blocks: (B:63:0x01df, B:64:0x020f, B:66:0x0215, B:68:0x0225, B:83:0x027e, B:69:0x022a, B:71:0x0236, B:72:0x023a, B:74:0x0246, B:75:0x024b, B:77:0x0257, B:78:0x025c, B:80:0x0268, B:82:0x0272, B:88:0x0289, B:90:0x029f, B:95:0x02d7, B:98:0x02e5, B:101:0x030a, B:103:0x0323, B:108:0x035b, B:111:0x0369, B:113:0x0389, B:115:0x038f, B:117:0x0393, B:119:0x0399, B:124:0x03a2, B:128:0x03ce, B:130:0x03d3, B:132:0x03db, B:134:0x03df, B:144:0x03fa, B:146:0x03fe, B:148:0x0404, B:150:0x040a, B:151:0x0411, B:153:0x0419, B:170:0x04a3, B:172:0x04bd, B:155:0x0421, B:160:0x046e, B:162:0x0472, B:163:0x0479, B:165:0x0485, B:167:0x0489, B:168:0x0490, B:169:0x04a0, B:158:0x0466, B:139:0x03e9, B:141:0x03f1, B:171:0x04ab, B:104:0x032c, B:105:0x0332, B:107:0x034b, B:91:0x02a8, B:92:0x02ae, B:94:0x02c7, B:173:0x04c0), top: B:178:0x01df }] */
    /* JADX WARN: Code duplicated, block: B:160:0x046e A[Catch: Exception -> 0x04c3, TryCatch #1 {Exception -> 0x04c3, blocks: (B:63:0x01df, B:64:0x020f, B:66:0x0215, B:68:0x0225, B:83:0x027e, B:69:0x022a, B:71:0x0236, B:72:0x023a, B:74:0x0246, B:75:0x024b, B:77:0x0257, B:78:0x025c, B:80:0x0268, B:82:0x0272, B:88:0x0289, B:90:0x029f, B:95:0x02d7, B:98:0x02e5, B:101:0x030a, B:103:0x0323, B:108:0x035b, B:111:0x0369, B:113:0x0389, B:115:0x038f, B:117:0x0393, B:119:0x0399, B:124:0x03a2, B:128:0x03ce, B:130:0x03d3, B:132:0x03db, B:134:0x03df, B:144:0x03fa, B:146:0x03fe, B:148:0x0404, B:150:0x040a, B:151:0x0411, B:153:0x0419, B:170:0x04a3, B:172:0x04bd, B:155:0x0421, B:160:0x046e, B:162:0x0472, B:163:0x0479, B:165:0x0485, B:167:0x0489, B:168:0x0490, B:169:0x04a0, B:158:0x0466, B:139:0x03e9, B:141:0x03f1, B:171:0x04ab, B:104:0x032c, B:105:0x0332, B:107:0x034b, B:91:0x02a8, B:92:0x02ae, B:94:0x02c7, B:173:0x04c0), top: B:178:0x01df }] */
    /* JADX WARN: Code duplicated, block: B:162:0x0472 A[Catch: Exception -> 0x04c3, TryCatch #1 {Exception -> 0x04c3, blocks: (B:63:0x01df, B:64:0x020f, B:66:0x0215, B:68:0x0225, B:83:0x027e, B:69:0x022a, B:71:0x0236, B:72:0x023a, B:74:0x0246, B:75:0x024b, B:77:0x0257, B:78:0x025c, B:80:0x0268, B:82:0x0272, B:88:0x0289, B:90:0x029f, B:95:0x02d7, B:98:0x02e5, B:101:0x030a, B:103:0x0323, B:108:0x035b, B:111:0x0369, B:113:0x0389, B:115:0x038f, B:117:0x0393, B:119:0x0399, B:124:0x03a2, B:128:0x03ce, B:130:0x03d3, B:132:0x03db, B:134:0x03df, B:144:0x03fa, B:146:0x03fe, B:148:0x0404, B:150:0x040a, B:151:0x0411, B:153:0x0419, B:170:0x04a3, B:172:0x04bd, B:155:0x0421, B:160:0x046e, B:162:0x0472, B:163:0x0479, B:165:0x0485, B:167:0x0489, B:168:0x0490, B:169:0x04a0, B:158:0x0466, B:139:0x03e9, B:141:0x03f1, B:171:0x04ab, B:104:0x032c, B:105:0x0332, B:107:0x034b, B:91:0x02a8, B:92:0x02ae, B:94:0x02c7, B:173:0x04c0), top: B:178:0x01df }] */
    /* JADX WARN: Code duplicated, block: B:165:0x0485 A[Catch: Exception -> 0x04c3, TryCatch #1 {Exception -> 0x04c3, blocks: (B:63:0x01df, B:64:0x020f, B:66:0x0215, B:68:0x0225, B:83:0x027e, B:69:0x022a, B:71:0x0236, B:72:0x023a, B:74:0x0246, B:75:0x024b, B:77:0x0257, B:78:0x025c, B:80:0x0268, B:82:0x0272, B:88:0x0289, B:90:0x029f, B:95:0x02d7, B:98:0x02e5, B:101:0x030a, B:103:0x0323, B:108:0x035b, B:111:0x0369, B:113:0x0389, B:115:0x038f, B:117:0x0393, B:119:0x0399, B:124:0x03a2, B:128:0x03ce, B:130:0x03d3, B:132:0x03db, B:134:0x03df, B:144:0x03fa, B:146:0x03fe, B:148:0x0404, B:150:0x040a, B:151:0x0411, B:153:0x0419, B:170:0x04a3, B:172:0x04bd, B:155:0x0421, B:160:0x046e, B:162:0x0472, B:163:0x0479, B:165:0x0485, B:167:0x0489, B:168:0x0490, B:169:0x04a0, B:158:0x0466, B:139:0x03e9, B:141:0x03f1, B:171:0x04ab, B:104:0x032c, B:105:0x0332, B:107:0x034b, B:91:0x02a8, B:92:0x02ae, B:94:0x02c7, B:173:0x04c0), top: B:178:0x01df }] */
    /* JADX WARN: Code duplicated, block: B:167:0x0489 A[Catch: Exception -> 0x04c3, TryCatch #1 {Exception -> 0x04c3, blocks: (B:63:0x01df, B:64:0x020f, B:66:0x0215, B:68:0x0225, B:83:0x027e, B:69:0x022a, B:71:0x0236, B:72:0x023a, B:74:0x0246, B:75:0x024b, B:77:0x0257, B:78:0x025c, B:80:0x0268, B:82:0x0272, B:88:0x0289, B:90:0x029f, B:95:0x02d7, B:98:0x02e5, B:101:0x030a, B:103:0x0323, B:108:0x035b, B:111:0x0369, B:113:0x0389, B:115:0x038f, B:117:0x0393, B:119:0x0399, B:124:0x03a2, B:128:0x03ce, B:130:0x03d3, B:132:0x03db, B:134:0x03df, B:144:0x03fa, B:146:0x03fe, B:148:0x0404, B:150:0x040a, B:151:0x0411, B:153:0x0419, B:170:0x04a3, B:172:0x04bd, B:155:0x0421, B:160:0x046e, B:162:0x0472, B:163:0x0479, B:165:0x0485, B:167:0x0489, B:168:0x0490, B:169:0x04a0, B:158:0x0466, B:139:0x03e9, B:141:0x03f1, B:171:0x04ab, B:104:0x032c, B:105:0x0332, B:107:0x034b, B:91:0x02a8, B:92:0x02ae, B:94:0x02c7, B:173:0x04c0), top: B:178:0x01df }] */
    @Override // okhttp3.Callback
    public void onResponse(Call call, Response response) {
        List listV;
        List listV2;
        Double d6;
        boolean z5;
        B3.f fVar;
        String strU;
        Matcher matcher;
        M4.i iVar;
        M4.h hVar;
        B3.f fVarA;
        int i = 3;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        switch (this.f371h) {
            case 4:
                H3.j jVar = (H3.j) this.i;
                E4.k.f("call", call);
                E4.k.f(LoginActivity.RESPONSE_KEY, response);
                ResponseBody responseBodyBody = response.body();
                if (responseBodyBody == null) {
                    int i3 = H3.j.f1793n;
                } else {
                    try {
                        String strU2 = M4.s.U(M4.s.U(M4.s.U(responseBodyBody.string(), "&quot;", "\""), "&gt;", ">"), "&lt;", "<");
                        Object objEvaluate = XPathFactory.newInstance().newXPath().evaluate("//*[local-name()=\"creator\"]|//*[local-name()=\"title\"]|//RelTime|//TrackURI|//*[local-name()=\"res\"]", new InputSource(new StringReader(strU2)), XPathConstants.NODESET);
                        E4.k.d("null cannot be cast to non-null type org.w3c.dom.NodeList", objEvaluate);
                        NodeList nodeList = (NodeList) objEvaluate;
                        String textContent = null;
                        String textContent2 = null;
                        String textContent3 = null;
                        String textContent4 = null;
                        for (int i6 = 0; i6 < nodeList.getLength(); i6++) {
                            Node nodeItem = nodeList.item(i6);
                            if ("RelTime".equals(nodeItem.getLocalName())) {
                                textContent4 = nodeItem.getTextContent();
                            } else if ("TrackURI".equals(nodeItem.getLocalName())) {
                                nodeItem.getTextContent();
                            } else if ("creator".equals(nodeItem.getLocalName())) {
                                textContent2 = nodeItem.getTextContent();
                            } else if ("title".equals(nodeItem.getLocalName())) {
                                textContent = nodeItem.getTextContent();
                            } else if ("res".equals(nodeItem.getLocalName()) && nodeItem.getAttributes().getNamedItem("duration") != null) {
                                textContent3 = nodeItem.getAttributes().getNamedItem("duration").getTextContent();
                            }
                        }
                        if (textContent != null && textContent2 != null && textContent3 != null) {
                            Pattern patternCompile = Pattern.compile(":");
                            E4.k.e("compile(...)", patternCompile);
                            M4.l.r0(0);
                            Matcher matcher2 = patternCompile.matcher(textContent3);
                            if (matcher2.find()) {
                                ArrayList arrayList = new ArrayList(10);
                                int iEnd = 0;
                                do {
                                    arrayList.add(textContent3.subSequence(iEnd, matcher2.start()).toString());
                                    iEnd = matcher2.end();
                                } while (matcher2.find());
                                arrayList.add(textContent3.subSequence(iEnd, textContent3.length()).toString());
                                listV = arrayList;
                            } else {
                                listV = com.fasterxml.jackson.databind.deser.std.d0.v(textContent3.toString());
                            }
                            String[] strArr = (String[]) listV.toArray(new String[0]);
                            if (strArr.length == 3) {
                                double d7 = (Double.parseDouble(strArr[1]) * 60.0d) + (Double.parseDouble(strArr[0]) * 3600.0d) + Double.parseDouble(strArr[2]);
                                if (textContent4 != null) {
                                    Date date = new Date();
                                    Pattern patternCompile2 = Pattern.compile(":");
                                    E4.k.e("compile(...)", patternCompile2);
                                    M4.l.r0(0);
                                    Matcher matcher3 = patternCompile2.matcher(textContent4);
                                    if (matcher3.find()) {
                                        ArrayList arrayList2 = new ArrayList(10);
                                        int iEnd2 = 0;
                                        do {
                                            arrayList2.add(textContent4.subSequence(iEnd2, matcher3.start()).toString());
                                            iEnd2 = matcher3.end();
                                        } while (matcher3.find());
                                        arrayList2.add(textContent4.subSequence(iEnd2, textContent4.length()).toString());
                                        listV2 = arrayList2;
                                    } else {
                                        listV2 = com.fasterxml.jackson.databind.deser.std.d0.v(textContent4.toString());
                                    }
                                    String[] strArr2 = (String[]) listV2.toArray(new String[0]);
                                    if (strArr2.length == 3) {
                                        double d8 = (Double.parseDouble(strArr2[1]) * 60.0d) + (Double.parseDouble(strArr2[0]) * 3600.0d) + Double.parseDouble(strArr2[2]);
                                        if (jVar.a() != null) {
                                            B3.f fVarA2 = jVar.a();
                                            d6 = fVarA2 != null ? fVarA2.f560e : null;
                                            B3.f fVarA3 = jVar.a();
                                            Date date2 = fVarA3 != null ? fVarA3.f561f : null;
                                            if (d6 != null || date2 == null) {
                                                z5 = true;
                                            } else {
                                                double time = ((date.getTime() - date2.getTime()) / 1000.0d) + d6.doubleValue();
                                                boolean z10 = Math.max(time, d8) - Math.min(time, d8) > 1.0d;
                                                int i7 = H3.j.f1793n;
                                                z5 = z10;
                                            }
                                            if (textContent4.equals(jVar.f1795j) && !jVar.f1796k && jVar.f1795j != null) {
                                                jVar.f1796k = true;
                                                if (z5) {
                                                    fVarA.j(Double.valueOf(d8));
                                                }
                                                if (textContent2.equals(jVar.f1797l)) {
                                                    jVar.f1782d.setValue(H3.a.i);
                                                    fVar = new B3.f();
                                                    fVar.f557b = textContent;
                                                    fVar.f558c = textContent2;
                                                    fVar.j(Double.valueOf(d8));
                                                    fVar.f559d = Double.valueOf(d7);
                                                    jVar.f(fVar);
                                                    URLDecoder.decode(strU2, "UTF-8");
                                                    Pattern patternCompile3 = Pattern.compile("x-sonos-spotify:spotify:track:(\\w*)|x-sonosprog-spotify:spotify:track:(\\w*)");
                                                    E4.k.e("compile(...)", patternCompile3);
                                                    strU = M4.s.U(strU2, "%3a", ":");
                                                    matcher = patternCompile3.matcher(strU);
                                                    E4.k.e("matcher(...)", matcher);
                                                    if (matcher.find(0)) {
                                                        iVar = new M4.i(matcher, strU);
                                                    } else {
                                                        iVar = null;
                                                    }
                                                    if (iVar != null) {
                                                        if (iVar.f3544c == null) {
                                                            iVar.f3544c = new M4.h(z8 ? 1 : 0, iVar);
                                                        }
                                                        hVar = iVar.f3544c;
                                                        E4.k.c(hVar);
                                                        if (hVar.c() > 1) {
                                                            if (iVar.f3544c == null) {
                                                                iVar.f3544c = new M4.h(z7 ? 1 : 0, iVar);
                                                            }
                                                            M4.h hVar2 = iVar.f3544c;
                                                            E4.k.c(hVar2);
                                                            String str = (String) hVar2.get(1);
                                                            fVar.f556a = str;
                                                            fVar.f563h = str;
                                                        }
                                                    }
                                                    fVar.f();
                                                } else {
                                                    jVar.f1782d.setValue(H3.a.i);
                                                    fVar = new B3.f();
                                                    fVar.f557b = textContent;
                                                    fVar.f558c = textContent2;
                                                    fVar.j(Double.valueOf(d8));
                                                    fVar.f559d = Double.valueOf(d7);
                                                    jVar.f(fVar);
                                                    URLDecoder.decode(strU2, "UTF-8");
                                                    Pattern patternCompile4 = Pattern.compile("x-sonos-spotify:spotify:track:(\\w*)|x-sonosprog-spotify:spotify:track:(\\w*)");
                                                    E4.k.e("compile(...)", patternCompile4);
                                                    strU = M4.s.U(strU2, "%3a", ":");
                                                    matcher = patternCompile4.matcher(strU);
                                                    E4.k.e("matcher(...)", matcher);
                                                    if (matcher.find(0)) {
                                                        iVar = null;
                                                    } else {
                                                        iVar = new M4.i(matcher, strU);
                                                    }
                                                    if (iVar != null) {
                                                        if (iVar.f3544c == null) {
                                                            iVar.f3544c = new M4.h(z8 ? 1 : 0, iVar);
                                                        }
                                                        hVar = iVar.f3544c;
                                                        E4.k.c(hVar);
                                                        if (hVar.c() > 1) {
                                                            if (iVar.f3544c == null) {
                                                                iVar.f3544c = new M4.h(z7 ? 1 : 0, iVar);
                                                            }
                                                            M4.h hVar3 = iVar.f3544c;
                                                            E4.k.c(hVar3);
                                                            String str2 = (String) hVar3.get(1);
                                                            fVar.f556a = str2;
                                                            fVar.f563h = str2;
                                                        }
                                                    }
                                                    fVar.f();
                                                }
                                                jVar.f1797l = textContent2;
                                                jVar.f1798m = textContent;
                                                jVar.e();
                                            } else if (z5 && textContent2.equals(jVar.f1797l) && textContent.equals(jVar.f1798m)) {
                                                jVar.f1796k = true;
                                                if (z5 && jVar.a() != null && (fVarA = jVar.a()) != null) {
                                                    fVarA.j(Double.valueOf(d8));
                                                }
                                                if (textContent2.equals(jVar.f1797l) || !textContent.equals(jVar.f1798m)) {
                                                    jVar.f1782d.setValue(H3.a.i);
                                                    fVar = new B3.f();
                                                    fVar.f557b = textContent;
                                                    fVar.f558c = textContent2;
                                                    fVar.j(Double.valueOf(d8));
                                                    fVar.f559d = Double.valueOf(d7);
                                                    jVar.f(fVar);
                                                    URLDecoder.decode(strU2, "UTF-8");
                                                    Pattern patternCompile5 = Pattern.compile("x-sonos-spotify:spotify:track:(\\w*)|x-sonosprog-spotify:spotify:track:(\\w*)");
                                                    E4.k.e("compile(...)", patternCompile5);
                                                    strU = M4.s.U(strU2, "%3a", ":");
                                                    matcher = patternCompile5.matcher(strU);
                                                    E4.k.e("matcher(...)", matcher);
                                                    if (matcher.find(0)) {
                                                        iVar = null;
                                                    } else {
                                                        iVar = new M4.i(matcher, strU);
                                                    }
                                                    if (iVar != null) {
                                                        if (iVar.f3544c == null) {
                                                            iVar.f3544c = new M4.h(z8 ? 1 : 0, iVar);
                                                        }
                                                        hVar = iVar.f3544c;
                                                        E4.k.c(hVar);
                                                        if (hVar.c() > 1) {
                                                            if (iVar.f3544c == null) {
                                                                iVar.f3544c = new M4.h(z7 ? 1 : 0, iVar);
                                                            }
                                                            M4.h hVar4 = iVar.f3544c;
                                                            E4.k.c(hVar4);
                                                            String str3 = (String) hVar4.get(1);
                                                            fVar.f556a = str3;
                                                            fVar.f563h = str3;
                                                        }
                                                    }
                                                    fVar.f();
                                                }
                                                jVar.f1797l = textContent2;
                                                jVar.f1798m = textContent;
                                                jVar.e();
                                            } else {
                                                jVar.f1796k = false;
                                                new Timer().schedule(new H3.c(1, jVar), 50L);
                                            }
                                            jVar.f1795j = textContent4;
                                        } else {
                                            d6 = null;
                                        }
                                        if (d6 != null) {
                                            z5 = true;
                                        } else {
                                            z5 = true;
                                        }
                                        if (textContent4.equals(jVar.f1795j)) {
                                            if (z5) {
                                            }
                                            jVar.f1796k = false;
                                            new Timer().schedule(new H3.c(1, jVar), 50L);
                                        } else {
                                            if (z5) {
                                            }
                                            jVar.f1796k = false;
                                            new Timer().schedule(new H3.c(1, jVar), 50L);
                                        }
                                        jVar.f1795j = textContent4;
                                        break;
                                    }
                                }
                            }
                        }
                        int i8 = H3.j.f1793n;
                    } catch (Exception unused) {
                        int i9 = H3.j.f1793n;
                        return;
                    }
                }
                break;
            case 5:
                E4.k.f("call", call);
                E4.k.f(LoginActivity.RESPONSE_KEY, response);
                ResponseBody responseBodyBody2 = response.body();
                String strString = responseBodyBody2 != null ? responseBodyBody2.string() : null;
                int iCode = response.code();
                H3.k kVar = (H3.k) this.i;
                if (iCode != 200 || strString == null) {
                    int i10 = kVar.f1800h + 1;
                    kVar.f1800h = i10;
                    if (i10 > 100) {
                        kVar.f1800h = 0;
                        com.nanjoran.ilightshow.Services.M.f8305O.M(false);
                    }
                    int iCode2 = response.code();
                    E4.k.f("str", response.message());
                    if (iCode2 == 401) {
                        com.nanjoran.ilightshow.Services.C0 c6 = com.nanjoran.ilightshow.Services.C0.i;
                        c6.getClass();
                        new Handler(Looper.getMainLooper()).post(new com.nanjoran.ilightshow.Services.A0(c6, z9 ? 1 : 0));
                    }
                } else {
                    try {
                        C3.b bVar = (C3.b) new p105t3.m().d(strString, C3.b.class);
                        E4.k.c(bVar);
                        kVar.g(bVar);
                    } catch (Exception unused2) {
                        int i11 = H3.k.f1799j;
                        return;
                    }
                }
                break;
            default:
                E4.k.f("call", call);
                E4.k.f(LoginActivity.RESPONSE_KEY, response);
                ResponseBody responseBodyBody3 = response.body();
                if (responseBodyBody3 == null) {
                    com.nanjoran.ilightshow.Services.z0 z0Var = com.nanjoran.ilightshow.Services.z0.f8505f;
                } else {
                    String strString2 = responseBodyBody3.string();
                    if (strString2 == null) {
                        com.nanjoran.ilightshow.Services.z0 z0Var2 = com.nanjoran.ilightshow.Services.z0.f8505f;
                    } else {
                        try {
                            Object objEvaluate2 = XPathFactory.newInstance().newXPath().evaluate("//ZoneGroupState[1]/ZoneGroups/*", new InputSource(new StringReader(M4.s.U(M4.s.U(M4.s.U(strString2, "&quot;", "\""), "&gt;", ">"), "&lt;", "<"))), XPathConstants.NODESET);
                            E4.k.d("null cannot be cast to non-null type org.w3c.dom.NodeList", objEvaluate2);
                            NodeList nodeList2 = (NodeList) objEvaluate2;
                            if (nodeList2.getLength() == 0) {
                                com.nanjoran.ilightshow.Services.z0 z0Var3 = com.nanjoran.ilightshow.Services.z0.f8505f;
                            } else {
                                ArrayList arrayList3 = new ArrayList();
                                int i12 = 0;
                                while (true) {
                                    int length = nodeList2.getLength();
                                    com.nanjoran.ilightshow.Services.z0 z0Var4 = (com.nanjoran.ilightshow.Services.z0) this.i;
                                    if (i12 >= length) {
                                        z0Var4.getClass();
                                        z0Var4.f8508b = arrayList3;
                                        z0Var4.setChanged();
                                        z0Var4.notifyObservers(this);
                                    } else {
                                        Node nodeItem2 = nodeList2.item(i12);
                                        String textContent5 = nodeItem2.getAttributes().getNamedItem("Coordinator").getTextContent();
                                        F3.a aVar = new F3.a();
                                        aVar.f1407c = new ArrayList();
                                        NodeList childNodes = nodeItem2.getChildNodes();
                                        for (int i13 = 0; i13 < childNodes.getLength(); i13++) {
                                            Node nodeItem3 = childNodes.item(i13);
                                            if (E4.k.a(nodeItem3.getLocalName(), "ZoneGroupMember")) {
                                                C0031p0 c0031p0 = new C0031p0(i, z6);
                                                c0031p0.f395k = nodeItem3.getAttributes().getNamedItem("UUID").getTextContent();
                                                c0031p0.f394j = nodeItem3.getAttributes().getNamedItem("ZoneName").getTextContent();
                                                String textContent6 = nodeItem3.getAttributes().getNamedItem("Location").getTextContent();
                                                E4.k.e("getTextContent(...)", textContent6);
                                                c0031p0.i = M4.s.U(M4.s.U(textContent6, "http://", ""), ":1400/xml/device_description.xml", "");
                                                String str4 = (String) c0031p0.f395k;
                                                if (str4 != null && ((String) c0031p0.f394j) != null) {
                                                    if (str4.equals(textContent5)) {
                                                        aVar.f1405a = (String) c0031p0.f394j;
                                                        aVar.f1406b = c0031p0;
                                                    }
                                                    aVar.f1407c.add(c0031p0);
                                                }
                                            }
                                        }
                                        arrayList3.add(aVar);
                                        String str5 = aVar.f1405a;
                                        if (str5 != null && str5.equals(z0Var4.f8510d)) {
                                            z0Var4.f8509c = aVar;
                                        }
                                        i12++;
                                    }
                                }
                            }
                        } catch (Exception unused3) {
                            com.nanjoran.ilightshow.Services.z0 z0Var5 = com.nanjoran.ilightshow.Services.z0.f8505f;
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ C0025m0(int i, boolean z5) {
        this.f371h = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0025m0(List list) {
        this.f371h = 10;
        this.i = (AbstractCollection) list;
    }

    public C0025m0(char c6) {
        this.i = new byte[]{103, 53, -5, -37, 71, -42, -116, -37, 64, -33, -88, -37, 66, 65, 27, -33, -76, 119, -27, -31, 105, -83, 8, 58, 13, 51, -14, -93, -128, 0, -76, -87, 24, 3, -46, -6, 16, 86, -34, 39, -24, 21, 95, -127, 109, -92, -112, 31, 55, -115, 118, 20, -46, -91, -96, 100, -8, 22, -115, 87, -127, -90, -13, -104, -5, 11, -45, 85, 10, -59, -18, -125, 75, -122, 66, -23, -42, 61, 40, 47, -89, 50, 110, -13, 21, 96, -28, -100, 77, -53, -93, -19, -42, 58, -40, 47, -67, 83, -115, 37, 93, -26, 29, 34, 22, -115, -52, -64, 44, 41, 80, -128, -44, 105, -17, 69, -2, 124, 52, -21, -21, -3, 0, 101, -63, -44, 125, 70, -79, -91, -94, 102, -85, 71, -65, -96, 46, -36, -115, 121, 61, -59, -121, 64, -40, -3, -36, 13, -1, -89, -120, -57, -45, -20, 52, 126, 26, 124, 116, 60, 82, -11, 111, 27, 122, 93, 44, -65, 60, -125, 53, -14, -58, -80, -123, 32, -55, 44, 119, 85, -67, -38, 36, -105, 79, -43, -112, -38, -115, 79, 21, 104, -89, -64, 46, 106, 118, -70, 30, 31, -106, 19, 41, 50, -51, 28, -127, -120, 67, 73, -78, 49, 85, -13, 87, 72, -64, -82, -34, 26, -6, -17, -10, -60, 88, -87, -107, 60, -5, 57, -51, -107, -10, 115, 55, 121, -52, 53, -91, -112, -118, -67, 122, 16, 25, 30, 91, -62, -117, 116, 64, -40, -125, -113, -127, 89, 81, -17, -83, -26, -32, 79, 32, 123, 23, -51, -79, -12, -96, 110, -37, 49, 3, -112, 99, 109, 125, 96, 73, 61, 119, -122, -61, -105, -123, -40, 15, -75, 3, 76, 48, -126, -74, -20, 68, -115, -114, 108, -51, 73, -110, 32, -8, 10, 26, 111, -27, -76, 23, 76, -101, 105, -2, -114, -116, -16, 11, 8, -7, 67, 73, 43, -110, 123, -117, 1, 124, 57, 44, 111, -74, -115, 56, -1, 74, 17, 58, 122, 44, -82, 102, 101, -6, 8, -22, -88, -60, -18, 56, -57, 80, 106, -86, 12, -63, -47, -96, -89, 32, 28, 122, -117, -88, 52, -84, 46, -125, -98, 75, 38, -100, 69, -105, 30, -54, 44, 7, 72, 82, -58, -70, 39, 6, 126, 90, 9, 87, -8, 62, 4, -43, 87, 32, 58, 90, -28, 103, -106, -20, -114, 7, -31, -29, 46, -100, -71, 38, 45, -63, -121, 17, 121, -53, -37, -111, -46, 119, -23, -57, -119, -124, 99, -37, -89, -119, -65, -53, -118, 25, -19, 38, -91, 48, 0, 5, -73, 5, -33, 93, -43, 96, 126, 106, 58, 95, 107, -79, 66, 24, -105, -91, 24, 0, -33, -96, 37, 30, -78, -103, 60, -3, 73, 92, -98, 123, 119, 6, -66, -26, -105, -29, -31, -56, -8, 104, -20, 46, 5, 116, -34, -126, -8, 124, -62, 80, -23, 52, -107, 28, -76, 34, -45, 71, -41, 89, -77, -11, 108, 30, 78, -109, 91, 108, -16, 117, -3, -65, -34, 96, -7, 99, -93, -67, -50, 12, 26, -43, 121, -76, -86, -50, -36, -12, 56, 51, 117, -48, -64, -88, -69, -43, -102, -59, -19, 62, 50, 114, 35, -10, 13, -125, 63, -49, -48, -44, -85, 123, -31, 15, -104, 124, -38, 34, -82, 13, 42, 17, 65, -125, 121, -3, -84, -70, 74, -21, -81, 27, -42, -72, -58, -8, 99, -62, 114, -78, 120, -43, 43, -16, 113, -72, 8, 125, 30, -124, 40, 95, -58, -3, 0, -79, -25, -50, -62, 99, -61, -105, 106, -94, -13, 111, -43, -50, -109, -91, -119, -72, 107, 56, 48, -28, 29, 89, -128, 125, -83, 21, 70, -35, 79, -95, -93, 15, 124, -125, -101, -58, 63, 63, -12, -26, -4, -50, -14, -54, -102, -24, 73, -69, -87, 7, 117, 84, 23, -79, 115, -44, 10, -56, -116, 126, 114, 28, -29, 80, -90, -74, -17, 91, 4, -115, 56, -69, 28, 92, 79, -36, -53, 88, -90, 1, -88, 46, -107, -42, -49, -118, 121, 121, -84, 77, 106, 26, -64, 112, 16, -57, -1, -98, -117, -22, 77, -99, -104, 94, 55, -122, 127, -99, -83, -84, 21, 10, -1, 95, 124, 2, -112, 30, -49, 56, -94, 93, 119, 65, 26, 100, 9, -22, 32, -33, -54, -75, -26, -34, -9, -22, 91, 38, -113, -1, 15, -48, 60, 101, -17, 40, 89, 10, -37, 66, -123, 21, -66, 45, 75, 39, 91, -91, 32, 126, 122, -28, 96, 8, 88, -87, -64, 5, -113, -117, 60, -67, 68, -66, -56, 102, -128, -60, -124, -106, -78, -23, 56, 110, -4, 70, -38, -42, -58, -113, 8, -20, -127, 70, -31, 103, -79, 19, 53, 32, -54, -126, -51, 104, 102, 102, -20, -42, -28, 37, 99, 116, 104, 85, 40, -105, 111, -40, -122, 74, -75, 116, 62, 4, -104, -52, -15, 45, 8, 87, -18, 117, -87, 83, 26, 114, -32, -87, 82, -97, 118, -123, -85, 31, 127, -120, -39, 51, 119, -90, 79, 52, -87, 17, -119, 57, -97, 80, 12, -76, -51, -40, -13, -85, 59, -27, -1, 32, -30, 49, 73, -105, -98, 57, -76, -16, -36, -69, -48, -124, -31, -124, 20, -124, 15, -101, 124, -91, -79, -24, 125, 86, 90, -9, -125, -94, 73, -38, 49, 26, -92, 52, 78, 58, -101, -41, 80, 65, -11, 60, 117, -19, -86, -78, -31, -31, -27, -103, 59, -13, 17, -71, 115, -48, -64, 65, 122, -53, -10, -81, 117, -51, -112, 11, -106, 58, 61, 11, 83, -125, -54, -55, 101, -73, 85, 101, -101, 14, -71, -111, 60, -78, -19, 13, -97, -6, 39, -90, 50, 81, 67, 14, 83, -46, 27, -65, 94, 72, -126, 96, -80, 79, 13, 27, 126, -13, 98, -32, -69, 11, -102, -89, 85, 24, 45, 71, 120, -123, 102, -96, -31, -75, -80, -85, 70, -72, -19, -44, -105, 60, -68, -35, -110, 95, 127, 67, -66, -64, 87, 
        -51, -42, 55, 49, -105, -86, 35, 73, -45, -15, 88, -106, -54, -125, -73, -38, 73, -86, 50, 82, -14, 66, 105, 38, -28, -54, -14, 106, -43, -60, -68, 93, 126, -21, 86, 75, -58, 45, -38, -46, -1, -65, -67, -124, 82, 86, 60, 34, 38, -112, 83, -30, 5, 73, -4, 127, -44, -112, -1, -5, -84, -89, 40, 33, 16, -49, 86, -108, 118, -105, 102, -111, 114, -29, 82, 57, 71, 39, 107, -110, -85, -40, 90, 46, -116, -35, 58, -93, 17, 60, 107, 28, -3, -52, 2, 23, -20, 60, 22, -62, -118, -1, -27, 39, 21, 33, 12, 75, -66, -110, -89, 100, 93, -61, -4, 27, -114, -81, 96, -69, -93, -47, -28, 75, 60, 27, 81, -48, -45, 27, -15, 110, -95, -103, -55, -25, -99, 71, -74, -18, 121, 110, -31, -21, 94, 38, -40, -26, 82, -10, 123, -14, -114, -22, 42, 37, 64, 92, 15, -115, -100, -94, 48, -76, 53, -121, 63, 111, 98, 7, 71, 120, 112, 74, -14, 9, -14, -44, 82, -62, -48, 116, 36, -62, 21, -44, -17, -79, 1, 57, -3, 104, -119, -5, 28, 113, -80, 19, -68, -68, 57, -38, -31, 13, -87, -8, -116, 64, 127, -21, 76, 1, 114, -29, -128, 25, 89, 66, -117, 95, -71, 107, 82, -25, 37, -69, 104, 87, 21, -19, -65, 111, 64, -47, -36, 85, -98, -115, -12, -28, -76, 43, -83, -14, 99, -102, -73, -85, 35, -73, 8, 44, -110, 70, -60, 79, -82, -103, -44, -79, 0, 80, -2, -116, 72, -19, 39, -39, -81, 37, 45, -94, -19, 85, -8, 10, -110, 96, -102, -100, -90, -28, 68, -17, -123, 40, -115, 8, 112, -108, 41, 21, -115, -70, -35, 88, 66, -47, 97, 66, 108, 103, -100, 42, -123, -111, -8, -18, 99, -114, -82, -41, 58, 87, 4, -74, 19, -31, -125, 124, 54, 17, 2, 12, 114, -96, -9, -98, 38, 76, -41, 89, -55, -91, -45, -62, 86, -53, 8, 54, 68, -9, -85, -93, 119, 63, -117, -25, -117, -103, -122, 112, -39, 110, -98, 1, -60, -86, -53, -108, -13, 91, 59, 104, -102, 46, 110, 89, 89, -97, -59, -125, -100, -88, 91, 19, 2, -7, 54, 93, 70, -27, 29, 98, 68, 23, 28, -42, -70, -99, -26, 43, 122, -58, 88, -96, 50, -4, -69, -55, 47, 84, -9, 118, -46, 20, 106, 92, 61, -75, -41, -8, 61, 58, -113, -63, 113, -98, -106, 20, 16, 74, -72, -35, -82, 126, 95, 11, 31, -33, -103, -76, 104, 52, 14, 2, 106, 37, 69, -119, 83, -85, -79, -18, 11, 10, -43, 112, -71, -119, -96, 45, -92, 73, -64, 97, 77, 75, -101, -89, 83, 110, 62, -86, 51, -4, 14, -65, -43, -86, 54, -20, -84, 58, -104, -82, -47, -58, 43, -79, -19, 113, 3, 77, 2, 124, -64, -65, -96, 27, 34, -56, -62, -84, 74, -57, -77, 26, 70, -119, -23, -88, -113, 12, -64, -11, -4, 125, 56, 39, -72, -26, 47, 101, -12, 59, -95, -91, -16, -83, 13, 66, 77, -78, 10, 103, 9, -96, 51, 26, -14, -73, -16, 82, -8, -54, 111, -108, 44, -76, -83, -87, -101, 103, 36, 123, -95, -2, 76, -93, 37, 3, -36, -13, -56, 30, -42, -66, 76, -51, 104, -5, 28, 123, 109, 120, 109, -50, -30, -119, -27, -127, -107, -69, -49, -33, -44, 27, -34, 41, 39, 75, 32, -91, -15, -65, -58, -7, -103, 1, -67, -93, 71, -124, -102, -67, 126, -62, -118, -110, -41, -79, 62, -22, -128, -127, 29, -54, -82, -80, 17, 44, -86, -74, 67, -24, 5, -22, -86, 77, 79, -64, -120, 74, -53, 11, 15, 58, 84, 39, 77, -24, 38, 72, 16, -28, -33, 4, 33, 53, 43, -49, 92, -61, -25, -74, -27, 80, -46, 83, -88, 39, -69, 2, -31, 97, 119, -56, 1, -69, -100, -93, -3, -46, 37, 84, 127, 38, 86, 72, -125, -65, -73, 60, -35, -31, 64, -40, -67, 89, -128, -73, 77, 75, -104, 38, 34, -3, 116, -70, 120, 88, -82, -38, -110, -13, -40, -100, -6, 42, 37, -58, -2, 74, 24, -42, -10, 106, -108, -55, -100, 9, -111, -120, -117, 16, 8, 77, -98, -32, 50, -59, -86, 44, -12, 37, 23, 32, 30, -33, -87, -51, 73, -3, -20, 110, 100, -101, -72, 81, 18, -97, 105, -86, 114, 52, -16, 5, -49, -7, 88, 14, -6, 70, 86, -109, -12, -27, 34, -71, 87, -34, 20, -61, -19, -108, -17, -100, 108, -128, 62, 75, -94, -85, -62, 10, -23, 11, -85, -105, 108, 108, 103, -10, 125, 54, -87, 37, 79, -125, -46, 10, -65, -63, -94, -36, 83, -100, 4, -116, 26, -8, 118, 110, -89, 86, 107, 85, -69, -1, -110, 70, 121, 39, -79, -26, 7, -71, 106, -118, 69, 100, -120, -46, -77, 56, 83, -88, -66, 5, 2, -119, -46, -60, 17, -110, 115, -113, -17, 71, -98, -68, 8, 120, -111, -3, 9, -126, -53, -81, 111, -113, -3, -8, -14, -107, -98, 96, 51, 77, 118, 68, 108, 22, -78, 0, 46, 22, 40, 75, -54, 81, -73, 68, -71, -87, -60, -31, 115, -111, 103, 52, 20, -38, -20, 101, -5, 21, -81, -15, -105, -54, 56, 87, 57, -26, -92, 103, 62, 2, -24, 90, 105, -13, 113, 125, 11, -114, 122, -54, -3, 113, 98, -13, 72, 57, -124, 13, 124, -108, -51, -120, 83, -51, -118, -4, -87, 40, -31, -7, 126, -76, 18, -4, -12, -59, 56, 116, 76, -103, 122, -105, -10, -62, -114, 51, 74, 108, 45, 11, -11, -60, 66, 43, -70, -58, -64, -44, 58, 20, -37, -61, -98, -103, 24, 21, 53, 66, -108, -28, -110, -56, 91, -116, 8, 50, -10, 37, 94, 15, 54, 38, 115, 65, -56, -105, -6, -25, -115, 110, -65, 119, 58, 105, -59, -31, -82, 45, -55, -6, 
        71, -6, 127, -29, 75, -55, 72, 111, 31, -86, -126, 66, 27, -82, 29, -49, -33, -56, -110, 111, 120, -127, 4, 46, 31, -30, 61, -69, 73, 44, 8, 66, 21, -103, -64, 74, -103, 27, 91, 82, 53, 65, -34, 33, 41, -104, 78, -91, -16, -118, -72, 96, -118, 99, 44, -96, 56, -77, -105, -103, -42, 104, 82, 56, -55, -26, 87, -51, 66, -13, -36, 15, 18, -38, 6, -96, 87, -110, 101, 73, 61, 48, -1, -44, 76, 50, 43, 30, 70, 54, -63, 76, 108, -123, 18, 24, 109, 44, -66, 80, -63, -119, -36, 40, -47, -52, 24, -3, -40, 97, 75, -15, -14, 95, 63, -99, -93, -60, -74, 88, -29, -75, -2, -49, 82, -118, -12, -3, -59, -118, -19, 84, -81, 103, -28, 117, 67, 98, -48, 64, -98, 24, -108, 42, 23, 3, 73, 27, 89, -124, 118, 116, -58, -105, 122, 97, -77, -60, 119, 127, -64, -10, 81, -59, 123, 12, -89, 78, 66, 75, -57, -111, -18, -108, -125, -71, -127, 24, -76, 65, 48, 30, -92, -77, -75, 118, -19, 54, -122, 113, -45, 100, -11, 22, -124, 62, -124, 61, -5, -63, 8, 79, 20, -35, 35, 28, -109, 13, -54, -118, -97, 14, -79, 50, -45, -20, -101, 118, 87, -98, 26, -48, -34, -68, -19, -128, 73, 7, 63, -89, -85, -34, -44, -106, -55, -88, -84, 110, 89, 43, 27, -77, 88, -23, 118, -75, -28, -27, -54, 19, -21, 122, -73, 68, -74, 74, -60, 74, 70, 99, 50, -43, 62, -118, -50, -111, 15, -46, -97, 107, -99, -5, -65, -119, 13, -15, 0, -31, 59, -66, 4, -105, 32, -41, 39, 44, 68, -34, 112, 50, -84, -71, 53, -36, -74, -124, -74, 42, -6, -5, 31, -26, -58, 39, -66, -120, -39, -49, -1, -4, 30, 116, 7, -74, 124, 83, -6, 41, -36, 115, 0, -79, 125, -41, -49, 124, 53, -75, -13, -13, 106, 94, -110, -117, -49, -69, -112, -122, -81, -98, 122, -33, -22, 73, 22, 19, 94, -28, 23, -67, 79, -128, -40, 73, 69, 37, -56, 2, -54, -63, -95, 1, 117, -69, 78, -40, 83, 46, 4, -19, -94, 107, -112, 69, -99, 116, -48, -111, -95, -2, 115, 26, -55, 40, 91, 111, -120, 0, 117, -105, -117, -10, -49, -115, 4, -92, -48, 45, 117, -32, 45, -21, -18, -56, 127, 126, -80, 39, 9, 50, -8, 41, -28, 98, -40, 50, 88, 120, 92, 0, 100, -95, 89, -99, -121, -28, -110, -107, -122, -123, 35, 126, -35, -49, 119, -104, 5, 17, -118, 123, 44, 61, -12, 116, -23, 31, -12, 116, 62, 108, 13, -99, 99, 56, 52, -99, 55, 98, 0, -35, -103, 64, -54, -1, 108, -117, 13, -33, -1, 95, -9, -88, -53, -32, -22, -72, 111, 56, -107, 39, -20, -81, -68, -51, 74, -40, -60, 23, -86, 37, -42, 66, 113, 88, -71, -83, -91, 88, 9, 60, -102, -67, -77, 108, 17, 71, 31, 122, 69, -33, 101, -116, -44, 35, -126, 31, 9, 72, -22, -93, -60, 103, 57, 37, -69, 67, -7, 97, 86, 69, -49, -1, 48, -26, 31, -13, -36, 81, 18, -21, -107, 68, 56, -119, 22, 87, -2, 65, -13, 67, -35, 20, 93, -64, -81, -112, -103, -27, 67, -105, -83, 112, -48, 7, 33, -47, -39, 78, -16, -63, -13, -114, -90, -74, -89, -114, 114, -31, 90, -46, 10, -49, -3, -66, 57, 47, 63, -122, -50, -28, 30, -69, 69, 123, -59, 80, 26, 14, -13, -123, 127, 55, -90, 113, 24, -94, -60, -39, -74, -121, -90, -48, 111, -94, 114, -24, 39, -77, -88, 47, 10, -91, -91, -24, 17, -123, -95, 93, -58, 81, 108, 106, 102, -24, -103, -65, 1, -44, 34, 4, -111, 122, -10, -59, 125, -43, -121, 64, -34, -71, 16, -21, 0, 37, 9, 59, 4, -70, 46, -6, 17, 56, -42, 58, -119, 125, 92, 80, 60, -108, 51, -92, -17, 72, -13, -29, 50, 89, 78, 34, 77, -57, 45, -55, -121, -44, -63, -8, 36, -63, -107, -125, -6, 68, -60, -10, -9, 110, 84, 57, -121, -112, 47, -5, -77, 61, 71, -11, -18, 121, 3, -106, -117, 47, -67, -85, -42, -39, -93, 46, -39, 112, 106, -94, 54, 34, 23, -119, -81, -104, 58, -111, -89, -47, 7, 60, -121, 99, 125, -80, 107, -112, -72, -74, -23, -114, -54, 11, 102, 69, 109, 96, -95, 5, -125, 79, 32, -72, 29, -73, -45, -83, -78, -100, -109, 105, 70, 121, -70, 101, -98, 2, -3, 7, -59, 26, -108, 38, 65, 29, 83, 59, -8, -104, -84, 45, 24, -32, -123, 95, -20, 33, 68, 32, 104, -120, -91, 45, 68, -34, 91, 68, -101, -23, -79, -118, 99, 126, 18, 92, 28, -40, -89, -27, 85, 62, -94, -81, 83, -22, -23, 25, -31, -49, -30, -112, 15, 105, 65, 53, -74, -122, 80, -92, 29, -85, -37, -71, -88, -74, 53, -30, -33, 48, 37, -106, -96, 28, 65, -119, -91, 2, -102, 40, -63, -95, -113, 82, 98, 112, 47, 67, -34, -91, -13, 70, -37, 5, -75, 86, 63, 0, 76, 41, 78, 18, 16, -67, 113, -85, -115, 101, -19, -100, 14, 103, -119, 94, -114, -87, -13, 81, 125, -103, 32, -29, -87, 77, 65, -55, 25, -43, -45, 127, -17, -80, 110, -122, -70, -26, 56, 54, -111, 122, 117, 24, -37, -15, 104, 48, 115, -20, 6, -127, 33, 40, -84, 98, -125, 32, 0, 125, -36, -50, 35, 39, -96, -124, 13, -43, -7, -74, -110, -47, 26, -31, -103, 15, -23, -26, -60, 119, -43, 61, 93, -10, 7, -74, 32, -58, -18, -112, -25, 98, 21, -12, -28, 0, -127, 115, -119, -40, 18, 30, -18, -91, 102, -109, 126, -61, 12, -83, -87, -49, -49, 33, -96, -60, 101, -37, 90, 71, -91, 16, 111, -28, -45, -117, 40, 13, 
        -71, 49, 16, 45, 12, -22, 1, -26, -33, -95, -101, 32, -6, -64, -68, 3, 60, 111, -6, 123, -118, -42, 72, 103, 90, 64, 107, 52, -21, -108, -108, 13, 27, -78, 1, -88, -42, -28, -122, 33, -77, 121, 14, 62, -81, -57, -47, 34, 9, -1, -45, -77, -8, -20, 28, -23, 44, -37, 70, -21, -103, -3, -61, -121, 15, 3, 10, -10, 76, 86, 13, 48, -25, -113, -76, -58, -62, 54, 38, 87, -125, 110, 49, 40, -108, 71, 13, 124, 69, 84, -72, -24, -87, -43, 121, 112, -89, 61, -53, 92, -123, -8, -67, 30, 12, -77, 57, -118, 121, 28, 50, 109, -6, -83, -126, 91, 9, -6, -15, 8, -35, -81, 98, 96, 13, -21, -108, -31, 25, 109, 97, 71, -100, -8, -25, 91, 0, 119, 81, 6, 22, 46, -61, 6, -33, -33, -104, 79, 122, -96, 53, -116, -59, -24, 123, -105, 8, -110, 43, 123, 65, -38, -46, 103, 91, 92, -99, 98, -59, 64, -27, -68, -102, 116, -102, -33, 13, -13, -40, -109, -108, 100, -125, -82, 61, 58, 31, 120, 48, -13, -40, -38, 74, 9, -93, -6, -125, 31, -20, -40, 82, 7, -26, -82, -22, -50, 66, -103, -110, -112, 59, 109, 66, -44, -89, 101, 33, -59, 118, -44, -46, -67, -8, 85, 21, 71, -33, 104, 19, 48, -55, 75, 88, -72, -15, -102, 38, -87, -114, 61, -95, 127, -50, -49, -34, -19, 44, 110, 24, -7, -100, 42, -31, 106, 70, -77, -58, -89, 79, -122, -37, 45, -127, 1, -98, 69, 67, 94, 0, 12, -93, -38, -58, -124, -59, -15, -108, -126, -122, -127, 112, -116, 94, 75, 125, 112, -44, -80, -11, -77, -13, -15, 114, -5, -44, 30, -17, -51, -6, 76, -96, -46, -58, -25, -16, 123, -122, -85, -79, 40, -71, -49, -5, 64, 106, -2, -12, 32, -97, 64, -63, -19, 63, 96, -117, -68, 57, -82, 71, 92, 8, 23, 87, 60, -92, 23, 45, 68, -67, -117, 125, 19, 126, 64, -114, 56, -81, -65, -33, -78, 2, -32, 35, -6, 69, -79, 116, -108, 16, 71, -123, 78, -14, -12, -14, -102, -104, 112, 97, 48, 13, 98, 125, -6, -13, -59, 79, -68, -40, 45, -46, -112, 116, -83, -102, 96, 14, -42, 98, 2, -83, 38, -13, 46, 25, -6, -97, -78, -72, -99, -59, -41, 7, 8, -21, -45};
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0025m0(int i) {
        this((char) 0);
        this.f371h = i;
        switch (i) {
            case 12:
                long[] jArr = p080p.C.f10714a;
                this.i = new p080p.x();
                break;
            case 15:
                this.i = Collections.synchronizedMap(new C0833e(0));
                break;
            case 25:
                break;
            case 28:
                this.i = new ConcurrentHashMap(16);
                break;
            default:
                this.i = new SparseArray(10);
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0025m0(androidx.lifecycle.U u6, androidx.lifecycle.Q q6, int i) {
        this(u6, q6, C1.a.i);
        this.f371h = 19;
    }

    public C0025m0(androidx.lifecycle.U u6, androidx.lifecycle.Q q6, C1.b bVar) {
        this.f371h = 19;
        E4.k.f("store", u6);
        E4.k.f("defaultCreationExtras", bVar);
        this.i = new C0031p0(u6, q6, bVar);
    }
}

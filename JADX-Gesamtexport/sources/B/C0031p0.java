package B;

import F.C0074p;
import N.AbstractC0204b;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.google.android.gms.internal.play_billing.C0581m;
import com.google.gson.internal.Excluder;
import com.nanjoran.ilightshow.Services.lights.hue.DeviceHueBridge;
import com.nanjoran.ilightshow.Services.lights.storage.SharedDeviceStorage;
import com.nanjoran.ilightshow.Services.lights.storage.SharedDeviceStorageDocument;
import com.nanjoran.ilightshow.Services.lights.storage.SharedPersistedDevice;
import com.nanjoran.ilightshow.utils.LowercaseEnumTypeAdapterFactory;
import com.spotify.sdk.android.auth.LoginActivity;
import java.io.IOException;
import java.io.StringReader;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import kotlin.NoWhenBranchMatchedException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.slf4j.Marker;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;
import org.xmlpull.v1.XmlPullParserException;
import p015c2.AbstractC0473d;
import p035g0.C0715p;
import p035g0.InterfaceC0714o;
import p124x0.AbstractC1098f;

/* JADX INFO: renamed from: B.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0031p0 implements Callback, N2.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f393h;
    public Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f394j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f395k;

    public /* synthetic */ C0031p0(int i, boolean z5) {
        this.f393h = i;
    }

    public static C0031p0 o(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new C0031p0(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    public void a(String str, Integer num) {
        HashMap map = (HashMap) this.f395k;
        Object obj = map.get(str);
        if (obj == null) {
            map.put(str, num);
            return;
        }
        if (obj instanceof List) {
            ((List) obj).add(num);
            return;
        }
        LinkedList linkedList = new LinkedList();
        linkedList.add(obj);
        linkedList.add(num);
        map.put(str, linkedList);
    }

    public L2.i b() {
        String strConcat = ((String) this.i) == null ? " backendName" : "";
        if (((I2.c) this.f395k) == null) {
            strConcat = strConcat.concat(" priority");
        }
        if (strConcat.isEmpty()) {
            return new L2.i((String) this.i, (byte[]) this.f394j, (I2.c) this.f395k);
        }
        throw new IllegalStateException("Missing required properties:".concat(strConcat));
    }

    public void c(long j4) {
        p5.i0 i0Var = (p5.i0) this.i;
        if (i0Var != null && i0Var.f11076d == j4) {
            this.i = null;
        }
        TreeSet<p5.i0> treeSet = (TreeSet) this.f394j;
        for (p5.i0 i0Var2 : treeSet) {
            if (i0Var2.f11076d == j4) {
                ((p5.Q) this.f395k).u(i0Var2, treeSet);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public Object d(long j4, long j6, p122w4.c cVar) {
        p086q0.a aVar;
        long j7;
        if (cVar instanceof p086q0.a) {
            aVar = (p086q0.a) cVar;
            int i = aVar.f11192m;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.f11192m = i - Integer.MIN_VALUE;
            } else {
                aVar = new p086q0.a(this, cVar);
            }
        } else {
            aVar = new p086q0.a(this, cVar);
        }
        p086q0.a aVar2 = aVar;
        Object objZ0 = aVar2.f11190k;
        v4.a aVar3 = v4.a.f13292h;
        int i3 = aVar2.f11192m;
        if (i3 == 0) {
            S1.V.O(objZ0);
            p086q0.e eVar = (p086q0.e) this.i;
            p086q0.e eVar2 = null;
            if (eVar != null && eVar.f5969t) {
                eVar2 = (p086q0.e) AbstractC1098f.j(eVar);
            }
            p086q0.e eVar3 = eVar2;
            if (eVar3 != null) {
                aVar2.f11192m = 1;
                objZ0 = eVar3.z0(j4, j6, aVar2);
                if (objZ0 == aVar3) {
                    return aVar3;
                }
            } else {
                j7 = 0;
            }
            return new S0.o(j7);
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        S1.V.O(objZ0);
        j7 = ((S0.o) objZ0).f4904a;
        return new S0.o(j7);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object e(long j4, p122w4.c cVar) {
        p086q0.b bVar;
        long j6;
        if (cVar instanceof p086q0.b) {
            bVar = (p086q0.b) cVar;
            int i = bVar.f11195m;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.f11195m = i - Integer.MIN_VALUE;
            } else {
                bVar = new p086q0.b(this, cVar);
            }
        } else {
            bVar = new p086q0.b(this, cVar);
        }
        Object objB0 = bVar.f11193k;
        v4.a aVar = v4.a.f13292h;
        int i3 = bVar.f11195m;
        if (i3 == 0) {
            S1.V.O(objB0);
            p086q0.e eVar = (p086q0.e) this.i;
            p086q0.e eVar2 = null;
            if (eVar != null && eVar.f5969t) {
                eVar2 = (p086q0.e) AbstractC1098f.j(eVar);
            }
            if (eVar2 != null) {
                bVar.f11195m = 1;
                objB0 = eVar2.B0(j4, bVar);
                if (objB0 == aVar) {
                    return aVar;
                }
            } else {
                j6 = 0;
            }
            return new S0.o(j6);
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        S1.V.O(objB0);
        j6 = ((S0.o) objB0).f4904a;
        return new S0.o(j6);
    }

    public InterfaceC0714o f() {
        return ((p044i0.b) this.f395k).f9385h.f9383c;
    }

    public ColorStateList g(int i) {
        int resourceId;
        ColorStateList colorStateListX;
        TypedArray typedArray = (TypedArray) this.f394j;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListX = AbstractC0473d.x((Context) this.i, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListX;
    }

    @Override // p079o4.a
    public Object get() {
        switch (this.f393h) {
            case 11:
                return new L2.q(new Z2.f(13, false), new W2.g(13), (Q2.c) ((G0.p) this.i).get(), (R2.l) ((K2.k) this.f394j).get(), (R2.m) ((H1.d) this.f395k).get());
            case 12:
            default:
                return new R2.d((Context) ((N2.c) this.i).f3892h, (S2.d) ((p079o4.a) this.f394j).get(), (R2.b) ((W2.g) this.f395k).get());
            case 13:
                long id = Thread.currentThread().getId();
                if (id == AbstractC0204b.f3682a) {
                    return this.f395k;
                }
                V.f fVar = (V.f) ((AtomicReference) this.i).get();
                int iA = fVar.a(id);
                if (iA >= 0) {
                    return fVar.f5398c[iA];
                }
                return null;
        }
    }

    public Drawable h(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f394j;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : AbstractC0473d.z((Context) this.i, resourceId);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [I0.d] */
    /* JADX WARN: Type inference failed for: r15v0, types: [I0.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    public Typeface i(int i, int i3, I0.d dVar) {
        ?? r10;
        ?? r15;
        int i6 = 2;
        int resourceId = ((TypedArray) this.f394j).getResourceId(i, 0);
        Typeface typefaceB = null;
        if (resourceId != 0) {
            if (((TypedValue) this.f395k) == null) {
                this.f395k = new TypedValue();
            }
            TypedValue typedValue = (TypedValue) this.f395k;
            ThreadLocal threadLocal = p002a1.l.f6144a;
            Context context = (Context) this.i;
            if (!context.isRestricted()) {
                Resources resources = context.getResources();
                resources.getValue(resourceId, typedValue, true);
                CharSequence charSequence = typedValue.string;
                if (charSequence == null) {
                    throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(resourceId) + "\" (" + Integer.toHexString(resourceId) + ") is not a Font: " + typedValue);
                }
                String string = charSequence.toString();
                if (string.startsWith("res/")) {
                    Typeface typefaceC = (Typeface) p008b1.f.f7053b.a(p008b1.f.d(resources, resourceId, string, typedValue.assetCookie, i3));
                    if (typefaceC != null) {
                        new Handler(Looper.getMainLooper()).post(new I1.g(dVar, i6, typefaceC));
                        r15 = dVar;
                    } else {
                        try {
                            try {
                                if (string.toLowerCase().endsWith(".xml")) {
                                    p002a1.e eVarF = p002a1.b.f(resources.getXml(resourceId), resources);
                                    if (eVarF == null) {
                                        dVar.a(-3);
                                        dVar = dVar;
                                    } else {
                                        typefaceB = p008b1.f.b(context, eVarF, resources, resourceId, string, typedValue.assetCookie, i3, dVar, true);
                                        dVar = dVar;
                                    }
                                } else {
                                    typefaceC = p008b1.f.c(resources, resourceId, string, typedValue.assetCookie, i3);
                                    if (typefaceC != null) {
                                        Handler handler = new Handler(Looper.getMainLooper());
                                        I1.g gVar = new I1.g(dVar, i6, typefaceC);
                                        handler.post(gVar);
                                        r15 = gVar;
                                    } else {
                                        dVar.a(-3);
                                        r15 = dVar;
                                    }
                                }
                            } catch (IOException | XmlPullParserException unused) {
                                r10.a(-3);
                            }
                        } catch (IOException | XmlPullParserException unused2) {
                            r10 = dVar;
                        }
                    }
                    typefaceB = typefaceC;
                    dVar = r15;
                } else {
                    dVar.a(-3);
                }
                return typefaceB;
            }
        }
        return null;
    }

    public C0033q0 j() {
        C0033q0 c0033q0 = (C0033q0) this.f394j;
        if (c0033q0 != null) {
            return c0033q0;
        }
        E4.k.m("keyboardActions");
        throw null;
    }

    public p5.i0 k() {
        p5.i0 i0Var;
        p5.Q q6 = (p5.Q) this.f395k;
        if (q6.f10975g0 && (i0Var = (p5.i0) this.i) != null) {
            this.i = null;
            return i0Var;
        }
        TreeSet<p5.i0> treeSet = (TreeSet) this.f394j;
        for (p5.i0 i0Var2 : treeSet) {
            int i = ((p5.O) i0Var2.c()).i;
            if (i > q6.f10998y) {
                break;
            }
            q6.u(i0Var2, treeSet);
            if (i == q6.f10998y) {
                return i0Var2;
            }
        }
        return null;
    }

    public long l() {
        return ((p044i0.b) this.f395k).f9385h.f9384d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public androidx.lifecycle.O m(E4.f fVar, String str) {
        androidx.lifecycle.O oA;
        E4.k.f("key", str);
        androidx.lifecycle.U u6 = (androidx.lifecycle.U) this.i;
        u6.getClass();
        LinkedHashMap linkedHashMap = u6.f6977a;
        androidx.lifecycle.O o6 = (androidx.lifecycle.O) linkedHashMap.get(str);
        boolean zC = fVar.c(o6);
        androidx.lifecycle.Q q6 = (androidx.lifecycle.Q) this.f394j;
        if (zC) {
            if (q6 instanceof androidx.lifecycle.T) {
                E4.k.c(o6);
                ((androidx.lifecycle.T) q6).d(o6);
            }
            E4.k.d("null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel", o6);
            return o6;
        }
        C1.c cVar = new C1.c((C1.b) this.f395k);
        ((LinkedHashMap) cVar.f603h).put(E1.c.f1006a, str);
        try {
            try {
                oA = q6.b(fVar, cVar);
            } catch (AbstractMethodError unused) {
                oA = q6.a(p020d2.n.s(fVar));
            }
        } catch (AbstractMethodError unused2) {
            oA = q6.c(p020d2.n.s(fVar), cVar);
        }
        E4.k.f("viewModel", oA);
        androidx.lifecycle.O o7 = (androidx.lifecycle.O) linkedHashMap.put(str, oA);
        if (o7 != null) {
            o7.b();
        }
        return oA;
    }

    public boolean n() {
        if (((L0.r) this.i).f3038h != this.f395k) {
            return true;
        }
        C0031p0 c0031p0 = (C0031p0) this.f394j;
        return c0031p0 != null && c0031p0.n();
    }

    @Override // okhttp3.Callback
    public void onFailure(Call call, IOException iOException) {
        E4.k.f("call", call);
        E4.k.f("e", iOException);
        int i = H3.j.f1793n;
        iOException.toString();
    }

    @Override // okhttp3.Callback
    public void onResponse(Call call, Response response) {
        H3.j jVar = (H3.j) this.f395k;
        E4.k.f("call", call);
        E4.k.f(LoginActivity.RESPONSE_KEY, response);
        ResponseBody responseBodyBody = response.body();
        if (responseBodyBody == null) {
            int i = H3.j.f1793n;
            return;
        }
        String strString = responseBodyBody.string();
        if (strString == null) {
            int i3 = H3.j.f1793n;
            return;
        }
        try {
            Object objEvaluate = XPathFactory.newInstance().newXPath().evaluate("//CurrentTransportState[1]", new InputSource(new StringReader(M4.s.U(M4.s.U(M4.s.U(strString, "&quot;", "\""), "&gt;", ">"), "&lt;", "<"))), XPathConstants.NODE);
            E4.k.d("null cannot be cast to non-null type org.w3c.dom.Node", objEvaluate);
            boolean zEquals = "PLAYING".equals(((Node) objEvaluate).getTextContent());
            H3.j jVar2 = (H3.j) this.i;
            if (zEquals) {
                jVar2.f1781c.setValue("playing");
                H3.j.g(jVar2);
            } else {
                jVar2.f1781c.setValue("paused");
            }
            if (E4.k.a(jVar2.c(), (String) this.f394j)) {
                com.nanjoran.ilightshow.Services.D[] dArr = com.nanjoran.ilightshow.Services.D.f8246h;
                return;
            }
            if ("playing".equals(jVar.c())) {
                com.nanjoran.ilightshow.Services.D[] dArr2 = com.nanjoran.ilightshow.Services.D.f8246h;
                com.nanjoran.ilightshow.Services.M.f8305O.I();
            } else {
                com.nanjoran.ilightshow.Services.D[] dArr3 = com.nanjoran.ilightshow.Services.D.f8246h;
                com.nanjoran.ilightshow.Services.M.f8305O.f8333t = false;
            }
            jVar.e();
        } catch (Exception unused) {
            int i6 = H3.j.f1793n;
        }
    }

    public void p() {
        ((TypedArray) this.f394j).recycle();
    }

    public void q() {
        Context context = (Context) this.i;
        if (context == null) {
            return;
        }
        String strJ = ((p105t3.m) this.f395k).j((ArrayList) this.f394j);
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("prefFile", 0).edit();
        editorEdit.putString("storeddevices", strJ);
        editorEdit.apply();
        SharedDeviceStorage.save$default(SharedDeviceStorage.INSTANCE, context, (ArrayList) this.f394j, null, 4, null);
    }

    public void r(I2.a aVar) {
        C0074p c0074p = new C0074p(6);
        L2.i iVar = (L2.i) this.i;
        I2.b bVar = (I2.b) this.f394j;
        L2.q qVar = (L2.q) this.f395k;
        I2.c cVar = I2.c.f1854h;
        C0031p0 c0031p0A = L2.i.a();
        c0031p0A.t(iVar.f3065a);
        c0031p0A.f395k = cVar;
        c0031p0A.f394j = iVar.f3066b;
        L2.i iVarB = c0031p0A.b();
        A0.b bVar2 = new A0.b();
        bVar2.f13f = new HashMap();
        bVar2.f11d = Long.valueOf(qVar.f3081a.d());
        bVar2.f12e = Long.valueOf(qVar.f3082b.d());
        bVar2.f8a = "PLAY_BILLING_LIBRARY";
        bVar2.f10c = new L2.l(bVar, aVar.f1852a.b());
        bVar2.f9b = null;
        L2.h hVarD = bVar2.D();
        Q2.b bVar3 = (Q2.b) qVar.f3083c;
        bVar3.getClass();
        bVar3.f4696b.execute(new L3.a(bVar3, iVarB, c0074p, hVarD, 1));
    }

    public void s(Object obj) {
        long id = Thread.currentThread().getId();
        if (id == AbstractC0204b.f3682a) {
            this.f395k = obj;
            return;
        }
        synchronized (this.f394j) {
            V.f fVar = (V.f) ((AtomicReference) this.i).get();
            int iA = fVar.a(id);
            if (iA < 0) {
                ((AtomicReference) this.i).set(fVar.b(id, obj));
            } else {
                fVar.f5398c[iA] = obj;
            }
        }
    }

    public void t(String str) {
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.i = str;
    }

    public String toString() {
        String str;
        String strConcat = "";
        switch (this.f393h) {
            case 2:
                StringBuilder sb = new StringBuilder("NavDeepLinkRequest{");
                Uri uri = (Uri) this.i;
                if (uri != null) {
                    sb.append(" uri=");
                    sb.append(String.valueOf(uri));
                }
                String str2 = (String) this.f394j;
                if (str2 != null) {
                    sb.append(" action=");
                    sb.append(str2);
                }
                String str3 = (String) this.f395k;
                if (str3 != null) {
                    sb.append(" mimetype=");
                    sb.append(str3);
                }
                sb.append(" }");
                String string = sb.toString();
                E4.k.e("sb.toString()", string);
                return string;
            case 21:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.i);
                sb2.append('{');
                C0581m c0581m = ((C0581m) this.f394j).f7969b;
                while (c0581m != null) {
                    Object obj = c0581m.f7968a;
                    sb2.append(strConcat);
                    if (obj == null || !obj.getClass().isArray()) {
                        sb2.append(obj);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb2.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    c0581m = c0581m.f7969b;
                    strConcat = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            case 26:
                Pattern pattern = m5.s.f10492a;
                InetSocketAddress inetSocketAddress = (InetSocketAddress) this.i;
                if (inetSocketAddress == null) {
                    str = null;
                } else {
                    InetAddress address = inetSocketAddress.getAddress();
                    if (address == null || !address.isAnyLocalAddress()) {
                        String hostString = m5.s.f10494c ? inetSocketAddress.getHostString() : "";
                        String hostAddress = address != null ? address.getHostAddress() : "<unresolved>";
                        strConcat = hostString.equals(hostAddress) ? "" : hostString.concat("/");
                        if (inetSocketAddress.getAddress() instanceof Inet6Address) {
                            str = strConcat + "[" + hostAddress + "]:" + inetSocketAddress.getPort();
                        } else {
                            str = strConcat + hostAddress + ":" + inetSocketAddress.getPort();
                        }
                    } else {
                        str = "port " + inetSocketAddress.getPort();
                    }
                }
                return AbstractC0013g0.i("UDP(", str, ")");
            default:
                return super.toString();
        }
    }

    public void u(InterfaceC0714o interfaceC0714o) {
        ((p044i0.b) this.f395k).f9385h.f9383c = interfaceC0714o;
    }

    public void v(S0.b bVar) {
        ((p044i0.b) this.f395k).f9385h.f9381a = bVar;
    }

    public void w(S0.k kVar) {
        ((p044i0.b) this.f395k).f9385h.f9382b = kVar;
    }

    public void x(long j4) {
        ((p044i0.b) this.f395k).f9385h.f9384d = j4;
    }

    public void y() {
        W.j jVar = (W.j) this.i;
        LinkedHashMap linkedHashMap = jVar.f5536c;
        String str = (String) this.f394j;
        List list = (List) linkedHashMap.remove(str);
        if (list != null) {
            list.remove((C0043w) this.f395k);
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        jVar.f5536c.put(str, list);
    }

    public /* synthetic */ C0031p0(Object obj, Object obj2, Object obj3, int i) {
        this.f393h = i;
        this.i = obj;
        this.f394j = obj2;
        this.f395k = obj3;
    }

    public C0031p0(String str) {
        this.f393h = 21;
        C0581m c0581m = new C0581m();
        this.f394j = c0581m;
        this.f395k = c0581m;
        this.i = str;
    }

    public C0031p0(Set set, String str, String str2) {
        this.f393h = 20;
        p051j3.a aVar = p051j3.a.f9717a;
        Set setUnmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        Map map = Collections.EMPTY_MAP;
        this.f394j = str2;
        this.f395k = aVar;
        HashSet hashSet = new HashSet(setUnmodifiableSet);
        Iterator it = map.values().iterator();
        if (!it.hasNext()) {
            this.i = Collections.unmodifiableSet(hashSet);
            return;
        }
        throw p138z3.b.a(it);
    }

    public C0031p0(Context context) {
        K3.a deviceHueBridge;
        this.f393h = 6;
        this.i = context;
        this.f394j = new ArrayList();
        p105t3.n nVar = new p105t3.n();
        Excluder excluderB = nVar.f12577a.clone();
        excluderB.f8027h = true;
        nVar.f12577a = excluderB;
        nVar.f12581e.add(new LowercaseEnumTypeAdapterFactory());
        p105t3.m mVarA = nVar.a();
        this.f395k = mVarA;
        SharedDeviceStorageDocument sharedDeviceStorageDocumentLoad = SharedDeviceStorage.INSTANCE.load(context);
        if (sharedDeviceStorageDocumentLoad != null) {
            List<SharedPersistedDevice> devices = sharedDeviceStorageDocumentLoad.getDevices();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = devices.iterator();
            while (it.hasNext()) {
                K3.a device = ((SharedPersistedDevice) it.next()).toDevice();
                if (device != null) {
                    arrayList.add(device);
                }
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            this.f394j = arrayList2;
            Objects.toString(arrayList2);
            return;
        }
        String string = context.getSharedPreferences("prefFile", 0).getString("storeddevices", null);
        if (string != null) {
            ArrayList arrayList3 = new ArrayList();
            for (K3.a aVar : (List) mVarA.c(new StringReader(string), p132y3.a.get(new J3.g().getType()))) {
                K3.d dVar = aVar.type;
                int i = dVar == null ? -1 : J3.f.f1938a[dVar.ordinal()];
                if (i == -1) {
                    break;
                }
                if (i == 1) {
                    deviceHueBridge = new DeviceHueBridge();
                } else if (i == 2) {
                    deviceHueBridge = new L3.d();
                } else if (i == 3) {
                    deviceHueBridge = new M3.c();
                } else if (i == 4) {
                    deviceHueBridge = new M3.c();
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                deviceHueBridge.name = aVar.name;
                deviceHueBridge.type = aVar.type;
                deviceHueBridge.id = aVar.id;
                deviceHueBridge.ip = aVar.ip;
                deviceHueBridge.token = aVar.token;
                deviceHueBridge.port = aVar.port;
                deviceHueBridge.customInfo = aVar.customInfo;
                arrayList3.add(deviceHueBridge);
            }
            this.f394j = arrayList3;
            SharedDeviceStorage.save$default(SharedDeviceStorage.INSTANCE, context, arrayList3, null, 4, null);
        }
        Objects.toString((ArrayList) this.f394j);
    }

    public C0031p0(androidx.lifecycle.U u6, androidx.lifecycle.Q q6, C1.b bVar) {
        this.f393h = 1;
        E4.k.f("store", u6);
        E4.k.f("extras", bVar);
        this.i = u6;
        this.f394j = q6;
        this.f395k = bVar;
    }

    public C0031p0(L2.i iVar, I2.b bVar, Z2.f fVar, L2.q qVar) {
        this.f393h = 10;
        this.i = iVar;
        this.f394j = bVar;
        this.f395k = qVar;
    }

    public C0031p0(p130y0.C0 c6) {
        this.f393h = 0;
        this.i = c6;
    }

    public C0031p0(int i) {
        this.f393h = i;
        switch (i) {
            case 14:
                this.f395k = new W2.g(8);
                break;
            case 16:
                this.i = new WeakHashMap();
                this.f394j = new WeakHashMap();
                this.f395k = new WeakHashMap();
                break;
            case 29:
                this.f394j = new p058l0.I(1, this);
                break;
            default:
                this.i = new AtomicReference(V.b.f5392b);
                this.f394j = new Object();
                break;
        }
    }

    public C0031p0(Intent intent) {
        this.f393h = 2;
        Uri data = intent.getData();
        String action = intent.getAction();
        String type = intent.getType();
        this.i = data;
        this.f394j = action;
        this.f395k = type;
    }

    public C0031p0(View view) {
        this.f393h = 12;
        this.i = view;
        this.f394j = G4.a.y(p084p4.g.i, new C0043w(19, this));
        this.f395k = new C0715p(view);
    }

    public C0031p0(p044i0.b bVar) {
        this.f393h = 24;
        this.f395k = bVar;
        this.i = new C0715p(1, this);
    }

    public C0031p0(Context context, TypedArray typedArray) {
        this.f393h = 27;
        this.i = context;
        this.f394j = typedArray;
    }

    public C0031p0(InetSocketAddress inetSocketAddress, String str, String[] strArr) {
        this.f393h = 26;
        if ((strArr.length & 1) == 0) {
            HashMap map = new HashMap();
            for (int i = 0; i < strArr.length; i += 2) {
                String str2 = strArr[i];
                int i3 = i + 1;
                String str3 = strArr[i3];
                if (str2 != null) {
                    if (str2.isEmpty()) {
                        throw new IllegalArgumentException((i3 / 2) + ". key is empty");
                    }
                    if (str3 != null) {
                        if (((String) map.put(str2, str3)) != null) {
                            throw new IllegalArgumentException((i3 / 2) + ". key '" + str2 + "' is provided twice");
                        }
                    } else {
                        throw new NullPointerException((i3 / 2) + ". value is null");
                    }
                } else {
                    throw new NullPointerException((i3 / 2) + ". key is null");
                }
            }
            if (inetSocketAddress != null) {
                this.i = inetSocketAddress;
                this.f394j = str == null ? null : str.toLowerCase();
                Map mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(map));
                this.f395k = mapUnmodifiableMap;
                Iterator it = mapUnmodifiableMap.keySet().iterator();
                while (it.hasNext() && ((String) it.next()).startsWith(Marker.ANY_MARKER)) {
                }
                return;
            }
            throw new NullPointerException("missing peer socket address, must not be null!");
        }
        throw new IllegalArgumentException(AbstractC0013g0.l(new StringBuilder("number of attributes must be even, not "), strArr.length, "!"));
    }

    public C0031p0(L0.r rVar, C0031p0 c0031p0) {
        this.f393h = 15;
        this.i = rVar;
        this.f394j = c0031p0;
        this.f395k = rVar.f3038h;
    }

    public C0031p0(p015c2.h hVar) {
        this.f393h = 23;
        this.f394j = new ArrayList();
        this.f395k = new HashMap();
        this.i = hVar;
    }

    public C0031p0(p5.Q q6) {
        this.f393h = 28;
        this.f395k = q6;
        this.i = null;
        this.f394j = new TreeSet(new i5.f(1));
    }
}

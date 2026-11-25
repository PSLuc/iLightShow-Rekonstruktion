package D;

import B.C0005c0;
import B.C0031p0;
import B.C0043w;
import G0.C0110f;
import G0.I;
import O1.C0310c;
import O1.InterfaceC0311d;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextPaint;
import android.util.SparseIntArray;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import c5.C0489j;
import c5.C0496q;
import c5.T;
import c5.l0;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import com.google.android.gms.internal.play_billing.AbstractC0602x;
import com.google.android.gms.internal.play_billing.C0559d1;
import com.google.android.gms.internal.play_billing.C0562e1;
import com.google.android.gms.internal.play_billing.C0568g1;
import com.google.android.gms.internal.play_billing.F1;
import com.google.android.gms.internal.play_billing.m1;
import com.google.android.gms.internal.play_billing.n1;
import com.google.android.gms.internal.play_billing.q1;
import com.google.android.gms.internal.play_billing.t1;
import com.google.android.gms.internal.play_billing.u1;
import com.google.android.gms.internal.play_billing.v1;
import com.google.android.gms.internal.play_billing.y1;
import com.nanjoran.ilightshow.Services.lights.storage.SharedDeviceStorage;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.reflect.InvocationTargetException;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class x implements I0.c, N2.b, InterfaceC0311d, O1.z, W.l, p060l3.a, l0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f706h;
    public Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f707j;

    public /* synthetic */ x(int i, Object obj, Object obj2, boolean z5) {
        this.f706h = i;
        this.i = obj2;
        this.f707j = obj;
    }

    @Override // I0.c
    public int a(int i) {
        switch (this.f706h) {
            case 4:
                CharSequence charSequence = (CharSequence) this.i;
                return ((TextPaint) this.f707j).getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 2);
        }
        do {
            I0.d dVar = (I0.d) this.f707j;
            dVar.b(i);
            i = ((BreakIterator) dVar.f1809e).preceding(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.i).charAt(i)));
        return i;
    }

    @Override // I0.c
    public int b(int i) {
        switch (this.f706h) {
            case 4:
                CharSequence charSequence = (CharSequence) this.i;
                return ((TextPaint) this.f707j).getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 0);
        }
        do {
            I0.d dVar = (I0.d) this.f707j;
            dVar.b(i);
            i = ((BreakIterator) dVar.f1809e).following(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.i).charAt(i - 1)));
        return i;
    }

    @Override // O1.InterfaceC0311d
    public void c(O1.g gVar) {
        AbstractC0602x.g("BillingClient", "Reconnection finished with result: " + gVar.f4493a);
        try {
            ((F1) this.i).a(gVar);
        } catch (Throwable unused) {
            AbstractC0602x.h("BillingClient");
        }
        C0310c c0310c = (C0310c) this.f707j;
        if (c0310c.f4459A != null) {
            O1.n nVar = new O1.n(this, 5, gVar);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                nVar.run();
            } else {
                c0310c.f4467e.post(nVar);
            }
        }
    }

    @Override // W.l
    public Object d(W.b bVar, Object obj) {
        return ((D4.e) this.i).d(bVar, obj);
    }

    @Override // O1.InterfaceC0311d
    public void e() {
        AbstractC0602x.g("BillingClient", "Reconnection attempt failed.");
        try {
            ((F1) this.i).a(O1.A.f4429j);
        } catch (Throwable unused) {
            AbstractC0602x.h("BillingClient");
        }
        C0310c c0310c = (C0310c) this.f707j;
        if (c0310c.f4459A != null) {
            L2.o oVar = new L2.o(1, this);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                oVar.run();
            } else {
                c0310c.f4467e.post(oVar);
            }
        }
    }

    @Override // I0.c
    public int f(int i) {
        CharSequence charSequence;
        switch (this.f706h) {
            case 4:
                CharSequence charSequence2 = (CharSequence) this.i;
                int textRunCursor = ((TextPaint) this.f707j).getTextRunCursor(charSequence2, 0, charSequence2.length(), false, i, 0);
                if (textRunCursor != -1) {
                    if (((TextPaint) this.f707j).getTextRunCursor(charSequence2, 0, charSequence2.length(), false, textRunCursor, 0) != -1) {
                        return textRunCursor;
                    }
                }
                return -1;
        }
        do {
            I0.d dVar = (I0.d) this.f707j;
            dVar.b(i);
            i = ((BreakIterator) dVar.f1809e).following(i);
            if (i != -1) {
                charSequence = (CharSequence) this.i;
                if (i == charSequence.length()) {
                }
            }
            return -1;
        } while (Character.isWhitespace(charSequence.charAt(i)));
        return i;
    }

    @Override // I0.c
    public int g(int i) {
        switch (this.f706h) {
            case 4:
                CharSequence charSequence = (CharSequence) this.i;
                int textRunCursor = ((TextPaint) this.f707j).getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 2);
                if (textRunCursor != -1) {
                    if (((TextPaint) this.f707j).getTextRunCursor(charSequence, 0, charSequence.length(), false, textRunCursor, 2) != -1) {
                        return textRunCursor;
                    }
                }
                return -1;
        }
        do {
            I0.d dVar = (I0.d) this.f707j;
            dVar.b(i);
            i = ((BreakIterator) dVar.f1809e).preceding(i);
            if (i == -1 || i == 0) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.i).charAt(i - 1)));
        return i;
    }

    @Override // p079o4.a
    public Object get() {
        switch (this.f706h) {
            case 11:
                return new M2.f((Context) ((N2.c) this.i).f3892h, (M2.d) ((M2.e) this.f707j).get());
            default:
                return new S2.h(new Z2.f(13, false), new W2.g(13), S2.a.f4988f, (S2.j) ((M2.e) this.i).get(), (p079o4.a) this.f707j);
        }
    }

    @Override // p060l3.a
    public void h(K.y yVar) {
        ((Map) ((x) this.f707j).f707j).remove((p060l3.b) this.i);
    }

    public void i(String str, Object obj) {
        int length = str.length();
        String strValueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(length + 1 + strValueOf.length());
        sb.append(str);
        sb.append("=");
        sb.append(strValueOf);
        ((ArrayList) this.i).add(sb.toString());
    }

    public M0.w j(List list) {
        M0.i iVar;
        Exception e6;
        try {
            int size = list.size();
            int i = 0;
            iVar = null;
            while (i < size) {
                try {
                    M0.i iVar2 = (M0.i) list.get(i);
                    try {
                        iVar2.a((M0.j) this.f707j);
                        i++;
                        iVar = iVar2;
                    } catch (Exception e7) {
                        e6 = e7;
                        iVar = iVar2;
                        StringBuilder sb = new StringBuilder();
                        StringBuilder sb2 = new StringBuilder("Error while applying EditCommand batch to buffer (length=");
                        sb2.append(((M0.j) this.f707j).f3424a.c());
                        sb2.append(", composition=");
                        sb2.append(((M0.j) this.f707j).c());
                        sb2.append(", selection=");
                        M0.j jVar = (M0.j) this.f707j;
                        sb2.append((Object) I.g(AbstractC0599v0.d(jVar.f3425b, jVar.f3426c)));
                        sb2.append("):");
                        sb.append(sb2.toString());
                        sb.append('\n');
                        p089q4.l.d0(list, sb, new C0005c0(iVar, 19, this), 60);
                        String string = sb.toString();
                        E4.k.e("StringBuilder().apply(builderAction).toString()", string);
                        throw new RuntimeException(string, e6);
                    }
                } catch (Exception e8) {
                    e6 = e8;
                }
            }
            M0.j jVar2 = (M0.j) this.f707j;
            jVar2.getClass();
            C0110f c0110f = new C0110f(jVar2.f3424a.toString(), null, 6);
            M0.j jVar3 = (M0.j) this.f707j;
            long jD = AbstractC0599v0.d(jVar3.f3425b, jVar3.f3426c);
            I i3 = I.f(((M0.w) this.i).f3454b) ? null : new I(jD);
            M0.w wVar = new M0.w(c0110f, i3 != null ? i3.f1470a : AbstractC0599v0.d(I.d(jD), I.e(jD)), ((M0.j) this.f707j).c());
            this.i = wVar;
            return wVar;
        } catch (Exception e9) {
            iVar = null;
            e6 = e9;
        }
    }

    public CctBackendFactory k(String str) {
        Bundle bundle;
        Map map;
        ServiceInfo serviceInfo;
        if (((Map) this.f707j) == null) {
            Context context = (Context) this.i;
            try {
                PackageManager packageManager = context.getPackageManager();
                bundle = (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128)) == null) ? null : serviceInfo.metaData;
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (bundle == null) {
                map = Collections.EMPTY_MAP;
            } else {
                HashMap map2 = new HashMap();
                for (String str2 : bundle.keySet()) {
                    Object obj = bundle.get(str2);
                    if ((obj instanceof String) && str2.startsWith("backend:")) {
                        for (String str3 : ((String) obj).split(",", -1)) {
                            String strTrim = str3.trim();
                            if (!strTrim.isEmpty()) {
                                map2.put(strTrim, str2.substring(8));
                            }
                        }
                    }
                }
                map = map2;
            }
            this.f707j = map;
        }
        String str4 = (String) ((Map) this.f707j).get(str);
        if (str4 == null) {
            return null;
        }
        try {
            return (CctBackendFactory) Class.forName(str4).asSubclass(CctBackendFactory.class).getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException unused2) {
            StringBuilder sb = new StringBuilder("Class ");
            sb.append(str4);
            sb.append(" is not found.");
            return null;
        } catch (IllegalAccessException unused3) {
            StringBuilder sb2 = new StringBuilder("Could not instantiate ");
            sb2.append(str4);
            sb2.append(".");
            return null;
        } catch (InstantiationException unused4) {
            StringBuilder sb3 = new StringBuilder("Could not instantiate ");
            sb3.append(str4);
            sb3.append(".");
            return null;
        } catch (NoSuchMethodException unused5) {
            "Could not instantiate ".concat(str4);
            return null;
        } catch (InvocationTargetException unused6) {
            "Could not instantiate ".concat(str4);
            return null;
        }
    }

    @Override // c5.l0
    public Y4.a l(K4.b bVar) {
        Object obj = ((C0496q) this.f707j).get(p020d2.n.s(bVar));
        E4.k.e("get(...)", obj);
        T t6 = (T) obj;
        Object c0489j = t6.f7416a.get();
        if (c0489j == null) {
            synchronized (t6) {
                c0489j = t6.f7416a.get();
                if (c0489j == null) {
                    c0489j = new C0489j((Y4.a) ((D4.c) this.i).invoke(bVar));
                    t6.f7416a = new SoftReference(c0489j);
                }
            }
        }
        return ((C0489j) c0489j).f7460a;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, p4.f] */
    public InputMethodManager m() {
        return (InputMethodManager) this.f707j.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [D4.a, E4.l] */
    public Object n(K4.e eVar, Object obj) {
        E4.k.f("property", eVar);
        if (this.f707j == null) {
            Object objInvoke = ((E4.l) this.i).invoke();
            if (objInvoke == null) {
                throw new IllegalStateException(p012c.k.u(new StringBuilder("Initializer block of property "), ((E4.d) eVar).f1058k, " return null"));
            }
            this.f707j = objInvoke;
        }
        return this.f707j;
    }

    public void o() {
        String strJ = new p105t3.m().j((HashMap) this.f707j);
        Context context = (Context) this.i;
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("prefFile", 0).edit();
        editorEdit.putString("light_options", strJ);
        editorEdit.apply();
        SharedDeviceStorage.save$default(SharedDeviceStorage.INSTANCE, context, null, (HashMap) this.f707j, 2, null);
    }

    public void p(boolean z5, Status status) {
        HashMap map;
        HashMap map2;
        synchronized (((Map) this.i)) {
            map = new HashMap((Map) this.i);
        }
        synchronized (((Map) this.f707j)) {
            map2 = new HashMap((Map) this.f707j);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z5 || ((Boolean) entry.getValue()).booleanValue()) {
                entry.getKey().getClass();
                throw new ClassCastException();
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z5 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((p060l3.b) entry2.getKey()).a(new ApiException(status));
            }
        }
    }

    public void q(C0562e1 c0562e1) {
        try {
            v(c0562e1, (n1) this.i);
        } catch (Throwable unused) {
            AbstractC0602x.h("BillingLogger");
        }
    }

    public void r(C0562e1 c0562e1, int i, long j4) {
        try {
            m1 m1Var = (m1) ((n1) this.i).j();
            m1Var.c();
            n1.D((n1) m1Var.i, i);
            n1 n1Var = (n1) m1Var.a();
            this.i = n1Var;
            if (j4 != 0) {
                m1 m1Var2 = (m1) n1Var.j();
                m1Var2.c();
                n1.p((n1) m1Var2.i, j4);
                n1Var = (n1) m1Var2.a();
            }
            v(c0562e1, n1Var);
        } catch (Throwable unused) {
            AbstractC0602x.h("BillingLogger");
        }
    }

    public void s(C0562e1 c0562e1, long j4, boolean z5) {
        n1 n1Var;
        try {
            C0559d1 c0559d1 = (C0559d1) c0562e1.j();
            q1 q1Var = (q1) c0562e1.u().j();
            q1Var.c();
            t1.p((t1) q1Var.i, z5);
            c0559d1.c();
            C0562e1.p((C0562e1) c0559d1.i, (t1) q1Var.a());
            C0562e1 c0562e2 = (C0562e1) c0559d1.a();
            if (j4 == 0) {
                n1Var = (n1) this.i;
            } else {
                m1 m1Var = (m1) ((n1) this.i).j();
                m1Var.c();
                n1.p((n1) m1Var.i, j4);
                n1Var = (n1) m1Var.a();
            }
            v(c0562e2, n1Var);
        } catch (Throwable unused) {
            AbstractC0602x.h("BillingLogger");
        }
    }

    public void t(C0562e1 c0562e1, int i, long j4, boolean z5) {
        n1 n1Var;
        try {
            m1 m1Var = (m1) ((n1) this.i).j();
            m1Var.c();
            n1.D((n1) m1Var.i, i);
            this.i = (n1) m1Var.a();
            C0559d1 c0559d1 = (C0559d1) c0562e1.j();
            q1 q1Var = (q1) c0562e1.u().j();
            q1Var.c();
            t1.p((t1) q1Var.i, z5);
            c0559d1.c();
            C0562e1.p((C0562e1) c0559d1.i, (t1) q1Var.a());
            C0562e1 c0562e2 = (C0562e1) c0559d1.a();
            if (j4 == 0) {
                n1Var = (n1) this.i;
            } else {
                m1 m1Var2 = (m1) ((n1) this.i).j();
                m1Var2.c();
                n1.p((n1) m1Var2.i, j4);
                n1Var = (n1) m1Var2.a();
            }
            v(c0562e2, n1Var);
        } catch (Throwable unused) {
            AbstractC0602x.h("BillingLogger");
        }
    }

    public String toString() {
        switch (this.f706h) {
            case 16:
                return "HmacSHA256";
            case 25:
                StringBuilder sb = new StringBuilder(100);
                sb.append(this.f707j.getClass().getSimpleName());
                sb.append('{');
                ArrayList arrayList = (ArrayList) this.i;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    sb.append((String) arrayList.get(i));
                    if (i < size - 1) {
                        sb.append(", ");
                    }
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public void u(y1 y1Var) {
        try {
            O1.B b6 = (O1.B) this.f707j;
            u1 u1VarR = v1.r();
            u1VarR.d((n1) this.i);
            u1VarR.c();
            v1.p((v1) u1VarR.i, y1Var);
            b6.l((v1) u1VarR.a());
        } catch (Throwable unused) {
            AbstractC0602x.h("BillingLogger");
        }
    }

    public void v(C0562e1 c0562e1, n1 n1Var) {
        if (c0562e1 == null) {
            return;
        }
        try {
            u1 u1VarR = v1.r();
            u1VarR.d(n1Var);
            u1VarR.c();
            v1.s((v1) u1VarR.i, c0562e1);
            ((O1.B) this.f707j).l((v1) u1VarR.a());
        } catch (Throwable unused) {
            AbstractC0602x.h("BillingLogger");
        }
    }

    public void w(C0568g1 c0568g1, n1 n1Var) {
        try {
            u1 u1VarR = v1.r();
            u1VarR.d(n1Var);
            u1VarR.c();
            v1.t((v1) u1VarR.i, c0568g1);
            ((O1.B) this.f707j).l((v1) u1VarR.a());
        } catch (Throwable unused) {
            AbstractC0602x.h("BillingLogger");
        }
    }

    public /* synthetic */ x(int i, boolean z5) {
        this.f706h = i;
    }

    public /* synthetic */ x(Object obj, int i, Object obj2) {
        this.f706h = i;
        this.i = obj;
        this.f707j = obj2;
    }

    public x(C0310c c0310c, F1 f6) {
        this.f706h = 13;
        this.i = f6;
        Objects.requireNonNull(c0310c);
        this.f707j = c0310c;
    }

    public x(Context context, n1 n1Var) {
        this.f706h = 14;
        O1.B b6 = new O1.B();
        try {
            L2.q.b(context);
            C0031p0 c0031p0C = L2.q.a().c(J2.a.f1908e);
            I2.b bVar = new I2.b("proto");
            Z2.f fVar = new Z2.f(10, false);
            Set set = (Set) c0031p0C.i;
            if (set.contains(bVar)) {
                b6.f4439b = new C0031p0((L2.i) c0031p0C.f394j, bVar, fVar, (L2.q) c0031p0C.f395k);
                this.f707j = b6;
                this.i = n1Var;
                return;
            }
            throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", bVar, set));
        } catch (Throwable unused) {
            b6.f4438a = true;
        }
    }

    public x(p010b3.b bVar, Z2.f fVar) {
        this.f706h = 20;
        this.f707j = "ClientTelemetry.API";
        this.i = bVar;
    }

    public /* synthetic */ x(Object obj) {
        this.f706h = 25;
        this.f707j = obj;
        this.i = new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public x(D4.a aVar) {
        this.f706h = 2;
        this.i = (E4.l) aVar;
    }

    public x(byte[] bArr) {
        this.f706h = 16;
        Z2.f fVar = new Z2.f(11, false);
        this.f707j = Arrays.copyOf(bArr, bArr.length);
        this.i = fVar;
    }

    public x(D4.c cVar) {
        this.f706h = 29;
        this.i = cVar;
        this.f707j = new C0496q();
    }

    public x(View view) {
        this.f706h = 0;
        this.i = view;
        this.f707j = G4.a.y(p084p4.g.i, new C0043w(6, this));
    }

    public x(Context context) {
        this.f706h = 10;
        this.f707j = null;
        this.i = context;
    }

    public x(int i) {
        this.f706h = i;
        switch (i) {
            case 8:
                this.i = new W2.g(8);
                this.f707j = new K0.b();
                break;
            case 23:
                this.i = Collections.synchronizedMap(new WeakHashMap());
                this.f707j = Collections.synchronizedMap(new WeakHashMap());
                break;
            case 26:
                W2.d dVar = W2.d.f5579c;
                this.i = new SparseIntArray();
                this.f707j = dVar;
                break;
            case 28:
                this.i = new ConcurrentHashMap();
                this.f707j = new ReferenceQueue();
                break;
            default:
                this.i = new LinkedHashMap();
                this.f707j = new LinkedHashMap();
                break;
        }
    }

    public x(ArrayList arrayList, ArrayList arrayList2) {
        this.f706h = 27;
        int size = arrayList.size();
        this.i = new int[size];
        this.f707j = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.i)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.f707j)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public x(int i, int i3) {
        this.f706h = 27;
        this.i = new int[]{i, i3};
        this.f707j = new float[]{0.0f, 1.0f};
    }

    public x(int i, int i3, int i6) {
        this.f706h = 27;
        this.i = new int[]{i, i3, i6};
        this.f707j = new float[]{0.0f, 0.5f, 1.0f};
    }
}

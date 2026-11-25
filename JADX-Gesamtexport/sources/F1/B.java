package F1;

import B.AbstractC0013g0;
import B.C0031p0;
import S1.h0;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public abstract class B {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f1242p = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f1243h;
    public E i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f1244j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p080p.F f1245k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final LinkedHashMap f1246l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f1247m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f1248n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public p084p4.m f1249o;

    static {
        new LinkedHashMap();
    }

    public B(U u6) {
        E4.k.f("navigator", u6);
        LinkedHashMap linkedHashMap = V.f1329b;
        this.f1243h = h0.p(u6.getClass());
        this.f1244j = new ArrayList();
        this.f1245k = new p080p.F(0);
        this.f1246l = new LinkedHashMap();
    }

    public final Bundle c(Bundle bundle) {
        LinkedHashMap linkedHashMap = this.f1246l;
        if (bundle == null && linkedHashMap.isEmpty()) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            ((C0091h) entry.getValue()).getClass();
            E4.k.f("name", str);
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String str2 = (String) entry2.getKey();
                C0091h c0091h = (C0091h) entry2.getValue();
                if (!c0091h.f1347d) {
                    E4.k.f("name", str2);
                    S s6 = c0091h.f1344a;
                    if (c0091h.f1345b || !bundle2.containsKey(str2) || bundle2.get(str2) != null) {
                        try {
                            s6.a(str2, bundle2);
                        } catch (ClassCastException unused) {
                        }
                    }
                    StringBuilder sbW = p012c.k.w("Wrong argument type for '", str2, "' in argument bundle. ");
                    sbW.append(s6.b());
                    sbW.append(" expected.");
                    throw new IllegalArgumentException(sbW.toString().toString());
                }
            }
        }
        return bundle2;
    }

    public boolean equals(Object obj) {
        boolean z5;
        boolean z6;
        if (this != obj) {
            if (obj != null && (obj instanceof B)) {
                B b6 = (B) obj;
                boolean zA = E4.k.a(this.f1244j, b6.f1244j);
                p080p.F f6 = this.f1245k;
                int iF = f6.f();
                p080p.F f7 = b6.f1245k;
                if (iF != f7.f()) {
                    z5 = false;
                    break;
                }
                Iterator it = ((L4.a) L4.l.N(new E4.a(f6, 1))).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z5 = true;
                        break;
                    }
                    int iIntValue = ((Number) it.next()).intValue();
                    if (!E4.k.a(f6.c(iIntValue), f7.c(iIntValue))) {
                        z5 = false;
                        break;
                    }
                }
                LinkedHashMap linkedHashMap = this.f1246l;
                int size = linkedHashMap.size();
                LinkedHashMap linkedHashMap2 = b6.f1246l;
                if (size != linkedHashMap2.size()) {
                    z6 = false;
                    break;
                }
                Set setEntrySet = linkedHashMap.entrySet();
                E4.k.f("<this>", setEntrySet);
                Iterator it2 = setEntrySet.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z6 = true;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (!linkedHashMap2.containsKey(entry.getKey()) || !E4.k.a(linkedHashMap2.get(entry.getKey()), entry.getValue())) {
                        z6 = false;
                        break;
                    }
                }
                if (this.f1247m != b6.f1247m || !E4.k.a(this.f1248n, b6.f1248n) || !zA || !z5 || !z6) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0094  */
    public z g(C0031p0 c0031p0) {
        z zVar;
        this = this;
        ArrayList arrayList = this.f1244j;
        Bundle bundle = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        z zVar2 = null;
        int i = 0;
        while (i < size) {
            int i3 = i + 1;
            y yVar = (y) arrayList.get(i);
            LinkedHashMap linkedHashMap = this.f1246l;
            Uri uri = (Uri) c0031p0.i;
            Bundle bundleD = uri != null ? yVar.d(uri, linkedHashMap) : bundle;
            int iB = yVar.b(uri);
            String str = (String) c0031p0.f394j;
            boolean z5 = str != null && str.equals(bundle);
            if (bundleD != null) {
                zVar = new z(this, bundleD, yVar.f1398l, iB, z5);
                if (zVar2 != null || zVar.compareTo(zVar2) > 0) {
                    bundle = null;
                    zVar2 = zVar;
                } else {
                    bundle = null;
                }
            } else {
                if (z5) {
                    E4.k.f("arguments", linkedHashMap);
                    Bundle bundle2 = new Bundle();
                    if (uri != null) {
                        Pattern pattern = (Pattern) yVar.f1391d.getValue();
                        Matcher matcher = pattern != null ? pattern.matcher(uri.toString()) : null;
                        if (matcher != null && matcher.matches()) {
                            yVar.e(matcher, bundle2, linkedHashMap);
                            if (((Boolean) yVar.f1392e.getValue()).booleanValue()) {
                                yVar.f(uri, bundle2, linkedHashMap);
                            }
                        }
                    }
                    if (p081p0.c.v0(linkedHashMap, new x(1, bundle2)).isEmpty()) {
                        zVar = new z(this, bundleD, yVar.f1398l, iB, z5);
                        if (zVar2 != null) {
                        }
                        bundle = null;
                        zVar2 = zVar;
                    }
                }
                bundle = null;
            }
            i = i3;
        }
        return zVar2;
    }

    public int hashCode() {
        int i = this.f1247m * 31;
        String str = this.f1248n;
        int iHashCode = i + (str != null ? str.hashCode() : 0);
        ArrayList arrayList = this.f1244j;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            iHashCode = (((y) obj).f1388a.hashCode() + (iHashCode * 31)) * 961;
        }
        p080p.F f6 = this.f1245k;
        E4.k.f("<this>", f6);
        if (f6.f() > 0) {
            f6.g(0).getClass();
            throw new ClassCastException();
        }
        LinkedHashMap linkedHashMap = this.f1246l;
        for (String str2 : linkedHashMap.keySet()) {
            int iC = AbstractC0013g0.c(iHashCode * 31, str2, 31);
            Object obj2 = linkedHashMap.get(str2);
            iHashCode = iC + (obj2 != null ? obj2.hashCode() : 0);
        }
        return iHashCode;
    }

    public final z i(String str) {
        y yVar;
        E4.k.f("route", str);
        p084p4.m mVar = this.f1249o;
        if (mVar == null || (yVar = (y) mVar.getValue()) == null) {
            return null;
        }
        Uri uri = Uri.parse("android-app://androidx.navigation/".concat(str));
        E4.k.b(uri);
        Bundle bundleD = yVar.d(uri, this.f1246l);
        if (bundleD == null) {
            return null;
        }
        return new z(this, bundleD, yVar.f1398l, yVar.b(uri), false);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(0x");
        sb.append(Integer.toHexString(this.f1247m));
        sb.append(")");
        String str = this.f1248n;
        if (str != null && !M4.l.i0(str)) {
            sb.append(" route=");
            sb.append(this.f1248n);
        }
        String string = sb.toString();
        E4.k.e("sb.toString()", string);
        return string;
    }
}

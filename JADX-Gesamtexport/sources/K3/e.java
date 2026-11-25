package K3;

import D.x;
import E4.z;
import O1.A;
import O1.C0310c;
import O1.v;
import S1.V;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.os.Parcel;
import android.util.AttributeSet;
import android.util.Xml;
import com.google.android.gms.internal.play_billing.AbstractC0563f;
import com.google.android.gms.internal.play_billing.AbstractC0602x;
import com.google.android.gms.internal.play_billing.C0566g;
import com.google.android.gms.internal.play_billing.F1;
import com.google.android.gms.internal.play_billing.InterfaceC0572i;
import d5.i;
import e5.h;
import e5.j;
import e5.k;
import e5.o;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import org.xmlpull.v1.XmlPullParserException;
import p080p.q;
import p096s.AbstractC0931y;
import p096s.C0919l;
import p096s.I;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f2139c;

    public /* synthetic */ e(int i) {
        this.f2137a = i;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x009f  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(e eVar, p084p4.b bVar, p122w4.a aVar) {
        k kVar;
        byte bF;
        LinkedHashMap linkedHashMap;
        e eVar2;
        byte bE;
        LinkedHashMap linkedHashMap2;
        o oVar;
        if (aVar instanceof k) {
            kVar = (k) aVar;
            int i = kVar.f8775q;
            if ((i & Integer.MIN_VALUE) != 0) {
                kVar.f8775q = i - Integer.MIN_VALUE;
            } else {
                kVar = new k(eVar, aVar);
            }
        } else {
            kVar = new k(eVar, aVar);
        }
        Object obj = kVar.f8773o;
        v4.a aVar2 = v4.a.f13292h;
        int i3 = kVar.f8775q;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str = kVar.f8772n;
            linkedHashMap2 = kVar.f8771m;
            eVar2 = kVar.f8770l;
            p084p4.b bVar2 = kVar.f8769k;
            V.O(obj);
            linkedHashMap2.put(str, (JsonElement) obj);
            bE = ((o) eVar2.f2139c).e();
            if (bE == 4) {
                bF = bE;
                eVar = eVar2;
                linkedHashMap = linkedHashMap2;
                bVar = bVar2;
            } else if (bE != 7) {
                o.m((o) eVar2.f2139c, "Expected end of the object or comma", 0, null, 6);
                throw null;
            }
            oVar = (o) eVar2.f2139c;
            if (bE == 6) {
                oVar.f((byte) 7);
            } else if (bE == 4) {
                h.g(oVar, "object");
                throw null;
            }
            return new JsonObject(linkedHashMap2);
        }
        V.O(obj);
        o oVar2 = (o) eVar.f2139c;
        bF = oVar2.f((byte) 6);
        if (oVar2.q() == 4) {
            o.m(oVar2, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        linkedHashMap = new LinkedHashMap();
        o oVar3 = (o) eVar.f2139c;
        if (oVar3.b()) {
            String strI = oVar3.i();
            oVar3.f((byte) 5);
            kVar.f8769k = bVar;
            kVar.f8770l = eVar;
            kVar.f8771m = linkedHashMap;
            kVar.f8772n = strI;
            kVar.f8775q = 1;
            bVar.getClass();
            bVar.i = kVar;
            return aVar2;
        }
        byte b6 = bF;
        eVar2 = eVar;
        bE = b6;
        linkedHashMap2 = linkedHashMap;
        oVar = (o) eVar2.f2139c;
        if (bE == 6) {
            oVar.f((byte) 7);
        } else if (bE == 4) {
            h.g(oVar, "object");
            throw null;
        }
        return new JsonObject(linkedHashMap2);
    }

    public static e e(Resources resources, int i, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        float f6;
        float f7;
        Shader.TileMode tileMode;
        Shader radialGradient;
        Shader.TileMode tileMode2;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                ColorStateList colorStateListB = p002a1.c.b(resources, xml, attributeSetAsAttributeSet, theme);
                return new e((Shader) null, colorStateListB, colorStateListB.getDefaultColor());
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        TypedArray typedArrayE = p002a1.b.e(resources, theme, attributeSetAsAttributeSet, X0.a.f5758d);
        float f8 = !(xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null) ? 0.0f : typedArrayE.getFloat(8, 0.0f);
        float f9 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null ? typedArrayE.getFloat(9, 0.0f) : 0.0f;
        float f10 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null ? typedArrayE.getFloat(10, 0.0f) : 0.0f;
        float f11 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null ? typedArrayE.getFloat(11, 0.0f) : 0.0f;
        float f12 = !(xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null) ? 0.0f : typedArrayE.getFloat(3, 0.0f);
        float f13 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null ? typedArrayE.getFloat(4, 0.0f) : 0.0f;
        int i3 = !(xml.getAttributeValue("http://schemas.android.com/apk/res/android", "type") != null) ? 0 : typedArrayE.getInt(2, 0);
        int color = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null ? typedArrayE.getColor(0, 0) : 0;
        boolean z5 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
        int color2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null ? typedArrayE.getColor(7, 0) : 0;
        int color3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null ? typedArrayE.getColor(1, 0) : 0;
        int i6 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null ? typedArrayE.getInt(6, 0) : 0;
        float f14 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null ? typedArrayE.getFloat(5, 0.0f) : 0.0f;
        typedArrayE.recycle();
        int depth = xml.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        float f15 = f14;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            f6 = f9;
            if (next2 == 1) {
                f7 = f10;
                break;
            }
            int depth2 = xml.getDepth();
            f7 = f10;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                TypedArray typedArrayE2 = p002a1.b.e(resources, theme, attributeSetAsAttributeSet, X0.a.f5759e);
                boolean zHasValue = typedArrayE2.hasValue(0);
                boolean zHasValue2 = typedArrayE2.hasValue(1);
                if (!zHasValue || !zHasValue2) {
                    throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                }
                int color4 = typedArrayE2.getColor(0, 0);
                float f16 = typedArrayE2.getFloat(1, 0.0f);
                typedArrayE2.recycle();
                arrayList2.add(Integer.valueOf(color4));
                arrayList.add(Float.valueOf(f16));
            }
            f9 = f6;
            f10 = f7;
        }
        x xVar = arrayList2.size() > 0 ? new x(arrayList2, arrayList) : null;
        if (xVar == null) {
            xVar = z5 ? new x(color, color2, color3) : new x(color, color3);
        }
        if (i3 != 1) {
            if (i3 != 2) {
                if (i6 != 1) {
                    tileMode2 = i6 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
                } else {
                    tileMode2 = Shader.TileMode.REPEAT;
                }
                radialGradient = new LinearGradient(f8, f6, f7, f11, (int[]) xVar.i, (float[]) xVar.f707j, tileMode2);
            } else {
                radialGradient = new SweepGradient(f12, f13, (int[]) xVar.i, (float[]) xVar.f707j);
            }
        } else {
            if (f15 <= 0.0f) {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
            if (i6 != 1) {
                tileMode = i6 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
            } else {
                tileMode = Shader.TileMode.REPEAT;
            }
            radialGradient = new RadialGradient(f12, f13, f15, (int[]) xVar.i, (float[]) xVar.f707j, tileMode);
        }
        return new e(radialGradient, (ColorStateList) null, 0);
    }

    public void b(long j4) {
        if (d(j4)) {
            return;
        }
        int i = this.f2138b;
        long[] jArr = (long[]) this.f2139c;
        if (i >= jArr.length) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, Math.max(i + 1, jArr.length * 2));
            E4.k.e("copyOf(this, newSize)", jArrCopyOf);
            this.f2139c = jArrCopyOf;
        }
        ((long[]) this.f2139c)[i] = j4;
        if (i >= this.f2138b) {
            this.f2138b = i + 1;
        }
    }

    public I c(Float f6, int i) {
        I i3 = new I(f6, AbstractC0931y.f12148c);
        ((q) this.f2139c).i(i, i3);
        return i3;
    }

    public boolean d(long j4) {
        int i = this.f2138b;
        for (int i3 = 0; i3 < i; i3++) {
            if (((long[]) this.f2139c)[i3] == j4) {
                return true;
            }
        }
        return false;
    }

    public void f(int i, int i3) {
        int i6 = i3 + i;
        char[] cArr = (char[]) this.f2139c;
        if (cArr.length <= i6) {
            int i7 = i * 2;
            if (i6 < i7) {
                i6 = i7;
            }
            char[] cArrCopyOf = Arrays.copyOf(cArr, i6);
            E4.k.e("copyOf(...)", cArrCopyOf);
            this.f2139c = cArrCopyOf;
        }
    }

    public synchronized void g() {
        J3.c cVar;
        int i = this.f2138b - 1;
        this.f2138b = i;
        if (i <= 0 && (cVar = (J3.c) this.f2139c) != null) {
            cVar.invoke();
        }
    }

    public JsonElement h() {
        JsonElement jsonObject;
        Object obj;
        o oVar = (o) this.f2139c;
        byte bQ = oVar.q();
        if (bQ == 1) {
            return j(true);
        }
        if (bQ == 0) {
            return j(false);
        }
        if (bQ != 6) {
            if (bQ == 8) {
                return i();
            }
            o.m(oVar, "Cannot read Json element because of unexpected ".concat(h.l(bQ)), 0, null, 6);
            throw null;
        }
        int i = this.f2138b + 1;
        this.f2138b = i;
        if (i == 200) {
            j jVar = new j(this, null);
            v4.a aVar = p084p4.a.f10843a;
            p084p4.b bVar = new p084p4.b();
            bVar.f10844h = jVar;
            bVar.i = bVar;
            v4.a aVar2 = p084p4.a.f10843a;
            bVar.f10845j = aVar2;
            while (true) {
                obj = bVar.f10845j;
                p111u4.d dVar = bVar.i;
                if (dVar == null) {
                    break;
                }
                if (E4.k.a(aVar2, obj)) {
                    try {
                        j jVar2 = bVar.f10844h;
                        z.d(3, jVar2);
                        j jVar3 = new j(jVar2.f8768l, dVar);
                        jVar3.f8767k = bVar;
                        Object objO = jVar3.o(p084p4.x.f10867a);
                        if (objO != v4.a.f13292h) {
                            dVar.g(objO);
                        }
                    } catch (Throwable th) {
                        dVar.g(V.v(th));
                    }
                } else {
                    bVar.f10845j = aVar2;
                    dVar.g(obj);
                }
            }
            V.O(obj);
            jsonObject = (JsonElement) obj;
        } else {
            byte bF = oVar.f((byte) 6);
            if (oVar.q() == 4) {
                o.m(oVar, "Unexpected leading comma", 0, null, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (oVar.b()) {
                String strI = oVar.i();
                oVar.f((byte) 5);
                linkedHashMap.put(strI, h());
                bF = oVar.e();
                if (bF != 4) {
                    if (bF == 7) {
                        break;
                    }
                    o.m(oVar, "Expected end of the object or comma", 0, null, 6);
                    throw null;
                }
            }
            if (bF == 6) {
                oVar.f((byte) 7);
            } else if (bF == 4) {
                h.g(oVar, "object");
                throw null;
            }
            jsonObject = new JsonObject(linkedHashMap);
        }
        this.f2138b--;
        return jsonObject;
    }

    public JsonArray i() {
        o oVar = (o) this.f2139c;
        byte bE = oVar.e();
        if (oVar.q() == 4) {
            o.m(oVar, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (oVar.b()) {
            arrayList.add(h());
            bE = oVar.e();
            if (bE != 4) {
                boolean z5 = bE == 9;
                int i = oVar.f8792a;
                if (!z5) {
                    o.m(oVar, "Expected end of the array or comma", i, null, 4);
                    throw null;
                }
            }
        }
        if (bE == 8) {
            oVar.f((byte) 9);
        } else if (bE == 4) {
            h.g(oVar, "array");
            throw null;
        }
        return new JsonArray(arrayList);
    }

    public JsonPrimitive j(boolean z5) {
        o oVar = (o) this.f2139c;
        String strJ = !z5 ? oVar.j() : oVar.i();
        return (z5 || !E4.k.a(strJ, "null")) ? new d5.o(strJ, z5) : JsonNull.INSTANCE;
    }

    public void k() {
        e5.b bVar = e5.b.f8756c;
        char[] cArr = (char[]) this.f2139c;
        bVar.getClass();
        E4.k.f("array", cArr);
        synchronized (bVar) {
            int i = bVar.f6881a;
            if (cArr.length + i < e5.a.f8755a) {
                bVar.f6881a = i + cArr.length;
                ((p089q4.j) bVar.f6882b).addLast(cArr);
            }
        }
    }

    public void l(int i) {
        int i3 = this.f2138b;
        if (i < i3) {
            int i6 = i3 - 1;
            while (i < i6) {
                long[] jArr = (long[]) this.f2139c;
                int i7 = i + 1;
                jArr[i] = jArr[i7];
                i = i7;
            }
            this.f2138b--;
        }
    }

    public void m(String str) {
        E4.k.f("text", str);
        int length = str.length();
        if (length == 0) {
            return;
        }
        f(this.f2138b, length);
        str.getChars(0, str.length(), (char[]) this.f2139c, this.f2138b);
        this.f2138b += length;
    }

    public String n(F1 f6) {
        String str;
        switch (this.f2137a) {
            case 1:
                O1.x xVar = (O1.x) this.f2139c;
                int i = this.f2138b;
                try {
                    if (xVar.G == null) {
                        throw null;
                    }
                    InterfaceC0572i interfaceC0572i = xVar.G;
                    String packageName = xVar.f4540E.getPackageName();
                    if (i == 2) {
                        str = "LAUNCH_BILLING_FLOW";
                    } else if (i == 3) {
                        str = "ACKNOWLEDGE_PURCHASE";
                    } else if (i == 4) {
                        str = "CONSUME_ASYNC";
                    } else if (i != 5) {
                        str = i != 6 ? "QUERY_PRODUCT_DETAILS_ASYNC" : "START_CONNECTION";
                    } else {
                        str = "IS_FEATURE_SUPPORTED";
                    }
                    v vVar = new v(f6);
                    C0566g c0566g = (C0566g) interfaceC0572i;
                    Parcel parcelA = c0566g.a();
                    parcelA.writeString(packageName);
                    parcelA.writeString(str);
                    int i3 = AbstractC0563f.f7942a;
                    parcelA.writeStrongBinder(vVar);
                    try {
                        c0566g.f7939a.transact(1, parcelA, null, 1);
                        return "billingOverrideService.getBillingOverride";
                    } finally {
                        parcelA.recycle();
                    }
                } catch (Exception unused) {
                    xVar.G(95, 28, A.f4437r);
                    AbstractC0602x.h("BillingClientTesting");
                    f6.a(0);
                    return "billingOverrideService.getBillingOverride";
                }
            default:
                C0310c c0310c = (C0310c) this.f2139c;
                c0310c.l(new x(c0310c, f6), this.f2138b);
                return "reconnectIfNeeded";
        }
    }

    public String toString() {
        String str;
        switch (this.f2137a) {
            case 5:
                return new String((char[]) this.f2139c, 0, this.f2138b);
            case 8:
                StringBuilder sb = new StringBuilder("AnimationResult(endReason=");
                int i = this.f2138b;
                if (i != 1) {
                    str = i != 2 ? "null" : "Finished";
                } else {
                    str = "BoundReached";
                }
                sb.append(str);
                sb.append(", endState=");
                sb.append((C0919l) this.f2139c);
                sb.append(')');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ e(int i, int i3, Object obj) {
        this.f2137a = i3;
        this.f2139c = obj;
        this.f2138b = i;
    }

    public e(i iVar, o oVar) {
        this.f2137a = 6;
        this.f2139c = oVar;
    }

    public e(Shader shader, ColorStateList colorStateList, int i) {
        this.f2137a = 4;
        this.f2139c = shader;
        this.f2138b = i;
    }

    public e(int i, p031f1.e[] eVarArr) {
        this.f2137a = 7;
        this.f2138b = i;
        this.f2139c = eVarArr;
    }

    public e() {
        this.f2137a = 9;
        this.f2138b = 300;
        q qVar = p080p.i.f10737a;
        this.f2139c = new q();
    }
}

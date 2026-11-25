package p091r0;

import K0.b;
import N.C0208d;
import O1.C0308a;
import O2.a;
import Z.n;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.KeyEvent;
import c5.C0495p;
import com.google.firebase.encoders.EncodingException;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p080p.C;
import p080p.l;
import p080p.s;
import p080p.w;
import p083p3.c;
import p089q4.k;
import p099s3.e;
import p113v0.InterfaceC1033p;
import p119w1.p;
import p119w1.t;
import p124x0.D;
import p130y0.r;
import v5.g;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f11476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f11477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f11478d;

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, int i) {
        this.f11475a = i;
        this.f11476b = obj;
        this.f11477c = obj2;
        this.f11478d = obj3;
    }

    public static boolean c(Editable editable, KeyEvent keyEvent, boolean z5) {
        t[] tVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (tVarArr = (t[]) editable.getSpans(selectionStart, selectionEnd, t.class)) != null && tVarArr.length > 0) {
                for (t tVar : tVarArr) {
                    int spanStart = editable.getSpanStart(tVar);
                    int spanEnd = editable.getSpanEnd(tVar);
                    if ((z5 && spanStart == selectionStart) || ((!z5 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00ae  */
    public void a(long j4, List list, boolean z5) {
        boolean z6;
        boolean z7;
        long j6;
        g gVar;
        Object objB;
        w wVar;
        Object obj;
        h hVar = (h) this.f11477c;
        s sVar = (s) this.f11478d;
        int i = 0;
        sVar.f10775e = 0;
        long[] jArr = sVar.f10771a;
        char c6 = 7;
        if (jArr != C.f10714a) {
            k.k0(jArr);
            long[] jArr2 = sVar.f10771a;
            int i3 = sVar.f10774d;
            int i6 = i3 >> 3;
            long j7 = 255 << ((i3 & 7) << 3);
            jArr2[i6] = (jArr2[i6] & (~j7)) | j7;
        }
        k.j0(0, sVar.f10774d, sVar.f10773c);
        sVar.f10776f = C.c(sVar.f10774d) - sVar.f10775e;
        int size = list.size();
        boolean z8 = true;
        h hVar2 = hVar;
        int i7 = 0;
        boolean z9 = true;
        while (i7 < size) {
            n nVar = (n) list.get(i7);
            if (z9) {
                P.d dVar = hVar2.f11493a;
                int i8 = dVar.f4583j;
                if (i8 <= 0) {
                    obj = null;
                    break;
                }
                Object[] objArr = dVar.f4582h;
                int i9 = i;
                while (true) {
                    obj = objArr[i9];
                    if (E4.k.a(((g) obj).f11486b, nVar)) {
                        break;
                    }
                    int i10 = i9 + 1;
                    if (i10 >= i8) {
                        obj = null;
                        break;
                    }
                    i9 = i10;
                }
                gVar = (g) obj;
                if (gVar != null) {
                    gVar.f11492h = true;
                    gVar.f11487c.b(j4);
                    Object objB2 = sVar.b(j4);
                    w wVar2 = objB2;
                    if (objB2 == null) {
                        w wVar3 = new w();
                        sVar.d(j4, wVar3);
                        wVar2 = wVar3;
                    }
                    wVar2.a(gVar);
                } else {
                    z9 = false;
                    gVar = new g(nVar);
                    gVar.f11487c.b(j4);
                    objB = sVar.b(j4);
                    wVar = objB;
                    if (objB == null) {
                        w wVar4 = new w();
                        sVar.d(j4, wVar4);
                        wVar = wVar4;
                    }
                    wVar.a(gVar);
                    hVar2.f11493a.c(gVar);
                }
            } else {
                gVar = new g(nVar);
                gVar.f11487c.b(j4);
                objB = sVar.b(j4);
                wVar = objB;
                if (objB == null) {
                    w wVar5 = new w();
                    sVar.d(j4, wVar5);
                    wVar = wVar5;
                }
                wVar.a(gVar);
                hVar2.f11493a.c(gVar);
            }
            hVar2 = gVar;
            i7++;
            i = 0;
        }
        if (!z5) {
            return;
        }
        long[] jArr3 = sVar.f10772b;
        Object[] objArr2 = sVar.f10773c;
        long[] jArr4 = sVar.f10771a;
        int length = jArr4.length - 2;
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            long j8 = jArr4[i11];
            if ((((~j8) << c6) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                int i13 = 0;
                while (i13 < i12) {
                    if ((j8 & 255) < 128) {
                        int i14 = (i11 << 3) + i13;
                        boolean z10 = z8;
                        j6 = j8;
                        long j9 = jArr3[i14];
                        w wVar6 = (w) objArr2[i14];
                        P.d dVar2 = hVar.f11493a;
                        int i15 = dVar2.f4583j;
                        if (i15 > 0) {
                            Object[] objArr3 = dVar2.f4582h;
                            int i16 = 0;
                            while (true) {
                                z7 = z10;
                                ((g) objArr3[i16]).i(j9, wVar6);
                                int i17 = i16 + 1;
                                if (i17 >= i15) {
                                    break;
                                }
                                i16 = i17;
                                z10 = z7;
                            }
                        } else {
                            z7 = z10;
                        }
                    } else {
                        z7 = z8;
                        j6 = j8;
                    }
                    j8 = j6 >> 8;
                    i13++;
                    z8 = z7;
                }
                z6 = z8;
                if (i12 != 8) {
                    return;
                }
            } else {
                z6 = z8;
            }
            if (i11 == length) {
                return;
            }
            i11++;
            z8 = z6;
            c6 = 7;
        }
    }

    public void b() {
        ((ArrayList) this.f11477c).clear();
        this.f11478d = (D) this.f11476b;
        ((D) this.f11476b).L();
    }

    public boolean d(C0495p c0495p, boolean z5) {
        boolean z6;
        boolean z7;
        h hVar = (h) this.f11477c;
        if (hVar.a((l) c0495p.i, (InterfaceC1033p) this.f11476b, c0495p, z5)) {
            P.d dVar = hVar.f11493a;
            int i = dVar.f4583j;
            if (i > 0) {
                Object[] objArr = dVar.f4582h;
                int i3 = 0;
                z6 = false;
                do {
                    z6 = ((g) objArr[i3]).h(c0495p, z5) || z6;
                    i3++;
                } while (i3 < i);
            } else {
                z6 = false;
            }
            int i6 = dVar.f4583j;
            if (i6 > 0) {
                Object[] objArr2 = dVar.f4582h;
                int i7 = 0;
                z7 = false;
                do {
                    z7 = ((g) objArr2[i7]).g(c0495p) || z7;
                    i7++;
                } while (i7 < i6);
            } else {
                z7 = false;
            }
            hVar.c(c0495p);
            if (z7 || z6) {
                return true;
            }
        }
        return false;
    }

    public void e(Object obj) {
        ((ArrayList) this.f11477c).add(this.f11478d);
        this.f11478d = obj;
    }

    public void f(a aVar, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap map = (HashMap) this.f11477c;
        HashMap map2 = (HashMap) this.f11476b;
        e eVar = new e(byteArrayOutputStream, map2, map, (p094r3.a) this.f11478d);
        c cVar = (c) map2.get(a.class);
        if (cVar != null) {
            cVar.a(aVar, eVar);
        } else {
            throw new EncodingException("No encoder for " + a.class);
        }
    }

    public Object g() {
        return this.f11478d;
    }

    public Object h(v5.k kVar, K4.e eVar) {
        E4.k.f("thisRef", kVar);
        E4.k.f("property", eVar);
        return this.f11478d;
    }

    public boolean i(CharSequence charSequence, int i, int i3, p119w1.s sVar) {
        if ((sVar.f13449c & 3) == 0) {
            p119w1.c cVar = (p119w1.c) this.f11478d;
            p125x1.a aVarB = sVar.b();
            int iA = aVarB.a(8);
            if (iA != 0) {
                ((ByteBuffer) aVarB.f11788k).getShort(iA + aVarB.f11786h);
            }
            cVar.getClass();
            ThreadLocal threadLocal = p119w1.c.f13409b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i3) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            TextPaint textPaint = cVar.f13410a;
            String string = sb.toString();
            int i6 = p008b1.e.f7051a;
            boolean zA = p008b1.d.a(textPaint, string);
            int i7 = sVar.f13449c & 4;
            sVar.f13449c = zA ? i7 | 2 : i7 | 1;
        }
        return (sVar.f13449c & 3) == 2;
    }

    public void j() {
        r rVar = ((D) this.f11476b).f13842p;
        if (rVar != null) {
            rVar.s();
        }
    }

    public Object k(CharSequence charSequence, int i, int i3, int i6, boolean z5, p119w1.l lVar) {
        int i7;
        char c6;
        b bVar = new b((p) ((H1.d) this.f11477c).f1758j);
        int iCodePointAt = Character.codePointAt(charSequence, i);
        boolean zG = true;
        int i8 = 0;
        int iCharCount = i;
        loop0: while (true) {
            i7 = iCharCount;
            while (true) {
                if (iCharCount < i3 && i8 < i6 && zG) {
                    SparseArray sparseArray = ((p) bVar.f2043f).f13442a;
                    p pVar = sparseArray == null ? null : (p) sparseArray.get(iCodePointAt);
                    if (bVar.f2039b == 2) {
                        if (pVar != null) {
                            bVar.f2043f = pVar;
                            bVar.f2041d++;
                        } else {
                            if (iCodePointAt == 65038) {
                                bVar.d();
                            } else if (iCodePointAt != 65039) {
                                p pVar2 = (p) bVar.f2043f;
                                if (pVar2.f13443b != null) {
                                    if (bVar.f2041d != 1) {
                                        bVar.f2044g = pVar2;
                                        bVar.d();
                                    } else if (bVar.e()) {
                                        bVar.f2044g = (p) bVar.f2043f;
                                        bVar.d();
                                    } else {
                                        bVar.d();
                                    }
                                    c6 = 3;
                                } else {
                                    bVar.d();
                                }
                            }
                            c6 = 1;
                        }
                        c6 = 2;
                    } else if (pVar == null) {
                        bVar.d();
                        c6 = 1;
                    } else {
                        bVar.f2039b = 2;
                        bVar.f2043f = pVar;
                        bVar.f2041d = 1;
                        c6 = 2;
                    }
                    bVar.f2040c = iCodePointAt;
                    if (c6 == 1) {
                        iCharCount = Character.charCount(Character.codePointAt(charSequence, i7)) + i7;
                        if (iCharCount >= i3) {
                            break;
                        }
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                        break;
                    }
                    if (c6 == 2) {
                        int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
                        if (iCharCount2 < i3) {
                            iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                        }
                        iCharCount = iCharCount2;
                    } else if (c6 == 3) {
                        if (!z5 && i(charSequence, i7, iCharCount, ((p) bVar.f2044g).f13443b)) {
                            break;
                        }
                        zG = lVar.g(charSequence, i7, iCharCount, ((p) bVar.f2044g).f13443b);
                        i8++;
                        break;
                    }
                } else {
                    break loop0;
                }
            }
        }
        if (bVar.f2039b == 2 && ((p) bVar.f2043f).f13443b != null && ((bVar.f2041d > 1 || bVar.e()) && i8 < i6 && zG && (z5 || !i(charSequence, i7, iCharCount, ((p) bVar.f2043f).f13443b)))) {
            lVar.g(charSequence, i7, iCharCount, ((p) bVar.f2043f).f13443b);
        }
        return lVar.a();
    }

    public void l(v5.k kVar, K4.e eVar, Object obj) {
        E4.k.f("thisRef", kVar);
        E4.k.f("property", eVar);
        if (E4.k.a(this.f11478d, obj)) {
            return;
        }
        Object obj2 = this.f11478d;
        this.f11478d = obj;
        ((g) this.f11477c).a(kVar, (v5.n) this.f11476b, obj2, obj);
    }

    public void m() {
        ArrayList arrayList = (ArrayList) this.f11477c;
        if (arrayList.isEmpty()) {
            C0208d.T("empty stack");
            throw null;
        }
        this.f11478d = arrayList.remove(arrayList.size() - 1);
    }

    public String toString() {
        switch (this.f11475a) {
            case 2:
                StringBuilder sb = new StringBuilder("[ClassStack (self-refs: ");
                ArrayList arrayList = (ArrayList) this.f11478d;
                sb.append(arrayList == null ? "0" : String.valueOf(arrayList.size()));
                sb.append(')');
                while (this != null) {
                    sb.append(' ');
                    sb.append(((Class) this.f11477c).getName());
                    this = (d) this.f11476b;
                }
                sb.append(']');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public d(d dVar, Class cls) {
        this.f11475a = 2;
        this.f11476b = dVar;
        this.f11477c = cls;
    }

    public d(v5.n nVar, Object obj, g gVar) {
        this.f11475a = 3;
        E4.k.f("lightProperty", nVar);
        E4.k.f("changeDispatcher", gVar);
        this.f11476b = nVar;
        this.f11477c = gVar;
        this.f11478d = obj;
    }

    public d(InterfaceC1033p interfaceC1033p) {
        this.f11475a = 0;
        this.f11476b = interfaceC1033p;
        this.f11477c = new h(0);
        s sVar = new s();
        sVar.f10771a = C.f10714a;
        sVar.f10772b = p080p.k.f10739a;
        sVar.f10773c = p085q.a.f11187c;
        sVar.c(C.f(10));
        this.f11478d = sVar;
    }

    public d(H1.d dVar, p085q.b bVar, p119w1.c cVar, Set set) {
        this.f11475a = 4;
        this.f11476b = bVar;
        this.f11477c = dVar;
        this.f11478d = cVar;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            k(str, 0, str.length(), 1, true, new C0308a(str, 13));
        }
    }

    public d(D d6) {
        this.f11475a = 6;
        this.f11476b = d6;
        this.f11477c = new ArrayList();
        this.f11478d = d6;
    }
}

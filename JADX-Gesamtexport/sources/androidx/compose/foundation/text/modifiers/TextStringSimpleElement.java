package androidx.compose.foundation.text.modifiers;

import E.e;
import E4.k;
import G0.J;
import L0.d;
import Z.n;
import p015c2.AbstractC0473d;
import p081p0.c;
import p096s.AbstractC0916i;
import p124x0.AbstractC1098f;
import p124x0.Q;

/* JADX INFO: loaded from: classes.dex */
public final class TextStringSimpleElement extends Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J f6673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f6674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6675d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f6676e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f6677f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f6678g;

    public TextStringSimpleElement(String str, J j4, d dVar, int i, boolean z5, int i3, int i6) {
        this.f6672a = str;
        this.f6673b = j4;
        this.f6674c = dVar;
        this.f6675d = i;
        this.f6676e = z5;
        this.f6677f = i3;
        this.f6678g = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStringSimpleElement)) {
            return false;
        }
        TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) obj;
        textStringSimpleElement.getClass();
        return k.a(this.f6672a, textStringSimpleElement.f6672a) && k.a(this.f6673b, textStringSimpleElement.f6673b) && k.a(this.f6674c, textStringSimpleElement.f6674c) && this.f6675d == textStringSimpleElement.f6675d && this.f6676e == textStringSimpleElement.f6676e && this.f6677f == textStringSimpleElement.f6677f && this.f6678g == textStringSimpleElement.f6678g;
    }

    public final int hashCode() {
        return (((p012c.k.m(this.f6676e, AbstractC0916i.c(this.f6675d, (this.f6674c.hashCode() + ((this.f6673b.hashCode() + (this.f6672a.hashCode() * 31)) * 31)) * 31, 31), 31) + this.f6677f) * 31) + this.f6678g) * 31;
    }

    @Override // p124x0.Q
    public final n l() {
        E.k kVar = new E.k();
        kVar.f896u = this.f6672a;
        kVar.f897v = this.f6673b;
        kVar.f898w = this.f6674c;
        kVar.f899x = this.f6675d;
        kVar.f900y = this.f6676e;
        kVar.f901z = this.f6677f;
        kVar.f891A = this.f6678g;
        return kVar;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0029  */
    /* JADX WARN: Code duplicated, block: B:13:0x002b  */
    /* JADX WARN: Code duplicated, block: B:16:0x003f  */
    /* JADX WARN: Code duplicated, block: B:19:0x0048  */
    /* JADX WARN: Code duplicated, block: B:22:0x0051  */
    /* JADX WARN: Code duplicated, block: B:25:0x005e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0067  */
    /* JADX WARN: Code duplicated, block: B:29:0x0069  */
    /* JADX WARN: Code duplicated, block: B:32:0x006f  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
    @Override // p124x0.Q
    public final void m(n nVar) {
        boolean z5;
        String str;
        String str2;
        boolean z6;
        boolean z7;
        int i;
        int i3;
        int i6;
        int i7;
        boolean z8;
        boolean z9;
        d dVar;
        d dVar2;
        int i8;
        int i9;
        E.k kVar = (E.k) nVar;
        kVar.getClass();
        J j4 = kVar.f897v;
        boolean z10 = true;
        J j6 = this.f6673b;
        if (j6 != j4) {
            if (!j6.f1472a.b(j4.f1472a)) {
                z5 = true;
            }
            str = kVar.f896u;
            str2 = this.f6672a;
            if (k.a(str, str2)) {
                z6 = false;
            } else {
                kVar.f896u = str2;
                kVar.f895E = null;
                z6 = true;
            }
            z7 = !kVar.f897v.c(j6);
            kVar.f897v = j6;
            i = kVar.f891A;
            i3 = this.f6678g;
            if (i != i3) {
                kVar.f891A = i3;
                z7 = true;
            }
            i6 = kVar.f901z;
            i7 = this.f6677f;
            if (i6 != i7) {
                kVar.f901z = i7;
                z7 = true;
            }
            z8 = kVar.f900y;
            z9 = this.f6676e;
            if (z8 != z9) {
                kVar.f900y = z9;
                z7 = true;
            }
            dVar = kVar.f898w;
            dVar2 = this.f6674c;
            if (!k.a(dVar, dVar2)) {
                kVar.f898w = dVar2;
                z7 = true;
            }
            i8 = kVar.f899x;
            i9 = this.f6675d;
            if (i8 == i9) {
                z10 = z7;
            } else {
                kVar.f899x = i9;
            }
            if (z6 || z10) {
                e eVarY0 = kVar.y0();
                String str3 = kVar.f896u;
                J j7 = kVar.f897v;
                d dVar3 = kVar.f898w;
                int i10 = kVar.f899x;
                boolean z11 = kVar.f900y;
                int i11 = kVar.f901z;
                int i12 = kVar.f891A;
                eVarY0.f852a = str3;
                eVarY0.f853b = j7;
                eVarY0.f854c = dVar3;
                eVarY0.f855d = i10;
                eVarY0.f856e = z11;
                eVarY0.f857f = i11;
                eVarY0.f858g = i12;
                eVarY0.f860j = null;
                eVarY0.f864n = null;
                eVarY0.f865o = null;
                eVarY0.f867q = -1;
                eVarY0.f868r = -1;
                eVarY0.f866p = c.W(0, 0, 0, 0);
                eVarY0.f862l = AbstractC0473d.b(0, 0);
                eVarY0.f861k = false;
            }
            if (kVar.f5969t) {
                if (z6 || (z5 && kVar.f894D != null)) {
                    AbstractC1098f.n(kVar);
                }
                if (z6 || z10) {
                    AbstractC1098f.m(kVar);
                    AbstractC1098f.l(kVar);
                }
                if (z5) {
                    AbstractC1098f.l(kVar);
                }
            }
            return;
        }
        j6.getClass();
        z5 = false;
        str = kVar.f896u;
        str2 = this.f6672a;
        if (k.a(str, str2)) {
            z6 = false;
        } else {
            kVar.f896u = str2;
            kVar.f895E = null;
            z6 = true;
        }
        z7 = !kVar.f897v.c(j6);
        kVar.f897v = j6;
        i = kVar.f891A;
        i3 = this.f6678g;
        if (i != i3) {
            kVar.f891A = i3;
            z7 = true;
        }
        i6 = kVar.f901z;
        i7 = this.f6677f;
        if (i6 != i7) {
            kVar.f901z = i7;
            z7 = true;
        }
        z8 = kVar.f900y;
        z9 = this.f6676e;
        if (z8 != z9) {
            kVar.f900y = z9;
            z7 = true;
        }
        dVar = kVar.f898w;
        dVar2 = this.f6674c;
        if (!k.a(dVar, dVar2)) {
            kVar.f898w = dVar2;
            z7 = true;
        }
        i8 = kVar.f899x;
        i9 = this.f6675d;
        if (i8 == i9) {
            z10 = z7;
        } else {
            kVar.f899x = i9;
        }
        if (z6) {
            e eVarY1 = kVar.y0();
            String str4 = kVar.f896u;
            J j8 = kVar.f897v;
            d dVar4 = kVar.f898w;
            int i13 = kVar.f899x;
            boolean z12 = kVar.f900y;
            int i14 = kVar.f901z;
            int i15 = kVar.f891A;
            eVarY1.f852a = str4;
            eVarY1.f853b = j8;
            eVarY1.f854c = dVar4;
            eVarY1.f855d = i13;
            eVarY1.f856e = z12;
            eVarY1.f857f = i14;
            eVarY1.f858g = i15;
            eVarY1.f860j = null;
            eVarY1.f864n = null;
            eVarY1.f865o = null;
            eVarY1.f867q = -1;
            eVarY1.f868r = -1;
            eVarY1.f866p = c.W(0, 0, 0, 0);
            eVarY1.f862l = AbstractC0473d.b(0, 0);
            eVarY1.f861k = false;
        } else {
            e eVarY2 = kVar.y0();
            String str5 = kVar.f896u;
            J j9 = kVar.f897v;
            d dVar5 = kVar.f898w;
            int i16 = kVar.f899x;
            boolean z13 = kVar.f900y;
            int i17 = kVar.f901z;
            int i18 = kVar.f891A;
            eVarY2.f852a = str5;
            eVarY2.f853b = j9;
            eVarY2.f854c = dVar5;
            eVarY2.f855d = i16;
            eVarY2.f856e = z13;
            eVarY2.f857f = i17;
            eVarY2.f858g = i18;
            eVarY2.f860j = null;
            eVarY2.f864n = null;
            eVarY2.f865o = null;
            eVarY2.f867q = -1;
            eVarY2.f868r = -1;
            eVarY2.f866p = c.W(0, 0, 0, 0);
            eVarY2.f862l = AbstractC0473d.b(0, 0);
            eVarY2.f861k = false;
        }
        if (kVar.f5969t) {
            return;
        }
        if (z6) {
            AbstractC1098f.n(kVar);
        } else {
            AbstractC1098f.n(kVar);
        }
        if (z6) {
            AbstractC1098f.m(kVar);
            AbstractC1098f.l(kVar);
        } else {
            AbstractC1098f.m(kVar);
            AbstractC1098f.l(kVar);
        }
        if (z5) {
            AbstractC1098f.l(kVar);
        }
    }
}

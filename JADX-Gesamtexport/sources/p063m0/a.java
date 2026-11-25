package p063m0;

import B.AbstractC0013g0;
import E4.k;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import p002a1.b;
import p035g0.C0715p;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final XmlResourceParser f10403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10404b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0715p f10405c;

    public a(XmlResourceParser xmlResourceParser) {
        this.f10403a = xmlResourceParser;
        C0715p c0715p = new C0715p(13, false);
        c0715p.i = new float[64];
        this.f10405c = c0715p;
    }

    public final float a(TypedArray typedArray, String str, int i, float f6) {
        if (b.b(this.f10403a, str)) {
            f6 = typedArray.getFloat(i, f6);
        }
        b(typedArray.getChangingConfigurations());
        return f6;
    }

    public final void b(int i) {
        this.f10404b = i | this.f10404b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k.a(this.f10403a, aVar.f10403a) && this.f10404b == aVar.f10404b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f10404b) + (this.f10403a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidVectorParser(xmlParser=");
        sb.append(this.f10403a);
        sb.append(", config=");
        return AbstractC0013g0.k(sb, this.f10404b, ')');
    }
}

package L0;

import p096s.AbstractC0916i;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f3033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f3034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3036d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f3037e;

    public q(p pVar, k kVar, int i, int i3, Object obj) {
        this.f3033a = pVar;
        this.f3034b = kVar;
        this.f3035c = i;
        this.f3036d = i3;
        this.f3037e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return E4.k.a(this.f3033a, qVar.f3033a) && E4.k.a(this.f3034b, qVar.f3034b) && this.f3035c == qVar.f3035c && this.f3036d == qVar.f3036d && E4.k.a(this.f3037e, qVar.f3037e);
    }

    public final int hashCode() {
        p pVar = this.f3033a;
        int iC = AbstractC0916i.c(this.f3036d, AbstractC0916i.c(this.f3035c, (((pVar == null ? 0 : pVar.hashCode()) * 31) + this.f3034b.f3028h) * 31, 31), 31);
        Object obj = this.f3037e;
        return iC + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.f3033a);
        sb.append(", fontWeight=");
        sb.append(this.f3034b);
        sb.append(", fontStyle=");
        String str2 = "Invalid";
        int i = this.f3035c;
        if (i == 0) {
            str = "Normal";
        } else {
            str = i == 1 ? "Italic" : "Invalid";
        }
        sb.append((Object) str);
        sb.append(", fontSynthesis=");
        int i3 = this.f3036d;
        if (i3 == 0) {
            str2 = "None";
        } else if (i3 == 1) {
            str2 = "All";
        } else if (i3 == 2) {
            str2 = "Weight";
        } else if (i3 == 3) {
            str2 = "Style";
        }
        sb.append((Object) str2);
        sb.append(", resourceLoaderCacheKey=");
        sb.append(this.f3037e);
        sb.append(')');
        return sb.toString();
    }
}

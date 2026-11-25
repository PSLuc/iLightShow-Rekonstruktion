package p109u2;

import p012c.k;

/* JADX INFO: loaded from: classes.dex */
public final class o extends s {
    public final /* synthetic */ String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f12709j;

    public o(String str, String str2) {
        this.i = str;
        this.f12709j = str2;
    }

    @Override // p109u2.s
    public final String a(String str) {
        return this.i + str + this.f12709j;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[PreAndSuffixTransformer('");
        sb.append(this.i);
        sb.append("','");
        return k.u(sb, this.f12709j, "')]");
    }
}

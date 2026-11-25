package p109u2;

import p012c.k;

/* JADX INFO: loaded from: classes.dex */
public final class p extends s {
    public final /* synthetic */ int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f12710j;

    public /* synthetic */ p(String str, int i) {
        this.i = i;
        this.f12710j = str;
    }

    @Override // p109u2.s
    public final String a(String str) {
        switch (this.i) {
            case 0:
                return k.u(new StringBuilder(), this.f12710j, str);
            default:
                return str + this.f12710j;
        }
    }

    public final String toString() {
        switch (this.i) {
            case 0:
                return k.u(new StringBuilder("[PrefixTransformer('"), this.f12710j, "')]");
            default:
                return k.u(new StringBuilder("[SuffixTransformer('"), this.f12710j, "')]");
        }
    }
}

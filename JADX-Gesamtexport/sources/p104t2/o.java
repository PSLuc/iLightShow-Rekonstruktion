package p104t2;

import java.util.StringTokenizer;

/* JADX INFO: loaded from: classes.dex */
public final class o extends StringTokenizer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f12555c;

    public o(String str) {
        super(str, "<,>", true);
        this.f12553a = str;
    }

    @Override // java.util.StringTokenizer
    public final boolean hasMoreTokens() {
        return this.f12555c != null || super.hasMoreTokens();
    }

    @Override // java.util.StringTokenizer
    public final String nextToken() {
        String str = this.f12555c;
        if (str != null) {
            this.f12555c = null;
            return str;
        }
        String strNextToken = super.nextToken();
        this.f12554b = strNextToken.length() + this.f12554b;
        return strNextToken.trim();
    }
}

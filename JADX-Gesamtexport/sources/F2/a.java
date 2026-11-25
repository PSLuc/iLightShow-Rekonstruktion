package F2;

import E4.k;
import com.spotify.sdk.android.auth.AccountsQueryParameters;

/* JADX INFO: loaded from: classes.dex */
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Exception f1403a;

    public a(Exception exc) {
        k.f(AccountsQueryParameters.ERROR, exc);
        this.f1403a = exc;
    }

    @Override // F2.c
    public final Exception b() {
        return this.f1403a;
    }

    @Override // F2.c
    public final Object c() throws Exception {
        throw this.f1403a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return k.a(this.f1403a, ((a) obj).f1403a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1403a.hashCode();
    }

    public final String toString() {
        return "[Failure: " + this.f1403a + ']';
    }
}

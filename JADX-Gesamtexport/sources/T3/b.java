package T3;

import java.io.PrintStream;
import java.io.PrintWriter;
import p020d2.n;

/* JADX INFO: loaded from: classes.dex */
public final class b extends n {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f5252k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f5253l;

    public /* synthetic */ b(int i, Object obj) {
        this.f5252k = i;
        this.f5253l = obj;
    }

    @Override // p020d2.n
    public final void G(String str) {
        switch (this.f5252k) {
            case 0:
                ((PrintStream) this.f5253l).println((Object) str);
                break;
            default:
                ((PrintWriter) this.f5253l).println((Object) str);
                break;
        }
    }
}

package M2;

import android.content.Context;
import p012c.k;

/* JADX INFO: loaded from: classes.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final U2.a f3478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final U2.a f3479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f3480d;

    public b(Context context, U2.a aVar, U2.a aVar2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f3477a = context;
        if (aVar == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f3478b = aVar;
        if (aVar2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f3479c = aVar2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f3480d = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f3477a.equals(((b) cVar).f3477a)) {
                b bVar = (b) cVar;
                if (this.f3478b.equals(bVar.f3478b) && this.f3479c.equals(bVar.f3479c) && this.f3480d.equals(bVar.f3480d)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f3480d.hashCode() ^ ((((((this.f3477a.hashCode() ^ 1000003) * 1000003) ^ this.f3478b.hashCode()) * 1000003) ^ this.f3479c.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.f3477a);
        sb.append(", wallClock=");
        sb.append(this.f3478b);
        sb.append(", monotonicClock=");
        sb.append(this.f3479c);
        sb.append(", backendName=");
        return k.u(sb, this.f3480d, "}");
    }
}

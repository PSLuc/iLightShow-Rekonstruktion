package Z2;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Boolean f6039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f6040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f6041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6042d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bundle f6043e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f6044f;

    public l(com.google.android.gms.common.internal.a aVar, int i, Bundle bundle) {
        Objects.requireNonNull(aVar);
        this.f6044f = aVar;
        Boolean bool = Boolean.TRUE;
        this.f6041c = aVar;
        this.f6039a = bool;
        this.f6040b = false;
        this.f6042d = i;
        this.f6043e = bundle;
    }

    public abstract boolean a();

    public abstract void b(W2.a aVar);
}

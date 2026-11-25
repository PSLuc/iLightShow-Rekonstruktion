package E2;

import B.AbstractC0013g0;
import D4.e;
import E4.k;
import E4.l;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class a extends l implements e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f1007h = new a(2);

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        String str = (String) obj2;
        k.f("<anonymous parameter 0>", (InputStream) obj);
        k.f("encoding", str);
        throw new UnsupportedOperationException(AbstractC0013g0.i("Decoding ", str, " is not supported. Expected one of gzip, deflate, identity."));
    }
}

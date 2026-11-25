package T1;

import org.slf4j.Marker;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f5157a;

    static {
        a aVar = new a("MIME", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", true, '=', 76);
        f5157a = new a(aVar);
        byte[] bArr = aVar.f5151j;
        System.arraycopy(bArr, 0, new byte[64], 0, bArr.length);
        char[] cArr = aVar.i;
        System.arraycopy(cArr, 0, new char[64], 0, cArr.length);
        int[] iArr = aVar.f5150h;
        System.arraycopy(iArr, 0, new int[128], 0, iArr.length);
        StringBuilder sb = new StringBuilder("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        sb.setCharAt(sb.indexOf(Marker.ANY_NON_NULL_MARKER), '-');
        sb.setCharAt(sb.indexOf("/"), '_');
        new a("MODIFIED-FOR-URL", sb.toString(), false, (char) 0, Integer.MAX_VALUE);
    }
}

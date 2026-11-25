package m5;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class g extends ByteArrayInputStream {
    public static g b(g gVar, int i) throws IOException {
        int i3 = ((ByteArrayInputStream) gVar).pos;
        long j4 = i;
        long jSkip = gVar.skip(j4);
        if (jSkip >= j4) {
            return new g(((ByteArrayInputStream) gVar).buf, i3, i);
        }
        throw new IllegalArgumentException("requested " + i + " bytes exceeds available " + jSkip + " bytes.");
    }
}

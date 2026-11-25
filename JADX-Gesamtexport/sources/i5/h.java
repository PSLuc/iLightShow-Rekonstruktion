package i5;

import E4.l;
import E4.w;
import h5.G;
import java.io.IOException;
import p084p4.x;

/* JADX INFO: loaded from: classes.dex */
public final class h extends l implements D4.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ G f9614h;
    public final /* synthetic */ w i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ w f9615j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ w f9616k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(G g6, w wVar, w wVar2, w wVar3) {
        super(2);
        this.f9614h = g6;
        this.i = wVar;
        this.f9615j = wVar2;
        this.f9616k = wVar3;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) throws IOException {
        int iIntValue = ((Number) obj).intValue();
        long jLongValue = ((Number) obj2).longValue();
        if (iIntValue == 21589) {
            if (jLongValue < 1) {
                throw new IOException("bad zip: extended timestamp extra too short");
            }
            G g6 = this.f9614h;
            byte bW = g6.W();
            boolean z5 = (bW & 1) == 1;
            boolean z6 = (bW & 2) == 2;
            boolean z7 = (bW & 4) == 4;
            long j4 = z5 ? 5L : 1L;
            if (z6) {
                j4 += 4;
            }
            if (z7) {
                j4 += 4;
            }
            if (jLongValue < j4) {
                throw new IOException("bad zip: extended timestamp extra too short");
            }
            if (z5) {
                this.i.f1074h = Long.valueOf(((long) g6.c()) * 1000);
            }
            if (z6) {
                this.f9615j.f1074h = Long.valueOf(((long) g6.c()) * 1000);
            }
            if (z7) {
                this.f9616k.f1074h = Long.valueOf(((long) g6.c()) * 1000);
            }
        }
        return x.f10867a;
    }
}

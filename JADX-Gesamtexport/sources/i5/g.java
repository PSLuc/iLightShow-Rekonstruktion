package i5;

import E4.l;
import E4.s;
import E4.v;
import h5.G;
import java.io.IOException;
import p084p4.x;

/* JADX INFO: loaded from: classes.dex */
public final class g extends l implements D4.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ s f9609h;
    public final /* synthetic */ long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ v f9610j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ G f9611k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ v f9612l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v f9613m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(s sVar, long j4, v vVar, G g6, v vVar2, v vVar3) {
        super(2);
        this.f9609h = sVar;
        this.i = j4;
        this.f9610j = vVar;
        this.f9611k = g6;
        this.f9612l = vVar2;
        this.f9613m = vVar3;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) throws IOException {
        int iIntValue = ((Number) obj).intValue();
        long jLongValue = ((Number) obj2).longValue();
        if (iIntValue == 1) {
            s sVar = this.f9609h;
            if (sVar.f1070h) {
                throw new IOException("bad zip: zip64 extra repeated");
            }
            sVar.f1070h = true;
            if (jLongValue < this.i) {
                throw new IOException("bad zip: zip64 extra too short");
            }
            v vVar = this.f9610j;
            long jK = vVar.f1073h;
            G g6 = this.f9611k;
            if (jK == 4294967295L) {
                jK = g6.k();
            }
            vVar.f1073h = jK;
            v vVar2 = this.f9612l;
            vVar2.f1073h = vVar2.f1073h == 4294967295L ? g6.k() : 0L;
            v vVar3 = this.f9613m;
            vVar3.f1073h = vVar3.f1073h == 4294967295L ? g6.k() : 0L;
        }
        return x.f10867a;
    }
}

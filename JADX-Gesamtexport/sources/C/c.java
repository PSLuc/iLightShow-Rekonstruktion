package C;

import E4.l;
import G0.C0105a;
import G0.q;
import H0.y;
import android.graphics.Matrix;
import android.graphics.Path;
import p035g0.C0706g;
import p084p4.x;
import p113v0.M;
import p113v0.N;

/* JADX INFO: loaded from: classes.dex */
public final class c extends l implements D4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f590h;
    public final /* synthetic */ int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f591j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f592k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i, N n6, int i3) {
        super(1);
        this.f590h = 1;
        this.i = i;
        this.f591j = n6;
        this.f592k = i3;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        switch (this.f590h) {
            case 0:
                M.d((M) obj, (N) this.f591j, -this.i, -this.f592k);
                return x.f10867a;
            case 1:
                N n6 = (N) this.f591j;
                M.d((M) obj, n6, G4.a.D((this.i - n6.f13137h) / 2.0f), G4.a.D((this.f592k - n6.i) / 2.0f));
                return x.f10867a;
            case 2:
                M.g((M) obj, (N) this.f591j, this.i, this.f592k);
                return x.f10867a;
            case 3:
                M.d((M) obj, (N) this.f591j, this.i, this.f592k);
                return x.f10867a;
            default:
                q qVar = (q) obj;
                C0105a c0105a = qVar.f1527a;
                int iB = qVar.b(this.i);
                int iB2 = qVar.b(this.f592k);
                CharSequence charSequence = c0105a.f1481e;
                if (iB < 0 || iB > iB2 || iB2 > charSequence.length()) {
                    throw new IllegalArgumentException(("start(" + iB + ") or end(" + iB2 + ") is out of range [0.." + charSequence.length() + "], or start > end!").toString());
                }
                Path path = new Path();
                y yVar = c0105a.f1480d;
                yVar.f1734e.getSelectionPath(iB, iB2, path);
                int i = yVar.f1736g;
                if (i != 0 && !path.isEmpty()) {
                    path.offset(0.0f, i);
                }
                long jY = p081p0.c.y(0.0f, qVar.f1532f);
                Matrix matrix = new Matrix();
                matrix.setTranslate(p030f0.c.d(jY), p030f0.c.e(jY));
                path.transform(matrix);
                ((C0706g) this.f591j).f9063a.addPath(path, p030f0.c.d(0L), p030f0.c.e(0L));
                return x.f10867a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, int i, int i3, int i6) {
        super(1);
        this.f590h = i6;
        this.f591j = obj;
        this.i = i;
        this.f592k = i3;
    }
}

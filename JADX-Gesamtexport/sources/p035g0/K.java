package p035g0;

import E4.k;
import O1.u;
import android.graphics.Paint;
import android.graphics.Shader;
import p030f0.f;

/* JADX INFO: loaded from: classes.dex */
public abstract class K extends AbstractC0712m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Shader f9032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f9033b = 9205357640488583168L;

    @Override // p035g0.AbstractC0712m
    public final void a(float f6, long j4, u uVar) {
        Shader shaderB = this.f9032a;
        if (shaderB == null || !f.a(this.f9033b, j4)) {
            if (f.e(j4)) {
                shaderB = null;
                this.f9032a = null;
                this.f9033b = 9205357640488583168L;
            } else {
                shaderB = b(j4);
                this.f9032a = shaderB;
                this.f9033b = j4;
            }
        }
        long jC = H.c(((Paint) uVar.f4534b).getColor());
        long j6 = r.f9076b;
        if (!r.c(jC, j6)) {
            uVar.n(j6);
        }
        if (!k.a((Shader) uVar.f4535c, shaderB)) {
            uVar.q(shaderB);
        }
        if (((Paint) uVar.f4534b).getAlpha() / 255.0f == f6) {
            return;
        }
        uVar.l(f6);
    }

    public abstract Shader b(long j4);
}

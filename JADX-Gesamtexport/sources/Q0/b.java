package Q0;

import B.C0043w;
import N.C0208d;
import N.C0217h0;
import N.D;
import N.U;
import O0.k;
import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import p030f0.f;
import p035g0.K;

/* JADX INFO: loaded from: classes.dex */
public final class b extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K f4687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f4688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0217h0 f4689c = C0208d.K(new f(9205357640488583168L), U.f3673m);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final D f4690d = C0208d.C(new C0043w(23, this));

    public b(K k3, float f6) {
        this.f4687a = k3;
        this.f4688b = f6;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        k.b(textPaint, this.f4688b);
        textPaint.setShader((Shader) this.f4690d.getValue());
    }
}

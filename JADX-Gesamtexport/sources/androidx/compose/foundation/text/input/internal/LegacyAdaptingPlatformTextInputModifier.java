package androidx.compose.foundation.text.input.internal;

import B.C0036s0;
import D.C0057g;
import D.z;
import E4.k;
import F.P;
import Z.n;
import p124x0.Q;

/* JADX INFO: loaded from: classes.dex */
final class LegacyAdaptingPlatformTextInputModifier extends Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0057g f6659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0036s0 f6660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final P f6661c;

    public LegacyAdaptingPlatformTextInputModifier(C0057g c0057g, C0036s0 c0036s0, P p6) {
        this.f6659a = c0057g;
        this.f6660b = c0036s0;
        this.f6661c = p6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LegacyAdaptingPlatformTextInputModifier)) {
            return false;
        }
        LegacyAdaptingPlatformTextInputModifier legacyAdaptingPlatformTextInputModifier = (LegacyAdaptingPlatformTextInputModifier) obj;
        return k.a(this.f6659a, legacyAdaptingPlatformTextInputModifier.f6659a) && k.a(this.f6660b, legacyAdaptingPlatformTextInputModifier.f6660b) && k.a(this.f6661c, legacyAdaptingPlatformTextInputModifier.f6661c);
    }

    public final int hashCode() {
        return this.f6661c.hashCode() + ((this.f6660b.hashCode() + (this.f6659a.hashCode() * 31)) * 31);
    }

    @Override // p124x0.Q
    public final n l() {
        P p6 = this.f6661c;
        return new z(this.f6659a, this.f6660b, p6);
    }

    @Override // p124x0.Q
    public final void m(n nVar) {
        z zVar = (z) nVar;
        if (zVar.f5969t) {
            zVar.f711u.e();
            zVar.f711u.k(zVar);
        }
        C0057g c0057g = this.f6659a;
        zVar.f711u = c0057g;
        if (zVar.f5969t) {
            if (c0057g.f687a != null) {
                throw new IllegalStateException("Expected textInputModifierNode to be null");
            }
            c0057g.f687a = zVar;
        }
        zVar.f712v = this.f6660b;
        zVar.f713w = this.f6661c;
    }

    public final String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.f6659a + ", legacyTextFieldState=" + this.f6660b + ", textFieldSelectionManager=" + this.f6661c + ')';
    }
}

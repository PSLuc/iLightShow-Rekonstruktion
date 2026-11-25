package B;

import p096s.AbstractC0916i;

/* JADX INFO: renamed from: B.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0034r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0034r0 f406a = new C0034r0();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0034r0)) {
            return false;
        }
        ((C0034r0) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return AbstractC0916i.c(-1, AbstractC0916i.c(0, Integer.hashCode(-1) * 961, 31), 29791);
    }

    public final String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) "Unspecified") + ", autoCorrectEnabled=null, keyboardType=" + ((Object) p027e3.a.A0(0)) + ", imeAction=" + ((Object) "Unspecified") + ", platformImeOptions=nullshowKeyboardOnFocus=null, hintLocales=null)";
    }
}

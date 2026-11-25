package p109u2;

import B.AbstractC0013g0;
import T1.e;
import T1.n;
import p015c2.E;
import p015c2.m;

/* JADX INFO: loaded from: classes.dex */
public final class v implements m {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f12714h;

    @Override // p015c2.m
    public final void c(e eVar, E e6) {
        CharSequence charSequence = this.f12714h;
        if (charSequence instanceof m) {
            ((m) charSequence).c(eVar, e6);
        } else if (charSequence instanceof n) {
            eVar.j0((n) charSequence);
        } else {
            eVar.k0(String.valueOf(charSequence));
        }
    }

    @Override // p015c2.m
    public final void d(e eVar, E e6, p071n2.e eVar2) {
        CharSequence charSequence = this.f12714h;
        if (charSequence instanceof m) {
            ((m) charSequence).d(eVar, e6, eVar2);
        } else if (charSequence instanceof n) {
            c(eVar, e6);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        String str = this.f12714h;
        String str2 = ((v) obj).f12714h;
        if (str == str2) {
            return true;
        }
        return str != null && str.equals(str2);
    }

    public final int hashCode() {
        String str = this.f12714h;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return AbstractC0013g0.i("[RawValue of type ", i.f(this.f12714h), "]");
    }
}

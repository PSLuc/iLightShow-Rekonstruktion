package p091r0;

import java.util.ArrayList;
import p012c.k;
import p030f0.c;
import p096s.AbstractC0916i;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f11525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f11526d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f11527e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f11528f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f11529g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f11530h;
    public final ArrayList i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f11531j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f11532k;

    public s(long j4, long j6, long j7, long j8, boolean z5, float f6, int i, boolean z6, ArrayList arrayList, long j9, long j10) {
        this.f11523a = j4;
        this.f11524b = j6;
        this.f11525c = j7;
        this.f11526d = j8;
        this.f11527e = z5;
        this.f11528f = f6;
        this.f11529g = i;
        this.f11530h = z6;
        this.i = arrayList;
        this.f11531j = j9;
        this.f11532k = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return p.a(this.f11523a, sVar.f11523a) && this.f11524b == sVar.f11524b && c.b(this.f11525c, sVar.f11525c) && c.b(this.f11526d, sVar.f11526d) && this.f11527e == sVar.f11527e && Float.compare(this.f11528f, sVar.f11528f) == 0 && this.f11529g == sVar.f11529g && this.f11530h == sVar.f11530h && this.i.equals(sVar.i) && c.b(this.f11531j, sVar.f11531j) && c.b(this.f11532k, sVar.f11532k);
    }

    public final int hashCode() {
        return Long.hashCode(this.f11532k) + k.l((this.i.hashCode() + k.m(this.f11530h, AbstractC0916i.c(this.f11529g, k.i(this.f11528f, k.m(this.f11527e, k.l(k.l(k.l(Long.hashCode(this.f11523a) * 31, 31, this.f11524b), 31, this.f11525c), 31, this.f11526d), 31), 31), 31), 31)) * 31, 31, this.f11531j);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("PointerInputEventData(id=");
        sb.append((Object) p.b(this.f11523a));
        sb.append(", uptime=");
        sb.append(this.f11524b);
        sb.append(", positionOnScreen=");
        sb.append((Object) c.j(this.f11525c));
        sb.append(", position=");
        sb.append((Object) c.j(this.f11526d));
        sb.append(", down=");
        sb.append(this.f11527e);
        sb.append(", pressure=");
        sb.append(this.f11528f);
        sb.append(", type=");
        int i = this.f11529g;
        if (i == 1) {
            str = "Touch";
        } else if (i == 2) {
            str = "Mouse";
        } else if (i != 3) {
            str = i != 4 ? "Unknown" : "Eraser";
        } else {
            str = "Stylus";
        }
        sb.append((Object) str);
        sb.append(", activeHover=");
        sb.append(this.f11530h);
        sb.append(", historical=");
        sb.append(this.i);
        sb.append(", scrollDelta=");
        sb.append((Object) c.j(this.f11531j));
        sb.append(", originalEventPosition=");
        sb.append((Object) c.j(this.f11532k));
        sb.append(')');
        return sb.toString();
    }
}

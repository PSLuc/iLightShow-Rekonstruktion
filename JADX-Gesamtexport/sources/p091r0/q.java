package p091r0;

import java.util.ArrayList;
import p030f0.c;
import p089q4.u;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f11510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f11511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f11512e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f11513f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f11514g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f11515h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f11516j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f11517k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f11518l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public b f11519m;

    public q(long j4, long j6, long j7, boolean z5, float f6, long j8, long j9, boolean z6, boolean z7, int i, long j10) {
        this.f11508a = j4;
        this.f11509b = j6;
        this.f11510c = j7;
        this.f11511d = z5;
        this.f11512e = f6;
        this.f11513f = j8;
        this.f11514g = j9;
        this.f11515h = z6;
        this.i = i;
        this.f11516j = j10;
        this.f11518l = 0L;
        b bVar = new b();
        bVar.f11470a = z7;
        bVar.f11471b = z7;
        this.f11519m = bVar;
    }

    public final void a() {
        b bVar = this.f11519m;
        bVar.f11471b = true;
        bVar.f11470a = true;
    }

    public final boolean b() {
        b bVar = this.f11519m;
        return bVar.f11471b || bVar.f11470a;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("PointerInputChange(id=");
        sb.append((Object) p.b(this.f11508a));
        sb.append(", uptimeMillis=");
        sb.append(this.f11509b);
        sb.append(", position=");
        sb.append((Object) c.j(this.f11510c));
        sb.append(", pressed=");
        sb.append(this.f11511d);
        sb.append(", pressure=");
        sb.append(this.f11512e);
        sb.append(", previousUptimeMillis=");
        sb.append(this.f11513f);
        sb.append(", previousPosition=");
        sb.append((Object) c.j(this.f11514g));
        sb.append(", previousPressed=");
        sb.append(this.f11515h);
        sb.append(", isConsumed=");
        sb.append(b());
        sb.append(", type=");
        int i = this.i;
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
        sb.append(", historical=");
        Object obj = this.f11517k;
        if (obj == null) {
            obj = u.f11237h;
        }
        sb.append(obj);
        sb.append(",scrollDelta=");
        sb.append((Object) c.j(this.f11516j));
        sb.append(')');
        return sb.toString();
    }

    public q(long j4, long j6, long j7, boolean z5, float f6, long j8, long j9, boolean z6, int i, ArrayList arrayList, long j10, long j11) {
        this(j4, j6, j7, z5, f6, j8, j9, z6, false, i, j10);
        this.f11517k = arrayList;
        this.f11518l = j11;
    }
}

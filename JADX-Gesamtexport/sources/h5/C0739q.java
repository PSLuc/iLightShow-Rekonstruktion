package h5;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: renamed from: h5.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0739q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f9361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f9362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f9363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Long f9364d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Long f9365e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Long f9366f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f9367g;

    public C0739q(boolean z5, boolean z6, Long l6, Long l7, Long l8, Long l9) {
        p089q4.v vVar = p089q4.v.f11238h;
        this.f9361a = z5;
        this.f9362b = z6;
        this.f9363c = l6;
        this.f9364d = l7;
        this.f9365e = l8;
        this.f9366f = l9;
        this.f9367g = p089q4.z.X(vVar);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.f9361a) {
            arrayList.add("isRegularFile");
        }
        if (this.f9362b) {
            arrayList.add("isDirectory");
        }
        Long l6 = this.f9363c;
        if (l6 != null) {
            arrayList.add("byteCount=" + l6);
        }
        Long l7 = this.f9364d;
        if (l7 != null) {
            arrayList.add("createdAt=" + l7);
        }
        Long l8 = this.f9365e;
        if (l8 != null) {
            arrayList.add("lastModifiedAt=" + l8);
        }
        Long l9 = this.f9366f;
        if (l9 != null) {
            arrayList.add("lastAccessedAt=" + l9);
        }
        Map map = this.f9367g;
        if (!map.isEmpty()) {
            arrayList.add("extras=" + map);
        }
        return p089q4.l.e0(arrayList, ", ", "FileMetadata(", ")", null, 56);
    }
}

package p090r;

import E4.k;
import G4.a;
import java.util.LinkedHashMap;
import java.util.Map;
import p089q4.v;

/* JADX INFO: loaded from: classes.dex */
public final class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I f11390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final O f11391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f11392c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f11393d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f11394e;

    public Q(I i, O o6, t tVar, a aVar, boolean z5, Map map) {
        this.f11390a = i;
        this.f11391b = o6;
        this.f11392c = tVar;
        this.f11393d = z5;
        this.f11394e = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q)) {
            return false;
        }
        Q q6 = (Q) obj;
        return k.a(this.f11390a, q6.f11390a) && k.a(this.f11391b, q6.f11391b) && k.a(this.f11392c, q6.f11392c) && k.a(null, null) && this.f11393d == q6.f11393d && k.a(this.f11394e, q6.f11394e);
    }

    public final int hashCode() {
        I i = this.f11390a;
        int iHashCode = (i == null ? 0 : i.hashCode()) * 31;
        O o6 = this.f11391b;
        int iHashCode2 = (iHashCode + (o6 == null ? 0 : o6.hashCode())) * 31;
        t tVar = this.f11392c;
        return this.f11394e.hashCode() + p012c.k.m(this.f11393d, (((iHashCode2 + (tVar == null ? 0 : tVar.hashCode())) * 31) + 0) * 31, 31);
    }

    public final String toString() {
        return "TransitionData(fade=" + this.f11390a + ", slide=" + this.f11391b + ", changeSize=" + this.f11392c + ", scale=" + ((Object) null) + ", hold=" + this.f11393d + ", effectsMap=" + this.f11394e + ')';
    }

    public /* synthetic */ Q(I i, O o6, t tVar, a aVar, LinkedHashMap linkedHashMap, int i3) {
        this((i3 & 1) != 0 ? null : i, (i3 & 2) != 0 ? null : o6, (i3 & 4) != 0 ? null : tVar, (i3 & 8) != 0 ? null : aVar, (i3 & 16) == 0, (i3 & 32) != 0 ? v.f11238h : linkedHashMap);
    }
}

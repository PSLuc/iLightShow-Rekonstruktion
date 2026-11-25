package com.nanjoran.ilightshow.Model.JSON;

import C3.e;
import C3.f;
import Y4.d;
import a5.g;
import b5.b;
import c5.AbstractC0476a0;
import c5.k0;
import p012c.k;
import p081p0.c;

/* JADX INFO: loaded from: classes.dex */
@d
public final class UsageJSON {
    public static final int $stable = 0;
    public static final f Companion = new f();
    private final long advanced;
    private final int overwrite;
    private final long standard;

    public /* synthetic */ UsageJSON(int i, long j4, long j6, int i3, k0 k0Var) {
        if (3 != (i & 3)) {
            AbstractC0476a0.j(i, 3, e.f626a.getDescriptor());
            throw null;
        }
        this.standard = j4;
        this.advanced = j6;
        if ((i & 4) == 0) {
            this.overwrite = 0;
        } else {
            this.overwrite = i3;
        }
    }

    public static /* synthetic */ UsageJSON copy$default(UsageJSON usageJSON, long j4, long j6, int i, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j4 = usageJSON.standard;
        }
        long j7 = j4;
        if ((i3 & 2) != 0) {
            j6 = usageJSON.advanced;
        }
        long j8 = j6;
        if ((i3 & 4) != 0) {
            i = usageJSON.overwrite;
        }
        return usageJSON.copy(j7, j8, i);
    }

    public static final /* synthetic */ void write$Self$app_release(UsageJSON usageJSON, b bVar, g gVar) {
        c cVar = (c) bVar;
        cVar.e0(gVar, 0, usageJSON.standard);
        cVar.e0(gVar, 1, usageJSON.advanced);
        if (!cVar.p(gVar) && usageJSON.overwrite == 0) {
            return;
        }
        cVar.d0(2, usageJSON.overwrite, gVar);
    }

    public final long component1() {
        return this.standard;
    }

    public final long component2() {
        return this.advanced;
    }

    public final int component3() {
        return this.overwrite;
    }

    public final UsageJSON copy(long j4, long j6, int i) {
        return new UsageJSON(j4, j6, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsageJSON)) {
            return false;
        }
        UsageJSON usageJSON = (UsageJSON) obj;
        return this.standard == usageJSON.standard && this.advanced == usageJSON.advanced && this.overwrite == usageJSON.overwrite;
    }

    public final long getAdvanced() {
        return this.advanced;
    }

    public final int getOverwrite() {
        return this.overwrite;
    }

    public final long getStandard() {
        return this.standard;
    }

    public int hashCode() {
        return Integer.hashCode(this.overwrite) + k.l(Long.hashCode(this.standard) * 31, 31, this.advanced);
    }

    public String toString() {
        return "UsageJSON(standard=" + this.standard + ", advanced=" + this.advanced + ", overwrite=" + this.overwrite + ")";
    }

    public UsageJSON(long j4, long j6, int i) {
        this.standard = j4;
        this.advanced = j6;
        this.overwrite = i;
    }

    public /* synthetic */ UsageJSON(long j4, long j6, int i, int i3, E4.g gVar) {
        this(j4, j6, (i3 & 4) != 0 ? 0 : i);
    }
}

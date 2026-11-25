package com.nanjoran.ilightshow.Services;

import B.AbstractC0013g0;
import c5.AbstractC0476a0;
import c5.C0479c;
import java.util.List;
import p096s.AbstractC0916i;

/* JADX INFO: loaded from: classes.dex */
@Y4.d
public final class SharedAppPresetDocumentV1 {
    public static final int $stable = 8;
    private final String localStoreRevision;
    private final List<SharedAppPresetRecordV1> presets;
    private final String schema;
    private final int schemaVersion;
    private final String updatedAt;
    public static final t0 Companion = new t0();
    private static final Y4.a[] $childSerializers = {null, null, null, null, new C0479c(u0.f8490a, 0)};

    public /* synthetic */ SharedAppPresetDocumentV1(int i, String str, int i3, String str2, String str3, List list, c5.k0 k0Var) {
        if (24 != (i & 24)) {
            AbstractC0476a0.j(i, 24, s0.f8480a.getDescriptor());
            throw null;
        }
        this.schema = (i & 1) == 0 ? "app.ilightshow.app-presets" : str;
        if ((i & 2) == 0) {
            this.schemaVersion = 1;
        } else {
            this.schemaVersion = i3;
        }
        if ((i & 4) == 0) {
            this.localStoreRevision = null;
        } else {
            this.localStoreRevision = str2;
        }
        this.updatedAt = str3;
        this.presets = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SharedAppPresetDocumentV1 copy$default(SharedAppPresetDocumentV1 sharedAppPresetDocumentV1, String str, int i, String str2, String str3, List list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = sharedAppPresetDocumentV1.schema;
        }
        if ((i3 & 2) != 0) {
            i = sharedAppPresetDocumentV1.schemaVersion;
        }
        if ((i3 & 4) != 0) {
            str2 = sharedAppPresetDocumentV1.localStoreRevision;
        }
        if ((i3 & 8) != 0) {
            str3 = sharedAppPresetDocumentV1.updatedAt;
        }
        if ((i3 & 16) != 0) {
            list = sharedAppPresetDocumentV1.presets;
        }
        List list2 = list;
        String str4 = str2;
        return sharedAppPresetDocumentV1.copy(str, i, str4, str3, list2);
    }

    public static final /* synthetic */ void write$Self$app_release(SharedAppPresetDocumentV1 sharedAppPresetDocumentV1, b5.b bVar, a5.g gVar) {
        Y4.a[] aVarArr = $childSerializers;
        if (bVar.p(gVar) || !E4.k.a(sharedAppPresetDocumentV1.schema, "app.ilightshow.app-presets")) {
            ((p081p0.c) bVar).g0(gVar, 0, sharedAppPresetDocumentV1.schema);
        }
        if (bVar.p(gVar) || sharedAppPresetDocumentV1.schemaVersion != 1) {
            ((p081p0.c) bVar).d0(1, sharedAppPresetDocumentV1.schemaVersion, gVar);
        }
        if (bVar.p(gVar) || sharedAppPresetDocumentV1.localStoreRevision != null) {
            bVar.n(gVar, 2, c5.p0.f7477a, sharedAppPresetDocumentV1.localStoreRevision);
        }
        p081p0.c cVar = (p081p0.c) bVar;
        cVar.g0(gVar, 3, sharedAppPresetDocumentV1.updatedAt);
        cVar.f0(gVar, 4, aVarArr[4], sharedAppPresetDocumentV1.presets);
    }

    public final String component1() {
        return this.schema;
    }

    public final int component2() {
        return this.schemaVersion;
    }

    public final String component3() {
        return this.localStoreRevision;
    }

    public final String component4() {
        return this.updatedAt;
    }

    public final List<SharedAppPresetRecordV1> component5() {
        return this.presets;
    }

    public final SharedAppPresetDocumentV1 copy(String str, int i, String str2, String str3, List<SharedAppPresetRecordV1> list) {
        E4.k.f("schema", str);
        E4.k.f("updatedAt", str3);
        E4.k.f("presets", list);
        return new SharedAppPresetDocumentV1(str, i, str2, str3, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SharedAppPresetDocumentV1)) {
            return false;
        }
        SharedAppPresetDocumentV1 sharedAppPresetDocumentV1 = (SharedAppPresetDocumentV1) obj;
        return E4.k.a(this.schema, sharedAppPresetDocumentV1.schema) && this.schemaVersion == sharedAppPresetDocumentV1.schemaVersion && E4.k.a(this.localStoreRevision, sharedAppPresetDocumentV1.localStoreRevision) && E4.k.a(this.updatedAt, sharedAppPresetDocumentV1.updatedAt) && E4.k.a(this.presets, sharedAppPresetDocumentV1.presets);
    }

    public final String getLocalStoreRevision() {
        return this.localStoreRevision;
    }

    public final List<SharedAppPresetRecordV1> getPresets() {
        return this.presets;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final int getSchemaVersion() {
        return this.schemaVersion;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        int iC = AbstractC0916i.c(this.schemaVersion, this.schema.hashCode() * 31, 31);
        String str = this.localStoreRevision;
        return this.presets.hashCode() + AbstractC0013g0.c((iC + (str == null ? 0 : str.hashCode())) * 31, this.updatedAt, 31);
    }

    public String toString() {
        String str = this.schema;
        int i = this.schemaVersion;
        String str2 = this.localStoreRevision;
        String str3 = this.updatedAt;
        List<SharedAppPresetRecordV1> list = this.presets;
        StringBuilder sb = new StringBuilder("SharedAppPresetDocumentV1(schema=");
        sb.append(str);
        sb.append(", schemaVersion=");
        sb.append(i);
        sb.append(", localStoreRevision=");
        AbstractC0013g0.t(sb, str2, ", updatedAt=", str3, ", presets=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public SharedAppPresetDocumentV1(String str, int i, String str2, String str3, List<SharedAppPresetRecordV1> list) {
        E4.k.f("schema", str);
        E4.k.f("updatedAt", str3);
        E4.k.f("presets", list);
        this.schema = str;
        this.schemaVersion = i;
        this.localStoreRevision = str2;
        this.updatedAt = str3;
        this.presets = list;
    }

    public /* synthetic */ SharedAppPresetDocumentV1(String str, int i, String str2, String str3, List list, int i3, E4.g gVar) {
        this((i3 & 1) != 0 ? "app.ilightshow.app-presets" : str, (i3 & 2) != 0 ? 1 : i, (i3 & 4) != 0 ? null : str2, str3, list);
    }
}

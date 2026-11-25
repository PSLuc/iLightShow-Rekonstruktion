package com.nanjoran.ilightshow.Services;

import B.AbstractC0013g0;
import c5.C0479c;
import java.util.List;
import p096s.AbstractC0916i;

/* JADX INFO: loaded from: classes.dex */
@Y4.d
public final class SharedPaletteStorageDocument {
    public static final int $stable = 8;
    private final PaletteColorSource defaultColorSource;
    private final String localStoreRevision;
    private final List<Palette> palettes;
    private final String schema;
    private final int schemaVersion;
    private final String updatedAt;
    public static final x0 Companion = new x0();
    private static final Y4.a[] $childSerializers = {null, null, null, null, null, new C0479c(V.f8374a, 0)};

    public SharedPaletteStorageDocument() {
        this((String) null, 0, (String) null, (String) null, (PaletteColorSource) null, (List) null, 63, (E4.g) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SharedPaletteStorageDocument copy$default(SharedPaletteStorageDocument sharedPaletteStorageDocument, String str, int i, String str2, String str3, PaletteColorSource paletteColorSource, List list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = sharedPaletteStorageDocument.schema;
        }
        if ((i3 & 2) != 0) {
            i = sharedPaletteStorageDocument.schemaVersion;
        }
        if ((i3 & 4) != 0) {
            str2 = sharedPaletteStorageDocument.localStoreRevision;
        }
        if ((i3 & 8) != 0) {
            str3 = sharedPaletteStorageDocument.updatedAt;
        }
        if ((i3 & 16) != 0) {
            paletteColorSource = sharedPaletteStorageDocument.defaultColorSource;
        }
        if ((i3 & 32) != 0) {
            list = sharedPaletteStorageDocument.palettes;
        }
        PaletteColorSource paletteColorSource2 = paletteColorSource;
        List list2 = list;
        return sharedPaletteStorageDocument.copy(str, i, str2, str3, paletteColorSource2, list2);
    }

    public static final /* synthetic */ void write$Self$app_release(SharedPaletteStorageDocument sharedPaletteStorageDocument, b5.b bVar, a5.g gVar) {
        Y4.a[] aVarArr = $childSerializers;
        if (bVar.p(gVar) || !E4.k.a(sharedPaletteStorageDocument.schema, "app.ilightshow.palettes")) {
            ((p081p0.c) bVar).g0(gVar, 0, sharedPaletteStorageDocument.schema);
        }
        if (bVar.p(gVar) || sharedPaletteStorageDocument.schemaVersion != 1) {
            ((p081p0.c) bVar).d0(1, sharedPaletteStorageDocument.schemaVersion, gVar);
        }
        if (bVar.p(gVar) || sharedPaletteStorageDocument.localStoreRevision != null) {
            bVar.n(gVar, 2, c5.p0.f7477a, sharedPaletteStorageDocument.localStoreRevision);
        }
        if (bVar.p(gVar) || sharedPaletteStorageDocument.updatedAt != null) {
            bVar.n(gVar, 3, c5.p0.f7477a, sharedPaletteStorageDocument.updatedAt);
        }
        if (bVar.p(gVar) || !E4.k.a(sharedPaletteStorageDocument.defaultColorSource, C0659a0.a(PaletteColorSource.Companion))) {
            ((p081p0.c) bVar).f0(gVar, 4, Z.f8376a, sharedPaletteStorageDocument.defaultColorSource);
        }
        if (!bVar.p(gVar) && E4.k.a(sharedPaletteStorageDocument.palettes, p089q4.u.f11237h)) {
            return;
        }
        ((p081p0.c) bVar).f0(gVar, 5, aVarArr[5], sharedPaletteStorageDocument.palettes);
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

    public final PaletteColorSource component5() {
        return this.defaultColorSource;
    }

    public final List<Palette> component6() {
        return this.palettes;
    }

    public final SharedPaletteStorageDocument copy(String str, int i, String str2, String str3, PaletteColorSource paletteColorSource, List<Palette> list) {
        E4.k.f("schema", str);
        E4.k.f("defaultColorSource", paletteColorSource);
        E4.k.f("palettes", list);
        return new SharedPaletteStorageDocument(str, i, str2, str3, paletteColorSource, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SharedPaletteStorageDocument)) {
            return false;
        }
        SharedPaletteStorageDocument sharedPaletteStorageDocument = (SharedPaletteStorageDocument) obj;
        return E4.k.a(this.schema, sharedPaletteStorageDocument.schema) && this.schemaVersion == sharedPaletteStorageDocument.schemaVersion && E4.k.a(this.localStoreRevision, sharedPaletteStorageDocument.localStoreRevision) && E4.k.a(this.updatedAt, sharedPaletteStorageDocument.updatedAt) && E4.k.a(this.defaultColorSource, sharedPaletteStorageDocument.defaultColorSource) && E4.k.a(this.palettes, sharedPaletteStorageDocument.palettes);
    }

    public final PaletteColorSource getDefaultColorSource() {
        return this.defaultColorSource;
    }

    public final String getLocalStoreRevision() {
        return this.localStoreRevision;
    }

    public final List<Palette> getPalettes() {
        return this.palettes;
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
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.updatedAt;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        return this.palettes.hashCode() + ((this.defaultColorSource.hashCode() + ((iHashCode + iHashCode2) * 31)) * 31);
    }

    public String toString() {
        String str = this.schema;
        int i = this.schemaVersion;
        String str2 = this.localStoreRevision;
        String str3 = this.updatedAt;
        PaletteColorSource paletteColorSource = this.defaultColorSource;
        List<Palette> list = this.palettes;
        StringBuilder sb = new StringBuilder("SharedPaletteStorageDocument(schema=");
        sb.append(str);
        sb.append(", schemaVersion=");
        sb.append(i);
        sb.append(", localStoreRevision=");
        AbstractC0013g0.t(sb, str2, ", updatedAt=", str3, ", defaultColorSource=");
        sb.append(paletteColorSource);
        sb.append(", palettes=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ SharedPaletteStorageDocument(int i, String str, int i3, String str2, String str3, PaletteColorSource paletteColorSource, List list, c5.k0 k0Var) {
        this.schema = (i & 1) == 0 ? "app.ilightshow.palettes" : str;
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
        if ((i & 8) == 0) {
            this.updatedAt = null;
        } else {
            this.updatedAt = str3;
        }
        if ((i & 16) == 0) {
            this.defaultColorSource = C0659a0.a(PaletteColorSource.Companion);
        } else {
            this.defaultColorSource = paletteColorSource;
        }
        if ((i & 32) == 0) {
            this.palettes = p089q4.u.f11237h;
        } else {
            this.palettes = list;
        }
    }

    public SharedPaletteStorageDocument(String str, int i, String str2, String str3, PaletteColorSource paletteColorSource, List<Palette> list) {
        E4.k.f("schema", str);
        E4.k.f("defaultColorSource", paletteColorSource);
        E4.k.f("palettes", list);
        this.schema = str;
        this.schemaVersion = i;
        this.localStoreRevision = str2;
        this.updatedAt = str3;
        this.defaultColorSource = paletteColorSource;
        this.palettes = list;
    }

    public /* synthetic */ SharedPaletteStorageDocument(String str, int i, String str2, String str3, PaletteColorSource paletteColorSource, List list, int i3, E4.g gVar) {
        this((i3 & 1) != 0 ? "app.ilightshow.palettes" : str, (i3 & 2) != 0 ? 1 : i, (i3 & 4) != 0 ? null : str2, (i3 & 8) != 0 ? null : str3, (i3 & 16) != 0 ? C0659a0.a(PaletteColorSource.Companion) : paletteColorSource, (i3 & 32) != 0 ? p089q4.u.f11237h : list);
    }
}

package com.nanjoran.ilightshow.Services;

import B.AbstractC0013g0;
import c5.C0479c;
import c5.C0485f;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import com.nanjoran.ilightshow.Model.Presets.UMPreset;
import com.nanjoran.ilightshow.Model.Presets.UMPreset$$serializer;
import com.nanjoran.ilightshow.Services.PlayerServices.MusicServiceType;
import com.philips.lighting.hue.sdk.wrapper.HueLog;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
@Y4.d
public final class AppPreset {
    public static final int $stable = 8;
    private Boolean autoCalibration;
    private boolean backgroundMode;
    private String cloudId;
    private String createdAt;
    private UMPreset effectsPreset;
    private String localId;
    private double manualDelay;
    private boolean micEnabled;
    private MusicServiceType musicService;
    private String name;
    private String revision;
    private List<String> selectedLightsIds;
    private String sortKey;
    private String updatedAt;
    public static final C0678k Companion = new C0678k();
    private static final Y4.a[] $childSerializers = {null, null, null, null, null, null, null, null, MusicServiceType.Companion.serializer(), new C0479c(AbstractC0599v0.B(c5.p0.f7477a), 0), null, null, null, null};

    public AppPreset() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (UMPreset) null, (MusicServiceType) null, (List) null, false, false, 0.0d, (Boolean) null, 16383, (E4.g) null);
    }

    public static final /* synthetic */ void write$Self$app_release(AppPreset appPreset, b5.b bVar, a5.g gVar) {
        Y4.a[] aVarArr = $childSerializers;
        if (bVar.p(gVar) || appPreset.localId != null) {
            bVar.n(gVar, 0, c5.p0.f7477a, appPreset.localId);
        }
        if (bVar.p(gVar) || appPreset.cloudId != null) {
            bVar.n(gVar, 1, c5.p0.f7477a, appPreset.cloudId);
        }
        if (bVar.p(gVar) || appPreset.revision != null) {
            bVar.n(gVar, 2, c5.p0.f7477a, appPreset.revision);
        }
        if (bVar.p(gVar) || appPreset.createdAt != null) {
            bVar.n(gVar, 3, c5.p0.f7477a, appPreset.createdAt);
        }
        if (bVar.p(gVar) || appPreset.updatedAt != null) {
            bVar.n(gVar, 4, c5.p0.f7477a, appPreset.updatedAt);
        }
        if (bVar.p(gVar) || appPreset.sortKey != null) {
            bVar.n(gVar, 5, c5.p0.f7477a, appPreset.sortKey);
        }
        if (bVar.p(gVar) || !E4.k.a(appPreset.name, "")) {
            ((p081p0.c) bVar).g0(gVar, 6, appPreset.name);
        }
        if (bVar.p(gVar) || appPreset.effectsPreset != null) {
            bVar.n(gVar, 7, UMPreset$$serializer.INSTANCE, appPreset.effectsPreset);
        }
        if (bVar.p(gVar) || appPreset.musicService != null) {
            bVar.n(gVar, 8, aVarArr[8], appPreset.musicService);
        }
        if (bVar.p(gVar) || !E4.k.a(appPreset.selectedLightsIds, p089q4.u.f11237h)) {
            bVar.n(gVar, 9, aVarArr[9], appPreset.selectedLightsIds);
        }
        if (bVar.p(gVar) || appPreset.backgroundMode) {
            ((p081p0.c) bVar).Y(gVar, 10, appPreset.backgroundMode);
        }
        if (bVar.p(gVar) || appPreset.micEnabled) {
            ((p081p0.c) bVar).Y(gVar, 11, appPreset.micEnabled);
        }
        if (bVar.p(gVar) || Double.compare(appPreset.manualDelay, 0.0d) != 0) {
            ((p081p0.c) bVar).Z(gVar, 12, appPreset.manualDelay);
        }
        if (!bVar.p(gVar) && appPreset.autoCalibration == null) {
            return;
        }
        bVar.n(gVar, 13, C0485f.f7447a, appPreset.autoCalibration);
    }

    public final void apply() {
        M m6 = M.f8305O;
        UMPreset uMPreset = this.effectsPreset;
        m6.D(uMPreset != null ? uMPreset.normalizeEngineAndFxSize() : null);
        X.s sVar = m6.f8334u;
        ArrayList arrayList = new ArrayList();
        ListIterator listIterator = sVar.listIterator();
        while (true) {
            X.y yVar = (X.y) listIterator;
            if (!yVar.hasNext()) {
                m6.E(new ArrayList(arrayList));
                M m7 = M.f8305O;
                m7.C(this.backgroundMode);
                m7.f8325l.c(this.micEnabled);
                m7.F(this.manualDelay);
                H3.f.f1787d.d(this.musicService);
                return;
            }
            Object next = yVar.next();
            D3.j jVar = (D3.j) next;
            List<String> list = this.selectedLightsIds;
            if (list != null && list.contains(jVar.f799a)) {
                arrayList.add(next);
            }
        }
    }

    public final String component1() {
        return this.localId;
    }

    public final List<String> component10() {
        return this.selectedLightsIds;
    }

    public final boolean component11() {
        return this.backgroundMode;
    }

    public final boolean component12() {
        return this.micEnabled;
    }

    public final double component13() {
        return this.manualDelay;
    }

    public final Boolean component14() {
        return this.autoCalibration;
    }

    public final String component2() {
        return this.cloudId;
    }

    public final String component3() {
        return this.revision;
    }

    public final String component4() {
        return this.createdAt;
    }

    public final String component5() {
        return this.updatedAt;
    }

    public final String component6() {
        return this.sortKey;
    }

    public final String component7() {
        return this.name;
    }

    public final UMPreset component8() {
        return this.effectsPreset;
    }

    public final MusicServiceType component9() {
        return this.musicService;
    }

    public final AppPreset copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, UMPreset uMPreset, MusicServiceType musicServiceType, List<String> list, boolean z5, boolean z6, double d6, Boolean bool) {
        E4.k.f("name", str7);
        return new AppPreset(str, str2, str3, str4, str5, str6, str7, uMPreset, musicServiceType, list, z5, z6, d6, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppPreset)) {
            return false;
        }
        AppPreset appPreset = (AppPreset) obj;
        return E4.k.a(this.localId, appPreset.localId) && E4.k.a(this.cloudId, appPreset.cloudId) && E4.k.a(this.revision, appPreset.revision) && E4.k.a(this.createdAt, appPreset.createdAt) && E4.k.a(this.updatedAt, appPreset.updatedAt) && E4.k.a(this.sortKey, appPreset.sortKey) && E4.k.a(this.name, appPreset.name) && E4.k.a(this.effectsPreset, appPreset.effectsPreset) && this.musicService == appPreset.musicService && E4.k.a(this.selectedLightsIds, appPreset.selectedLightsIds) && this.backgroundMode == appPreset.backgroundMode && this.micEnabled == appPreset.micEnabled && Double.compare(this.manualDelay, appPreset.manualDelay) == 0 && E4.k.a(this.autoCalibration, appPreset.autoCalibration);
    }

    public final Boolean getAutoCalibration() {
        return this.autoCalibration;
    }

    public final boolean getBackgroundMode() {
        return this.backgroundMode;
    }

    public final String getCloudId() {
        return this.cloudId;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final UMPreset getEffectsPreset() {
        return this.effectsPreset;
    }

    public final String getLocalId() {
        return this.localId;
    }

    public final double getManualDelay() {
        return this.manualDelay;
    }

    public final boolean getMicEnabled() {
        return this.micEnabled;
    }

    public final MusicServiceType getMusicService() {
        return this.musicService;
    }

    public final String getName() {
        return this.name;
    }

    public final String getRevision() {
        return this.revision;
    }

    public final List<String> getSelectedLightsIds() {
        return this.selectedLightsIds;
    }

    public final String getSortKey() {
        return this.sortKey;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        String str = this.localId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.cloudId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.revision;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.createdAt;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.updatedAt;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.sortKey;
        int iC = AbstractC0013g0.c((iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31, this.name, 31);
        UMPreset uMPreset = this.effectsPreset;
        int iHashCode6 = (iC + (uMPreset == null ? 0 : uMPreset.hashCode())) * 31;
        MusicServiceType musicServiceType = this.musicService;
        int iHashCode7 = (iHashCode6 + (musicServiceType == null ? 0 : musicServiceType.hashCode())) * 31;
        List<String> list = this.selectedLightsIds;
        int iHashCode8 = (Double.hashCode(this.manualDelay) + p012c.k.m(this.micEnabled, p012c.k.m(this.backgroundMode, (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31, 31), 31)) * 31;
        Boolean bool = this.autoCalibration;
        return iHashCode8 + (bool != null ? bool.hashCode() : 0);
    }

    public final void setAutoCalibration(Boolean bool) {
        this.autoCalibration = bool;
    }

    public final void setBackgroundMode(boolean z5) {
        this.backgroundMode = z5;
    }

    public final void setCloudId(String str) {
        this.cloudId = str;
    }

    public final void setCreatedAt(String str) {
        this.createdAt = str;
    }

    public final void setEffectsPreset(UMPreset uMPreset) {
        this.effectsPreset = uMPreset;
    }

    public final void setLocalId(String str) {
        this.localId = str;
    }

    public final void setManualDelay(double d6) {
        this.manualDelay = d6;
    }

    public final void setMicEnabled(boolean z5) {
        this.micEnabled = z5;
    }

    public final void setMusicService(MusicServiceType musicServiceType) {
        this.musicService = musicServiceType;
    }

    public final void setName(String str) {
        E4.k.f("<set-?>", str);
        this.name = str;
    }

    public final void setRevision(String str) {
        this.revision = str;
    }

    public final void setSelectedLightsIds(List<String> list) {
        this.selectedLightsIds = list;
    }

    public final void setSortKey(String str) {
        this.sortKey = str;
    }

    public final void setUpdatedAt(String str) {
        this.updatedAt = str;
    }

    public String toString() {
        String str = this.localId;
        String str2 = this.cloudId;
        String str3 = this.revision;
        String str4 = this.createdAt;
        String str5 = this.updatedAt;
        String str6 = this.sortKey;
        String str7 = this.name;
        UMPreset uMPreset = this.effectsPreset;
        MusicServiceType musicServiceType = this.musicService;
        List<String> list = this.selectedLightsIds;
        boolean z5 = this.backgroundMode;
        boolean z6 = this.micEnabled;
        double d6 = this.manualDelay;
        Boolean bool = this.autoCalibration;
        StringBuilder sbO = AbstractC0013g0.o("AppPreset(localId=", str, ", cloudId=", str2, ", revision=");
        AbstractC0013g0.t(sbO, str3, ", createdAt=", str4, ", updatedAt=");
        AbstractC0013g0.t(sbO, str5, ", sortKey=", str6, ", name=");
        sbO.append(str7);
        sbO.append(", effectsPreset=");
        sbO.append(uMPreset);
        sbO.append(", musicService=");
        sbO.append(musicServiceType);
        sbO.append(", selectedLightsIds=");
        sbO.append(list);
        sbO.append(", backgroundMode=");
        sbO.append(z5);
        sbO.append(", micEnabled=");
        sbO.append(z6);
        sbO.append(", manualDelay=");
        sbO.append(d6);
        sbO.append(", autoCalibration=");
        sbO.append(bool);
        sbO.append(")");
        return sbO.toString();
    }

    public /* synthetic */ AppPreset(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, UMPreset uMPreset, MusicServiceType musicServiceType, List list, boolean z5, boolean z6, double d6, Boolean bool, c5.k0 k0Var) {
        if ((i & 1) == 0) {
            this.localId = null;
        } else {
            this.localId = str;
        }
        if ((i & 2) == 0) {
            this.cloudId = null;
        } else {
            this.cloudId = str2;
        }
        if ((i & 4) == 0) {
            this.revision = null;
        } else {
            this.revision = str3;
        }
        if ((i & 8) == 0) {
            this.createdAt = null;
        } else {
            this.createdAt = str4;
        }
        if ((i & 16) == 0) {
            this.updatedAt = null;
        } else {
            this.updatedAt = str5;
        }
        if ((i & 32) == 0) {
            this.sortKey = null;
        } else {
            this.sortKey = str6;
        }
        if ((i & 64) == 0) {
            this.name = "";
        } else {
            this.name = str7;
        }
        if ((i & 128) == 0) {
            this.effectsPreset = null;
        } else {
            this.effectsPreset = uMPreset;
        }
        if ((i & HueLog.LogComponent.STREAMDTLS) == 0) {
            this.musicService = null;
        } else {
            this.musicService = musicServiceType;
        }
        if ((i & HueLog.LogComponent.APPCORE) == 0) {
            this.selectedLightsIds = p089q4.u.f11237h;
        } else {
            this.selectedLightsIds = list;
        }
        if ((i & 1024) == 0) {
            this.backgroundMode = false;
        } else {
            this.backgroundMode = z5;
        }
        if ((i & 2048) == 0) {
            this.micEnabled = false;
        } else {
            this.micEnabled = z6;
        }
        this.manualDelay = (i & 4096) == 0 ? 0.0d : d6;
        if ((i & 8192) == 0) {
            this.autoCalibration = null;
        } else {
            this.autoCalibration = bool;
        }
    }

    public AppPreset(String str, String str2, String str3, String str4, String str5, String str6, String str7, UMPreset uMPreset, MusicServiceType musicServiceType, List<String> list, boolean z5, boolean z6, double d6, Boolean bool) {
        E4.k.f("name", str7);
        this.localId = str;
        this.cloudId = str2;
        this.revision = str3;
        this.createdAt = str4;
        this.updatedAt = str5;
        this.sortKey = str6;
        this.name = str7;
        this.effectsPreset = uMPreset;
        this.musicService = musicServiceType;
        this.selectedLightsIds = list;
        this.backgroundMode = z5;
        this.micEnabled = z6;
        this.manualDelay = d6;
        this.autoCalibration = bool;
    }

    public /* synthetic */ AppPreset(String str, String str2, String str3, String str4, String str5, String str6, String str7, UMPreset uMPreset, MusicServiceType musicServiceType, List list, boolean z5, boolean z6, double d6, Boolean bool, int i, E4.g gVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? null : uMPreset, (i & HueLog.LogComponent.STREAMDTLS) != 0 ? null : musicServiceType, (i & HueLog.LogComponent.APPCORE) != 0 ? p089q4.u.f11237h : list, (i & 1024) != 0 ? false : z5, (i & 2048) == 0 ? z6 : false, (i & 4096) != 0 ? 0.0d : d6, (i & 8192) != 0 ? null : bool);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AppPreset(String str) {
        E4.k.f("name", str);
        M m6 = M.f8305O;
        UMPreset uMPresetG = m6.g();
        H3.f fVar = H3.f.f1787d;
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, str, uMPresetG, H3.f.f1787d.b(), m6.f8332s, m6.f(), m6.f8325l.b(), m6.m(), (Boolean) null, 63, (E4.g) null);
    }
}

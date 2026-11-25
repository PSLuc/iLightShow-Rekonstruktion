package com.nanjoran.ilightshow.Services;

import B.AbstractC0013g0;
import c5.AbstractC0476a0;
import c5.C0479c;
import com.nanjoran.ilightshow.Model.Presets.UMPreset;
import com.nanjoran.ilightshow.Model.Presets.UMPreset$$serializer;
import com.nanjoran.ilightshow.Services.PlayerServices.MusicServiceType;
import com.philips.lighting.hue.sdk.wrapper.HueLog;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Y4.d
public final class SharedAppPresetRecordV1 {
    public static final int $stable = 8;
    private final boolean backgroundMode;
    private final String cloudId;
    private final String createdAt;
    private final UMPreset effects;
    private final String localId;
    private final double manualDelaySeconds;
    private final AppPresetMicrophoneV1 microphone;
    private final String musicService;
    private final String name;
    private final String revision;
    private final List<String> selectedLightIds;
    private final String sortKey;
    private final String updatedAt;
    public static final v0 Companion = new v0();
    private static final Y4.a[] $childSerializers = {null, null, null, null, null, null, null, null, null, new C0479c(c5.p0.f7477a, 0), null, null, null};

    public /* synthetic */ SharedAppPresetRecordV1(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, UMPreset uMPreset, String str8, List list, boolean z5, AppPresetMicrophoneV1 appPresetMicrophoneV1, double d6, c5.k0 k0Var) {
        if (7265 != (i & 7265)) {
            AbstractC0476a0.j(i, 7265, u0.f8490a.getDescriptor());
            throw null;
        }
        this.localId = str;
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
        this.name = str6;
        this.sortKey = str7;
        if ((i & 128) == 0) {
            this.effects = null;
        } else {
            this.effects = uMPreset;
        }
        if ((i & HueLog.LogComponent.STREAMDTLS) == 0) {
            this.musicService = null;
        } else {
            this.musicService = str8;
        }
        if ((i & HueLog.LogComponent.APPCORE) == 0) {
            this.selectedLightIds = p089q4.u.f11237h;
        } else {
            this.selectedLightIds = list;
        }
        this.backgroundMode = z5;
        this.microphone = appPresetMicrophoneV1;
        this.manualDelaySeconds = d6;
    }

    public static final /* synthetic */ void write$Self$app_release(SharedAppPresetRecordV1 sharedAppPresetRecordV1, b5.b bVar, a5.g gVar) {
        Y4.a[] aVarArr = $childSerializers;
        p081p0.c cVar = (p081p0.c) bVar;
        cVar.g0(gVar, 0, sharedAppPresetRecordV1.localId);
        if (cVar.p(gVar) || sharedAppPresetRecordV1.cloudId != null) {
            cVar.n(gVar, 1, c5.p0.f7477a, sharedAppPresetRecordV1.cloudId);
        }
        if (cVar.p(gVar) || sharedAppPresetRecordV1.revision != null) {
            cVar.n(gVar, 2, c5.p0.f7477a, sharedAppPresetRecordV1.revision);
        }
        if (cVar.p(gVar) || sharedAppPresetRecordV1.createdAt != null) {
            cVar.n(gVar, 3, c5.p0.f7477a, sharedAppPresetRecordV1.createdAt);
        }
        if (cVar.p(gVar) || sharedAppPresetRecordV1.updatedAt != null) {
            cVar.n(gVar, 4, c5.p0.f7477a, sharedAppPresetRecordV1.updatedAt);
        }
        cVar.g0(gVar, 5, sharedAppPresetRecordV1.name);
        cVar.g0(gVar, 6, sharedAppPresetRecordV1.sortKey);
        if (cVar.p(gVar) || sharedAppPresetRecordV1.effects != null) {
            cVar.n(gVar, 7, UMPreset$$serializer.INSTANCE, sharedAppPresetRecordV1.effects);
        }
        if (cVar.p(gVar) || sharedAppPresetRecordV1.musicService != null) {
            cVar.n(gVar, 8, c5.p0.f7477a, sharedAppPresetRecordV1.musicService);
        }
        if (cVar.p(gVar) || !E4.k.a(sharedAppPresetRecordV1.selectedLightIds, p089q4.u.f11237h)) {
            cVar.f0(gVar, 9, aVarArr[9], sharedAppPresetRecordV1.selectedLightIds);
        }
        cVar.Y(gVar, 10, sharedAppPresetRecordV1.backgroundMode);
        cVar.f0(gVar, 11, C0685n.f8438a, sharedAppPresetRecordV1.microphone);
        cVar.Z(gVar, 12, sharedAppPresetRecordV1.manualDelaySeconds);
    }

    public final String component1() {
        return this.localId;
    }

    public final List<String> component10() {
        return this.selectedLightIds;
    }

    public final boolean component11() {
        return this.backgroundMode;
    }

    public final AppPresetMicrophoneV1 component12() {
        return this.microphone;
    }

    public final double component13() {
        return this.manualDelaySeconds;
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
        return this.name;
    }

    public final String component7() {
        return this.sortKey;
    }

    public final UMPreset component8() {
        return this.effects;
    }

    public final String component9() {
        return this.musicService;
    }

    public final SharedAppPresetRecordV1 copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, UMPreset uMPreset, String str8, List<String> list, boolean z5, AppPresetMicrophoneV1 appPresetMicrophoneV1, double d6) {
        E4.k.f("localId", str);
        E4.k.f("name", str6);
        E4.k.f("sortKey", str7);
        E4.k.f("selectedLightIds", list);
        E4.k.f("microphone", appPresetMicrophoneV1);
        return new SharedAppPresetRecordV1(str, str2, str3, str4, str5, str6, str7, uMPreset, str8, list, z5, appPresetMicrophoneV1, d6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SharedAppPresetRecordV1)) {
            return false;
        }
        SharedAppPresetRecordV1 sharedAppPresetRecordV1 = (SharedAppPresetRecordV1) obj;
        return E4.k.a(this.localId, sharedAppPresetRecordV1.localId) && E4.k.a(this.cloudId, sharedAppPresetRecordV1.cloudId) && E4.k.a(this.revision, sharedAppPresetRecordV1.revision) && E4.k.a(this.createdAt, sharedAppPresetRecordV1.createdAt) && E4.k.a(this.updatedAt, sharedAppPresetRecordV1.updatedAt) && E4.k.a(this.name, sharedAppPresetRecordV1.name) && E4.k.a(this.sortKey, sharedAppPresetRecordV1.sortKey) && E4.k.a(this.effects, sharedAppPresetRecordV1.effects) && E4.k.a(this.musicService, sharedAppPresetRecordV1.musicService) && E4.k.a(this.selectedLightIds, sharedAppPresetRecordV1.selectedLightIds) && this.backgroundMode == sharedAppPresetRecordV1.backgroundMode && E4.k.a(this.microphone, sharedAppPresetRecordV1.microphone) && Double.compare(this.manualDelaySeconds, sharedAppPresetRecordV1.manualDelaySeconds) == 0;
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

    public final UMPreset getEffects() {
        return this.effects;
    }

    public final String getLocalId() {
        return this.localId;
    }

    public final double getManualDelaySeconds() {
        return this.manualDelaySeconds;
    }

    public final AppPresetMicrophoneV1 getMicrophone() {
        return this.microphone;
    }

    public final String getMusicService() {
        return this.musicService;
    }

    public final String getName() {
        return this.name;
    }

    public final String getRevision() {
        return this.revision;
    }

    public final List<String> getSelectedLightIds() {
        return this.selectedLightIds;
    }

    public final String getSortKey() {
        return this.sortKey;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        int iHashCode = this.localId.hashCode() * 31;
        String str = this.cloudId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.revision;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.createdAt;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.updatedAt;
        int iC = AbstractC0013g0.c(AbstractC0013g0.c((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31, this.name, 31), this.sortKey, 31);
        UMPreset uMPreset = this.effects;
        int iHashCode5 = (iC + (uMPreset == null ? 0 : uMPreset.hashCode())) * 31;
        String str5 = this.musicService;
        return Double.hashCode(this.manualDelaySeconds) + ((this.microphone.hashCode() + p012c.k.m(this.backgroundMode, (this.selectedLightIds.hashCode() + ((iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31)) * 31, 31)) * 31);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final AppPreset toAppPreset() {
        String str = this.localId;
        String str2 = this.cloudId;
        String str3 = this.revision;
        String str4 = this.createdAt;
        String str5 = this.updatedAt;
        String str6 = this.sortKey;
        String str7 = this.name;
        UMPreset uMPreset = this.effects;
        MusicServiceType musicServiceType = null;
        UMPreset uMPresetNormalizeEngineAndFxSize = uMPreset != null ? uMPreset.normalizeEngineAndFxSize() : null;
        String str8 = this.musicService;
        if (str8 != null) {
            switch (str8.hashCode()) {
                case -1998723398:
                    if (str8.equals("spotify")) {
                        musicServiceType = MusicServiceType.Spotify;
                    }
                    break;
                case -1738865456:
                    if (str8.equals("spotifyConnect")) {
                        musicServiceType = MusicServiceType.Spotify_Connect;
                    }
                    break;
                case -1335647197:
                    if (str8.equals("deezer")) {
                        musicServiceType = MusicServiceType.Deezer;
                    }
                    break;
                case -853075327:
                    if (str8.equals("amazonMusic")) {
                        musicServiceType = MusicServiceType.Amazon_Music;
                    }
                    break;
                case -499744021:
                    if (str8.equals("appleMusic")) {
                        musicServiceType = MusicServiceType.Apple_Music;
                    }
                    break;
                case 109620982:
                    if (str8.equals("sonos")) {
                        musicServiceType = MusicServiceType.Sonos;
                    }
                    break;
                case 110355706:
                    if (str8.equals("tidal")) {
                        musicServiceType = MusicServiceType.Tidal;
                    }
                    break;
                case 1905086658:
                    if (str8.equals("youtubeMusic")) {
                        musicServiceType = MusicServiceType.YouTube_Music;
                    }
                    break;
            }
        }
        return new AppPreset(str, str2, str3, str4, str5, str6, str7, uMPresetNormalizeEngineAndFxSize, musicServiceType, this.selectedLightIds, this.backgroundMode, this.microphone.getEnabled(), this.manualDelaySeconds, this.microphone.getAutoCalibration());
    }

    public String toString() {
        String str = this.localId;
        String str2 = this.cloudId;
        String str3 = this.revision;
        String str4 = this.createdAt;
        String str5 = this.updatedAt;
        String str6 = this.name;
        String str7 = this.sortKey;
        UMPreset uMPreset = this.effects;
        String str8 = this.musicService;
        List<String> list = this.selectedLightIds;
        boolean z5 = this.backgroundMode;
        AppPresetMicrophoneV1 appPresetMicrophoneV1 = this.microphone;
        double d6 = this.manualDelaySeconds;
        StringBuilder sbO = AbstractC0013g0.o("SharedAppPresetRecordV1(localId=", str, ", cloudId=", str2, ", revision=");
        AbstractC0013g0.t(sbO, str3, ", createdAt=", str4, ", updatedAt=");
        AbstractC0013g0.t(sbO, str5, ", name=", str6, ", sortKey=");
        sbO.append(str7);
        sbO.append(", effects=");
        sbO.append(uMPreset);
        sbO.append(", musicService=");
        sbO.append(str8);
        sbO.append(", selectedLightIds=");
        sbO.append(list);
        sbO.append(", backgroundMode=");
        sbO.append(z5);
        sbO.append(", microphone=");
        sbO.append(appPresetMicrophoneV1);
        sbO.append(", manualDelaySeconds=");
        sbO.append(d6);
        sbO.append(")");
        return sbO.toString();
    }

    public SharedAppPresetRecordV1(String str, String str2, String str3, String str4, String str5, String str6, String str7, UMPreset uMPreset, String str8, List<String> list, boolean z5, AppPresetMicrophoneV1 appPresetMicrophoneV1, double d6) {
        E4.k.f("localId", str);
        E4.k.f("name", str6);
        E4.k.f("sortKey", str7);
        E4.k.f("selectedLightIds", list);
        E4.k.f("microphone", appPresetMicrophoneV1);
        this.localId = str;
        this.cloudId = str2;
        this.revision = str3;
        this.createdAt = str4;
        this.updatedAt = str5;
        this.name = str6;
        this.sortKey = str7;
        this.effects = uMPreset;
        this.musicService = str8;
        this.selectedLightIds = list;
        this.backgroundMode = z5;
        this.microphone = appPresetMicrophoneV1;
        this.manualDelaySeconds = d6;
    }

    public /* synthetic */ SharedAppPresetRecordV1(String str, String str2, String str3, String str4, String str5, String str6, String str7, UMPreset uMPreset, String str8, List list, boolean z5, AppPresetMicrophoneV1 appPresetMicrophoneV1, double d6, int i, E4.g gVar) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, str6, str7, (i & 128) != 0 ? null : uMPreset, (i & HueLog.LogComponent.STREAMDTLS) != 0 ? null : str8, (i & HueLog.LogComponent.APPCORE) != 0 ? p089q4.u.f11237h : list, z5, appPresetMicrophoneV1, d6);
    }
}

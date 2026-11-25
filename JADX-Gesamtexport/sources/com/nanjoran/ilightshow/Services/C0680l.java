package com.nanjoran.ilightshow.Services;

import N.C0208d;
import c5.C0479c;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import com.nanjoran.ilightshow.Model.Presets.UMPreset;
import com.nanjoran.ilightshow.Services.PlayerServices.MusicServiceType;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import okhttp3.HttpUrl;

/* JADX INFO: renamed from: com.nanjoran.ilightshow.Services.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0680l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0680l f8421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ K4.e[] f8422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d5.n f8423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final defpackage.t f8424d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final defpackage.t f8425e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static X.s f8426f;

    static {
        E4.n nVar = new E4.n(C0680l.class, "savedPresetsString", "getSavedPresetsString()Ljava/lang/String;", 0);
        E4.x.f1075a.getClass();
        f8422b = new K4.e[]{nVar, new E4.n(C0680l.class, "sharedPresetsString", "getSharedPresetsString()Ljava/lang/String;", 0)};
        f8421a = new C0680l();
        f8423c = S1.V.f(new defpackage.d(22));
        f8424d = new defpackage.t("savedPresetsString3", E4.x.a(String.class), HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
        f8425e = new defpackage.t("app_presets_v1", E4.x.a(String.class), "");
        f8426f = new X.s();
    }

    public static void a(String str) {
        UMPreset uMPresetCopy$default;
        E4.k.f("name", str);
        X.s sVar = f8426f;
        E4.k.f("existing", sVar);
        String string = M4.l.B0(str).toString();
        if (string.length() <= 0) {
            throw new IllegalArgumentException("Enter a preset name");
        }
        String lowerCase = M4.l.B0(string).toString().toLowerCase(Locale.ROOT);
        E4.k.e("toLowerCase(...)", lowerCase);
        if (!sVar.isEmpty()) {
            ListIterator listIterator = sVar.listIterator();
            while (true) {
                X.y yVar = (X.y) listIterator;
                if (!yVar.hasNext()) {
                    break;
                }
                String lowerCase2 = M4.l.B0(((AppPreset) yVar.next()).getName()).toString().toLowerCase(Locale.ROOT);
                E4.k.e("toLowerCase(...)", lowerCase2);
                if (lowerCase2.equals(lowerCase)) {
                    throw new IllegalArgumentException("A preset already exists with this name");
                }
            }
        }
        AppPreset appPreset = new AppPreset(string);
        UMPreset effectsPreset = appPreset.getEffectsPreset();
        appPreset.setEffectsPreset((effectsPreset == null || (uMPresetCopy$default = UMPreset.copy$default(effectsPreset, null, 0, 0, 0, 0, 0, null, false, null, false, false, null, null, null, false, false, false, false, null, 524287, null)) == null) ? null : uMPresetCopy$default.normalizeEngineAndFxSize());
        f8426f = C0208d.U(C0691q.e(p089q4.l.k0(f8426f, appPreset)));
        b();
    }

    public static void b() {
        String str;
        List list;
        UMPreset uMPresetCopy$default;
        List listE = C0691q.e(f8426f);
        f8426f = C0208d.U(listE);
        String string = Instant.now().toString();
        String str2 = "toString(...)";
        E4.k.e("toString(...)", string);
        d5.n nVar = f8423c;
        E4.k.f("json", nVar);
        List<AppPreset> listD = C0691q.d(string, listE);
        v0 v0Var = SharedAppPresetRecordV1.Companion;
        ArrayList arrayList = new ArrayList(p089q4.n.P(listD, 10));
        for (AppPreset appPreset : listD) {
            v0Var.getClass();
            E4.k.f("preset", appPreset);
            String localId = appPreset.getLocalId();
            if (localId == null) {
                localId = UUID.randomUUID().toString();
                E4.k.e(str2, localId);
            }
            String str3 = localId;
            String cloudId = appPreset.getCloudId();
            String revision = appPreset.getRevision();
            String createdAt = appPreset.getCreatedAt();
            String updatedAt = appPreset.getUpdatedAt();
            String name = appPreset.getName();
            String name2 = appPreset.getName();
            E4.k.f("name", name2);
            String lowerCase = M4.l.B0(name2).toString().toLowerCase(Locale.ROOT);
            E4.k.e("toLowerCase(...)", lowerCase);
            UMPreset effectsPreset = appPreset.getEffectsPreset();
            String str4 = null;
            UMPreset uMPresetNormalizeEngineAndFxSize = (effectsPreset == null || (uMPresetCopy$default = UMPreset.copy$default(effectsPreset, null, 0, 0, 0, 0, 0, null, false, null, false, false, null, null, null, false, false, false, false, null, 524287, null)) == null) ? null : uMPresetCopy$default.normalizeEngineAndFxSize();
            MusicServiceType musicService = appPreset.getMusicService();
            if (musicService != null) {
                switch (AbstractC0683m.f8434a[musicService.ordinal()]) {
                    case 1:
                        str4 = "spotify";
                        break;
                    case 2:
                        str4 = "spotifyConnect";
                        break;
                    case 3:
                        str4 = "sonos";
                        break;
                    case 4:
                        str4 = "appleMusic";
                        break;
                    case 5:
                        str4 = "amazonMusic";
                        break;
                    case 6:
                        str4 = "tidal";
                        break;
                    case 7:
                        str4 = "youtubeMusic";
                        break;
                    case 8:
                        str4 = "deezer";
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
            String str5 = str4;
            List<String> selectedLightsIds = appPreset.getSelectedLightsIds();
            if (selectedLightsIds != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : selectedLightsIds) {
                    String str6 = str2;
                    if (obj != null) {
                        arrayList2.add(obj);
                    }
                    str2 = str6;
                }
                str = str2;
                list = arrayList2;
            } else {
                str = str2;
                list = p089q4.u.f11237h;
            }
            arrayList.add(new SharedAppPresetRecordV1(str3, cloudId, revision, createdAt, updatedAt, name, lowerCase, uMPresetNormalizeEngineAndFxSize, str5, list, appPreset.getBackgroundMode(), new AppPresetMicrophoneV1(appPreset.getMicEnabled(), appPreset.getAutoCalibration()), appPreset.getManualDelay()));
            str2 = str;
        }
        String strB = nVar.b(SharedAppPresetDocumentV1.Companion.serializer(), new SharedAppPresetDocumentV1((String) null, 0, (String) null, string, arrayList, 7, (E4.g) null));
        K4.e[] eVarArr = f8422b;
        f8425e.b(eVarArr[1], strB);
        f8424d.b(eVarArr[0], nVar.b(new C0479c(AbstractC0599v0.B(AppPreset.Companion.serializer()), 0), new ArrayList(listE)));
    }
}

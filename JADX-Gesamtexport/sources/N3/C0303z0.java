package N3;

import com.nanjoran.ilightshow.Services.AppPreset;
import com.nanjoran.ilightshow.Services.C0689p;
import com.nanjoran.ilightshow.Services.PaletteColor;
import java.util.Comparator;

/* JADX INFO: renamed from: N3.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0303z0 implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Comparator f4325b;

    public C0303z0(Comparator comparator) {
        this.f4324a = 4;
        this.f4325b = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f4324a) {
            case 0:
                int iCompare = ((C0301y0) this.f4325b).compare(obj, obj2);
                if (iCompare != 0) {
                    return iCompare;
                }
                String str = ((D3.j) obj).f800b;
                if (str == null) {
                    str = "";
                }
                String str2 = ((D3.j) obj2).f800b;
                return p027e3.a.R(str, str2 != null ? str2 : "");
            case 1:
                int iCompare2 = ((C0689p) this.f4325b).compare(obj, obj2);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                String createdAt = ((AppPreset) obj).getCreatedAt();
                if (createdAt == null) {
                    createdAt = "";
                }
                String createdAt2 = ((AppPreset) obj2).getCreatedAt();
                return p027e3.a.R(createdAt, createdAt2 != null ? createdAt2 : "");
            case 2:
                int iCompare3 = ((C0303z0) this.f4325b).compare(obj, obj2);
                if (iCompare3 != 0) {
                    return iCompare3;
                }
                String localId = ((AppPreset) obj).getLocalId();
                if (localId == null) {
                    localId = "";
                }
                String localId2 = ((AppPreset) obj2).getLocalId();
                return p027e3.a.R(localId, localId2 != null ? localId2 : "");
            case 3:
                int iCompare4 = ((C0689p) this.f4325b).compare(obj, obj2);
                return iCompare4 != 0 ? iCompare4 : p027e3.a.R(Float.valueOf(((PaletteColor) obj2).getSaturation()), Float.valueOf(((PaletteColor) obj).getSaturation()));
            case 4:
                int iCompare5 = this.f4325b.compare(obj, obj2);
                if (iCompare5 != 0) {
                    return iCompare5;
                }
                return p124x0.D.f13825P.compare(((E0.l) obj).f946c, ((E0.l) obj2).f946c);
            default:
                int iCompare6 = ((C0303z0) this.f4325b).compare(obj, obj2);
                return iCompare6 != 0 ? iCompare6 : p027e3.a.R(Integer.valueOf(((E0.l) obj).f950g), Integer.valueOf(((E0.l) obj2).f950g));
        }
    }

    public /* synthetic */ C0303z0(Comparator comparator, int i) {
        this.f4324a = i;
        this.f4325b = comparator;
    }
}

package com.nanjoran.ilightshow.Services;

import java.util.Comparator;
import java.util.Locale;

/* JADX INFO: renamed from: com.nanjoran.ilightshow.Services.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0689p implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8461a;

    public /* synthetic */ C0689p(int i) {
        this.f8461a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f8461a) {
            case 0:
                AppPreset appPreset = (AppPreset) obj;
                String sortKey = appPreset.getSortKey();
                if (sortKey == null) {
                    String name = appPreset.getName();
                    E4.k.f("name", name);
                    sortKey = M4.l.B0(name).toString().toLowerCase(Locale.ROOT);
                    E4.k.e("toLowerCase(...)", sortKey);
                }
                AppPreset appPreset2 = (AppPreset) obj2;
                String sortKey2 = appPreset2.getSortKey();
                if (sortKey2 == null) {
                    String name2 = appPreset2.getName();
                    E4.k.f("name", name2);
                    sortKey2 = M4.l.B0(name2).toString().toLowerCase(Locale.ROOT);
                    E4.k.e("toLowerCase(...)", sortKey2);
                }
                return p027e3.a.R(sortKey, sortKey2);
            case 1:
                return p027e3.a.R(Float.valueOf(((PaletteColor) obj2).getSaturation()), Float.valueOf(((PaletteColor) obj).getSaturation()));
            default:
                return p027e3.a.R(Integer.valueOf(((Palette) obj).getDisplayOrder()), Integer.valueOf(((Palette) obj2).getDisplayOrder()));
        }
    }
}

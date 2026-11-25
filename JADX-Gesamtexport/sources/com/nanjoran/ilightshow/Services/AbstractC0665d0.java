package com.nanjoran.ilightshow.Services;

import c5.C0479c;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.nanjoran.ilightshow.Services.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0665d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static File f8380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d5.n f8381b = S1.V.f(new defpackage.d(25));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p084p4.m f8382c = G4.a.z(new H3.g(21));

    public static SharedPaletteStorageDocument a(String str) {
        String string = M4.l.B0(str).toString();
        if (M4.l.i0(string)) {
            return new SharedPaletteStorageDocument((String) null, 0, (String) null, (String) null, (PaletteColorSource) null, (List) null, 63, (E4.g) null);
        }
        if (string.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        int iIntValue = 0;
        char cCharAt = string.charAt(0);
        d5.n nVar = f8381b;
        if (cCharAt == '[') {
            nVar.getClass();
            List list = (List) nVar.a(new C0479c(LegacyPalette.Companion.serializer(), 0), string);
            ArrayList arrayList = new ArrayList(p089q4.n.P(list, 10));
            for (Object obj : list) {
                int i = iIntValue + 1;
                if (iIntValue < 0) {
                    p089q4.m.O();
                    throw null;
                }
                LegacyPalette legacyPalette = (LegacyPalette) obj;
                String id = legacyPalette.getId();
                String name = legacyPalette.getName();
                List<LegacyPaletteColor> colors = legacyPalette.getColors();
                ArrayList arrayList2 = new ArrayList(p089q4.n.P(colors, 10));
                for (LegacyPaletteColor legacyPaletteColor : colors) {
                    arrayList2.add(new PaletteColor(AbstractC0698y.a(legacyPaletteColor.getHue()), p081p0.c.N(legacyPaletteColor.getSaturation(), 0.0f, 1.0f)));
                }
                arrayList.add(new Palette(id, name, iIntValue, p089q4.l.u0(arrayList2)));
                iIntValue = i;
            }
            return new SharedPaletteStorageDocument((String) null, 0, (String) null, (String) null, (PaletteColorSource) null, arrayList, 31, (E4.g) null);
        }
        nVar.getClass();
        SharedPaletteStorageDocument sharedPaletteStorageDocument = (SharedPaletteStorageDocument) nVar.a(SharedPaletteStorageDocument.Companion.serializer(), string);
        if (!E4.k.a(sharedPaletteStorageDocument.getSchema(), "app.ilightshow.palettes") || sharedPaletteStorageDocument.getSchemaVersion() != 1) {
            return new SharedPaletteStorageDocument((String) null, 0, (String) null, (String) null, (PaletteColorSource) null, (List) null, 63, (E4.g) null);
        }
        List<Palette> palettes = sharedPaletteStorageDocument.getPalettes();
        ArrayList arrayList3 = new ArrayList(p089q4.n.P(palettes, 10));
        for (Object obj2 : palettes) {
            int i3 = iIntValue + 1;
            if (iIntValue < 0) {
                p089q4.m.O();
                throw null;
            }
            Palette palette = (Palette) obj2;
            int displayOrder = palette.getDisplayOrder();
            Integer numValueOf = Integer.valueOf(displayOrder);
            if (displayOrder < 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                iIntValue = numValueOf.intValue();
            }
            int i6 = iIntValue;
            List<PaletteColor> colors2 = palette.getColors();
            ArrayList arrayList4 = new ArrayList(p089q4.n.P(colors2, 10));
            for (PaletteColor paletteColor : colors2) {
                arrayList4.add(new PaletteColor(AbstractC0698y.a(paletteColor.getHue()), p081p0.c.N(paletteColor.getSaturation(), 0.0f, 1.0f)));
            }
            arrayList3.add(Palette.copy$default(palette, null, null, i6, p089q4.l.u0(arrayList4), 3, null));
            iIntValue = i3;
        }
        return SharedPaletteStorageDocument.copy$default(sharedPaletteStorageDocument, null, 0, null, null, null, arrayList3, 31, null);
    }

    public static Palette b(String str) {
        Object next;
        ListIterator listIterator = c().listIterator();
        do {
            X.y yVar = (X.y) listIterator;
            if (!yVar.hasNext()) {
                next = null;
                break;
            }
            next = yVar.next();
        } while (!E4.k.a(((Palette) next).getId(), str));
        return (Palette) next;
    }

    public static X.s c() {
        return (X.s) f8382c.getValue();
    }
}

package B;

import com.nanjoran.ilightshow.Services.AbstractC0665d0;
import com.nanjoran.ilightshow.Services.Palette;
import com.nanjoran.ilightshow.Services.PaletteColorSource;
import com.nanjoran.ilightshow.Services.SharedPaletteStorageDocument;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.ListIterator;
import p130y0.C1128e0;

/* JADX INFO: loaded from: classes.dex */
public final class A implements N.F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28b;

    public /* synthetic */ A(int i, Object obj) {
        this.f27a = i;
        this.f28b = obj;
    }

    @Override // N.F
    public final void a() throws IllegalAccessException, IOException, InvocationTargetException {
        p084p4.x xVar;
        switch (this.f27a) {
            case 0:
                ((F.P) this.f28b).k();
                return;
            case 1:
                ((G2.a) this.f28b).getClass();
                return;
            case 2:
                Palette palette = (Palette) this.f28b;
                if (palette.getColors().isEmpty()) {
                    AbstractC0665d0.c().remove(palette);
                    return;
                }
                ListIterator listIterator = AbstractC0665d0.c().listIterator();
                int i = 0;
                int i3 = 0;
                while (true) {
                    X.y yVar = (X.y) listIterator;
                    if (!yVar.hasNext()) {
                        i3 = -1;
                    } else if (!E4.k.a(((Palette) yVar.next()).getId(), palette.getId())) {
                        i3++;
                    }
                }
                if (i3 >= 0) {
                    AbstractC0665d0.c().set(i3, palette);
                } else {
                    AbstractC0665d0.c().add(palette);
                }
                X.s sVarC = AbstractC0665d0.c();
                ArrayList arrayList = new ArrayList(p089q4.n.P(sVarC, 10));
                ListIterator listIterator2 = sVarC.listIterator();
                while (true) {
                    int i6 = i;
                    X.y yVar2 = (X.y) listIterator2;
                    if (!yVar2.hasNext()) {
                        SharedPaletteStorageDocument sharedPaletteStorageDocument = new SharedPaletteStorageDocument((String) null, 0, (String) null, (String) null, (PaletteColorSource) null, arrayList, 31, (E4.g) null);
                        File file = AbstractC0665d0.f8380a;
                        if (file == null) {
                            E4.k.m("storageFile");
                            throw null;
                        }
                        d5.n nVar = AbstractC0665d0.f8381b;
                        nVar.getClass();
                        p006b.a.G(file, nVar.b(SharedPaletteStorageDocument.Companion.serializer(), sharedPaletteStorageDocument));
                        return;
                    }
                    Object next = yVar2.next();
                    i = i6 + 1;
                    if (i6 < 0) {
                        p089q4.m.O();
                        throw null;
                    }
                    arrayList.add(Palette.copy$default((Palette) next, null, null, i6, null, 11, null));
                }
                break;
            case 3:
                V0.v vVar = (V0.v) this.f28b;
                vVar.dismiss();
                V0.r rVar = vVar.f5458n;
                p130y0.b1 b1Var = rVar.f14339j;
                if (b1Var != null) {
                    b1Var.a();
                }
                rVar.f14339j = null;
                rVar.requestLayout();
                return;
            case 4:
                V0.y yVar3 = (V0.y) this.f28b;
                p130y0.b1 b1Var2 = yVar3.f14339j;
                if (b1Var2 != null) {
                    b1Var2.a();
                }
                yVar3.f14339j = null;
                yVar3.requestLayout();
                androidx.lifecycle.J.i(yVar3, null);
                yVar3.f5476u.removeViewImmediate(yVar3);
                return;
            case 5:
                p029f.g gVar = ((p018d.a) this.f28b).f8549a;
                if (gVar != null) {
                    gVar.f8825l.d(gVar.f8826m);
                    xVar = p084p4.x.f10867a;
                } else {
                    xVar = null;
                }
                if (xVar == null) {
                    throw new IllegalStateException("Launcher has not been initialized");
                }
                return;
            case 6:
                ((p018d.c) this.f28b).e();
                return;
            case 7:
                ((p018d.i) this.f28b).e();
                return;
            default:
                ((C1128e0) this.f28b).f14385a.invoke();
                return;
        }
    }
}

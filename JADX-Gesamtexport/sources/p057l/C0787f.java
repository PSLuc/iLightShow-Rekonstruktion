package p057l;

import android.content.Context;
import android.view.View;
import com.nanjoran.ilightshow.R;
import p035g0.C0715p;
import p052k.j;
import p052k.l;
import p052k.o;
import p052k.u;

/* JADX INFO: renamed from: l.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0787f extends o {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f10047l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0793i f10048m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0787f(C0793i c0793i, Context context, j jVar, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, jVar, true);
        this.f10048m = c0793i;
        this.f9901f = 8388613;
        C0715p c0715p = c0793i.f10083C;
        this.f9903h = c0715p;
        l lVar = this.i;
        if (lVar != null) {
            lVar.h(c0715p);
        }
    }

    @Override // p052k.o
    public final void c() {
        switch (this.f10047l) {
            case 0:
                C0793i c0793i = this.f10048m;
                c0793i.f10101z = null;
                c0793i.getClass();
                super.c();
                break;
            default:
                C0793i c0793i2 = this.f10048m;
                j jVar = c0793i2.f10085j;
                if (jVar != null) {
                    jVar.c(true);
                }
                c0793i2.f10100y = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0787f(C0793i c0793i, Context context, u uVar, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, uVar, false);
        this.f10048m = c0793i;
        if ((uVar.f9925w.f9891x & 32) != 32) {
            View view2 = c0793i.f10090o;
            this.f9900e = view2 == null ? c0793i.f10089n : view2;
        }
        C0715p c0715p = c0793i.f10083C;
        this.f9903h = c0715p;
        l lVar = this.i;
        if (lVar != null) {
            lVar.h(c0715p);
        }
    }
}

package p057l;

import android.graphics.Typeface;
import android.widget.TextView;
import java.util.concurrent.atomic.AtomicLong;
import p115v2.a;
import p115v2.c;
import p115v2.l;
import p115v2.o;

/* JADX INFO: renamed from: l.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0811t implements Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f10140h = 0;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f10141j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f10142k;

    public RunnableC0811t(TextView textView, Typeface typeface, int i) {
        this.f10141j = textView;
        this.f10142k = typeface;
        this.i = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10140h) {
            case 0:
                ((TextView) this.f10141j).setTypeface((Typeface) this.f10142k, this.i);
                break;
            default:
                o oVar = (o) this.f10142k;
                AtomicLong atomicLong = oVar.f13240k;
                atomicLong.lazySet(atomicLong.get() + ((long) this.i));
                l lVar = (l) this.f10141j;
                c cVar = oVar.f13239j;
                if (cVar.d(lVar) && lVar != cVar.i) {
                    l lVar2 = lVar.i;
                    l lVar3 = lVar.f13232j;
                    if (lVar2 == null) {
                        cVar.f13217h = lVar3;
                    } else {
                        lVar2.f13232j = lVar3;
                        lVar.i = null;
                    }
                    if (lVar3 == null) {
                        cVar.i = lVar2;
                    } else {
                        lVar3.i = lVar2;
                        lVar.f13232j = null;
                    }
                    a aVar = cVar.i;
                    cVar.i = lVar;
                    if (aVar == null) {
                        cVar.f13217h = lVar;
                    } else {
                        ((l) aVar).f13232j = lVar;
                        lVar.i = (l) aVar;
                    }
                }
                oVar.e();
                break;
        }
    }

    public RunnableC0811t(o oVar, l lVar, int i) {
        this.f10142k = oVar;
        this.i = i;
        this.f10141j = lVar;
    }
}

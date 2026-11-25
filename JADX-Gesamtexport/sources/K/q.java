package K;

import android.content.Context;
import android.view.ViewGroup;
import com.nanjoran.ilightshow.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class q extends ViewGroup {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f2008h;
    public final ArrayList i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f2009j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final D.x f2010k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2011l;

    public q(Context context) {
        super(context);
        this.f2008h = 5;
        ArrayList arrayList = new ArrayList();
        this.i = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f2009j = arrayList2;
        this.f2010k = new D.x(7);
        setClipChildren(false);
        r rVar = new r(context);
        addView(rVar);
        arrayList.add(rVar);
        arrayList2.add(rVar);
        this.f2011l = 1;
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i, int i3, int i6, int i7) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i3) {
        setMeasuredDimension(0, 0);
    }
}

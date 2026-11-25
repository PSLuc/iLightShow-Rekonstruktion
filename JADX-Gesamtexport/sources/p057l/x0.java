package p057l;

import android.R;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f10151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f10152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f10153c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f10154d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageView f10155e;

    public x0(View view) {
        this.f10151a = (TextView) view.findViewById(R.id.text1);
        this.f10152b = (TextView) view.findViewById(R.id.text2);
        this.f10153c = (ImageView) view.findViewById(R.id.icon1);
        this.f10154d = (ImageView) view.findViewById(R.id.icon2);
        this.f10155e = (ImageView) view.findViewById(com.nanjoran.ilightshow.R.id.edit_query);
    }
}

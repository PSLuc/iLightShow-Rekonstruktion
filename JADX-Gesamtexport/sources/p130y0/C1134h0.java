package p130y0;

import E4.k;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import com.nanjoran.ilightshow.R;
import p035g0.AbstractC0702c;
import p035g0.InterfaceC0714o;

/* JADX INFO: renamed from: y0.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1134h0 extends ViewGroup {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f14394h;

    public C1134h0(Context context) {
        super(context);
        setClipChildren(false);
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    public final void a(InterfaceC0714o interfaceC0714o, I0 i3, long j4) {
        super.drawChild(AbstractC0702c.a(interfaceC0714o), i3, j4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int childCount = super.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            k.d("null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer", childAt);
            if (((I0) childAt).f14256o) {
                this.f14394h = true;
                try {
                    super.dispatchDraw(canvas);
                    return;
                } finally {
                    this.f14394h = false;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        if (this.f14394h) {
            return super.getChildCount();
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i, int i3, int i6, int i7) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i3) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }
}

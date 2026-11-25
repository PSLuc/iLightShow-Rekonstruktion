package p057l;

import A0.b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.nanjoran.ilightshow.R;

/* JADX INFO: renamed from: l.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0805o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f10128b = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static C0805o f10129c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C0792h0 f10130a;

    /* JADX WARN: Type inference failed for: r0v6, types: [int[], java.io.Serializable] */
    public static synchronized void b() {
        if (f10129c == null) {
            C0805o c0805o = new C0805o();
            f10129c = c0805o;
            c0805o.f10130a = C0792h0.b();
            C0792h0 c0792h0 = f10129c.f10130a;
            b bVar = new b();
            bVar.f8a = new int[]{2131165269, 2131165267, 2131165193};
            bVar.f9b = new int[]{2131165217, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
            bVar.f10c = new int[]{2131165266, 2131165268, 2131165210, R.drawable.abc_text_cursor_material, 2131165263, 2131165264, 2131165265};
            bVar.f11d = new int[]{2131165242, R.drawable.abc_cab_background_internal_bg, 2131165241};
            bVar.f12e = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
            bVar.f13f = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
            synchronized (c0792h0) {
                c0792h0.f10080e = bVar;
            }
        }
    }

    public static void c(Drawable drawable, B0 b6, int[] iArr) {
        PorterDuff.Mode mode = C0792h0.f10073f;
        int[] state = drawable.getState();
        int[] iArr2 = H.f9980a;
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z5 = b6.f9966b;
            if (!z5 && !b6.f9965a) {
                drawable.clearColorFilter();
                return;
            }
            PorterDuffColorFilter porterDuffColorFilterE = null;
            ColorStateList colorStateList = z5 ? (ColorStateList) b6.f9967c : null;
            PorterDuff.Mode mode2 = b6.f9965a ? (PorterDuff.Mode) b6.f9968d : C0792h0.f10073f;
            if (colorStateList != null && mode2 != null) {
                porterDuffColorFilterE = C0792h0.e(colorStateList.getColorForState(iArr, 0), mode2);
            }
            drawable.setColorFilter(porterDuffColorFilterE);
        }
    }

    public final synchronized Drawable a(Context context, int i) {
        return this.f10130a.c(context, i);
    }
}

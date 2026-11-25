package A0;

import B.Z0;
import E4.k;
import L2.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.Menu;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import com.nanjoran.ilightshow.R;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import p015c2.AbstractC0473d;
import p057l.C0792h0;
import p057l.C0805o;
import p057l.H;
import p057l.z0;
import p058l0.I;
import p084p4.h;
import p084p4.m;
import p096s.AbstractC0916i;
import p126x2.t;
import p126x2.u;
import p126x2.w;
import p126x2.y;

/* JADX INFO: loaded from: classes.dex */
public final class b implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f8a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f9b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f10c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f11d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Serializable f12e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f13f;

    public b(u uVar, String str, List list) {
        k.f("httpMethod", uVar);
        k.f("urlString", str);
        this.f11d = uVar;
        this.f12e = str;
        this.f13f = list;
        this.f8a = new Z0(7, this);
        this.f9b = G4.a.z(new I(17, this));
        Map map = t.i;
        this.f10c = AbstractC0599v0.v(p089q4.k.t0(new h[0]));
    }

    public static void B(Menu menu, int i, D4.a aVar) {
        if (aVar != null && menu.findItem(AbstractC0916i.d(i)) == null) {
            z(i, menu);
        } else {
            if (aVar != null || menu.findItem(AbstractC0916i.d(i)) == null) {
                return;
            }
            menu.removeItem(AbstractC0916i.d(i));
        }
    }

    public static boolean C(int[] iArr, int i) {
        for (int i3 : iArr) {
            if (i3 == i) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList E(Context context, int i) {
        int iC = z0.c(context, R.attr.colorControlHighlight);
        int iB = z0.b(context, R.attr.colorButtonNormal);
        int[] iArr = z0.f10186b;
        int[] iArr2 = z0.f10188d;
        int iB2 = p008b1.a.b(iC, i);
        return new ColorStateList(new int[][]{iArr, iArr2, z0.f10187c, z0.f10190f}, new int[]{iB, iB2, p008b1.a.b(iC, i), i});
    }

    public static LayerDrawable F(C0792h0 c0792h0, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable drawableC = c0792h0.c(context, R.drawable.abc_star_black_48dp);
        Drawable drawableC2 = c0792h0.c(context, R.drawable.abc_star_half_black_48dp);
        if ((drawableC instanceof BitmapDrawable) && drawableC.getIntrinsicWidth() == dimensionPixelSize && drawableC.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableC;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableC.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableC.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableC2 instanceof BitmapDrawable) && drawableC2.getIntrinsicWidth() == dimensionPixelSize && drawableC2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableC2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableC2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableC2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static void H(Drawable drawable, int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterE;
        int[] iArr = H.f9980a;
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = C0805o.f10128b;
        }
        PorterDuff.Mode mode2 = C0805o.f10128b;
        synchronized (C0805o.class) {
            porterDuffColorFilterE = C0792h0.e(i, mode);
        }
        drawableMutate.setColorFilter(porterDuffColorFilterE);
    }

    public static void z(int i, Menu menu) {
        int i3;
        int iD = AbstractC0916i.d(i);
        int iD2 = AbstractC0916i.d(i);
        if (iD2 == 0) {
            i3 = android.R.string.copy;
        } else if (iD2 == 1) {
            i3 = android.R.string.paste;
        } else if (iD2 == 2) {
            i3 = android.R.string.cut;
        } else {
            if (iD2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i3 = android.R.string.selectAll;
        }
        menu.add(0, iD, AbstractC0916i.d(i), i3).setShowAsAction(1);
    }

    public void A(String str, String str2) {
        HashMap map = (HashMap) this.f13f;
        if (map == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map.put(str, str2);
    }

    public L2.h D() {
        String strConcat = ((String) this.f8a) == null ? " transportName" : "";
        if (((l) this.f10c) == null) {
            strConcat = strConcat.concat(" encodedPayload");
        }
        if (((Long) this.f11d) == null) {
            strConcat = strConcat + " eventMillis";
        }
        if (((Long) this.f12e) == null) {
            strConcat = strConcat + " uptimeMillis";
        }
        if (((HashMap) this.f13f) == null) {
            strConcat = strConcat + " autoMetadata";
        }
        if (strConcat.isEmpty()) {
            return new L2.h((String) this.f8a, (Integer) this.f9b, (l) this.f10c, ((Long) this.f11d).longValue(), ((Long) this.f12e).longValue(), (HashMap) this.f13f);
        }
        throw new IllegalStateException("Missing required properties:".concat(strConcat));
    }

    public ColorStateList G(Context context, int i) {
        if (i == R.drawable.abc_edit_text_material) {
            return AbstractC0473d.x(context, R.color.abc_tint_edittext);
        }
        if (i == 2131165259) {
            return AbstractC0473d.x(context, R.color.abc_tint_switch_track);
        }
        if (i != R.drawable.abc_switch_thumb_material) {
            if (i == R.drawable.abc_btn_default_mtrl_shape) {
                return E(context, z0.c(context, R.attr.colorButtonNormal));
            }
            if (i == R.drawable.abc_btn_borderless_material) {
                return E(context, 0);
            }
            if (i == R.drawable.abc_btn_colored_material) {
                return E(context, z0.c(context, R.attr.colorAccent));
            }
            if (i == 2131165254 || i == R.drawable.abc_spinner_textfield_background_material) {
                return AbstractC0473d.x(context, R.color.abc_tint_spinner);
            }
            if (C((int[]) this.f9b, i)) {
                return z0.d(context, R.attr.colorControlNormal);
            }
            if (C((int[]) this.f12e, i)) {
                return AbstractC0473d.x(context, R.color.abc_tint_default);
            }
            if (C((int[]) this.f13f, i)) {
                return AbstractC0473d.x(context, R.color.abc_tint_btn_checkable);
            }
            if (i == R.drawable.abc_seekbar_thumb_material) {
                return AbstractC0473d.x(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListD = z0.d(context, R.attr.colorSwitchThumbNormal);
        if (colorStateListD == null || !colorStateListD.isStateful()) {
            iArr[0] = z0.f10186b;
            iArr2[0] = z0.b(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = z0.f10189e;
            iArr2[1] = z0.c(context, R.attr.colorControlActivated);
            iArr[2] = z0.f10190f;
            iArr2[2] = z0.c(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = z0.f10186b;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListD.getColorForState(iArr3, 0);
            iArr[1] = z0.f10189e;
            iArr2[1] = z0.c(context, R.attr.colorControlActivated);
            iArr[2] = z0.f10190f;
            iArr2[2] = colorStateListD.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    @Override // p126x2.y
    public w u() {
        return (w) ((m) this.f9b).getValue();
    }
}

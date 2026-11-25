package androidx.appcompat.view.menu;

import B.C0031p0;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.nanjoran.ilightshow.R;
import h.a;
import p045i1.A;
import p045i1.ViewTreeObserverOnGlobalLayoutListenerC0756q;
import p052k.j;
import p052k.k;
import p052k.r;

/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements r, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public k f6390h;
    public ImageView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public RadioButton f6391j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f6392k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CheckBox f6393l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f6394m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ImageView f6395n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ImageView f6396o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public LinearLayout f6397p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Drawable f6398q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f6399r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Context f6400s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f6401t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Drawable f6402u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f6403v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public LayoutInflater f6404w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f6405x;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0031p0 c0031p0O = C0031p0.o(getContext(), attributeSet, a.f9204n, R.attr.listMenuViewStyle);
        this.f6398q = c0031p0O.h(5);
        TypedArray typedArray = (TypedArray) c0031p0O.f394j;
        this.f6399r = typedArray.getResourceId(1, -1);
        this.f6401t = typedArray.getBoolean(7, false);
        this.f6400s = context;
        this.f6402u = c0031p0O.h(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f6403v = typedArrayObtainStyledAttributes.hasValue(0);
        c0031p0O.p();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f6404w == null) {
            this.f6404w = LayoutInflater.from(getContext());
        }
        return this.f6404w;
    }

    private void setSubMenuArrowVisible(boolean z5) {
        ImageView imageView = this.f6395n;
        if (imageView != null) {
            imageView.setVisibility(z5 ? 0 : 8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0037  */
    /* JADX WARN: Code duplicated, block: B:25:0x005a  */
    /* JADX WARN: Code duplicated, block: B:28:0x005e  */
    @Override // p052k.r
    public final void a(k kVar) {
        boolean z5;
        int i;
        String string;
        boolean z6;
        this.f6390h = kVar;
        setVisibility(kVar.isVisible() ? 0 : 8);
        setTitle(kVar.f9873e);
        setCheckable(kVar.isCheckable());
        if (kVar.f9881n.n()) {
            if ((kVar.f9881n.m() ? kVar.f9877j : kVar.f9876h) != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
        } else {
            z5 = false;
        }
        kVar.f9881n.m();
        if (z5) {
            k kVar2 = this.f6390h;
            if (kVar2.f9881n.n()) {
                if ((kVar2.f9881n.m() ? kVar2.f9877j : kVar2.f9876h) != 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
            } else {
                z6 = false;
            }
            i = z6 ? 0 : 8;
        }
        if (i == 0) {
            TextView textView = this.f6394m;
            k kVar3 = this.f6390h;
            char c6 = kVar3.f9881n.m() ? kVar3.f9877j : kVar3.f9876h;
            if (c6 == 0) {
                string = "";
            } else {
                j jVar = kVar3.f9881n;
                Resources resources = jVar.f9848a.getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(jVar.f9848a).hasPermanentMenuKey()) {
                    sb.append(resources.getString(R.string.abc_prepend_shortcut_label));
                }
                int i3 = jVar.m() ? kVar3.f9878k : kVar3.i;
                k.a(sb, i3, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label));
                k.a(sb, i3, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label));
                k.a(sb, i3, 2, resources.getString(R.string.abc_menu_alt_shortcut_label));
                k.a(sb, i3, 1, resources.getString(R.string.abc_menu_shift_shortcut_label));
                k.a(sb, i3, 4, resources.getString(R.string.abc_menu_sym_shortcut_label));
                k.a(sb, i3, 8, resources.getString(R.string.abc_menu_function_shortcut_label));
                if (c6 == '\b') {
                    sb.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                } else if (c6 == '\n') {
                    sb.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                } else if (c6 != ' ') {
                    sb.append(c6);
                } else {
                    sb.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                }
                string = sb.toString();
            }
            textView.setText(string);
        }
        if (this.f6394m.getVisibility() != i) {
            this.f6394m.setVisibility(i);
        }
        setIcon(kVar.getIcon());
        setEnabled(kVar.isEnabled());
        setSubMenuArrowVisible(kVar.hasSubMenu());
        setContentDescription(kVar.f9884q);
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f6396o;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f6396o.getLayoutParams();
        rect.top = this.f6396o.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    @Override // p052k.r
    public k getItemData() {
        return this.f6390h;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        ViewTreeObserverOnGlobalLayoutListenerC0756q viewTreeObserverOnGlobalLayoutListenerC0756q = A.f9394a;
        setBackground(this.f6398q);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f6392k = textView;
        int i = this.f6399r;
        if (i != -1) {
            textView.setTextAppearance(this.f6400s, i);
        }
        this.f6394m = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f6395n = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f6402u);
        }
        this.f6396o = (ImageView) findViewById(R.id.group_divider);
        this.f6397p = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i3) {
        if (this.i != null && this.f6401t) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.i.getLayoutParams();
            int i6 = layoutParams.height;
            if (i6 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i6;
            }
        }
        super.onMeasure(i, i3);
    }

    public void setCheckable(boolean z5) {
        CompoundButton compoundButton;
        View view;
        if (!z5 && this.f6391j == null && this.f6393l == null) {
            return;
        }
        if ((this.f6390h.f9891x & 4) != 0) {
            if (this.f6391j == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f6391j = radioButton;
                LinearLayout linearLayout = this.f6397p;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f6391j;
            view = this.f6393l;
        } else {
            if (this.f6393l == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f6393l = checkBox;
                LinearLayout linearLayout2 = this.f6397p;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f6393l;
            view = this.f6391j;
        }
        if (z5) {
            compoundButton.setChecked(this.f6390h.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f6393l;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f6391j;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z5) {
        CompoundButton compoundButton;
        if ((this.f6390h.f9891x & 4) != 0) {
            if (this.f6391j == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f6391j = radioButton;
                LinearLayout linearLayout = this.f6397p;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f6391j;
        } else {
            if (this.f6393l == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f6393l = checkBox;
                LinearLayout linearLayout2 = this.f6397p;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f6393l;
        }
        compoundButton.setChecked(z5);
    }

    public void setForceShowIcon(boolean z5) {
        this.f6405x = z5;
        this.f6401t = z5;
    }

    public void setGroupDividerEnabled(boolean z5) {
        ImageView imageView = this.f6396o;
        if (imageView != null) {
            imageView.setVisibility((this.f6403v || !z5) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f6390h.f9881n.getClass();
        boolean z5 = this.f6405x;
        if (z5 || this.f6401t) {
            ImageView imageView = this.i;
            if (imageView == null && drawable == null && !this.f6401t) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.i = imageView2;
                LinearLayout linearLayout = this.f6397p;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f6401t) {
                this.i.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.i;
            if (!z5) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.i.getVisibility() != 0) {
                this.i.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f6392k.getVisibility() != 8) {
                this.f6392k.setVisibility(8);
            }
        } else {
            this.f6392k.setText(charSequence);
            if (this.f6392k.getVisibility() != 0) {
                this.f6392k.setVisibility(0);
            }
        }
    }
}

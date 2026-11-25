package p057l;

import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import com.nanjoran.ilightshow.R;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import p076o1.a;
import p076o1.b;

/* JADX INFO: loaded from: classes.dex */
public final class y0 extends b implements View.OnClickListener {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final /* synthetic */ int f10168E = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f10169A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f10170B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f10171C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f10172D;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f10173o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f10174p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final LayoutInflater f10175q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final SearchView f10176r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final SearchableInfo f10177s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Context f10178t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final WeakHashMap f10179u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f10180v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f10181w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ColorStateList f10182x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f10183y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f10184z;

    public y0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        int suggestionRowLayout = searchView.getSuggestionRowLayout();
        this.i = true;
        this.f10620j = null;
        this.f10619h = false;
        this.f10621k = -1;
        this.f10622l = new a(this);
        this.f10623m = new X(1, this);
        this.f10174p = suggestionRowLayout;
        this.f10173o = suggestionRowLayout;
        this.f10175q = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f10181w = 1;
        this.f10183y = -1;
        this.f10184z = -1;
        this.f10169A = -1;
        this.f10170B = -1;
        this.f10171C = -1;
        this.f10172D = -1;
        this.f10176r = searchView;
        this.f10177s = searchableInfo;
        this.f10180v = searchView.getSuggestionCommitIconResId();
        this.f10178t = context;
        this.f10179u = weakHashMap;
    }

    public static String h(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // p076o1.b
    public final void a(View view, Cursor cursor) {
        Drawable drawableF;
        CharSequence charSequenceH;
        x0 x0Var = (x0) view.getTag();
        int i = this.f10172D;
        int i3 = i != -1 ? cursor.getInt(i) : 0;
        TextView textView = x0Var.f10151a;
        if (textView != null) {
            String strH = h(cursor, this.f10183y);
            textView.setText(strH);
            if (TextUtils.isEmpty(strH)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
            }
        }
        Context context = this.f10178t;
        TextView textView2 = x0Var.f10152b;
        if (textView2 != null) {
            String strH2 = h(cursor, this.f10169A);
            if (strH2 != null) {
                if (this.f10182x == null) {
                    TypedValue typedValue = new TypedValue();
                    context.getTheme().resolveAttribute(R.attr.textColorSearchUrl, typedValue, true);
                    this.f10182x = context.getResources().getColorStateList(typedValue.resourceId);
                }
                SpannableString spannableString = new SpannableString(strH2);
                spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f10182x, null), 0, strH2.length(), 33);
                charSequenceH = spannableString;
            } else {
                charSequenceH = h(cursor, this.f10184z);
            }
            if (TextUtils.isEmpty(charSequenceH)) {
                if (textView != null) {
                    textView.setSingleLine(false);
                    textView.setMaxLines(2);
                }
            } else if (textView != null) {
                textView.setSingleLine(true);
                textView.setMaxLines(1);
            }
            textView2.setText(charSequenceH);
            if (TextUtils.isEmpty(charSequenceH)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
            }
        }
        ImageView imageView = x0Var.f10153c;
        if (imageView != null) {
            int i6 = this.f10170B;
            if (i6 == -1) {
                drawableF = null;
            } else {
                drawableF = f(cursor.getString(i6));
                if (drawableF == null) {
                    ComponentName searchActivity = this.f10177s.getSearchActivity();
                    String strFlattenToShortString = searchActivity.flattenToShortString();
                    WeakHashMap weakHashMap = this.f10179u;
                    if (weakHashMap.containsKey(strFlattenToShortString)) {
                        Drawable.ConstantState constantState = (Drawable.ConstantState) weakHashMap.get(strFlattenToShortString);
                        drawableF = constantState == null ? null : constantState.newDrawable(context.getResources());
                    } else {
                        PackageManager packageManager = context.getPackageManager();
                        try {
                            ActivityInfo activityInfo = packageManager.getActivityInfo(searchActivity, 128);
                            int iconResource = activityInfo.getIconResource();
                            if (iconResource != 0) {
                                Drawable drawable = packageManager.getDrawable(searchActivity.getPackageName(), iconResource, activityInfo.applicationInfo);
                                if (drawable == null) {
                                    searchActivity.flattenToShortString();
                                    drawableF = null;
                                } else {
                                    drawableF = drawable;
                                }
                            } else {
                                drawableF = null;
                            }
                        } catch (PackageManager.NameNotFoundException e6) {
                            e6.toString();
                        }
                        weakHashMap.put(strFlattenToShortString, drawableF == null ? null : drawableF.getConstantState());
                    }
                    if (drawableF == null) {
                        drawableF = context.getPackageManager().getDefaultActivityIcon();
                    }
                }
            }
            imageView.setImageDrawable(drawableF);
            if (drawableF == null) {
                imageView.setVisibility(4);
            } else {
                imageView.setVisibility(0);
                drawableF.setVisible(false, false);
                drawableF.setVisible(true, false);
            }
        }
        ImageView imageView2 = x0Var.f10154d;
        if (imageView2 != null) {
            int i7 = this.f10171C;
            Drawable drawableF2 = i7 == -1 ? null : f(cursor.getString(i7));
            imageView2.setImageDrawable(drawableF2);
            if (drawableF2 == null) {
                imageView2.setVisibility(8);
            } else {
                imageView2.setVisibility(0);
                drawableF2.setVisible(false, false);
                drawableF2.setVisible(true, false);
            }
        }
        int i8 = this.f10181w;
        ImageView imageView3 = x0Var.f10155e;
        if (i8 != 2 && (i8 != 1 || (i3 & 1) == 0)) {
            imageView3.setVisibility(8);
            return;
        }
        imageView3.setVisibility(0);
        imageView3.setTag(textView.getText());
        imageView3.setOnClickListener(this);
    }

    @Override // p076o1.b
    public final void b(Cursor cursor) {
        try {
            super.b(cursor);
            if (cursor != null) {
                this.f10183y = cursor.getColumnIndex("suggest_text_1");
                this.f10184z = cursor.getColumnIndex("suggest_text_2");
                this.f10169A = cursor.getColumnIndex("suggest_text_2_url");
                this.f10170B = cursor.getColumnIndex("suggest_icon_1");
                this.f10171C = cursor.getColumnIndex("suggest_icon_2");
                this.f10172D = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception unused) {
        }
    }

    @Override // p076o1.b
    public final String c(Cursor cursor) {
        String strH;
        String strH2;
        if (cursor == null) {
            return null;
        }
        String strH3 = h(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (strH3 != null) {
            return strH3;
        }
        SearchableInfo searchableInfo = this.f10177s;
        if (searchableInfo.shouldRewriteQueryFromData() && (strH2 = h(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return strH2;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (strH = h(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return strH;
    }

    @Override // p076o1.b
    public final View d(ViewGroup viewGroup) {
        View viewInflate = this.f10175q.inflate(this.f10173o, viewGroup, false);
        viewInflate.setTag(new x0(viewInflate));
        ((ImageView) viewInflate.findViewById(R.id.edit_query)).setImageResource(this.f10180v);
        return viewInflate;
    }

    public final Drawable e(Uri uri) throws FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f10178t.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (identifier != 0) {
                return resourcesForApplication.getDrawable(identifier);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    public final Drawable f(String str) {
        WeakHashMap weakHashMap = this.f10179u;
        Context context = this.f10178t;
        Drawable drawableE = null;
        if (str != null && !str.isEmpty() && !"0".equals(str)) {
            try {
                int i = Integer.parseInt(str);
                String str2 = "android.resource://" + context.getPackageName() + "/" + i;
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakHashMap.get(str2);
                Drawable drawableNewDrawable = constantState == null ? null : constantState.newDrawable();
                if (drawableNewDrawable != null) {
                    return drawableNewDrawable;
                }
                Drawable drawableB = Z0.a.b(context, i);
                if (drawableB != null) {
                    weakHashMap.put(str2, drawableB.getConstantState());
                }
                return drawableB;
            } catch (Resources.NotFoundException unused) {
            } catch (NumberFormatException unused2) {
                Drawable.ConstantState constantState2 = (Drawable.ConstantState) weakHashMap.get(str);
                Drawable drawableNewDrawable2 = constantState2 == null ? null : constantState2.newDrawable();
                if (drawableNewDrawable2 != null) {
                    return drawableNewDrawable2;
                }
                Uri uri = Uri.parse(str);
                try {
                    if ("android.resource".equals(uri.getScheme())) {
                        try {
                            drawableE = e(uri);
                        } catch (Resources.NotFoundException unused3) {
                            throw new FileNotFoundException("Resource does not exist: " + uri);
                        }
                    } else {
                        InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                        if (inputStreamOpenInputStream == null) {
                            throw new FileNotFoundException("Failed to open " + uri);
                        }
                        try {
                            Drawable drawableCreateFromStream = Drawable.createFromStream(inputStreamOpenInputStream, null);
                            try {
                                inputStreamOpenInputStream.close();
                            } catch (IOException unused4) {
                                uri.toString();
                            }
                            drawableE = drawableCreateFromStream;
                        } catch (Throwable th) {
                            try {
                                inputStreamOpenInputStream.close();
                            } catch (IOException unused5) {
                                uri.toString();
                            }
                            throw th;
                        }
                    }
                } catch (FileNotFoundException e6) {
                    Objects.toString(uri);
                    e6.getMessage();
                }
                if (drawableE != null) {
                    weakHashMap.put(str, drawableE.getConstantState());
                }
            }
        }
        return drawableE;
    }

    public final Cursor g(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder builderFragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            builderFragment.appendEncodedPath(suggestPath);
        }
        builderFragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            builderFragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        builderFragment.appendQueryParameter("limit", String.valueOf(50));
        return this.f10178t.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // p076o1.b, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e6) {
            View viewInflate = this.f10175q.inflate(this.f10174p, viewGroup, false);
            if (viewInflate != null) {
                ((x0) viewInflate.getTag()).f10151a.setText(e6.toString());
            }
            return viewInflate;
        }
    }

    @Override // p076o1.b, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e6) {
            View viewD = d(viewGroup);
            ((x0) viewD.getTag()).f10151a.setText(e6.toString());
            return viewD;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = this.f10620j;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f10620j;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f10176r.m((CharSequence) tag);
        }
    }
}

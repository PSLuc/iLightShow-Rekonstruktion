package androidx.appcompat.widget;

import B.C0031p0;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import com.nanjoran.ilightshow.R;
import com.philips.lighting.hue.sdk.wrapper.HueLog;
import java.util.WeakHashMap;
import p045i1.A;
import p045i1.AbstractC0762x;
import p045i1.ViewTreeObserverOnGlobalLayoutListenerC0756q;
import p057l.AbstractC0801m;
import p057l.C0800l0;
import p057l.C0808p0;
import p057l.M0;
import p057l.RunnableC0802m0;
import p057l.S;
import p057l.T;
import p057l.ViewOnFocusChangeListenerC0804n0;
import p057l.ViewOnLayoutChangeListenerC0806o0;
import p057l.q0;
import p057l.r0;
import p057l.s0;
import p057l.t0;
import p057l.v0;
import p057l.w0;
import p057l.y0;

/* JADX INFO: loaded from: classes.dex */
public class SearchView extends S implements j.a {

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final /* synthetic */ int f6468n0 = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final ImageView f6469A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final ImageView f6470B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final ImageView f6471C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final ImageView f6472D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final View f6473E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public w0 f6474F;
    public final Rect G;
    public final Rect H;
    public final int[] I;
    public final int[] J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final ImageView f6475K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final Drawable f6476L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final int f6477M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final int f6478N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final Intent f6479O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final Intent f6480P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final CharSequence f6481Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public View.OnFocusChangeListener f6482R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public View.OnClickListener f6483S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public boolean f6484T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public boolean f6485U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public p076o1.b f6486V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public boolean f6487W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public CharSequence f6488a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f6489b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f6490c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public int f6491d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f6492e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public CharSequence f6493f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public boolean f6494g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public int f6495h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public SearchableInfo f6496i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public Bundle f6497j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final RunnableC0802m0 f6498k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final RunnableC0802m0 f6499l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final WeakHashMap f6500m0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final SearchAutoComplete f6501w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final View f6502x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final View f6503y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final View f6504z;

    public static class SearchAutoComplete extends AbstractC0801m {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f6505l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public SearchView f6506m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f6507n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final d f6508o;

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f6508o = new d(this);
            this.f6505l = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i3 = configuration.screenHeightDp;
            if (i >= 960 && i3 >= 720 && configuration.orientation == 2) {
                return HueLog.LogComponent.STREAMDTLS;
            }
            if (i < 600) {
                return (i < 640 || i3 < 480) ? 160 : 192;
            }
            return 192;
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.f6505l <= 0 || super.enoughToFilter();
        }

        @Override // p057l.AbstractC0801m, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f6507n) {
                d dVar = this.f6508o;
                removeCallbacks(dVar);
                post(dVar);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z5, int i, Rect rect) {
            super.onFocusChanged(z5, i, rect);
            SearchView searchView = this.f6506m;
            searchView.t(searchView.f6485U);
            searchView.post(searchView.f6498k0);
            SearchAutoComplete searchAutoComplete = searchView.f6501w;
            if (searchAutoComplete.hasFocus()) {
                c.a(searchAutoComplete);
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f6506m.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z5) {
            super.onWindowFocusChanged(z5);
            if (z5 && this.f6506m.hasFocus() && getVisibility() == 0) {
                this.f6507n = true;
                Context context = getContext();
                int i = SearchView.f6468n0;
                if (context.getResources().getConfiguration().orientation == 2) {
                    c.b(this, 1);
                    if (enoughToFilter()) {
                        showDropDown();
                    }
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z5) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            d dVar = this.f6508o;
            if (!z5) {
                this.f6507n = false;
                removeCallbacks(dVar);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f6507n = true;
                    return;
                }
                this.f6507n = false;
                removeCallbacks(dVar);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f6506m = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f6505l = i;
        }
    }

    public SearchView(Context context) {
        this(context, null);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        SearchAutoComplete searchAutoComplete = this.f6501w;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.f6490c0 = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.f6501w;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.f6490c0 = false;
    }

    public int getImeOptions() {
        return this.f6501w.getImeOptions();
    }

    public int getInputType() {
        return this.f6501w.getInputType();
    }

    public int getMaxWidth() {
        return this.f6491d0;
    }

    public CharSequence getQuery() {
        return this.f6501w.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f6488a0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f6496i0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f6481Q : getContext().getText(this.f6496i0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f6478N;
    }

    public int getSuggestionRowLayout() {
        return this.f6477M;
    }

    public p076o1.b getSuggestionsAdapter() {
        return this.f6486V;
    }

    public final Intent h(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f6493f0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f6497j0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.f6496i0.getSearchActivity());
        return intent;
    }

    public final Intent i(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f6497j0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void j() {
        SearchAutoComplete searchAutoComplete = this.f6501w;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.f6484T) {
            clearFocus();
            t(true);
        }
    }

    public final void k(int i) {
        String strH;
        Cursor cursor = this.f6486V.f10620j;
        if (cursor != null && cursor.moveToPosition(i)) {
            Intent intentH = null;
            try {
                try {
                    int i3 = y0.f10168E;
                    String strH2 = y0.h(cursor, cursor.getColumnIndex("suggest_intent_action"));
                    if (strH2 == null) {
                        strH2 = this.f6496i0.getSuggestIntentAction();
                    }
                    if (strH2 == null) {
                        strH2 = "android.intent.action.SEARCH";
                    }
                    String strH3 = y0.h(cursor, cursor.getColumnIndex("suggest_intent_data"));
                    if (strH3 == null) {
                        strH3 = this.f6496i0.getSuggestIntentData();
                    }
                    if (strH3 != null && (strH = y0.h(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                        strH3 = strH3 + "/" + Uri.encode(strH);
                    }
                    intentH = h(strH2, strH3 == null ? null : Uri.parse(strH3), y0.h(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), y0.h(cursor, cursor.getColumnIndex("suggest_intent_query")));
                } catch (RuntimeException unused) {
                    cursor.getPosition();
                }
            } catch (RuntimeException unused2) {
            }
            if (intentH != null) {
                try {
                    getContext().startActivity(intentH);
                } catch (RuntimeException unused3) {
                    intentH.toString();
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.f6501w;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void l(int i) {
        Editable text = this.f6501w.getText();
        Cursor cursor = this.f6486V.f10620j;
        if (cursor == null) {
            return;
        }
        if (!cursor.moveToPosition(i)) {
            setQuery(text);
            return;
        }
        String strC = this.f6486V.c(cursor);
        if (strC != null) {
            setQuery(strC);
        } else {
            setQuery(text);
        }
    }

    public final void m(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public final void n() {
        SearchAutoComplete searchAutoComplete = this.f6501w;
        Editable text = searchAutoComplete.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.f6496i0 != null) {
            getContext().startActivity(h("android.intent.action.SEARCH", null, null, text.toString()));
        }
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void o() {
        boolean zIsEmpty = TextUtils.isEmpty(this.f6501w.getText());
        int i = (!zIsEmpty || (this.f6484T && !this.f6494g0)) ? 0 : 8;
        ImageView imageView = this.f6471C;
        imageView.setVisibility(i);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(!zIsEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f6498k0);
        post(this.f6499l0);
        super.onDetachedFromWindow();
    }

    @Override // p057l.S, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i, int i3, int i6, int i7) {
        super.onLayout(z5, i, i3, i6, i7);
        if (z5) {
            int[] iArr = this.I;
            SearchAutoComplete searchAutoComplete = this.f6501w;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.J;
            getLocationInWindow(iArr2);
            int i8 = iArr[1] - iArr2[1];
            int i9 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i9;
            int height = searchAutoComplete.getHeight() + i8;
            Rect rect = this.G;
            rect.set(i9, i8, width, height);
            int i10 = rect.left;
            int i11 = rect.right;
            int i12 = i7 - i3;
            Rect rect2 = this.H;
            rect2.set(i10, 0, i11, i12);
            w0 w0Var = this.f6474F;
            if (w0Var == null) {
                w0 w0Var2 = new w0(rect2, rect, searchAutoComplete);
                this.f6474F = w0Var2;
                setTouchDelegate(w0Var2);
            } else {
                w0Var.f10146b.set(rect2);
                Rect rect3 = w0Var.f10148d;
                rect3.set(rect2);
                int i13 = -w0Var.f10149e;
                rect3.inset(i13, i13);
                w0Var.f10147c.set(rect);
            }
        }
    }

    @Override // p057l.S, android.view.View
    public final void onMeasure(int i, int i3) {
        int i6;
        if (this.f6485U) {
            super.onMeasure(i, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            int i7 = this.f6491d0;
            size = i7 > 0 ? Math.min(i7, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f6491d0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i6 = this.f6491d0) > 0) {
            size = Math.min(i6, size);
        }
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof v0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        v0 v0Var = (v0) parcelable;
        super.onRestoreInstanceState(v0Var.f11210h);
        t(v0Var.f10144j);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        v0 v0Var = new v0(super.onSaveInstanceState());
        v0Var.f10144j = this.f6485U;
        return v0Var;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z5) {
        super.onWindowFocusChanged(z5);
        post(this.f6498k0);
    }

    public final void p() {
        int[] iArr = this.f6501w.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f6503y.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f6504z.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void q() {
        CharSequence queryHint = getQueryHint();
        CharSequence charSequence = queryHint;
        if (queryHint == null) {
            charSequence = "";
        }
        boolean z5 = this.f6484T;
        SearchAutoComplete searchAutoComplete = this.f6501w;
        CharSequence charSequence2 = charSequence;
        if (z5) {
            Drawable drawable = this.f6476L;
            charSequence2 = charSequence;
            if (drawable != null) {
                int textSize = (int) (((double) searchAutoComplete.getTextSize()) * 1.25d);
                drawable.setBounds(0, 0, textSize, textSize);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
                spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
                spannableStringBuilder.append(charSequence);
                charSequence2 = spannableStringBuilder;
            }
        }
        searchAutoComplete.setHint(charSequence2);
    }

    public final void r() {
        this.f6504z.setVisibility(((this.f6487W || this.f6492e0) && !this.f6485U && (this.f6470B.getVisibility() == 0 || this.f6472D.getVisibility() == 0)) ? 0 : 8);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        if (this.f6490c0 || !isFocusable()) {
            return false;
        }
        if (this.f6485U) {
            return super.requestFocus(i, rect);
        }
        boolean zRequestFocus = this.f6501w.requestFocus(i, rect);
        if (zRequestFocus) {
            t(false);
        }
        return zRequestFocus;
    }

    public final void s(boolean z5) {
        boolean z6 = this.f6487W;
        this.f6470B.setVisibility((!z6 || !(z6 || this.f6492e0) || this.f6485U || !hasFocus() || (!z5 && this.f6492e0)) ? 8 : 0);
    }

    public void setAppSearchData(Bundle bundle) {
        this.f6497j0 = bundle;
    }

    public void setIconified(boolean z5) {
        if (z5) {
            j();
            return;
        }
        t(false);
        SearchAutoComplete searchAutoComplete = this.f6501w;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f6483S;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z5) {
        if (this.f6484T == z5) {
            return;
        }
        this.f6484T = z5;
        t(z5);
        q();
    }

    public void setImeOptions(int i) {
        this.f6501w.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.f6501w.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.f6491d0 = i;
        requestLayout();
    }

    public void setOnCloseListener(r0 r0Var) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f6482R = onFocusChangeListener;
    }

    public void setOnQueryTextListener(s0 s0Var) {
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f6483S = onClickListener;
    }

    public void setOnSuggestionListener(t0 t0Var) {
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f6488a0 = charSequence;
        q();
    }

    public void setQueryRefinementEnabled(boolean z5) {
        this.f6489b0 = z5;
        p076o1.b bVar = this.f6486V;
        if (bVar instanceof y0) {
            ((y0) bVar).f10181w = z5 ? 2 : 1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0098  */
    public void setSearchableInfo(SearchableInfo searchableInfo) {
        boolean z5;
        this.f6496i0 = searchableInfo;
        Intent intent = null;
        SearchAutoComplete searchAutoComplete = this.f6501w;
        if (searchableInfo != null) {
            searchAutoComplete.setThreshold(searchableInfo.getSuggestThreshold());
            searchAutoComplete.setImeOptions(this.f6496i0.getImeOptions());
            int inputType = this.f6496i0.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.f6496i0.getSuggestAuthority() != null) {
                    inputType |= 589824;
                }
            }
            searchAutoComplete.setInputType(inputType);
            p076o1.b bVar = this.f6486V;
            if (bVar != null) {
                bVar.b(null);
            }
            if (this.f6496i0.getSuggestAuthority() != null) {
                y0 y0Var = new y0(getContext(), this, this.f6496i0, this.f6500m0);
                this.f6486V = y0Var;
                searchAutoComplete.setAdapter(y0Var);
                ((y0) this.f6486V).f10181w = this.f6489b0 ? 2 : 1;
            }
            q();
        }
        SearchableInfo searchableInfo2 = this.f6496i0;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.f6496i0.getVoiceSearchLaunchWebSearch()) {
                intent = this.f6479O;
            } else if (this.f6496i0.getVoiceSearchLaunchRecognizer()) {
                intent = this.f6480P;
            }
            z5 = (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
        }
        this.f6492e0 = z5;
        if (z5) {
            searchAutoComplete.setPrivateImeOptions("nm");
        }
        t(this.f6485U);
    }

    public void setSubmitButtonEnabled(boolean z5) {
        this.f6487W = z5;
        t(this.f6485U);
    }

    public void setSuggestionsAdapter(p076o1.b bVar) {
        this.f6486V = bVar;
        this.f6501w.setAdapter(bVar);
    }

    public final void t(boolean z5) {
        this.f6485U = z5;
        int i = 8;
        int i3 = z5 ? 0 : 8;
        boolean zIsEmpty = TextUtils.isEmpty(this.f6501w.getText());
        this.f6469A.setVisibility(i3);
        s(!zIsEmpty);
        this.f6502x.setVisibility(z5 ? 8 : 0);
        ImageView imageView = this.f6475K;
        imageView.setVisibility((imageView.getDrawable() == null || this.f6484T) ? 8 : 0);
        o();
        if (this.f6492e0 && !this.f6485U && zIsEmpty) {
            this.f6470B.setVisibility(8);
            i = 0;
        }
        this.f6472D.setVisibility(i);
        r();
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.G = new Rect();
        this.H = new Rect();
        this.I = new int[2];
        this.J = new int[2];
        this.f6498k0 = new RunnableC0802m0(this, 0);
        int i3 = 1;
        this.f6499l0 = new RunnableC0802m0(this, i3);
        this.f6500m0 = new WeakHashMap();
        a aVar = new a(this);
        b bVar = new b(this);
        C0808p0 c0808p0 = new C0808p0(this);
        q0 q0Var = new q0(this);
        T t6 = new T(i3, this);
        C0800l0 c0800l0 = new C0800l0(this);
        int[] iArr = h.a.f9207q;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        C0031p0 c0031p0 = new C0031p0(context, typedArrayObtainStyledAttributes);
        ViewTreeObserverOnGlobalLayoutListenerC0756q viewTreeObserverOnGlobalLayoutListenerC0756q = A.f9394a;
        AbstractC0762x.d(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        LayoutInflater.from(context).inflate(typedArrayObtainStyledAttributes.getResourceId(9, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.f6501w = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f6502x = findViewById(R.id.search_edit_frame);
        View viewFindViewById = findViewById(R.id.search_plate);
        this.f6503y = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.submit_area);
        this.f6504z = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.f6469A = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.f6470B = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.f6471C = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.f6472D = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.f6475K = imageView5;
        viewFindViewById.setBackground(c0031p0.h(10));
        viewFindViewById2.setBackground(c0031p0.h(14));
        imageView.setImageDrawable(c0031p0.h(13));
        imageView2.setImageDrawable(c0031p0.h(7));
        imageView3.setImageDrawable(c0031p0.h(4));
        imageView4.setImageDrawable(c0031p0.h(16));
        imageView5.setImageDrawable(c0031p0.h(13));
        this.f6476L = c0031p0.h(12);
        M0.a(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.f6477M = typedArrayObtainStyledAttributes.getResourceId(15, R.layout.abc_search_dropdown_item_icons_2line);
        this.f6478N = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        imageView.setOnClickListener(aVar);
        imageView3.setOnClickListener(aVar);
        imageView2.setOnClickListener(aVar);
        imageView4.setOnClickListener(aVar);
        searchAutoComplete.setOnClickListener(aVar);
        searchAutoComplete.addTextChangedListener(c0800l0);
        searchAutoComplete.setOnEditorActionListener(c0808p0);
        searchAutoComplete.setOnItemClickListener(q0Var);
        searchAutoComplete.setOnItemSelectedListener(t6);
        searchAutoComplete.setOnKeyListener(bVar);
        searchAutoComplete.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0804n0(this));
        setIconifiedByDefault(typedArrayObtainStyledAttributes.getBoolean(8, true));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.f6481Q = typedArrayObtainStyledAttributes.getText(6);
        this.f6488a0 = typedArrayObtainStyledAttributes.getText(11);
        int i6 = typedArrayObtainStyledAttributes.getInt(3, -1);
        if (i6 != -1) {
            setImeOptions(i6);
        }
        int i7 = typedArrayObtainStyledAttributes.getInt(2, -1);
        if (i7 != -1) {
            setInputType(i7);
        }
        setFocusable(typedArrayObtainStyledAttributes.getBoolean(0, true));
        c0031p0.p();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f6479O = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f6480P = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f6473E = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0806o0(this));
        }
        t(this.f6484T);
        q();
    }
}

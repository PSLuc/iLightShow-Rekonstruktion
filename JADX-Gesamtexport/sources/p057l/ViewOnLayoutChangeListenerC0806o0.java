package p057l;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import com.nanjoran.ilightshow.R;

/* JADX INFO: renamed from: l.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC0806o0 implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchView f10131a;

    public ViewOnLayoutChangeListenerC0806o0(SearchView searchView) {
        this.f10131a = searchView;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i3, int i6, int i7, int i8, int i9, int i10, int i11) {
        int dimensionPixelSize;
        SearchView searchView = this.f10131a;
        View view2 = searchView.f6473E;
        if (view2.getWidth() > 1) {
            Resources resources = searchView.getContext().getResources();
            int paddingLeft = searchView.f6503y.getPaddingLeft();
            Rect rect = new Rect();
            boolean zA = P0.a(searchView);
            if (searchView.f6484T) {
                dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width);
            } else {
                dimensionPixelSize = 0;
            }
            SearchView.SearchAutoComplete searchAutoComplete = searchView.f6501w;
            searchAutoComplete.getDropDownBackground().getPadding(rect);
            searchAutoComplete.setDropDownHorizontalOffset(zA ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
            searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }
}

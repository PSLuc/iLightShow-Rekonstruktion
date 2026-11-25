package p057l;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: loaded from: classes.dex */
public final class T implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f10034h;
    public final /* synthetic */ Object i;

    public /* synthetic */ T(int i, Object obj) {
        this.f10034h = i;
        this.i = obj;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j4) {
        C0786e0 c0786e0;
        switch (this.f10034h) {
            case 0:
                if (i != -1 && (c0786e0 = ((C0788f0) this.i).f10054j) != null) {
                    c0786e0.setListSelectionHidden(false);
                    break;
                }
                break;
            default:
                ((SearchView) this.i).l(i);
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int i = this.f10034h;
    }
}

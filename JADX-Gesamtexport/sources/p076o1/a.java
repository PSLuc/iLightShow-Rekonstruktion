package p076o1;

import R4.b;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import p057l.y0;
import p084p4.x;

/* JADX INFO: loaded from: classes.dex */
public final class a extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10617a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10618b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Handler handler) {
        super(handler);
        this.f10618b = bVar;
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        switch (this.f10617a) {
            case 0:
                return true;
            default:
                return super.deliverSelfNotifications();
        }
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z5, Uri uri) {
        switch (this.f10617a) {
            case 1:
                ((b) this.f10618b).j(x.f10867a);
                break;
            default:
                super.onChange(z5, uri);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(y0 y0Var) {
        super(new Handler());
        this.f10618b = y0Var;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z5) {
        Cursor cursor;
        switch (this.f10617a) {
            case 0:
                y0 y0Var = (y0) this.f10618b;
                if (y0Var.i && (cursor = y0Var.f10620j) != null && !cursor.isClosed()) {
                    y0Var.f10619h = y0Var.f10620j.requery();
                    break;
                }
                break;
            default:
                super.onChange(z5);
                break;
        }
    }
}

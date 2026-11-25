package I1;

import B.C0025m0;
import android.content.Intent;
import android.content.IntentSender;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1810h;
    public final /* synthetic */ int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f1811j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f1812k;

    public /* synthetic */ a(int i, int i3, Object obj, Object obj2) {
        this.f1810h = i3;
        this.f1811j = obj;
        this.i = i;
        this.f1812k = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1810h) {
            case 0:
                ((e) ((b) this.f1811j).f1816d).b(this.i, (Serializable) this.f1812k);
                break;
            case 1:
                L3.c cVar = (L3.c) this.f1811j;
                L3.d dVar = (L3.d) this.f1812k;
                int i = this.i;
                E4.k.f("this$0", cVar);
                if (cVar.f3092c) {
                    cVar.b(dVar, i - 1);
                }
                break;
            case 2:
                p012c.l lVar = (p012c.l) this.f1811j;
                E4.k.f("this$0", lVar);
                Serializable serializable = (Serializable) ((C0025m0) this.f1812k).i;
                String str = (String) lVar.f7146a.get(Integer.valueOf(this.i));
                if (str != null) {
                    p029f.d dVar2 = (p029f.d) lVar.f7150e.get(str);
                    if ((dVar2 != null ? dVar2.f8819a : null) != null) {
                        p029f.b bVar = dVar2.f8819a;
                        if (lVar.f7149d.remove(str)) {
                            bVar.a(serializable);
                        }
                    } else {
                        lVar.f7152g.remove(str);
                        lVar.f7151f.put(str, serializable);
                    }
                    break;
                }
                break;
            default:
                p012c.l lVar2 = (p012c.l) this.f1811j;
                E4.k.f("this$0", lVar2);
                IntentSender.SendIntentException sendIntentException = (IntentSender.SendIntentException) this.f1812k;
                E4.k.f("$e", sendIntentException);
                lVar2.a(this.i, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", sendIntentException));
                break;
        }
    }

    public /* synthetic */ a(L3.c cVar, L3.d dVar, int i) {
        this.f1810h = 1;
        this.f1811j = cVar;
        this.f1812k = dVar;
        this.i = i;
    }
}

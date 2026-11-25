package R2;

import B.C0031p0;
import F.C0074p;
import K.y;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import c5.C0495p;
import com.google.android.gms.internal.play_billing.G;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.google.android.play.core.review.ReviewException;
import com.nanjoran.ilightshow.MainActivity;
import com.nanjoran.ilightshow.Services.r0;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import v5.q;
import w5.C1059q;
import w5.C1064w;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements T2.a, S2.f, p060l3.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4785h;
    public final /* synthetic */ Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f4786j;

    public /* synthetic */ j(Object obj, int i, Object obj2) {
        this.f4785h = i;
        this.i = obj;
        this.f4786j = obj2;
    }

    public void a(Z3.a aVar) {
        S3.b bVar;
        q qVar = (q) this.i;
        E4.k.f("$this_broadcast", qVar);
        C1059q c1059q = (C1059q) this.f4786j;
        InetAddress inetAddress = x5.a.f14146a;
        v5.h hVarA = x5.a.a(c1059q, qVar.f13370h, (byte) 0);
        C1064w c1064w = hVarA.f13321a;
        c1064w.f13667d = 0L;
        c1064w.f13665b = (short) 13312;
        if (!qVar.a(new y5.c(hVarA, x5.a.f14146a))) {
            aVar.b(new G());
            return;
        }
        Object obj = aVar.get();
        V3.a aVar2 = V3.a.f5508h;
        if (obj == aVar2 || (bVar = (S3.b) aVar.getAndSet(aVar2)) == aVar2) {
            return;
        }
        try {
            Y3.a aVar3 = aVar.f6081h;
            aVar3.getClass();
            try {
                ((C0074p) aVar3.f5919j).getClass();
            } catch (Throwable th) {
                p027e3.a.w0(th);
                G4.a.A(th);
            }
            aVar3.lazySet(aVar2);
            if (bVar != null) {
                bVar.a();
            }
        } catch (Throwable th2) {
            if (bVar != null) {
                bVar.a();
            }
            throw th2;
        }
    }

    @Override // S2.f
    public Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        S2.h hVar = (S2.h) this.i;
        S2.a aVar = hVar.f5004k;
        int i = aVar.f4990b;
        L2.i iVar = (L2.i) this.f4786j;
        ArrayList arrayListO = hVar.o(sQLiteDatabase, iVar, i);
        for (I2.c cVar : I2.c.values()) {
            if (cVar != iVar.f3067c) {
                int size = aVar.f4990b - arrayListO.size();
                if (size <= 0) {
                    break;
                }
                C0031p0 c0031p0A = L2.i.a();
                c0031p0A.t(iVar.f3065a);
                if (cVar == null) {
                    throw new NullPointerException("Null priority");
                }
                c0031p0A.f395k = cVar;
                c0031p0A.f394j = iVar.f3066b;
                arrayListO.addAll(hVar.o(sQLiteDatabase, c0031p0A.b(), size));
            }
        }
        HashMap map = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i3 = 0; i3 < arrayListO.size(); i3++) {
            sb.append(((S2.b) arrayListO.get(i3)).f4994a);
            if (i3 < arrayListO.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        Cursor cursorQuery = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                long j4 = cursorQuery.getLong(0);
                Set hashSet = (Set) map.get(Long.valueOf(j4));
                if (hashSet == null) {
                    hashSet = new HashSet();
                    map.put(Long.valueOf(j4), hashSet);
                }
                hashSet.add(new S2.g(cursorQuery.getString(1), cursorQuery.getString(2)));
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }
        cursorQuery.close();
        ListIterator listIterator = arrayListO.listIterator();
        while (listIterator.hasNext()) {
            S2.b bVar = (S2.b) listIterator.next();
            if (map.containsKey(Long.valueOf(bVar.f4994a))) {
                A0.b bVarC = bVar.f4996c.c();
                long j6 = bVar.f4994a;
                for (S2.g gVar : (Set) map.get(Long.valueOf(j6))) {
                    bVarC.A(gVar.f4999a, gVar.f5000b);
                }
                listIterator.set(new S2.b(j6, bVar.f4995b, bVarC.D()));
            }
        }
        return arrayListO;
    }

    @Override // T2.a
    public Object execute() {
        switch (this.f4785h) {
            case 0:
                S2.h hVar = (S2.h) ((l) this.i).f4791c;
                hVar.getClass();
                Iterable iterable = (Iterable) this.f4786j;
                if (iterable.iterator().hasNext()) {
                    hVar.b().compileStatement("DELETE FROM events WHERE _id in " + S2.h.C(iterable)).execute();
                    break;
                }
                break;
            default:
                l lVar = (l) this.i;
                lVar.getClass();
                for (Map.Entry entry : ((HashMap) this.f4786j).entrySet()) {
                    ((S2.h) lVar.i).s(((Integer) entry.getValue()).intValue(), O2.c.INVALID_PAYLOD, (String) entry.getKey());
                }
                break;
        }
        return null;
    }

    @Override // p060l3.a
    public void h(y yVar) {
        Exception exc;
        C0495p c0495p = (C0495p) this.i;
        E4.k.f("$manager", c0495p);
        MainActivity mainActivity = (MainActivity) this.f4786j;
        E4.k.f("task", yVar);
        if (!yVar.g()) {
            synchronized (yVar.f2032c) {
                exc = (Exception) yVar.f2034e;
            }
            E4.k.d("null cannot be cast to non-null type com.google.android.play.core.review.ReviewException", exc);
            int i = ((ReviewException) exc).f7774h.f7777h;
            return;
        }
        p066m3.b bVar = (p066m3.b) ((p066m3.a) yVar.f());
        if (bVar.i) {
            new y().j();
        } else {
            Intent intent = new Intent(mainActivity, (Class<?>) PlayCoreDialogWrapperActivity.class);
            intent.putExtra("confirmation_intent", bVar.f10410h);
            intent.putExtra("window_flags", mainActivity.getWindow().getDecorView().getWindowSystemUiVisibility());
            intent.putExtra("result_receiver", new p066m3.c((Handler) c0495p.f7476j, new p060l3.b()));
            mainActivity.startActivity(intent);
        }
        r0.f8474e = true;
    }
}

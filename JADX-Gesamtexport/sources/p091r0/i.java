package p091r0;

import android.view.MotionEvent;
import c5.C0495p;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f11494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11496c;

    /* JADX WARN: Code duplicated, block: B:29:0x0052  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    public i(List list, C0495p c0495p) {
        this.f11494a = list;
        MotionEvent motionEvent = c0495p != null ? (MotionEvent) ((C0495p) c0495p.f7476j).f7476j : null;
        int i = 0;
        this.f11495b = motionEvent != null ? motionEvent.getButtonState() : 0;
        MotionEvent motionEvent2 = c0495p != null ? (MotionEvent) ((C0495p) c0495p.f7476j).f7476j : null;
        if (motionEvent2 != null) {
            motionEvent2.getMetaState();
        }
        MotionEvent motionEvent3 = c0495p != null ? (MotionEvent) ((C0495p) c0495p.f7476j).f7476j : null;
        if (motionEvent3 != null) {
            int actionMasked = motionEvent3.getActionMasked();
            if (actionMasked == 0) {
                i = 1;
            } else if (actionMasked == 1) {
                i = 2;
            } else if (actionMasked != 2) {
                switch (actionMasked) {
                    case 5:
                        i = 1;
                        break;
                    case 6:
                        i = 2;
                        break;
                    case 7:
                        i = 3;
                        break;
                    case 8:
                        i = 6;
                        break;
                    case 9:
                        i = 4;
                        break;
                    case 10:
                        i = 5;
                        break;
                }
            } else {
                i = 3;
            }
        } else {
            int size = list.size();
            while (true) {
                if (i < size) {
                    q qVar = (q) list.get(i);
                    if (o.c(qVar)) {
                        i = 2;
                    } else if (o.a(qVar)) {
                        i = 1;
                    } else {
                        i++;
                    }
                } else {
                    i = 3;
                }
            }
        }
        this.f11496c = i;
    }
}

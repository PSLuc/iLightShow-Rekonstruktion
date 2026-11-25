package p091r0;

import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import c5.C0495p;
import java.util.ArrayList;
import p030f0.c;
import p130y0.r;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f11479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseLongArray f11480b = new SparseLongArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseBooleanArray f11481c = new SparseBooleanArray();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f11482d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11483e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f11484f = -1;

    /* JADX WARN: Code duplicated, block: B:19:0x0044  */
    /* JADX WARN: Code duplicated, block: B:75:0x0139  */
    public final C0495p a(MotionEvent motionEvent, r rVar) {
        long j4;
        int i;
        int i3;
        long jValueAt;
        long jA;
        long jB;
        int i6;
        int actionMasked = motionEvent.getActionMasked();
        SparseLongArray sparseLongArray = this.f11480b;
        SparseBooleanArray sparseBooleanArray = this.f11481c;
        int i7 = 3;
        if (actionMasked == 3 || actionMasked == 4) {
            sparseLongArray.clear();
            sparseBooleanArray.clear();
            return null;
        }
        if (motionEvent.getPointerCount() == 1) {
            int toolType = motionEvent.getToolType(0);
            int source = motionEvent.getSource();
            if (toolType != this.f11483e || source != this.f11484f) {
                this.f11483e = toolType;
                this.f11484f = source;
                sparseBooleanArray.clear();
                sparseLongArray.clear();
            }
        }
        int actionMasked2 = motionEvent.getActionMasked();
        if (actionMasked2 == 0 || actionMasked2 == 5) {
            j4 = 1;
            int actionIndex = motionEvent.getActionIndex();
            int pointerId = motionEvent.getPointerId(actionIndex);
            if (sparseLongArray.indexOfKey(pointerId) < 0) {
                long j6 = this.f11479a;
                this.f11479a = j6 + 1;
                sparseLongArray.put(pointerId, j6);
                if (motionEvent.getToolType(actionIndex) == 3) {
                    sparseBooleanArray.put(pointerId, true);
                }
            }
        } else if (actionMasked2 != 9) {
            j4 = 1;
        } else {
            int pointerId2 = motionEvent.getPointerId(0);
            if (sparseLongArray.indexOfKey(pointerId2) < 0) {
                long j7 = this.f11479a;
                j4 = 1;
                this.f11479a = j7 + 1;
                sparseLongArray.put(pointerId2, j7);
            } else {
                j4 = 1;
            }
        }
        boolean z5 = actionMasked == 9 || actionMasked == 7 || actionMasked == 10;
        boolean z6 = actionMasked == 8;
        if (z5) {
            i = 1;
            sparseBooleanArray.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        } else {
            i = 1;
        }
        int actionIndex2 = actionMasked != i ? actionMasked != 6 ? -1 : motionEvent.getActionIndex() : 0;
        ArrayList arrayList = this.f11482d;
        arrayList.clear();
        int pointerCount = motionEvent.getPointerCount();
        int i8 = 0;
        while (i8 < pointerCount) {
            boolean z7 = (z5 || i8 == actionIndex2 || (z6 && motionEvent.getButtonState() == 0)) ? false : true;
            int pointerId3 = motionEvent.getPointerId(i8);
            int iIndexOfKey = sparseLongArray.indexOfKey(pointerId3);
            if (iIndexOfKey >= 0) {
                jValueAt = sparseLongArray.valueAt(iIndexOfKey);
            } else {
                long j8 = this.f11479a;
                this.f11479a = j8 + j4;
                sparseLongArray.put(pointerId3, j8);
                jValueAt = j8;
            }
            float pressure = motionEvent.getPressure(i8);
            long jA2 = c.a(p081p0.c.y(motionEvent.getX(i8), motionEvent.getY(i8)), 0.0f, i7);
            if (i8 == 0) {
                jA = p081p0.c.y(motionEvent.getRawX(), motionEvent.getRawY());
                jB = rVar.B(jA);
            } else {
                jA = f.f11485a.a(motionEvent, i8);
                jB = rVar.B(jA);
            }
            long j9 = jA;
            long j10 = jB;
            int toolType2 = motionEvent.getToolType(i8);
            if (toolType2 == 0) {
                i6 = 0;
            } else if (toolType2 == 1) {
                i6 = 1;
            } else if (toolType2 == 2) {
                i6 = i7;
            } else if (toolType2 == i7) {
                i6 = 2;
            } else if (toolType2 != 4) {
                i6 = 0;
            } else {
                i6 = 4;
            }
            ArrayList arrayList2 = new ArrayList(motionEvent.getHistorySize());
            int historySize = motionEvent.getHistorySize();
            for (int i9 = 0; i9 < historySize; i9++) {
                float historicalX = motionEvent.getHistoricalX(i8, i9);
                float historicalY = motionEvent.getHistoricalY(i8, i9);
                if (!Float.isInfinite(historicalX) && !Float.isNaN(historicalX) && !Float.isInfinite(historicalY) && !Float.isNaN(historicalY)) {
                    long jY = p081p0.c.y(historicalX, historicalY);
                    arrayList2.add(new c(motionEvent.getHistoricalEventTime(i9), jY, jY));
                }
            }
            arrayList.add(new s(jValueAt, motionEvent.getEventTime(), j9, j10, z7, pressure, i6, sparseBooleanArray.get(motionEvent.getPointerId(i8), false), arrayList2, motionEvent.getActionMasked() == 8 ? p081p0.c.y(motionEvent.getAxisValue(10), (-motionEvent.getAxisValue(9)) + 0.0f) : 0L, jA2));
            i8++;
            z6 = z6;
            z5 = z5;
            i7 = 3;
        }
        int actionMasked3 = motionEvent.getActionMasked();
        if (actionMasked3 == 1 || actionMasked3 == 6) {
            int pointerId4 = motionEvent.getPointerId(motionEvent.getActionIndex());
            i3 = 0;
            if (!sparseBooleanArray.get(pointerId4, false)) {
                sparseLongArray.delete(pointerId4);
                sparseBooleanArray.delete(pointerId4);
            }
        } else {
            i3 = 0;
        }
        if (sparseLongArray.size() > motionEvent.getPointerCount()) {
            for (int size = sparseLongArray.size() - 1; -1 < size; size--) {
                int iKeyAt = sparseLongArray.keyAt(size);
                int pointerCount2 = motionEvent.getPointerCount();
                int i10 = i3;
                while (true) {
                    if (i10 >= pointerCount2) {
                        sparseLongArray.removeAt(size);
                        sparseBooleanArray.delete(iKeyAt);
                        break;
                    }
                    if (motionEvent.getPointerId(i10) == iKeyAt) {
                        break;
                    }
                    i10++;
                }
            }
        }
        motionEvent.getEventTime();
        return new C0495p(arrayList, 20, motionEvent);
    }
}

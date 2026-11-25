package D0;

import H0.t;
import H0.y;
import S1.V;
import p084p4.x;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f749c;

    public j(int i, f fVar) {
        this.f747a = i;
        this.f749c = fVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    public float a(int i, boolean z5, boolean z6, boolean z7) {
        boolean z8;
        int i3 = 1;
        y yVar = (y) this.f749c;
        if (z5) {
            int iC = t.c(yVar.f1734e, i, z5);
            int lineStart = yVar.f1734e.getLineStart(iC);
            int iF = yVar.f(iC);
            if (i == lineStart || i == iF) {
                z8 = true;
            } else {
                z8 = false;
            }
        } else {
            z8 = false;
        }
        int i6 = i * 4;
        if (!z7) {
            i3 = z8 ? 2 : 3;
        } else if (z8) {
            i3 = 0;
        }
        int i7 = i6 + i3;
        if (this.f747a == i7) {
            return this.f748b;
        }
        float fH = z7 ? yVar.h(i, z5) : yVar.i(i, z5);
        if (z6) {
            this.f747a = i7;
            this.f748b = fH;
        }
        return fH;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(float f6, p122w4.c cVar) {
        i iVar;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i = iVar.f746n;
            if ((i & Integer.MIN_VALUE) != 0) {
                iVar.f746n = i - Integer.MIN_VALUE;
            } else {
                iVar = new i(this, cVar);
            }
        } else {
            iVar = new i(this, cVar);
        }
        Object objD = iVar.f744l;
        v4.a aVar = v4.a.f13292h;
        int i3 = iVar.f746n;
        if (i3 == 0) {
            V.O(objD);
            Float f7 = new Float(f6);
            iVar.f743k = this;
            iVar.f746n = 1;
            objD = ((f) this.f749c).d(f7, iVar);
            if (objD == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this = iVar.f743k;
            V.O(objD);
        }
        this.f748b += ((Number) objD).floatValue();
        return x.f10867a;
    }

    public j(y yVar) {
        this.f749c = yVar;
        this.f747a = -1;
    }
}

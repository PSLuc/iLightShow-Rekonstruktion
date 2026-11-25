package S;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class d implements Iterator, F4.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o[] f4858h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f4859j = true;

    public d(n nVar, o[] oVarArr) {
        this.f4858h = oVarArr;
        oVarArr[0].a(Integer.bitCount(nVar.f4875a) * 2, 0, nVar.f4878d);
        this.i = 0;
        a();
    }

    public final void a() {
        int i = this.i;
        o[] oVarArr = this.f4858h;
        o oVar = oVarArr[i];
        if (oVar.f4880j < oVar.i) {
            return;
        }
        while (-1 < i) {
            int iB = b(i);
            if (iB == -1) {
                o oVar2 = oVarArr[i];
                int i3 = oVar2.f4880j;
                Object[] objArr = oVar2.f4879h;
                if (i3 < objArr.length) {
                    int length = objArr.length;
                    oVar2.f4880j = i3 + 1;
                    iB = b(i);
                }
            }
            if (iB != -1) {
                this.i = iB;
                return;
            }
            if (i > 0) {
                o oVar3 = oVarArr[i - 1];
                int i6 = oVar3.f4880j;
                int length2 = oVar3.f4879h.length;
                oVar3.f4880j = i6 + 1;
            }
            oVarArr[i].a(0, 0, n.f4874e.f4878d);
            i--;
        }
        this.f4859j = false;
    }

    public final int b(int i) {
        o[] oVarArr = this.f4858h;
        o oVar = oVarArr[i];
        int i3 = oVar.f4880j;
        if (i3 < oVar.i) {
            return i;
        }
        Object[] objArr = oVar.f4879h;
        if (i3 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i3];
        E4.k.d("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>", obj);
        n nVar = (n) obj;
        if (i == 6) {
            o oVar2 = oVarArr[i + 1];
            Object[] objArr2 = nVar.f4878d;
            oVar2.a(objArr2.length, 0, objArr2);
        } else {
            oVarArr[i + 1].a(Integer.bitCount(nVar.f4875a) * 2, 0, nVar.f4878d);
        }
        return b(i + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4859j;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.f4859j) {
            throw new NoSuchElementException();
        }
        Object next = this.f4858h[this.i].next();
        a();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

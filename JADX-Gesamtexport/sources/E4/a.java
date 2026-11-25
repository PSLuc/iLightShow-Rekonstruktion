package E4;

import java.util.NoSuchElementException;
import p080p.F;

/* JADX INFO: loaded from: classes.dex */
public final class a extends p089q4.y {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1051h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Cloneable f1052j;

    public /* synthetic */ a(Cloneable cloneable, int i) {
        this.f1051h = i;
        this.f1052j = cloneable;
    }

    @Override // p089q4.y
    public final int a() {
        switch (this.f1051h) {
            case 0:
                try {
                    int[] iArr = (int[]) this.f1052j;
                    int i = this.i;
                    this.i = i + 1;
                    return iArr[i];
                } catch (ArrayIndexOutOfBoundsException e6) {
                    this.i--;
                    throw new NoSuchElementException(e6.getMessage());
                }
            default:
                int i3 = this.i;
                this.i = i3 + 1;
                return ((F) this.f1052j).d(i3);
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f1051h) {
            case 0:
                return this.i < ((int[]) this.f1052j).length;
            default:
                return this.i < ((F) this.f1052j).f();
        }
    }
}

package p089q4;

import B.AbstractC0013g0;
import D4.c;
import E4.l;

/* JADX INFO: loaded from: classes.dex */
public final class s extends l implements c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f11235h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(int i) {
        super(1);
        this.f11235h = i;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        ((Number) obj).intValue();
        throw new IndexOutOfBoundsException(AbstractC0013g0.k(new StringBuilder("Collection doesn't contain element at index "), this.f11235h, '.'));
    }
}

package R;

import E4.l;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b extends l implements D4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4707h;
    public final /* synthetic */ Collection i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i, Collection collection) {
        super(1);
        this.f4707h = i;
        this.i = collection;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        switch (this.f4707h) {
            case 0:
                return Boolean.valueOf(this.i.contains(obj));
            case 1:
                return Boolean.valueOf(this.i.contains(obj));
            default:
                return Boolean.valueOf(((List) obj).retainAll(this.i));
        }
    }
}

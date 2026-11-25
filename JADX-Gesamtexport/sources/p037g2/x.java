package p037g2;

import java.util.Map;
import p032f2.r;

/* JADX INFO: loaded from: classes.dex */
public final class x extends y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f9167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f9168d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(y yVar, Object obj, Object obj2, int i) {
        super(yVar, obj);
        this.f9167c = i;
        this.f9168d = obj2;
    }

    @Override // p037g2.y
    public final void a(Object obj) {
        switch (this.f9167c) {
            case 0:
                ((Map) obj).put(this.f9168d, this.f9170b);
                break;
            default:
                ((r) this.f9168d).z(obj, this.f9170b);
                break;
        }
    }
}

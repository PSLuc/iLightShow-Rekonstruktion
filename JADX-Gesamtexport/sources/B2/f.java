package B2;

import java.io.ByteArrayInputStream;

/* JADX INFO: loaded from: classes.dex */
public final class f extends E4.l implements D4.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f502h;
    public final /* synthetic */ ByteArrayInputStream i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(ByteArrayInputStream byteArrayInputStream, int i) {
        super(0);
        this.f502h = i;
        this.i = byteArrayInputStream;
    }

    @Override // D4.a
    public final Object invoke() {
        switch (this.f502h) {
            case 0:
                break;
        }
        return this.i;
    }
}

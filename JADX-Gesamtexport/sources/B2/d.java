package B2;

import java.io.ByteArrayInputStream;

/* JADX INFO: loaded from: classes.dex */
public final class d extends E4.l implements D4.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f497h;
    public final /* synthetic */ byte[] i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(byte[] bArr, int i) {
        super(0);
        this.f497h = i;
        this.i = bArr;
    }

    @Override // D4.a
    public final Object invoke() {
        switch (this.f497h) {
            case 0:
                return new ByteArrayInputStream(this.i);
            case 1:
                return Long.valueOf(this.i.length);
            default:
                return Long.valueOf(this.i.length);
        }
    }
}

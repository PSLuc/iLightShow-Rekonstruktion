package B2;

import com.github.kittinunf.fuel.core.FuelError;
import java.io.ByteArrayInputStream;

/* JADX INFO: loaded from: classes.dex */
public final class c extends E4.l implements D4.a {
    public static final c i = new c(0, 0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final c f495j = new c(0, 1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f496h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i3, int i6) {
        super(i3);
        this.f496h = i6;
    }

    @Override // D4.a
    public final Object invoke() throws FuelError {
        switch (this.f496h) {
            case 0:
                int i3 = FuelError.i;
                throw p126x2.g.b(new IllegalStateException("The input has already been written to an output stream and can not be consumed again."));
            default:
                return new ByteArrayInputStream(new byte[0]);
        }
    }
}

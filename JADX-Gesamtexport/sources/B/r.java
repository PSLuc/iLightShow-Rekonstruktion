package B;

import N.C0247x;
import N.InterfaceC0203a0;
import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class r extends E4.l implements D4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f405h;
    public final /* synthetic */ InterfaceC0203a0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i, InterfaceC0203a0 interfaceC0203a0) {
        super(1);
        this.f405h = i;
        this.i = interfaceC0203a0;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        p084p4.x xVar = p084p4.x.f10867a;
        InterfaceC0203a0 interfaceC0203a0 = this.i;
        switch (this.f405h) {
            case 0:
                E.f fVar = (E.f) obj;
                interfaceC0203a0.setValue(fVar.f871c ? fVar.f870b : fVar.f869a);
                return xVar;
            case 1:
                List list = (List) obj;
                if (interfaceC0203a0 != null) {
                    interfaceC0203a0.setValue(list);
                }
                return xVar;
            case 2:
                ((D4.c) interfaceC0203a0.getValue()).invoke(new p030f0.c(((p030f0.c) obj).f8837a));
                return xVar;
            case 3:
                return (Float) ((D4.c) interfaceC0203a0.getValue()).invoke(Float.valueOf(((Number) obj).floatValue()));
            default:
                Configuration configuration = new Configuration((Configuration) obj);
                C0247x c0247x = AndroidCompositionLocals_androidKt.f6729a;
                interfaceC0203a0.setValue(configuration);
                return xVar;
        }
    }
}

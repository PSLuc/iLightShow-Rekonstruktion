package N3;

import N.C0209d0;
import N.InterfaceC0203a0;
import com.nanjoran.ilightshow.Model.Presets.UMPreset;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.nio.ByteBuffer;
import java.nio.channels.NotYetConnectedException;

/* JADX INFO: renamed from: N3.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0263f implements D4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4171h;
    public final /* synthetic */ Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f4172j;

    public /* synthetic */ C0263f(InterfaceC0203a0 interfaceC0203a0, InterfaceC0203a0 interfaceC0203a1) {
        this.f4171h = 3;
        this.i = interfaceC0203a0;
        this.f4172j = interfaceC0203a1;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        p084p4.x xVar = p084p4.x.f10867a;
        Object obj2 = this.i;
        Object obj3 = this.f4172j;
        switch (this.f4171h) {
            case 0:
                Float f6 = (Float) obj;
                float fFloatValue = f6.floatValue();
                UMPreset uMPreset = (UMPreset) obj3;
                E4.k.f("$currentPreset", uMPreset);
                InterfaceC0203a0 interfaceC0203a0 = (InterfaceC0203a0) obj2;
                E4.k.f("$sliderPosition$delegate", interfaceC0203a0);
                interfaceC0203a0.setValue(f6);
                uMPreset.setAmbientBrightness((int) fFloatValue);
                return xVar;
            case 1:
                D4.a aVar = (D4.a) obj3;
                E4.k.f("$parentSizeProvider", aVar);
                InterfaceC0203a0 interfaceC0203a1 = (InterfaceC0203a0) obj2;
                E4.k.f("$this$offset", (S0.b) obj);
                long j4 = ((S0.j) aVar.invoke()).f4896a;
                float f7 = (int) (j4 >> 32);
                float f8 = (int) (j4 & 4294967295L);
                long jY = p081p0.c.y(f7 / 2.0f, f8 / 2.0f);
                float fMin = Math.min(f7, f8) / 2.0f;
                long jG = p030f0.c.g(((U0) interfaceC0203a1.getValue()).f4128b, jY);
                float fC = p030f0.c.c(jG);
                long jH = fC > fMin ? p030f0.c.h(jY, p030f0.c.i(fMin / fC, jG)) : ((U0) interfaceC0203a1.getValue()).f4128b;
                interfaceC0203a1.setValue(U0.a((U0) interfaceC0203a1.getValue(), 0L, jH, null, 11));
                return new S0.h(S1.h0.c(G4.a.D(p030f0.c.d(jH)), G4.a.D(p030f0.c.e(jH))));
            case 2:
                float fFloatValue2 = ((Float) obj).floatValue();
                D3.j jVar = (D3.j) obj3;
                E4.k.f("$light", jVar);
                C0209d0 c0209d0 = (C0209d0) obj2;
                E4.k.f("$maxPercentage$delegate", c0209d0);
                c0209d0.j(fFloatValue2);
                D3.h hVar = jVar.f806h;
                if (hVar != null) {
                    hVar.f791f = fFloatValue2;
                }
                return xVar;
            case 3:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                InterfaceC0203a0 interfaceC0203a2 = (InterfaceC0203a0) obj2;
                InterfaceC0203a0 interfaceC0203a3 = (InterfaceC0203a0) obj3;
                E4.k.f("$useLegacy$delegate", interfaceC0203a3);
                if (zBooleanValue) {
                    int i = m1.f4225b;
                    interfaceC0203a2.setValue(Boolean.TRUE);
                } else {
                    int i3 = m1.f4225b;
                    interfaceC0203a3.setValue(Boolean.FALSE);
                    com.nanjoran.ilightshow.Services.M.f8305O.G(false);
                }
                return xVar;
            default:
                y5.c cVar = (y5.c) obj;
                y5.e eVar = (y5.e) obj3;
                E4.k.f("this$0", eVar);
                DatagramSocket datagramSocket = (DatagramSocket) obj2;
                try {
                    ByteBuffer byteBufferB = eVar.f14601b.b(cVar.f14596a);
                    datagramSocket.send(new DatagramPacket(byteBufferB.array(), byteBufferB.position(), cVar.f14597b, 56700));
                    break;
                } catch (IOException unused) {
                    datagramSocket.close();
                } catch (NotYetConnectedException unused2) {
                    datagramSocket.close();
                }
                return xVar;
        }
    }

    public /* synthetic */ C0263f(Object obj, int i, Object obj2) {
        this.f4171h = i;
        this.f4172j = obj;
        this.i = obj2;
    }
}

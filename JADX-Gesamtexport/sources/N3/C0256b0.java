package N3;

import N.InterfaceC0203a0;
import com.nanjoran.ilightshow.Services.C0680l;
import com.nanjoran.ilightshow.Services.C0691q;
import com.nanjoran.ilightshow.Services.lights.hue.DeviceHueBridge;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: N3.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0256b0 implements D4.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4153h;
    public final /* synthetic */ InterfaceC0203a0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0203a0 f4154j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f4155k;

    public /* synthetic */ C0256b0(D3.j jVar, InterfaceC0203a0 interfaceC0203a0, InterfaceC0203a0 interfaceC0203a1) {
        this.f4153h = 3;
        this.f4155k = jVar;
        this.i = interfaceC0203a0;
        this.f4154j = interfaceC0203a1;
    }

    @Override // D4.a
    public final Object invoke() {
        List list;
        Object objV;
        D3.h hVar;
        DeviceHueBridge deviceHueBridge = null;
        p084p4.x xVar = p084p4.x.f10867a;
        InterfaceC0203a0 interfaceC0203a0 = this.f4154j;
        InterfaceC0203a0 interfaceC0203a1 = this.i;
        Object obj = this.f4155k;
        switch (this.f4153h) {
            case 0:
                E4.k.f("$text$delegate", interfaceC0203a0);
                InterfaceC0203a0 interfaceC0203a2 = (InterfaceC0203a0) obj;
                J3.e eVar = com.nanjoran.ilightshow.Services.M.f8305O.f8317c;
                if (eVar != null) {
                    interfaceC0203a1.setValue(Boolean.FALSE);
                    String str = (String) interfaceC0203a0.getValue();
                    E4.k.f("ip", str);
                    Pattern patternCompile = Pattern.compile("\\b\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\b");
                    E4.k.e("compile(...)", patternCompile);
                    if (patternCompile.matcher(str).matches()) {
                        String str2 = (String) interfaceC0203a0.getValue();
                        if (str2 != null && (list = eVar.f1932b) != null) {
                            Pattern patternCompile2 = Pattern.compile("\\b\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\b");
                            E4.k.e("compile(...)", patternCompile2);
                            if (patternCompile2.matcher(str2).matches()) {
                                DeviceHueBridge deviceHueBridge2 = new DeviceHueBridge();
                                ListIterator listIterator = list.listIterator();
                                while (true) {
                                    X.y yVar = (X.y) listIterator;
                                    if (yVar.hasNext()) {
                                        K3.a aVar = (K3.a) yVar.next();
                                        E4.k.c(aVar);
                                        if (str2.equals(aVar.ip) && (aVar instanceof DeviceHueBridge)) {
                                            deviceHueBridge2 = (DeviceHueBridge) aVar;
                                        }
                                    } else {
                                        deviceHueBridge2.ip = str2;
                                        deviceHueBridge2.type = K3.d.i;
                                        deviceHueBridge2.delegate = eVar;
                                        deviceHueBridge2.name = "Hue Bridge";
                                        if (!list.contains(deviceHueBridge2)) {
                                            list.add(deviceHueBridge2);
                                        }
                                        com.nanjoran.ilightshow.Services.M m6 = eVar.f1936f;
                                        if (m6 != null) {
                                            m6.t(list, eVar.f1933c, eVar);
                                        }
                                        deviceHueBridge = deviceHueBridge2;
                                    }
                                }
                            }
                        }
                        interfaceC0203a2.setValue(deviceHueBridge);
                    }
                }
                break;
            case 1:
                E4.k.f("$text$delegate", interfaceC0203a1);
                E4.k.f("$presetCreationError$delegate", interfaceC0203a0);
                InterfaceC0203a0 interfaceC0203a3 = (InterfaceC0203a0) obj;
                try {
                    C0680l c0680l = C0680l.f8421a;
                    int i = m1.f4225b;
                    String str3 = (String) interfaceC0203a1.getValue();
                    c0680l.getClass();
                    C0680l.a(str3);
                    objV = xVar;
                } catch (Throwable th) {
                    objV = S1.V.v(th);
                }
                if (!(objV instanceof p084p4.j)) {
                    int i3 = m1.f4225b;
                    interfaceC0203a0.setValue("");
                    interfaceC0203a3.setValue(Boolean.FALSE);
                }
                Throwable thA = p084p4.k.a(objV);
                if (thA != null) {
                    String localizedMessage = thA.getLocalizedMessage();
                    String str4 = localizedMessage != null ? localizedMessage : "";
                    int i6 = m1.f4225b;
                    interfaceC0203a0.setValue(str4);
                }
                break;
            case 2:
                E4.k.f("$text$delegate", interfaceC0203a1);
                E4.k.f("$presetCreationError$delegate", interfaceC0203a0);
                int i7 = m1.f4225b;
                interfaceC0203a1.setValue("");
                interfaceC0203a0.setValue("");
                ((InterfaceC0203a0) obj).setValue(Boolean.TRUE);
                break;
            default:
                D3.j jVar = (D3.j) obj;
                E4.k.f("$light", jVar);
                ArrayList arrayList = new ArrayList();
                arrayList.add(jVar);
                com.nanjoran.ilightshow.Services.M m7 = com.nanjoran.ilightshow.Services.M.f8305O;
                if (m7.f8339z.contains(jVar)) {
                    X.s sVar = m7.f8339z;
                    sVar.removeAll(arrayList);
                    m7.E(new ArrayList(sVar));
                    break;
                } else {
                    int i8 = com.nanjoran.ilightshow.Services.E0.f8249o.a().f8262h;
                    C0691q c0691q = com.nanjoran.ilightshow.Services.F0.i;
                    if (i8 < 1 && !m7.k().isEmpty() && m7.l().b() <= 0) {
                        interfaceC0203a0.setValue(Boolean.TRUE);
                        break;
                    } else {
                        WeakReference weakReference = jVar.f805g;
                        K3.a aVar2 = weakReference != null ? (K3.a) weakReference.get() : null;
                        Integer maxStreamingLights = aVar2 != null ? aVar2.getMaxStreamingLights() : null;
                        ArrayList arrayList2 = new ArrayList();
                        ListIterator listIterator2 = m7.f8339z.listIterator();
                        while (true) {
                            X.y yVar2 = (X.y) listIterator2;
                            if (!yVar2.hasNext()) {
                                com.nanjoran.ilightshow.Services.M m8 = com.nanjoran.ilightshow.Services.M.f8305O;
                                if (m8.n() && jVar.f802d && aVar2 != null && maxStreamingLights != null && arrayList2.size() >= maxStreamingLights.intValue()) {
                                    interfaceC0203a1.setValue(jVar);
                                } else {
                                    m8.c(arrayList);
                                }
                                break;
                            } else {
                                Object next = yVar2.next();
                                D3.j jVar2 = (D3.j) next;
                                WeakReference weakReference2 = jVar2.f805g;
                                if (E4.k.a(weakReference2 != null ? (K3.a) weakReference2.get() : null, aVar2) && jVar2.f802d && ((hVar = jVar2.f806h) == null || !hVar.f788c)) {
                                    arrayList2.add(next);
                                }
                            }
                        }
                    }
                }
                break;
        }
        return xVar;
    }

    public /* synthetic */ C0256b0(InterfaceC0203a0 interfaceC0203a0, InterfaceC0203a0 interfaceC0203a1, InterfaceC0203a0 interfaceC0203a2, int i) {
        this.f4153h = i;
        this.i = interfaceC0203a0;
        this.f4154j = interfaceC0203a1;
        this.f4155k = interfaceC0203a2;
    }
}

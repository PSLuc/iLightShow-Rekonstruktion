package p124x0;

import F1.C0101s;
import L2.o;
import P.d;
import android.util.Log;
import com.philips.lighting.hue.sdk.wrapper.HueLog;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p057l.AbstractC0801m;
import p131y1.a;
import p131y1.i;
import q5.n;

/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f14007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f14008c;

    public d0(int i) {
        this.f14006a = i;
        switch (i) {
            case 1:
                this.f14007b = new d(new Reference[16]);
                this.f14008c = new ReferenceQueue();
                break;
            case 2:
            default:
                this.f14007b = new d(new D[16]);
                break;
            case 3:
                this.f14007b = new ArrayList();
                new n();
                new C0101s(2, this);
                this.f14008c = new AtomicInteger();
                Collections.synchronizedMap(new HashMap());
                Collections.synchronizedMap(new HashMap());
                Collections.synchronizedMap(new HashMap());
                new n(this);
                new CopyOnWriteArrayList();
                new ArrayDeque();
                new o(13, this);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [Z.n] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [Z.n] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [P.d] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [P.d] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v5 */
    public static void a(D d6) {
        J j4 = d6.f13829D;
        int i = 0;
        if (j4.f13909c == 5 && !j4.f13911e && !j4.f13910d && !d6.f13832K && d6.E()) {
            Z.n nVar = (Z.n) d6.f13828C.f3796f;
            if ((nVar.f5960k & HueLog.LogComponent.STREAMDTLS) != 0) {
                while (nVar != null) {
                    if ((nVar.f5959j & HueLog.LogComponent.STREAMDTLS) != 0) {
                        ?? E5 = nVar;
                        ?? dVar = 0;
                        while (E5 != 0) {
                            if (E5 instanceof InterfaceC1108p) {
                                InterfaceC1108p interfaceC1108p = (InterfaceC1108p) E5;
                                interfaceC1108p.A(AbstractC1098f.q(interfaceC1108p, HueLog.LogComponent.STREAMDTLS));
                            } else if ((E5.f5959j & HueLog.LogComponent.STREAMDTLS) != 0 && (E5 instanceof AbstractC1105m)) {
                                Z.n nVar2 = ((AbstractC1105m) E5).f14046v;
                                int i3 = 0;
                                E5 = E5;
                                dVar = dVar;
                                while (nVar2 != null) {
                                    if ((nVar2.f5959j & HueLog.LogComponent.STREAMDTLS) != 0) {
                                        i3++;
                                        dVar = dVar;
                                        if (i3 == 1) {
                                            E5 = nVar2;
                                        } else {
                                            if (dVar == 0) {
                                                dVar = new d(new Z.n[16]);
                                            }
                                            if (E5 != 0) {
                                                dVar.c(E5);
                                                E5 = 0;
                                            }
                                            dVar.c(nVar2);
                                        }
                                    }
                                    nVar2 = nVar2.f5962m;
                                    E5 = E5;
                                    dVar = dVar;
                                }
                                if (i3 == 1) {
                                }
                            }
                            E5 = AbstractC1098f.e(dVar);
                        }
                    }
                    if ((nVar.f5960k & HueLog.LogComponent.STREAMDTLS) == 0) {
                        break;
                    } else {
                        nVar = nVar.f5962m;
                    }
                }
            }
        }
        d6.J = false;
        d dVarU = d6.u();
        int i6 = dVarU.f4583j;
        if (i6 > 0) {
            Object[] objArr = dVarU.f4582h;
            do {
                a((D) objArr[i]);
                i++;
            } while (i < i6);
        }
    }

    public static boolean c(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    public void b() {
        throw new IllegalStateException("FragmentManager has not been attached to a host.");
    }

    public String toString() {
        switch (this.f14006a) {
            case 3:
                StringBuilder sb = new StringBuilder(128);
                sb.append("FragmentManager{");
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" in ");
                sb.append("null");
                sb.append("}}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public d0(AbstractC0801m abstractC0801m) {
        this.f14006a = 2;
        this.f14007b = abstractC0801m;
        i iVar = new i(abstractC0801m);
        this.f14008c = iVar;
        abstractC0801m.addTextChangedListener(iVar);
        if (a.f14576b == null) {
            synchronized (a.f14575a) {
                try {
                    if (a.f14576b == null) {
                        a aVar = new a();
                        try {
                            a.f14577c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        a.f14576b = aVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        abstractC0801m.setEditableFactory(a.f14576b);
    }
}

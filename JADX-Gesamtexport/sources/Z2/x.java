package Z2;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class x implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f6071a;

    public /* synthetic */ x(y yVar) {
        Objects.requireNonNull(yVar);
        this.f6071a = yVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            y yVar = this.f6071a;
            synchronized (yVar.f6074a) {
                try {
                    v vVar = (v) message.obj;
                    w wVar = (w) yVar.f6074a.get(vVar);
                    if (wVar != null && wVar.f6064a.isEmpty()) {
                        if (wVar.f6066c) {
                            v vVar2 = wVar.f6068e;
                            y yVar2 = wVar.f6070g;
                            yVar2.f6076c.removeMessages(1, vVar2);
                            yVar2.f6077d.a(yVar2.f6075b, wVar);
                            wVar.f6066c = false;
                            wVar.f6065b = 2;
                        }
                        yVar.f6074a.remove(vVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }
        if (i != 1) {
            return false;
        }
        y yVar3 = this.f6071a;
        synchronized (yVar3.f6074a) {
            try {
                v vVar3 = (v) message.obj;
                w wVar2 = (w) yVar3.f6074a.get(vVar3);
                if (wVar2 != null && wVar2.f6065b == 3) {
                    new StringBuilder(String.valueOf(vVar3).length() + 47);
                    new Exception();
                    ComponentName componentName = wVar2.f6069f;
                    if (componentName == null) {
                        vVar3.getClass();
                        componentName = null;
                    }
                    if (componentName == null) {
                        String str = vVar3.f6062b;
                        n.b(str);
                        componentName = new ComponentName(str, "unknown");
                    }
                    wVar2.onServiceDisconnected(componentName);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }
}

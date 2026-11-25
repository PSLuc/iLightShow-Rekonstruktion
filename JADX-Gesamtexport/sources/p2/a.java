package p2;

import T1.s;
import com.fasterxml.jackson.databind.ser.std.Q;
import java.io.Serializable;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p015c2.t;

/* JADX INFO: loaded from: classes.dex */
public final class a extends t implements Serializable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final AtomicInteger f10836k = new AtomicInteger(1);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b f10838j = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f10837h = "SimpleModule-" + f10836k.getAndIncrement();
    public final s i = s.f5250j;

    public final void a(Class cls, Q q6) {
        if (this.f10838j == null) {
            b bVar = new b();
            bVar.f10839h = null;
            bVar.i = null;
            bVar.f10840j = false;
            this.f10838j = bVar;
        }
        b bVar2 = this.f10838j;
        bVar2.getClass();
        p104t2.b bVar3 = new p104t2.b(cls);
        if (cls.isInterface()) {
            if (bVar2.i == null) {
                bVar2.i = new HashMap();
            }
            bVar2.i.put(bVar3, q6);
        } else {
            if (bVar2.f10839h == null) {
                bVar2.f10839h = new HashMap();
            }
            bVar2.f10839h.put(bVar3, q6);
            if (cls == Enum.class) {
                bVar2.f10840j = true;
            }
        }
    }
}

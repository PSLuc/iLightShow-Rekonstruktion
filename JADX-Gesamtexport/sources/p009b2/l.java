package p009b2;

import com.fasterxml.jackson.databind.deser.std.j0;
import com.fasterxml.jackson.databind.deser.std.l0;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import p015c2.C0474e;
import p015c2.r;
import p046i2.AbstractC0771g;
import p046i2.C0767c;
import p046i2.C0772h;
import p109u2.InterfaceC0963b;
import p109u2.i;

/* JADX INFO: loaded from: classes.dex */
public final class l implements Serializable, InterfaceC0963b {
    public static l0 a(C0474e c0474e, AbstractC0771g abstractC0771g) {
        if (abstractC0771g instanceof C0767c) {
            Constructor constructor = ((C0767c) abstractC0771g).f9538l;
            c0474e.getClass();
            if (c0474e.k(r.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
                i.e(constructor, c0474e.k(r.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
            }
            return new j0(constructor);
        }
        Method method = ((C0772h) abstractC0771g).f9547l;
        c0474e.getClass();
        if (c0474e.k(r.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
            i.e(method, c0474e.k(r.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        return new j0(method);
    }

    @Override // p109u2.InterfaceC0963b
    public Annotation d(Class cls) {
        return null;
    }

    @Override // p109u2.InterfaceC0963b
    public int size() {
        return 0;
    }
}

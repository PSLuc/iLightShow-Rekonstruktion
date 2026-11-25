package p046i2;

import S1.A;
import java.util.Iterator;
import p015c2.C0470a;
import p015c2.h;
import p015c2.z;

/* JADX INFO: loaded from: classes.dex */
public abstract class t implements p109u2.t {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final A f9574h = A.f4905l;

    public boolean A() {
        return false;
    }

    public abstract p015c2.A a();

    public abstract z c();

    public boolean d() {
        AbstractC0771g abstractC0771gM = m();
        if (abstractC0771gM == null && (abstractC0771gM = s()) == null) {
            abstractC0771gM = o();
        }
        return abstractC0771gM != null;
    }

    public boolean g() {
        return l() != null;
    }

    public abstract A h();

    public C i() {
        return null;
    }

    public C0470a j() {
        return null;
    }

    public Class[] k() {
        return null;
    }

    public final AbstractC0771g l() {
        C0772h c0772hP = p();
        return c0772hP == null ? o() : c0772hP;
    }

    public abstract C0776l m();

    public abstract Iterator n();

    public abstract C0769e o();

    public abstract C0772h p();

    public abstract h q();

    public abstract Class r();

    public abstract C0772h s();

    public abstract p015c2.A t();

    public abstract boolean u();

    public abstract boolean v();

    public abstract boolean w(p015c2.A a6);

    public abstract boolean x();

    public abstract boolean y();

    public abstract boolean z();
}

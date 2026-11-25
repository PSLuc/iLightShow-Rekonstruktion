package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class M implements V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0436v f6813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0 f6814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0430o f6815c;

    public M(b0 b0Var, C0430o c0430o, AbstractC0436v abstractC0436v) {
        this.f6814b = b0Var;
        c0430o.getClass();
        this.f6815c = c0430o;
        this.f6813a = abstractC0436v;
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final void a(Object obj, Object obj2) {
        W.k(this.f6814b, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final void b(Object obj) {
        ((d0) this.f6814b).getClass();
        c0 c0Var = ((AbstractC0436v) obj).unknownFields;
        if (c0Var.f6849e) {
            c0Var.f6849e = false;
        }
        this.f6815c.getClass();
        p012c.k.A(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final boolean c(Object obj) {
        this.f6815c.getClass();
        p012c.k.A(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final AbstractC0436v d() {
        AbstractC0436v abstractC0436v = this.f6813a;
        return abstractC0436v != null ? abstractC0436v.i() : ((AbstractC0434t) abstractC0436v.c(5)).b();
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final void e(Object obj, D d6) {
        this.f6815c.getClass();
        p012c.k.A(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final int f(AbstractC0436v abstractC0436v) {
        ((d0) this.f6814b).getClass();
        return abstractC0436v.unknownFields.hashCode();
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final boolean g(AbstractC0436v abstractC0436v, AbstractC0436v abstractC0436v2) {
        d0 d0Var = (d0) this.f6814b;
        d0Var.getClass();
        c0 c0Var = abstractC0436v.unknownFields;
        d0Var.getClass();
        return c0Var.equals(abstractC0436v2.unknownFields);
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final void h(Object obj, C0426k c0426k, C0429n c0429n) {
        this.f6814b.a(obj);
        this.f6815c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final int i(AbstractC0436v abstractC0436v) {
        ((d0) this.f6814b).getClass();
        c0 c0Var = abstractC0436v.unknownFields;
        int i = c0Var.f6848d;
        if (i != -1) {
            return i;
        }
        int iS = 0;
        for (int i3 = 0; i3 < c0Var.f6845a; i3++) {
            int i6 = c0Var.f6846b[i3] >>> 3;
            iS += C0427l.S(3, (C0422g) c0Var.f6847c[i3]) + C0427l.V(i6) + C0427l.U(2) + (C0427l.U(1) * 2);
        }
        c0Var.f6848d = iS;
        return iS;
    }
}

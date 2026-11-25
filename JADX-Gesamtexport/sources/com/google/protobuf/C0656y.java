package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0656y extends AbstractC0657z {
    @Override // com.google.protobuf.AbstractC0657z
    public final void a(long j4, Object obj) {
        AbstractC0634b abstractC0634b = (AbstractC0634b) ((InterfaceC0651t) e0.f8204c.i(j4, obj));
        if (abstractC0634b.f8196h) {
            abstractC0634b.f8196h = false;
        }
    }

    @Override // com.google.protobuf.AbstractC0657z
    public final void b(long j4, Object obj, Object obj2) {
        d0 d0Var = e0.f8204c;
        InterfaceC0651t interfaceC0651tE = (InterfaceC0651t) d0Var.i(j4, obj);
        InterfaceC0651t interfaceC0651t = (InterfaceC0651t) d0Var.i(j4, obj2);
        int size = interfaceC0651tE.size();
        int size2 = interfaceC0651t.size();
        if (size > 0 && size2 > 0) {
            if (!((AbstractC0634b) interfaceC0651tE).f8196h) {
                interfaceC0651tE = interfaceC0651tE.e(size2 + size);
            }
            interfaceC0651tE.addAll(interfaceC0651t);
        }
        if (size > 0) {
            interfaceC0651t = interfaceC0651tE;
        }
        e0.n(j4, obj, interfaceC0651t);
    }
}

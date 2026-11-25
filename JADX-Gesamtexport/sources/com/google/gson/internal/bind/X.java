package com.google.gson.internal.bind;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class X extends p105t3.C {
    @Override // p105t3.C
    public final Object a(p138z3.a aVar) {
        return new AtomicBoolean(aVar.T());
    }

    @Override // p105t3.C
    public final void b(p138z3.c cVar, Object obj) throws IOException {
        cVar.a0(((AtomicBoolean) obj).get());
    }
}

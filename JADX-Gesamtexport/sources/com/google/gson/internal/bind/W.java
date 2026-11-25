package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class W extends p105t3.C {
    @Override // p105t3.C
    public final Object a(p138z3.a aVar) {
        try {
            return new AtomicInteger(aVar.X());
        } catch (NumberFormatException e6) {
            throw new JsonSyntaxException(e6);
        }
    }

    @Override // p105t3.C
    public final void b(p138z3.c cVar, Object obj) throws IOException {
        cVar.V(((AtomicInteger) obj).get());
    }
}

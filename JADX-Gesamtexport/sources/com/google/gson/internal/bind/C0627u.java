package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: renamed from: com.google.gson.internal.bind.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0627u extends p105t3.C {
    @Override // p105t3.C
    public final Object a(p138z3.a aVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        aVar.b();
        while (aVar.L()) {
            try {
                arrayList.add(Integer.valueOf(aVar.X()));
            } catch (NumberFormatException e6) {
                throw new JsonSyntaxException(e6);
            }
        }
        aVar.s();
        int size = arrayList.size();
        AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
        for (int i = 0; i < size; i++) {
            atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
        }
        return atomicIntegerArray;
    }

    @Override // p105t3.C
    public final void b(p138z3.c cVar, Object obj) throws IOException {
        AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
        cVar.c();
        int length = atomicIntegerArray.length();
        for (int i = 0; i < length; i++) {
            cVar.V(atomicIntegerArray.get(i));
        }
        cVar.s();
    }
}

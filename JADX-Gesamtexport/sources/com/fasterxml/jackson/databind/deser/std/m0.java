package com.fasterxml.jackson.databind.deser.std;

import S1.EnumC0348j;
import java.util.function.Predicate;
import p046i2.C0765a;
import p046i2.C0772h;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m0 implements Predicate {
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        C0765a c0765a = (C0765a) obj;
        if (((C0772h) c0765a.f9522a).f9547l.getParameterCount() == 1 && ((C0772h) c0765a.f9522a).A(0) == String.class) {
            if (c0765a.f9523b != EnumC0348j.f4951j) {
                return false;
            }
        }
        return true;
    }
}

package com.fasterxml.jackson.databind.ser.std;

import S1.C0355q;
import S1.EnumC0352n;
import java.util.Objects;
import p015c2.InterfaceC0472c;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.ser.std.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0530a extends p093r2.f implements p093r2.g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final InterfaceC0472c f7701h;
    public final Boolean i;

    public AbstractC0530a(Class cls) {
        super(cls);
        this.f7701h = null;
        this.i = null;
    }

    @Override // p093r2.g
    public p015c2.o b(p015c2.E e6, InterfaceC0472c interfaceC0472c) {
        C0355q c0355qFindFormatOverrides;
        if (interfaceC0472c == null || (c0355qFindFormatOverrides = findFormatOverrides(e6, interfaceC0472c, handledType())) == null) {
            return this;
        }
        Boolean boolB = c0355qFindFormatOverrides.b(EnumC0352n.f4955j);
        return !Objects.equals(boolB, this.i) ? e(interfaceC0472c, boolB) : this;
    }

    public final boolean d(p015c2.E e6) {
        Boolean bool = this.i;
        if (bool != null) {
            return bool.booleanValue();
        }
        return e6.f7226j.p(p015c2.D.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED);
    }

    public abstract p015c2.o e(InterfaceC0472c interfaceC0472c, Boolean bool);

    public abstract void f(Object obj, T1.e eVar, p015c2.E e6);

    @Override // p015c2.o
    public final void serializeWithType(Object obj, T1.e eVar, p015c2.E e6, p071n2.e eVar2) {
        p003a2.a aVarE = eVar2.e(eVar, eVar2.d(T1.k.START_ARRAY, obj));
        eVar.C(obj);
        f(obj, eVar, e6);
        eVar2.f(eVar, aVarE);
    }

    public AbstractC0530a(AbstractC0530a abstractC0530a, InterfaceC0472c interfaceC0472c, Boolean bool) {
        super(0, abstractC0530a._handledType);
        this.f7701h = interfaceC0472c;
        this.i = bool;
    }
}

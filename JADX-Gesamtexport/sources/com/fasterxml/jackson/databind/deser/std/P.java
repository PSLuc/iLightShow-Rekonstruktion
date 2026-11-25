package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import p109u2.EnumC0962a;

/* JADX INFO: loaded from: classes.dex */
public abstract class P extends n0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p104t2.d f7569h;
    public final Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f7570j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f7571k;

    public P(Class cls, p104t2.d dVar, Object obj, Object obj2) {
        super(cls);
        this.f7569h = dVar;
        this.i = obj;
        this.f7570j = obj2;
        this.f7571k = cls.isPrimitive();
    }

    @Override // p015c2.j
    public final Object getEmptyValue(p015c2.f fVar) {
        return this.f7570j;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.n0, p015c2.j
    public final EnumC0962a getNullAccessPattern() {
        if (this.f7571k) {
            return EnumC0962a.f12678j;
        }
        return this.i == null ? EnumC0962a.f12677h : EnumC0962a.i;
    }

    @Override // p015c2.j, p032f2.l
    public final Object getNullValue(p015c2.f fVar) throws MismatchedInputException {
        if (!this.f7571k || !fVar.B0(p015c2.g.FAIL_ON_NULL_FOR_PRIMITIVES)) {
            return this.i;
        }
        fVar.J0(this, "Cannot map `null` into type %s (set DeserializationConfig.DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES to 'false' to allow)", p109u2.i.f(handledType()));
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.n0, p015c2.j
    public final p104t2.d logicalType() {
        return this.f7569h;
    }
}

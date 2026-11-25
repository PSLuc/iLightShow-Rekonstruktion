package com.fasterxml.jackson.databind.deser.std;

import S1.EnumC0352n;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import java.lang.reflect.Array;
import java.util.Objects;
import p015c2.C0474e;
import p015c2.InterfaceC0472c;
import p109u2.EnumC0962a;

/* JADX INFO: loaded from: classes.dex */
public abstract class c0 extends g0 implements p032f2.i {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f7582k = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Boolean f7583h;
    public transient Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p032f2.l f7584j;

    public c0(Class cls) {
        super(cls);
        this.f7583h = null;
        this.f7584j = null;
    }

    @Override // p032f2.i
    public final p015c2.j a(p015c2.f fVar, InterfaceC0472c interfaceC0472c) {
        p037g2.q qVar;
        Boolean boolFindFormatFeature = findFormatFeature(fVar, interfaceC0472c, this._valueClass, EnumC0352n.f4954h);
        S1.b0 b0VarFindContentNullStyle = findContentNullStyle(fVar, interfaceC0472c);
        if (b0VarFindContentNullStyle == S1.b0.f4928h) {
            qVar = p037g2.q.f9155j;
        } else if (b0VarFindContentNullStyle != S1.b0.i) {
            qVar = null;
        } else if (interfaceC0472c == null) {
            qVar = new p037g2.q((p015c2.A) null, fVar.b0(this._valueClass.getComponentType()));
        } else {
            qVar = new p037g2.q(interfaceC0472c.a(), interfaceC0472c.getType().Y());
        }
        return (Objects.equals(boolFindFormatFeature, this.f7583h) && qVar == this.f7584j) ? this : h(qVar, boolFindFormatFeature);
    }

    public abstract Object d(Object obj, Object obj2);

    @Override // p015c2.j
    public final Object deserialize(T1.i iVar, p015c2.f fVar, Object obj) {
        Object objDeserialize = deserialize(iVar, fVar);
        return (obj == null || Array.getLength(obj) == 0) ? objDeserialize : d(obj, objDeserialize);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.g0, p015c2.j
    public final Object deserializeWithType(T1.i iVar, p015c2.f fVar, p071n2.d dVar) {
        return dVar.c(iVar, fVar);
    }

    public abstract Object e();

    public final Object f(T1.i iVar, p015c2.f fVar) throws MismatchedInputException {
        if (iVar.s0(T1.k.VALUE_STRING)) {
            return _deserializeFromString(iVar, fVar);
        }
        Boolean bool = Boolean.TRUE;
        Boolean bool2 = this.f7583h;
        if (bool2 == bool || (bool2 == null && fVar.B0(p015c2.g.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            return g(iVar, fVar);
        }
        fVar.s0(iVar, this._valueClass);
        throw null;
    }

    public abstract Object g(T1.i iVar, p015c2.f fVar);

    @Override // p015c2.j
    public final EnumC0962a getEmptyAccessPattern() {
        return EnumC0962a.i;
    }

    @Override // p015c2.j
    public final Object getEmptyValue(p015c2.f fVar) {
        Object obj = this.i;
        if (obj != null) {
            return obj;
        }
        Object objE = e();
        this.i = objE;
        return objE;
    }

    public abstract c0 h(p032f2.l lVar, Boolean bool);

    @Override // p015c2.j
    public p104t2.d logicalType() {
        return p104t2.d.f12492h;
    }

    @Override // p015c2.j
    public final Boolean supportsUpdate(C0474e c0474e) {
        return Boolean.TRUE;
    }

    public c0(c0 c0Var, p032f2.l lVar, Boolean bool) {
        super(c0Var._valueClass);
        this.f7583h = bool;
        this.f7584j = lVar;
    }
}

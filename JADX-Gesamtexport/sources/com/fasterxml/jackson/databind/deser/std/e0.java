package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.exc.MismatchedInputException;

/* JADX INFO: loaded from: classes.dex */
public final class e0 extends n0 {
    public static final /* synthetic */ int i = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p015c2.j f7590h;

    public e0(p015c2.j jVar) {
        super(StackTraceElement.class);
        this.f7590h = jVar;
    }

    @Override // p015c2.j
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final StackTraceElement deserialize(T1.i iVar, p015c2.f fVar) throws MismatchedInputException {
        T1.k kVarS = iVar.s();
        if (kVarS == T1.k.START_OBJECT || kVarS == T1.k.FIELD_NAME) {
            p015c2.j jVar = this.f7590h;
            if (jVar == null) {
                if (fVar.F0(iVar, d0.class) == null) {
                    throw null;
                }
                throw new ClassCastException();
            }
            if (jVar.deserialize(iVar, fVar) == null) {
                throw null;
            }
            throw new ClassCastException();
        }
        if (kVarS != T1.k.START_ARRAY || !fVar.B0(p015c2.g.UNWRAP_SINGLE_VALUE_ARRAYS)) {
            fVar.s0(iVar, this._valueClass);
            throw null;
        }
        iVar.B0();
        StackTraceElement stackTraceElementDeserialize = deserialize(iVar, fVar);
        if (iVar.B0() != T1.k.END_ARRAY) {
            handleMissingEndArrayForSingle(iVar, fVar);
        }
        return stackTraceElementDeserialize;
    }
}

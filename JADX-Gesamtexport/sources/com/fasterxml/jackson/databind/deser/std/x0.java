package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import p015c2.C0474e;

/* JADX INFO: loaded from: classes.dex */
public final class x0 extends g0 {
    public static final Object[] i = new Object[0];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final x0 f7682j = new x0(false);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f7683h;

    public x0(boolean z5) {
        super(Object.class);
        this.f7683h = z5;
    }

    public final Object d(T1.i iVar, p015c2.f fVar, int i3) throws MismatchedInputException {
        switch (i3) {
            case 6:
                return iVar.i0();
            case 7:
                return fVar.B0(p015c2.g.USE_BIG_INTEGER_FOR_INTS) ? iVar.C() : iVar.c0();
            case 8:
                return fVar.B0(p015c2.g.USE_BIG_DECIMAL_FOR_FLOATS) ? iVar.T() : iVar.c0();
            case 9:
                return Boolean.TRUE;
            case 10:
                return Boolean.FALSE;
            case 11:
                return null;
            case 12:
                return iVar.X();
            default:
                fVar.r0(iVar, getValueType(fVar));
                throw null;
        }
    }

    @Override // p015c2.j
    public final Object deserialize(T1.i iVar, p015c2.f fVar) throws MismatchedInputException {
        Object objE;
        switch (iVar.v()) {
            case 1:
                return e(iVar, fVar, new w0(null, fVar.A0(T1.o.DUPLICATE_PROPERTIES)));
            case 2:
                return new LinkedHashMap(2);
            case 3:
                return e(iVar, fVar, new w0(null));
            case 4:
            default:
                fVar.r0(iVar, getValueType(fVar));
                throw null;
            case 5:
                w0 w0Var = new w0(null, fVar.A0(T1.o.DUPLICATE_PROPERTIES));
                String strO = iVar.o();
                while (strO != null) {
                    T1.k kVarB0 = iVar.B0();
                    if (kVarB0 == null) {
                        kVarB0 = T1.k.NOT_AVAILABLE;
                    }
                    int i3 = kVarB0.f5233k;
                    if (i3 == 1) {
                        objE = e(iVar, fVar, new w0(w0Var, w0Var.f7678c));
                    } else {
                        if (i3 == 2) {
                            LinkedHashMap linkedHashMap = w0Var.f7680e;
                            return linkedHashMap == null ? new LinkedHashMap(2) : linkedHashMap;
                        }
                        objE = i3 != 3 ? d(iVar, fVar, i3) : e(iVar, fVar, new w0(w0Var));
                    }
                    if (w0Var.f7678c) {
                        w0Var.a(strO, objE);
                    } else {
                        if (w0Var.f7680e == null) {
                            w0Var.f7680e = new LinkedHashMap();
                        }
                        w0Var.f7680e.put(strO, objE);
                    }
                    strO = iVar.z0();
                }
                LinkedHashMap linkedHashMap2 = w0Var.f7680e;
                return linkedHashMap2 == null ? new LinkedHashMap(2) : linkedHashMap2;
            case 6:
                return iVar.i0();
            case 7:
                return fVar.x0(g0.F_MASK_INT_COERCIONS) ? _coerceIntegral(iVar, fVar) : iVar.c0();
            case 8:
                return fVar.B0(p015c2.g.USE_BIG_DECIMAL_FOR_FLOATS) ? iVar.T() : iVar.c0();
            case 9:
                return Boolean.TRUE;
            case 10:
                return Boolean.FALSE;
            case 11:
                return null;
            case 12:
                return iVar.X();
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.std.g0, p015c2.j
    public final Object deserializeWithType(T1.i iVar, p015c2.f fVar, p071n2.d dVar) {
        int iV = iVar.v();
        return (iV == 1 || iV == 3 || iV == 5) ? dVar.b(iVar, fVar) : d(iVar, fVar, iVar.v());
    }

    public final Object e(T1.i iVar, p015c2.f fVar, w0 w0Var) throws MismatchedInputException {
        w0 w0Var2;
        Object objI0;
        Object objI1;
        boolean zX0 = fVar.x0(g0.F_MASK_INT_COERCIONS);
        boolean zB0 = fVar.B0(p015c2.g.USE_JAVA_ARRAY_FOR_JSON_ARRAY);
        w0 w0Var3 = w0Var;
        while (true) {
            if (!w0Var3.f7677b) {
                while (true) {
                    T1.k kVarB0 = iVar.B0();
                    if (kVarB0 == null) {
                        kVarB0 = T1.k.NOT_AVAILABLE;
                    }
                    switch (kVarB0.f5233k) {
                        case 1:
                            w0Var2 = new w0(w0Var3, w0Var3.f7678c);
                            w0Var3 = w0Var2;
                            break;
                            break;
                        case 2:
                        case 5:
                        default:
                            fVar.r0(iVar, getValueType(fVar));
                            throw null;
                        case 3:
                            w0Var2 = new w0(w0Var3);
                            w0Var3 = w0Var2;
                            break;
                            break;
                        case 4:
                            Object array = i;
                            if (w0Var3 != w0Var) {
                                ArrayList arrayList = w0Var3.f7681f;
                                if (arrayList != null) {
                                    array = zB0 ? arrayList.toArray((Object[]) array) : arrayList;
                                    w0Var3.f7681f = null;
                                } else if (!zB0) {
                                    array = new ArrayList(2);
                                }
                                w0Var3 = w0Var3.f7676a;
                                if (!w0Var3.f7677b) {
                                    w0Var3.b(array);
                                    break;
                                }
                                w0Var3.c(array);
                                break;
                            }
                            ArrayList arrayList2 = w0Var3.f7681f;
                            if (arrayList2 == null) {
                                return zB0 ? array : new ArrayList(2);
                            }
                            return zB0 ? arrayList2.toArray((Object[]) array) : arrayList2;
                        case 6:
                            objI1 = iVar.i0();
                            w0Var3.b(objI1);
                            break;
                        case 7:
                            objI1 = zX0 ? _coerceIntegral(iVar, fVar) : iVar.c0();
                            w0Var3.b(objI1);
                            break;
                        case 8:
                            objI1 = fVar.B0(p015c2.g.USE_BIG_DECIMAL_FOR_FLOATS) ? iVar.T() : iVar.c0();
                            w0Var3.b(objI1);
                            break;
                        case 9:
                            objI1 = Boolean.TRUE;
                            w0Var3.b(objI1);
                            break;
                        case 10:
                            objI1 = Boolean.FALSE;
                            w0Var3.b(objI1);
                            break;
                        case 11:
                            objI1 = null;
                            w0Var3.b(objI1);
                            break;
                        case 12:
                            objI1 = iVar.X();
                            w0Var3.b(objI1);
                            break;
                    }
                }
            } else {
                String strZ0 = iVar.z0();
                while (true) {
                    if (strZ0 == null) {
                        if (w0Var3 != w0Var) {
                            LinkedHashMap linkedHashMap = w0Var3.f7680e;
                            if (linkedHashMap == null) {
                                linkedHashMap = new LinkedHashMap();
                            } else {
                                w0Var3.f7680e = null;
                            }
                            w0Var3 = w0Var3.f7676a;
                            if (!w0Var3.f7677b) {
                                w0Var3.b(linkedHashMap);
                                break;
                            }
                            w0Var3.c(linkedHashMap);
                            break;
                        }
                        LinkedHashMap linkedHashMap2 = w0Var3.f7680e;
                        return linkedHashMap2 == null ? new LinkedHashMap(2) : linkedHashMap2;
                    }
                    T1.k kVarB1 = iVar.B0();
                    if (kVarB1 == null) {
                        kVarB1 = T1.k.NOT_AVAILABLE;
                    }
                    int i3 = kVarB1.f5233k;
                    if (i3 == 1) {
                        w0Var3.f7679d = strZ0;
                        w0Var3 = new w0(w0Var3, w0Var3.f7678c);
                    } else {
                        if (i3 == 3) {
                            w0Var3.f7679d = strZ0;
                            w0Var2 = new w0(w0Var3);
                            w0Var3 = w0Var2;
                            break;
                        }
                        switch (i3) {
                            case 6:
                                objI0 = iVar.i0();
                                break;
                            case 7:
                                objI0 = !zX0 ? iVar.c0() : _coerceIntegral(iVar, fVar);
                                break;
                            case 8:
                                objI0 = !fVar.B0(p015c2.g.USE_BIG_DECIMAL_FOR_FLOATS) ? iVar.c0() : iVar.T();
                                break;
                            case 9:
                                objI0 = Boolean.TRUE;
                                break;
                            case 10:
                                objI0 = Boolean.FALSE;
                                break;
                            case 11:
                                objI0 = null;
                                break;
                            case 12:
                                objI0 = iVar.X();
                                break;
                            default:
                                fVar.r0(iVar, getValueType(fVar));
                                throw null;
                        }
                        if (w0Var3.f7678c) {
                            w0Var3.a(strZ0, objI0);
                        } else {
                            if (w0Var3.f7680e == null) {
                                w0Var3.f7680e = new LinkedHashMap();
                            }
                            w0Var3.f7680e.put(strZ0, objI0);
                        }
                    }
                    strZ0 = iVar.z0();
                }
            }
        }
    }

    @Override // p015c2.j
    public final p104t2.d logicalType() {
        return p104t2.d.f12495l;
    }

    @Override // p015c2.j
    public final Boolean supportsUpdate(C0474e c0474e) {
        if (this.f7683h) {
            return Boolean.FALSE;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0043, code lost:
    
        if (r5.B0() == T1.k.END_OBJECT) goto L28;
     */
    @Override // p015c2.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object deserialize(T1.i r5, p015c2.f r6, java.lang.Object r7) throws com.fasterxml.jackson.databind.exc.MismatchedInputException {
        /*
            r4 = this;
            boolean r0 = r4.f7683h
            if (r0 == 0) goto L9
            java.lang.Object r4 = r4.deserialize(r5, r6)
            return r4
        L9:
            int r0 = r5.v()
            r1 = 1
            if (r0 == r1) goto L3d
            r1 = 2
            if (r0 == r1) goto L45
            r1 = 3
            if (r0 == r1) goto L1d
            r1 = 4
            if (r0 == r1) goto L45
            r1 = 5
            if (r0 == r1) goto L46
            goto L6f
        L1d:
            T1.k r0 = r5.B0()
            T1.k r1 = T1.k.END_ARRAY
            if (r0 != r1) goto L26
            goto L45
        L26:
            boolean r0 = r7 instanceof java.util.Collection
            if (r0 == 0) goto L6f
            r0 = r7
            java.util.Collection r0 = (java.util.Collection) r0
        L2d:
            java.lang.Object r1 = r4.deserialize(r5, r6)
            r0.add(r1)
            T1.k r1 = r5.B0()
            T1.k r2 = T1.k.END_ARRAY
            if (r1 != r2) goto L2d
            return r7
        L3d:
            T1.k r0 = r5.B0()
            T1.k r1 = T1.k.END_OBJECT
            if (r0 != r1) goto L46
        L45:
            return r7
        L46:
            boolean r0 = r7 instanceof java.util.Map
            if (r0 == 0) goto L6f
            r0 = r7
            java.util.Map r0 = (java.util.Map) r0
            java.lang.String r1 = r5.o()
        L51:
            r5.B0()
            java.lang.Object r2 = r0.get(r1)
            if (r2 == 0) goto L5f
            java.lang.Object r3 = r4.deserialize(r5, r6, r2)
            goto L63
        L5f:
            java.lang.Object r3 = r4.deserialize(r5, r6)
        L63:
            if (r3 == r2) goto L68
            r0.put(r1, r3)
        L68:
            java.lang.String r1 = r5.z0()
            if (r1 != 0) goto L51
            return r7
        L6f:
            java.lang.Object r4 = r4.deserialize(r5, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.x0.deserialize(T1.i, c2.f, java.lang.Object):java.lang.Object");
    }
}

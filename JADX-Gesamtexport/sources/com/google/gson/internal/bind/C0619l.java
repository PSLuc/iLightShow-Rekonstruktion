package com.google.gson.internal.bind;

import java.io.IOException;

/* JADX INFO: renamed from: com.google.gson.internal.bind.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0619l extends p105t3.C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8108a;

    @Override // p105t3.C
    public final Object a(p138z3.a aVar) throws IOException {
        switch (this.f8108a) {
            case 0:
                aVar.m0();
                return null;
            case 1:
                if (aVar.f0() != 9) {
                    return Double.valueOf(aVar.V());
                }
                aVar.b0();
                return null;
            default:
                if (aVar.f0() != 9) {
                    return Float.valueOf((float) aVar.V());
                }
                aVar.b0();
                return null;
        }
    }

    @Override // p105t3.C
    public final void b(p138z3.c cVar, Object obj) throws IOException {
        switch (this.f8108a) {
            case 0:
                cVar.G();
                break;
            case 1:
                Number number = (Number) obj;
                if (number != null) {
                    double dDoubleValue = number.doubleValue();
                    p105t3.m.a(dDoubleValue);
                    cVar.T(dDoubleValue);
                } else {
                    cVar.G();
                }
                break;
            default:
                Number numberValueOf = (Number) obj;
                if (numberValueOf != null) {
                    float fFloatValue = numberValueOf.floatValue();
                    p105t3.m.a(fFloatValue);
                    if (!(numberValueOf instanceof Float)) {
                        numberValueOf = Float.valueOf(fFloatValue);
                    }
                    cVar.Y(numberValueOf);
                } else {
                    cVar.G();
                }
                break;
        }
    }

    public String toString() {
        switch (this.f8108a) {
            case 0:
                return "AnonymousOrNonStaticLocalClassAdapter";
            default:
                return super.toString();
        }
    }
}

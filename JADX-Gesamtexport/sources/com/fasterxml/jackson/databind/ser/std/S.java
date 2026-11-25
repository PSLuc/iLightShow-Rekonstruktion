package com.fasterxml.jackson.databind.ser.std;

import S1.C0355q;
import S1.EnumC0354p;
import java.util.Objects;
import java.util.UUID;
import p015c2.InterfaceC0472c;

/* JADX INFO: loaded from: classes.dex */
public final class S extends Q implements p093r2.g {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final char[] f7700j = "0123456789abcdef".toCharArray();
    public final Boolean i;

    public S(Boolean bool) {
        super(UUID.class, 2, (byte) 0);
        this.i = bool;
    }

    public static final void f(byte[] bArr, int i, int i3) {
        bArr[i3] = (byte) (i >> 24);
        bArr[i3 + 1] = (byte) (i >> 16);
        bArr[i3 + 2] = (byte) (i >> 8);
        bArr[i3 + 3] = (byte) i;
    }

    public static void g(char[] cArr, int i, int i3) {
        char[] cArr2 = f7700j;
        cArr[i3] = cArr2[(i >> 12) & 15];
        cArr[i3 + 1] = cArr2[(i >> 8) & 15];
        cArr[i3 + 2] = cArr2[(i >> 4) & 15];
        cArr[i3 + 3] = cArr2[i & 15];
    }

    @Override // com.fasterxml.jackson.databind.ser.std.Q, com.fasterxml.jackson.databind.ser.std.P, p015c2.o
    public final void acceptJsonFormatVisitor(p059l2.b bVar, p015c2.h hVar) {
        visitStringFormat(bVar, hVar, p059l2.c.UUID);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    @Override // p093r2.g
    public final p015c2.o b(p015c2.E e6, InterfaceC0472c interfaceC0472c) {
        Boolean bool;
        C0355q c0355qFindFormatOverrides = findFormatOverrides(e6, interfaceC0472c, handledType());
        if (c0355qFindFormatOverrides != null) {
            EnumC0354p enumC0354p = EnumC0354p.f4969q;
            EnumC0354p enumC0354p2 = c0355qFindFormatOverrides.i;
            if (enumC0354p2 == enumC0354p) {
                bool = Boolean.TRUE;
            } else if (enumC0354p2 == EnumC0354p.f4968p) {
                bool = Boolean.FALSE;
            } else {
                bool = null;
            }
        } else {
            bool = null;
        }
        return !Objects.equals(bool, this.i) ? new S(bool) : this;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.Q, p015c2.o
    public final boolean isEmpty(p015c2.E e6, Object obj) {
        UUID uuid = (UUID) obj;
        return uuid.getLeastSignificantBits() == 0 && uuid.getMostSignificantBits() == 0;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0019  */
    @Override // com.fasterxml.jackson.databind.ser.std.Q, p015c2.o
    public final void serialize(Object obj, T1.e eVar, p015c2.E e6) {
        boolean zBooleanValue;
        UUID uuid = (UUID) obj;
        Boolean bool = this.i;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else if (eVar instanceof p109u2.A) {
            zBooleanValue = false;
        } else {
            eVar.getClass();
            if (eVar instanceof p109u2.A) {
                zBooleanValue = true;
            } else {
                zBooleanValue = false;
            }
        }
        if (zBooleanValue) {
            byte[] bArr = new byte[16];
            long mostSignificantBits = uuid.getMostSignificantBits();
            long leastSignificantBits = uuid.getLeastSignificantBits();
            f(bArr, (int) (mostSignificantBits >> 32), 0);
            f(bArr, (int) mostSignificantBits, 4);
            f(bArr, (int) (leastSignificantBits >> 32), 8);
            f(bArr, (int) leastSignificantBits, 12);
            eVar.getClass();
            eVar.G(T1.b.f5157a, bArr, 0, 16);
            return;
        }
        char[] cArr = new char[36];
        long mostSignificantBits2 = uuid.getMostSignificantBits();
        int i = (int) (mostSignificantBits2 >> 32);
        g(cArr, i >> 16, 0);
        g(cArr, i, 4);
        cArr[8] = '-';
        int i3 = (int) mostSignificantBits2;
        g(cArr, i3 >>> 16, 9);
        cArr[13] = '-';
        g(cArr, i3, 14);
        cArr[18] = '-';
        long leastSignificantBits2 = uuid.getLeastSignificantBits();
        g(cArr, (int) (leastSignificantBits2 >>> 48), 19);
        cArr[23] = '-';
        g(cArr, (int) (leastSignificantBits2 >>> 32), 24);
        int i6 = (int) leastSignificantBits2;
        g(cArr, i6 >> 16, 28);
        g(cArr, i6, 32);
        eVar.t0(cArr, 0, 36);
    }
}

package com.google.android.gms.internal.play_billing;

import F.C0068j;
import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0579l {
    RESPONSE_CODE_UNSPECIFIED(-999),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_TIMEOUT(-3),
    /* JADX INFO: Fake field, exist only in values array */
    FEATURE_NOT_SUPPORTED(-2),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_DISCONNECTED(-1),
    /* JADX INFO: Fake field, exist only in values array */
    OK(0),
    /* JADX INFO: Fake field, exist only in values array */
    USER_CANCELED(1),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_UNAVAILABLE(2),
    /* JADX INFO: Fake field, exist only in values array */
    BILLING_UNAVAILABLE(3),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_UNAVAILABLE(4),
    /* JADX INFO: Fake field, exist only in values array */
    DEVELOPER_ERROR(5),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR(6),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_ALREADY_OWNED(7),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_NOT_OWNED(8),
    /* JADX INFO: Fake field, exist only in values array */
    EXPIRED_OFFER_TOKEN(11),
    /* JADX INFO: Fake field, exist only in values array */
    NETWORK_ERROR(12);


    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C f7961j;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f7963h;

    static {
        C0068j c0068j = new C0068j(4);
        c0068j.f1183c = new Object[8];
        c0068j.f1182b = 0;
        for (EnumC0579l enumC0579l : values()) {
            Integer numValueOf = Integer.valueOf(enumC0579l.f7963h);
            int i = c0068j.f1182b + 1;
            Object[] objArr = (Object[]) c0068j.f1183c;
            int length = objArr.length;
            int i3 = i + i;
            if (i3 > length) {
                if (i3 > length) {
                    length = length + (length >> 1) + 1;
                    if (length < i3) {
                        int iHighestOneBit = Integer.highestOneBit(i3 - 1);
                        length = iHighestOneBit + iHighestOneBit;
                    }
                    if (length < 0) {
                        length = Integer.MAX_VALUE;
                    }
                }
                c0068j.f1183c = Arrays.copyOf(objArr, length);
            }
            Object[] objArr2 = (Object[]) c0068j.f1183c;
            int i6 = c0068j.f1182b;
            int i7 = i6 + i6;
            objArr2[i7] = numValueOf;
            objArr2[i7 + 1] = enumC0579l;
            c0068j.f1182b = i6 + 1;
        }
        C0596u c0596u = (C0596u) c0068j.f1184d;
        if (c0596u != null) {
            throw c0596u.a();
        }
        C cA = C.a(c0068j.f1182b, (Object[]) c0068j.f1183c, c0068j);
        C0596u c0596u2 = (C0596u) c0068j.f1184d;
        if (c0596u2 != null) {
            throw c0596u2.a();
        }
        f7961j = cA;
    }

    EnumC0579l(int i) {
        this.f7963h = i;
    }
}

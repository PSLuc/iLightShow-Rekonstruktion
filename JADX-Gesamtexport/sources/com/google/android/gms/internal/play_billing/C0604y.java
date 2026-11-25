package com.google.android.gms.internal.play_billing;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0604y extends AbstractC0594t {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0606z f8017j;

    public C0604y(C0606z c0606z) {
        Objects.requireNonNull(c0606z);
        this.f8017j = c0606z;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        C0606z c0606z = this.f8017j;
        S1.h0.C(i, c0606z.f8020l);
        int i3 = i + i;
        Object[] objArr = c0606z.f8019k;
        Object obj = objArr[i3];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i3 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0589q
    public final boolean j() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8017j.f8020l;
    }
}

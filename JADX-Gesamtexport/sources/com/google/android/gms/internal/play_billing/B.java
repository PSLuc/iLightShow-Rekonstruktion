package com.google.android.gms.internal.play_billing;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class B extends AbstractC0594t {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final transient Object[] f7807j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final transient int f7808k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final transient int f7809l;

    public B(int i, int i3, Object[] objArr) {
        this.f7807j = objArr;
        this.f7808k = i;
        this.f7809l = i3;
    }

    @Override // java.util.List
    public final Object get(int i) {
        S1.h0.C(i, this.f7809l);
        Object obj = this.f7807j[i + i + this.f7808k];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0589q
    public final boolean j() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7809l;
    }
}

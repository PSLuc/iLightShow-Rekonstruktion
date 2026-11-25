package com.google.android.gms.internal.play_billing;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0600w extends AbstractC0594t {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C0600w f8010l = new C0600w(new Object[0], 0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final transient Object[] f8011j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final transient int f8012k;

    public C0600w(Object[] objArr, int i) {
        this.f8011j = objArr;
        this.f8012k = i;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0594t, com.google.android.gms.internal.play_billing.AbstractC0589q
    public final int c(Object[] objArr) {
        Object[] objArr2 = this.f8011j;
        int i = this.f8012k;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0589q
    public final int d() {
        return this.f8012k;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0589q
    public final int g() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        S1.h0.C(i, this.f8012k);
        Object obj = this.f8011j[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0589q
    public final boolean j() {
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0589q
    public final Object[] k() {
        return this.f8011j;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8012k;
    }
}

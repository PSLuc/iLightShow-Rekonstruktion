package com.google.android.gms.internal.play_billing;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0592s extends AbstractC0594t {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final transient int f7996j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final transient int f7997k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractC0594t f7998l;

    public C0592s(AbstractC0594t abstractC0594t, int i, int i3) {
        Objects.requireNonNull(abstractC0594t);
        this.f7998l = abstractC0594t;
        this.f7996j = i;
        this.f7997k = i3;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0589q
    public final int d() {
        return this.f7998l.g() + this.f7996j + this.f7997k;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0589q
    public final int g() {
        return this.f7998l.g() + this.f7996j;
    }

    @Override // java.util.List
    public final Object get(int i) {
        S1.h0.C(i, this.f7997k);
        return this.f7998l.get(i + this.f7996j);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0589q
    public final boolean j() {
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0589q
    public final Object[] k() {
        return this.f7998l.k();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0594t, java.util.List
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final AbstractC0594t subList(int i, int i3) {
        S1.h0.F(i, i3, this.f7997k);
        int i6 = this.f7996j;
        return this.f7998l.subList(i + i6, i3 + i6);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7997k;
    }
}

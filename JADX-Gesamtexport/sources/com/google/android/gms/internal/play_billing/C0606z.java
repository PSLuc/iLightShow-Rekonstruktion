package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0606z extends AbstractC0598v {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final transient C f8018j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final transient Object[] f8019k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final transient int f8020l;

    public C0606z(C c6, Object[] objArr, int i) {
        this.f8018j = c6;
        this.f8019k = objArr;
        this.f8020l = i;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0589q
    public final int c(Object[] objArr) {
        return i().c(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f8018j.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return i().listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0598v
    public final AbstractC0594t l() {
        return new C0604y(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f8020l;
    }
}

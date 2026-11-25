package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0598v extends AbstractC0589q implements Set {
    public transient AbstractC0594t i;

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                return size() == set.size() && containsAll(set);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0589q
    public AbstractC0594t i() {
        AbstractC0594t abstractC0594t = this.i;
        if (abstractC0594t != null) {
            return abstractC0594t;
        }
        AbstractC0594t abstractC0594tL = l();
        this.i = abstractC0594tL;
        return abstractC0594tL;
    }

    public AbstractC0594t l() {
        Object[] array = toArray(AbstractC0589q.f7983h);
        r rVar = AbstractC0594t.i;
        return AbstractC0594t.m(array, array.length);
    }
}

package com.google.gson.internal;

import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p105t3.C;
import p105t3.D;
import p105t3.m;
import p116v3.f;
import p127x3.c;
import p132y3.a;
import p138z3.b;

/* JADX INFO: loaded from: classes.dex */
public final class Excluder implements D, Cloneable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Excluder f8026k = new Excluder();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f8027h;
    public final List i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f8028j;

    public Excluder() {
        List list = Collections.EMPTY_LIST;
        this.i = list;
        this.f8028j = list;
    }

    @Override // p105t3.D
    public final C a(m mVar, a aVar) {
        Class rawType = aVar.getRawType();
        boolean zC = c(rawType, true);
        boolean zC2 = c(rawType, false);
        if (zC || zC2) {
            return new f(this, zC2, zC, mVar, aVar);
        }
        return null;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Excluder clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e6) {
            throw new AssertionError(e6);
        }
    }

    public final boolean c(Class cls, boolean z5) {
        if (!z5 && !Enum.class.isAssignableFrom(cls)) {
            p027e3.a aVar = c.f14144a;
            if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
                return true;
            }
        }
        Iterator it = (z5 ? this.i : this.f8028j).iterator();
        if (it.hasNext()) {
            throw b.a(it);
        }
        return false;
    }
}

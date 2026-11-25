package com.google.gson.internal.bind;

import B.AbstractC0013g0;
import com.google.gson.JsonIOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.google.gson.internal.bind.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0620m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f8110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Method f8112d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p105t3.C f8113e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p105t3.C f8114f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f8115g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f8116h;

    public C0620m(String str, Field field, Method method, p105t3.C c6, p105t3.C c7, boolean z5, boolean z6) {
        this.f8112d = method;
        this.f8113e = c6;
        this.f8114f = c7;
        this.f8115g = z5;
        this.f8116h = z6;
        this.f8109a = str;
        this.f8110b = field;
        this.f8111c = field.getName();
    }

    public final void a(p138z3.c cVar, Object obj) throws IllegalAccessException {
        Object objInvoke;
        Field field = this.f8110b;
        Method method = this.f8112d;
        if (method != null) {
            try {
                objInvoke = method.invoke(obj, null);
            } catch (InvocationTargetException e6) {
                throw new JsonIOException(AbstractC0013g0.i("Accessor ", p127x3.c.d(method, false), " threw exception"), e6.getCause());
            }
        } else {
            objInvoke = field.get(obj);
        }
        if (objInvoke == obj) {
            return;
        }
        cVar.C(this.f8109a);
        this.f8113e.b(cVar, objInvoke);
    }
}

package com.fasterxml.jackson.databind.deser.std;

import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class j0 extends l0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f7608k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Executable f7609l;

    public j0(Constructor constructor) {
        super(-1, constructor.getDeclaringClass(), null);
        this.f7609l = constructor;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.l0
    public final Object b(p015c2.f fVar, String str) {
        switch (this.f7608k) {
            case 0:
                return ((Constructor) this.f7609l).newInstance(str);
            default:
                return ((Method) this.f7609l).invoke(null, str);
        }
    }

    public j0(Method method) {
        super(-1, method.getDeclaringClass(), null);
        this.f7609l = method;
    }
}

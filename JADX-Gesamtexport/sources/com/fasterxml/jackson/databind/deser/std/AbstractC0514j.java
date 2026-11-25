package com.fasterxml.jackson.databind.deser.std;

import B.AbstractC0013g0;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import p015c2.C0474e;
import p109u2.EnumC0962a;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.deser.std.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0514j extends g0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p015c2.h f7605h;
    public final p032f2.l i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f7606j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Boolean f7607k;

    public AbstractC0514j(p015c2.h hVar, p032f2.l lVar, Boolean bool) {
        super(hVar);
        this.f7605h = hVar;
        this.f7607k = bool;
        this.i = lVar;
        this.f7606j = p037g2.q.a(lVar);
    }

    public static void e(p015c2.f fVar, Exception exc, Object obj, String str) throws IOException {
        Throwable cause = exc;
        while ((cause instanceof InvocationTargetException) && cause.getCause() != null) {
            cause = cause.getCause();
        }
        p109u2.i.C(cause);
        if (fVar != null && !fVar.B0(p015c2.g.WRAP_EXCEPTIONS)) {
            p109u2.i.E(cause);
        }
        if ((cause instanceof IOException) && !(cause instanceof JsonMappingException)) {
            throw ((IOException) cause);
        }
        if (str == null) {
            str = "N/A";
        }
        int i = JsonMappingException.f7531k;
        throw JsonMappingException.h(cause, new p015c2.k(str, obj));
    }

    public abstract p015c2.j d();

    @Override // p015c2.j
    public final p032f2.r findBackReference(String str) {
        p015c2.j jVarD = d();
        if (jVarD != null) {
            return jVarD.findBackReference(str);
        }
        throw new IllegalArgumentException(AbstractC0013g0.j("Cannot handle managed/back reference '", str, "': type: container deserializer of type ", getClass().getName(), " returned null for 'getContentDeserializer()'"));
    }

    @Override // p015c2.j
    public EnumC0962a getEmptyAccessPattern() {
        return EnumC0962a.f12678j;
    }

    @Override // p015c2.j
    public Object getEmptyValue(p015c2.f fVar) throws JsonMappingException {
        p032f2.t valueInstantiator = getValueInstantiator();
        if (valueInstantiator == null || !valueInstantiator.j()) {
            fVar.O(String.format("Cannot create empty instance of %s, no default Creator", getValueType()));
            throw null;
        }
        try {
            return valueInstantiator.v(fVar);
        } catch (IOException e6) {
            p109u2.i.B(fVar, e6);
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.std.g0
    public p015c2.h getValueType() {
        return this.f7605h;
    }

    @Override // p015c2.j
    public final Boolean supportsUpdate(C0474e c0474e) {
        return Boolean.TRUE;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC0514j(AbstractC0514j abstractC0514j, p032f2.l lVar, Boolean bool) {
        p015c2.h hVar = abstractC0514j.f7605h;
        super(hVar);
        this.f7605h = hVar;
        this.i = lVar;
        this.f7607k = bool;
        this.f7606j = p037g2.q.a(lVar);
    }
}

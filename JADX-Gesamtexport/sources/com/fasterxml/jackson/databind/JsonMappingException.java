package com.fasterxml.jackson.databind;

import T1.i;
import com.fasterxml.jackson.core.JacksonException;
import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import p012c.k;

/* JADX INFO: loaded from: classes.dex */
public class JsonMappingException extends DatabindException {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f7531k = 0;
    public LinkedList i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public transient Closeable f7532j;

    public JsonMappingException(Closeable closeable, String str) {
        super(str);
        this.f7532j = closeable;
        if (closeable instanceof i) {
            this.f7530h = ((i) closeable).m0();
        }
    }

    public static JsonMappingException g(IOException iOException) {
        return new JsonMappingException(null, k.s("Unexpected IOException (of type ", iOException.getClass().getName(), "): ", p109u2.i.i(iOException)));
    }

    public static JsonMappingException h(Throwable th, p015c2.k kVar) {
        JsonMappingException jsonMappingException;
        Object objC;
        if (th instanceof JsonMappingException) {
            jsonMappingException = (JsonMappingException) th;
        } else {
            String strI = p109u2.i.i(th);
            if (strI == null || strI.isEmpty()) {
                strI = "(was " + th.getClass().getName() + ")";
            }
            jsonMappingException = new JsonMappingException((!(th instanceof JacksonException) || (objC = ((JacksonException) th).c()) == null) ? null : (Closeable) objC, strI, th);
        }
        if (jsonMappingException.i == null) {
            jsonMappingException.i = new LinkedList();
        }
        if (jsonMappingException.i.size() < 1000) {
            jsonMappingException.i.addFirst(kVar);
        }
        return jsonMappingException;
    }

    public static JsonMappingException i(Throwable th, Object obj, int i) {
        p015c2.k kVar = new p015c2.k();
        kVar.f7286h = obj;
        kVar.f7287j = i;
        return h(th, kVar);
    }

    @Override // com.fasterxml.jackson.core.JsonProcessingException, com.fasterxml.jackson.core.JacksonException
    public final Object c() {
        return this.f7532j;
    }

    @Override // com.fasterxml.jackson.databind.DatabindException
    public final void e(String str, Object obj) {
        p015c2.k kVar = new p015c2.k(str, obj);
        if (this.i == null) {
            this.i = new LinkedList();
        }
        if (this.i.size() < 1000) {
            this.i.addFirst(kVar);
        }
    }

    public final String f() {
        String message = super.getMessage();
        if (this.i == null) {
            return message;
        }
        StringBuilder sb = message == null ? new StringBuilder() : new StringBuilder(message);
        sb.append(" (through reference chain: ");
        LinkedList linkedList = this.i;
        if (linkedList != null) {
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                sb.append(((p015c2.k) it.next()).toString());
                if (it.hasNext()) {
                    sb.append("->");
                }
            }
        }
        sb.append(')');
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return f();
    }

    @Override // com.fasterxml.jackson.core.JsonProcessingException, java.lang.Throwable
    public String getMessage() {
        return f();
    }

    @Override // com.fasterxml.jackson.core.JsonProcessingException, java.lang.Throwable
    public final String toString() {
        return getClass().getName() + ": " + getMessage();
    }

    public JsonMappingException(Closeable closeable, String str, Throwable th) {
        super(str, null, th);
        this.f7532j = closeable;
        if (th instanceof JacksonException) {
            this.f7530h = ((JacksonException) th).a();
        } else if (closeable instanceof i) {
            this.f7530h = ((i) closeable).m0();
        }
    }
}

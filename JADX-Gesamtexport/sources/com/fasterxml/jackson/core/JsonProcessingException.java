package com.fasterxml.jackson.core;

import T1.f;

/* JADX INFO: loaded from: classes.dex */
public class JsonProcessingException extends JacksonException {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public f f7530h;

    public JsonProcessingException(String str, f fVar, Throwable th) {
        super(str, th);
        this.f7530h = fVar;
    }

    @Override // com.fasterxml.jackson.core.JacksonException
    public final f a() {
        return this.f7530h;
    }

    @Override // com.fasterxml.jackson.core.JacksonException
    public final String b() {
        return super.getMessage();
    }

    @Override // com.fasterxml.jackson.core.JacksonException
    public Object c() {
        return null;
    }

    public String d() {
        return null;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        if (message == null) {
            message = "N/A";
        }
        f fVar = this.f7530h;
        String strD = d();
        if (fVar == null && strD == null) {
            return message;
        }
        StringBuilder sb = new StringBuilder(100);
        sb.append(message);
        if (strD != null) {
            sb.append(strD);
        }
        if (fVar != null) {
            sb.append("\n at ");
            sb.append(fVar.toString());
        }
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public String toString() {
        return getClass().getName() + ": " + getMessage();
    }
}

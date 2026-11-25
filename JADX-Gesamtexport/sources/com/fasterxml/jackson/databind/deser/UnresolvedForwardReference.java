package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.databind.JsonMappingException;

/* JADX INFO: loaded from: classes.dex */
public class UnresolvedForwardReference extends JsonMappingException {
    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        synchronized (this) {
        }
        return this;
    }

    @Override // com.fasterxml.jackson.databind.JsonMappingException, com.fasterxml.jackson.core.JsonProcessingException, java.lang.Throwable
    public final String getMessage() {
        return f();
    }
}

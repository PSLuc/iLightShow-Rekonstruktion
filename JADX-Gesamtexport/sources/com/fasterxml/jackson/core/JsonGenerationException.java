package com.fasterxml.jackson.core;

import T1.e;
import com.fasterxml.jackson.core.exc.StreamWriteException;

/* JADX INFO: loaded from: classes.dex */
public class JsonGenerationException extends StreamWriteException {
    public JsonGenerationException(String str, e eVar) {
        super(str, null, null);
        this.i = eVar;
    }

    @Override // com.fasterxml.jackson.core.exc.StreamWriteException, com.fasterxml.jackson.core.JsonProcessingException, com.fasterxml.jackson.core.JacksonException
    public final Object c() {
        return this.i;
    }

    @Override // com.fasterxml.jackson.core.exc.StreamWriteException
    /* JADX INFO: renamed from: e */
    public final e c() {
        return this.i;
    }
}

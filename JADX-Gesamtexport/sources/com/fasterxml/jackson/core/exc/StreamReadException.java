package com.fasterxml.jackson.core.exc;

import T1.i;
import com.fasterxml.jackson.core.JsonProcessingException;

/* JADX INFO: loaded from: classes.dex */
public abstract class StreamReadException extends JsonProcessingException {
    public transient i i;

    public StreamReadException(i iVar, String str) {
        super(str, iVar == null ? null : iVar.M(), null);
        this.i = iVar;
    }

    @Override // com.fasterxml.jackson.core.JsonProcessingException, com.fasterxml.jackson.core.JacksonException
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public i c() {
        return this.i;
    }
}

package com.fasterxml.jackson.core.exc;

import T1.e;
import com.fasterxml.jackson.core.JsonProcessingException;

/* JADX INFO: loaded from: classes.dex */
public abstract class StreamWriteException extends JsonProcessingException {
    public transient e i;

    @Override // com.fasterxml.jackson.core.JsonProcessingException, com.fasterxml.jackson.core.JacksonException
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public e c() {
        return this.i;
    }
}

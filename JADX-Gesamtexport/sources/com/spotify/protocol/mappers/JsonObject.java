package com.spotify.protocol.mappers;

/* JADX INFO: loaded from: classes.dex */
public interface JsonObject {
    <T> T getAs(Class<T> cls);

    String toJson();
}

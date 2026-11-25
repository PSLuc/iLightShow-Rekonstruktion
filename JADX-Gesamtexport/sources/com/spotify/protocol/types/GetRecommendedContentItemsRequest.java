package com.spotify.protocol.types;

import S1.I;
import S1.InterfaceC0361x;
import p110u3.c;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC0361x(ignoreUnknown = true)
public class GetRecommendedContentItemsRequest {

    @c("type")
    @I("type")
    public final String type;

    public GetRecommendedContentItemsRequest() {
        this("");
    }

    public GetRecommendedContentItemsRequest(String str) {
        this.type = str;
    }
}

package com.spotify.protocol.types;

import B.AbstractC0013g0;
import S1.I;
import S1.InterfaceC0361x;
import p110u3.c;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC0361x(ignoreUnknown = true)
public class ChildrenPageRequest implements Item {

    @c("limit")
    @I("limit")
    public final int limit;

    @c("offset")
    @I("offset")
    public final int offset;

    @c("parent_id")
    @I("parent_id")
    public final String parentId;

    private ChildrenPageRequest() {
        this(null, 0, 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChildrenPageRequest)) {
            return false;
        }
        ChildrenPageRequest childrenPageRequest = (ChildrenPageRequest) obj;
        if (this.limit != childrenPageRequest.limit || this.offset != childrenPageRequest.offset) {
            return false;
        }
        String str = this.parentId;
        if (str != null) {
            return str.equals(childrenPageRequest.parentId);
        }
        return childrenPageRequest.parentId == null;
    }

    public int hashCode() {
        String str = this.parentId;
        return ((((str != null ? str.hashCode() : 0) * 31) + this.limit) * 31) + this.offset;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ChildrenPageRequest{parentId='");
        sb.append(this.parentId);
        sb.append("', limit=");
        sb.append(this.limit);
        sb.append(", offset=");
        return AbstractC0013g0.k(sb, this.offset, '}');
    }

    public ChildrenPageRequest(String str, int i, int i3) {
        this.parentId = str;
        this.limit = i;
        this.offset = i3;
    }
}

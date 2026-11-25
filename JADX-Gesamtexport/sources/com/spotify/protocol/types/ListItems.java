package com.spotify.protocol.types;

import B.AbstractC0013g0;
import S1.I;
import S1.InterfaceC0361x;
import java.util.Arrays;
import p110u3.c;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC0361x(ignoreUnknown = true)
public class ListItems implements Item {

    @c("items")
    @I("items")
    public final ListItem[] items;

    @c("limit")
    @I("limit")
    public final int limit;

    @c("offset")
    @I("offset")
    public final int offset;

    @c("total")
    @I("total")
    public final int total;

    private ListItems() {
        this(0, 0, 0, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListItems)) {
            return false;
        }
        ListItems listItems = (ListItems) obj;
        if (this.limit == listItems.limit && this.offset == listItems.offset && this.total == listItems.total) {
            return Arrays.equals(this.items, listItems.items);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.limit * 31) + this.offset) * 31) + this.total) * 31) + Arrays.hashCode(this.items);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ListItems{limit=");
        sb.append(this.limit);
        sb.append(", offset=");
        sb.append(this.offset);
        sb.append(", total=");
        sb.append(this.total);
        sb.append(", items=");
        return AbstractC0013g0.m(sb, Arrays.toString(this.items), '}');
    }

    public ListItems(int i, int i3, int i6, ListItem[] listItemArr) {
        this.limit = i;
        this.offset = i3;
        this.total = i6;
        this.items = listItemArr;
    }
}

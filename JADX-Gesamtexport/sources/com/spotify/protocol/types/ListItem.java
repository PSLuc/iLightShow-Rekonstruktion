package com.spotify.protocol.types;

import S1.I;
import S1.InterfaceC0361x;
import com.spotify.sdk.android.auth.AuthorizationClient;
import p110u3.c;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC0361x(ignoreUnknown = true)
public class ListItem implements Item {

    @c("has_children")
    @I("has_children")
    public final boolean hasChildren;

    @c(AuthorizationClient.PlayStoreParams.ID)
    @I(AuthorizationClient.PlayStoreParams.ID)
    public final String id;

    @c("image_id")
    @I("image_id")
    public final ImageUri imageUri;

    @c("playable")
    @I("playable")
    public final boolean playable;

    @c("subtitle")
    @I("subtitle")
    public final String subtitle;

    @c("title")
    @I("title")
    public final String title;

    @c("uri")
    @I("uri")
    public final String uri;

    private ListItem() {
        this(null, null, null, null, null, false, false);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListItem)) {
            return false;
        }
        ListItem listItem = (ListItem) obj;
        if (this.playable != listItem.playable || this.hasChildren != listItem.hasChildren) {
            return false;
        }
        String str = this.id;
        if (str == null ? listItem.id != null : !str.equals(listItem.id)) {
            return false;
        }
        String str2 = this.uri;
        if (str2 == null ? listItem.uri != null : !str2.equals(listItem.uri)) {
            return false;
        }
        ImageUri imageUri = this.imageUri;
        if (imageUri == null ? listItem.imageUri != null : !imageUri.equals(listItem.imageUri)) {
            return false;
        }
        String str3 = this.title;
        if (str3 == null ? listItem.title != null : !str3.equals(listItem.title)) {
            return false;
        }
        String str4 = this.subtitle;
        if (str4 != null) {
            return str4.equals(listItem.subtitle);
        }
        return listItem.subtitle == null;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.uri;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        ImageUri imageUri = this.imageUri;
        int iHashCode3 = (iHashCode2 + (imageUri != null ? imageUri.hashCode() : 0)) * 31;
        String str3 = this.title;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.subtitle;
        return ((((iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31) + (this.playable ? 1 : 0)) * 31) + (this.hasChildren ? 1 : 0);
    }

    public String toString() {
        return "ListItem{id='" + this.id + "', uri='" + this.uri + "', imageId='" + this.imageUri + "', title='" + this.title + "', subtitle='" + this.subtitle + "', playable=" + this.playable + ", hasChildren=" + this.hasChildren + '}';
    }

    public ListItem(String str, String str2, ImageUri imageUri, String str3, String str4, boolean z5, boolean z6) {
        this.id = str;
        this.uri = str2;
        this.imageUri = imageUri;
        this.title = str3;
        this.subtitle = str4;
        this.playable = z5;
        this.hasChildren = z6;
    }
}

package com.spotify.protocol.types;

import B.AbstractC0013g0;
import S1.I;
import S1.InterfaceC0361x;
import com.spotify.sdk.android.auth.AuthorizationClient;
import java.util.List;
import p110u3.c;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC0361x(ignoreUnknown = true)
public class Info implements Item {

    @c("category")
    @I("category")
    public final String category;

    @c("default_image_height")
    @I("default_image_height")
    public final int defaultImageHeight;

    @c("default_image_width")
    @I("default_image_width")
    public final int defaultImageWidth;

    @c("default_thumbnail_image_height")
    @I("default_thumbnail_image_height")
    public final int defaultThumbnailImageHeight;

    @c("default_thumbnail_image_width")
    @I("default_thumbnail_image_width")
    public final int defaultThumbnailImageWidth;

    @c(AuthorizationClient.PlayStoreParams.ID)
    @I(AuthorizationClient.PlayStoreParams.ID)
    public final String id;

    @c("image_type")
    @I("image_type")
    public final String imageType;

    @c("model")
    @I("model")
    public final String model;

    @c("name")
    @I("name")
    public final String name;

    @c("protocol_version")
    @I("protocol_version")
    public final int protocolVersion;

    @c("required_features")
    @I("required_features")
    public final List<String> requiredFeatures;

    @c("version")
    @I("version")
    public final String version;

    private Info() {
        this(0, null, null, null, null, null, null, null, 0, 0, 0, 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Info)) {
            return false;
        }
        Info info = (Info) obj;
        if (this.protocolVersion != info.protocolVersion || this.defaultImageHeight != info.defaultImageHeight || this.defaultImageWidth != info.defaultImageWidth || this.defaultThumbnailImageHeight != info.defaultThumbnailImageHeight || this.defaultThumbnailImageWidth != info.defaultThumbnailImageWidth) {
            return false;
        }
        String str = this.id;
        if (str == null ? info.id != null : !str.equals(info.id)) {
            return false;
        }
        String str2 = this.name;
        if (str2 == null ? info.name != null : !str2.equals(info.name)) {
            return false;
        }
        String str3 = this.model;
        if (str3 == null ? info.model != null : !str3.equals(info.model)) {
            return false;
        }
        String str4 = this.category;
        if (str4 == null ? info.category != null : !str4.equals(info.category)) {
            return false;
        }
        String str5 = this.version;
        if (str5 == null ? info.version != null : !str5.equals(info.version)) {
            return false;
        }
        String str6 = this.imageType;
        if (str6 == null ? info.imageType != null : !str6.equals(info.imageType)) {
            return false;
        }
        List<String> list = this.requiredFeatures;
        return list == null ? info.requiredFeatures == null : list.equals(info.requiredFeatures);
    }

    public int hashCode() {
        int i = this.protocolVersion * 31;
        String str = this.id;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.model;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.category;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.version;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.imageType;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        List<String> list = this.requiredFeatures;
        return ((((((((iHashCode6 + (list != null ? list.hashCode() : 0)) * 31) + this.defaultImageHeight) * 31) + this.defaultImageWidth) * 31) + this.defaultThumbnailImageHeight) * 31) + this.defaultThumbnailImageWidth;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Info{protocolVersion=");
        sb.append(this.protocolVersion);
        sb.append(", id='");
        sb.append(this.id);
        sb.append("', name='");
        sb.append(this.name);
        sb.append("', model='");
        sb.append(this.model);
        sb.append("', category='");
        sb.append(this.category);
        sb.append("', version='");
        sb.append(this.version);
        sb.append("', imageType='");
        sb.append(this.imageType);
        sb.append("', requiredFeatures=");
        sb.append(this.requiredFeatures);
        sb.append(", defaultImageHeight=");
        sb.append(this.defaultImageHeight);
        sb.append(", defaultImageWidth=");
        sb.append(this.defaultImageWidth);
        sb.append(", defaultThumbnailImageHeight=");
        sb.append(this.defaultThumbnailImageHeight);
        sb.append(", defaultThumbnailImageWidth=");
        return AbstractC0013g0.k(sb, this.defaultThumbnailImageWidth, '}');
    }

    public Info(int i, List<String> list, String str, String str2, String str3, String str4, String str5, String str6, int i3, int i6, int i7, int i8) {
        this.protocolVersion = i;
        this.id = str;
        this.name = str2;
        this.model = str3;
        this.category = str4;
        this.version = str5;
        this.imageType = str6;
        this.requiredFeatures = list;
        this.defaultImageHeight = i6;
        this.defaultImageWidth = i3;
        this.defaultThumbnailImageHeight = i8;
        this.defaultThumbnailImageWidth = i7;
    }
}

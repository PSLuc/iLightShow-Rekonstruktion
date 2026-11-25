package com.philips.lighting.hue.sdk.wrapper.domain.resource.builder;

import com.philips.lighting.hue.sdk.wrapper.domain.Bridge;
import com.philips.lighting.hue.sdk.wrapper.domain.DomainObject;
import com.philips.lighting.hue.sdk.wrapper.domain.resource.ResourceLink;
import com.philips.lighting.hue.sdk.wrapper.domain.resource.ResourceLinkType;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ResourceLinkBuilder {
    private ResourceLink _resourceLink = new ResourceLink();

    public ResourceLinkBuilder addLink(DomainObject domainObject) {
        this._resourceLink.addLink(domainObject);
        return this;
    }

    public ResourceLink build() {
        return this._resourceLink;
    }

    public ResourceLinkBuilder reset() {
        this._resourceLink = new ResourceLink();
        return this;
    }

    public ResourceLinkBuilder setBridge(Bridge bridge) {
        this._resourceLink.setBridge(bridge);
        return this;
    }

    public ResourceLinkBuilder setClassId(Integer num) {
        this._resourceLink.setClassId(num);
        return this;
    }

    public ResourceLinkBuilder setDescription(String str) {
        this._resourceLink.setDescription(str);
        return this;
    }

    public ResourceLinkBuilder setIdentifier(String str) {
        this._resourceLink.setIdentifier(str);
        return this;
    }

    public ResourceLinkBuilder setLinks(List<DomainObject> list) {
        this._resourceLink.setLinks(list);
        return this;
    }

    public ResourceLinkBuilder setName(String str) {
        this._resourceLink.setName(str);
        return this;
    }

    public ResourceLinkBuilder setRecycle(Boolean bool) {
        this._resourceLink.setRecycle(bool);
        return this;
    }

    public ResourceLinkBuilder setResourceLinkType(ResourceLinkType resourceLinkType) {
        this._resourceLink.setResourceLinkType(resourceLinkType);
        return this;
    }

    public ResourceLinkBuilder setClassId(int i) {
        this._resourceLink.setClassId(i);
        return this;
    }

    public ResourceLinkBuilder setRecycle(boolean z5) {
        this._resourceLink.setRecycle(z5);
        return this;
    }
}

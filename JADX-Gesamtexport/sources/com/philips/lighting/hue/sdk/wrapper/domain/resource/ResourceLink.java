package com.philips.lighting.hue.sdk.wrapper.domain.resource;

import com.philips.lighting.hue.sdk.wrapper.SessionObject;
import com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnectionType;
import com.philips.lighting.hue.sdk.wrapper.connection.BridgeResponseCallback;
import com.philips.lighting.hue.sdk.wrapper.connection.BridgeResponseDispatcher;
import com.philips.lighting.hue.sdk.wrapper.domain.Bridge;
import com.philips.lighting.hue.sdk.wrapper.domain.DomainObject;
import com.philips.lighting.hue.sdk.wrapper.domain.DomainType;
import com.philips.lighting.hue.sdk.wrapper.domain.ReturnCode;
import com.philips.lighting.hue.sdk.wrapper.utilities.Executor;
import com.philips.lighting.hue.sdk.wrapper.utilities.NativeTools;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p012c.k;

/* JADX INFO: loaded from: classes.dex */
public class ResourceLink extends SessionObject implements BridgeResource {
    private Integer classId;
    private byte[] description;
    private byte[] identifier;
    private List<DomainObject> links;
    private byte[] name;
    private byte[] owner;
    private Boolean recycle;
    private ResourceLinkType resourceLinkType;

    public ResourceLink() {
        this.identifier = null;
        this.name = null;
        this.description = null;
        this.resourceLinkType = null;
        this.classId = null;
        this.owner = null;
        this.recycle = null;
        this.links = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native void fetchNative(int i, BridgeResponseCallback bridgeResponseCallback);

    private DomainObject[] getLinksAsArray() {
        List<DomainObject> list = this.links;
        if (list == null) {
            return null;
        }
        DomainObject[] domainObjectArr = new DomainObject[list.size()];
        for (int i = 0; i < this.links.size(); i++) {
            domainObjectArr[i] = this.links.get(i);
        }
        return domainObjectArr;
    }

    private int getResourceLinkTypeAsInt() {
        ResourceLinkType resourceLinkType = this.resourceLinkType;
        return resourceLinkType != null ? resourceLinkType.getValue() : ResourceLinkType.UNKNOWN.getValue();
    }

    private void setResourceLinkTypeFromInt(int i) {
        this.resourceLinkType = ResourceLinkType.fromValue(i);
    }

    public void addLink(DomainObject domainObject) {
        if (this.links == null) {
            this.links = new ArrayList();
        }
        this.links.add(domainObject);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.SessionObject, com.philips.lighting.hue.sdk.wrapper.domain.Bridge, com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourceLink resourceLink = (ResourceLink) obj;
        Integer num = this.classId;
        if (num == null) {
            if (resourceLink.classId != null) {
                return false;
            }
        } else if (!num.equals(resourceLink.classId)) {
            return false;
        }
        if (!Arrays.equals(this.description, resourceLink.description) || !Arrays.equals(this.identifier, resourceLink.identifier)) {
            return false;
        }
        List<DomainObject> list = this.links;
        if (list == null) {
            if (resourceLink.links != null) {
                return false;
            }
        } else if (!list.equals(resourceLink.links)) {
            return false;
        }
        if (!Arrays.equals(this.name, resourceLink.name) || !Arrays.equals(this.owner, resourceLink.owner)) {
            return false;
        }
        Boolean bool = this.recycle;
        if (bool == null) {
            if (resourceLink.recycle != null) {
                return false;
            }
        } else if (!bool.equals(resourceLink.recycle)) {
            return false;
        }
        return this.resourceLinkType == resourceLink.resourceLinkType;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public void fetch(BridgeResponseCallback bridgeResponseCallback) {
        fetch(BridgeConnectionType.LOCAL_REMOTE, bridgeResponseCallback);
    }

    public Integer getClassId() {
        return this.classId;
    }

    public String getDescription() {
        return NativeTools.BytesToString(this.description);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public int getDomainType() {
        return getType().getValue();
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public String getIdentifier() {
        return NativeTools.BytesToString(this.identifier);
    }

    public List<DomainObject> getLinks() {
        return this.links;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.resource.BridgeResource
    public String getName() {
        return NativeTools.BytesToString(this.name);
    }

    public String getOwner() {
        return NativeTools.BytesToString(this.owner);
    }

    public Boolean getRecycle() {
        return this.recycle;
    }

    public ResourceLinkType getResourceLinkType() {
        return this.resourceLinkType;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public DomainType getType() {
        return DomainType.RESOURCE_LINK;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.SessionObject, com.philips.lighting.hue.sdk.wrapper.domain.Bridge, com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public int hashCode() {
        Integer num = this.classId;
        int iN = k.n(this.identifier, k.n(this.description, ((num == null ? 0 : num.hashCode()) + 31) * 31, 31), 31);
        List<DomainObject> list = this.links;
        int iN2 = k.n(this.owner, k.n(this.name, (iN + (list == null ? 0 : list.hashCode())) * 31, 31), 31);
        Boolean bool = this.recycle;
        int iHashCode = (iN2 + (bool == null ? 0 : bool.hashCode())) * 31;
        ResourceLinkType resourceLinkType = this.resourceLinkType;
        return iHashCode + (resourceLinkType != null ? resourceLinkType.hashCode() : 0);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public boolean isOfType(DomainType domainType) {
        return domainType == DomainType.RESOURCE || getType() == domainType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public void setBridge(Bridge bridge) {
        setSessionKey(((SessionObject) bridge).getSessionKey());
    }

    public void setClassId(Integer num) {
        this.classId = num;
    }

    public void setDescription(String str) {
        this.description = NativeTools.StringToBytes(str);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public void setIdentifier(String str) {
        this.identifier = NativeTools.StringToBytes(str);
    }

    public void setLinks(List<DomainObject> list) {
        this.links = list;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.resource.BridgeResource
    public void setName(String str) {
        this.name = NativeTools.StringToBytes(str);
    }

    public void setRecycle(Boolean bool) {
        this.recycle = bool;
    }

    public void setResourceLinkType(ResourceLinkType resourceLinkType) {
        this.resourceLinkType = resourceLinkType;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.SessionObject
    public void syncNative() {
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public void fetch(final BridgeConnectionType bridgeConnectionType, final BridgeResponseCallback bridgeResponseCallback) {
        if (bridgeConnectionType == null) {
            BridgeResponseDispatcher.dispatch(bridgeResponseCallback, null, ReturnCode.NOT_ALLOWED);
        } else {
            Executor.submit(new Runnable() { // from class: com.philips.lighting.hue.sdk.wrapper.domain.resource.ResourceLink.1
                @Override // java.lang.Runnable
                public void run() {
                    ResourceLink.this.fetchNative(bridgeConnectionType.getValue(), bridgeResponseCallback);
                }
            });
        }
    }

    public void setClassId(int i) {
        this.classId = new Integer(i);
    }

    public void setRecycle(boolean z5) {
        this.recycle = new Boolean(z5);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public boolean isOfType(int i) {
        return isOfType(DomainType.fromValue(i));
    }

    public ResourceLink(long j4) {
        super(j4);
        this.identifier = null;
        this.name = null;
        this.description = null;
        this.resourceLinkType = null;
        this.classId = null;
        this.owner = null;
        this.recycle = null;
        this.links = null;
    }
}

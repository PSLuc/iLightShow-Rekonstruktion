package com.philips.lighting.hue.sdk.wrapper.domain.resource;

import com.philips.lighting.hue.sdk.wrapper.utilities.NativeTools;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class GroupStream {
    Boolean active;
    byte[] owner;
    ProxyMode proxyMode;
    byte[] proxyNode;

    public GroupStream() {
        this.active = null;
        this.owner = null;
        this.proxyMode = null;
        this.proxyNode = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        GroupStream groupStream = (GroupStream) obj;
        Boolean bool = this.active;
        if (bool == null) {
            if (groupStream.active != null) {
                return false;
            }
        } else if (!bool.equals(groupStream.active)) {
            return false;
        }
        if (!Arrays.equals(this.owner, groupStream.owner)) {
            return false;
        }
        ProxyMode proxyMode = this.proxyMode;
        if (proxyMode == null) {
            if (groupStream.proxyMode != null) {
                return false;
            }
        } else if (!proxyMode.equals(groupStream.proxyMode)) {
            return false;
        }
        return Arrays.equals(this.proxyNode, groupStream.proxyNode);
    }

    public Boolean getActive() {
        return this.active;
    }

    public String getOwner() {
        return NativeTools.BytesToString(this.owner);
    }

    public ProxyMode getProxyMode() {
        return this.proxyMode;
    }

    public String getProxyNode() {
        return NativeTools.BytesToString(this.proxyNode);
    }

    public void setActive(Boolean bool) {
        this.active = bool;
    }

    public void setOwner(String str) {
        this.owner = NativeTools.StringToBytes(str);
    }

    public void setProxyMode(ProxyMode proxyMode) {
        this.proxyMode = proxyMode;
    }

    public void setProxyNode(String str) {
        this.proxyNode = NativeTools.StringToBytes(str);
    }

    public GroupStream(Boolean bool, String str, ProxyMode proxyMode, String str2) {
        this.owner = null;
        this.proxyMode = null;
        this.proxyNode = null;
        this.active = bool;
        setOwner(str);
        this.proxyMode = proxyMode;
        setProxyNode(str2);
    }
}

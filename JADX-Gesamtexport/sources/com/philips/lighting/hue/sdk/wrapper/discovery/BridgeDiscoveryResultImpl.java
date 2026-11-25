package com.philips.lighting.hue.sdk.wrapper.discovery;

import com.github.fge.jackson.JsonLoader;
import com.philips.lighting.hue.sdk.wrapper.SDKSerializable;
import com.philips.lighting.hue.sdk.wrapper.WrapperObject;
import com.philips.lighting.hue.sdk.wrapper.utilities.JsonMapperProvider;
import java.io.IOException;
import javax.annotation.Nonnull;
import p015c2.u;
import p087q2.r;

/* JADX INFO: loaded from: classes.dex */
public final class BridgeDiscoveryResultImpl extends WrapperObject implements BridgeDiscoveryResult {
    public BridgeDiscoveryResultImpl() {
        create();
    }

    public native void create();

    public native void create(@Nonnull String str, @Nonnull String str2, @Nonnull String str3, @Nonnull String str4);

    @Override // com.philips.lighting.hue.sdk.wrapper.WrapperObject
    public native void delete();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && BridgeDiscoveryResultImpl.class == obj.getClass()) {
            BridgeDiscoveryResult bridgeDiscoveryResult = (BridgeDiscoveryResult) obj;
            if (getIp() == null ? bridgeDiscoveryResult.getIp() != null : !getIp().equals(bridgeDiscoveryResult.getIp())) {
                return false;
            }
            if (getUniqueId() == null ? bridgeDiscoveryResult.getUniqueId() != null : !getUniqueId().equals(bridgeDiscoveryResult.getUniqueId())) {
                return false;
            }
            if (getModelId() == null ? bridgeDiscoveryResult.getModelId() != null : !getModelId().equals(bridgeDiscoveryResult.getModelId())) {
                return false;
            }
            if (getApiVersion() != null) {
                return getApiVersion().equals(bridgeDiscoveryResult.getApiVersion());
            }
            if (bridgeDiscoveryResult.getApiVersion() == null) {
                return true;
            }
        }
        return false;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.discovery.BridgeDiscoveryResult
    @Nonnull
    public final native String getApiVersion();

    @Override // com.philips.lighting.hue.sdk.wrapper.discovery.BridgeDiscoveryResult
    @Deprecated
    public String getIP() {
        return getIp();
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.discovery.BridgeDiscoveryResult
    @Nonnull
    public final native String getIp();

    @Override // com.philips.lighting.hue.sdk.wrapper.discovery.BridgeDiscoveryResult
    @Nonnull
    public final native String getModelId();

    @Override // com.philips.lighting.hue.sdk.wrapper.discovery.BridgeDiscoveryResult
    @Deprecated
    public String getUniqueID() {
        return getUniqueId();
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.discovery.BridgeDiscoveryResult
    @Nonnull
    public final native String getUniqueId();

    public int hashCode() {
        return ((((((getIp() != null ? getIp().hashCode() : 0) * 31) + (getUniqueId() != null ? getUniqueId().hashCode() : 0)) * 31) + (getModelId() != null ? getModelId().hashCode() : 0)) * 31) + (getApiVersion() != null ? getApiVersion().hashCode() : 0);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.discovery.BridgeDiscoveryResult
    public final native void setApiVersion(@Nonnull String str);

    @Override // com.philips.lighting.hue.sdk.wrapper.discovery.BridgeDiscoveryResult
    @Deprecated
    public void setIP(String str) {
        setIp(str);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.discovery.BridgeDiscoveryResult
    public final native void setIp(@Nonnull String str);

    @Override // com.philips.lighting.hue.sdk.wrapper.discovery.BridgeDiscoveryResult
    public final native void setModelId(@Nonnull String str);

    @Override // com.philips.lighting.hue.sdk.wrapper.discovery.BridgeDiscoveryResult
    @Deprecated
    public void setUniqueID(String str) {
        setUniqueId(str);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.discovery.BridgeDiscoveryResult
    public final native void setUniqueId(@Nonnull String str);

    @Override // com.philips.lighting.hue.sdk.wrapper.SDKSerializable
    @Nonnull
    public String toString() {
        if (!SDKSerializable.isSerializationEnabled().booleanValue()) {
            return super.toString();
        }
        u jsonMapper = JsonMapperProvider.getJsonMapper();
        r rVarK = jsonMapper.k();
        try {
            String uniqueId = getUniqueId();
            if (uniqueId != null) {
                try {
                    rVarK.t("uniqueId", JsonLoader.fromString(uniqueId.toString()));
                } catch (IOException unused) {
                    rVarK.q("uniqueId", uniqueId.toString());
                }
            } else {
                rVarK.s("uniqueId");
            }
            String ip = getIp();
            if (ip != null) {
                try {
                    rVarK.t("ip", JsonLoader.fromString(ip.toString()));
                } catch (IOException unused2) {
                    rVarK.q("ip", ip.toString());
                }
            } else {
                rVarK.s("ip");
            }
            String apiVersion = getApiVersion();
            if (apiVersion != null) {
                try {
                    rVarK.t("apiVersion", JsonLoader.fromString(apiVersion.toString()));
                } catch (IOException unused3) {
                    rVarK.q("apiVersion", apiVersion.toString());
                }
            } else {
                rVarK.s("apiVersion");
            }
            String modelId = getModelId();
            if (modelId != null) {
                try {
                    rVarK.t("modelId", JsonLoader.fromString(modelId.toString()));
                } catch (IOException unused4) {
                    rVarK.q("modelId", modelId.toString());
                }
            } else {
                rVarK.s("modelId");
            }
            return jsonMapper.n().d(rVarK);
        } catch (Exception e6) {
            return e6.toString();
        }
    }

    public BridgeDiscoveryResultImpl(@Nonnull String str, @Nonnull String str2, @Nonnull String str3, @Nonnull String str4) {
        create(str, str2, str3, str4);
    }

    public BridgeDiscoveryResultImpl(WrapperObject.Scope scope) {
    }
}

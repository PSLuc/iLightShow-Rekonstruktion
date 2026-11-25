package com.philips.lighting.hue.sdk.wrapper.domain;

import com.philips.lighting.hue.sdk.wrapper.domain.device.DeviceConfiguration;
import com.philips.lighting.hue.sdk.wrapper.utilities.NativeTools;
import java.util.Arrays;
import p012c.k;

/* JADX INFO: loaded from: classes.dex */
public class BridgeConfiguration implements DeviceConfiguration {
    private byte[] name = null;
    private byte[] modelId = null;
    private byte[] uniqueId = null;
    private byte[] manufacturerName = null;
    private BridgeHomekitAttributes homekitAttributes = null;
    private BridgeNetworkConfiguration networkConfiguration = null;
    private BridgeTimeConfiguration timeConfiguration = null;
    private BridgeVersion version = null;
    private SystemSoftwareUpdate systemSoftwareUpdate = null;
    private Boolean linkButton = null;
    private BridgePortalConfiguration portalConfiguration = null;
    private BridgeInternetServicesConfiguration internetServicesConfiguration = null;
    private Boolean reboot = null;
    private Boolean touchlink = null;
    private BridgeBackup backup = null;
    private Boolean factoryNew = null;
    private byte[] replacesBridgeId = null;
    private byte[] starterKitId = null;

    public boolean equals(Object obj) {
        BridgeInternetServicesConfiguration bridgeInternetServicesConfiguration;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BridgeConfiguration bridgeConfiguration = (BridgeConfiguration) obj;
        BridgeBackup bridgeBackup = this.backup;
        if (bridgeBackup == null) {
            if (bridgeConfiguration.backup != null) {
                return false;
            }
        } else if (!bridgeBackup.equals(bridgeConfiguration.backup)) {
            return false;
        }
        Boolean bool = this.factoryNew;
        if (bool == null) {
            if (bridgeConfiguration.factoryNew != null) {
                return false;
            }
        } else if (!bool.equals(bridgeConfiguration.factoryNew)) {
            return false;
        }
        BridgeHomekitAttributes bridgeHomekitAttributes = this.homekitAttributes;
        if (bridgeHomekitAttributes == null) {
            if (bridgeConfiguration.homekitAttributes != null) {
                return false;
            }
        } else if (!bridgeHomekitAttributes.equals(bridgeConfiguration.homekitAttributes)) {
            return false;
        }
        Boolean bool2 = this.linkButton;
        if (bool2 == null) {
            if (bridgeConfiguration.linkButton != null) {
                return false;
            }
        } else if (!bool2.equals(bridgeConfiguration.linkButton)) {
            return false;
        }
        if (!Arrays.equals(this.manufacturerName, bridgeConfiguration.manufacturerName) || !Arrays.equals(this.modelId, bridgeConfiguration.modelId) || !Arrays.equals(this.name, bridgeConfiguration.name)) {
            return false;
        }
        BridgeNetworkConfiguration bridgeNetworkConfiguration = this.networkConfiguration;
        if (bridgeNetworkConfiguration == null) {
            if (bridgeConfiguration.networkConfiguration != null) {
                return false;
            }
        } else if (!bridgeNetworkConfiguration.equals(bridgeConfiguration.networkConfiguration)) {
            return false;
        }
        BridgePortalConfiguration bridgePortalConfiguration = this.portalConfiguration;
        if (bridgePortalConfiguration == null) {
            if (bridgeConfiguration.portalConfiguration != null) {
                return false;
            }
        } else if (!bridgePortalConfiguration.equals(bridgeConfiguration.portalConfiguration)) {
            return false;
        }
        Boolean bool3 = this.reboot;
        if (bool3 == null) {
            if (bridgeConfiguration.reboot != null) {
                return false;
            }
        } else if (!bool3.equals(bridgeConfiguration.reboot)) {
            return false;
        }
        if (!Arrays.equals(this.replacesBridgeId, bridgeConfiguration.replacesBridgeId) || !Arrays.equals(this.starterKitId, bridgeConfiguration.starterKitId)) {
            return false;
        }
        SystemSoftwareUpdate systemSoftwareUpdate = this.systemSoftwareUpdate;
        if (systemSoftwareUpdate == null) {
            if (bridgeConfiguration.systemSoftwareUpdate != null) {
                return false;
            }
        } else if (!systemSoftwareUpdate.equals(bridgeConfiguration.systemSoftwareUpdate)) {
            return false;
        }
        BridgeTimeConfiguration bridgeTimeConfiguration = this.timeConfiguration;
        if (bridgeTimeConfiguration == null) {
            if (bridgeConfiguration.timeConfiguration != null) {
                return false;
            }
        } else if (!bridgeTimeConfiguration.equals(bridgeConfiguration.timeConfiguration)) {
            return false;
        }
        Boolean bool4 = this.touchlink;
        if (bool4 == null) {
            if (bridgeConfiguration.touchlink != null) {
                return false;
            }
        } else if (!bool4.equals(bridgeConfiguration.touchlink)) {
            return false;
        }
        if (!Arrays.equals(this.uniqueId, bridgeConfiguration.uniqueId)) {
            return false;
        }
        BridgeVersion bridgeVersion = this.version;
        if (bridgeVersion == null) {
            if (bridgeConfiguration.version != null) {
                return false;
            }
        } else if (!bridgeVersion.equals(bridgeConfiguration.version)) {
            return false;
        }
        BridgeInternetServicesConfiguration bridgeInternetServicesConfiguration2 = this.internetServicesConfiguration;
        return bridgeInternetServicesConfiguration2 != null || ((bridgeInternetServicesConfiguration = bridgeConfiguration.internetServicesConfiguration) == null && bridgeInternetServicesConfiguration2.equals(bridgeInternetServicesConfiguration));
    }

    public BridgeBackup getBackup() {
        return this.backup;
    }

    public Boolean getFactoryNew() {
        return this.factoryNew;
    }

    public BridgeHomekitAttributes getHomekitAttributes() {
        return this.homekitAttributes;
    }

    public BridgeInternetServicesConfiguration getInternetServicesConfiguration() {
        return this.internetServicesConfiguration;
    }

    public Boolean getLinkButton() {
        return this.linkButton;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.DeviceConfiguration
    public String getManufacturerName() {
        return NativeTools.BytesToString(this.manufacturerName);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.DeviceConfiguration
    public String getModelIdentifier() {
        return NativeTools.BytesToString(this.modelId);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.DeviceConfiguration
    public String getName() {
        return NativeTools.BytesToString(this.name);
    }

    public BridgeNetworkConfiguration getNetworkConfiguration() {
        return this.networkConfiguration;
    }

    public BridgePortalConfiguration getPortalConfiguration() {
        return this.portalConfiguration;
    }

    public String getReplacesBridgeId() {
        return NativeTools.BytesToString(this.replacesBridgeId);
    }

    public String getStarterKitId() {
        return NativeTools.BytesToString(this.starterKitId);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.DeviceConfiguration
    public String getSwVersion() {
        BridgeVersion bridgeVersion = this.version;
        if (bridgeVersion != null) {
            return bridgeVersion.getFirmwareVersion();
        }
        return null;
    }

    public SystemSoftwareUpdate getSystemSoftwareUpdate() {
        return this.systemSoftwareUpdate;
    }

    public BridgeTimeConfiguration getTimeConfiguration() {
        return this.timeConfiguration;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.DeviceConfiguration
    public DomainType getType() {
        return DomainType.BRIDGE_CONFIGURATION;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.DeviceConfiguration
    public String getUniqueIdentifier() {
        return NativeTools.BytesToString(this.uniqueId);
    }

    public BridgeVersion getVersion() {
        return this.version;
    }

    public int hashCode() {
        BridgeBackup bridgeBackup = this.backup;
        int iHashCode = ((bridgeBackup == null ? 0 : bridgeBackup.hashCode()) + 31) * 31;
        Boolean bool = this.factoryNew;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        BridgeHomekitAttributes bridgeHomekitAttributes = this.homekitAttributes;
        int iHashCode3 = (iHashCode2 + (bridgeHomekitAttributes == null ? 0 : bridgeHomekitAttributes.hashCode())) * 31;
        Boolean bool2 = this.linkButton;
        int iN = k.n(this.name, k.n(this.modelId, k.n(this.manufacturerName, (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31, 31), 31), 31);
        BridgeNetworkConfiguration bridgeNetworkConfiguration = this.networkConfiguration;
        int iHashCode4 = (iN + (bridgeNetworkConfiguration == null ? 0 : bridgeNetworkConfiguration.hashCode())) * 31;
        BridgePortalConfiguration bridgePortalConfiguration = this.portalConfiguration;
        int iHashCode5 = (iHashCode4 + (bridgePortalConfiguration == null ? 0 : bridgePortalConfiguration.hashCode())) * 31;
        Boolean bool3 = this.reboot;
        int iN2 = k.n(this.starterKitId, k.n(this.replacesBridgeId, (iHashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31, 31), 31);
        SystemSoftwareUpdate systemSoftwareUpdate = this.systemSoftwareUpdate;
        int iHashCode6 = (iN2 + (systemSoftwareUpdate == null ? 0 : systemSoftwareUpdate.hashCode())) * 31;
        BridgeTimeConfiguration bridgeTimeConfiguration = this.timeConfiguration;
        int iHashCode7 = (iHashCode6 + (bridgeTimeConfiguration == null ? 0 : bridgeTimeConfiguration.hashCode())) * 31;
        Boolean bool4 = this.touchlink;
        int iN3 = k.n(this.uniqueId, (iHashCode7 + (bool4 == null ? 0 : bool4.hashCode())) * 31, 31);
        BridgeVersion bridgeVersion = this.version;
        int iHashCode8 = (iN3 + (bridgeVersion == null ? 0 : bridgeVersion.hashCode())) * 31;
        BridgeInternetServicesConfiguration bridgeInternetServicesConfiguration = this.internetServicesConfiguration;
        return iHashCode8 + (bridgeInternetServicesConfiguration != null ? bridgeInternetServicesConfiguration.hashCode() : 0);
    }

    public void setBackup(BridgeBackup bridgeBackup) {
        this.backup = bridgeBackup;
    }

    public void setHomekitAttributes(BridgeHomekitAttributes bridgeHomekitAttributes) {
        this.homekitAttributes = bridgeHomekitAttributes;
    }

    public void setLinkButton(Boolean bool) {
        this.linkButton = bool;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.DeviceConfiguration
    public void setName(String str) {
        this.name = NativeTools.StringToBytes(str);
    }

    public void setNetworkConfiguration(BridgeNetworkConfiguration bridgeNetworkConfiguration) {
        this.networkConfiguration = bridgeNetworkConfiguration;
    }

    public void setPortalConfiguration(BridgePortalConfiguration bridgePortalConfiguration) {
        this.portalConfiguration = bridgePortalConfiguration;
    }

    public void setReboot(Boolean bool) {
        this.reboot = bool;
    }

    public void setReplacesBridgeId(String str) {
        this.replacesBridgeId = NativeTools.StringToBytes(str);
    }

    public void setStarterKitId(String str) {
        this.starterKitId = NativeTools.StringToBytes(str);
    }

    public void setSystemSoftwareUpdate(SystemSoftwareUpdate systemSoftwareUpdate) {
        this.systemSoftwareUpdate = systemSoftwareUpdate;
    }

    public void setTimeConfiguration(BridgeTimeConfiguration bridgeTimeConfiguration) {
        this.timeConfiguration = bridgeTimeConfiguration;
    }

    public void setTouchlink(Boolean bool) {
        this.touchlink = this.touchlink;
    }

    public void setLinkButton(boolean z5) {
        this.linkButton = new Boolean(z5);
    }

    public void setReboot(boolean z5) {
        this.reboot = new Boolean(z5);
    }

    public void setTouchlink(boolean z5) {
        this.touchlink = new Boolean(z5);
    }
}

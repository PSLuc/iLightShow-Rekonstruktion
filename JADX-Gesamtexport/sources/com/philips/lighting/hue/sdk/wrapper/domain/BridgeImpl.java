package com.philips.lighting.hue.sdk.wrapper.domain;

import com.philips.lighting.hue.sdk.wrapper.HueLog;
import com.philips.lighting.hue.sdk.wrapper.SessionObject;
import com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnection;
import com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnectionCallback;
import com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnectionType;
import com.philips.lighting.hue.sdk.wrapper.connection.BridgeResponseCallback;
import com.philips.lighting.hue.sdk.wrapper.connection.BridgeResponseDispatcher;
import com.philips.lighting.hue.sdk.wrapper.connection.BridgeStateUpdatedCallback;
import com.philips.lighting.hue.sdk.wrapper.connection.FoundDevicesCallback;
import com.philips.lighting.hue.sdk.wrapper.connection.QueueOptions;
import com.philips.lighting.hue.sdk.wrapper.connection.QueueType;
import com.philips.lighting.hue.sdk.wrapper.domain.device.Device;
import com.philips.lighting.hue.sdk.wrapper.domain.device.DeviceConfiguration;
import com.philips.lighting.hue.sdk.wrapper.domain.device.DeviceSoftwareUpdate;
import com.philips.lighting.hue.sdk.wrapper.domain.device.DeviceState;
import com.philips.lighting.hue.sdk.wrapper.domain.resource.BridgeResource;
import com.philips.lighting.hue.sdk.wrapper.knowledgebase.DeviceInfo;
import com.philips.lighting.hue.sdk.wrapper.utilities.Executor;
import com.philips.lighting.hue.sdk.wrapper.utilities.NativeTools;
import com.philips.lighting.hue.sdk.wrapper.utilities.SessionMemoryManager;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nonnull;
import p012c.k;

/* JADX INFO: loaded from: classes.dex */
public class BridgeImpl extends SessionObject implements Bridge, Device {
    private byte[] name;
    private BridgeState state;

    public BridgeImpl() {
        this((String) null);
    }

    private native int addBridgeConnectionNative(BridgeConnection bridgeConnection);

    private native void backupNative(int i, BridgeResponseCallback bridgeResponseCallback);

    /* JADX INFO: Access modifiers changed from: private */
    public native void createDeviceNative(Device device, int i, BridgeResponseCallback bridgeResponseCallback);

    /* JADX INFO: Access modifiers changed from: private */
    public native int createResourceNative(BridgeResource bridgeResource, int i, BridgeResponseCallback bridgeResponseCallback);

    private native void createSession(String str, boolean z5, boolean z6);

    private native void createSessionWithBridgeProxyReference(long j4);

    /* JADX INFO: Access modifiers changed from: private */
    public native int deleteDeviceNative(Device device, int i, BridgeResponseCallback bridgeResponseCallback);

    /* JADX INFO: Access modifiers changed from: private */
    public native int deleteResourceNative(BridgeResource bridgeResource, int i, BridgeResponseCallback bridgeResponseCallback);

    private native void destroyNative();

    private void dispatch(FoundDevicesCallback foundDevicesCallback, ReturnCode returnCode, String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new SDKError(returnCode.getValue(), str));
        foundDevicesCallback.onDeviceSearchFinished(this, arrayList);
    }

    private native int extendFindNewDevicesNative(String[] strArr);

    /* JADX INFO: Access modifiers changed from: private */
    public native void findNewDevicesNative(String[] strArr, int i, FoundDevicesCallback foundDevicesCallback);

    private native BridgeConnection getBridgeConnectionNative(int i);

    private Device getDevice(int i, String str) {
        if (this.state == null) {
            return null;
        }
        return this.state.getDevice(DomainType.fromValue(i), str);
    }

    private native void restoreNative(byte[] bArr, int i, BridgeResponseCallback bridgeResponseCallback);

    private native int setQueueOptionsNative(QueueOptions queueOptions);

    private native int setQueueTypeNative(int i);

    private native void startBackupNative(int i, BridgeResponseCallback bridgeResponseCallback);

    /* JADX INFO: Access modifiers changed from: private */
    public native void updateConfigurationNative(DeviceConfiguration deviceConfiguration, int i, BridgeResponseCallback bridgeResponseCallback, boolean z5);

    /* JADX INFO: Access modifiers changed from: private */
    public native void updateFirmwareNative(int i, BridgeResponseCallback bridgeResponseCallback);

    private native void updateFirmwareWithFileNative(byte[] bArr, BridgeResponseCallback bridgeResponseCallback);

    /* JADX INFO: Access modifiers changed from: private */
    public native int updateResourceNative(BridgeResource bridgeResource, int i, BridgeResponseCallback bridgeResponseCallback, boolean z5);

    /* JADX INFO: Access modifiers changed from: private */
    public native int updateResourceNative(BridgeResource bridgeResource, BridgeResource bridgeResource2, int i, BridgeResponseCallback bridgeResponseCallback, boolean z5);

    /* JADX INFO: Access modifiers changed from: private */
    public native int updateStateNative(DeviceState deviceState, int i, BridgeResponseCallback bridgeResponseCallback, boolean z5);

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.Bridge
    public ReturnCode addBridgeConnection(BridgeConnection bridgeConnection) {
        return ReturnCode.fromValue(addBridgeConnectionNative(bridgeConnection));
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.Bridge
    public void addBridgeStateUpdatedCallback(BridgeStateUpdatedCallback bridgeStateUpdatedCallback) {
        BridgeState bridgeState = this.state;
        if (bridgeState != null) {
            bridgeState.addUpdatedCallback(bridgeStateUpdatedCallback);
        } else {
            HueLog.e("Bridge", "BridgeState is null, cannot set callback!");
        }
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.Bridge
    public void backup(BridgeConnectionType bridgeConnectionType, BridgeResponseCallback bridgeResponseCallback) {
        if (bridgeConnectionType == null) {
            BridgeConnectionType bridgeConnectionType2 = BridgeConnectionType.NONE;
        } else {
            backupNative(bridgeConnectionType.getValue(), bridgeResponseCallback);
        }
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.Bridge
    public ReturnCode connect() {
        return connect(BridgeConnectionType.LOCAL_REMOTE);
    }

    public native int connectNative(int i);

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.Bridge
    public void createDevice(final Device device, final BridgeConnectionType bridgeConnectionType, final BridgeResponseCallback bridgeResponseCallback) {
        if (bridgeConnectionType == null) {
            BridgeResponseDispatcher.dispatch(bridgeResponseCallback, this, ReturnCode.NULL_PARAMETER);
        } else if (device == null) {
            BridgeResponseDispatcher.dispatch(bridgeResponseCallback, this, ReturnCode.NULL_PARAMETER);
        } else {
            Executor.submit(new Runnable() { // from class: com.philips.lighting.hue.sdk.wrapper.domain.BridgeImpl.7
                @Override // java.lang.Runnable
                public void run() {
                    BridgeImpl.this.createDeviceNative(device, bridgeConnectionType.getValue(), bridgeResponseCallback);
                }
            });
        }
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.Bridge
    public void createResource(final BridgeResource bridgeResource, final BridgeConnectionType bridgeConnectionType, final BridgeResponseCallback bridgeResponseCallback) {
        if (bridgeConnectionType == null) {
            BridgeResponseDispatcher.dispatch(bridgeResponseCallback, this, ReturnCode.NULL_PARAMETER);
        } else if (bridgeResource == null) {
            BridgeResponseDispatcher.dispatch(bridgeResponseCallback, this, ReturnCode.NULL_PARAMETER);
        } else {
            bridgeResource.setBridge(this);
            Executor.submit(new Runnable() { // from class: com.philips.lighting.hue.sdk.wrapper.domain.BridgeImpl.1
                @Override // java.lang.Runnable
                public void run() {
                    BridgeImpl.this.createResourceNative(bridgeResource, bridgeConnectionType.getValue(), bridgeResponseCallback);
                }
            });
        }
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.Bridge
    public void deleteDevice(final Device device, final BridgeConnectionType bridgeConnectionType, final BridgeResponseCallback bridgeResponseCallback) {
        if (bridgeConnectionType == null) {
            BridgeResponseDispatcher.dispatch(bridgeResponseCallback, this, ReturnCode.NULL_PARAMETER);
        } else if (device == null) {
            BridgeResponseDispatcher.dispatch(bridgeResponseCallback, this, ReturnCode.NULL_PARAMETER);
        } else {
            Executor.submit(new Runnable() { // from class: com.philips.lighting.hue.sdk.wrapper.domain.BridgeImpl.8
                @Override // java.lang.Runnable
                public void run() {
                    BridgeImpl.this.deleteDeviceNative(device, bridgeConnectionType.getValue(), bridgeResponseCallback);
                }
            });
        }
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.Bridge
    public void deleteResource(final BridgeResource bridgeResource, final BridgeConnectionType bridgeConnectionType, final BridgeResponseCallback bridgeResponseCallback) {
        if (bridgeConnectionType == null) {
            BridgeResponseDispatcher.dispatch(bridgeResponseCallback, this, ReturnCode.NULL_PARAMETER);
        } else if (bridgeResource == null) {
            BridgeResponseDispatcher.dispatch(bridgeResponseCallback, this, ReturnCode.NULL_PARAMETER);
        } else {
            Executor.submit(new Runnable() { // from class: com.philips.lighting.hue.sdk.wrapper.domain.BridgeImpl.4
                @Override // java.lang.Runnable
                public void run() {
                    BridgeImpl.this.deleteResourceNative(bridgeResource, bridgeConnectionType.getValue(), bridgeResponseCallback);
                }
            });
        }
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.Bridge
    public void destroy() {
        Iterator<BridgeConnection> it = getBridgeConnections().iterator();
        while (it.hasNext()) {
            it.next().setBridgeConnectionCallback(null);
        }
        destroyNative();
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.Bridge
    public void disconnect() {
        disconnect(BridgeConnectionType.LOCAL_REMOTE);
    }

    public native void disconnectNative(int i);

    @Override // com.philips.lighting.hue.sdk.wrapper.SessionObject, com.philips.lighting.hue.sdk.wrapper.domain.Bridge, com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        BridgeImpl bridgeImpl = (BridgeImpl) obj;
        if (!Arrays.equals(this.name, bridgeImpl.name)) {
            return false;
        }
        BridgeState bridgeState = this.state;
        if (bridgeState == null) {
            if (bridgeImpl.state != null) {
                return false;
            }
        } else if (!bridgeState.equals(bridgeImpl.state)) {
            return false;
        }
        return true;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.Bridge
    public ReturnCode extendFindNewDevices(List<String> list) {
        String[] strArr;
        if (list != null) {
            strArr = new String[list.size()];
            for (int i = 0; i < list.size(); i++) {
                strArr[i] = list.get(i);
            }
        } else {
            strArr = null;
        }
        return ReturnCode.fromValue(extendFindNewDevicesNative(strArr));
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public void fetch(BridgeResponseCallback bridgeResponseCallback) {
        BridgeResponseDispatcher.dispatch(bridgeResponseCallback, this, ReturnCode.NOT_IMPLEMENTED);
    }

    public void finalize() throws Throwable {
        destroy();
        super.finalize();
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.Bridge
    public void findNewDevices(List<String> list, final BridgeConnectionType bridgeConnectionType, final FoundDevicesCallback foundDevicesCallback) {
        if (bridgeConnectionType == null) {
            dispatch(foundDevicesCallback, ReturnCode.NULL_PARAMETER, "allowed connection is null!");
            return;
        }
        if (list == null || list.size() == 0) {
            findNewDevices(bridgeConnectionType, foundDevicesCallback);
            return;
        }
        final String[] strArr = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            strArr[i] = list.get(i);
        }
        Executor.submit(new Runnable() { // from class: com.philips.lighting.hue.sdk.wrapper.domain.BridgeImpl.9
            @Override // java.lang.Runnable
            public void run() {
                BridgeImpl.this.findNewDevicesNative(strArr, bridgeConnectionType.getValue(), foundDevicesCallback);
            }
        });
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.Bridge
    public BridgeConfiguration getBridgeConfiguration() {
        BridgeState bridgeState = this.state;
        if (bridgeState != null) {
            return bridgeState.getBridgeConfiguration();
        }
        return null;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.Bridge
    public BridgeConnection getBridgeConnection(BridgeConnectionType bridgeConnectionType) {
        if (bridgeConnectionType != null) {
            return getBridgeConnectionNative(bridgeConnectionType.getValue());
        }
        return null;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.Bridge
    public native List<BridgeConnection> getBridgeConnections();

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.Bridge
    public BridgeState getBridgeState() {
        return this.state;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public DeviceConfiguration getConfiguration() {
        BridgeState bridgeState = this.state;
        if (bridgeState != null) {
            return bridgeState.getBridgeConfiguration();
        }
        return null;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public DeviceSoftwareUpdate getDeviceSoftwareUpdate() {
        if (getBridgeConfiguration() == null || getBridgeConfiguration().getSystemSoftwareUpdate() == null) {
            return null;
        }
        return getBridgeConfiguration().getSystemSoftwareUpdate().getBridgeSoftwareUpdate();
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public int getDomainType() {
        return getType().getValue();
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public String getIdentifier() {
        BridgeConfiguration bridgeConfiguration = getBridgeConfiguration();
        if (bridgeConfiguration != null) {
            return bridgeConfiguration.getUniqueIdentifier();
        }
        return null;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public DeviceInfo getInfo() {
        return null;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.Bridge, com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public String getName() {
        return getBridgeConfiguration() != null ? getBridgeConfiguration().getName() : NativeTools.BytesToString(this.name);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public DeviceState getState() {
        return this.state;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public DomainType getType() {
        return DomainType.BRIDGE;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.SessionObject, com.philips.lighting.hue.sdk.wrapper.domain.Bridge, com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public int hashCode() {
        int iN = k.n(this.name, super.hashCode() * 31, 31);
        BridgeState bridgeState = this.state;
        return iN + (bridgeState == null ? 0 : bridgeState.hashCode());
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.Bridge
    public native boolean isConnected();

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public boolean isOfType(DomainType domainType) {
        return getType() == domainType;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.Bridge
    public native void refreshUsername(BridgeResponseCallback bridgeResponseCallback);

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.Bridge
    public native void removeBridgeConnection(BridgeConnection bridgeConnection);

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.Bridge
    public void removeBridgeStatedUpdatedCallback(BridgeStateUpdatedCallback bridgeStateUpdatedCallback) {
        BridgeState bridgeState = this.state;
        if (bridgeState != null) {
            bridgeState.removeUpdatedCallback(bridgeStateUpdatedCallback);
        }
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.Bridge
    public void restore(String str, BridgeConnectionType bridgeConnectionType, BridgeResponseCallback bridgeResponseCallback) {
        if (str == null) {
            BridgeResponseDispatcher.dispatch(bridgeResponseCallback, this, ReturnCode.NULL_PARAMETER);
        } else if (bridgeConnectionType == null) {
            BridgeConnectionType bridgeConnectionType2 = BridgeConnectionType.NONE;
        } else {
            restoreNative(NativeTools.StringToBytes(str), bridgeConnectionType.getValue(), bridgeResponseCallback);
        }
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public void setBridge(Bridge bridge) {
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.Bridge
    public void setBridgeConnectionCallback(BridgeConnectionCallback bridgeConnectionCallback) {
        Iterator<BridgeConnection> it = getBridgeConnections().iterator();
        while (it.hasNext()) {
            it.next().setBridgeConnectionCallback(bridgeConnectionCallback);
        }
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public void setIdentifier(String str) {
        HueLog.e("Bridge", "Set identifier is not supported");
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.Bridge
    public void setName(String str) {
        this.name = NativeTools.StringToBytes(str);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.Bridge
    public ReturnCode setQueueOptions(QueueOptions queueOptions) {
        return ReturnCode.fromValue(setQueueOptionsNative(queueOptions));
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.Bridge
    public ReturnCode setQueueType(QueueType queueType) {
        return queueType == null ? ReturnCode.NULL_PARAMETER : ReturnCode.fromValue(setQueueTypeNative(queueType.getValue()));
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.Bridge
    public void startBackup(BridgeConnectionType bridgeConnectionType, BridgeResponseCallback bridgeResponseCallback) {
        if (bridgeConnectionType == null) {
            bridgeConnectionType = BridgeConnectionType.LOCAL_REMOTE;
        }
        startBackupNative(bridgeConnectionType.getValue(), bridgeResponseCallback);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.SessionObject
    public native void syncNative();

    @Override // com.philips.lighting.hue.sdk.wrapper.SDKSerializable
    @Nonnull
    public String toString() {
        return "{\"bridgeId\": \"" + getIdentifier() + "\"}";
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public void updateConfiguration(DeviceConfiguration deviceConfiguration, BridgeConnectionType bridgeConnectionType, BridgeResponseCallback bridgeResponseCallback) {
        updateConfiguration(deviceConfiguration, bridgeConnectionType, bridgeResponseCallback, true);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.Bridge
    public void updateFirmware(final BridgeConnectionType bridgeConnectionType, final BridgeResponseCallback bridgeResponseCallback) {
        if (bridgeConnectionType == null) {
            BridgeResponseDispatcher.dispatch(bridgeResponseCallback, this, ReturnCode.NULL_PARAMETER);
        } else {
            Executor.submit(new Runnable() { // from class: com.philips.lighting.hue.sdk.wrapper.domain.BridgeImpl.11
                @Override // java.lang.Runnable
                public void run() {
                    BridgeImpl.this.updateFirmwareNative(bridgeConnectionType.getValue(), bridgeResponseCallback);
                }
            });
        }
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.Bridge
    public void updateResource(BridgeResource bridgeResource, BridgeConnectionType bridgeConnectionType, BridgeResponseCallback bridgeResponseCallback) {
        updateResource(bridgeResource, bridgeConnectionType, bridgeResponseCallback, true);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public void updateState(DeviceState deviceState, BridgeConnectionType bridgeConnectionType, BridgeResponseCallback bridgeResponseCallback) {
        updateState(deviceState, bridgeConnectionType, bridgeResponseCallback, true);
    }

    public BridgeImpl(String str) {
        this(str, true, true);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.Bridge
    public ReturnCode connect(BridgeConnectionType bridgeConnectionType) {
        return ReturnCode.fromValue(connectNative(bridgeConnectionType.getValue()));
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.Bridge
    public void disconnect(BridgeConnectionType bridgeConnectionType) {
        disconnectNative(bridgeConnectionType.getValue());
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public void fetch(BridgeConnectionType bridgeConnectionType, BridgeResponseCallback bridgeResponseCallback) {
        BridgeResponseDispatcher.dispatch(bridgeResponseCallback, this, ReturnCode.NOT_IMPLEMENTED);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public boolean isOfType(int i) {
        return isOfType(DomainType.fromValue(i));
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public void updateConfiguration(final DeviceConfiguration deviceConfiguration, final BridgeConnectionType bridgeConnectionType, final BridgeResponseCallback bridgeResponseCallback, final boolean z5) {
        if (bridgeConnectionType == null) {
            BridgeResponseDispatcher.dispatch(bridgeResponseCallback, this, ReturnCode.NOT_ALLOWED);
            return;
        }
        if (deviceConfiguration == null) {
            BridgeResponseDispatcher.dispatch(bridgeResponseCallback, this, ReturnCode.NULL_PARAMETER);
        } else if (BridgeConfiguration.class.isAssignableFrom(deviceConfiguration.getClass())) {
            Executor.submit(new Runnable() { // from class: com.philips.lighting.hue.sdk.wrapper.domain.BridgeImpl.6
                @Override // java.lang.Runnable
                public void run() {
                    BridgeImpl.this.updateConfigurationNative(deviceConfiguration, bridgeConnectionType.getValue(), bridgeResponseCallback, z5);
                }
            });
        } else {
            BridgeResponseDispatcher.dispatch(bridgeResponseCallback, this, ReturnCode.WRONG_PARAMETER);
        }
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.Bridge
    public void updateResource(final BridgeResource bridgeResource, final BridgeConnectionType bridgeConnectionType, final BridgeResponseCallback bridgeResponseCallback, final boolean z5) {
        if (bridgeConnectionType == null) {
            BridgeResponseDispatcher.dispatch(bridgeResponseCallback, this, ReturnCode.NULL_PARAMETER);
        } else if (bridgeResource == null) {
            BridgeResponseDispatcher.dispatch(bridgeResponseCallback, this, ReturnCode.NULL_PARAMETER);
        } else {
            Executor.submit(new Runnable() { // from class: com.philips.lighting.hue.sdk.wrapper.domain.BridgeImpl.2
                @Override // java.lang.Runnable
                public void run() {
                    BridgeImpl.this.updateResourceNative(bridgeResource, bridgeConnectionType.getValue(), bridgeResponseCallback, z5);
                }
            });
        }
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public void updateState(final DeviceState deviceState, final BridgeConnectionType bridgeConnectionType, final BridgeResponseCallback bridgeResponseCallback, final boolean z5) {
        if (bridgeConnectionType == null) {
            BridgeResponseDispatcher.dispatch(bridgeResponseCallback, this, ReturnCode.NULL_PARAMETER);
            return;
        }
        if (deviceState == null) {
            BridgeResponseDispatcher.dispatch(bridgeResponseCallback, this, ReturnCode.NULL_PARAMETER);
        } else if (BridgeState.class.isAssignableFrom(deviceState.getClass())) {
            Executor.submit(new Runnable() { // from class: com.philips.lighting.hue.sdk.wrapper.domain.BridgeImpl.5
                @Override // java.lang.Runnable
                public void run() {
                    BridgeImpl.this.updateStateNative(deviceState, bridgeConnectionType.getValue(), bridgeResponseCallback, z5);
                }
            });
        } else {
            BridgeResponseDispatcher.dispatch(bridgeResponseCallback, this, ReturnCode.WRONG_PARAMETER);
        }
    }

    public BridgeImpl(String str, boolean z5, boolean z6) {
        this.name = null;
        this.state = null;
        createSession(str, z5, z6);
        syncNative();
        SessionMemoryManager.addSession(this);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.Bridge
    public void backup(BridgeResponseCallback bridgeResponseCallback) {
        backup(null, bridgeResponseCallback);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.Bridge
    public void startBackup(BridgeResponseCallback bridgeResponseCallback) {
        startBackup(null, bridgeResponseCallback);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.Bridge
    public void updateFirmware(BridgeResponseCallback bridgeResponseCallback) {
        updateFirmware(BridgeConnectionType.LOCAL_REMOTE, bridgeResponseCallback);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.Bridge
    public void backup(BridgeConnectionType bridgeConnectionType) {
        backup(bridgeConnectionType, null);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.Bridge
    public void createDevice(Device device, BridgeResponseCallback bridgeResponseCallback) {
        createDevice(device, BridgeConnectionType.LOCAL_REMOTE, bridgeResponseCallback);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.Bridge
    public void deleteDevice(Device device, BridgeResponseCallback bridgeResponseCallback) {
        deleteDevice(device, BridgeConnectionType.LOCAL_REMOTE, bridgeResponseCallback);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.Bridge
    public void deleteResource(BridgeResource bridgeResource, BridgeResponseCallback bridgeResponseCallback) {
        deleteResource(bridgeResource, BridgeConnectionType.LOCAL_REMOTE, bridgeResponseCallback);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.Bridge
    public void restore(String str, BridgeResponseCallback bridgeResponseCallback) {
        restore(str, null, bridgeResponseCallback);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.Bridge
    public void startBackup(BridgeConnectionType bridgeConnectionType) {
        startBackup(bridgeConnectionType, null);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.Bridge
    public void updateFirmware() {
        updateFirmware(BridgeConnectionType.LOCAL_REMOTE, (BridgeResponseCallback) null);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.Bridge
    public void backup() {
        backup(null, null);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.Bridge
    public void createDevice(Device device) {
        createDevice(device, BridgeConnectionType.LOCAL_REMOTE, null);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.Bridge
    public void createResource(BridgeResource bridgeResource, BridgeResponseCallback bridgeResponseCallback) {
        createResource(bridgeResource, BridgeConnectionType.LOCAL_REMOTE, bridgeResponseCallback);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.Bridge
    public void deleteDevice(Device device) {
        deleteDevice(device, BridgeConnectionType.LOCAL_REMOTE, null);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.Bridge
    public void deleteResource(BridgeResource bridgeResource) {
        deleteResource(bridgeResource, BridgeConnectionType.LOCAL_REMOTE, null);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.Bridge
    public ReturnCode extendFindNewDevices() {
        return extendFindNewDevices(null);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.Bridge
    public void restore(String str, BridgeConnectionType bridgeConnectionType) {
        restore(str, bridgeConnectionType, null);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.Bridge
    public void startBackup() {
        startBackup(null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.RandomAccessFile] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x004c -> B:48:0x005d). Please report as a decompilation issue!!! */
    @Override // com.philips.lighting.hue.sdk.wrapper.domain.Bridge
    public void updateFirmware(File file, BridgeConnectionType bridgeConnectionType, BridgeResponseCallback bridgeResponseCallback) throws Throwable {
        if (file == null) {
            BridgeResponseDispatcher.dispatch(bridgeResponseCallback, this, ReturnCode.NULL_PARAMETER);
            return;
        }
        if (bridgeConnectionType == null) {
            BridgeResponseDispatcher.dispatch(bridgeResponseCallback, this, ReturnCode.NULL_PARAMETER);
            return;
        }
        ?? r6 = 0;
        IOException iOException = null;
        RandomAccessFile randomAccessFile = null;
        RandomAccessFile randomAccessFile2 = null;
        r6 = 0;
        try {
            try {
                try {
                    RandomAccessFile randomAccessFile3 = new RandomAccessFile(file, "r");
                    try {
                        byte[] bArr = new byte[(int) randomAccessFile3.length()];
                        randomAccessFile3.read(bArr);
                        try {
                            randomAccessFile3.close();
                        } catch (IOException e6) {
                            e6.printStackTrace();
                            iOException = e6;
                        }
                        updateFirmware(bArr, bridgeConnectionType, bridgeResponseCallback);
                        r6 = iOException;
                    } catch (FileNotFoundException e7) {
                        e = e7;
                        randomAccessFile = randomAccessFile3;
                        e.printStackTrace();
                        BridgeResponseDispatcher.dispatch(bridgeResponseCallback, this, ReturnCode.WRONG_PARAMETER);
                        r6 = randomAccessFile;
                        if (randomAccessFile != null) {
                            randomAccessFile.close();
                            r6 = randomAccessFile;
                        }
                    } catch (IOException e8) {
                        e = e8;
                        randomAccessFile2 = randomAccessFile3;
                        e.printStackTrace();
                        BridgeResponseDispatcher.dispatch(bridgeResponseCallback, this, ReturnCode.WRONG_PARAMETER);
                        r6 = randomAccessFile2;
                        if (randomAccessFile2 != null) {
                            randomAccessFile2.close();
                            r6 = randomAccessFile2;
                        }
                    } catch (Throwable th) {
                        th = th;
                        r6 = randomAccessFile3;
                        if (r6 != 0) {
                            try {
                                r6.close();
                            } catch (IOException e9) {
                                e9.printStackTrace();
                            }
                        }
                        throw th;
                    }
                } catch (FileNotFoundException e10) {
                    e = e10;
                } catch (IOException e11) {
                    e = e11;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e12) {
            e12.printStackTrace();
            r6 = r6;
        }
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.Bridge
    public void updateResource(BridgeResource bridgeResource, BridgeResponseCallback bridgeResponseCallback) {
        updateResource(bridgeResource, BridgeConnectionType.LOCAL_REMOTE, bridgeResponseCallback);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.Bridge
    public void createResource(BridgeResource bridgeResource) {
        createResource(bridgeResource, BridgeConnectionType.LOCAL_REMOTE, null);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.Bridge
    public void restore(String str) {
        restore(str, null, null);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.Bridge
    public void updateResource(BridgeResource bridgeResource) {
        updateResource(bridgeResource, BridgeConnectionType.LOCAL_REMOTE, (BridgeResponseCallback) null);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public void updateConfiguration(DeviceConfiguration deviceConfiguration, BridgeResponseCallback bridgeResponseCallback) {
        updateConfiguration(deviceConfiguration, BridgeConnectionType.LOCAL_REMOTE, bridgeResponseCallback);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.Bridge
    public void updateResource(BridgeResource bridgeResource, BridgeResource bridgeResource2, BridgeConnectionType bridgeConnectionType, BridgeResponseCallback bridgeResponseCallback) {
        updateResource(bridgeResource, bridgeResource2, bridgeConnectionType, bridgeResponseCallback, true);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public void updateState(DeviceState deviceState, BridgeResponseCallback bridgeResponseCallback) {
        updateState(deviceState, BridgeConnectionType.LOCAL_REMOTE, bridgeResponseCallback);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.Bridge
    public void findNewDevices(List<String> list, FoundDevicesCallback foundDevicesCallback) {
        findNewDevices(list, BridgeConnectionType.LOCAL_REMOTE, foundDevicesCallback);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public void updateConfiguration(DeviceConfiguration deviceConfiguration, BridgeResponseCallback bridgeResponseCallback, boolean z5) {
        updateConfiguration(deviceConfiguration, BridgeConnectionType.LOCAL_REMOTE, bridgeResponseCallback, z5);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.Bridge
    public void updateResource(final BridgeResource bridgeResource, final BridgeResource bridgeResource2, final BridgeConnectionType bridgeConnectionType, final BridgeResponseCallback bridgeResponseCallback, final boolean z5) {
        if (bridgeConnectionType == null) {
            BridgeResponseDispatcher.dispatch(bridgeResponseCallback, this, ReturnCode.NULL_PARAMETER);
        } else if (bridgeResource == null) {
            BridgeResponseDispatcher.dispatch(bridgeResponseCallback, this, ReturnCode.NULL_PARAMETER);
        } else {
            Executor.submit(new Runnable() { // from class: com.philips.lighting.hue.sdk.wrapper.domain.BridgeImpl.3
                @Override // java.lang.Runnable
                public void run() {
                    BridgeImpl.this.updateResourceNative(bridgeResource, bridgeResource2, bridgeConnectionType.getValue(), bridgeResponseCallback, z5);
                }
            });
        }
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public void updateState(DeviceState deviceState, BridgeResponseCallback bridgeResponseCallback, boolean z5) {
        updateState(deviceState, BridgeConnectionType.LOCAL_REMOTE, bridgeResponseCallback, z5);
    }

    public BridgeImpl(long j4) {
        this.name = null;
        this.state = null;
        createSessionWithBridgeProxyReference(j4);
        syncNative();
        SessionMemoryManager.addSession(this);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.Bridge
    public void findNewDevices(List<String> list) {
        findNewDevices(list, BridgeConnectionType.LOCAL_REMOTE, null);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public void updateConfiguration(DeviceConfiguration deviceConfiguration) {
        updateConfiguration(deviceConfiguration, BridgeConnectionType.LOCAL_REMOTE, (BridgeResponseCallback) null);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public void updateState(DeviceState deviceState) {
        updateState(deviceState, BridgeConnectionType.LOCAL_REMOTE, (BridgeResponseCallback) null);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.Bridge
    public void findNewDevices(final BridgeConnectionType bridgeConnectionType, final FoundDevicesCallback foundDevicesCallback) {
        if (bridgeConnectionType == null) {
            dispatch(foundDevicesCallback, ReturnCode.NULL_PARAMETER, "allowed connection is null!");
        } else {
            Executor.submit(new Runnable() { // from class: com.philips.lighting.hue.sdk.wrapper.domain.BridgeImpl.10
                @Override // java.lang.Runnable
                public void run() {
                    BridgeImpl.this.findNewDevicesNative(null, bridgeConnectionType.getValue(), foundDevicesCallback);
                }
            });
        }
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public void updateConfiguration(DeviceConfiguration deviceConfiguration, boolean z5) {
        updateConfiguration(deviceConfiguration, BridgeConnectionType.LOCAL_REMOTE, null, z5);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public void updateState(DeviceState deviceState, boolean z5) {
        updateState(deviceState, BridgeConnectionType.LOCAL_REMOTE, null, z5);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.Bridge
    public void updateResource(BridgeResource bridgeResource, BridgeResource bridgeResource2, BridgeResponseCallback bridgeResponseCallback) {
        updateResource(bridgeResource, bridgeResource2, BridgeConnectionType.LOCAL_REMOTE, bridgeResponseCallback);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.Bridge
    public void findNewDevices(FoundDevicesCallback foundDevicesCallback) {
        findNewDevices(BridgeConnectionType.LOCAL_REMOTE, foundDevicesCallback);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.Bridge
    public void updateResource(BridgeResource bridgeResource, BridgeResource bridgeResource2) {
        updateResource(bridgeResource, bridgeResource2, BridgeConnectionType.LOCAL_REMOTE, (BridgeResponseCallback) null);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.Bridge
    public void findNewDevices() {
        findNewDevices(BridgeConnectionType.LOCAL_REMOTE, (FoundDevicesCallback) null);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.Bridge
    public void updateFirmware(File file, BridgeResponseCallback bridgeResponseCallback) throws Throwable {
        updateFirmware(file, BridgeConnectionType.LOCAL_REMOTE, bridgeResponseCallback);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.Bridge
    public void updateFirmware(File file) throws Throwable {
        updateFirmware(file, BridgeConnectionType.LOCAL_REMOTE, (BridgeResponseCallback) null);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.Bridge
    public void updateFirmware(byte[] bArr, BridgeConnectionType bridgeConnectionType, BridgeResponseCallback bridgeResponseCallback) {
        if (bArr == null) {
            BridgeResponseDispatcher.dispatch(bridgeResponseCallback, this, ReturnCode.NULL_PARAMETER);
        } else if (bridgeConnectionType == null) {
            BridgeResponseDispatcher.dispatch(bridgeResponseCallback, this, ReturnCode.NULL_PARAMETER);
        } else {
            updateFirmwareWithFileNative(bArr, bridgeResponseCallback);
        }
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.Bridge
    public void updateFirmware(byte[] bArr, BridgeResponseCallback bridgeResponseCallback) {
        updateFirmware(bArr, BridgeConnectionType.LOCAL_REMOTE, bridgeResponseCallback);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.Bridge
    public void updateFirmware(byte[] bArr) {
        updateFirmware(bArr, BridgeConnectionType.LOCAL_REMOTE, (BridgeResponseCallback) null);
    }
}

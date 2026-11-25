package com.philips.lighting.hue.sdk.wrapper.utilities;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import java.io.FileDescriptor;
import java.io.IOException;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.ByteOrder;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class WifiUtil {
    ConnectivityManager connectivityManager;
    WifiManager wifiManager;

    public WifiUtil(Context context) {
        this.wifiManager = (WifiManager) context.getSystemService("wifi");
        this.connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
    }

    @Nullable
    private String getIpV4Address() {
        WifiManager wifiManager = this.wifiManager;
        if (wifiManager != null) {
            int ipAddress = wifiManager.getConnectionInfo().getIpAddress();
            if (ByteOrder.nativeOrder().equals(ByteOrder.LITTLE_ENDIAN)) {
                ipAddress = Integer.reverseBytes(ipAddress);
            }
            try {
                return InetAddress.getByAddress(BigInteger.valueOf(ipAddress).toByteArray()).getHostAddress();
            } catch (UnknownHostException unused) {
            }
        }
        return null;
    }

    private String getName() {
        return "";
    }

    @Nullable
    private String getSSID() {
        WifiInfo connectionInfo;
        WifiManager wifiManager = this.wifiManager;
        if (wifiManager == null || (connectionInfo = wifiManager.getConnectionInfo()) == null) {
            return null;
        }
        return connectionInfo.getSSID();
    }

    @Nullable
    private Boolean isWifiOnAndConnected() {
        WifiManager wifiManager = this.wifiManager;
        if (wifiManager == null) {
            return null;
        }
        if (wifiManager.isWifiEnabled() && this.wifiManager.getConnectionInfo().getNetworkId() != -1) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    private void networkBindSocket(FileDescriptor fileDescriptor, String str) {
        for (Network network : this.connectivityManager.getAllNetworks()) {
            try {
                if (this.connectivityManager.getLinkProperties(network).getInterfaceName().equals(str)) {
                    network.bindSocket(fileDescriptor);
                }
            } catch (IOException | NoSuchMethodError | NullPointerException unused) {
            }
        }
    }

    @Nullable
    public Boolean isEnabled() {
        WifiManager wifiManager = this.wifiManager;
        if (wifiManager != null) {
            return Boolean.valueOf(wifiManager.isWifiEnabled());
        }
        return null;
    }
}

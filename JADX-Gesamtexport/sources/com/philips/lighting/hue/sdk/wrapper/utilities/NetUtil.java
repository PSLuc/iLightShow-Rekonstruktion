package com.philips.lighting.hue.sdk.wrapper.utilities;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class NetUtil {
    List<NetworkInterface> networkInterfaces;

    public NetUtil() {
        this.networkInterfaces = null;
        this.networkInterfaces = new ArrayList();
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                this.networkInterfaces.add(networkInterfaces.nextElement());
            }
        } catch (SocketException e6) {
            e6.printStackTrace();
        }
    }

    private NetworkInterface getInterface(int i) {
        return this.networkInterfaces.get(i);
    }

    private int getInterfaceCount() {
        return this.networkInterfaces.size();
    }

    private byte[] getInterfaceIPv4Address(int i) {
        Enumeration<InetAddress> inetAddresses = getInterface(i).getInetAddresses();
        while (inetAddresses.hasMoreElements()) {
            InetAddress inetAddressNextElement = inetAddresses.nextElement();
            if (inetAddressNextElement instanceof Inet4Address) {
                String string = inetAddressNextElement.toString();
                if (string.charAt(0) == '/') {
                    string = string.substring(1);
                }
                return NativeTools.StringToBytes(string);
            }
        }
        return null;
    }

    private byte[] getInterfaceIPv6Address(int i) {
        Enumeration<InetAddress> inetAddresses = getInterface(i).getInetAddresses();
        while (inetAddresses.hasMoreElements()) {
            InetAddress inetAddressNextElement = inetAddresses.nextElement();
            if (inetAddressNextElement instanceof Inet6Address) {
                String string = inetAddressNextElement.toString();
                if (string.charAt(0) == '/') {
                    string = string.substring(1);
                }
                return NativeTools.StringToBytes(string);
            }
        }
        return null;
    }

    private boolean getInterfaceLoopback(int i) {
        try {
            return getInterface(i).isLoopback();
        } catch (SocketException e6) {
            e6.printStackTrace();
            return false;
        }
    }

    private byte[] getInterfaceName(int i) {
        return NativeTools.StringToBytes(getInterface(i).getDisplayName());
    }

    private boolean getInterfaceUp(int i) {
        try {
            return getInterface(i).isUp();
        } catch (SocketException e6) {
            e6.printStackTrace();
            return false;
        }
    }
}

package com.nanjoran.ilightshow.Services.lights.hue;

import D4.c;
import E4.g;
import E4.k;
import I3.d;
import I3.e;
import android.content.Context;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.net.wifi.WifiManager;
import com.nanjoran.ilightshow.Services.S;
import com.philips.lighting.hue.sdk.wrapper.domain.ClipAttribute;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes.dex */
public final class DeviceDiscoveryHue implements J3.a, d {
    private Context context;
    private ArrayList<K3.a> devices = new ArrayList<>();
    private NsdManager.DiscoveryListener mDiscoveryListener;
    private NsdManager mNsdManager;
    private boolean multicastLockHeld;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static String TAG = "DeviceDiscoveryHue";
    private static String SERVICE_TYPE = "_hue._tcp.";

    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final String getSERVICE_TYPE() {
            return DeviceDiscoveryHue.SERVICE_TYPE;
        }

        public final String getTAG() {
            return DeviceDiscoveryHue.TAG;
        }

        public final void setSERVICE_TYPE(String str) {
            k.f("<set-?>", str);
            DeviceDiscoveryHue.SERVICE_TYPE = str;
        }

        public final void setTAG(String str) {
            k.f("<set-?>", str);
            DeviceDiscoveryHue.TAG = str;
        }

        private Companion() {
        }
    }

    public DeviceDiscoveryHue(Context context) {
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void releaseMulticastLock() {
        if (this.multicastLockHeld) {
            this.multicastLockHeld = false;
            S.f8362c.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopNsdDiscovery() {
        NsdManager.DiscoveryListener discoveryListener = this.mDiscoveryListener;
        if (discoveryListener == null) {
            return;
        }
        try {
            NsdManager nsdManager = this.mNsdManager;
            if (nsdManager != null) {
                nsdManager.stopServiceDiscovery(discoveryListener);
            }
        } catch (Exception e6) {
            e6.toString();
        }
        this.mDiscoveryListener = null;
    }

    @Override // J3.a
    public boolean checkOrConnect(K3.a aVar) {
        k.f(ClipAttribute.Sensor.Configuration.Device, aVar);
        if (!(aVar instanceof DeviceHueBridge)) {
            return false;
        }
        if (aVar.ip == null) {
            return true;
        }
        ((DeviceHueBridge) aVar).signin();
        return true;
    }

    public final Context getContext() {
        return this.context;
    }

    public final ArrayList<K3.a> getDevices() {
        return this.devices;
    }

    public final NsdManager.DiscoveryListener getMDiscoveryListener() {
        return this.mDiscoveryListener;
    }

    public final NsdManager getMNsdManager() {
        return this.mNsdManager;
    }

    public final void initializeDiscoveryListener() {
        this.mDiscoveryListener = new NsdManager.DiscoveryListener() { // from class: com.nanjoran.ilightshow.Services.lights.hue.DeviceDiscoveryHue.initializeDiscoveryListener.1
            @Override // android.net.nsd.NsdManager.DiscoveryListener
            public void onDiscoveryStarted(String str) {
                k.f("regType", str);
                DeviceDiscoveryHue.Companion.getTAG();
            }

            @Override // android.net.nsd.NsdManager.DiscoveryListener
            public void onDiscoveryStopped(String str) {
                k.f("serviceType", str);
                DeviceDiscoveryHue.Companion.getTAG();
            }

            @Override // android.net.nsd.NsdManager.DiscoveryListener
            public void onServiceFound(final NsdServiceInfo nsdServiceInfo) {
                k.f("service", nsdServiceInfo);
                Companion companion = DeviceDiscoveryHue.Companion;
                companion.getTAG();
                nsdServiceInfo.toString();
                if (k.a(nsdServiceInfo.getServiceType(), companion.getSERVICE_TYPE())) {
                    companion.getTAG();
                    nsdServiceInfo.getServiceType();
                    NsdManager mNsdManager = DeviceDiscoveryHue.this.getMNsdManager();
                    k.c(mNsdManager);
                    final DeviceDiscoveryHue deviceDiscoveryHue = DeviceDiscoveryHue.this;
                    mNsdManager.resolveService(nsdServiceInfo, new NsdManager.ResolveListener() { // from class: com.nanjoran.ilightshow.Services.lights.hue.DeviceDiscoveryHue$initializeDiscoveryListener$1$onServiceFound$1
                        @Override // android.net.nsd.NsdManager.ResolveListener
                        public void onResolveFailed(NsdServiceInfo nsdServiceInfo2, int i) {
                            k.f("serviceInfo", nsdServiceInfo2);
                            NsdManager mNsdManager2 = deviceDiscoveryHue.getMNsdManager();
                            if (mNsdManager2 != null) {
                                mNsdManager2.resolveService(nsdServiceInfo, this);
                            }
                            DeviceDiscoveryHue.Companion.getTAG();
                        }

                        @Override // android.net.nsd.NsdManager.ResolveListener
                        public void onServiceResolved(NsdServiceInfo nsdServiceInfo2) {
                            byte[] bArr;
                            k.f("serviceInfo", nsdServiceInfo2);
                            DeviceDiscoveryHue.Companion.getTAG();
                            nsdServiceInfo2.toString();
                            Map<String, byte[]> attributes = nsdServiceInfo2.getAttributes();
                            if (attributes == null || (bArr = attributes.get("bridgeid")) == null) {
                                return;
                            }
                            String str = new String(bArr, M4.a.f3520a);
                            InetAddress host = nsdServiceInfo2.getHost();
                            DeviceHueBridge deviceHueBridge = new DeviceHueBridge();
                            deviceHueBridge.id = str;
                            deviceHueBridge.ip = host.getHostAddress();
                            deviceHueBridge.name = nsdServiceInfo2.getServiceName();
                            deviceHueBridge.type = K3.d.i;
                            Iterator<K3.a> it = deviceDiscoveryHue.getDevices().iterator();
                            k.e("iterator(...)", it);
                            boolean z5 = false;
                            while (it.hasNext()) {
                                K3.a next = it.next();
                                k.e("next(...)", next);
                                if (str.equals(next.id)) {
                                    z5 = true;
                                }
                            }
                            if (z5) {
                                return;
                            }
                            deviceDiscoveryHue.getDevices().add(deviceHueBridge);
                        }
                    });
                }
            }

            @Override // android.net.nsd.NsdManager.DiscoveryListener
            public void onServiceLost(NsdServiceInfo nsdServiceInfo) {
                k.f("service", nsdServiceInfo);
                DeviceDiscoveryHue.Companion.getTAG();
                nsdServiceInfo.toString();
            }

            @Override // android.net.nsd.NsdManager.DiscoveryListener
            public void onStartDiscoveryFailed(String str, int i) {
                k.f("serviceType", str);
                DeviceDiscoveryHue.Companion.getTAG();
                try {
                    NsdManager mNsdManager = DeviceDiscoveryHue.this.getMNsdManager();
                    k.c(mNsdManager);
                    mNsdManager.stopServiceDiscovery(this);
                } catch (Exception e6) {
                    DeviceDiscoveryHue.Companion.getTAG();
                    e6.toString();
                }
            }

            @Override // android.net.nsd.NsdManager.DiscoveryListener
            public void onStopDiscoveryFailed(String str, int i) {
                k.f("serviceType", str);
                DeviceDiscoveryHue.Companion.getTAG();
                try {
                    NsdManager mNsdManager = DeviceDiscoveryHue.this.getMNsdManager();
                    k.c(mNsdManager);
                    mNsdManager.stopServiceDiscovery(this);
                } catch (Exception e6) {
                    DeviceDiscoveryHue.Companion.getTAG();
                    e6.toString();
                }
            }
        };
    }

    @Override // J3.a
    public void restart() {
    }

    @Override // J3.a
    public void scan(final c cVar) {
        k.f("callback", cVar);
        if (this.context == null) {
            cVar.invoke(new ArrayList());
            return;
        }
        if (!this.multicastLockHeld) {
            S s6 = S.f8362c;
            if (s6.f8364b == 0) {
                WifiManager.MulticastLock multicastLock = s6.f8363a;
                if (multicastLock != null) {
                    multicastLock.setReferenceCounted(true);
                }
                WifiManager.MulticastLock multicastLock2 = s6.f8363a;
                if (multicastLock2 != null) {
                    multicastLock2.acquire();
                }
            }
            s6.f8364b++;
            this.multicastLockHeld = true;
        }
        Context context = this.context;
        Object systemService = context != null ? context.getSystemService("servicediscovery") : null;
        this.mNsdManager = systemService instanceof NsdManager ? (NsdManager) systemService : null;
        initializeDiscoveryListener();
        NsdManager nsdManager = this.mNsdManager;
        if (nsdManager != null) {
            nsdManager.discoverServices(SERVICE_TYPE, 1, this.mDiscoveryListener);
        }
        I3.c.f1859f.a(this);
        new Timer().schedule(new TimerTask() { // from class: com.nanjoran.ilightshow.Services.lights.hue.DeviceDiscoveryHue.scan.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                cVar.invoke(this.getDevices());
                this.stopNsdDiscovery();
                this.releaseMulticastLock();
            }
        }, 10000L);
    }

    public final void setContext(Context context) {
        this.context = context;
    }

    public final void setDevices(ArrayList<K3.a> arrayList) {
        k.f("<set-?>", arrayList);
        this.devices = arrayList;
    }

    public final void setMDiscoveryListener(NsdManager.DiscoveryListener discoveryListener) {
        this.mDiscoveryListener = discoveryListener;
    }

    public final void setMNsdManager(NsdManager nsdManager) {
        this.mNsdManager = nsdManager;
    }

    @Override // I3.d
    public void ssdpDidDiscover(e eVar) {
        String lowerCase;
        k.f("message", eVar);
        String str = (String) eVar.f1866b.get("hue-bridgeid");
        if (str != null) {
            lowerCase = str.toLowerCase();
            k.e("toLowerCase(...)", lowerCase);
        } else {
            lowerCase = null;
        }
        if (lowerCase != null) {
            DeviceHueBridge deviceHueBridge = new DeviceHueBridge();
            deviceHueBridge.id = lowerCase;
            deviceHueBridge.ip = eVar.f1865a;
            String upperCase = lowerCase.toUpperCase();
            k.e("toUpperCase(...)", upperCase);
            int length = upperCase.length();
            String strSubstring = upperCase.substring(length - (6 > length ? length : 6));
            k.e("substring(...)", strSubstring);
            deviceHueBridge.name = "Philips Hue - ".concat(strSubstring);
            deviceHueBridge.type = K3.d.i;
            Iterator<K3.a> it = this.devices.iterator();
            k.e("iterator(...)", it);
            boolean z5 = false;
            while (it.hasNext()) {
                K3.a next = it.next();
                k.e("next(...)", next);
                if (lowerCase.equals(next.id)) {
                    z5 = true;
                }
            }
            if (z5) {
                return;
            }
            this.devices.add(deviceHueBridge);
        }
    }

    @Override // J3.a
    public void stop() {
        stopNsdDiscovery();
        releaseMulticastLock();
    }
}

package com.nanjoran.outpost.outpost;

/* JADX INFO: loaded from: classes.dex */
public interface Listener {
    void onActiveStreamsChanged(long j4);

    void onDeviceIDAssigned(String str);

    void onError(String str);

    void onFingerprintUpdated(String str);

    void onReportedCountryCodeUpdated(String str);

    void onStateChanged(String str);
}

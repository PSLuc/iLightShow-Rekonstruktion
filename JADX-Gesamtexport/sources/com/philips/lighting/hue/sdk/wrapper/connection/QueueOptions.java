package com.philips.lighting.hue.sdk.wrapper.connection;

/* JADX INFO: loaded from: classes.dex */
public class QueueOptions {
    private CacheType cacheType;
    private boolean ignoreSendingTooFast;
    private boolean optimizerEnabled;
    private boolean waitForResponse;

    public QueueOptions(boolean z5, boolean z6, boolean z7, CacheType cacheType) {
        this.optimizerEnabled = true;
        this.ignoreSendingTooFast = false;
        this.waitForResponse = true;
        CacheType cacheType2 = CacheType.NORMAL;
        this.optimizerEnabled = z5;
        this.ignoreSendingTooFast = z6;
        this.waitForResponse = z7;
        this.cacheType = cacheType;
    }

    private int getCacheTypeAsInt() {
        return this.cacheType.getValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QueueOptions queueOptions = (QueueOptions) obj;
        return this.cacheType == queueOptions.cacheType && this.ignoreSendingTooFast == queueOptions.ignoreSendingTooFast && this.optimizerEnabled == queueOptions.optimizerEnabled && this.waitForResponse == queueOptions.waitForResponse;
    }

    public CacheType getCacheType() {
        return this.cacheType;
    }

    public int hashCode() {
        CacheType cacheType = this.cacheType;
        return (((((((cacheType == null ? 0 : cacheType.hashCode()) + 31) * 31) + (this.ignoreSendingTooFast ? 1231 : 1237)) * 31) + (this.optimizerEnabled ? 1231 : 1237)) * 31) + (this.waitForResponse ? 1231 : 1237);
    }

    public boolean isIgnoreSendingTooFast() {
        return this.ignoreSendingTooFast;
    }

    public boolean isOptimizerEnabled() {
        return this.optimizerEnabled;
    }

    public boolean isWaitForResponse() {
        return this.waitForResponse;
    }

    public void setCacheType(CacheType cacheType) {
        this.cacheType = cacheType;
    }

    public void setIgnoreSendingTooFast(boolean z5) {
        this.ignoreSendingTooFast = z5;
    }

    public void setOptimizerEnabled(boolean z5) {
        this.optimizerEnabled = z5;
    }

    public void setWaitForResponse(boolean z5) {
        this.waitForResponse = z5;
    }

    public QueueOptions(boolean z5, boolean z6, boolean z7) {
        this(z5, z6, z7, CacheType.NORMAL);
    }

    public QueueOptions() {
        this.optimizerEnabled = true;
        this.ignoreSendingTooFast = false;
        this.waitForResponse = true;
        this.cacheType = CacheType.NORMAL;
    }
}

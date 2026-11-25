package com.philips.lighting.hue.sdk.wrapper.entertainment;

/* JADX INFO: loaded from: classes.dex */
public interface StartCallback {

    public enum StartStatus {
        Success("Success"),
        BridgeIsBusy("Bridge is busy; it is already streaming."),
        BridgeIsNotSupported("Bridge device model/software version does not support streaming."),
        BridgeIsNotConnected("Bridge is not connected."),
        InvalidGroupSelected("The selected group is not a valid entertainment group."),
        InvalidClientKey("Entertainment client key is invalid; push-linking is required"),
        UnableToCreateStream("Stream could not be created");

        private String message;

        StartStatus(String str) {
            this.message = str;
        }

        public String getMessage() {
            return this.message;
        }
    }

    void handleCallback(StartStatus startStatus);
}

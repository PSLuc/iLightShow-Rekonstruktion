package com.spotify.protocol.client;

/* JADX INFO: loaded from: classes.dex */
public interface AppProtocolIo {

    public interface DataInput {
        void onData(byte[] bArr, int i);
    }

    PendingResult<Void> connect();

    void disconnect();

    boolean isConnected();

    boolean isConnecting();

    void setDataInput(DataInput dataInput);

    void writeData(byte[] bArr, int i);
}

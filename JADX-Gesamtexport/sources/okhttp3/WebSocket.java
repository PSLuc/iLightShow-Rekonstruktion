package okhttp3;

import h5.C0735m;

/* JADX INFO: loaded from: classes.dex */
public interface WebSocket {

    public interface Factory {
        WebSocket newWebSocket(Request request, WebSocketListener webSocketListener);
    }

    void cancel();

    boolean close(int i, String str);

    long queueSize();

    Request request();

    boolean send(C0735m c0735m);

    boolean send(String str);
}

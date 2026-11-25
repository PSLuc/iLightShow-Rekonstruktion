package okhttp3;

import E4.k;
import com.spotify.sdk.android.auth.LoginActivity;
import h5.C0735m;

/* JADX INFO: loaded from: classes.dex */
public abstract class WebSocketListener {
    public void onClosed(WebSocket webSocket, int i, String str) {
        k.f("webSocket", webSocket);
        k.f("reason", str);
    }

    public void onClosing(WebSocket webSocket, int i, String str) {
        k.f("webSocket", webSocket);
        k.f("reason", str);
    }

    public void onFailure(WebSocket webSocket, Throwable th, Response response) {
        k.f("webSocket", webSocket);
        k.f("t", th);
    }

    public void onMessage(WebSocket webSocket, C0735m c0735m) {
        k.f("webSocket", webSocket);
        k.f("bytes", c0735m);
    }

    public void onOpen(WebSocket webSocket, Response response) {
        k.f("webSocket", webSocket);
        k.f(LoginActivity.RESPONSE_KEY, response);
    }

    public void onMessage(WebSocket webSocket, String str) {
        k.f("webSocket", webSocket);
        k.f("text", str);
    }
}

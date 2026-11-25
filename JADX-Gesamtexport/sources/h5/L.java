package h5;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes.dex */
public final class L extends C0728f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Socket f9333a;

    public L(Socket socket) {
        E4.k.f("socket", socket);
        this.f9333a = socket;
    }

    @Override // h5.C0728f
    public final IOException newTimeoutException(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // h5.C0728f
    public final void timedOut() {
        Socket socket = this.f9333a;
        try {
            socket.close();
        } catch (AssertionError e6) {
            if (!AbstractC0724b.f(e6)) {
                throw e6;
            }
            A.f9308a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e6);
        } catch (Exception e7) {
            A.f9308a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e7);
        }
    }
}

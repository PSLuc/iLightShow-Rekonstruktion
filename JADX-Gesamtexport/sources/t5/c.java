package t5;

import java.util.Arrays;
import javax.crypto.SecretKey;
import javax.security.auth.DestroyFailedException;
import javax.security.auth.Destroyable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f12598a = LoggerFactory.getLogger((Class<?>) c.class);

    public static b a(SecretKey secretKey) {
        if (secretKey == null) {
            return null;
        }
        byte[] encoded = secretKey.getEncoded();
        b bVar = new b(0, encoded == null ? 0 : encoded.length, secretKey.getAlgorithm(), encoded);
        Arrays.fill(encoded, (byte) 0);
        return bVar;
    }

    public static void b(SecretKey secretKey) {
        if (secretKey != null) {
            c(secretKey);
        }
    }

    public static void c(Destroyable destroyable) {
        if (destroyable != null) {
            try {
                destroyable.destroy();
            } catch (DestroyFailedException e6) {
                f12598a.warn("Destroy on {} failed!", destroyable.getClass(), e6);
            }
        }
    }
}

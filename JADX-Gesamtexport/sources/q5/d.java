package q5;

import com.philips.lighting.hue.sdk.wrapper.HueLog;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f11248a;

    static {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[HueLog.LogComponent.STREAMDTLS];
        secureRandom.nextBytes(bArr);
        f11248a = bArr;
    }
}

package m5;

import java.security.cert.CertPath;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f10443a = LoggerFactory.getLogger((Class<?>) e.class);

    public static boolean a(X509Certificate x509Certificate, boolean z5) {
        boolean[] keyUsage = x509Certificate.getKeyUsage();
        Logger logger = f10443a;
        if (keyUsage != null && !x509Certificate.getKeyUsage()[0]) {
            logger.debug("certificate: {}, not for signing!", x509Certificate.getSubjectDN());
            return false;
        }
        try {
            List<String> extendedKeyUsage = x509Certificate.getExtendedKeyUsage();
            if (extendedKeyUsage == null || extendedKeyUsage.isEmpty()) {
                logger.debug("certificate: {}, no extkeyusage!", x509Certificate.getSubjectDN());
            } else {
                logger.trace("certificate: {}", x509Certificate.getSubjectDN());
                String str = z5 ? "1.3.6.1.5.5.7.3.2" : "1.3.6.1.5.5.7.3.1";
                boolean z6 = false;
                for (String str2 : extendedKeyUsage) {
                    logger.trace("   extkeyusage {}", str2);
                    if (str.equals(str2)) {
                        z6 = true;
                    }
                }
                if (!z6) {
                    logger.debug("certificate: {}, not for {}!", x509Certificate.getSubjectDN(), z5 ? "client" : "server");
                    return false;
                }
            }
        } catch (CertificateParsingException e6) {
            logger.warn("x509 certificate:", (Throwable) e6);
        }
        return true;
    }

    public static CertPath b(boolean z5, CertPath certPath) throws CertPathValidatorException {
        throw new CertPathValidatorException("certificates are not trusted!");
    }
}

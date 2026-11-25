package org.eclipse.californium.scandium.dtls.cipher;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public class InvalidMacException extends GeneralSecurityException {
    public InvalidMacException() {
        super("MAC validation failed");
    }
}

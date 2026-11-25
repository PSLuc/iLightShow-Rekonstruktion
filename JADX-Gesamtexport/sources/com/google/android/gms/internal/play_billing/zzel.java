package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class zzel extends IOException {
    public zzel() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzel(long j4, long j6, int i, IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat("Pos: " + j4 + ", limit: " + j6 + ", len: " + i), indexOutOfBoundsException);
        Locale locale = Locale.US;
    }

    public zzel(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }
}

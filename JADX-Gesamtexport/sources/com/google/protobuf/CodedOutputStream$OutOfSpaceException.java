package com.google.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class CodedOutputStream$OutOfSpaceException extends IOException {
    public CodedOutputStream$OutOfSpaceException() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }
}

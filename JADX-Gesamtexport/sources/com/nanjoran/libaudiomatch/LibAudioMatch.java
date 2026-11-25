package com.nanjoran.libaudiomatch;

/* JADX INFO: loaded from: classes.dex */
public final class LibAudioMatch {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LibAudioMatch f8512a = new LibAudioMatch();

    static {
        System.loadLibrary("audiomatch");
    }

    public final native String matchAudio(short[] sArr, byte[] bArr, float f6, float f7);
}

package com.nanjoran.ilightshow.Services;

import com.nanjoran.ilightshow.Services.PlayerServices.MusicServiceType;

/* JADX INFO: renamed from: com.nanjoran.ilightshow.Services.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0683m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f8434a;

    static {
        int[] iArr = new int[MusicServiceType.values().length];
        try {
            iArr[MusicServiceType.Spotify.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MusicServiceType.Spotify_Connect.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MusicServiceType.Sonos.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[MusicServiceType.Apple_Music.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[MusicServiceType.Amazon_Music.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[MusicServiceType.Tidal.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[MusicServiceType.YouTube_Music.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[MusicServiceType.Deezer.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        f8434a = iArr;
    }
}

package H3;

import com.nanjoran.ilightshow.Services.PlayerServices.MusicServiceType;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f1786a;

    static {
        int[] iArr = new int[MusicServiceType.values().length];
        try {
            iArr[MusicServiceType.Spotify.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MusicServiceType.Sonos.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MusicServiceType.Amazon_Music.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[MusicServiceType.Deezer.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[MusicServiceType.Spotify_Connect.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[MusicServiceType.Apple_Music.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[MusicServiceType.Tidal.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[MusicServiceType.YouTube_Music.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        f1786a = iArr;
    }
}

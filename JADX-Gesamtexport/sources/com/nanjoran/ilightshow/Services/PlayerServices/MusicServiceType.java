package com.nanjoran.ilightshow.Services.PlayerServices;

import E4.k;
import H3.h;
import H3.i;
import M4.s;
import Y4.d;
import c5.C0503y;
import com.nanjoran.ilightshow.R;
import kotlin.NoWhenBranchMatchedException;
import p081p0.c;
import p084p4.f;
import p084p4.g;
import p128x4.a;

/* JADX INFO: loaded from: classes.dex */
@d
public enum MusicServiceType {
    Spotify_Connect,
    Spotify,
    Sonos,
    Apple_Music,
    Amazon_Music,
    Tidal,
    YouTube_Music,
    Deezer;

    private static final /* synthetic */ a $ENTRIES = c.i0(values());
    public static final h Companion = new h();
    private static final f $cachedSerializer$delegate = G4.a.y(g.f10847h, new H3.g(0));

    /* JADX INFO: Access modifiers changed from: private */
    public static final Y4.a _init_$_anonymous_() {
        MusicServiceType[] musicServiceTypeArrValues = values();
        k.f("values", musicServiceTypeArrValues);
        return new C0503y("com.nanjoran.ilightshow.Services.PlayerServices.MusicServiceType", musicServiceTypeArrValues);
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public final String getDisplayName() {
        return s.U(name(), "_", " ");
    }

    public final int getIcon() {
        switch (i.f1792a[ordinal()]) {
            case 1:
            case 2:
                return R.drawable.spotify_icon;
            case 3:
                return R.drawable.ic_speaker_black_24dp;
            case 4:
                return R.drawable.apple_music_icon;
            case 5:
                return R.drawable.amazon_music_logo;
            case 6:
                return R.drawable.tidal_logo;
            case 7:
                return R.drawable.youtube_music_icon;
            case 8:
                return R.drawable.deezer_logo;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final String getTagKey() {
        switch (i.f1792a[ordinal()]) {
            case 1:
            case 2:
                return "Spotify";
            case 3:
                return "Sonos";
            case 4:
                return "AppleMusic";
            case 5:
                return "Amazon";
            case 6:
                return "Tidal";
            case 7:
                return "YoutubeMusic";
            case 8:
                return "Deezer";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}

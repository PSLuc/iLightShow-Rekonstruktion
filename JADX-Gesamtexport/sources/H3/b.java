package H3;

import M4.s;
import N.C0217h0;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSessionManager;
import android.media.session.PlaybackState;
import com.nanjoran.ilightshow.Services.MyNotificationListener;
import com.nanjoran.ilightshow.Services.PlayerServices.MusicServiceType;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p015c2.AbstractC0473d;
import p089q4.z;

/* JADX INFO: loaded from: classes.dex */
public final class b extends d {
    public static final /* synthetic */ int i = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f1777h = 1000;

    @Override // H3.d
    public final long b() {
        return this.f1777h;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:104:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:107:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:97:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:99:0x01bb  */
    @Override // H3.d
    public final void d() {
        Object next;
        Bitmap bitmap;
        String string;
        B3.f fVar;
        B3.f fVarA;
        Context context = this.f1779a;
        if (context != null && AbstractC0473d.B(context)) {
            Object systemService = context.getSystemService((Class<Object>) MediaSessionManager.class);
            E4.k.c(systemService);
            Context context2 = this.f1779a;
            E4.k.c(context2);
            List<MediaController> activeSessions = ((MediaSessionManager) systemService).getActiveSessions(new ComponentName(context2, (Class<?>) MyNotificationListener.class));
            E4.k.e("getActiveSessions(...)", activeSessions);
            Map mapU = z.U(new p084p4.h(MusicServiceType.Deezer, "deezer.android.app"), new p084p4.h(MusicServiceType.Amazon_Music, "com.amazon.mp3"), new p084p4.h(MusicServiceType.YouTube_Music, "com.google.android.apps.youtube.music"), new p084p4.h(MusicServiceType.Apple_Music, "com.apple.android.music"), new p084p4.h(MusicServiceType.Tidal, "com.aspiro.tidal"));
            Iterator<T> it = activeSessions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                MediaController mediaController = (MediaController) next;
                PlaybackState playbackState = mediaController.getPlaybackState();
                if (playbackState != null && playbackState.getState() == 3 && E4.k.a(mediaController.getPackageName(), mapU.get(f.f1787d.b()))) {
                    break;
                }
            }
            MediaController mediaController2 = (MediaController) next;
            C0217h0 c0217h0 = this.f1781c;
            if (mediaController2 == null) {
                f(null);
                c0217h0.setValue("stopped");
                e();
                return;
            }
            mediaController2.getPackageName();
            PlaybackState playbackState2 = mediaController2.getPlaybackState();
            long j4 = 1000;
            long position = (playbackState2 != null ? playbackState2.getPosition() : 0L) / j4;
            MediaMetadata metadata = mediaController2.getMetadata();
            long j6 = (metadata != null ? metadata.getLong("android.media.metadata.DURATION") : 0L) / j4;
            MediaMetadata metadata2 = mediaController2.getMetadata();
            if (metadata2 != null) {
                metadata2.getString("android.media.metadata.TITLE");
            }
            MediaMetadata metadata3 = mediaController2.getMetadata();
            if (metadata3 != null) {
                metadata3.getString("android.media.metadata.ALBUM");
            }
            MediaMetadata metadata4 = mediaController2.getMetadata();
            if (metadata4 != null) {
                metadata4.getString("android.media.metadata.ARTIST");
            }
            MediaMetadata metadata5 = mediaController2.getMetadata();
            if (metadata5 != null) {
                metadata5.getString("android.media.metadata.MEDIA_ID");
            }
            MediaMetadata metadata6 = mediaController2.getMetadata();
            String string2 = metadata6 != null ? metadata6.getString("android.media.metadata.TITLE") : null;
            MediaMetadata metadata7 = mediaController2.getMetadata();
            String string3 = metadata7 != null ? metadata7.getString("android.media.metadata.ARTIST") : null;
            MediaMetadata metadata8 = mediaController2.getMetadata();
            String string4 = metadata8 != null ? metadata8.getString("android.media.metadata.MEDIA_ID") : null;
            MediaMetadata metadata9 = mediaController2.getMetadata();
            Double dValueOf = metadata9 != null ? Double.valueOf(metadata9.getLong("android.media.metadata.DURATION") / ((double) 1000)) : null;
            MediaMetadata metadata10 = mediaController2.getMetadata();
            if (metadata10 == null || (bitmap = metadata10.getBitmap("android.media.metadata.ALBUM_ART")) == null) {
                MediaMetadata metadata11 = mediaController2.getMetadata();
                bitmap = metadata11 != null ? metadata11.getBitmap("android.media.metadata.ALBUM_ART") : null;
            }
            MediaMetadata metadata12 = mediaController2.getMetadata();
            if (metadata12 == null || (string = metadata12.getString("android.media.metadata.ART_URI")) == null) {
                MediaMetadata metadata13 = mediaController2.getMetadata();
                string = metadata13 != null ? metadata13.getString("android.media.metadata.ALBUM_ART_URI") : null;
            }
            c0217h0.setValue("playing");
            B3.f fVarA2 = a();
            if (E4.k.a(string2, fVarA2 != null ? fVarA2.f557b : null)) {
                B3.f fVarA3 = a();
                if (E4.k.a(string3, fVarA3 != null ? fVarA3.f558c : null)) {
                    B3.f fVarA4 = a();
                    Double d6 = fVarA4 != null ? fVarA4.f559d : null;
                    if (dValueOf != null ? d6 == null || dValueOf.doubleValue() != d6.doubleValue() : d6 != null) {
                        fVar = new B3.f();
                        fVar.f557b = string2;
                        fVar.f558c = string3;
                        fVar.f559d = dValueOf;
                        fVar.i = string4;
                        fVar.f564j = mediaController2.getPackageName();
                        if (string4 != null) {
                            fVar.f563h = s.U(string4, "spotify:track:", "");
                        }
                        if (bitmap != null) {
                            fVar.f566l.setValue(bitmap);
                        } else {
                            fVar.f562g.setValue(string);
                        }
                        f(fVar);
                        this.f1782d.setValue(a.i);
                        this.f1783e.setValue(a.f1775h);
                        fVarA = a();
                        if (fVarA != null) {
                            fVarA.f();
                        }
                        e();
                    }
                } else {
                    fVar = new B3.f();
                    fVar.f557b = string2;
                    fVar.f558c = string3;
                    fVar.f559d = dValueOf;
                    fVar.i = string4;
                    fVar.f564j = mediaController2.getPackageName();
                    if (string4 != null) {
                        fVar.f563h = s.U(string4, "spotify:track:", "");
                    }
                    if (bitmap != null) {
                        fVar.f566l.setValue(bitmap);
                    } else {
                        fVar.f562g.setValue(string);
                    }
                    f(fVar);
                    this.f1782d.setValue(a.i);
                    this.f1783e.setValue(a.f1775h);
                    fVarA = a();
                    if (fVarA != null) {
                        fVarA.f();
                    }
                    e();
                }
            } else {
                fVar = new B3.f();
                fVar.f557b = string2;
                fVar.f558c = string3;
                fVar.f559d = dValueOf;
                fVar.i = string4;
                fVar.f564j = mediaController2.getPackageName();
                if (string4 != null && s.W(string4, "spotify:track:", false)) {
                    fVar.f563h = s.U(string4, "spotify:track:", "");
                }
                if (bitmap != null) {
                    fVar.f566l.setValue(bitmap);
                } else {
                    fVar.f562g.setValue(string);
                }
                f(fVar);
                this.f1782d.setValue(a.i);
                this.f1783e.setValue(a.f1775h);
                fVarA = a();
                if (fVarA != null) {
                    fVarA.f();
                }
                e();
            }
            B3.f fVarA5 = a();
            if (fVarA5 != null) {
                PlaybackState playbackState3 = mediaController2.getPlaybackState();
                fVarA5.j(playbackState3 != null ? Double.valueOf(playbackState3.getPosition() / ((double) 1000)) : null);
            }
            e();
        }
    }
}

package com.nanjoran.ilightshow.Services;

import P4.InterfaceC0335w;
import android.media.AudioRecord;
import android.os.Process;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.nanjoran.ilightshow.Services.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0692s extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0693t f8478l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AudioRecord f8479m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0692s(C0693t c0693t, AudioRecord audioRecord, p111u4.d dVar) {
        super(2, dVar);
        this.f8478l = c0693t;
        this.f8479m = audioRecord;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        return new C0692s(this.f8478l, this.f8479m, dVar);
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        C0692s c0692s = (C0692s) b((InterfaceC0335w) obj, (p111u4.d) obj2);
        p084p4.x xVar = p084p4.x.f10867a;
        c0692s.o(xVar);
        return xVar;
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        B3.f fVarA;
        AudioRecord audioRecord = this.f8479m;
        v4.a aVar = v4.a.f13292h;
        S1.V.O(obj);
        int minBufferSize = AudioRecord.getMinBufferSize(16000, 16, 2) / 2;
        C0693t c0693t = this.f8478l;
        int i = c0693t.f8485d;
        AtomicBoolean atomicBoolean = c0693t.f8483b;
        int i3 = 16000 * i;
        short[] sArr = new short[i3];
        Process.setThreadPriority(-19);
        try {
            try {
                audioRecord.startRecording();
                short[] sArr2 = new short[minBufferSize];
                int i6 = 0;
                while (atomicBoolean.get()) {
                    int i7 = audioRecord.read(sArr2, 0, minBufferSize, 0);
                    if (i7 > 0) {
                        for (int i8 = 0; i8 < i7; i8++) {
                            sArr[i6] = sArr2[i8];
                            i6 = (i6 + 1) % i3;
                        }
                    }
                    if (i6 % 32000 == 0) {
                        short[] sArr3 = new short[i3];
                        for (int i9 = 0; i9 < i3; i9++) {
                            sArr3[i9] = sArr[(i6 + i9) % i3];
                        }
                        H3.d dVarA = H3.f.f1787d.a();
                        if (dVarA != null && (fVarA = dVarA.a()) != null) {
                            fVarA.e(sArr3);
                        }
                    }
                }
                AudioRecord audioRecord2 = c0693t.f8487f;
                if (audioRecord2 != null) {
                    audioRecord2.release();
                }
            } catch (Exception unused) {
                atomicBoolean.set(false);
                AudioRecord audioRecord3 = c0693t.f8487f;
                if (audioRecord3 != null) {
                    audioRecord3.release();
                }
            }
            c0693t.f8487f = null;
            atomicBoolean.set(false);
            return p084p4.x.f10867a;
        } catch (Throwable th) {
            AudioRecord audioRecord4 = c0693t.f8487f;
            if (audioRecord4 != null) {
                audioRecord4.release();
            }
            c0693t.f8487f = null;
            atomicBoolean.set(false);
            throw th;
        }
    }
}

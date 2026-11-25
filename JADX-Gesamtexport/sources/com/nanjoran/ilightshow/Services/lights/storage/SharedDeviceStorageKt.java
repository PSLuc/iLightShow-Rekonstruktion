package com.nanjoran.ilightshow.Services.lights.storage;

import E4.k;
import K3.d;
import Z2.f;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class SharedDeviceStorageKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[d.values().length];
            try {
                f fVar = d.f2132h;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f fVar2 = d.f2132h;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f fVar3 = d.f2132h;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f fVar4 = d.f2132h;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String sharedStorageTypeId(d dVar) {
        k.f("<this>", dVar);
        int i = WhenMappings.$EnumSwitchMapping$0[dVar.ordinal()];
        if (i == 1) {
            return "hue.bridge";
        }
        if (i == 2) {
            return "lifx.light";
        }
        if (i == 3) {
            return "nanoleaf.panel";
        }
        if (i == 4) {
            return "nanoleaf.essentials";
        }
        throw new NoWhenBranchMatchedException();
    }
}

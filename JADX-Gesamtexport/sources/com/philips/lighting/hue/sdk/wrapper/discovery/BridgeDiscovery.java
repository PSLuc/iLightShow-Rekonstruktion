package com.philips.lighting.hue.sdk.wrapper.discovery;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nonnull;

/* JADX INFO: loaded from: classes.dex */
public interface BridgeDiscovery {

    public interface Callback {
        void onFinished(@Nonnull List<BridgeDiscoveryResult> list, @Nonnull ReturnCode returnCode);
    }

    public enum Option {
        UPNP,
        IPSCAN,
        NUPNP,
        MDNS;


        @Deprecated
        public static final int ALL;

        @Deprecated
        public static final int NUPNP_AND_IPSCAN;

        @Deprecated
        public static final int UPNP_AND_IPSCAN;

        @Deprecated
        public static final int UPNP_AND_NUPNP;
        public final int flag = 1 << ordinal();

        static {
            Option option = UPNP;
            Option option2 = IPSCAN;
            Option option3 = NUPNP;
            Option option4 = MDNS;
            int i = option.flag;
            int i3 = option3.flag;
            UPNP_AND_NUPNP = i | i3;
            int i6 = option2.flag;
            UPNP_AND_IPSCAN = i | i6;
            NUPNP_AND_IPSCAN = i3 | i6;
            ALL = i | i3 | i6 | option4.flag;
        }

        Option() {
        }

        @Nonnull
        public static EnumSet<Option> enumSetFromValue(long j4) {
            EnumSet<Option> enumSetNoneOf = EnumSet.noneOf(Option.class);
            for (Option option : EnumSet.allOf(Option.class)) {
                if ((((long) option.flag) & j4) != 0) {
                    enumSetNoneOf.add(option);
                }
            }
            return enumSetNoneOf;
        }

        public static long valueFromEnumSet(@Nonnull EnumSet<Option> enumSet) {
            Iterator<Option> it = enumSet.iterator();
            long j4 = 0;
            while (it.hasNext()) {
                j4 |= (long) it.next().flag;
            }
            return j4;
        }
    }

    public enum ReturnCode {
        SUCCESS(0),
        BUSY(-5),
        NULL_PARAMETER(-101),
        STOPPED(-303),
        MISSING_DISCOVERY_METHODS(-401);

        private final int value;

        ReturnCode(int i) {
            this.value = i;
        }

        public static ReturnCode fromValue(int i) {
            for (ReturnCode returnCode : values()) {
                if (returnCode.getValue() == i) {
                    return returnCode;
                }
            }
            return null;
        }

        public int getValue() {
            return this.value;
        }
    }

    boolean isSearching();

    @Deprecated
    void search(int i, Callback callback);

    void search(Callback callback);

    @Deprecated
    void search(Option option, Callback callback);

    void search(@Nonnull EnumSet<Option> enumSet, Callback callback);

    void stop();
}

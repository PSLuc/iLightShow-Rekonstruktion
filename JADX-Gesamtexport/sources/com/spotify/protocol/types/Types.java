package com.spotify.protocol.types;

import B.AbstractC0013g0;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public interface Types {

    public static class RequestId {
        public static final RequestId NONE = new RequestId(-1);
        private final int mValue;

        private RequestId(int i) {
            this.mValue = i;
        }

        public static RequestId from(int i) {
            return new RequestId(i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RequestId) && this.mValue == ((RequestId) obj).mValue;
        }

        public int getRaw() {
            return this.mValue;
        }

        public int hashCode() {
            return this.mValue;
        }

        public String toString() {
            Locale locale = Locale.US;
            return AbstractC0013g0.f(this.mValue, "RequestId{", "}");
        }
    }

    public static class SubscriptionId {
        public static final SubscriptionId NONE = new SubscriptionId(-1);
        private final int mValue;

        private SubscriptionId(int i) {
            this.mValue = i;
        }

        public static SubscriptionId from(int i) {
            return new SubscriptionId(i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SubscriptionId) && this.mValue == ((SubscriptionId) obj).mValue;
        }

        public int getRaw() {
            return this.mValue;
        }

        public int hashCode() {
            return this.mValue;
        }

        public String toString() {
            Locale locale = Locale.US;
            return AbstractC0013g0.f(this.mValue, "SubscriptionId{", "}");
        }
    }
}

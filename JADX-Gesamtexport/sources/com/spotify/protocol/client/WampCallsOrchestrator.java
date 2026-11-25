package com.spotify.protocol.client;

import com.spotify.protocol.mappers.JsonObject;
import com.spotify.protocol.types.Types;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class WampCallsOrchestrator {
    private final AtomicInteger mIdGenerator = new AtomicInteger(0);
    private final Map<Types.RequestId, CallRecord<?>> mCallsMap = new ConcurrentHashMap();
    private final Map<Types.RequestId, SubscriptionRecord<?>> mSubscriptionsMap = new ConcurrentHashMap();
    private final Map<Types.SubscriptionId, Types.RequestId> mSubscriptionIdToRequestId = new ConcurrentHashMap();

    public static class CallRecord<T> {
        final CallResult<T> mCallResult;
        final Types.RequestId mId;
        private final Class<T> mType;

        public CallRecord(Types.RequestId requestId, CallResult<T> callResult, Class<T> cls) {
            this.mType = cls;
            this.mId = (Types.RequestId) Coding.checkNotNull(requestId);
            this.mCallResult = (CallResult) Coding.checkNotNull(callResult);
        }

        public void deliverResultWithPayload(JsonObject jsonObject) {
            try {
                this.mCallResult.deliverResult(ResultUtils.createSuccessfulResult(jsonObject.getAs(this.mType)));
            } catch (Exception e6) {
                this.mCallResult.deliverError(e6);
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof CallRecord) {
                return this.mId.equals(((CallRecord) obj).mId);
            }
            return false;
        }

        public int hashCode() {
            return this.mId.hashCode();
        }
    }

    public static class SubscriptionRecord<T> {
        final Class<T> mEventType;
        final Types.RequestId mId;
        final Subscription<T> mSubscription;
        Types.SubscriptionId mSubscriptionId = Types.SubscriptionId.NONE;

        public SubscriptionRecord(Types.RequestId requestId, Subscription<T> subscription, Class<T> cls) {
            this.mEventType = cls;
            this.mId = (Types.RequestId) Coding.checkNotNull(requestId);
            this.mSubscription = (Subscription) Coding.checkNotNull(subscription);
        }

        public void deliverEventWithPayload(JsonObject jsonObject) {
            try {
                this.mSubscription.deliverResult(ResultUtils.createSuccessfulResult(jsonObject.getAs(this.mEventType)));
            } catch (Exception e6) {
                this.mSubscription.deliverError(e6);
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof SubscriptionRecord) {
                return this.mId.equals(((SubscriptionRecord) obj).mId);
            }
            return false;
        }

        public int hashCode() {
            return this.mId.hashCode();
        }
    }

    public CallRecord<?> findCallById(Types.RequestId requestId) {
        return this.mCallsMap.get(requestId);
    }

    @Nullable
    public SubscriptionRecord<?> findSubscriptionById(Types.SubscriptionId subscriptionId) {
        Types.RequestId requestId = this.mSubscriptionIdToRequestId.get(subscriptionId);
        if (requestId != null) {
            return findSubscriptionByRequestId(requestId);
        }
        return null;
    }

    public SubscriptionRecord<?> findSubscriptionByRequestId(Types.RequestId requestId) {
        return this.mSubscriptionsMap.get(requestId);
    }

    public Types.RequestId getNextRequestId() {
        return Types.RequestId.from(this.mIdGenerator.getAndIncrement());
    }

    public <T> CallRecord<T> newCall(Class<T> cls) {
        Types.RequestId nextRequestId = getNextRequestId();
        CallRecord<T> callRecord = new CallRecord<>(nextRequestId, new CallResult(nextRequestId), cls);
        this.mCallsMap.put(callRecord.mId, callRecord);
        return callRecord;
    }

    public <T> SubscriptionRecord<T> newSubscription(RemoteWampClient remoteWampClient, Class<T> cls) {
        Types.RequestId nextRequestId = getNextRequestId();
        SubscriptionRecord<T> subscriptionRecord = new SubscriptionRecord<>(nextRequestId, new Subscription(nextRequestId, remoteWampClient), cls);
        this.mSubscriptionsMap.put(subscriptionRecord.mId, subscriptionRecord);
        return subscriptionRecord;
    }

    public void onSubscriptionIdReceived(Types.RequestId requestId, Types.SubscriptionId subscriptionId) {
        this.mSubscriptionIdToRequestId.put(subscriptionId, requestId);
        SubscriptionRecord<?> subscriptionRecordFindSubscriptionByRequestId = findSubscriptionByRequestId(requestId);
        if (subscriptionRecordFindSubscriptionByRequestId != null) {
            subscriptionRecordFindSubscriptionByRequestId.mSubscriptionId = subscriptionId;
            return;
        }
        String str = String.format("Cannot find a subscription record for [%s]", requestId);
        Debug.e(str, new Object[0]);
        Debug.assertTrue(false, str);
    }

    public void removeCall(Types.RequestId requestId) {
        this.mCallsMap.remove(requestId);
    }

    public void removeSubscription(Types.SubscriptionId subscriptionId) {
        this.mSubscriptionsMap.remove(this.mSubscriptionIdToRequestId.remove(subscriptionId));
    }

    public void removeSubscriptionByRequestId(Types.RequestId requestId) {
        this.mSubscriptionsMap.remove(requestId);
    }
}

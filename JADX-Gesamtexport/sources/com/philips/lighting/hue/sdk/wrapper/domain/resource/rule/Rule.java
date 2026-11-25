package com.philips.lighting.hue.sdk.wrapper.domain.resource.rule;

import com.philips.lighting.hue.sdk.wrapper.SessionObject;
import com.philips.lighting.hue.sdk.wrapper.connection.BridgeConnectionType;
import com.philips.lighting.hue.sdk.wrapper.connection.BridgeResponseCallback;
import com.philips.lighting.hue.sdk.wrapper.connection.BridgeResponseDispatcher;
import com.philips.lighting.hue.sdk.wrapper.domain.Bridge;
import com.philips.lighting.hue.sdk.wrapper.domain.DomainType;
import com.philips.lighting.hue.sdk.wrapper.domain.ReturnCode;
import com.philips.lighting.hue.sdk.wrapper.domain.clip.ClipAction;
import com.philips.lighting.hue.sdk.wrapper.domain.clip.ClipCondition;
import com.philips.lighting.hue.sdk.wrapper.domain.resource.BridgeResource;
import com.philips.lighting.hue.sdk.wrapper.utilities.Executor;
import com.philips.lighting.hue.sdk.wrapper.utilities.NativeTools;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import p012c.k;

/* JADX INFO: loaded from: classes.dex */
public class Rule extends SessionObject implements BridgeResource {
    private List<ClipAction> actions;
    private List<ClipCondition> conditions;
    private Date created;
    private byte[] identifier;
    private Date lastTriggered;
    private byte[] name;
    private byte[] owner;
    private Boolean recycle;
    private RuleStatus status;
    private Integer timesTriggered;

    public Rule(long j4) {
        super(j4);
        this.identifier = null;
        this.name = null;
        this.owner = null;
        this.conditions = null;
        this.actions = null;
        this.status = null;
        this.lastTriggered = null;
        this.timesTriggered = null;
        this.created = null;
        this.recycle = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native void fetchNative(int i, BridgeResponseCallback bridgeResponseCallback);

    private void setStatusFromInt(int i) {
        this.status = RuleStatus.fromValue(i);
    }

    public void addAction(ClipAction clipAction) {
        if (this.actions == null) {
            this.actions = new ArrayList();
        }
        this.actions.add(clipAction);
    }

    public void addCondition(ClipCondition clipCondition) {
        if (this.conditions == null) {
            this.conditions = new ArrayList();
        }
        this.conditions.add(clipCondition);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.SessionObject, com.philips.lighting.hue.sdk.wrapper.domain.Bridge, com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Rule rule = (Rule) obj;
        List<ClipAction> list = this.actions;
        if (list == null) {
            if (rule.actions != null) {
                return false;
            }
        } else if (!list.equals(rule.actions)) {
            return false;
        }
        List<ClipCondition> list2 = this.conditions;
        if (list2 == null) {
            if (rule.conditions != null) {
                return false;
            }
        } else if (!list2.equals(rule.conditions)) {
            return false;
        }
        Date date = this.created;
        if (date == null) {
            if (rule.created != null) {
                return false;
            }
        } else if (!date.equals(rule.created)) {
            return false;
        }
        if (!Arrays.equals(this.identifier, rule.identifier)) {
            return false;
        }
        Date date2 = this.lastTriggered;
        if (date2 == null) {
            if (rule.lastTriggered != null) {
                return false;
            }
        } else if (!date2.equals(rule.lastTriggered)) {
            return false;
        }
        if (!Arrays.equals(this.name, rule.name) || !Arrays.equals(this.owner, rule.owner)) {
            return false;
        }
        Boolean bool = this.recycle;
        if (bool == null) {
            if (rule.recycle != null) {
                return false;
            }
        } else if (!bool.equals(rule.recycle)) {
            return false;
        }
        if (this.status != rule.status) {
            return false;
        }
        Integer num = this.timesTriggered;
        if (num == null) {
            if (rule.timesTriggered != null) {
                return false;
            }
        } else if (!num.equals(rule.timesTriggered)) {
            return false;
        }
        return true;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public void fetch(BridgeResponseCallback bridgeResponseCallback) {
        fetch(BridgeConnectionType.LOCAL_REMOTE, bridgeResponseCallback);
    }

    public List<ClipAction> getActions() {
        return this.actions;
    }

    public ClipAction[] getActionsArray() {
        List<ClipAction> list = this.actions;
        if (list == null) {
            return null;
        }
        ClipAction[] clipActionArr = new ClipAction[list.size()];
        for (int i = 0; i < this.actions.size(); i++) {
            clipActionArr[i] = this.actions.get(i);
        }
        return clipActionArr;
    }

    public List<ClipCondition> getConditions() {
        return this.conditions;
    }

    public ClipCondition[] getConditionsArray() {
        List<ClipCondition> list = this.conditions;
        if (list == null) {
            return null;
        }
        ClipCondition[] clipConditionArr = new ClipCondition[list.size()];
        for (int i = 0; i < this.conditions.size(); i++) {
            clipConditionArr[i] = this.conditions.get(i);
        }
        return clipConditionArr;
    }

    public Date getCreated() {
        return this.created;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public int getDomainType() {
        return getType().getValue();
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public String getIdentifier() {
        return NativeTools.BytesToString(this.identifier);
    }

    public Date getLastTriggered() {
        return this.lastTriggered;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.resource.BridgeResource
    public String getName() {
        return NativeTools.BytesToString(this.name);
    }

    public String getOwner() {
        return NativeTools.BytesToString(this.owner);
    }

    public Boolean getRecycle() {
        return this.recycle;
    }

    public RuleStatus getStatus() {
        return this.status;
    }

    public int getStatusAsInt() {
        RuleStatus ruleStatus = this.status;
        return ruleStatus != null ? ruleStatus.getValue() : RuleStatus.UNKNOWN.getValue();
    }

    public Integer getTimesTriggered() {
        return this.timesTriggered;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public DomainType getType() {
        return DomainType.RULE;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.SessionObject, com.philips.lighting.hue.sdk.wrapper.domain.Bridge, com.philips.lighting.hue.sdk.wrapper.domain.device.Device
    public int hashCode() {
        List<ClipAction> list = this.actions;
        int iHashCode = ((list == null ? 0 : list.hashCode()) + 31) * 31;
        List<ClipCondition> list2 = this.conditions;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        Date date = this.created;
        int iN = k.n(this.identifier, (iHashCode2 + (date == null ? 0 : date.hashCode())) * 31, 31);
        Date date2 = this.lastTriggered;
        int iN2 = k.n(this.owner, k.n(this.name, (iN + (date2 == null ? 0 : date2.hashCode())) * 31, 31), 31);
        Boolean bool = this.recycle;
        int iHashCode3 = (iN2 + (bool == null ? 0 : bool.hashCode())) * 31;
        RuleStatus ruleStatus = this.status;
        int iHashCode4 = (iHashCode3 + (ruleStatus == null ? 0 : ruleStatus.hashCode())) * 31;
        Integer num = this.timesTriggered;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public boolean isOfType(DomainType domainType) {
        return getType() == domainType;
    }

    public void setActions(List<ClipAction> list) {
        this.actions = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public void setBridge(Bridge bridge) {
        setSessionKey(((SessionObject) bridge).getSessionKey());
    }

    public void setConditions(List<ClipCondition> list) {
        this.conditions = list;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public void setIdentifier(String str) {
        this.identifier = NativeTools.StringToBytes(str);
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.resource.BridgeResource
    public void setName(String str) {
        this.name = NativeTools.StringToBytes(str);
    }

    public void setRecycle(Boolean bool) {
        this.recycle = bool;
    }

    public void setStatus(RuleStatus ruleStatus) {
        this.status = ruleStatus;
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.SessionObject
    public void syncNative() {
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public void fetch(final BridgeConnectionType bridgeConnectionType, final BridgeResponseCallback bridgeResponseCallback) {
        if (bridgeConnectionType == null) {
            BridgeResponseDispatcher.dispatch(bridgeResponseCallback, null, ReturnCode.NOT_ALLOWED);
        } else {
            Executor.submit(new Runnable() { // from class: com.philips.lighting.hue.sdk.wrapper.domain.resource.rule.Rule.1
                @Override // java.lang.Runnable
                public void run() {
                    Rule.this.fetchNative(bridgeConnectionType.getValue(), bridgeResponseCallback);
                }
            });
        }
    }

    @Override // com.philips.lighting.hue.sdk.wrapper.domain.DomainObject
    public boolean isOfType(int i) {
        return isOfType(DomainType.fromValue(i));
    }

    public void setRecycle(boolean z5) {
        this.recycle = new Boolean(z5);
    }

    public Rule() {
        this.identifier = null;
        this.name = null;
        this.owner = null;
        this.conditions = null;
        this.actions = null;
        this.status = null;
        this.lastTriggered = null;
        this.timesTriggered = null;
        this.created = null;
        this.recycle = null;
    }
}

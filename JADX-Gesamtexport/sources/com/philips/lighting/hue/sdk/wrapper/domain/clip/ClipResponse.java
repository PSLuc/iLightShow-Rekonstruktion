package com.philips.lighting.hue.sdk.wrapper.domain.clip;

import com.philips.lighting.hue.sdk.wrapper.domain.BridgeBackupStatus;
import com.philips.lighting.hue.sdk.wrapper.domain.device.light.StartUpMode;
import com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.switches.SwitchButtonEvent;
import com.philips.lighting.hue.sdk.wrapper.domain.resource.GroupType;
import com.philips.lighting.hue.sdk.wrapper.domain.resource.ScheduleStatus;
import com.philips.lighting.hue.sdk.wrapper.domain.resource.rule.RuleStatus;
import com.philips.lighting.hue.sdk.wrapper.utilities.NativeTools;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import p012c.k;

/* JADX INFO: loaded from: classes.dex */
public class ClipResponse {
    private byte[] resourceName;
    private Alert alertValue = null;
    private Boolean booleanValue = null;
    private ColorMode colorModeValue = null;
    private SwitchButtonEvent switchButtonEventValue = null;
    private Date dateValue = null;
    private Double doubleValue = null;
    private DoublePair doublePairValue = null;
    private Effect effectValue = null;
    private GroupType groupTypeValue = null;
    private Integer integerValue = null;
    private byte[] stringValue = null;
    private byte[][] stringArrayValue = null;
    private PortalConnectionState portalConnectionStateValue = null;
    private ScheduleStatus scheduleStatusValue = null;
    private RuleStatus ruleStatusValue = null;
    private ClipConditionOperator clipOperatorValue = null;
    private BridgeBackupStatus bridgeBackupStatusValue = null;
    private LightArchetype lightArchetype = null;
    private LightDirection lightDirection = null;
    private LightFunction lightFunction = null;
    private StartUpMode startUpMode = null;

    public ClipResponse(byte[] bArr) {
        this.resourceName = bArr;
    }

    private void setAlertValue(Alert alert) {
        this.alertValue = alert;
    }

    private void setBridgeBackupStatusValueFromInt(int i) {
        this.bridgeBackupStatusValue = BridgeBackupStatus.fromValue(i);
    }

    private void setClipOperatorFromInt(int i) {
        this.clipOperatorValue = ClipConditionOperator.fromValue(i);
    }

    private void setColorModeValueFromInt(int i) {
        this.colorModeValue = ColorMode.fromValue(i);
    }

    private void setEffectValueFromInt(int i) {
        this.effectValue = Effect.fromValue(i);
    }

    private void setGroupTypeValueFromInt(int i) {
        this.groupTypeValue = GroupType.fromValue(i);
    }

    private void setLightArchetype(LightArchetype lightArchetype) {
        this.lightArchetype = lightArchetype;
    }

    private void setLightDirection(LightDirection lightDirection) {
        this.lightDirection = lightDirection;
    }

    private void setLightFunction(LightFunction lightFunction) {
        this.lightFunction = lightFunction;
    }

    private void setPortalConnectionStateValueFromInt(int i) {
        this.portalConnectionStateValue = PortalConnectionState.fromValue(i);
    }

    private void setRuleStatusFromInt(int i) {
        this.ruleStatusValue = RuleStatus.fromValue(i);
    }

    private void setScheduleStatusFromInt(int i) {
        this.scheduleStatusValue = ScheduleStatus.fromValue(i);
    }

    private void setStartUpMode(StartUpMode startUpMode) {
        this.startUpMode = startUpMode;
    }

    private void setSwitchButtonEventValueFromInt(int i) {
        this.switchButtonEventValue = SwitchButtonEvent.fromValue(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClipResponse clipResponse = (ClipResponse) obj;
        if (this.alertValue != clipResponse.alertValue) {
            return false;
        }
        Boolean bool = this.booleanValue;
        if (bool == null) {
            if (clipResponse.booleanValue != null) {
                return false;
            }
        } else if (!bool.equals(clipResponse.booleanValue)) {
            return false;
        }
        if (this.bridgeBackupStatusValue != clipResponse.bridgeBackupStatusValue || this.clipOperatorValue != clipResponse.clipOperatorValue || this.colorModeValue != clipResponse.colorModeValue) {
            return false;
        }
        Date date = this.dateValue;
        if (date == null) {
            if (clipResponse.dateValue != null) {
                return false;
            }
        } else if (!date.equals(clipResponse.dateValue)) {
            return false;
        }
        DoublePair doublePair = this.doublePairValue;
        if (doublePair == null) {
            if (clipResponse.doublePairValue != null) {
                return false;
            }
        } else if (!doublePair.equals(clipResponse.doublePairValue)) {
            return false;
        }
        Double d6 = this.doubleValue;
        if (d6 == null) {
            if (clipResponse.doubleValue != null) {
                return false;
            }
        } else if (!d6.equals(clipResponse.doubleValue)) {
            return false;
        }
        if (this.effectValue != clipResponse.effectValue || this.groupTypeValue != clipResponse.groupTypeValue) {
            return false;
        }
        Integer num = this.integerValue;
        if (num == null) {
            if (clipResponse.integerValue != null) {
                return false;
            }
        } else if (!num.equals(clipResponse.integerValue)) {
            return false;
        }
        return this.portalConnectionStateValue == clipResponse.portalConnectionStateValue && Arrays.equals(this.resourceName, clipResponse.resourceName) && this.ruleStatusValue == clipResponse.ruleStatusValue && this.scheduleStatusValue == clipResponse.scheduleStatusValue && Arrays.deepEquals(this.stringArrayValue, clipResponse.stringArrayValue) && Arrays.equals(this.stringValue, clipResponse.stringValue) && this.switchButtonEventValue == clipResponse.switchButtonEventValue;
    }

    public Alert getAlertValue() {
        return this.alertValue;
    }

    public Boolean getBooleanValue() {
        return this.booleanValue;
    }

    public BridgeBackupStatus getBridgeBackupStatusValue() {
        return this.bridgeBackupStatusValue;
    }

    public ClipConditionOperator getClipOperatorValue() {
        return this.clipOperatorValue;
    }

    public ColorMode getColorModeValue() {
        return this.colorModeValue;
    }

    public Date getDateValue() {
        return this.dateValue;
    }

    public DoublePair getDoublePairValue() {
        return this.doublePairValue;
    }

    public Double getDoubleValue() {
        return this.doubleValue;
    }

    public Effect getEffectValue() {
        return this.effectValue;
    }

    public GroupType getGroupTypeValue() {
        return this.groupTypeValue;
    }

    public Integer getIntegerValue() {
        return this.integerValue;
    }

    public LightArchetype getLightArchetype() {
        return this.lightArchetype;
    }

    public LightDirection getLightDirection() {
        return this.lightDirection;
    }

    public LightFunction getLightFunction() {
        return this.lightFunction;
    }

    public PortalConnectionState getPortalConnectionStateValue() {
        return this.portalConnectionStateValue;
    }

    public String getResourceName() {
        return NativeTools.BytesToString(this.resourceName);
    }

    public RuleStatus getRuleStatusValue() {
        return this.ruleStatusValue;
    }

    public ScheduleStatus getScheduleStatusValue() {
        return this.scheduleStatusValue;
    }

    public StartUpMode getStartUpMode() {
        return this.startUpMode;
    }

    public List<String> getStringArrayValue() {
        ArrayList arrayList = new ArrayList();
        for (byte[] bArr : this.stringArrayValue) {
            arrayList.add(NativeTools.BytesToString(bArr));
        }
        return arrayList;
    }

    public String getStringValue() {
        return NativeTools.BytesToString(this.stringValue);
    }

    public SwitchButtonEvent getSwitchButtonEventValue() {
        return this.switchButtonEventValue;
    }

    public int hashCode() {
        Alert alert = this.alertValue;
        int iHashCode = ((alert == null ? 0 : alert.hashCode()) + 31) * 31;
        Boolean bool = this.booleanValue;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        BridgeBackupStatus bridgeBackupStatus = this.bridgeBackupStatusValue;
        int iHashCode3 = (iHashCode2 + (bridgeBackupStatus == null ? 0 : bridgeBackupStatus.hashCode())) * 31;
        ClipConditionOperator clipConditionOperator = this.clipOperatorValue;
        int iHashCode4 = (iHashCode3 + (clipConditionOperator == null ? 0 : clipConditionOperator.hashCode())) * 31;
        ColorMode colorMode = this.colorModeValue;
        int iHashCode5 = (iHashCode4 + (colorMode == null ? 0 : colorMode.hashCode())) * 31;
        Date date = this.dateValue;
        int iHashCode6 = (iHashCode5 + (date == null ? 0 : date.hashCode())) * 31;
        DoublePair doublePair = this.doublePairValue;
        int iHashCode7 = (iHashCode6 + (doublePair == null ? 0 : doublePair.hashCode())) * 31;
        Double d6 = this.doubleValue;
        int iHashCode8 = (iHashCode7 + (d6 == null ? 0 : d6.hashCode())) * 31;
        Effect effect = this.effectValue;
        int iHashCode9 = (iHashCode8 + (effect == null ? 0 : effect.hashCode())) * 31;
        GroupType groupType = this.groupTypeValue;
        int iHashCode10 = (iHashCode9 + (groupType == null ? 0 : groupType.hashCode())) * 31;
        Integer num = this.integerValue;
        int iHashCode11 = (iHashCode10 + (num == null ? 0 : num.hashCode())) * 31;
        PortalConnectionState portalConnectionState = this.portalConnectionStateValue;
        int iN = k.n(this.resourceName, (iHashCode11 + (portalConnectionState == null ? 0 : portalConnectionState.hashCode())) * 31, 31);
        RuleStatus ruleStatus = this.ruleStatusValue;
        int iHashCode12 = (iN + (ruleStatus == null ? 0 : ruleStatus.hashCode())) * 31;
        ScheduleStatus scheduleStatus = this.scheduleStatusValue;
        int iN2 = k.n(this.stringValue, (Arrays.hashCode(this.stringArrayValue) + ((iHashCode12 + (scheduleStatus == null ? 0 : scheduleStatus.hashCode())) * 31)) * 31, 31);
        SwitchButtonEvent switchButtonEvent = this.switchButtonEventValue;
        int iHashCode13 = (iN2 + (switchButtonEvent == null ? 0 : switchButtonEvent.hashCode())) * 31;
        LightArchetype lightArchetype = this.lightArchetype;
        int iHashCode14 = (iHashCode13 + (lightArchetype == null ? 0 : lightArchetype.hashCode())) * 31;
        LightDirection lightDirection = this.lightDirection;
        int iHashCode15 = (iHashCode14 + (lightDirection == null ? 0 : lightDirection.hashCode())) * 31;
        LightFunction lightFunction = this.lightFunction;
        int iHashCode16 = (iHashCode15 + (lightFunction == null ? 0 : lightFunction.hashCode())) * 31;
        StartUpMode startUpMode = this.startUpMode;
        return iHashCode16 + (startUpMode != null ? startUpMode.hashCode() : 0);
    }

    public ClipResponse(String str) {
        this.resourceName = null;
        this.resourceName = NativeTools.StringToBytes(str);
    }
}

package com.philips.lighting.hue.sdk.wrapper.domain.resource.builder;

import com.philips.lighting.hue.sdk.wrapper.HueLog;
import com.philips.lighting.hue.sdk.wrapper.domain.DomainType;
import com.philips.lighting.hue.sdk.wrapper.domain.clip.ClipCondition;
import com.philips.lighting.hue.sdk.wrapper.domain.clip.ClipConditionOperator;
import com.philips.lighting.hue.sdk.wrapper.domain.device.Device;
import com.philips.lighting.hue.sdk.wrapper.domain.device.sensor.switches.SwitchButtonEvent;
import com.philips.lighting.hue.sdk.wrapper.domain.resource.BridgeResource;
import com.philips.lighting.hue.sdk.wrapper.domain.resource.timepattern.TimePattern;
import java.util.ArrayList;
import java.util.List;
import p012c.k;

/* JADX INFO: loaded from: classes.dex */
public class ClipConditionBuilder {
    private String address = null;
    private List<ClipCondition> conditions;

    public ClipConditionBuilder() {
        this.conditions = null;
        this.conditions = new ArrayList();
    }

    private void addClipCondition(String str, ClipConditionOperator clipConditionOperator, String str2) {
        if (this.address != null) {
            this.conditions.add(new ClipCondition(k.u(new StringBuilder(), this.address, str), clipConditionOperator, str2));
        } else {
            HueLog.e("ClipConditionBuilder", "Address is not set! Did you forget to use forDevice() or forResource()?");
        }
    }

    public List<ClipCondition> build() {
        return this.conditions;
    }

    public ClipCondition buildSingle() {
        if (this.conditions.size() > 0) {
            return this.conditions.get(0);
        }
        return null;
    }

    public ClipConditionBuilder equalTo(String str, Integer num) {
        return (str == null || num == null) ? this : equalTo(str, num.intValue());
    }

    public ClipConditionBuilder forDevice(Device device) {
        if (device != null && device.getIdentifier() != null) {
            if (device.isOfType(DomainType.LIGHT_POINT)) {
                this.address = "/lights/" + device.getIdentifier() + "/";
                return this;
            }
            if (device.isOfType(DomainType.SENSOR)) {
                this.address = "/sensors/" + device.getIdentifier() + "/";
                return this;
            }
            if (device.isOfType(DomainType.BRIDGE)) {
                this.address = "/";
            }
        }
        return this;
    }

    public ClipConditionBuilder forResource(BridgeResource bridgeResource) {
        if (bridgeResource != null && bridgeResource.getIdentifier() != null) {
            if (bridgeResource.isOfType(DomainType.RULE)) {
                this.address = "/rules/" + bridgeResource.getIdentifier() + "/";
                return this;
            }
            if (bridgeResource.isOfType(DomainType.GROUP)) {
                this.address = "/groups/" + bridgeResource.getIdentifier() + "/";
            }
        }
        return this;
    }

    public ClipConditionBuilder greaterThan(String str, int i) {
        if (str != null) {
            addClipCondition(str, ClipConditionOperator.GT, k.r(i, ""));
        }
        return this;
    }

    public ClipConditionBuilder hasChanged(String str) {
        if (str != null) {
            addClipCondition(str, ClipConditionOperator.DX, null);
        }
        return this;
    }

    public ClipConditionBuilder hasChangedAtLeastOnceDuring(String str, TimePattern timePattern) {
        if (str != null && timePattern != null) {
            addClipCondition(str, ClipConditionOperator.NOT_STABLE, timePattern.toString());
        }
        return this;
    }

    public ClipConditionBuilder hasChangedLongerThan(String str, TimePattern timePattern) {
        if (str != null && timePattern != null) {
            addClipCondition(str, ClipConditionOperator.DDX, timePattern.toString());
        }
        return this;
    }

    public ClipConditionBuilder hasNotChangedFor(String str, TimePattern timePattern) {
        if (str != null && timePattern != null) {
            addClipCondition(str, ClipConditionOperator.STABLE, timePattern.toString());
        }
        return this;
    }

    public ClipConditionBuilder isIn(String str, TimePattern timePattern) {
        if (str != null && timePattern != null) {
            addClipCondition(str, ClipConditionOperator.IN, timePattern.toString());
        }
        return this;
    }

    public ClipConditionBuilder isNotIn(String str, TimePattern timePattern) {
        if (str != null && timePattern != null) {
            addClipCondition(str, ClipConditionOperator.NOT_IN, timePattern.toString());
        }
        return this;
    }

    public ClipConditionBuilder lessThan(String str, int i) {
        if (str != null) {
            addClipCondition(str, ClipConditionOperator.LT, k.r(i, ""));
        }
        return this;
    }

    public ClipConditionBuilder equalTo(String str, SwitchButtonEvent switchButtonEvent) {
        return (str == null || switchButtonEvent == null) ? this : equalTo(str, switchButtonEvent.getValue());
    }

    public ClipConditionBuilder equalTo(String str, int i) {
        if (str != null) {
            addClipCondition(str, ClipConditionOperator.EQ, k.r(i, ""));
        }
        return this;
    }

    public ClipConditionBuilder greaterThan(String str, Integer num) {
        return (str == null || num == null) ? this : greaterThan(str, num.intValue());
    }

    public ClipConditionBuilder lessThan(String str, Integer num) {
        return (str == null || num == null) ? this : lessThan(str, num.intValue());
    }

    public ClipConditionBuilder greaterThan(String str, SwitchButtonEvent switchButtonEvent) {
        return (str == null || switchButtonEvent == null) ? this : greaterThan(str, switchButtonEvent.getValue());
    }

    public ClipConditionBuilder lessThan(String str, SwitchButtonEvent switchButtonEvent) {
        return (str == null || switchButtonEvent == null) ? this : lessThan(str, switchButtonEvent.getValue());
    }

    public ClipConditionBuilder equalTo(String str, Boolean bool) {
        return (str == null || bool == null) ? this : equalTo(str, bool.booleanValue());
    }

    public ClipConditionBuilder equalTo(String str, boolean z5) {
        if (str != null) {
            addClipCondition(str, ClipConditionOperator.EQ, "" + z5);
        }
        return this;
    }
}

package com.philips.lighting.hue.sdk.wrapper.domain.resource;

import com.philips.lighting.hue.sdk.wrapper.SDKSerializable;
import com.philips.lighting.hue.sdk.wrapper.domain.DomainType;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class GroupState extends SDKSerializable {
    private Boolean all_on;
    private Boolean any_on;

    public GroupState() {
        this.any_on = null;
        this.all_on = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GroupState groupState = (GroupState) obj;
        return Objects.equals(this.any_on, groupState.any_on) && Objects.equals(this.all_on, groupState.all_on);
    }

    public DomainType getType() {
        return DomainType.GROUP_STATE;
    }

    public int hashCode() {
        Boolean bool = this.any_on;
        int iHashCode = ((bool == null ? 0 : bool.hashCode()) + 31) * 31;
        Boolean bool2 = this.all_on;
        return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    public Boolean isAllOn() {
        return this.all_on;
    }

    public Boolean isAnyOn() {
        return this.any_on;
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public GroupState m7clone() {
        return new GroupState(this.any_on, this.all_on);
    }

    public GroupState(Boolean bool, Boolean bool2) {
        this.any_on = bool;
        this.all_on = bool2;
    }
}

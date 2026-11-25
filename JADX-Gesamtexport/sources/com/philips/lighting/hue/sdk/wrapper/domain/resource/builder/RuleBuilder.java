package com.philips.lighting.hue.sdk.wrapper.domain.resource.builder;

import com.philips.lighting.hue.sdk.wrapper.domain.clip.ClipAction;
import com.philips.lighting.hue.sdk.wrapper.domain.clip.ClipCondition;
import com.philips.lighting.hue.sdk.wrapper.domain.resource.rule.Rule;
import com.philips.lighting.hue.sdk.wrapper.domain.resource.rule.RuleStatus;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class RuleBuilder {
    private Rule rule;

    public RuleBuilder() {
        this.rule = null;
        this.rule = new Rule();
    }

    public RuleBuilder andAction(ClipAction clipAction) {
        if (clipAction != null) {
            this.rule.addAction(clipAction);
        }
        return this;
    }

    public RuleBuilder andCondition(ClipCondition clipCondition) {
        if (clipCondition != null) {
            this.rule.addCondition(clipCondition);
        }
        return this;
    }

    public Rule build() {
        return this.rule;
    }

    public RuleBuilder ifCondition(ClipCondition clipCondition) {
        if (clipCondition != null) {
            this.rule.setConditions(null);
            this.rule.addCondition(clipCondition);
        }
        return this;
    }

    public RuleBuilder ifConditions(List<ClipCondition> list) {
        if (list != null) {
            this.rule.setConditions(list);
        }
        return this;
    }

    public RuleBuilder setName(String str) {
        if (str != null) {
            this.rule.setName(str);
        }
        return this;
    }

    public RuleBuilder setRecycle(boolean z5) {
        this.rule.setRecycle(z5);
        return this;
    }

    public RuleBuilder setStatus(RuleStatus ruleStatus) {
        if (ruleStatus != null) {
            this.rule.setStatus(ruleStatus);
        }
        return this;
    }

    public RuleBuilder thenAction(ClipAction clipAction) {
        if (clipAction != null) {
            this.rule.setActions(null);
            this.rule.addAction(clipAction);
        }
        return this;
    }

    public RuleBuilder thenActions(List<ClipAction> list) {
        if (list != null) {
            this.rule.setActions(list);
        }
        return this;
    }
}

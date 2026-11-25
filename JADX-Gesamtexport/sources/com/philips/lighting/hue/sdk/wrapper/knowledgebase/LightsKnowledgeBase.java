package com.philips.lighting.hue.sdk.wrapper.knowledgebase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class LightsKnowledgeBase implements KnowledgeBase {
    private List<Gamut> gamuts;
    private List<LightInfo> lights;

    private LightsKnowledgeBase(Gamut[] gamutArr, LightInfo[] lightInfoArr) {
        this.gamuts = new ArrayList();
        this.lights = new ArrayList();
        this.gamuts = new ArrayList(Arrays.asList(gamutArr));
        this.lights = new ArrayList(Arrays.asList(lightInfoArr));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LightsKnowledgeBase lightsKnowledgeBase = (LightsKnowledgeBase) obj;
        List<Gamut> list = this.gamuts;
        if (list == null) {
            if (lightsKnowledgeBase.gamuts != null) {
                return false;
            }
        } else if (!list.equals(lightsKnowledgeBase.gamuts)) {
            return false;
        }
        List<LightInfo> list2 = this.lights;
        if (list2 == null) {
            if (lightsKnowledgeBase.lights != null) {
                return false;
            }
        } else if (!list2.equals(lightsKnowledgeBase.lights)) {
            return false;
        }
        return true;
    }

    public List<Gamut> getGamuts() {
        return this.gamuts;
    }

    public List<LightInfo> getLights() {
        return this.lights;
    }

    public int hashCode() {
        List<Gamut> list = this.gamuts;
        int iHashCode = ((list == null ? 0 : list.hashCode()) + 31) * 31;
        List<LightInfo> list2 = this.lights;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }
}

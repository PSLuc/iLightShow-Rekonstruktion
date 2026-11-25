package com.philips.lighting.hue.sdk.wrapper.knowledgebase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ManufacturersKnowledgeBase implements KnowledgeBase {
    private List<Manufacturer> manufacturers;

    private ManufacturersKnowledgeBase(Manufacturer[] manufacturerArr) {
        this.manufacturers = new ArrayList();
        this.manufacturers = new ArrayList(Arrays.asList(manufacturerArr));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ManufacturersKnowledgeBase manufacturersKnowledgeBase = (ManufacturersKnowledgeBase) obj;
        List<Manufacturer> list = this.manufacturers;
        if (list == null) {
            if (manufacturersKnowledgeBase.manufacturers != null) {
                return false;
            }
        } else if (!list.equals(manufacturersKnowledgeBase.manufacturers)) {
            return false;
        }
        return true;
    }

    public Manufacturer getManufacturer(String str) {
        for (Manufacturer manufacturer : this.manufacturers) {
            if (manufacturer.getIdentifier().equals(str)) {
                return manufacturer;
            }
        }
        return null;
    }

    public List<Manufacturer> getManufacturers() {
        return this.manufacturers;
    }

    public int hashCode() {
        List<Manufacturer> list = this.manufacturers;
        return 31 + (list == null ? 0 : list.hashCode());
    }
}

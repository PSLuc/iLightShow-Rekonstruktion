package com.philips.lighting.hue.sdk.wrapper.knowledgebase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ImagesKnowledgeBase implements KnowledgeBase {
    private List<Image> images;

    private ImagesKnowledgeBase(Image[] imageArr) {
        this.images = new ArrayList();
        this.images = new ArrayList(Arrays.asList(imageArr));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImagesKnowledgeBase imagesKnowledgeBase = (ImagesKnowledgeBase) obj;
        List<Image> list = this.images;
        if (list == null) {
            if (imagesKnowledgeBase.images != null) {
                return false;
            }
        } else if (!list.equals(imagesKnowledgeBase.images)) {
            return false;
        }
        return true;
    }

    public Image getImage(String str) {
        for (Image image : this.images) {
            if (image.getIdentifier().equals(str)) {
                return image;
            }
        }
        return null;
    }

    public List<Image> getImages() {
        return this.images;
    }

    public int hashCode() {
        List<Image> list = this.images;
        return 31 + (list == null ? 0 : list.hashCode());
    }
}

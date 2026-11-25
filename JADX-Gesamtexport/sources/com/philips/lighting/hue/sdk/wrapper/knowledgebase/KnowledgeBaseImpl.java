package com.philips.lighting.hue.sdk.wrapper.knowledgebase;

/* JADX INFO: loaded from: classes.dex */
public class KnowledgeBaseImpl {
    public static KnowledgeBase getKnowledgeBase(KnowledgeBaseType knowledgeBaseType) {
        if (knowledgeBaseType == null) {
            return null;
        }
        return getKnowledgeBaseNative(knowledgeBaseType.getValue());
    }

    private static native KnowledgeBase getKnowledgeBaseNative(int i);

    public static native String getSchemaVersion();

    public static native String getVersion();
}

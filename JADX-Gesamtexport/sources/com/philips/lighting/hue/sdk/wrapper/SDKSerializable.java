package com.philips.lighting.hue.sdk.wrapper;

import com.github.fge.jackson.JsonLoader;
import com.philips.lighting.hue.sdk.wrapper.utilities.JsonMapperProvider;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.Nonnull;
import p087q2.r;

/* JADX INFO: loaded from: classes.dex */
public class SDKSerializable {
    @Nonnull
    private static String arrayToString(Object obj) {
        if (!obj.getClass().isArray()) {
            return "";
        }
        try {
            if (obj instanceof byte[]) {
                return new String((byte[]) obj);
            }
            if (obj instanceof char[]) {
                return new String((char[]) obj);
            }
            if (obj instanceof boolean[]) {
                return Arrays.toString((boolean[]) obj);
            }
            if (obj instanceof short[]) {
                return Arrays.toString((short[]) obj);
            }
            if (obj instanceof int[]) {
                return Arrays.toString((int[]) obj);
            }
            if (obj instanceof long[]) {
                return Arrays.toString((long[]) obj);
            }
            if (obj instanceof float[]) {
                return Arrays.toString((float[]) obj);
            }
            if (obj instanceof double[]) {
                return Arrays.toString((double[]) obj);
            }
            if (!obj.getClass().getComponentType().isArray()) {
                return Arrays.toString((Object[]) obj);
            }
            Object[] objArr = (Object[]) obj;
            String[] strArr = new String[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                strArr[i] = arrayToString(objArr[i]);
            }
            return Arrays.toString(strArr);
        } catch (Exception e6) {
            return e6.getLocalizedMessage();
        }
    }

    private static void filterSystemFields(List<Field> list) {
        LinkedList linkedList = new LinkedList();
        for (Field field : list) {
            if (field.getName().contains("shadow$") || field.getName().startsWith("$")) {
                linkedList.add(field);
            }
        }
        list.removeAll(linkedList);
    }

    private static List<Field> getAllFields(Class<?> cls) {
        LinkedList linkedList = new LinkedList();
        linkedList.addAll(Arrays.asList(cls.getDeclaredFields()));
        if (cls.getSuperclass() != null) {
            linkedList.addAll(getAllFields(cls.getSuperclass()));
        }
        return linkedList;
    }

    @Nonnull
    public static Boolean isSerializationEnabled() {
        return Boolean.valueOf(SDKSerializableSettings.serializationEnabled);
    }

    private static void serializeFieldToJsonNode(ObjectNodeHolder objectNodeHolder, String str, Object obj) {
        try {
            if (!obj.getClass().isArray()) {
                objectNodeHolder.node.t(str, JsonLoader.fromString(obj.toString()));
            } else {
                objectNodeHolder.node.t(str, JsonLoader.fromString(arrayToString(obj)));
            }
        } catch (IOException unused) {
            objectNodeHolder.node.q(str, obj.toString());
        }
    }

    public static void setSerializationEnabled(@Nonnull Boolean bool) {
        SDKSerializableSettings.serializationEnabled = bool.booleanValue();
    }

    @Nonnull
    public String toString() {
        if (!SDKSerializableSettings.serializationEnabled) {
            return super.toString();
        }
        List<Field> allFields = getAllFields(getClass());
        filterSystemFields(allFields);
        r rVarK = JsonMapperProvider.getJsonMapper().k();
        try {
            for (Field field : allFields) {
                boolean zIsAccessible = field.isAccessible();
                field.setAccessible(true);
                Object obj = field.get(this);
                if (obj != null) {
                    serializeFieldToJsonNode(new ObjectNodeHolder(rVarK), field.getName(), obj);
                } else {
                    rVarK.s(field.getName());
                }
                field.setAccessible(zIsAccessible);
            }
            try {
                return JsonMapperProvider.getJsonMapper().n().d(rVarK);
            } catch (Exception e6) {
                return e6.getLocalizedMessage();
            }
        } catch (Exception e7) {
            return e7.toString();
        }
    }
}

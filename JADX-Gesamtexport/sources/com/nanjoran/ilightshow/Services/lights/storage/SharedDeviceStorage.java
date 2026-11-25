package com.nanjoran.ilightshow.Services.lights.storage;

import D3.h;
import E4.k;
import S1.V;
import android.content.Context;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p084p4.j;
import p105t3.m;
import p105t3.n;
import p132y3.a;

/* JADX INFO: loaded from: classes.dex */
public final class SharedDeviceStorage {
    public static final String PREFS_KEY = "device_storage_v1";
    public static final String SCHEMA_NAME = "app.ilightshow.devices";
    public static final SharedDeviceStorage INSTANCE = new SharedDeviceStorage();
    private static final m gson = new n().a();
    public static final int $stable = 8;

    private SharedDeviceStorage() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void save$default(SharedDeviceStorage sharedDeviceStorage, Context context, List list, Map map, int i, Object obj) {
        if ((i & 2) != 0) {
            list = null;
        }
        if ((i & 4) != 0) {
            map = null;
        }
        sharedDeviceStorage.save(context, list, map);
    }

    private final void saveDocument(Context context, SharedDeviceStorageDocument sharedDeviceStorageDocument) {
        context.getSharedPreferences("prefFile", 0).edit().putString(PREFS_KEY, gson.j(sharedDeviceStorageDocument)).apply();
    }

    public final boolean applyCloudJson(Context context, String str, String str2) {
        Object objV;
        k.f("context", context);
        k.f("rawJson", str);
        try {
            objV = (SharedDeviceStorageDocument) gson.d(str, SharedDeviceStorageDocument.class);
        } catch (Throwable th) {
            objV = V.v(th);
        }
        if (objV instanceof j) {
            objV = null;
        }
        SharedDeviceStorageDocument sharedDeviceStorageDocument = (SharedDeviceStorageDocument) objV;
        if (sharedDeviceStorageDocument == null || !k.a(sharedDeviceStorageDocument.getSchema(), SCHEMA_NAME) || sharedDeviceStorageDocument.getSchemaVersion() != 1) {
            return false;
        }
        saveDocument(context, SharedDeviceStorageDocument.copy$default(sharedDeviceStorageDocument, null, 0, str2, null, null, null, 59, null));
        return true;
    }

    public final String cloudSafeJson(Context context) {
        SharedDeviceStorageDocument sharedDeviceStorageDocumentSyncSafeCopy;
        SharedDeviceStorageDocument sharedDeviceStorageDocumentCopy$default;
        k.f("context", context);
        SharedDeviceStorageDocument sharedDeviceStorageDocumentLoad = load(context);
        if (sharedDeviceStorageDocumentLoad == null || (sharedDeviceStorageDocumentSyncSafeCopy = sharedDeviceStorageDocumentLoad.syncSafeCopy()) == null || (sharedDeviceStorageDocumentCopy$default = SharedDeviceStorageDocument.copy$default(sharedDeviceStorageDocumentSyncSafeCopy, null, 0, null, null, null, null, 59, null)) == null) {
            return null;
        }
        return gson.j(sharedDeviceStorageDocumentCopy$default);
    }

    public final String cloudStorageRevision(Context context) {
        k.f("context", context);
        SharedDeviceStorageDocument sharedDeviceStorageDocumentLoad = load(context);
        if (sharedDeviceStorageDocumentLoad != null) {
            return sharedDeviceStorageDocumentLoad.getLocalStoreRevision();
        }
        return null;
    }

    public final boolean hasPortableConfiguration(Context context) {
        k.f("context", context);
        SharedDeviceStorageDocument sharedDeviceStorageDocumentLoad = load(context);
        if (sharedDeviceStorageDocumentLoad != null) {
            return (sharedDeviceStorageDocumentLoad.getDevices().isEmpty() && sharedDeviceStorageDocumentLoad.getLightOptions().isEmpty()) ? false : true;
        }
        return false;
    }

    public final SharedDeviceStorageDocument load(Context context) {
        Object objV;
        k.f("context", context);
        String string = context.getSharedPreferences("prefFile", 0).getString(PREFS_KEY, null);
        if (string != null) {
            try {
                objV = (SharedDeviceStorageDocument) gson.d(string, SharedDeviceStorageDocument.class);
            } catch (Throwable th) {
                objV = V.v(th);
            }
            if (objV instanceof j) {
                objV = null;
            }
            SharedDeviceStorageDocument sharedDeviceStorageDocument = (SharedDeviceStorageDocument) objV;
            if (sharedDeviceStorageDocument != null && k.a(sharedDeviceStorageDocument.getSchema(), SCHEMA_NAME) && sharedDeviceStorageDocument.getSchemaVersion() == 1) {
                return sharedDeviceStorageDocument;
            }
            return null;
        }
        return null;
    }

    public final HashMap<String, h> parseLightOptions(String str) {
        k.f("json", str);
        Type type = new a<HashMap<String, h>>() { // from class: com.nanjoran.ilightshow.Services.lights.storage.SharedDeviceStorage$parseLightOptions$type$1
        }.getType();
        m mVar = gson;
        mVar.getClass();
        Object objC = mVar.c(new StringReader(str), a.get(type));
        k.e("fromJson(...)", objC);
        return (HashMap) objC;
    }

    public final void save(Context context, List<? extends K3.a> list, Map<String, h> map) {
        List<SharedPersistedDevice> devices;
        List<SharedPersistedLightOptions> lightOptions;
        k.f("context", context);
        SharedDeviceStorageDocument sharedDeviceStorageDocumentLoad = load(context);
        SharedDeviceStorageDocument sharedDeviceStorageDocument = sharedDeviceStorageDocumentLoad == null ? new SharedDeviceStorageDocument(null, 0, null, null, null, null, 63, null) : sharedDeviceStorageDocumentLoad;
        if (list != null) {
            devices = new ArrayList<>();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                SharedPersistedDevice sharedPersistedDeviceFromDevice = SharedPersistedDevice.Companion.fromDevice((K3.a) it.next());
                if (sharedPersistedDeviceFromDevice != null) {
                    devices.add(sharedPersistedDeviceFromDevice);
                }
            }
        } else {
            devices = sharedDeviceStorageDocument.getDevices();
        }
        List<SharedPersistedDevice> list2 = devices;
        if (map != null) {
            lightOptions = new ArrayList<>();
            for (Map.Entry<String, h> entry : map.entrySet()) {
                SharedPersistedLightOptions sharedPersistedLightOptionsFromLightOptions = SharedPersistedLightOptions.Companion.fromLightOptions(entry.getKey(), entry.getValue());
                if (sharedPersistedLightOptionsFromLightOptions != null) {
                    lightOptions.add(sharedPersistedLightOptionsFromLightOptions);
                }
            }
        } else {
            lightOptions = sharedDeviceStorageDocument.getLightOptions();
        }
        context.getSharedPreferences("prefFile", 0).edit().putString(PREFS_KEY, gson.j(SharedDeviceStorageDocument.copy$default(sharedDeviceStorageDocument, null, 0, null, Instant.now().toString(), list2, lightOptions, 7, null))).apply();
    }

    public final void updateCloudStorageRevision(Context context, String str) {
        k.f("context", context);
        SharedDeviceStorageDocument sharedDeviceStorageDocumentLoad = load(context);
        if (sharedDeviceStorageDocumentLoad == null) {
            return;
        }
        saveDocument(context, SharedDeviceStorageDocument.copy$default(sharedDeviceStorageDocumentLoad, null, 0, str, null, null, null, 59, null));
    }
}

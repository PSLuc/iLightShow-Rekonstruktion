package com.fasterxml.jackson.databind.exc;

import T1.f;
import T1.i;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class PropertyBindingException extends MismatchedInputException {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Collection f7689l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public transient String f7690m;

    public PropertyBindingException(i iVar, String str, f fVar, Collection collection) {
        super(str, fVar, null);
        this.f7532j = iVar;
        this.f7689l = collection;
    }

    @Override // com.fasterxml.jackson.core.JsonProcessingException
    public final String d() {
        Collection collection;
        String str = this.f7690m;
        if (str != null || (collection = this.f7689l) == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder(100);
        int size = collection.size();
        if (size == 1) {
            sb.append(" (one known property: \"");
            sb.append(String.valueOf(collection.iterator().next()));
            sb.append('\"');
        } else {
            sb.append(" (");
            sb.append(size);
            sb.append(" known properties: ");
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                sb.append('\"');
                sb.append(String.valueOf(it.next()));
                sb.append('\"');
                if (sb.length() > 1000) {
                    sb.append(" [truncated]");
                    break;
                }
                if (it.hasNext()) {
                    sb.append(", ");
                }
            }
        }
        sb.append("])");
        String string = sb.toString();
        this.f7690m = string;
        return string;
    }
}

package p015c2;

import java.io.Serializable;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes.dex */
public final class k implements Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public transient Object f7286h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f7287j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f7288k;

    public k(String str, Object obj) {
        this.f7286h = obj;
        if (str == null) {
            throw new NullPointerException("Cannot pass null fieldName");
        }
        this.i = str;
    }

    public final String toString() {
        if (this.f7288k == null) {
            StringBuilder sb = new StringBuilder();
            Object obj = this.f7286h;
            if (obj != null) {
                Class<?> componentType = obj instanceof Class ? (Class) obj : obj.getClass();
                int i = 0;
                while (componentType.isArray()) {
                    componentType = componentType.getComponentType();
                    i++;
                }
                sb.append(componentType.getName());
                while (true) {
                    i--;
                    if (i < 0) {
                        break;
                    }
                    sb.append(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
                }
            } else {
                sb.append("UNKNOWN");
            }
            sb.append('[');
            String str = this.i;
            if (str != null) {
                sb.append('\"');
                sb.append(str);
                sb.append('\"');
            } else {
                int i3 = this.f7287j;
                if (i3 >= 0) {
                    sb.append(i3);
                } else {
                    sb.append('?');
                }
            }
            sb.append(']');
            this.f7288k = sb.toString();
        }
        return this.f7288k;
    }
}

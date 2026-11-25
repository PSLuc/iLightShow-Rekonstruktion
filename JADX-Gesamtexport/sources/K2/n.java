package K2;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.BufferedReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2121a;

    public n(long j4) {
        this.f2121a = j4;
    }

    public static n a(BufferedReader bufferedReader) throws IOException {
        JsonReader jsonReader = new JsonReader(bufferedReader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    if (jsonReader.peek() == JsonToken.STRING) {
                        n nVar = new n(Long.parseLong(jsonReader.nextString()));
                        jsonReader.close();
                        return nVar;
                    }
                    n nVar2 = new n(jsonReader.nextLong());
                    jsonReader.close();
                    return nVar2;
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } catch (Throwable th) {
            jsonReader.close();
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            if (this.f2121a == ((n) obj).f2121a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j4 = this.f2121a;
        return ((int) ((j4 >>> 32) ^ j4)) ^ 1000003;
    }

    public final String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f2121a + "}";
    }
}

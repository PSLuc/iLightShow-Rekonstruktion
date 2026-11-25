package I1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f1844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f1845d;

    public m(int i, int i3, long j4, long j6) {
        this.f1842a = i;
        this.f1843b = i3;
        this.f1844c = j4;
        this.f1845d = j6;
    }

    public static m a(File file) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            m mVar = new m(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return mVar;
        } catch (Throwable th) {
            try {
                dataInputStream.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public final void b(File file) throws IOException {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f1842a);
            dataOutputStream.writeInt(this.f1843b);
            dataOutputStream.writeLong(this.f1844c);
            dataOutputStream.writeLong(this.f1845d);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof m)) {
            m mVar = (m) obj;
            if (this.f1843b == mVar.f1843b && this.f1844c == mVar.f1844c && this.f1842a == mVar.f1842a && this.f1845d == mVar.f1845d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f1843b), Long.valueOf(this.f1844c), Integer.valueOf(this.f1842a), Long.valueOf(this.f1845d));
    }
}

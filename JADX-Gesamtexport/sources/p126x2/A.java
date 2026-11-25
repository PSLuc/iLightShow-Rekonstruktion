package p126x2;

import java.io.InputStream;
import java.io.Reader;

/* JADX INFO: loaded from: classes.dex */
public interface A extends h {
    Object deserialize(InputStream inputStream);

    Object deserialize(Reader reader);

    Object deserialize(String str);

    Object deserialize(byte[] bArr);
}

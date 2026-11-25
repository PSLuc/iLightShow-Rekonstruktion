package okhttp3.internal.cache2;

import E4.k;
import h5.C0732j;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes.dex */
public final class FileOperator {
    private final FileChannel fileChannel;

    public FileOperator(FileChannel fileChannel) {
        k.f("fileChannel", fileChannel);
        this.fileChannel = fileChannel;
    }

    public final void read(long j4, C0732j c0732j, long j6) throws IOException {
        k.f("sink", c0732j);
        if (j6 < 0) {
            throw new IndexOutOfBoundsException();
        }
        long j7 = j4;
        long j8 = j6;
        while (j8 > 0) {
            long jTransferTo = this.fileChannel.transferTo(j7, j8, c0732j);
            j7 += jTransferTo;
            j8 -= jTransferTo;
        }
    }

    public final void write(long j4, C0732j c0732j, long j6) throws IOException {
        k.f("source", c0732j);
        if (j6 < 0 || j6 > c0732j.i) {
            throw new IndexOutOfBoundsException();
        }
        long j7 = j4;
        long j8 = j6;
        while (j8 > 0) {
            long jTransferFrom = this.fileChannel.transferFrom(c0732j, j7, j8);
            j7 += jTransferFrom;
            j8 -= jTransferFrom;
        }
    }
}

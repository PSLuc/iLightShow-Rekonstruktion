package okhttp3.internal.cache;

import D4.c;
import E4.k;
import E4.l;
import java.io.IOException;
import okhttp3.internal.Util;
import p084p4.x;

/* JADX INFO: loaded from: classes.dex */
public final class DiskLruCache$newJournalWriter$faultHidingSink$1 extends l implements c {
    final /* synthetic */ DiskLruCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiskLruCache$newJournalWriter$faultHidingSink$1(DiskLruCache diskLruCache) {
        super(1);
        this.this$0 = diskLruCache;
    }

    @Override // D4.c
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((IOException) obj);
        return x.f10867a;
    }

    public final void invoke(IOException iOException) {
        k.f("it", iOException);
        DiskLruCache diskLruCache = this.this$0;
        if (!Util.assertionsEnabled || Thread.holdsLock(diskLruCache)) {
            this.this$0.hasJournalErrors = true;
            return;
        }
        throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + diskLruCache);
    }
}

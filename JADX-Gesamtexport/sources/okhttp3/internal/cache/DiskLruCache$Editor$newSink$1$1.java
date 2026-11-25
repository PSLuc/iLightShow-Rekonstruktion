package okhttp3.internal.cache;

import D4.c;
import E4.k;
import E4.l;
import java.io.IOException;
import p084p4.x;

/* JADX INFO: loaded from: classes.dex */
public final class DiskLruCache$Editor$newSink$1$1 extends l implements c {
    final /* synthetic */ DiskLruCache this$0;
    final /* synthetic */ DiskLruCache.Editor this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiskLruCache$Editor$newSink$1$1(DiskLruCache diskLruCache, DiskLruCache.Editor editor) {
        super(1);
        this.this$0 = diskLruCache;
        this.this$1 = editor;
    }

    @Override // D4.c
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((IOException) obj);
        return x.f10867a;
    }

    public final void invoke(IOException iOException) {
        k.f("it", iOException);
        DiskLruCache diskLruCache = this.this$0;
        DiskLruCache.Editor editor = this.this$1;
        synchronized (diskLruCache) {
            editor.detach$okhttp();
        }
    }
}

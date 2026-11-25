package p130y0;

import D4.a;
import E0.g;
import E0.h;
import E0.o;
import E0.r;
import E4.k;
import android.view.View;
import android.view.translation.ViewTranslationCallback;
import java.util.LinkedHashMap;
import p007b0.c;
import p080p.q;

/* JADX INFO: loaded from: classes.dex */
public final class D implements ViewTranslationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final D f14213a = new D();

    /* JADX WARN: Code duplicated, block: B:26:0x007b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x007d A[LOOP:0: B:5:0x001d->B:27:0x007d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0080 A[EDGE_INSN: B:30:0x0080->B:28:0x0080 BREAK  A[LOOP:0: B:5:0x001d->B:27:0x007d], SYNTHETIC] */
    public final boolean onClearTranslation(View view) {
        a aVar;
        k.d("null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView", view);
        c contentCaptureManager$ui_release = ((r) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.f7034n = 1;
        q qVarD = contentCaptureManager$ui_release.d();
        Object[] objArr = qVarD.f10762c;
        long[] jArr = qVarD.f10760a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j4 = jArr[i];
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i6 = 0; i6 < i3; i6++) {
                        if ((255 & j4) < 128) {
                            h hVar = ((B0) objArr[(i << 3) + i6]).f14210a.f947d;
                            r rVar = o.f992w;
                            LinkedHashMap linkedHashMap = hVar.f939h;
                            Object obj = linkedHashMap.get(rVar);
                            if (obj == null) {
                                obj = null;
                            }
                            if (obj != null) {
                                Object obj2 = linkedHashMap.get(g.f923k);
                                E0.a aVar2 = (E0.a) (obj2 != null ? obj2 : null);
                                if (aVar2 != null && (aVar = (a) aVar2.f903b) != null) {
                                }
                            }
                        }
                        j4 >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0083 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0085 A[LOOP:0: B:5:0x001d->B:28:0x0085, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0088 A[EDGE_INSN: B:31:0x0088->B:29:0x0088 BREAK  A[LOOP:0: B:5:0x001d->B:28:0x0085], SYNTHETIC] */
    public final boolean onHideTranslation(View view) {
        D4.c cVar;
        k.d("null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView", view);
        c contentCaptureManager$ui_release = ((r) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.f7034n = 1;
        q qVarD = contentCaptureManager$ui_release.d();
        Object[] objArr = qVarD.f10762c;
        long[] jArr = qVarD.f10760a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j4 = jArr[i];
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i6 = 0; i6 < i3; i6++) {
                        if ((255 & j4) < 128) {
                            h hVar = ((B0) objArr[(i << 3) + i6]).f14210a.f947d;
                            r rVar = o.f992w;
                            LinkedHashMap linkedHashMap = hVar.f939h;
                            Object obj = linkedHashMap.get(rVar);
                            if (obj == null) {
                                obj = null;
                            }
                            if (k.a(obj, Boolean.TRUE)) {
                                Object obj2 = linkedHashMap.get(g.f922j);
                                E0.a aVar = (E0.a) (obj2 != null ? obj2 : null);
                                if (aVar != null && (cVar = (D4.c) aVar.f903b) != null) {
                                }
                            }
                        }
                        j4 >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return true;
    }

    public final boolean onShowTranslation(View view) {
        D4.c cVar;
        k.d("null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView", view);
        c contentCaptureManager$ui_release = ((r) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.f7034n = 2;
        q qVarD = contentCaptureManager$ui_release.d();
        Object[] objArr = qVarD.f10762c;
        long[] jArr = qVarD.f10760a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j4 = jArr[i];
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i - length)) >>> 31);
                for (int i6 = 0; i6 < i3; i6++) {
                    if ((255 & j4) < 128) {
                        h hVar = ((B0) objArr[(i << 3) + i6]).f14210a.f947d;
                        r rVar = o.f992w;
                        LinkedHashMap linkedHashMap = hVar.f939h;
                        Object obj = linkedHashMap.get(rVar);
                        if (obj == null) {
                            obj = null;
                        }
                        if (k.a(obj, Boolean.FALSE)) {
                            Object obj2 = linkedHashMap.get(g.f922j);
                            E0.a aVar = (E0.a) (obj2 != null ? obj2 : null);
                            if (aVar != null && (cVar = (D4.c) aVar.f903b) != null) {
                            }
                        }
                    }
                    j4 >>= 8;
                }
                if (i3 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }
}

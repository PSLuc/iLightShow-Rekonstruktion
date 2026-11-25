package p085q;

import E4.k;
import android.text.Editable;
import android.text.Selection;
import com.spotify.sdk.android.auth.LoginActivity;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.ConcurrentHashMap;
import p096s.C0925s;
import p116v3.m;
import p119w1.t;
import p126x2.h;
import p126x2.z;

/* JADX INFO: loaded from: classes.dex */
public final class b implements m, h {
    public static b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static volatile b f11188j;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f11189h;

    public /* synthetic */ b(int i3) {
        this.f11189h = i3;
    }

    public static final float[] a() {
        float[] fArr = C0925s.f12096s;
        if (fArr != null) {
            return fArr;
        }
        float[] fArr2 = new float[91];
        C0925s.f12096s = fArr2;
        return fArr2;
    }

    public static boolean b(p131y1.b bVar, Editable editable, int i3, int i6, boolean z5) {
        int iMin;
        if (editable != null && i3 >= 0 && i6 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z5) {
                    int iMax = Math.max(i3, 0);
                    int length = editable.length();
                    if (selectionStart >= 0 && length >= selectionStart && iMax >= 0) {
                        loop0: while (true) {
                            boolean z6 = false;
                            while (true) {
                                if (iMax == 0) {
                                    break loop0;
                                }
                                selectionStart--;
                                if (selectionStart < 0) {
                                    if (!z6) {
                                        selectionStart = 0;
                                        break loop0;
                                    }
                                    break loop0;
                                }
                                char cCharAt = editable.charAt(selectionStart);
                                if (z6) {
                                    if (Character.isHighSurrogate(cCharAt)) {
                                        iMax--;
                                    }
                                } else if (!Character.isSurrogate(cCharAt)) {
                                    iMax--;
                                } else if (!Character.isHighSurrogate(cCharAt)) {
                                    z6 = true;
                                }
                                selectionStart = -1;
                                break loop0;
                            }
                        }
                    }
                    selectionStart = -1;
                    break loop0;
                    int iMax2 = Math.max(i6, 0);
                    iMin = editable.length();
                    if (selectionEnd >= 0 && iMin >= selectionEnd && iMax2 >= 0) {
                        loop2: while (true) {
                            boolean z7 = false;
                            while (true) {
                                if (iMax2 != 0) {
                                    if (selectionEnd >= iMin) {
                                        if (!z7) {
                                            break loop2;
                                        }
                                        break loop2;
                                    }
                                    char cCharAt2 = editable.charAt(selectionEnd);
                                    if (z7) {
                                        if (Character.isLowSurrogate(cCharAt2)) {
                                            iMax2--;
                                            selectionEnd++;
                                        }
                                    } else if (!Character.isSurrogate(cCharAt2)) {
                                        iMax2--;
                                        selectionEnd++;
                                    } else if (!Character.isLowSurrogate(cCharAt2)) {
                                        selectionEnd++;
                                        z7 = true;
                                    }
                                    iMin = -1;
                                    break loop2;
                                }
                                iMin = selectionEnd;
                                break loop2;
                            }
                        }
                    }
                    iMin = -1;
                    break loop2;
                    if (selectionStart != -1 && iMin != -1) {
                    }
                } else {
                    selectionStart = Math.max(selectionStart - i3, 0);
                    iMin = Math.min(selectionEnd + i6, editable.length());
                }
                t[] tVarArr = (t[]) editable.getSpans(selectionStart, iMin, t.class);
                if (tVarArr != null && tVarArr.length > 0) {
                    for (t tVar : tVarArr) {
                        int spanStart = editable.getSpanStart(tVar);
                        int spanEnd = editable.getSpanEnd(tVar);
                        selectionStart = Math.min(spanStart, selectionStart);
                        iMin = Math.max(spanEnd, iMin);
                    }
                    int iMax3 = Math.max(selectionStart, 0);
                    int iMin2 = Math.min(iMin, editable.length());
                    bVar.beginBatchEdit();
                    editable.delete(iMax3, iMin2);
                    bVar.endBatchEdit();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p126x2.h
    public Object deserialize(z zVar) {
        k.f(LoginActivity.RESPONSE_KEY, zVar);
        return zVar.f14139f.e();
    }

    @Override // p116v3.m
    public Object l() {
        switch (this.f11189h) {
            case 4:
                return new LinkedHashSet();
            case 5:
                return new ArrayList();
            case 6:
                return new ConcurrentHashMap();
            default:
                return new LinkedHashMap();
        }
    }
}

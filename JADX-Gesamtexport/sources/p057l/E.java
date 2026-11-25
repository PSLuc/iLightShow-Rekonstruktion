package p057l;

import android.content.Context;
import android.graphics.RectF;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9970a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f9971b = -1.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f9972c = -1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f9973d = -1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f9974e = new int[0];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f9975f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f9976g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Context f9977h;

    static {
        new RectF();
        new ConcurrentHashMap();
        new ConcurrentHashMap();
    }

    public E(TextView textView) {
        this.f9976g = textView;
        this.f9977h = textView.getContext();
        new C();
    }

    public static int[] a(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i : iArr) {
                if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i3 = 0; i3 < size; i3++) {
                    iArr2[i3] = ((Integer) arrayList.get(i3)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }
}

package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Parcelable;
import androidx.versionedparcelable.CustomVersionedParcelable;
import p014c1.b;
import p014c1.d;

/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f6750k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f6752b;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f6759j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6751a = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f6753c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Parcelable f6754d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6755e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f6756f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f6757g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f6758h = f6750k;
    public String i = null;

    public static IconCompat a(int i) {
        if (i == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat();
        iconCompat.f6753c = null;
        iconCompat.f6754d = null;
        iconCompat.f6756f = 0;
        iconCompat.f6757g = null;
        iconCompat.f6758h = f6750k;
        iconCompat.i = null;
        iconCompat.f6751a = 2;
        iconCompat.f6755e = i;
        iconCompat.f6752b = "";
        iconCompat.f6759j = "";
        return iconCompat;
    }

    public final int b() {
        int i = this.f6751a;
        if (i == -1) {
            return d.a(this.f6752b);
        }
        if (i == 2) {
            return this.f6755e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public final Uri c() {
        int i = this.f6751a;
        if (i == -1) {
            return b.a(this.f6752b);
        }
        if (i == 4 || i == 6) {
            return Uri.parse((String) this.f6752b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public final String toString() {
        String str;
        if (this.f6751a == -1) {
            return String.valueOf(this.f6752b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f6751a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f6751a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f6752b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f6752b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f6759j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(b())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f6755e);
                if (this.f6756f != 0) {
                    sb.append(" off=");
                    sb.append(this.f6756f);
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f6752b);
                break;
        }
        if (this.f6757g != null) {
            sb.append(" tint=");
            sb.append(this.f6757g);
        }
        if (this.f6758h != f6750k) {
            sb.append(" mode=");
            sb.append(this.f6758h);
        }
        sb.append(")");
        return sb.toString();
    }
}

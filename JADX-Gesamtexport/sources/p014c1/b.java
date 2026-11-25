package p014c1;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.spotify.protocol.types.MotionState;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static Uri a(Object obj) {
        return d.d(obj);
    }

    public static Drawable b(Icon icon, Context context) {
        return icon.loadDrawable(context);
    }

    public static Icon c(IconCompat iconCompat, Context context) {
        Icon iconCreateWithBitmap;
        String strB;
        InputStream inputStreamOpenInputStream;
        int i = iconCompat.f6751a;
        switch (i) {
            case MotionState.UNKNOWN /* -1 */:
                return (Icon) iconCompat.f6752b;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f6752b);
                break;
            case 2:
                if (i == -1) {
                    strB = d.b(iconCompat.f6752b);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("called getResPackage() on " + iconCompat);
                    }
                    String str = iconCompat.f6759j;
                    strB = (str == null || TextUtils.isEmpty(str)) ? ((String) iconCompat.f6752b).split(":", -1)[0] : iconCompat.f6759j;
                }
                iconCreateWithBitmap = Icon.createWithResource(strB, iconCompat.f6755e);
                break;
            case 3:
                iconCreateWithBitmap = Icon.createWithData((byte[]) iconCompat.f6752b, iconCompat.f6755e, iconCompat.f6756f);
                break;
            case 4:
                iconCreateWithBitmap = Icon.createWithContentUri((String) iconCompat.f6752b);
                break;
            case 5:
                iconCreateWithBitmap = c.b((Bitmap) iconCompat.f6752b);
                break;
            case 6:
                if (Build.VERSION.SDK_INT >= 30) {
                    iconCreateWithBitmap = e.a(iconCompat.c());
                } else {
                    if (context == null) {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.c());
                    }
                    Uri uriC = iconCompat.c();
                    String scheme = uriC.getScheme();
                    if ("content".equals(scheme) || "file".equals(scheme)) {
                        try {
                            inputStreamOpenInputStream = context.getContentResolver().openInputStream(uriC);
                        } catch (Exception unused) {
                            uriC.toString();
                            inputStreamOpenInputStream = null;
                        }
                    } else {
                        try {
                            inputStreamOpenInputStream = new FileInputStream(new File((String) iconCompat.f6752b));
                        } catch (FileNotFoundException unused2) {
                            uriC.toString();
                            inputStreamOpenInputStream = null;
                        }
                    }
                    if (inputStreamOpenInputStream == null) {
                        throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.c());
                    }
                    iconCreateWithBitmap = c.b(BitmapFactory.decodeStream(inputStreamOpenInputStream));
                }
                break;
        }
        ColorStateList colorStateList = iconCompat.f6757g;
        if (colorStateList != null) {
            iconCreateWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = iconCompat.f6758h;
        if (mode != IconCompat.f6750k) {
            iconCreateWithBitmap.setTintMode(mode);
        }
        return iconCreateWithBitmap;
    }
}

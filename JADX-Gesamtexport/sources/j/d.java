package j;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import java.io.IOException;
import okhttp3.internal.http2.Settings;
import org.xmlpull.v1.XmlPullParserException;
import p015c2.AbstractC0473d;
import p052k.j;
import p057l.H;

/* JADX INFO: loaded from: classes.dex */
public final class d extends MenuInflater {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Class[] f9651e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Class[] f9652f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f9653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f9654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f9655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f9656d;

    static {
        Class[] clsArr = {Context.class};
        f9651e = clsArr;
        f9652f = clsArr;
    }

    public d(Context context) {
        super(context);
        this.f9655c = context;
        Object[] objArr = {context};
        this.f9653a = objArr;
        this.f9654b = objArr;
    }

    public static Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [j.d] */
    /* JADX WARN: Type inference failed for: r3v15, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v57 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        ?? r6;
        int i;
        ?? r8;
        ColorStateList colorStateList;
        int resourceId;
        c cVar = new c(this, menu);
        int eventType = xmlResourceParser.getEventType();
        do {
            r6 = 1;
            i = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlResourceParser.next();
                break;
            }
            eventType = xmlResourceParser.next();
        } while (eventType != 1);
        boolean z5 = false;
        boolean z6 = false;
        String str = null;
        while (!z5) {
            if (eventType == r6) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType == i) {
                if (!z6) {
                    String name2 = xmlResourceParser.getName();
                    boolean zEquals = name2.equals("group");
                    d dVar = cVar.f9625D;
                    if (zEquals) {
                        ?? ObtainStyledAttributes = dVar.f9655c.obtainStyledAttributes(attributeSet, h.a.f9202l);
                        cVar.f9627b = ObtainStyledAttributes.getResourceId(r6, 0);
                        cVar.f9628c = ObtainStyledAttributes.getInt(3, 0);
                        cVar.f9629d = ObtainStyledAttributes.getInt(4, 0);
                        cVar.f9630e = ObtainStyledAttributes.getInt(5, 0);
                        cVar.f9631f = ObtainStyledAttributes.getBoolean(2, r6);
                        cVar.f9632g = ObtainStyledAttributes.getBoolean(0, r6);
                        ObtainStyledAttributes.recycle();
                    } else if (name2.equals("item")) {
                        Context context = dVar.f9655c;
                        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.a.f9203m);
                        cVar.i = typedArrayObtainStyledAttributes.getResourceId(2, 0);
                        cVar.f9634j = (typedArrayObtainStyledAttributes.getInt(5, cVar.f9628c) & (-65536)) | (typedArrayObtainStyledAttributes.getInt(6, cVar.f9629d) & Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                        cVar.f9635k = typedArrayObtainStyledAttributes.getText(7);
                        cVar.f9636l = typedArrayObtainStyledAttributes.getText(8);
                        cVar.f9637m = typedArrayObtainStyledAttributes.getResourceId(0, 0);
                        String string = typedArrayObtainStyledAttributes.getString(9);
                        cVar.f9638n = string == null ? (char) 0 : string.charAt(0);
                        cVar.f9639o = typedArrayObtainStyledAttributes.getInt(16, 4096);
                        String string2 = typedArrayObtainStyledAttributes.getString(10);
                        cVar.f9640p = string2 == null ? (char) 0 : string2.charAt(0);
                        cVar.f9641q = typedArrayObtainStyledAttributes.getInt(20, 4096);
                        if (typedArrayObtainStyledAttributes.hasValue(11)) {
                            cVar.f9642r = typedArrayObtainStyledAttributes.getBoolean(11, false) ? 1 : 0;
                        } else {
                            cVar.f9642r = cVar.f9630e;
                        }
                        cVar.f9643s = typedArrayObtainStyledAttributes.getBoolean(3, false);
                        cVar.f9644t = typedArrayObtainStyledAttributes.getBoolean(4, cVar.f9631f);
                        cVar.f9645u = typedArrayObtainStyledAttributes.getBoolean(1, cVar.f9632g);
                        cVar.f9646v = typedArrayObtainStyledAttributes.getInt(21, -1);
                        cVar.f9649y = typedArrayObtainStyledAttributes.getString(12);
                        cVar.f9647w = typedArrayObtainStyledAttributes.getResourceId(13, 0);
                        cVar.f9648x = typedArrayObtainStyledAttributes.getString(15);
                        String string3 = typedArrayObtainStyledAttributes.getString(14);
                        if (string3 != null && cVar.f9647w == 0 && cVar.f9648x == null && cVar.a(string3, f9652f, dVar.f9654b) != null) {
                            throw new ClassCastException();
                        }
                        cVar.f9650z = typedArrayObtainStyledAttributes.getText(17);
                        cVar.f9622A = typedArrayObtainStyledAttributes.getText(22);
                        if (typedArrayObtainStyledAttributes.hasValue(19)) {
                            cVar.f9624C = H.b(typedArrayObtainStyledAttributes.getInt(19, -1), cVar.f9624C);
                        } else {
                            cVar.f9624C = null;
                        }
                        if (typedArrayObtainStyledAttributes.hasValue(18)) {
                            if (!typedArrayObtainStyledAttributes.hasValue(18) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(18, 0)) == 0 || (colorStateList = AbstractC0473d.x(context, resourceId)) == null) {
                                colorStateList = typedArrayObtainStyledAttributes.getColorStateList(18);
                            }
                            cVar.f9623B = colorStateList;
                        } else {
                            cVar.f9623B = null;
                        }
                        typedArrayObtainStyledAttributes.recycle();
                        cVar.f9633h = false;
                        xmlResourceParser = xmlResourceParser;
                        r8 = 1;
                    } else if (name2.equals("menu")) {
                        r8 = 1;
                        cVar.f9633h = true;
                        SubMenu subMenuAddSubMenu = cVar.f9626a.addSubMenu(cVar.f9627b, cVar.i, cVar.f9634j, cVar.f9635k);
                        cVar.b(subMenuAddSubMenu.getItem());
                        xmlResourceParser = xmlResourceParser;
                        b(xmlResourceParser, attributeSet, subMenuAddSubMenu);
                    } else {
                        xmlResourceParser = xmlResourceParser;
                        r8 = 1;
                        str = name2;
                        z6 = true;
                    }
                }
                r8 = r6;
                z5 = z5;
            } else if (eventType != 3) {
                r8 = r6;
                z5 = z5;
            } else {
                String name3 = xmlResourceParser.getName();
                if (z6 && name3.equals(str)) {
                    xmlResourceParser = xmlResourceParser;
                    r8 = r6;
                    z6 = false;
                    str = null;
                } else {
                    if (name3.equals("group")) {
                        cVar.f9627b = 0;
                        cVar.f9628c = 0;
                        cVar.f9629d = 0;
                        cVar.f9630e = 0;
                        cVar.f9631f = r6;
                        cVar.f9632g = r6;
                    } else if (name3.equals("item")) {
                        if (!cVar.f9633h) {
                            cVar.f9633h = r6;
                            cVar.b(cVar.f9626a.add(cVar.f9627b, cVar.i, cVar.f9634j, cVar.f9635k));
                        }
                    } else if (name3.equals("menu")) {
                        ?? r9 = r6;
                        z5 = r9 == true ? 1 : 0;
                        r8 = r9;
                    }
                    r8 = r6;
                    z5 = z5;
                }
            }
            eventType = xmlResourceParser.next();
            r6 = r8;
            i = 2;
            z5 = z5;
            z6 = z6;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof j)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        try {
            try {
                try {
                    layout = this.f9655c.getResources().getLayout(i);
                    b(layout, Xml.asAttributeSet(layout), menu);
                    layout.close();
                } catch (XmlPullParserException e6) {
                    throw new InflateException("Error inflating menu XML", e6);
                }
            } catch (IOException e7) {
                throw new InflateException("Error inflating menu XML", e7);
            }
        } catch (Throwable th) {
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}

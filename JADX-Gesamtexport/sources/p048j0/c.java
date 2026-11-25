package p048j0;

import android.graphics.Matrix;
import android.graphics.RenderNode;
import p035g0.C0715p;
import p035g0.r;
import p044i0.b;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0715p f9677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f9678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RenderNode f9679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f9680d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Matrix f9681e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f9682f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f9683g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f9684h;
    public float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f9685j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f9686k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f9687l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f9688m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f9689n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f9690o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f9691p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f9692q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f9693r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f9694s;

    public c() {
        C0715p c0715p = new C0715p(0);
        b bVar = new b();
        this.f9677a = c0715p;
        this.f9678b = bVar;
        RenderNode renderNode = new RenderNode("graphicsLayer");
        this.f9679c = renderNode;
        this.f9680d = 0L;
        renderNode.setClipToBounds(false);
        b(renderNode, 0);
        this.f9683g = 1.0f;
        this.f9684h = 3;
        this.i = 1.0f;
        this.f9685j = 1.0f;
        long j4 = r.f9076b;
        this.f9687l = j4;
        this.f9688m = j4;
        this.f9690o = 8.0f;
        this.f9694s = 0;
    }

    public static void b(RenderNode renderNode, int i) {
        if (i == 1) {
            renderNode.setUseCompositingLayer(true, null);
            renderNode.setHasOverlappingRendering(true);
        } else if (i == 2) {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void a() {
        boolean z5 = this.f9691p;
        boolean z6 = false;
        boolean z7 = z5 && !this.f9682f;
        if (z5 && this.f9682f) {
            z6 = true;
        }
        boolean z8 = this.f9692q;
        RenderNode renderNode = this.f9679c;
        if (z7 != z8) {
            this.f9692q = z7;
            renderNode.setClipToBounds(z7);
        }
        if (z6 != this.f9693r) {
            this.f9693r = z6;
            renderNode.setClipToOutline(z6);
        }
    }

    public final void c(boolean z5) {
        this.f9691p = z5;
        a();
    }
}

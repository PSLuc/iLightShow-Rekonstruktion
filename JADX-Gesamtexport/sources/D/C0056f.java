package D;

import B.F0;
import P4.AbstractC0336x;
import S1.V;
import kotlin.KotlinNothingValueException;
import p130y0.N;

/* JADX INFO: renamed from: D.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0056f extends p122w4.i implements D4.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f682l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f683m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ F0 f684n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0057g f685o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ z f686p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0056f(F0 f6, C0057g c0057g, z zVar, p111u4.d dVar) {
        super(2, dVar);
        this.f684n = f6;
        this.f685o = c0057g;
        this.f686p = zVar;
    }

    @Override // p122w4.a
    public final p111u4.d b(Object obj, p111u4.d dVar) {
        C0056f c0056f = new C0056f(this.f684n, this.f685o, this.f686p, dVar);
        c0056f.f683m = obj;
        return c0056f;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        ((C0056f) b((N) obj, (p111u4.d) obj2)).o(p084p4.x.f10867a);
        return v4.a.f13292h;
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        v4.a aVar = v4.a.f13292h;
        int i = this.f682l;
        if (i == 0) {
            V.O(obj);
            C0055e c0055e = new C0055e((N) this.f683m, this.f684n, this.f685o, this.f686p, null);
            this.f682l = 1;
            if (AbstractC0336x.d(c0055e, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V.O(obj);
        }
        throw new KotlinNothingValueException();
    }
}

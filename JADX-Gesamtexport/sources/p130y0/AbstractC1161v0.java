package p130y0;

import D.C0056f;
import D.z;
import N.C0208d;
import N.W0;
import S1.V;
import V.e;
import kotlin.KotlinNothingValueException;
import p122w4.c;
import p124x0.AbstractC1098f;
import p124x0.f0;
import v4.a;

/* JADX INFO: renamed from: y0.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1161v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final W0 f14538a = new W0(I.f14226K);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final void a(z zVar, C0056f c0056f, c cVar) {
        C1157t0 c1157t0;
        if (cVar instanceof C1157t0) {
            c1157t0 = (C1157t0) cVar;
            int i = c1157t0.f14535l;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1157t0.f14535l = i - Integer.MIN_VALUE;
            } else {
                c1157t0 = new C1157t0(cVar);
            }
        } else {
            c1157t0 = new C1157t0(cVar);
        }
        Object obj = c1157t0.f14534k;
        a aVar = a.f13292h;
        int i3 = c1157t0.f14535l;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V.O(obj);
            throw new KotlinNothingValueException();
        }
        V.O(obj);
        if (!zVar.f5958h.f5969t) {
            throw new IllegalArgumentException("establishTextInputSession called from an unattached node");
        }
        f0 f0VarT = AbstractC1098f.t(zVar);
        e eVar = (e) AbstractC1098f.s(zVar).f13826A;
        eVar.getClass();
        if (C0208d.L(eVar, f14538a) != null) {
            throw new ClassCastException();
        }
        c1157t0.f14535l = 1;
        b(f0VarT, c0056f, c1157t0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final void b(f0 f0Var, C0056f c0056f, c cVar) {
        C1159u0 c1159u0;
        if (cVar instanceof C1159u0) {
            c1159u0 = (C1159u0) cVar;
            int i = c1159u0.f14537l;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1159u0.f14537l = i - Integer.MIN_VALUE;
            } else {
                c1159u0 = new C1159u0(cVar);
            }
        } else {
            c1159u0 = new C1159u0(cVar);
        }
        Object obj = c1159u0.f14536k;
        a aVar = a.f13292h;
        int i3 = c1159u0.f14537l;
        if (i3 == 0) {
            V.O(obj);
            c1159u0.f14537l = 1;
            ((r) f0Var).E(c0056f, c1159u0);
        } else {
            if (i3 == 1) {
                V.O(obj);
                throw new KotlinNothingValueException();
            }
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V.O(obj);
            throw new KotlinNothingValueException();
        }
    }
}

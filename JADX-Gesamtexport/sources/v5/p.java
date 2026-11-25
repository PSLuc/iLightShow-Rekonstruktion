package v5;

import B.C0025m0;
import java.util.ArrayList;
import p005a4.C0409q;
import p084p4.x;
import w5.C1051i;
import w5.C1052j;
import w5.C1057o;
import w5.C1059q;
import w5.C1060s;
import w5.C1061t;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements D4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f13362h;
    public final /* synthetic */ q i;

    public /* synthetic */ p(q qVar, int i) {
        this.f13362h = i;
        this.i = qVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // D4.c
    public final Object invoke(Object obj) {
        switch (this.f13362h) {
            case 0:
                C0409q c0409q = (C0409q) obj;
                q qVar = this.i;
                E4.k.f("this$0", qVar);
                Object obj2 = c0409q.i;
                E4.k.c(obj2);
                long jLongValue = ((Number) obj2).longValue();
                qVar.f13363a.getClass();
                L3.c cVar = qVar.f13365c;
                E4.k.f("changeDispatcher", cVar);
                k kVar = new k(jLongValue, qVar, cVar);
                ArrayList arrayList = cVar.f3091b;
                int i = 0;
                if (arrayList == null || !arrayList.isEmpty()) {
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj3 = arrayList.get(i3);
                        i3++;
                        if (kVar.equals(((D3.c) obj3).f766l) && (i = i + 1) < 0) {
                            throw new ArithmeticException("Count overflow has happened.");
                        }
                    }
                }
                if (i == 0) {
                    D3.c cVar2 = new D3.c();
                    cVar2.f766l = kVar;
                    cVar2.f799a = String.valueOf(kVar.f13331k);
                    arrayList.add(cVar2);
                }
                S3.a aVar = new S3.a(0);
                p039g4.a aVar2 = new p039g4.a(new J2.b(11, new i(kVar, 0)));
                c0409q.e(aVar2);
                aVar.b(aVar2);
                p017c4.h hVar = kVar.f13332l.f13369g;
                J2.b bVar = new J2.b(12, new i(kVar, 1));
                hVar.getClass();
                Y3.b bVar2 = new Y3.b(bVar);
                hVar.e(bVar2);
                aVar.b(bVar2);
                D4.a aVar3 = null;
                x5.b.c(new p011b4.e(new p022d4.b(new c(kVar, new C1052j(), aVar3, 1)), 1, new a(e.f13309j)));
                x5.b.c(new p011b4.e(new p022d4.b(new c(kVar, new C1061t(), aVar3, 1)), 1, new a(e.f13312m)));
                x5.b.c(new p011b4.e(new p022d4.b(new c(kVar, new C1060s(), aVar3, 1)), 1, new a(e.f13311l)));
                x5.b.c(new p011b4.e(new p022d4.b(new c(kVar, new C1051i(), aVar3, 1)), 1, new a(e.i)));
                x5.b.c(new p011b4.e(new p022d4.b(new c(kVar, new C1057o(), aVar3, 1)), 1, new a(e.f13310k)));
                kVar.K();
                qVar.i.b(aVar);
                return x.f10867a;
            default:
                q qVar2 = this.i;
                E4.k.f("this$0", qVar2);
                x5.b.b(new C0025m0(18, new R2.j(qVar2, 4, new C1059q())));
                return x.f10867a;
        }
    }
}

package p087q2;

import B.h1;
import T1.e;
import com.fasterxml.jackson.databind.JsonNode;
import java.util.Iterator;
import java.util.Map;
import p015c2.E;
import p015c2.l;

/* JADX INFO: loaded from: classes.dex */
public final class k extends l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f11220h;
    public E i;

    public k(b bVar) {
        this.f11220h = bVar;
    }

    @Override // p015c2.m
    public final void c(e eVar, E e6) {
        this.i = e6;
        b bVar = this.f11220h;
        if (bVar instanceof r) {
            ((r) bVar).i.size();
            eVar.q0(this);
            g(eVar, new h1(), bVar.l());
        } else {
            if (!(bVar instanceof a)) {
                bVar.c(eVar, e6);
                return;
            }
            bVar.size();
            eVar.n0(this);
            g(eVar, new h1(), bVar.k());
        }
    }

    public final void g(e eVar, h1 h1Var, Iterator it) {
        JsonNode jsonNode;
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                if (next instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) next;
                    eVar.T((String) entry.getKey());
                    jsonNode = (JsonNode) entry.getValue();
                } else {
                    jsonNode = (JsonNode) next;
                }
                if (jsonNode instanceof r) {
                    h1Var.c(it);
                    it = jsonNode.l();
                    ((r) jsonNode).i.size();
                    eVar.q0(jsonNode);
                } else if (jsonNode instanceof a) {
                    h1Var.c(it);
                    a aVar = (a) jsonNode;
                    Iterator it2 = aVar.i.iterator();
                    aVar.i.size();
                    eVar.n0(jsonNode);
                    it = it2;
                } else {
                    jsonNode.c(eVar, this.i);
                }
            } else {
                if (eVar.s().d()) {
                    eVar.L();
                } else {
                    eVar.M();
                }
                int i = h1Var.f327h;
                if (i == 0) {
                    it = null;
                } else {
                    Iterator[] itArr = (Iterator[]) h1Var.f328j;
                    int i3 = i - 1;
                    h1Var.f327h = i3;
                    it = itArr[i3];
                }
                if (it == null) {
                    return;
                }
            }
        }
    }
}

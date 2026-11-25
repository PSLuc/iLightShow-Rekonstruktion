package kotlinx.serialization.json;

import E4.j;
import E4.k;
import F4.a;
import Y4.d;
import d5.f;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import p089q4.l;

/* JADX INFO: loaded from: classes.dex */
@d(with = f.class)
public final class JsonArray extends JsonElement implements List<JsonElement>, a {
    public static final d5.d Companion = new d5.d();
    private final List<JsonElement> content;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public JsonArray(List<? extends JsonElement> list) {
        super(null);
        k.f("content", list);
        this.content = list;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i, JsonElement jsonElement) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends JsonElement> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(JsonElement jsonElement) {
        k.f("element", jsonElement);
        return this.content.contains(jsonElement);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        k.f("elements", collection);
        return this.content.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        return k.a(this.content, obj);
    }

    @Override // java.util.List
    public JsonElement get(int i) {
        return this.content.get(i);
    }

    public int getSize() {
        return this.content.size();
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.content.hashCode();
    }

    public int indexOf(JsonElement jsonElement) {
        k.f("element", jsonElement);
        return this.content.indexOf(jsonElement);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.content.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<JsonElement> iterator() {
        return this.content.iterator();
    }

    public int lastIndexOf(JsonElement jsonElement) {
        k.f("element", jsonElement);
        return this.content.lastIndexOf(jsonElement);
    }

    @Override // java.util.List
    public ListIterator<JsonElement> listIterator() {
        return this.content.listIterator();
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ JsonElement remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<JsonElement> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ JsonElement set(int i, JsonElement jsonElement) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.List
    public void sort(Comparator<? super JsonElement> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List<JsonElement> subList(int i, int i3) {
        return this.content.subList(i, i3);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return j.a(this);
    }

    public String toString() {
        return l.e0(this.content, ",", "[", "]", null, 56);
    }

    /* JADX INFO: renamed from: add, reason: avoid collision after fix types in other method */
    public void add2(int i, JsonElement jsonElement) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends JsonElement> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof JsonElement) {
            return contains((JsonElement) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof JsonElement) {
            return indexOf((JsonElement) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof JsonElement) {
            return lastIndexOf((JsonElement) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<JsonElement> listIterator(int i) {
        return this.content.listIterator(i);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: remove, reason: avoid collision after fix types in other method */
    public JsonElement remove2(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: set, reason: avoid collision after fix types in other method */
    public JsonElement set2(int i, JsonElement jsonElement) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        k.f("array", tArr);
        return (T[]) j.b(this, tArr);
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean add(JsonElement jsonElement) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

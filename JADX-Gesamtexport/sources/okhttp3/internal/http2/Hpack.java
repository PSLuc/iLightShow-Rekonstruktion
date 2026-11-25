package okhttp3.internal.http2;

import E4.g;
import E4.k;
import h5.AbstractC0724b;
import h5.C0732j;
import h5.C0735m;
import h5.InterfaceC0734l;
import h5.M;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.internal.Util;
import p089q4.l;

/* JADX INFO: loaded from: classes.dex */
public final class Hpack {
    public static final Hpack INSTANCE;
    private static final Map<C0735m, Integer> NAME_TO_FIRST_INDEX;
    private static final int PREFIX_4_BITS = 15;
    private static final int PREFIX_5_BITS = 31;
    private static final int PREFIX_6_BITS = 63;
    private static final int PREFIX_7_BITS = 127;
    private static final int SETTINGS_HEADER_TABLE_SIZE = 4096;
    private static final int SETTINGS_HEADER_TABLE_SIZE_LIMIT = 16384;
    private static final Header[] STATIC_HEADER_TABLE;

    public static final class Reader {
        public Header[] dynamicTable;
        public int dynamicTableByteCount;
        public int headerCount;
        private final List<Header> headerList;
        private final int headerTableSizeSetting;
        private int maxDynamicTableByteCount;
        private int nextHeaderIndex;
        private final InterfaceC0734l source;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Reader(M m6, int i) {
            this(m6, i, 0, 4, null);
            k.f("source", m6);
        }

        private final void adjustDynamicTableByteCount() {
            int i = this.maxDynamicTableByteCount;
            int i3 = this.dynamicTableByteCount;
            if (i < i3) {
                if (i == 0) {
                    clearDynamicTable();
                } else {
                    evictToRecoverBytes(i3 - i);
                }
            }
        }

        private final void clearDynamicTable() {
            Header[] headerArr = this.dynamicTable;
            p089q4.k.j0(0, headerArr.length, headerArr);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private final int dynamicTableIndex(int i) {
            return this.nextHeaderIndex + 1 + i;
        }

        private final int evictToRecoverBytes(int i) {
            int i3;
            int i6 = 0;
            if (i > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    i3 = this.nextHeaderIndex;
                    if (length < i3 || i <= 0) {
                        break;
                    }
                    Header header = this.dynamicTable[length];
                    k.c(header);
                    int i7 = header.hpackSize;
                    i -= i7;
                    this.dynamicTableByteCount -= i7;
                    this.headerCount--;
                    i6++;
                }
                Header[] headerArr = this.dynamicTable;
                System.arraycopy(headerArr, i3 + 1, headerArr, i3 + 1 + i6, this.headerCount);
                this.nextHeaderIndex += i6;
            }
            return i6;
        }

        private final C0735m getName(int i) throws IOException {
            if (isStaticHeader(i)) {
                return Hpack.INSTANCE.getSTATIC_HEADER_TABLE()[i].name;
            }
            int iDynamicTableIndex = dynamicTableIndex(i - Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length);
            if (iDynamicTableIndex >= 0) {
                Header[] headerArr = this.dynamicTable;
                if (iDynamicTableIndex < headerArr.length) {
                    Header header = headerArr[iDynamicTableIndex];
                    k.c(header);
                    return header.name;
                }
            }
            throw new IOException(k.l("Header index too large ", Integer.valueOf(i + 1)));
        }

        private final void insertIntoDynamicTable(int i, Header header) {
            this.headerList.add(header);
            int i3 = header.hpackSize;
            if (i != -1) {
                Header header2 = this.dynamicTable[dynamicTableIndex(i)];
                k.c(header2);
                i3 -= header2.hpackSize;
            }
            int i6 = this.maxDynamicTableByteCount;
            if (i3 > i6) {
                clearDynamicTable();
                return;
            }
            int iEvictToRecoverBytes = evictToRecoverBytes((this.dynamicTableByteCount + i3) - i6);
            if (i == -1) {
                int i7 = this.headerCount + 1;
                Header[] headerArr = this.dynamicTable;
                if (i7 > headerArr.length) {
                    Header[] headerArr2 = new Header[headerArr.length * 2];
                    System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                    this.nextHeaderIndex = this.dynamicTable.length - 1;
                    this.dynamicTable = headerArr2;
                }
                int i8 = this.nextHeaderIndex;
                this.nextHeaderIndex = i8 - 1;
                this.dynamicTable[i8] = header;
                this.headerCount++;
            } else {
                this.dynamicTable[dynamicTableIndex(i) + iEvictToRecoverBytes + i] = header;
            }
            this.dynamicTableByteCount += i3;
        }

        private final boolean isStaticHeader(int i) {
            return i >= 0 && i <= Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length - 1;
        }

        private final int readByte() {
            return Util.and(this.source.W(), 255);
        }

        private final void readIndexedHeader(int i) throws IOException {
            if (isStaticHeader(i)) {
                this.headerList.add(Hpack.INSTANCE.getSTATIC_HEADER_TABLE()[i]);
                return;
            }
            int iDynamicTableIndex = dynamicTableIndex(i - Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length);
            if (iDynamicTableIndex >= 0) {
                Header[] headerArr = this.dynamicTable;
                if (iDynamicTableIndex < headerArr.length) {
                    List<Header> list = this.headerList;
                    Header header = headerArr[iDynamicTableIndex];
                    k.c(header);
                    list.add(header);
                    return;
                }
            }
            throw new IOException(k.l("Header index too large ", Integer.valueOf(i + 1)));
        }

        private final void readLiteralHeaderWithIncrementalIndexingIndexedName(int i) {
            insertIntoDynamicTable(-1, new Header(getName(i), readByteString()));
        }

        private final void readLiteralHeaderWithIncrementalIndexingNewName() {
            insertIntoDynamicTable(-1, new Header(Hpack.INSTANCE.checkLowercase(readByteString()), readByteString()));
        }

        private final void readLiteralHeaderWithoutIndexingIndexedName(int i) throws IOException {
            this.headerList.add(new Header(getName(i), readByteString()));
        }

        private final void readLiteralHeaderWithoutIndexingNewName() throws IOException {
            this.headerList.add(new Header(Hpack.INSTANCE.checkLowercase(readByteString()), readByteString()));
        }

        public final List<Header> getAndResetHeaderList() {
            List<Header> listS0 = l.s0(this.headerList);
            this.headerList.clear();
            return listS0;
        }

        public final int maxDynamicTableByteCount() {
            return this.maxDynamicTableByteCount;
        }

        public final C0735m readByteString() {
            int i = readByte();
            boolean z5 = (i & 128) == 128;
            long j4 = readInt(i, 127);
            if (!z5) {
                return this.source.j(j4);
            }
            C0732j c0732j = new C0732j();
            Huffman.INSTANCE.decode(this.source, j4, c0732j);
            return c0732j.j(c0732j.i);
        }

        public final void readHeaders() throws IOException {
            while (!this.source.z()) {
                int iAnd = Util.and(this.source.W(), 255);
                if (iAnd == 128) {
                    throw new IOException("index == 0");
                }
                if ((iAnd & 128) == 128) {
                    readIndexedHeader(readInt(iAnd, 127) - 1);
                } else if (iAnd == 64) {
                    readLiteralHeaderWithIncrementalIndexingNewName();
                } else if ((iAnd & 64) == 64) {
                    readLiteralHeaderWithIncrementalIndexingIndexedName(readInt(iAnd, Hpack.PREFIX_6_BITS) - 1);
                } else if ((iAnd & 32) == 32) {
                    int i = readInt(iAnd, Hpack.PREFIX_5_BITS);
                    this.maxDynamicTableByteCount = i;
                    if (i < 0 || i > this.headerTableSizeSetting) {
                        throw new IOException(k.l("Invalid dynamic table size update ", Integer.valueOf(this.maxDynamicTableByteCount)));
                    }
                    adjustDynamicTableByteCount();
                } else if (iAnd == 16 || iAnd == 0) {
                    readLiteralHeaderWithoutIndexingNewName();
                } else {
                    readLiteralHeaderWithoutIndexingIndexedName(readInt(iAnd, 15) - 1);
                }
            }
        }

        public final int readInt(int i, int i3) {
            int i6 = i & i3;
            if (i6 < i3) {
                return i6;
            }
            int i7 = 0;
            while (true) {
                int i8 = readByte();
                if ((i8 & 128) == 0) {
                    return i3 + (i8 << i7);
                }
                i3 += (i8 & 127) << i7;
                i7 += 7;
            }
        }

        public Reader(M m6, int i, int i3) {
            k.f("source", m6);
            this.headerTableSizeSetting = i;
            this.maxDynamicTableByteCount = i3;
            this.headerList = new ArrayList();
            this.source = AbstractC0724b.c(m6);
            this.dynamicTable = new Header[8];
            this.nextHeaderIndex = 7;
        }

        public /* synthetic */ Reader(M m6, int i, int i3, int i6, g gVar) {
            this(m6, i, (i6 & 4) != 0 ? i : i3);
        }
    }

    public static final class Writer {
        public Header[] dynamicTable;
        public int dynamicTableByteCount;
        private boolean emitDynamicTableSizeUpdate;
        public int headerCount;
        public int headerTableSizeSetting;
        public int maxDynamicTableByteCount;
        private int nextHeaderIndex;
        private final C0732j out;
        private int smallestHeaderTableSizeSetting;
        private final boolean useCompression;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Writer(int i, C0732j c0732j) {
            this(i, false, c0732j, 2, null);
            k.f("out", c0732j);
        }

        private final void adjustDynamicTableByteCount() {
            int i = this.maxDynamicTableByteCount;
            int i3 = this.dynamicTableByteCount;
            if (i < i3) {
                if (i == 0) {
                    clearDynamicTable();
                } else {
                    evictToRecoverBytes(i3 - i);
                }
            }
        }

        private final void clearDynamicTable() {
            Header[] headerArr = this.dynamicTable;
            p089q4.k.j0(0, headerArr.length, headerArr);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private final int evictToRecoverBytes(int i) {
            int i3;
            int i6 = 0;
            if (i > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    i3 = this.nextHeaderIndex;
                    if (length < i3 || i <= 0) {
                        break;
                    }
                    Header header = this.dynamicTable[length];
                    k.c(header);
                    i -= header.hpackSize;
                    int i7 = this.dynamicTableByteCount;
                    Header header2 = this.dynamicTable[length];
                    k.c(header2);
                    this.dynamicTableByteCount = i7 - header2.hpackSize;
                    this.headerCount--;
                    i6++;
                }
                Header[] headerArr = this.dynamicTable;
                System.arraycopy(headerArr, i3 + 1, headerArr, i3 + 1 + i6, this.headerCount);
                Header[] headerArr2 = this.dynamicTable;
                int i8 = this.nextHeaderIndex;
                Arrays.fill(headerArr2, i8 + 1, i8 + 1 + i6, (Object) null);
                this.nextHeaderIndex += i6;
            }
            return i6;
        }

        private final void insertIntoDynamicTable(Header header) {
            int i = header.hpackSize;
            int i3 = this.maxDynamicTableByteCount;
            if (i > i3) {
                clearDynamicTable();
                return;
            }
            evictToRecoverBytes((this.dynamicTableByteCount + i) - i3);
            int i6 = this.headerCount + 1;
            Header[] headerArr = this.dynamicTable;
            if (i6 > headerArr.length) {
                Header[] headerArr2 = new Header[headerArr.length * 2];
                System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                this.nextHeaderIndex = this.dynamicTable.length - 1;
                this.dynamicTable = headerArr2;
            }
            int i7 = this.nextHeaderIndex;
            this.nextHeaderIndex = i7 - 1;
            this.dynamicTable[i7] = header;
            this.headerCount++;
            this.dynamicTableByteCount += i;
        }

        public final void resizeHeaderTable(int i) {
            this.headerTableSizeSetting = i;
            int iMin = Math.min(i, 16384);
            int i3 = this.maxDynamicTableByteCount;
            if (i3 == iMin) {
                return;
            }
            if (iMin < i3) {
                this.smallestHeaderTableSizeSetting = Math.min(this.smallestHeaderTableSizeSetting, iMin);
            }
            this.emitDynamicTableSizeUpdate = true;
            this.maxDynamicTableByteCount = iMin;
            adjustDynamicTableByteCount();
        }

        public final void writeByteString(C0735m c0735m) throws EOFException {
            k.f("data", c0735m);
            if (this.useCompression) {
                Huffman huffman = Huffman.INSTANCE;
                if (huffman.encodedLength(c0735m) < c0735m.d()) {
                    C0732j c0732j = new C0732j();
                    huffman.encode(c0735m, c0732j);
                    C0735m c0735mJ = c0732j.j(c0732j.i);
                    writeInt(c0735mJ.d(), 127, 128);
                    this.out.V(c0735mJ);
                    return;
                }
            }
            writeInt(c0735m.d(), 127, 0);
            this.out.V(c0735m);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0079  */
        public final void writeHeaders(List<Header> list) throws EOFException {
            int length;
            int length2;
            k.f("headerBlock", list);
            if (this.emitDynamicTableSizeUpdate) {
                int i = this.smallestHeaderTableSizeSetting;
                if (i < this.maxDynamicTableByteCount) {
                    writeInt(i, Hpack.PREFIX_5_BITS, 32);
                }
                this.emitDynamicTableSizeUpdate = false;
                this.smallestHeaderTableSizeSetting = Integer.MAX_VALUE;
                writeInt(this.maxDynamicTableByteCount, Hpack.PREFIX_5_BITS, 32);
            }
            int size = list.size();
            int i3 = 0;
            while (i3 < size) {
                int i6 = i3 + 1;
                Header header = list.get(i3);
                C0735m c0735mP = header.name.p();
                C0735m c0735m = header.value;
                Hpack hpack = Hpack.INSTANCE;
                Integer num = hpack.getNAME_TO_FIRST_INDEX().get(c0735mP);
                if (num != null) {
                    int iIntValue = num.intValue();
                    length2 = iIntValue + 1;
                    if (2 > length2 || length2 >= 8) {
                        length = length2;
                        length2 = -1;
                    } else if (k.a(hpack.getSTATIC_HEADER_TABLE()[iIntValue].value, c0735m)) {
                        length = length2;
                    } else if (k.a(hpack.getSTATIC_HEADER_TABLE()[length2].value, c0735m)) {
                        length = length2;
                        length2 = iIntValue + 2;
                    } else {
                        length = length2;
                        length2 = -1;
                    }
                } else {
                    length = -1;
                    length2 = -1;
                }
                if (length2 == -1) {
                    int i7 = this.nextHeaderIndex + 1;
                    int length3 = this.dynamicTable.length;
                    while (i7 < length3) {
                        int i8 = i7 + 1;
                        Header header2 = this.dynamicTable[i7];
                        k.c(header2);
                        if (k.a(header2.name, c0735mP)) {
                            Header header3 = this.dynamicTable[i7];
                            k.c(header3);
                            if (k.a(header3.value, c0735m)) {
                                length2 = Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length + (i7 - this.nextHeaderIndex);
                                break;
                            } else if (length == -1) {
                                length = Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length + (i7 - this.nextHeaderIndex);
                            }
                        }
                        i7 = i8;
                    }
                }
                if (length2 != -1) {
                    writeInt(length2, 127, 128);
                } else if (length == -1) {
                    this.out.Z(64);
                    writeByteString(c0735mP);
                    writeByteString(c0735m);
                    insertIntoDynamicTable(header);
                } else {
                    C0735m c0735m2 = Header.PSEUDO_PREFIX;
                    c0735mP.getClass();
                    k.f("prefix", c0735m2);
                    if (!c0735mP.l(0, c0735m2, c0735m2.d()) || k.a(Header.TARGET_AUTHORITY, c0735mP)) {
                        writeInt(length, Hpack.PREFIX_6_BITS, 64);
                        writeByteString(c0735m);
                        insertIntoDynamicTable(header);
                    } else {
                        writeInt(length, 15, 0);
                        writeByteString(c0735m);
                    }
                }
                i3 = i6;
            }
        }

        public final void writeInt(int i, int i3, int i6) {
            if (i < i3) {
                this.out.Z(i | i6);
                return;
            }
            this.out.Z(i6 | i3);
            int i7 = i - i3;
            while (i7 >= 128) {
                this.out.Z(128 | (i7 & 127));
                i7 >>>= 7;
            }
            this.out.Z(i7);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Writer(C0732j c0732j) {
            this(0, false, c0732j, 3, null);
            k.f("out", c0732j);
        }

        public Writer(int i, boolean z5, C0732j c0732j) {
            k.f("out", c0732j);
            this.headerTableSizeSetting = i;
            this.useCompression = z5;
            this.out = c0732j;
            this.smallestHeaderTableSizeSetting = Integer.MAX_VALUE;
            this.maxDynamicTableByteCount = i;
            Header[] headerArr = new Header[8];
            this.dynamicTable = headerArr;
            this.nextHeaderIndex = headerArr.length - 1;
        }

        public /* synthetic */ Writer(int i, boolean z5, C0732j c0732j, int i3, g gVar) {
            this((i3 & 1) != 0 ? Hpack.SETTINGS_HEADER_TABLE_SIZE : i, (i3 & 2) != 0 ? true : z5, c0732j);
        }
    }

    static {
        Hpack hpack = new Hpack();
        INSTANCE = hpack;
        Header header = new Header(Header.TARGET_AUTHORITY, "");
        C0735m c0735m = Header.TARGET_METHOD;
        Header header2 = new Header(c0735m, "GET");
        Header header3 = new Header(c0735m, "POST");
        C0735m c0735m2 = Header.TARGET_PATH;
        Header header4 = new Header(c0735m2, "/");
        Header header5 = new Header(c0735m2, "/index.html");
        C0735m c0735m3 = Header.TARGET_SCHEME;
        Header header6 = new Header(c0735m3, "http");
        Header header7 = new Header(c0735m3, "https");
        C0735m c0735m4 = Header.RESPONSE_STATUS;
        STATIC_HEADER_TABLE = new Header[]{header, header2, header3, header4, header5, header6, header7, new Header(c0735m4, "200"), new Header(c0735m4, "204"), new Header(c0735m4, "206"), new Header(c0735m4, "304"), new Header(c0735m4, "400"), new Header(c0735m4, "404"), new Header(c0735m4, "500"), new Header("accept-charset", ""), new Header("accept-encoding", "gzip, deflate"), new Header("accept-language", ""), new Header("accept-ranges", ""), new Header("accept", ""), new Header("access-control-allow-origin", ""), new Header("age", ""), new Header("allow", ""), new Header("authorization", ""), new Header("cache-control", ""), new Header("content-disposition", ""), new Header("content-encoding", ""), new Header("content-language", ""), new Header("content-length", ""), new Header("content-location", ""), new Header("content-range", ""), new Header("content-type", ""), new Header("cookie", ""), new Header("date", ""), new Header("etag", ""), new Header("expect", ""), new Header("expires", ""), new Header("from", ""), new Header("host", ""), new Header("if-match", ""), new Header("if-modified-since", ""), new Header("if-none-match", ""), new Header("if-range", ""), new Header("if-unmodified-since", ""), new Header("last-modified", ""), new Header("link", ""), new Header("location", ""), new Header("max-forwards", ""), new Header("proxy-authenticate", ""), new Header("proxy-authorization", ""), new Header("range", ""), new Header("referer", ""), new Header("refresh", ""), new Header("retry-after", ""), new Header("server", ""), new Header("set-cookie", ""), new Header("strict-transport-security", ""), new Header("transfer-encoding", ""), new Header("user-agent", ""), new Header("vary", ""), new Header("via", ""), new Header("www-authenticate", "")};
        NAME_TO_FIRST_INDEX = hpack.nameToFirstIndex();
    }

    private Hpack() {
    }

    private final Map<C0735m, Integer> nameToFirstIndex() {
        Header[] headerArr = STATIC_HEADER_TABLE;
        LinkedHashMap linkedHashMap = new LinkedHashMap(headerArr.length);
        int length = headerArr.length;
        int i = 0;
        while (i < length) {
            int i3 = i + 1;
            Header[] headerArr2 = STATIC_HEADER_TABLE;
            if (!linkedHashMap.containsKey(headerArr2[i].name)) {
                linkedHashMap.put(headerArr2[i].name, Integer.valueOf(i));
            }
            i = i3;
        }
        Map<C0735m, Integer> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        k.e("unmodifiableMap(result)", mapUnmodifiableMap);
        return mapUnmodifiableMap;
    }

    public final C0735m checkLowercase(C0735m c0735m) throws IOException {
        k.f("name", c0735m);
        int iD = c0735m.d();
        int i = 0;
        while (i < iD) {
            int i3 = i + 1;
            byte bI = c0735m.i(i);
            if (65 <= bI && bI <= 90) {
                throw new IOException(k.l("PROTOCOL_ERROR response malformed: mixed case name: ", c0735m.q()));
            }
            i = i3;
        }
        return c0735m;
    }

    public final Map<C0735m, Integer> getNAME_TO_FIRST_INDEX() {
        return NAME_TO_FIRST_INDEX;
    }

    public final Header[] getSTATIC_HEADER_TABLE() {
        return STATIC_HEADER_TABLE;
    }
}

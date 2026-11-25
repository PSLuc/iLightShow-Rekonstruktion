package okhttp3.internal.http2;

import E4.k;
import com.philips.lighting.hue.sdk.wrapper.HueLog;
import h5.C0735m;
import h5.InterfaceC0733k;
import h5.InterfaceC0734l;
import java.util.Arrays;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes.dex */
public final class Huffman {
    public static final Huffman INSTANCE = new Huffman();
    private static final int[] CODES = {8184, 8388568, 268435426, 268435427, 268435428, 268435429, 268435430, 268435431, 268435432, 16777194, 1073741820, 268435433, 268435434, 1073741821, 268435435, 268435436, 268435437, 268435438, 268435439, 268435440, 268435441, 268435442, 1073741822, 268435443, 268435444, 268435445, 268435446, 268435447, 268435448, 268435449, 268435450, 268435451, 20, 1016, 1017, 4090, 8185, 21, 248, 2042, 1018, 1019, 249, 2043, 250, 22, 23, 24, 0, 1, 2, 25, 26, 27, 28, 29, 30, 31, 92, 251, 32764, 32, 4091, 1020, 8186, 33, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 252, 115, 253, 8187, 524272, 8188, 16380, 34, 32765, 3, 35, 4, 36, 5, 37, 38, 39, 6, 116, 117, 40, 41, 42, 7, 43, 118, 44, 8, 9, 45, 119, 120, 121, 122, 123, 32766, 2044, 16381, 8189, 268435452, 1048550, 4194258, 1048551, 1048552, 4194259, 4194260, 4194261, 8388569, 4194262, 8388570, 8388571, 8388572, 8388573, 8388574, 16777195, 8388575, 16777196, 16777197, 4194263, 8388576, 16777198, 8388577, 8388578, 8388579, 8388580, 2097116, 4194264, 8388581, 4194265, 8388582, 8388583, 16777199, 4194266, 2097117, 1048553, 4194267, 4194268, 8388584, 8388585, 2097118, 8388586, 4194269, 4194270, 16777200, 2097119, 4194271, 8388587, 8388588, 2097120, 2097121, 4194272, 2097122, 8388589, 4194273, 8388590, 8388591, 1048554, 4194274, 4194275, 4194276, 8388592, 4194277, 4194278, 8388593, 67108832, 67108833, 1048555, 524273, 4194279, 8388594, 4194280, 33554412, 67108834, 67108835, 67108836, 134217694, 134217695, 67108837, 16777201, 33554413, 524274, 2097123, 67108838, 134217696, 134217697, 67108839, 134217698, 16777202, 2097124, 2097125, 67108840, 67108841, 268435453, 134217699, 134217700, 134217701, 1048556, 16777203, 1048557, 2097126, 4194281, 2097127, 2097128, 8388595, 4194282, 4194283, 33554414, 33554415, 16777204, 16777205, 67108842, 8388596, 67108843, 134217702, 67108844, 67108845, 134217703, 134217704, 134217705, 134217706, 134217707, 268435454, 134217708, 134217709, 134217710, 134217711, 134217712, 67108846};
    private static final byte[] CODE_BIT_COUNTS = {13, 23, 28, 28, 28, 28, 28, 28, 28, 24, 30, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 28, 6, 10, 10, 12, 13, 6, 8, 11, 10, 10, 8, 11, 8, 6, 6, 6, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 8, 15, 6, 12, 10, 13, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 7, 8, 13, 19, 13, 14, 6, 15, 5, 6, 5, 6, 5, 6, 6, 6, 5, 7, 7, 6, 6, 6, 5, 6, 7, 6, 5, 5, 6, 7, 7, 7, 7, 7, 15, 11, 14, 13, 28, 20, 22, 20, 20, 22, 22, 22, 23, 22, 23, 23, 23, 23, 23, 24, 23, 24, 24, 22, 23, 24, 23, 23, 23, 23, 21, 22, 23, 22, 23, 23, 24, 22, 21, 20, 22, 22, 23, 23, 21, 23, 22, 22, 24, 21, 22, 23, 23, 21, 21, 22, 21, 23, 22, 23, 23, 20, 22, 22, 22, 23, 22, 22, 23, 26, 26, 20, 19, 22, 23, 22, 25, 26, 26, 26, 27, 27, 26, 24, 25, 19, 21, 26, 27, 27, 26, 27, 24, 21, 21, 26, 26, 28, 27, 27, 27, 20, 24, 20, 21, 22, 21, 21, 23, 22, 22, 25, 25, 24, 24, 26, 23, 26, 27, 26, 26, 27, 27, 27, 27, 27, 28, 27, 27, 27, 27, 27, 26};
    private static final Node root = new Node();

    static {
        for (int i = 0; i < 256; i++) {
            INSTANCE.addCode(i, CODES[i], CODE_BIT_COUNTS[i]);
        }
    }

    private Huffman() {
    }

    private final void addCode(int i, int i3, int i6) {
        Node node = new Node(i, i6);
        Node node2 = root;
        while (i6 > 8) {
            i6 -= 8;
            int i7 = (i3 >>> i6) & 255;
            Node[] children = node2.getChildren();
            k.c(children);
            Node node3 = children[i7];
            if (node3 == null) {
                node3 = new Node();
                children[i7] = node3;
            }
            node2 = node3;
        }
        int i8 = 8 - i6;
        int i9 = (i3 << i8) & 255;
        Node[] children2 = node2.getChildren();
        k.c(children2);
        Arrays.fill(children2, i9, (1 << i8) + i9, node);
    }

    public final void decode(InterfaceC0734l interfaceC0734l, long j4, InterfaceC0733k interfaceC0733k) {
        k.f("source", interfaceC0734l);
        k.f("sink", interfaceC0733k);
        Node node = root;
        int iAnd = 0;
        long j6 = 0;
        int terminalBitCount = 0;
        while (j6 < j4) {
            j6++;
            iAnd = (iAnd << 8) | Util.and(interfaceC0734l.W(), 255);
            terminalBitCount += 8;
            while (terminalBitCount >= 8) {
                Node[] children = node.getChildren();
                k.c(children);
                node = children[(iAnd >>> (terminalBitCount - 8)) & 255];
                k.c(node);
                if (node.getChildren() == null) {
                    interfaceC0733k.A(node.getSymbol());
                    terminalBitCount -= node.getTerminalBitCount();
                    node = root;
                } else {
                    terminalBitCount -= 8;
                }
            }
        }
        while (terminalBitCount > 0) {
            Node[] children2 = node.getChildren();
            k.c(children2);
            Node node2 = children2[(iAnd << (8 - terminalBitCount)) & 255];
            k.c(node2);
            if (node2.getChildren() != null || node2.getTerminalBitCount() > terminalBitCount) {
                return;
            }
            interfaceC0733k.A(node2.getSymbol());
            terminalBitCount -= node2.getTerminalBitCount();
            node = root;
        }
    }

    public final void encode(C0735m c0735m, InterfaceC0733k interfaceC0733k) {
        k.f("source", c0735m);
        k.f("sink", interfaceC0733k);
        int iD = c0735m.d();
        long j4 = 0;
        int i = 0;
        int i3 = 0;
        while (i < iD) {
            int i6 = i + 1;
            int iAnd = Util.and(c0735m.i(i), 255);
            int i7 = CODES[iAnd];
            byte b6 = CODE_BIT_COUNTS[iAnd];
            j4 = (j4 << b6) | ((long) i7);
            i3 += b6;
            while (i3 >= 8) {
                i3 -= 8;
                interfaceC0733k.A((int) (j4 >> i3));
            }
            i = i6;
        }
        if (i3 > 0) {
            interfaceC0733k.A((int) ((j4 << (8 - i3)) | (255 >>> i3)));
        }
    }

    public final int encodedLength(C0735m c0735m) {
        k.f("bytes", c0735m);
        int iD = c0735m.d();
        long j4 = 0;
        int i = 0;
        while (i < iD) {
            int i3 = i + 1;
            j4 += (long) CODE_BIT_COUNTS[Util.and(c0735m.i(i), 255)];
            i = i3;
        }
        return (int) ((j4 + ((long) 7)) >> 3);
    }

    public static final class Node {
        private final Node[] children;
        private final int symbol;
        private final int terminalBitCount;

        public Node() {
            this.children = new Node[HueLog.LogComponent.STREAMDTLS];
            this.symbol = 0;
            this.terminalBitCount = 0;
        }

        public final Node[] getChildren() {
            return this.children;
        }

        public final int getSymbol() {
            return this.symbol;
        }

        public final int getTerminalBitCount() {
            return this.terminalBitCount;
        }

        public Node(int i, int i3) {
            this.children = null;
            this.symbol = i;
            int i6 = i3 & 7;
            this.terminalBitCount = i6 == 0 ? 8 : i6;
        }
    }
}

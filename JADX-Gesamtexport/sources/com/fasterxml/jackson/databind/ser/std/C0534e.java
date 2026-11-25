package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.JsonNode;
import java.io.IOException;
import java.lang.reflect.Type;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.util.TimeZone;
import p109u2.C0966e;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.ser.std.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0534e extends Q {
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0534e(int i) {
        super(ByteBuffer.class, 2, (byte) 0);
        this.i = i;
        switch (i) {
            case 1:
                super(InetSocketAddress.class, 2, (byte) 0);
                break;
            case 2:
                super(String.class, 2, (byte) 0);
                break;
            case 3:
                super(TimeZone.class, 2, (byte) 0);
                break;
            default:
                break;
        }
    }

    public static void f(InetSocketAddress inetSocketAddress, T1.e eVar) {
        String strSubstring;
        InetAddress address = inetSocketAddress.getAddress();
        String hostName = address == null ? inetSocketAddress.getHostName() : address.toString().trim();
        int iIndexOf = hostName.indexOf(47);
        if (iIndexOf >= 0) {
            if (iIndexOf == 0) {
                if (address instanceof Inet6Address) {
                    strSubstring = "[" + hostName.substring(1) + "]";
                } else {
                    strSubstring = hostName.substring(1);
                }
                hostName = strSubstring;
            } else {
                hostName = hostName.substring(0, iIndexOf);
            }
        }
        eVar.s0(hostName + ":" + inetSocketAddress.getPort());
    }

    @Override // com.fasterxml.jackson.databind.ser.std.Q, com.fasterxml.jackson.databind.ser.std.P, p015c2.o
    public void acceptJsonFormatVisitor(p059l2.b bVar, p015c2.h hVar) {
        switch (this.i) {
            case 0:
                bVar.getClass();
                break;
            case 1:
            default:
                super.acceptJsonFormatVisitor(bVar, hVar);
                break;
            case 2:
                visitStringFormat(bVar, hVar);
                break;
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.Q, com.fasterxml.jackson.databind.ser.std.P
    public JsonNode getSchema(p015c2.E e6, Type type) {
        switch (this.i) {
            case 2:
                return createSchemaNode("string", true);
            default:
                return super.getSchema(e6, type);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.Q, p015c2.o
    public boolean isEmpty(p015c2.E e6, Object obj) {
        switch (this.i) {
            case 2:
                return ((String) obj).isEmpty();
            default:
                return super.isEmpty(e6, obj);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.Q, p015c2.o
    public final void serialize(Object obj, T1.e eVar, p015c2.E e6) throws IOException {
        switch (this.i) {
            case 0:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                if (!byteBuffer.hasArray()) {
                    ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                    if (byteBufferAsReadOnlyBuffer.position() > 0) {
                        byteBufferAsReadOnlyBuffer.rewind();
                    }
                    C0966e c0966e = new C0966e(byteBufferAsReadOnlyBuffer);
                    int iRemaining = byteBufferAsReadOnlyBuffer.remaining();
                    eVar.getClass();
                    eVar.D(T1.b.f5157a, c0966e, iRemaining);
                    c0966e.close();
                } else {
                    int iPosition = byteBuffer.position();
                    byte[] bArrArray = byteBuffer.array();
                    int iArrayOffset = byteBuffer.arrayOffset() + iPosition;
                    int iLimit = byteBuffer.limit() - iPosition;
                    eVar.getClass();
                    eVar.G(T1.b.f5157a, bArrArray, iArrayOffset, iLimit);
                }
                break;
            case 1:
                f((InetSocketAddress) obj, eVar);
                break;
            case 2:
                eVar.s0((String) obj);
                break;
            default:
                eVar.s0(((TimeZone) obj).getID());
                break;
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.Q, p015c2.o
    public void serializeWithType(Object obj, T1.e eVar, p015c2.E e6, p071n2.e eVar2) {
        switch (this.i) {
            case 1:
                InetSocketAddress inetSocketAddress = (InetSocketAddress) obj;
                p003a2.a aVarD = eVar2.d(T1.k.VALUE_STRING, inetSocketAddress);
                aVarD.f6158b = InetSocketAddress.class;
                p003a2.a aVarE = eVar2.e(eVar, aVarD);
                f(inetSocketAddress, eVar);
                eVar2.f(eVar, aVarE);
                break;
            case 2:
                eVar.s0((String) obj);
                break;
            case 3:
                TimeZone timeZone = (TimeZone) obj;
                p003a2.a aVarD2 = eVar2.d(T1.k.VALUE_STRING, timeZone);
                aVarD2.f6158b = TimeZone.class;
                p003a2.a aVarE2 = eVar2.e(eVar, aVarD2);
                eVar.s0(timeZone.getID());
                eVar2.f(eVar, aVarE2);
                break;
            default:
                super.serializeWithType(obj, eVar, e6, eVar2);
                break;
        }
    }
}

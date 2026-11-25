package com.spotify.protocol.types;

import S1.I;
import S1.InterfaceC0361x;
import p012c.k;
import p110u3.c;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC0361x(ignoreUnknown = true)
public class Message implements Item {

    @c("message")
    @I("message")
    public final String message;

    public Message(String str) {
        this.message = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Message)) {
            return false;
        }
        Message message = (Message) obj;
        String str = this.message;
        if (str != null) {
            return str.equals(message.message);
        }
        return message.message == null;
    }

    public int hashCode() {
        String str = this.message;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return k.u(new StringBuilder("Message{message='"), this.message, "'}");
    }

    private Message() {
        this(null);
    }
}

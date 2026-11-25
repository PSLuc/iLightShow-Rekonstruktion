package com.spotify.protocol.types;

import S1.I;
import S1.InterfaceC0361x;
import p110u3.c;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC0361x(ignoreUnknown = true)
public class LibraryState implements Item {

    @c("can_save")
    @I("can_save")
    public final boolean canAdd;

    @c("saved")
    @I("saved")
    public final boolean isAdded;

    @c("uri")
    @I("uri")
    public final String uri;

    private LibraryState() {
        this(null, false, false);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LibraryState)) {
            return false;
        }
        LibraryState libraryState = (LibraryState) obj;
        if (this.isAdded != libraryState.isAdded || this.canAdd != libraryState.canAdd) {
            return false;
        }
        String str = this.uri;
        if (str != null) {
            return str.equals(libraryState.uri);
        }
        return libraryState.uri == null;
    }

    public int hashCode() {
        String str = this.uri;
        return ((((str != null ? str.hashCode() : 0) * 31) + (this.isAdded ? 1 : 0)) * 31) + (this.canAdd ? 1 : 0);
    }

    public String toString() {
        return "LibraryState{uri='" + this.uri + "', isAdded=" + this.isAdded + ", canAdd=" + this.canAdd + '}';
    }

    public LibraryState(String str, boolean z5, boolean z6) {
        this.uri = str;
        this.isAdded = z5;
        this.canAdd = z6;
    }
}

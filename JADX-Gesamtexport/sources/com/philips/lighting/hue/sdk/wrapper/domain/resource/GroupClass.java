package com.philips.lighting.hue.sdk.wrapper.domain.resource;

/* JADX INFO: loaded from: classes.dex */
public enum GroupClass {
    UNKNOWN(-1),
    NONE(0),
    LIVING_ROOM(1),
    KITCHEN(2),
    DINING(3),
    BEDROOM(4),
    KIDS_BEDROOM(5),
    BATHROOM(6),
    NURSERY(7),
    RECREATION(8),
    OFFICE(9),
    GYM(10),
    HALLWAY(11),
    TOILET(12),
    FRONT_DOOR(13),
    GARAGE(14),
    TERRACE(15),
    GARDEN(16),
    DRIVEWAY(17),
    CARPORT(18),
    TV(19),
    FREE(20),
    OTHER(21),
    HOME(22),
    DOWNSTAIRS(23),
    UPSTAIRS(24),
    TOP_FLOOR(25),
    ATTIC(26),
    GUEST_ROOM(27),
    STAIRCASE(28),
    LOUNGE(29),
    MAN_CAVE(30),
    COMPUTER(31),
    STUDIO(32),
    MUSIC(33),
    READING(34),
    CLOSET(35),
    STORAGE(36),
    LAUNDRY_ROOM(37),
    BALCONY(38),
    PORCH(39),
    BARBECUE(40),
    POOL(41);

    private int value;

    GroupClass(int i) {
        this.value = i;
    }

    public static GroupClass fromValue(int i) {
        for (GroupClass groupClass : values()) {
            if (groupClass.getValue() == i) {
                return groupClass;
            }
        }
        return UNKNOWN;
    }

    public int getValue() {
        return this.value;
    }
}

package com.hamzaouggadi.sn4jusersms.enums;

public enum AppUserRole {

    ADMIN(1),
    MODERATOR(2),
    NORMAL(3);

    private final int value;

    AppUserRole(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}

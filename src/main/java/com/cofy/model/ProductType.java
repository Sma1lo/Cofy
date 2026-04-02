package com.cofy.model;

public enum ProductType {
    COFFEE("Coffee"),
    BUN("Bun");

    private final String displayName;

    ProductType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}

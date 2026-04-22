package com.biomedical.waste.demo.services.admin;

public record TableSelector(String value, boolean prefix) {
    public static TableSelector exact(String tableName) {
        return new TableSelector(tableName, false);
    }

    public static TableSelector prefix(String prefix) {
        return new TableSelector(prefix, true);
    }
}

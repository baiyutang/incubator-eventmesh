package org.apache.eventmesh.runtime.filter;

public enum FilterType {

    SOURCE("source"), SINK("sink");

    private final String filterType;

    FilterType(String filterType) {
        this.filterType = filterType;
    }

    @Override
    public String toString() {
        return filterType;
    }
}

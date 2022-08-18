package org.apache.eventmesh.runtime.filter;

import io.cloudevents.CloudEvent;

public abstract class SourceFilter<T extends CloudEvent> implements EventMeshFilter<T, T> {

    @Override
    public FilterType filterType() {
        return FilterType.SOURCE;
    }
}

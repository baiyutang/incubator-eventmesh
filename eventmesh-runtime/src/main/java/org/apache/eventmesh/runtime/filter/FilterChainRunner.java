package org.apache.eventmesh.runtime.filter;

import io.cloudevents.CloudEvent;

public class FilterChainRunner<T extends CloudEvent> implements FilterRunner<T> {

    private final EventMeshFilter<T, T>[] filters;

    public FilterChainRunner(EventMeshFilter<T, T>[] filters) {
        this.filters = filters;
    }

    @Override
    public void filter(CloudEvent cloudevents) {

    }
}


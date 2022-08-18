package org.apache.eventmesh.runtime.filter;

import io.cloudevents.CloudEvent;

public interface EventMeshFilter<I extends CloudEvent, O extends CloudEvent> {

    boolean isDisabled();

    String filterName();

    default FilterType filterType() {
        Filter f = getClass().getAnnotation(Filter.class);
        if (f != null) {
            return f.type();
        }
        throw new UnsupportedOperationException("not implemented");
    }

    O apply(I input);
}

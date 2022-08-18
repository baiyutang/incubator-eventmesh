package org.apache.eventmesh.runtime.filter;

import io.cloudevents.CloudEvent;

public interface FilterRunner<I extends CloudEvent> {

    void filter(I cloudevents);

}

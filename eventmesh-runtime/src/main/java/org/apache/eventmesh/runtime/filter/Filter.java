package org.apache.eventmesh.runtime.filter;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Identifies a {@link EventMeshFilter}.
 */
@Target({TYPE})
@Retention(RUNTIME)
@Documented
public @interface Filter {

    FilterType type();
}

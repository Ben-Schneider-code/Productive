package com.productive6.productive.objects.events;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation used to mark any class method that is to handle Productive App Events.
 * Annotation interfaces don't typicall have much for an implementation.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ProductiveEventHandler {
}

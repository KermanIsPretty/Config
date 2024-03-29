package cc.kermanispretty.config.common.transform;

import cc.kermanispretty.config.common.Config;
import cc.kermanispretty.config.common.reflection.context.FieldContext;
import cc.kermanispretty.config.common.transform.exepctions.InvalidTransformExpectation;

import java.lang.annotation.Annotation;

public interface Transformer<T, V extends Annotation, R> {

    /**
     * Transforms the given object. If the object is not valid, an exception is thrown.
     *
     * @param field      The field if you need it for whatever reason.
     * @param object     The object to transform. Nullable
     * @param annotation The annotation associated with the field.
     * @param config     The config associated with the field.
     * @return The transformed object. in U type
     * @throws InvalidTransformExpectation If the object is not able to be transformed
     */
    R transform(FieldContext field, T object, V annotation, Config config) throws InvalidTransformExpectation;
}

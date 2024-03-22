package com.javaSpringProject.javaspringexample.util;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class UtilsMapper {

    /**
     * Used for one to one conversions for entity to dto or vice versa.
     * @param from the object being converted from
     * @param toClass the object being converted to
     * @param <T> class to be converted to
     * @return the converted object
     */
    public static <T> T map(Object from, Class<T> toClass) {
        return map(new ModelMapper(), from, toClass);
    }
    /**
     * Used for one to one conversions for entity to dto or vice versa.
     * @param from the object being converted from
     * @param toClass the object being converted to
     * @param <T> class to be converted to
     * @return the converted object
     */
    public static <T> T mapStrict(Object from, Class<T> toClass) {
        ModelMapper modelMapper= new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        return map(modelMapper, from, toClass);
    }
    /**
     * Used for complex mappings or for when you need to manipulate the data before setting it. See
     * AccountUtils.java for example
     * @param mapper modelMapper containing complex mappings
     * @param from the object being converted from
     * @param toClass the object being converted to
     * @param <T> class to be converted to
     * @return the converted object
     */
    public static <T> T map(ModelMapper mapper, Object from, Class<T> toClass) {
        if (mapper == null) {
            throw new IllegalArgumentException("Model Mapper cannot be null.");
        }
        if (from == null) {
            throw new IllegalArgumentException("Object being mapped from cannot be null.");
        }
        if (toClass == null) {
            throw new IllegalArgumentException("Class being mapped to cannot be null.");
        }
        return mapper.map(from, toClass);
    }

    public static <T> T mapIgnoreNull(ModelMapper mapper, Object from, Class<T> toClass) {
        mapper.getConfiguration().setSkipNullEnabled(true);

        if (from == null) {
            throw new IllegalArgumentException("Object being mapped from cannot be null.");
        }
        if (toClass == null) {
            throw new IllegalArgumentException("Class being mapped to cannot be null.");
        }

        return mapper.map(from, toClass);
    };
}

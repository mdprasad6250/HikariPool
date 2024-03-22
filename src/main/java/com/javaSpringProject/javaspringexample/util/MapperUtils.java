package com.javaSpringProject.javaspringexample.util;

import com.javaSpringProject.javaspringexample.Dto.BookDto;
import com.javaSpringProject.javaspringexample.Entity.Book;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.apache.commons.collections4.CollectionUtils;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.modelmapper.convention.MatchingStrategies;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class MapperUtils {

    private static final ModelMapper BOOK_TO_BOOK_DTO_MODEL_MAPPER;
    private static final ModelMapper BOOK_DTO_TO_BOOK_MODEL_MAPPER;

    static {
        BOOK_TO_BOOK_DTO_MODEL_MAPPER = new ModelMapper();
        BOOK_TO_BOOK_DTO_MODEL_MAPPER
                .getConfiguration()
                .setMatchingStrategy(MatchingStrategies.STRICT);
        PropertyMap<Book, BookDto> bookDtoPropertyMap = new PropertyMap<>() {
            @Override
            protected void configure() {
                map().setBookId(source.getBookId());
            }
        };

        BOOK_TO_BOOK_DTO_MODEL_MAPPER.addMappings(bookDtoPropertyMap);
        BOOK_DTO_TO_BOOK_MODEL_MAPPER = new ModelMapper();
        BOOK_DTO_TO_BOOK_MODEL_MAPPER
                .getConfiguration()
                .setMatchingStrategy(MatchingStrategies.STRICT);
        PropertyMap<BookDto, Book> bookPropertyMap = new PropertyMap<>() {
            @Override
            protected void configure() {
                map().setBookId(source.getBookId());
            }
        };
        BOOK_DTO_TO_BOOK_MODEL_MAPPER.addMappings(bookPropertyMap);
    }

    public static BookDto convertBookEntityToBookDto(Book bookEntity) {
        if (Objects.isNull(bookEntity)) {
            return BookDto.builder().build();
        }
        return UtilsMapper.map(BOOK_TO_BOOK_DTO_MODEL_MAPPER, bookEntity, BookDto.class);
    }

    public static Collection<BookDto> convertBookEntityToBookDto(Collection<Book> bookEntities) {
        if (CollectionUtils.isEmpty(bookEntities)) {
            return CollectionUtils.emptyCollection();
        }
        return bookEntities.stream().filter(Objects::nonNull).map(book -> {
            return UtilsMapper.map(BOOK_TO_BOOK_DTO_MODEL_MAPPER, book, BookDto.class);
        }).collect(Collectors.toList());
    }

    public static Book convertBookDtoToBookEntity(BookDto bookDto) {
        if (Objects.isNull(bookDto)) {
            throw new IllegalArgumentException();
        }
        return UtilsMapper.map(BOOK_DTO_TO_BOOK_MODEL_MAPPER, bookDto, Book.class);
    }

    public static Collection<Book> convertBookDtoToBookEntity(Collection<BookDto> booksDto) {
        if (CollectionUtils.isEmpty(booksDto)) {
            throw new IllegalArgumentException();
        }
        return booksDto.stream().filter(Objects::nonNull).map(bookDto -> {
            return UtilsMapper.map(BOOK_TO_BOOK_DTO_MODEL_MAPPER, bookDto, Book.class);
        }).collect(Collectors.toList());
    }

}

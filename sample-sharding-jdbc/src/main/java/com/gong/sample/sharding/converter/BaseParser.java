package com.gong.sample.sharding.converter;

public interface BaseParser<T, E> {

    E toEntity(T t);

    T toDto(E e);
}

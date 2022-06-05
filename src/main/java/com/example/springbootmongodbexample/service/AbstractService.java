package com.example.springbootmongodbexample.service;

import com.example.springbootmongodbexample.exception.ServiceException;
import org.springframework.data.domain.Page;

/**
 * @Created 05/06/2022
 * @Author monir.hossain
 */
public interface AbstractService<T> {
    T create(T t) throws ServiceException;
    T update(String id, T t) throws ServiceException;
    boolean delete(String id) throws ServiceException;
    T findById(String id);
    Page<T> findAll(int page, int size);
}

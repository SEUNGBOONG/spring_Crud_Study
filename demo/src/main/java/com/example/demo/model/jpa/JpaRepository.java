package com.example.demo.model.jpa;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface JpaRepository<T,ID>extends PagingAndSortingRepository<T, ID>, QueryByExampleExecutor<T> {

}

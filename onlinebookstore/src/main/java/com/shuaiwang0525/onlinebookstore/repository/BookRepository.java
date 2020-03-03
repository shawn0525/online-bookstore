package com.shuaiwang0525.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shuaiwang0525.onlinebookstore.entity.Book;


public interface BookRepository extends JpaRepository<Book, Long>{

}

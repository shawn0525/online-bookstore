package com.shuaiwang0525.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.shuaiwang0525.onlinebookstore.entity.BookCategory;

@RepositoryRestResource(collectionResourceRel = "bookCategory" , path ="book-category")
public interface BookCategoryRepository extends JpaRepository<BookCategory, Long>{

}

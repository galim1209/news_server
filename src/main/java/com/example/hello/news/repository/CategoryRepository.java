package com.example.hello.news.repository;


import com.example.hello.news.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

//  카테고리 엔티티를 처리해주는 JpaRepository 를 상속받는다
public interface CategoryRepository extends JpaRepository<Category, Long> {
}

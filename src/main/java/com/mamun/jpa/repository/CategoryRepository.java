package com.mamun.jpa.repository;

import com.mamun.jpa.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CategoryRepository extends JpaRepository<Category,Integer> {


      @Query("select c from Category c where c.categoryId=:categoryId")
      public Category getCategoryInfo(@Param("categoryId") int categoryId);

}


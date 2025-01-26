package com.task.api_nimap.Repository;

import com.task.api_nimap.Model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    
}


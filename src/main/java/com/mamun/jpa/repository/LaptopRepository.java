package com.mamun.jpa.repository;

import com.mamun.jpa.model.Laptop;
import com.mamun.jpa.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface LaptopRepository extends JpaRepository<Laptop,Integer> {

}

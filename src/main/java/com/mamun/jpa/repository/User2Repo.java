package com.mamun.jpa.repository;

import com.mamun.jpa.model.User2;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface User2Repo extends JpaRepository<User2,Integer> {
   List<User2> findByAgeBetween(int start, int end);
   List<User2> findByNameAndAge(String name, int age);
//    List<User> findByAgeGreaterThan(Integer age);
//    List<User> findByAgeGreaterThanEqual(Integer age);
//List<User> findByAgeBetween(Integer startAge, Integer endAge);
//    List<User> findByAgeIn(Collection<Integer> ages);
//    List<User> findByBirthDateAfter(ZonedDateTime birthDate);
//    List<User> findByBirthDateBefore(ZonedDateTime birthDate);
//    List<User> findByNameOrderByName(String name);
//    List<User> findByNameOrderByNameAsc(String name);
//    List<User> findByNameOrderByNameDesc(String name);
}

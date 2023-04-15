package com.mamun.jpa.repository;

import com.mamun.jpa.model.Laptop;
import com.mamun.jpa.model.Post;
import com.mamun.jpa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {

    //@Query(value = "select l.l_id, u.user_name , l.laptop_name from laptop l JOIN user u on l.user_user_id= u.user_id",nativeQuery = true)
   @Query( "SELECT l.lId, u.userName, l.laptopName FROM Laptop l JOIN l.user u")

    public List<String> findByUserNameAndLaptopName();



//    @Query("select p.post_id, p.title, u.user_name from post p JOIN user u ON p.user_user_id= :userId")
//    public Post getByuserId(@Param("userId") int userId);
//    @Query(value = "select * from user", nativeQuery = true)
//    public List<User> findByAllUser();

    public List<User> findByUserName(String name);

    List<User> findByUserNameStartingWith(String suffix);
    List<User> findByUserNameLike(String matcher);
    List<User> findByUserNameContaining(String matcher);


}

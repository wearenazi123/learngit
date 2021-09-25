package com.xyz.dbtest.dao;



import com.xyz.dbtest.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper //1
public interface UserDao {
    @Results({ //2
            @Result(property = "id", column = "id"), //2
            @Result(property = "name", column = "name"),
            @Result(property = "age", column = "age")
    })
    @Select("SELECT * FROM User WHERE age = #{age}") //3
    List<User> get(int age);

    @Insert("INSERT INTO User(name, age) VALUES (#{name}, #{age})") //3
    void insert(User user);
}
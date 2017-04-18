package com.sankuai.oa.demo.mapper;

import com.sankuai.oa.demo.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("SELECT * FROM User WHERE NAME = #{name}")
    User findByName(@Param("name") String name);

    @Insert("INSERT INTO User(NAME, AGE) VALUES(#{name}, #{age})")
    int insert(@Param("name") String name, @Param("age") Integer age);
}

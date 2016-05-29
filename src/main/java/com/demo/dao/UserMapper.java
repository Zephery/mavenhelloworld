package com.demo.dao;

import com.demo.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated
     */
    @Delete({
            "delete from user",
            "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated
     */

    @Insert({
            "insert into user (id, username, ",
            "password)",
            "values (#{id,jdbcType=INTEGER}, #{username,jdbcType=VARCHAR}, ",
            "#{password,jdbcType=VARCHAR})"
    })
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated
     */
    int insertSelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated
     */
    @Select({
            "select",
            "id, username, password",
            "from user",
            "where id = #{id,jdbcType=INTEGER}"
    })
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated
     */
    @Update({
            "update user",
            "set username = #{username,jdbcType=VARCHAR},",
            "password = #{password,jdbcType=VARCHAR}",
            "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(User record);

    @Select("select * from user where username=#{un} and password=#{pw}")
    @Results({

            @Result(id = true, property = "id", column = "id", javaType = Integer.class),
            @Result(property = "username", column = "username", javaType = String.class),
            @Result(property = "password", column = "password", javaType = String.class)
    })
    public User login(@Param("un") String username, @Param("pw") String password);
}
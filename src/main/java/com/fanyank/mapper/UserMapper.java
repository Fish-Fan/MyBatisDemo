package com.fanyank.mapper;

import com.fanyank.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * Created by yanfeng-mac on 2017/4/18.
 */
public interface UserMapper {
    //注解形式的Mapper
    @Select (value = "select * from t_user where id = #{id}")
    public User getUser(Integer id);

    @Insert(value = "insert into t_user(id,username,password) values(#{id},#{username},#{password})")
    public void insertUser(User user);

    @Delete(value = "delete from t_user where id = #{id}")
    public void deleteUser(Integer id);

    @Update(value = "update t_user set username = #{username},password = #{password} where id = #{id}")
    public void updateUser(User user);
}

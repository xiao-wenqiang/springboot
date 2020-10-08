package com.mapper;

import com.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper     //表示是一个MyBatis的Mapper
@Repository
public interface UserMapper {

    List<User> getUser();
}

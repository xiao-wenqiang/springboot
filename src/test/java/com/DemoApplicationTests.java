package com;

import com.mapper.UserMapper;
import com.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    UserMapper userMapper;
    @Test
    void getUserTest(){
        List<User> userList = userMapper.getUser();
        for (User user : userList) {
            System.out.println(user);
        }
    }

    @Autowired
    User user;
    @Test
    void userTest(){
        System.out.println(user);
    }

    @Autowired
    DataSource dataSource;
    @Test
    void dataSourceTest() throws SQLException {
        System.out.println(dataSource.getClass());
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }

    @Test
    void contextLoads() {

    }
}

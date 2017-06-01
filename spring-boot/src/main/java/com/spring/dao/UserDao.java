package com.spring.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.spring.model.User;

@Repository
public class UserDao {
	
	private static final RowMapper<User> USER_ROW_MAPPER = new RowMapper<User>() {
        public User mapRow(ResultSet rs, int row) throws SQLException {
            User user = new User();
            user.setUserId(rs.getInt("userid"));
            user.setUserName(rs.getString("username"));
            user.setUserpassword(rs.getString("userpassword"));
            return user;
        }
    };
    
    @Resource
    private JdbcTemplate jdbcTemplate;

    public List<User> findAll() {
        return jdbcTemplate.query("select * from user ",USER_ROW_MAPPER);
    }

}

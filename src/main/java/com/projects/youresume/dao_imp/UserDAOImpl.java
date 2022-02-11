package com.projects.youresume.dao_imp;

import com.projects.youresume.dao_int.UserDAOInter;
import com.projects.youresume.model.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDAOImpl implements UserDAOInter {

//    private JdbcTemplate template;
//    private UserRowMapper userRowMapper;
//    private UserResultSetExtractor setExtractor;
//
//    public UserDAOImpl(JdbcTemplate template, UserRowMapper userRowMapper, UserResultSetExtractor setExtractor) {
//        this.template = template;
//        this.userRowMapper = userRowMapper;
//        this.setExtractor = setExtractor;
//    }

    @Override
    public List<User> getAllUsers() {
//        List<User> list = null;
//        String sql = "select * from User";
//        list = template.query(sql, setExtractor);
        return null;
    }

    @Override
    public User getUserById() {
        return null;
    }

    @Override
    public void addUser() {

    }

    @Override
    public void updateUser() {

    }

    @Override
    public void deleteUser() {

    }
}

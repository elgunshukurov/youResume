package com.projects.youresume.dao_imp;

import com.projects.youresume.model.User;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class UserRowMapper implements RowMapper<User> {

    @Override
    public User mapRow(ResultSet rs, int i) throws SQLException {
        //   String sql = "select id, name, surname, salary " +
        //                "from employee " +
        //                "order by id";

        System.out.println("setir " + i + " isci obyektine cevir");
        User employee = new User();
        employee.setId(rs.getLong("id"));
        employee.setName(rs.getString("name"));
        employee.setSurname(rs.getString("surname"));
        employee.setE_mail(rs.getString("e_mail"));
        employee.setPhone(rs.getString("phone"));
        return employee;
    }
}

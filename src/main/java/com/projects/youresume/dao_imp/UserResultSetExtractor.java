package com.projects.youresume.dao_imp;

import com.projects.youresume.model.User;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserResultSetExtractor implements ResultSetExtractor<List<User>> {

    @Override
    public List<User> extractData(ResultSet rs) throws SQLException, DataAccessException {
        List<User> employees = new ArrayList<>();

        while (rs.next()) {
            User employee = new User();
            employee.setId(rs.getLong("id"));
            employee.setName(rs.getString("name"));
            employee.setSurname(rs.getString("surname"));
            employee.setE_mail(rs.getString("e_mail"));
            employee.setPhone(rs.getString("phone"));
            employees.add(employee);
        }
        return employees;
    }
}

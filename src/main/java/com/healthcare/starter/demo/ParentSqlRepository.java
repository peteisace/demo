package com.healthcare.starter.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.SQLException;

@Repository
public class ParentSqlRepository implements ParentRepository{

    private DataSource dataSource;

    @Autowired
    public ParentSqlRepository(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public Parent save(Parent p) throws ParentDataException {
        try {
            int x = 1;
            throw new SQLException("Haha");
        } catch (SQLException ex) {
            throw new ParentDataException("Could not save parent", 1, ex);
        }
    }
}

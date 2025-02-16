package com.example.template.repositories;
import com.example.template.domain.Entity;

import java.sql.Connection;

public abstract class DBRepository<ID, E extends Entity<ID>> implements Repository<ID, E> {
    protected Connection connection;
    public DBRepository(Connection connection) {
        this.connection = connection;
    }
}

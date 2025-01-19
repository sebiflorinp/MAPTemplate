package com.example.template.repositories;
import com.example.template.domain.Entity;
import eu.hansolo.fx.countries.tools.Connection;

public abstract class DBRepository<ID, E extends Entity<ID>> implements Repository<ID, E> {
    protected Connection connection;
    public DBRepository(Connection connection) {
        this.connection = connection;
    }
}

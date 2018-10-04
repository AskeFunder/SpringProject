package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class HumanRepository extends AbstractRepository<Human>
{
    @Autowired
    JdbcTemplate jdbc = new JdbcTemplate();

}

package com.zfx.community.dao;

import org.springframework.stereotype.Repository;

@Repository("AlphaHibernate")
public class AlphaDaoHibernateImpl implements AlphaDao {
    @Override
    public String select() {
        return "mapperDao";
    }
}

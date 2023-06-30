package com.solvd.mybatis;

import com.solvd.interfaces.ICitiesDAO;
import com.solvd.models.Cities;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class CitiesDAO {
    public Cities getById(Long id) {
        SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
        try {
            ICitiesDAO iCitiesDAO =session.getMapper(ICitiesDAO.class);
            return iCitiesDAO.getById(id);
        }finally {
            session.rollback();
            session.close();
        }
    }

    public List<Cities> getAll(){
        SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
        try {
            ICitiesDAO iCitiesDAO =session.getMapper(ICitiesDAO.class);
            return iCitiesDAO.getAll();
        }finally {
            session.rollback();
            session.close();
        }
    }
}



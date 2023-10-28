package vn.edu.iuh.fit.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import vn.edu.iuh.fit.db.Connect;
import vn.edu.iuh.fit.entity.LoaiXe;
import vn.edu.iuh.fit.entity.Xe;

import java.util.List;

public class LoaiXeDao {
    private EntityManager manager;

    public LoaiXeDao() {
        manager= Connect.getInstance().getEntityManagerFactory().createEntityManager();
    }
    public List<LoaiXe> getAll(){
        EntityTransaction tr= manager.getTransaction();
        tr.begin();
        try {
            return manager.createQuery("select lx from LoaiXe lx", LoaiXe.class).getResultList();
        }catch (Exception e){
            tr.rollback();
        }
        return null;
    }
    public boolean add(LoaiXe loaiXe){
        EntityTransaction tr= manager.getTransaction();
        tr.begin();
        try {
            manager.persist(loaiXe);
            tr.commit();
            return true;
        }catch (Exception e){
            tr.rollback();
        }
        return false;
    }
}

package vn.edu.iuh.fit.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import vn.edu.iuh.fit.db.Connect;
import vn.edu.iuh.fit.entity.LoaiXe;
import vn.edu.iuh.fit.entity.Xe;

import java.util.List;

public class XeDao {
    private EntityManager manager;

    public XeDao() {
        manager= Connect.getInstance().getEntityManagerFactory().createEntityManager();
    }
    public List<Xe> getAll(){
        EntityTransaction tr= manager.getTransaction();
        tr.begin();
        try {
            return manager.createQuery("select x from Xe x", Xe.class).getResultList();
        }catch (Exception e){
            tr.rollback();
        }
        return null;
    }
    public boolean add(Xe xe){
        EntityTransaction tr= manager.getTransaction();
        tr.begin();
        try {
            manager.merge(xe);
            tr.commit();
            return true;
        }catch (Exception e){
            tr.rollback();
        }
        return false;
    }
}

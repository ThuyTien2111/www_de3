package vn.edu.iuh.fit.demo;

import vn.edu.iuh.fit.dao.LoaiXeDao;
import vn.edu.iuh.fit.dao.XeDao;
import vn.edu.iuh.fit.entity.LoaiXe;
import vn.edu.iuh.fit.entity.Xe;

public class XeDaoTest {
    public static void main(String[] args) {
        XeDao xeDao=new XeDao();
        LoaiXeDao loaiXeDao=new LoaiXeDao();
        /*for (int i = 0; i < 3; i++) {
            System.out.println(loaiXeDao.add(new LoaiXe(4+i, "loai"+i)));
        }*/
        for (int i = 0; i < 3; i++) {
            System.out.println(xeDao.add(new Xe(16+i, "xe"+i, 1500, 2023+i, i, new LoaiXe(6))));
        }
    }
}

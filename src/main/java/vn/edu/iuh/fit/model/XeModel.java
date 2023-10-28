package vn.edu.iuh.fit.model;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vn.edu.iuh.fit.dao.XeDao;
import vn.edu.iuh.fit.entity.LoaiXe;
import vn.edu.iuh.fit.entity.Xe;

import java.io.IOException;

public class XeModel {
    private final XeDao xeDao=new XeDao();
    public void add(HttpServletRequest request,HttpServletResponse response) throws IOException {
        long maXe= Long.parseLong(request.getParameter("id"));
        String tenXe= request.getParameter("name");
        double gia= Double.parseDouble(request.getParameter("price"));
        int namSX= Integer.parseInt(request.getParameter("year"));
        int status= Integer.parseInt(request.getParameter("status"));
        long maLoai= Long.parseLong(request.getParameter("type"));

        xeDao.add(new Xe(maXe, tenXe, gia, namSX, status, new LoaiXe(maLoai)));
        response.sendRedirect("ds-xe.jsp");

    }
}

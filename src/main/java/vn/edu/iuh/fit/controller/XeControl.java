package vn.edu.iuh.fit.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vn.edu.iuh.fit.model.XeModel;

import java.io.IOException;

@WebServlet("/xeControl")
public class XeControl extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Object actObject=req.getParameter("action");
        if(actObject!=null){
            String action=actObject.toString();
            if(action.equals("add")){
                XeModel xeModel=new XeModel();
                xeModel.add(req, resp);
            }
        }else {
            resp.sendRedirect("index.jsp");
        }
    }
}

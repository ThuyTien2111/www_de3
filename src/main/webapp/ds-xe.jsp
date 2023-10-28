<%@ page import="java.util.List" %>
<%@ page import="vn.edu.iuh.fit.entity.LoaiXe" %>
<%@ page import="vn.edu.iuh.fit.dao.LoaiXeDao" %>
<%@ page import="vn.edu.iuh.fit.entity.Xe" %>
<%@ page import="vn.edu.iuh.fit.dao.XeDao" %><%--
  Created by IntelliJ IDEA.
  User: my
  Date: 28/10/2023
  Time: 6:06 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Danh sách xe</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
<div class="container">
    <h2>Danh sách xe</h2>
    <table class="table">
        <thead>
        <tr>
            <th>Tên xe</th>
            <th>Giá xe</th>
            <th>Năm sản xuất</th>
            <th>Trạng thái</th>
            <th>Loại xe</th>
        </tr>
        </thead>
        <tbody>
        <%
            XeDao xeDao =new XeDao();
            List<Xe> Xes=xeDao.getAll();
            for (Xe xe:Xes) {
                String status="";
                if(xe.getStatus()==0){
                    status="STOPPED";
                }else if(xe.getStatus()==1){
                    status="ACTIVE";
                }else if(xe.getStatus()==2){
                    status="TERMINATED";
                }
        %>
        <tr>
            <td><%=xe.getTenXe()%></td>
            <td><%=xe.getGia()%></td>
            <td><%=xe.getNamSX()%></td>
            <td><%=status%></td>
            <td><%=xe.getMaLoai().getTenLoai()%></td>
        </tr>
        <%
            }
        %>
        </tbody>
    </table>
</div>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>

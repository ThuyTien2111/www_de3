<%@ page import="java.util.List" %>
<%@ page import="vn.edu.iuh.fit.entity.LoaiXe" %>
<%@ page import="vn.edu.iuh.fit.dao.LoaiXeDao" %><%--
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
    <title>Danh sách loại xe</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
<div class="container">
    <h2>Danh sách loại xe</h2>
    <table class="table">
        <thead>
        <tr>
            <th>Mã loại</th>
            <th>Tên loại</th>
        </tr>
        </thead>
        <tbody>
        <%
            LoaiXeDao loaiXeDao=new LoaiXeDao();
            List<LoaiXe> loaiXes=loaiXeDao.getAll();
            for (LoaiXe loaiXe:loaiXes) {
        %>
        <tr>
            <td><%=loaiXe.getMaLoai()%></td>
            <td><%=loaiXe.getTenLoai()%></td>
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

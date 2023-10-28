<%@ page import="vn.edu.iuh.fit.dao.LoaiXeDao" %>
<%@ page import="java.util.List" %>
<%@ page import="vn.edu.iuh.fit.entity.LoaiXe" %><%--
  Created by IntelliJ IDEA.
  User: my
  Date: 28/10/2023
  Time: 6:07 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Thêm xe</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
<div class="container">
    <h2>Điền thông tin xe</h2>
    <form method="post" action="xeControl?action=add">
        <div class="form-group">
            <label for="id">Mã xe:</label>
            <input class="form-control" name="id" id="id" type="number">
        </div>
        <div class="form-group">
            <label for="name">Tên xe:</label>
            <input class="form-control" name="name" id="name" type="text">
        </div>
        <div class="form-group">
            <label for="price">Giá xe:</label>
            <input class="form-control" name="price" id="price" type="number">
        </div>
        <div class="form-group">
            <label for="year">Năm sản xuất:</label>
            <input class="form-control" name="year" id="year" type="number">
        </div>
        <div class="form-group">
            <label for="status">Trạng thái:</label>
            <select name="status" id="status" class="form-control">
                <option value="0">STOPPED</option>
                <option value="1">ACTIVATED</option>
                <option value="2">TERMINATED</option>
            </select>
        </div>
        <div class="form-group">
            <label for="type">Loại xe:</label>
            <select name="type" id="type" class="form-control">
                <%
                    LoaiXeDao loaiXeDao=new LoaiXeDao();
                    List<LoaiXe> list=loaiXeDao.getAll();
                    for (LoaiXe loaiXe:list) {
                %>
                <option value="<%=loaiXe.getMaLoai()%>"><%=loaiXe.getTenLoai()%></option>
               <%
                   }
               %>
            </select>
        </div>
        <button type="submit" class="btn btn-success">Xác nhận thêm</button>

    </form>

</div>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>

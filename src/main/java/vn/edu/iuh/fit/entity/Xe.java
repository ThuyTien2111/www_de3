package vn.edu.iuh.fit.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "xe")
public class Xe {
    @Id
    @Column(name ="MaXe")
    private long maXe;
    @Column(name ="TenXe", columnDefinition = "nvarchar(100)")
    private String tenXe;
    @Column(name ="Gia")
    private double gia;
    @Column(name ="NamSX")
    private int namSX;
    @Column(name = "Status", columnDefinition = "tinyint(4)")
    private int status;
    @ManyToOne
    @JoinColumn(name = "MaLoai")
    private LoaiXe maLoai;

    public Xe() {
    }

    public Xe(long maXe, String tenXe, double gia, int namSX, int status, LoaiXe maLoai) {
        this.maXe = maXe;
        this.tenXe = tenXe;
        this.gia = gia;
        this.namSX = namSX;
        this.status = status;
        this.maLoai = maLoai;
    }

    public long getMaXe() {
        return maXe;
    }

    public void setMaXe(long maXe) {
        this.maXe = maXe;
    }

    public String getTenXe() {
        return tenXe;
    }

    public void setTenXe(String tenXe) {
        this.tenXe = tenXe;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getNamSX() {
        return namSX;
    }

    public void setNamSX(int namSX) {
        this.namSX = namSX;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public LoaiXe getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(LoaiXe maLoai) {
        this.maLoai = maLoai;
    }

    @Override
    public String toString() {
        return "Xe{" +
                "maXe=" + maXe +
                ", tenXe='" + tenXe + '\'' +
                ", gia=" + gia +
                ", namSX=" + namSX +
                ", status=" + status +
                ", maLoai=" + maLoai +
                '}';
    }
}

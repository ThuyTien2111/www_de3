package vn.edu.iuh.fit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "loaixe")
public class LoaiXe {
    @Id
    @Column(name = "MaLoai")
    private long maLoai;
    @Column(name = "TenLoai", columnDefinition = "nvarchar(50)")
    private String tenLoai;

    public LoaiXe() {
    }

    public LoaiXe(long maLoai) {
        this.maLoai = maLoai;
    }

    public LoaiXe(long maLoai, String tenLoai) {
        this.maLoai = maLoai;
        this.tenLoai = tenLoai;
    }

    public long getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(long maLoai) {
        this.maLoai = maLoai;
    }

    public String getTenLoai() {
        return tenLoai;
    }

    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }

    @Override
    public String toString() {
        return "LoaiXe{" +
                "maLoai=" + maLoai +
                ", tenLoai='" + tenLoai + '\'' +
                '}';
    }
}

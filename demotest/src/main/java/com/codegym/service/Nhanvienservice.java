package com.codegym.service;

import com.codegym.dao.NhanvienDAO;
import com.codegym.model.Nhanvien;

import java.util.List;

public class Nhanvienservice {

    public static List<Nhanvien> showallNhanvien() {
        return NhanvienDAO.showallNhanvien();
    }
    public static boolean savenhanvien(Nhanvien nhanvien) {
       return NhanvienDAO.savenhanvien(nhanvien);
    }
public static Nhanvien findbyID(int id) {
      return   NhanvienDAO.findById(id);

}
    public static boolean editnhanvien(Nhanvien nhanvien) {
        return NhanvienDAO.editnhanvien(nhanvien);
    }
    public static void deletenhanvien(int id) {
        NhanvienDAO.delete(id);
    }
    public static List<Nhanvien> findbyname(String name) {
        return NhanvienDAO.findbyname(name);
    }
}

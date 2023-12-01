/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlysach;

import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class QuanLySach {

    ArrayList<Sach> list = new ArrayList<>();

    public QuanLySach() {
        list.add(new Sach("MS001", "TAY DU KY", "TIEU THUYET", "TG1", "200000", "20"));
        list.add(new Sach("MS002", "DPRAEMON", "TRUYEN", "TG2", "100000", "10"));
        list.add(new Sach("MS003", "THANH", "TRUYEN", "TG3", "100000", "30"));
        list.add(new Sach("MS004", "THAM LAM", "TRUYEN", "TG4", "100000", "50"));
        list.add(new Sach("MS005", "TU DUY", "TRUYEN", "TG5", "100000", "40"));

    }

    ArrayList<Sach> getList() {
        return list;
    }

    Boolean them(Sach sach) {
        list.add(sach);
        return true;
    }

//    Boolean xoa(int i) {
//        list.remove(i);
//        return true;
//    }
    Boolean sua(int i, Sach sach) {
        list.set(i, sach);
        return true;
    }

    ArrayList<Sach> timKiem(String ma) {
        ArrayList<Sach> listTimKiem = new ArrayList<>();
        for (Sach s : list) {
            if (s.getMaSach().startsWith(ma)) {
                listTimKiem.add(s);
            }
        }
        return listTimKiem;
    }

    ArrayList<Sach> sx() {
        Integer soLuong = 100;
        ArrayList<Sach> listSapXep = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            soLuong--;
            for (Sach s : list) {
                if (Integer.valueOf(s.getSoLuong()) == soLuong) {
                    listSapXep.add(s);
                }
            }
        }
        return listSapXep;
    }
}
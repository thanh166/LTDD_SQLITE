package com.example.quanlysinhvien.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbHelper extends SQLiteOpenHelper {
    public DbHelper(@Nullable Context context) {
        super(context, "QLSinhVien.sqlite",null, 1);

    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
            String sqlSVCreate ="CREATE TABLE IF NOT EXISTS " +
                    "SinhVien(MaSV INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    "HoTen VARCHAR(200), " +
                    "GioiTinh INTEGER, " +
                    "DienThoai VARCHAR(13), " +
                    "Email VARCHAR(200))";
        sqLiteDatabase.execSQL(sqlSVCreate);
        String sqlInsert1 ="INSERT INTO SinhVien(HoTen,GioiTinh,DienThoai,Email) VALUES('Võ Văn Thanh','0','2050531200333','vovanthanh@gmail.com')";
        String sqlInsert2 ="INSERT INTO SinhVien(HoTen,GioiTinh,DienThoai,Email) VALUES('Võ Văn Thanh2','0','2050531200334','vovanthanh2@gmail.com')";
        String sqlInsert3 ="INSERT INTO SinhVien(HoTen,GioiTinh,DienThoai,Email) VALUES('Võ Văn Thanh3','0','2050531200335','vovanthanh3@gmail.com')";
        sqLiteDatabase.execSQL(sqlInsert1);
        sqLiteDatabase.execSQL(sqlInsert2);
        sqLiteDatabase.execSQL(sqlInsert3);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}

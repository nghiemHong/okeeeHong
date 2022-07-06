package com.example.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class testSQLite extends SQLiteOpenHelper {
    public testSQLite( Context context) {
        super(context, "cong CV", null, 1);
    }
    // truy vấn k trả kết quả : create , insert, updata, delete...


    @Override
    public void onCreate(SQLiteDatabase db) {
        // tao bang
        String create_nhanvien = "create table CongViec(maNV varchar(20) primary key ,Name text(50))";
        db.execSQL(create_nhanvien);
    }

    public void them(Nhanvien nv1)
    {
        // them du lieu

        SQLiteDatabase data = getReadableDatabase();// lay dulieu
        ContentValues con1 = new ContentValues(); /*ghep cot . vi trong arraylist no
         se co ten va id khi vao  database no phai ghep cot ten voi ten, id voi id*/

        con1.put("MaNV",nv1.getId()); // ghep cot manv
        con1.put("Ten nhan vien", nv1.getName()); // ten voi ten
        data.insert("CongViec",null,con1); // them cac dlieu trong csdl,dung con1 de lay dlieu o nhanvien them vao

    }
    public List<Nhanvien> trave ()
    {
        List<Nhanvien> nv = new ArrayList<>();
        String Truy_van = "select * from CongViec";   // tao cau lenh truy van
        SQLiteDatabase db = getWritableDatabase();
        Cursor cursor = db.rawQuery()
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}

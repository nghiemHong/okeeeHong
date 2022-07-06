package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Nhanvien nv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        //tao dâtbase
        testSQLite test1 = new testSQLite(MainActivity.this);
        //dungf vongf lap de them du lieu , khi do id la khoa chinh no se bi lap luc nay mk se cong them thoi gian de nos k bi trung

        for ( int i = 0 ; i < 2 ; i++) {
             nv2 = new Nhanvien("h123" + System.currentTimeMillis(), "hong");
            test1.them(nv2);
        }



//        // tạo bảng
      // test1.data_0("CREATE TABLE IF NOT EXISTS hocsinh (Id INTEGER PRIMARY KEY AUTOINCREMENT,TenHocSinh VARCHAR(200)"); /// test1. <ten class k tra ket qua>
//        // THEM DATA VAO TABLE
//        test1.Data1("INSERT INTO NOIDUNG VALUES (null,'bai 1 : okeeeee')");
//        test1.Data1("INSERT INTO NOIDUNG VALUES (null,'bai 2 : ăn cơm')");
//
//        // hiển thị du liệu sd class trả về dư liệu
//        Cursor truyvan = test1.Data2("SELECT* FROM NOIDUNG");
//        // HIỂN thị ra toast   dùng while
//        while (truyvan.moveToNext())
//        {
//            String name = truyvan.getString(1);// getString là lấy cái id của nd ,
//
//            Toast.makeText(this,name, Toast.LENGTH_SHORT ).show();
//        }
    }
}
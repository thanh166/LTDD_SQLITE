package com.example.quanlysinhvien;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import com.example.quanlysinhvien.adapter.SinhVienAdapter;
import com.example.quanlysinhvien.dao.SinhVienDAO;
import com.example.quanlysinhvien.model.SinhVien;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView lvSinhVien;
    private List<SinhVien> sinhvienList;
    private SinhVienAdapter adapter;
    private SinhVienDAO svDAO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvSinhVien = (ListView) findViewById(R.id.lvsinhvien333);
        sinhvienList = new ArrayList<SinhVien>();
        svDAO = new SinhVienDAO(MainActivity.this);
        sinhvienList= svDAO.TatCaSinhVien();
        adapter = new SinhVienAdapter(getApplicationContext(),sinhvienList);
        lvSinhVien.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_option,menu);
        return true;
    }
    public boolean onOptionsItemSelected (MenuItem item ){
        int id = item.getItemId();
        if( id==R.id.menu_them){
            Intent intent = new Intent(MainActivity.this,AddActivity.class);
            startActivity(intent);
        }
        if ( id ==R.id.menu_thoat){
            finish();
        }
        return true;
    }
}
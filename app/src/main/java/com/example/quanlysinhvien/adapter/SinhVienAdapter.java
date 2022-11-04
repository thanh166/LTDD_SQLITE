package com.example.quanlysinhvien.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.quanlysinhvien.R;
import com.example.quanlysinhvien.model.SinhVien;

import java.util.List;

public class SinhVienAdapter extends BaseAdapter {
    private List<SinhVien> sinhVienList;
    private Context context;
    public SinhVienAdapter(Context context, List<SinhVien> listlist){
     this.context = context;
     this.sinhVienList =listlist;
    }
    @Override
    public int getCount() {
        return sinhVienList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHoder viewHoder;
        if(view== null){
            viewHoder = new ViewHoder();
            LayoutInflater inflater =(LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.view_item_sinhvien, null);
            viewHoder.tvMaSV = view.findViewById(R.id.tv_masv333);
            viewHoder.tvHoTen = view.findViewById(R.id.tv_hoten333);
            viewHoder.tvDienThoai = view.findViewById(R.id.tv_dienthoai333);
            viewHoder.tvEmail = view.findViewById(R.id.tv_email333);
            viewHoder.ivGioiTinh = view.findViewById(R.id.tvgioitinh333);
            view.setTag(viewHoder);
        }
        else {
            viewHoder =(ViewHoder) view.getTag();
        }
        SinhVien sv = sinhVienList.get(i);
        viewHoder.tvMaSV.setText("Mã SV: "+ sv.getMaSV());
        viewHoder.tvHoTen.setText("Họ Tên: "+ sv.getHoTen());
        viewHoder.tvDienThoai.setText("Điện Thoại: "+ sv.getDienThoai());
        viewHoder.tvEmail.setText("Email: "+ sv.getEmail());
        if(sv.getGioiTinh()==0){
        viewHoder.ivGioiTinh.setImageResource(R.drawable.face);}
        else {
            viewHoder.ivGioiTinh.setImageResource(R.drawable.face1);}
        return view;
    }
    class ViewHoder{
        ImageView ivGioiTinh;
        TextView tvMaSV,tvHoTen,tvDienThoai,tvEmail;
    }
}

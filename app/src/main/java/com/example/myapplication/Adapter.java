package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class Adapter extends BaseAdapter {
    List<Nhanvien> nv;
    TextView vtid, vtname;

    public Adapter(List<Nhanvien> nv) {
        this.nv = nv;
    }

    @Override
    public int getCount() {
        return nv.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.layfile,parent,false);
        vtid = convertView.findViewById(R.id.id);
        vtname = convertView.findViewById(R.id.name);

        Nhanvien nv2 = nv.get(position);
        vtid.setText(nv2.getId());
        vtname.setText(nv2.getName()); // lay ra ten vahien thi tren man hinh
        return convertView;
    }
}


package com.example.longdang.monhocdaicuong4.Activities;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.longdang.monhocdaicuong4.Adapter.SubjectAdapter;
import com.example.longdang.monhocdaicuong4.Model.MonHoc;
import com.example.longdang.monhocdaicuong4.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "com.example.longdang.monhocdaicuong4.MESSAGE";

    ListView lvMonHoc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //1. Khai bao va anh xa
        lvMonHoc = (ListView) findViewById(R.id.lv_MonHoc);

        //2. Tao mot ArrayList de chua thong tin cac mon hoc
        final ArrayList<MonHoc> arrMonHoc = new ArrayList<>();

        MonHoc giaiTich1 = new MonHoc(Color.BLUE,"GIẢI TÍCH 1","Ma HP: MI1110");
        MonHoc giaiTich2 = new MonHoc(Color.RED,"GIẢI TÍCH 2","Ma HP: MI1120");
        MonHoc giaiTich3 = new MonHoc(Color.BLUE,"GIẢI TÍCH 3","Ma HP: MI1130");
        MonHoc daiSo = new MonHoc(Color.RED,"ĐẠI SỐ","Ma HP: MI1140");
        MonHoc vatLy1 = new MonHoc(Color.BLUE,"VẬT LÝ 1","Ma HP: PH1110");
        MonHoc vatLy2 = new MonHoc(Color.RED,"VẬT LÝ 2","Ma HP: PH1120");
        MonHoc quanTriHocDC = new MonHoc(Color.BLUE,"QUẢN TRỊ HỌC ĐẠI CƯƠNG","Ma HP: EM1010");
        MonHoc tinHocDC = new MonHoc(Color.RED,"TIN HỌC ĐẠI CƯƠNG","Ma HP: IT1110");
        MonHoc hoaHocDC = new MonHoc(Color.BLUE,"HÓA HỌC ĐẠI CƯƠNG","Ma HP: CH1010");
        MonHoc doHoaKyThuaCB = new MonHoc(Color.RED,"ĐỒ HỌA KỸ THUẬT CƠ BẢN","Ma HP: ME2015");
        MonHoc nguyenLyCB1 = new MonHoc(Color.BLUE,"NLCB CN MAC - LENIN 1","Ma HP: SSH1110");
        MonHoc nguyenLyCB2 = new MonHoc(Color.RED,"NLCB CN MAC - LENIN 2 (KINH TE CHINH TRI)","Ma HP: SSH1120");
        MonHoc tuTuongHCM = new MonHoc(Color.BLUE,"TƯ TƯỞNG HỒ CHÍ MINH","Ma HP: SSH1050");
        MonHoc duongLoiCM = new MonHoc(Color.RED,"ĐƯỜNG LỐI CÁCH MẠNG ĐCSVN","Ma HP: SSH1130");
        MonHoc phapLuatDC = new MonHoc(Color.BLUE,"PHÁP LUẬT ĐẠI CƯƠNG","Ma HP: SSH1170");

        arrMonHoc.add(giaiTich1);
        arrMonHoc.add(giaiTich2);
        arrMonHoc.add(giaiTich3);
        arrMonHoc.add(daiSo);
        arrMonHoc.add(vatLy1);
        arrMonHoc.add(vatLy2);
        arrMonHoc.add(quanTriHocDC);
        arrMonHoc.add(tinHocDC);
        arrMonHoc.add(hoaHocDC);
        arrMonHoc.add(doHoaKyThuaCB);
        arrMonHoc.add(nguyenLyCB1);
        arrMonHoc.add(nguyenLyCB2);
        arrMonHoc.add(tuTuongHCM);
        arrMonHoc.add(duongLoiCM);
        arrMonHoc.add(phapLuatDC);

        SubjectAdapter subjectAdapter = new SubjectAdapter(this,R.layout.row_item_monhoc,arrMonHoc);
        lvMonHoc.setAdapter(subjectAdapter);

        lvMonHoc.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent2 = new Intent(MainActivity.this,DetailActivity.class);
                String message = "Chao mung ban den voi mon hoc "+arrMonHoc.get(position).getmName();
                intent2.putExtra(EXTRA_MESSAGE,message);
                startActivity(intent2);
            }
        });


    }
}

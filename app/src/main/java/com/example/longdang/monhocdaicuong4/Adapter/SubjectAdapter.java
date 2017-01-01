package com.example.longdang.monhocdaicuong4.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.longdang.monhocdaicuong4.Model.MonHoc;
import com.example.longdang.monhocdaicuong4.R;

import java.util.ArrayList;

import static android.content.ContentValues.TAG;

/**
 * Created by LONGDANG on 12/27/2016.
 */

public class SubjectAdapter extends ArrayAdapter<MonHoc> {

    private Context context;
    private int resource;
    private ArrayList<MonHoc> arrMonHoc;

    public SubjectAdapter(Context context, int resource, ArrayList<MonHoc> objects) {
        super(context, resource, objects);
        //1. tao ra thuoc tinh de luu du lieu truyen vao tu MainActivity
        this.context = context;
        this.resource = resource;
        this.arrMonHoc = objects;
    }
    //2. Tao mot lop ViewHolder de luu tru cac thanh phan view
    static class ViewHolder{
        TextView tvNumber;
        TextView tvName;
        TextView tvMaHP;
    }

    @NonNull
    @Override
    //3. Tao 1 getView de hien thi du lieu tai 1 vi tri xac dinh trong tap du lieu.
    public View getView(int position, View convertView, ViewGroup parent) {
        //4. Tao 1 doi tuong viewHolder co chua san cac thanh phan view trong class ViewHolder
        ViewHolder viewHolder;
        if (convertView==null){
            //5. Neu convertView = null thi tao ra 1 convertView (View) moi
            convertView = LayoutInflater.from(context).inflate(R.layout.row_item_monhoc,parent,false);
            //6. Dong thoi tao luon 1 viewHolder moi de chua convertView do
            viewHolder = new ViewHolder();
            //7. Anh xa tu root view vao view duoc khoi tao trong class ViewHolder de dua no vao viewHolder
            viewHolder.tvNumber = (TextView) convertView.findViewById(R.id.tv_number);
            viewHolder.tvName = (TextView) convertView.findViewById(R.id.tv_name);
            viewHolder.tvMaHP = (TextView)convertView.findViewById(R.id.tv_maHP);
            //8. Set nhan hieu (tag) cho cac thanh phan cua convertView trong viewHolder
            convertView.setTag(viewHolder);
            //9. In ra xem ket qua
            Log.d(TAG, "getView: "+(position+1));
        }
        else {
            //10. Neu convertView # null thi tai su dung tag da duoc tao trong class ViewHolder (the hien cua no la viewHolder)
            viewHolder = (ViewHolder)convertView.getTag();
        }

        //11. Tao 1 the hien cua class MonHoc va gan phan tu trong mang co vi tri [position] cho no
        MonHoc monHoc = arrMonHoc.get(position);
        //12. Set value cho cac thanh phan cua convertView nam trong viewHolder
        //13. View tvNumber duoc set mau nen co gia tri la (kieu int) monHoc.getmNumber
        viewHolder.tvNumber.setBackgroundColor(monHoc.getmNumber());
        //14. position se chay tu 0-> arrMonHoc.length-1;
        viewHolder.tvNumber.setText(""+(position+1));
        //15.
        viewHolder.tvName.setText(monHoc.getmName());
        viewHolder.tvMaHP.setText(monHoc.getmMaHP());

        return convertView;
    }
    //16. Cuoi cung la truyen du lieu tu MainActivity toi class SubjectAdapter nay
}

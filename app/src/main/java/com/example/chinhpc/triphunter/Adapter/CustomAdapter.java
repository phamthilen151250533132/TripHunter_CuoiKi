package com.example.chinhpc.triphunter.Adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.chinhpc.triphunter.Activity_Layout.trangchinh.ListDiaDanh;
import com.example.chinhpc.triphunter.R;

import java.util.List;

public class CustomAdapter extends BaseAdapter{

    private List<ListDiaDanh> listDiaDanhs;
    private  LayoutInflater layoutInflater;
    private Context context;

    public CustomAdapter(Context aContext,  List<ListDiaDanh> listDiaDanhs) {
        this.context = aContext;
        this.listDiaDanhs = listDiaDanhs;
        layoutInflater = LayoutInflater.from(aContext);
    }
    @Override
    public int getCount() {
        return listDiaDanhs.size();
    }

    @Override
    public Object getItem(int position) {
        return listDiaDanhs.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.layout_list_diadanh, null);
            holder = new ViewHolder();
            holder.flagView = (ImageView) convertView.findViewById(R.id.hinhdiadanh);
            holder.diadanhNameView = (TextView) convertView.findViewById(R.id.tendiadanh);
            holder.gioiThieuView = (TextView) convertView.findViewById(R.id.gioithieu);
           // holder.chiTietView = (TextView) convertView.findViewById(R.id.txtchiTiet);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        ListDiaDanh listDiaDanhs = this.listDiaDanhs.get(position);
        holder.diadanhNameView.setText(listDiaDanhs.getTenDiaDanh());
        holder.gioiThieuView.setText(listDiaDanhs.getGioiThieu());
        //holder.chiTietView.setText(listDiaDanhs.getChiTiet());

        int imageId = this.getMipmapResIdByName(listDiaDanhs.getFlagName());

        holder.flagView.setImageResource(imageId);

        return convertView;
    }

    private int getMipmapResIdByName(String hinhAnh) {
        String pkgName = context.getPackageName();
        // Trả về 0 nếu không tìm thấy.
        int resID = context.getResources().getIdentifier(hinhAnh, "mipmap", pkgName);
        Log.i("CustomListView", "Res Name: "+ hinhAnh+"==> Res ID = "+ resID);
        return resID;
    }

    static class ViewHolder {
        ImageView flagView;
        TextView diadanhNameView;
        TextView gioiThieuView;
       // TextView chiTietView;
    }
//    @NonNull
//    @Override
//    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//        View row = layoutInflater.inflate(resource, null);
//        TextView tendiadanh = row.findViewById(R.id.tendiadanh);
//        return super.getView(position, convertView, parent);
//
//    }
}
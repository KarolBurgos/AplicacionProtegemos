package com.example.co.com.revistaprotegemos.appprotegemos.werbserviceventajas.models;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.co.com.revistaprotegemos.appprotegemos.R;

import java.util.ArrayList;

/**
 * Created by ASPIRE VX15 on 13/04/2018.
 */

public class DataAdapterVentajas extends RecyclerView.Adapter<DataAdapterVentajas.ViewHolder>{

    private ArrayList<Ventajas> ventajas;
    private Context context;

    public DataAdapterVentajas(ArrayList<Ventajas> ventajas, Context context) {
        this.ventajas = ventajas;
        this.context = context;
    }


    @Override
    public DataAdapterVentajas.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_rowventajas, parent, false);
        return new DataAdapterVentajas.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.ti.setText(ventajas.get(position).getTitulo());
        holder.desc.setText(ventajas.get(position).getDescripcion());
    }

    public DataAdapterVentajas(Context context)
    {
        this.context=context;
        ventajas=new ArrayList<>();
    }

    @Override
    public int getItemCount() {
        return ventajas.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView ti,desc;
        private Typeface Ofaly,Color;
        TextView titu,des;

        public ViewHolder(View view) {
            super(view);
            ti = (TextView)view.findViewById(R.id.titulo1);
            desc = (TextView)view.findViewById(R.id.descripcion);


        }
    }
}

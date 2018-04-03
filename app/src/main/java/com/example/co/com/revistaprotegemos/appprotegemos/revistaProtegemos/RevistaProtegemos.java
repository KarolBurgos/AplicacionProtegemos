package com.example.co.com.revistaprotegemos.appprotegemos.revistaProtegemos;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.co.com.revistaprotegemos.appprotegemos.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class RevistaProtegemos extends Fragment {

    private Button b1,b2;
    private FragmentActivity myContext;
    public RevistaProtegemos() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context activity) {
        myContext=(FragmentActivity) activity;
        super.onAttach(activity);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_revista_protegemos, container, false);
        ImageView img = (ImageView)view.findViewById(R.id.imgre);
        String url="http://192.168.43.73/fotos/Edicion1.png";
        Glide.with(this)
                .load(url)
                .centerCrop()
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(img);

        ImageView img2 = (ImageView)view.findViewById(R.id.imgrevis);
        String url2="http://192.168.43.73/fotos/t1.png";
        Glide.with(this)
                .load(url2)
                .centerCrop()
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(img2);

    b1=(Button)view.findViewById(R.id.trbutton1);
    b2=(Button)view.findViewById(R.id.trbutton2);
    //b1=(Button)view.findViewById(R.id.trbutton2);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //  Log.e("fdgfdfgfgfgfh--->","SI");
                Fragment fragment = null;
                Class fragmentClass= EdicionesImpresas.class;
                try{
                    fragment = (Fragment) fragmentClass.newInstance();
                }catch (Exception e){
                    e.printStackTrace();
                }
                FragmentManager fragmentManager=myContext.getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.flContentt, fragment).commit();

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //  Log.e("fdgfdfgfgfgfh--->","SI");
                Fragment fragment = null;
                Class fragmentClass= EdicionesDigitalesFragment.class;
                try{
                    fragment = (Fragment) fragmentClass.newInstance();
                }catch (Exception e){
                    e.printStackTrace();
                }
                FragmentManager fragmentManager=myContext.getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.flContentt, fragment).commit();

            }
        });

/*        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //  Log.e("fdgfdfgfgfgfh--->","SI");

                AlertDialog.Builder uBuilder2 = new AlertDialog.Builder(RevistaProtegemos.super.getContext());
                View aView2 = getLayoutInflater().inflate(R.layout.fragment_ediciones_impresas, null);
                uBuilder2.setView(aView2);
                final AlertDialog dialog2 = uBuilder2.create();
                dialog2.show();
                Button close = (Button) aView2.findViewById(R.id.close);

                close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog2.cancel();
                    }
                });

            }
        });*/
    }
}

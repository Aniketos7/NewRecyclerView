package com.example.anicet.newrecyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ANICET on 21/03/2017.
 */

public class InfoAdapter extends RecyclerView.Adapter<InfoAdapter.InfoHolder>{

    private Context context;
    private ArrayList<info> sources;

    public InfoAdapter(Context context, ArrayList<info> sources) {
        this.context = context;
        this.sources = sources;
    }

    @Override
    public InfoHolder onCreateViewHolder(ViewGroup parent, int viewType) {

       View view = LayoutInflater.from(context).inflate(R.layout.info_layout, parent, false);

        return new InfoHolder(view);
    }

    @Override
    public void onBindViewHolder(InfoHolder holder, int position) {

     info source = sources.get(position);
        holder.nom.setText(source.getNom());
        holder.prenom.setText(source.getPrenom());
        holder.profession.setText(source.getProfession());

    }

    @Override
    public int getItemCount() {
        return sources.size();
    }


    class InfoHolder extends RecyclerView.ViewHolder{

     private TextView nom;
     private TextView prenom;
     private TextView profession;

        public InfoHolder(View itemView) {
            super(itemView);
            nom = (TextView) itemView.findViewById(R.id.nom);
            prenom = (TextView) itemView.findViewById(R.id.prenom);
            profession = (TextView) itemView.findViewById(R.id.profession);
        }
    }
}

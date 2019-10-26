package id.ac.polinema.recyclerviewsangatsederhana.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

import id.ac.polinema.recyclerviewsangatsederhana.R;
import id.ac.polinema.recyclerviewsangatsederhana.models.SuperHero;

public class SuperHeroAdapter extends RecyclerView.Adapter<SuperHeroAdapter.MyViewHolder>{
    List<SuperHero> heroList;

    public SuperHeroAdapter(List<SuperHero> heroList) {
        this.heroList = heroList;
    }

    @NonNull
    @Override
    public SuperHeroAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View superHeroView = layoutInflater.inflate(R.layout.grid_super_hero, parent, false);
        MyViewHolder viewHolder = new MyViewHolder(superHeroView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull SuperHeroAdapter.MyViewHolder holder, int position) {
        SuperHero hero = heroList.get(position);
        holder.heroName.setText(hero.getHeroName());
        Picasso.get()
                .load(hero.getHeroPhoto())
                .placeholder(R.drawable.ic_launcher_background)
                .centerCrop()
                .fit()
                .into(holder.heroPhoto);

    }

    @Override
    public int getItemCount() {
        return (heroList != null) ? heroList.size():0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        public ImageView heroPhoto;
        TextView heroName;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            heroPhoto = itemView.findViewById(R.id.heroPhoto);
            heroName = itemView.findViewById(R.id.heroName);
        }
    }
}
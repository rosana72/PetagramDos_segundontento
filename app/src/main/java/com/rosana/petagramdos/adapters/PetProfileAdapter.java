package com.rosana.petagramdos.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rosana.petagramdos.R;
import com.rosana.petagramdos.models.PetModel;

import java.util.List;

public class PetProfileAdapter extends RecyclerView.Adapter<PetProfileAdapter.PetViewHolder> {

    private List<PetModel> petModelList;

    public PetProfileAdapter(List<PetModel> petModelList) {
        this.petModelList = petModelList;
    }

    @NonNull
    @Override
    public PetViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_pet_profile, parent, false);
        return new PetViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PetViewHolder holder, int position) {
        final PetModel petModel = petModelList.get(position);
        holder.imagePet.setImageResource(petModel.getImage());
        holder.textTotalRating.setText(String.valueOf(petModel.getRating()));
    }

    @Override
    public int getItemCount() {
        //return petModelList.size();
        return 0;
    }

    public static class PetViewHolder extends RecyclerView.ViewHolder {

        private ImageView imagePet;
        private TextView textTotalRating;

        public PetViewHolder(@NonNull View itemView) {
            super(itemView);
            imagePet = itemView.findViewById(R.id.imagePet);
            textTotalRating = itemView.findViewById(R.id.textTotalRating);
        }
    }
}

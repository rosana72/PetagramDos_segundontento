package com.rosana.petagramdos.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.rosana.petagramdos.R;
import com.rosana.petagramdos.adapters.PetAdapter;
import com.rosana.petagramdos.models.PetModel;

import java.util.ArrayList;
import java.util.List;
public class PetFragment extends Fragment {

    private List<PetModel> petModelList;

    private RecyclerView recyclerPet;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_pet, container, false);

        recyclerPet = view.findViewById(R.id.recyclerPet);
        recyclerPet.setLayoutManager(new LinearLayoutManager(getContext()));

        generatePets();
        initPetAdapter();

        return view;
    }



    private void initPetAdapter() {
        PetAdapter petAdapter = new PetAdapter(petModelList);
        recyclerPet.setAdapter(petAdapter);
    }

    private void generatePets() {
        petModelList = new ArrayList<>();
        petModelList.add(new PetModel(R.drawable.sol, "Sol", 3, false));
        petModelList.add(new PetModel(R.drawable.peco, "Peco", 2, false));
        petModelList.add(new PetModel(R.drawable.thor, "Thor", 5, false));
        petModelList.add(new PetModel(R.drawable.jinjan, "Jinjan", 1, false));
        petModelList.add(new PetModel(R.drawable.thor, "Thor", 2, false));
        petModelList.add(new PetModel(R.drawable.nemo, "Nemo", 4, false));
    }
}

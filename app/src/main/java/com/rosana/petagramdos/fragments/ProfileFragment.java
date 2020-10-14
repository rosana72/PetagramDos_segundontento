package com.rosana.petagramdos.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.rosana.petagramdos.R;
import com.rosana.petagramdos.adapters.PetProfileAdapter;
import com.rosana.petagramdos.models.PetModel;

import java.util.List;

public class ProfileFragment extends Fragment {

    private List<PetModel> petModelList;

    private RecyclerView recyclerPetProfile;

    public ProfileFragment() {
    }

    public ProfileFragment(List<PetModel> petModelList) {
        this.petModelList = petModelList;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        recyclerPetProfile = view.findViewById(R.id.recyclerPetProfile);
        recyclerPetProfile.setLayoutManager(new GridLayoutManager(getContext(), 3));

        generatePets();
        initPetAdapter();

        return view;
    }

    private void generatePets() {
    }

    private void initPetAdapter() {
        PetProfileAdapter petProfileAdapter = new PetProfileAdapter(petModelList);
        recyclerPetProfile.setAdapter(petProfileAdapter);
    }

}


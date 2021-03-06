package com.example.quick_byte;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.example.quick_byte.Adapters.MainAdapter;
import com.example.quick_byte.Models.MainModel;
import com.example.quick_byte.databinding.ActivityMaggipointBinding;
import com.example.quick_byte.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class maggipoint extends AppCompatActivity {
        ActivityMaggipointBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMaggipointBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportActionBar().hide();
        ArrayList<MainModel> list= new ArrayList<>();
        list.add(new MainModel("~Double Masala Maggi","₹45"));
        list.add(new MainModel("~Butter Maggi","₹45"));
        list.add(new MainModel("~Cold Coffee","₹60"));
        list.add(new MainModel("~coffee","₹45"));
        MainAdapter adapter=new MainAdapter(list,this);
        binding.recycle.setAdapter(adapter);

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        binding.recycle.setLayoutManager(linearLayoutManager);

        
    }
}
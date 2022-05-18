package com.example.quick_byte;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.quick_byte.Adapters.MainAdapter;
import com.example.quick_byte.Models.MainModel;
import com.example.quick_byte.databinding.ActivityChaiokBinding;
import com.example.quick_byte.databinding.ActivityKathiBinding;

import java.util.ArrayList;

public class chaiok extends AppCompatActivity {
    ActivityChaiokBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chaiok);
        getSupportActionBar().hide();
        binding= ActivityChaiokBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();
        ArrayList<MainModel> list= new ArrayList<>();
        list.add(new MainModel("~Masala Maggi","₹45"));
        list.add(new MainModel("~Butter Maggi","₹55"));
        list.add(new MainModel("~Sandwich","₹60"));
        list.add(new MainModel("~lassi","₹30"));
        list.add(new MainModel("~coffee","₹45"));
        list.add(new MainModel("~Maggi","₹45"));
        MainAdapter adapter=new MainAdapter(list,this);
        binding.recycle.setAdapter(adapter);

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        binding.recycle.setLayoutManager(linearLayoutManager);
    }
}
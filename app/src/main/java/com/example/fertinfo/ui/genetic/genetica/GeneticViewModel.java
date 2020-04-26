package com.example.fertinfo.ui.genetic.genetica;

import android.content.Intent;
import android.view.View;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.fertinfo.AlteracionesCromosom;
import com.example.fertinfo.WebActivity;

import static androidx.core.content.ContextCompat.startActivity;

public class GeneticViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public GeneticViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("");
    }


    public LiveData<String> getText() {
        return mText;
    }
}
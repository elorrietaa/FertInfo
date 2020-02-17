package com.example.fertinfo.ui.genetic.genetica;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GeneticViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public GeneticViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is genetic fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
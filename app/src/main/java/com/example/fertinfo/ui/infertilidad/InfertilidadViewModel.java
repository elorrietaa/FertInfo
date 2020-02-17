package com.example.fertinfo.ui.infertilidad;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class InfertilidadViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public InfertilidadViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("...........");

    }

    public LiveData<String> getText() {
        return mText;
    }
}
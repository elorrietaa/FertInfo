package com.example.fertinfo.ui.Hormonas;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HormonasViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HormonasViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
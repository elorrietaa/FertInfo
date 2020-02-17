package com.example.fertinfo.ui.seminograma;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SeminogramaViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SeminogramaViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is seminograma fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
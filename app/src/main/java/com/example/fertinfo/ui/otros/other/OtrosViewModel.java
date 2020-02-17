package com.example.fertinfo.ui.otros.other;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class OtrosViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public OtrosViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is otros fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
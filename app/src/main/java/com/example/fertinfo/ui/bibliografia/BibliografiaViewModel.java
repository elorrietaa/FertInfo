package com.example.fertinfo.ui.bibliografia;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BibliografiaViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public BibliografiaViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
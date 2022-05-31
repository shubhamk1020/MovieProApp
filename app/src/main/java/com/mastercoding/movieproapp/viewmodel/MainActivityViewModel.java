package com.mastercoding.movieproapp.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.mastercoding.movieproapp.model.Movie;
import com.mastercoding.movieproapp.model.MovieRepository;

import java.util.List;

public class MainActivityViewModel  extends AndroidViewModel {

    private MovieRepository movieRepository;

    public MainActivityViewModel(@NonNull Application application) {
        super(application);
       movieRepository = new MovieRepository(application);
    }

    // Live Data

    public LiveData<List<Movie>> getAllMovie(){
        return movieRepository.getMutableLiveData();
    }
}

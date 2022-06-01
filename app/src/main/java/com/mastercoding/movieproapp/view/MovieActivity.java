package com.mastercoding.movieproapp.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;

import com.mastercoding.movieproapp.R;
import com.mastercoding.movieproapp.databinding.ActivityMovieBinding;
import com.mastercoding.movieproapp.model.Movie;

public class MovieActivity extends AppCompatActivity {
    private Movie movie;
    private ActivityMovieBinding activityMovieBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);

        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
       //  setSupportActionBar(toolbar);
      // getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        activityMovieBinding = DataBindingUtil.setContentView(
                this, R.layout.activity_movie);

        Intent i = getIntent();

        if(i != null){
            movie = getIntent().getParcelableExtra("movie");
            activityMovieBinding.setMovie(movie);
            getSupportActionBar().setTitle(movie.getTitle());
        }
    }
}
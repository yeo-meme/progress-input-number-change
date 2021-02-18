package com.nalazoocare.progresst;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import com.nalazoocare.progresst.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);


    }



    public void ClickHandler(View view) {
//        int value = Integer.parseInt(binding.text.getText().toString());
//        MyAsyncTask asyncTask = new MyAsyncTask(value, binding.text, binding.waterProgressbar);
//        asyncTask.execute();

        int  value = Integer.parseInt(binding.text.getText().toString());
        ProgressBarAnimation anim = new ProgressBarAnimation(binding.waterProgressbar, 100,value);
        binding.waterProgressbar.startAnimation(anim);
        anim.setDuration(1000);
//        Drawable draw = getApplicationContext().getResources().getDrawable(R.drawable.loading_img);

//        binding.waterProgressbar.setProgressDrawable(draw);

    }
}

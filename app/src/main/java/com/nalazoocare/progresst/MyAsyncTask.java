package com.nalazoocare.progresst;

import android.os.AsyncTask;
import android.widget.ProgressBar;
import android.widget.TextView;

/**
 * Created by nalazoo.yeomeme@gmail.com on 2020-08-18
 */
public class MyAsyncTask extends AsyncTask<Void, Integer, Boolean> {

    int value;
    TextView textView;
    ProgressBar progressBar;

    public MyAsyncTask(int value, TextView textView, ProgressBar progressBar) {
        this.textView = textView;
        this.progressBar = progressBar;
        this.value = value;
    }

    @Override
    protected Boolean doInBackground(Void... strings) {

        for (int  i=0; i<value; i++) {
            publishProgress(i);
        }
        return true;
    }


    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }


    @Override
    protected void onProgressUpdate(Integer... values) {
        progressBar.setProgress(values[0].intValue());
        textView.setText(values[0].toString());
        super.onProgressUpdate(values);
    }


    @Override
    protected void onCancelled(Boolean aBoolean) {
        super.onCancelled(aBoolean);
    }
}

package com.razu.info.view.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.razu.info.Apps;
import com.razu.info.R;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.tv_temp)
    TextView tvTemp;

    @Inject
    String temp;

    @Inject
    boolean wind;

    @Inject
    float speed;

    @Inject
    int sdafsfds;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        ((Apps) getApplication()).getAppsComponent().weatherInject(this);

        tvTemp.setText(temp + " " + wind + " " + speed + " " + sdafsfds);
    }
}
package com.razu.info;

import android.app.Application;

import com.razu.info.components.AppsComponent;
import com.razu.info.components.DaggerAppsComponent;
import com.razu.info.module.AppsModule;

public class Apps extends Application {

    private AppsComponent appsComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appsComponent = DaggerAppsComponent.builder().appsModule(new AppsModule()).build();
    }

    public AppsComponent getAppsComponent() {
        return appsComponent;
    }
}
package com.razu.info.module;

import dagger.Module;
import dagger.Provides;

@Module
public class AppsModule {

    public AppsModule() {

    }

    @Provides
    String getTemp() {
        return "30.33";
    }

    @Provides
    boolean getWind() {
        return true;
    }


    @Provides
    float getSpeed() {
        return 100f;
    }

    @Provides
    int getInt() {
        return 50;
    }
}
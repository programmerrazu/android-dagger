package com.razu.info.components;

import com.razu.info.module.AppsModule;
import com.razu.info.view.activity.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = AppsModule.class)
public interface AppsComponent {
    void weatherInject(MainActivity mainActivity);
}
package com.example.di.module

import com.anton.converterfeature.di.JobListFeatureFragmentBuildersModule
import com.anton.converterfeature.di.JobListFeatureViewModelModule
import com.example.ui.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module(
    includes = [
        JobListFeatureViewModelModule::class
    ]
)
abstract class MainActivityModule {

    @ContributesAndroidInjector(
        modules = [JobListFeatureFragmentBuildersModule::class]
    )

    abstract fun contributeMainActivity(): MainActivity

}
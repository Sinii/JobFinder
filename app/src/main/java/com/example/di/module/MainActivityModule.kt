package com.example.di.module

import com.anton.joblistfeature.di.JobListFeatureFragmentBuildersModule
import com.anton.joblistfeature.di.JobListFeatureViewModelModule
import com.example.jobdescriptionfeature.di.JobDescriptionFeatureFragmentBuildersModule
import com.example.jobdescriptionfeature.di.JobDescriptionFeatureViewModelModule
import com.example.ui.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module(
    includes = [
        JobListFeatureViewModelModule::class,
        JobDescriptionFeatureViewModelModule::class
    ]
)
abstract class MainActivityModule {

    @ContributesAndroidInjector(
        modules = [
            JobListFeatureFragmentBuildersModule::class,
            JobDescriptionFeatureFragmentBuildersModule::class
        ]
    )

    abstract fun contributeMainActivity(): MainActivity

}
package com.anton.converterfeature.di


import com.anton.converterfeature.ui.JobListFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class JobListFeatureFragmentBuildersModule {

    @ContributesAndroidInjector
    abstract fun contributeJobListFragment(): JobListFragment

    //Add more Fragments here

}

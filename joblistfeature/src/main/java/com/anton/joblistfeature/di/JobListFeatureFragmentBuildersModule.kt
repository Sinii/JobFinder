package com.anton.joblistfeature.di


import com.anton.joblistfeature.ui.JobListFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class JobListFeatureFragmentBuildersModule {

    @ContributesAndroidInjector
    abstract fun contributeJobListFragment(): JobListFragment

    //Add more Fragments here

}

package com.example.jobdescriptionfeature.di


import com.example.jobdescriptionfeature.ui.JobDescriptionFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class JobDescriptionFeatureFragmentBuildersModule {

    @ContributesAndroidInjector
    abstract fun contributeJobDescriptionFragment(): JobDescriptionFragment

    //Add more Fragments here

}

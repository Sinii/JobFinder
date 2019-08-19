package com.example.jobdescriptionfeature.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.base.di.ViewModelFactory
import com.example.base.di.ViewModelKey
import com.example.jobdescriptionfeature.ui.JobDescriptionViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class JobDescriptionFeatureViewModelModule {

    @Binds
    internal abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(JobDescriptionViewModel::class)
    internal abstract fun bindJobDescriptionViewModel(viewModel: JobDescriptionViewModel): ViewModel

    //Add more ViewModels here
}
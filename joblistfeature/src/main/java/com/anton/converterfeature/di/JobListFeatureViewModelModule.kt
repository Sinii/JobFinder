package com.anton.converterfeature.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.anton.converterfeature.ui.JobListViewModel
import com.example.base.di.ViewModelFactory
import com.example.base.di.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class JobListFeatureViewModelModule {

    @Binds
    internal abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(JobListViewModel::class)
    internal abstract fun bindJobListViewModel(viewModel: JobListViewModel): ViewModel

    //Add more ViewModels here
}
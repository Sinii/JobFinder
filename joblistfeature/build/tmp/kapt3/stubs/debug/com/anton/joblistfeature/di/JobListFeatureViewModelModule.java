package com.anton.joblistfeature.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H!\u00a2\u0006\u0002\b\u0007J\u0015\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH!\u00a2\u0006\u0002\b\f\u00a8\u0006\r"}, d2 = {"Lcom/anton/joblistfeature/di/JobListFeatureViewModelModule;", "", "()V", "bindJobListViewModel", "Landroidx/lifecycle/ViewModel;", "viewModel", "Lcom/anton/joblistfeature/ui/JobListViewModel;", "bindJobListViewModel$joblistfeature_debug", "bindViewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factory", "Lcom/example/base/di/ViewModelFactory;", "bindViewModelFactory$joblistfeature_debug", "joblistfeature_debug"})
@dagger.Module()
public abstract class JobListFeatureViewModelModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModelProvider.Factory bindViewModelFactory$joblistfeature_debug(@org.jetbrains.annotations.NotNull()
    com.example.base.di.ViewModelFactory factory);
    
    @org.jetbrains.annotations.NotNull()
    @com.example.base.di.ViewModelKey(value = com.anton.joblistfeature.ui.JobListViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindJobListViewModel$joblistfeature_debug(@org.jetbrains.annotations.NotNull()
    com.anton.joblistfeature.ui.JobListViewModel viewModel);
    
    public JobListFeatureViewModelModule() {
        super();
    }
}
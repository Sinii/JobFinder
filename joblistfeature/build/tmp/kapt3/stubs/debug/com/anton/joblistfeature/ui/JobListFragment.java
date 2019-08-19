package com.anton.joblistfeature.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0018B\u0005\u00a2\u0006\u0002\u0010\u0004J$\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u001e\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f\u0012\u0004\u0012\u00020\u00100\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0000H\u0016J\u0017\u0010\u0014\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00160\u0015H\u0016\u00a2\u0006\u0002\u0010\u0017R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/anton/joblistfeature/ui/JobListFragment;", "Lcom/example/base/ui/BaseFragment;", "Lcom/anton/joblistfeature/databinding/FragmentJobListBinding;", "Lcom/example/base/di/ViewModelFactory;", "()V", "skeletonScreen", "Lcom/ethanhua/skeleton/RecyclerViewSkeletonScreen;", "busEvents", "", "command", "Lcom/example/base/viewmodel/ViewModelCommands;", "viewModelList", "", "binding", "provideActionsBinding", "Lkotlin/Function2;", "", "provideLayout", "", "provideLifecycleOwner", "provideListOfViewModels", "", "Ljava/lang/Class;", "()[Ljava/lang/Class;", "Companion", "joblistfeature_debug"})
public final class JobListFragment extends com.example.base.ui.BaseFragment<com.anton.joblistfeature.databinding.FragmentJobListBinding, com.example.base.di.ViewModelFactory> {
    private com.ethanhua.skeleton.RecyclerViewSkeletonScreen skeletonScreen;
    public static final int STUB_ITEMS_COUNT = 15;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SHARED_COPANY_LOGO_VIEW_KEY = "company_image_transition";
    public static final com.anton.joblistfeature.ui.JobListFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.Class<?>[] provideListOfViewModels() {
        return null;
    }
    
    @java.lang.Override()
    public boolean busEvents(@org.jetbrains.annotations.NotNull()
    com.example.base.viewmodel.ViewModelCommands command, @org.jetbrains.annotations.NotNull()
    java.util.Set<?> viewModelList, @org.jetbrains.annotations.NotNull()
    com.anton.joblistfeature.databinding.FragmentJobListBinding binding) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.jvm.functions.Function2<com.anton.joblistfeature.databinding.FragmentJobListBinding, java.util.Set<?>, kotlin.Unit> provideActionsBinding() {
        return null;
    }
    
    @java.lang.Override()
    public int provideLayout() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.anton.joblistfeature.ui.JobListFragment provideLifecycleOwner() {
        return null;
    }
    
    public JobListFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/anton/joblistfeature/ui/JobListFragment$Companion;", "", "()V", "SHARED_COPANY_LOGO_VIEW_KEY", "", "STUB_ITEMS_COUNT", "", "joblistfeature_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
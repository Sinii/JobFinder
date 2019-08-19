package com.anton.joblistfeature.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0014\u001a\u00020\fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001f\u0010\r\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u000e0\u000e0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lcom/anton/joblistfeature/ui/JobListViewModel;", "Lcom/example/base/viewmodel/BaseViewModel;", "getJobItemsUseCase", "Lcom/example/usecase/job/GetJobItemsUseCase;", "(Lcom/example/usecase/job/GetJobItemsUseCase;)V", "jobsList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/jobs/JobItem;", "getJobsList", "()Landroidx/lifecycle/MutableLiveData;", "requestJob", "Lkotlinx/coroutines/Job;", "showNoItemsStub", "", "kotlin.jvm.PlatformType", "getShowNoItemsStub", "doAutoMainWork", "", "restoreViewModel", "updateItemsJob", "joblistfeature_debug"})
public final class JobListViewModel extends com.example.base.viewmodel.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.jobs.JobItem>> jobsList = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> showNoItemsStub = null;
    private kotlinx.coroutines.Job requestJob;
    private final com.example.usecase.job.GetJobItemsUseCase getJobItemsUseCase = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.example.jobs.JobItem>> getJobsList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getShowNoItemsStub() {
        return null;
    }
    
    @java.lang.Override()
    public void restoreViewModel() {
    }
    
    @java.lang.Override()
    public void doAutoMainWork() {
    }
    
    private final kotlinx.coroutines.Job updateItemsJob() {
        return null;
    }
    
    @javax.inject.Inject()
    public JobListViewModel(@org.jetbrains.annotations.NotNull()
    com.example.usecase.job.GetJobItemsUseCase getJobItemsUseCase) {
        super();
    }
}
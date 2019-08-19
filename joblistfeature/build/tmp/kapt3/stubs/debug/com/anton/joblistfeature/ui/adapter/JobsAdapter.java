package com.anton.joblistfeature.ui.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B%\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000eH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/anton/joblistfeature/ui/adapter/JobsAdapter;", "Lcom/example/base/adapters/BaseAdapter;", "Lcom/anton/joblistfeature/ui/adapter/JobViewHolder;", "Lcom/example/jobs/JobItem;", "rateList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "listener", "Lcom/example/interfaces/JobItemClickListener;", "(Ljava/util/ArrayList;Lcom/example/interfaces/JobItemClickListener;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "joblistfeature_debug"})
public final class JobsAdapter extends com.example.base.adapters.BaseAdapter<com.anton.joblistfeature.ui.adapter.JobViewHolder, com.example.jobs.JobItem> {
    private final com.example.interfaces.JobItemClickListener listener = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.anton.joblistfeature.ui.adapter.JobViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.anton.joblistfeature.ui.adapter.JobViewHolder holder, int position) {
    }
    
    public JobsAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.jobs.JobItem> rateList, @org.jetbrains.annotations.NotNull()
    com.example.interfaces.JobItemClickListener listener) {
        super(null);
    }
}
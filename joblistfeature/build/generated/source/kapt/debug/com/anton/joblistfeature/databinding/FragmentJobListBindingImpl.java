package com.anton.joblistfeature.databinding;
import com.anton.joblistfeature.R;
import com.anton.joblistfeature.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentJobListBindingImpl extends FragmentJobListBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.jobsRecyclerView, 2);
    }
    // views
    @NonNull
    private final androidx.appcompat.widget.AppCompatTextView mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentJobListBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private FragmentJobListBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.LinearLayoutCompat) bindings[0]
            , (androidx.recyclerview.widget.RecyclerView) bindings[2]
            );
        this.constraintLayout.setTag(null);
        this.mboundView1 = (androidx.appcompat.widget.AppCompatTextView) bindings[1];
        this.mboundView1.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.ratesViewModel == variableId) {
            setRatesViewModel((com.anton.joblistfeature.ui.JobListViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setRatesViewModel(@Nullable com.anton.joblistfeature.ui.JobListViewModel RatesViewModel) {
        this.mRatesViewModel = RatesViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.ratesViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeRatesViewModelShowNoItemsStub((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeRatesViewModelShowNoItemsStub(androidx.lifecycle.MutableLiveData<java.lang.Integer> RatesViewModelShowNoItemsStub, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.anton.joblistfeature.ui.JobListViewModel ratesViewModel = mRatesViewModel;
        int androidxDatabindingViewDataBindingSafeUnboxRatesViewModelShowNoItemsStubGetValue = 0;
        java.lang.Integer ratesViewModelShowNoItemsStubGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> ratesViewModelShowNoItemsStub = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (ratesViewModel != null) {
                    // read ratesViewModel.showNoItemsStub
                    ratesViewModelShowNoItemsStub = ratesViewModel.getShowNoItemsStub();
                }
                updateLiveDataRegistration(0, ratesViewModelShowNoItemsStub);


                if (ratesViewModelShowNoItemsStub != null) {
                    // read ratesViewModel.showNoItemsStub.getValue()
                    ratesViewModelShowNoItemsStubGetValue = ratesViewModelShowNoItemsStub.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(ratesViewModel.showNoItemsStub.getValue())
                androidxDatabindingViewDataBindingSafeUnboxRatesViewModelShowNoItemsStubGetValue = androidx.databinding.ViewDataBinding.safeUnbox(ratesViewModelShowNoItemsStubGetValue);
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            this.mboundView1.setVisibility(androidxDatabindingViewDataBindingSafeUnboxRatesViewModelShowNoItemsStubGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): ratesViewModel.showNoItemsStub
        flag 1 (0x2L): ratesViewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}
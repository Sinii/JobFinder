package com.anton.joblistfeature;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.anton.joblistfeature.databinding.FragmentJobListBindingImpl;
import com.anton.joblistfeature.databinding.ItemJobBindingImpl;
import com.anton.joblistfeature.databinding.ItemJobSkeletonBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_FRAGMENTJOBLIST = 1;

  private static final int LAYOUT_ITEMJOB = 2;

  private static final int LAYOUT_ITEMJOBSKELETON = 3;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(3);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.anton.joblistfeature.R.layout.fragment_job_list, LAYOUT_FRAGMENTJOBLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.anton.joblistfeature.R.layout.item_job, LAYOUT_ITEMJOB);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.anton.joblistfeature.R.layout.item_job_skeleton, LAYOUT_ITEMJOBSKELETON);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_FRAGMENTJOBLIST: {
          if ("layout/fragment_job_list_0".equals(tag)) {
            return new FragmentJobListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_job_list is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMJOB: {
          if ("layout/item_job_0".equals(tag)) {
            return new ItemJobBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_job is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMJOBSKELETON: {
          if ("layout/item_job_skeleton_0".equals(tag)) {
            return new ItemJobSkeletonBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_job_skeleton is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(4);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    result.add(new com.example.base.DataBinderMapperImpl());
    result.add(new com.example.jobdescriptionfeature.DataBinderMapperImpl());
    result.add(new com.example.utils.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(3);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "ratesViewModel");
      sKeys.put(2, "vm");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(3);

    static {
      sKeys.put("layout/fragment_job_list_0", com.anton.joblistfeature.R.layout.fragment_job_list);
      sKeys.put("layout/item_job_0", com.anton.joblistfeature.R.layout.item_job);
      sKeys.put("layout/item_job_skeleton_0", com.anton.joblistfeature.R.layout.item_job_skeleton);
    }
  }
}

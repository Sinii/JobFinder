package com.anton.joblistfeature.di;

import com.anton.joblistfeature.ui.JobListFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      JobListFeatureFragmentBuildersModule_ContributeJobListFragment.JobListFragmentSubcomponent
          .class
)
public abstract class JobListFeatureFragmentBuildersModule_ContributeJobListFragment {
  private JobListFeatureFragmentBuildersModule_ContributeJobListFragment() {}

  @Binds
  @IntoMap
  @ClassKey(JobListFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      JobListFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface JobListFragmentSubcomponent extends AndroidInjector<JobListFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<JobListFragment> {}
  }
}

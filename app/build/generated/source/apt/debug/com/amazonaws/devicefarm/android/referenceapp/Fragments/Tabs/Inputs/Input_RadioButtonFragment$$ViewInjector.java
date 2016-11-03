// Generated code from Butter Knife. Do not modify!
package com.amazonaws.devicefarm.android.referenceapp.Fragments.Tabs.Inputs;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class Input_RadioButtonFragment$$ViewInjector<T extends com.amazonaws.devicefarm.android.referenceapp.Fragments.Tabs.Inputs.Input_RadioButtonFragment> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624063, "field 'radioGroup'");
    target.radioGroup = finder.castView(view, 2131624063, "field 'radioGroup'");
    view = finder.findRequiredView(source, 2131624067, "field 'radioButtonDisplay'");
    target.radioButtonDisplay = finder.castView(view, 2131624067, "field 'radioButtonDisplay'");
  }

  @Override public void reset(T target) {
    target.radioGroup = null;
    target.radioButtonDisplay = null;
  }
}

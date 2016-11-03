// Generated code from Butter Knife. Do not modify!
package com.amazonaws.devicefarm.android.referenceapp.Fragments.Tabs.Inputs;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class Input_CheckBoxFragment$$ViewInjector<T extends com.amazonaws.devicefarm.android.referenceapp.Fragments.Tabs.Inputs.Input_CheckBoxFragment> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624056, "field 'checkbox_display'");
    target.checkbox_display = finder.castView(view, 2131624056, "field 'checkbox_display'");
    view = finder.findRequiredView(source, 2131624055, "field 'checkBox'");
    target.checkBox = finder.castView(view, 2131624055, "field 'checkBox'");
  }

  @Override public void reset(T target) {
    target.checkbox_display = null;
    target.checkBox = null;
  }
}

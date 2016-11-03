// Generated code from Butter Knife. Do not modify!
package com.amazonaws.devicefarm.android.referenceapp.Fragments.Tabs.Inputs;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class Input_DatePickerFragment$$ViewInjector<T extends com.amazonaws.devicefarm.android.referenceapp.Fragments.Tabs.Inputs.Input_DatePickerFragment> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624057, "field 'datePicker'");
    target.datePicker = finder.castView(view, 2131624057, "field 'datePicker'");
    view = finder.findRequiredView(source, 2131624058, "field 'timeDisplay'");
    target.timeDisplay = finder.castView(view, 2131624058, "field 'timeDisplay'");
  }

  @Override public void reset(T target) {
    target.datePicker = null;
    target.timeDisplay = null;
  }
}

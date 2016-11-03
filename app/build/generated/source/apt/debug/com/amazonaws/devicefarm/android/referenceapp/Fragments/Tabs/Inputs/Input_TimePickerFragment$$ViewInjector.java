// Generated code from Butter Knife. Do not modify!
package com.amazonaws.devicefarm.android.referenceapp.Fragments.Tabs.Inputs;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class Input_TimePickerFragment$$ViewInjector<T extends com.amazonaws.devicefarm.android.referenceapp.Fragments.Tabs.Inputs.Input_TimePickerFragment> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624075, "field 'timePicker'");
    target.timePicker = finder.castView(view, 2131624075, "field 'timePicker'");
    view = finder.findRequiredView(source, 2131624076, "field 'timeDisplay'");
    target.timeDisplay = finder.castView(view, 2131624076, "field 'timeDisplay'");
  }

  @Override public void reset(T target) {
    target.timePicker = null;
    target.timeDisplay = null;
  }
}

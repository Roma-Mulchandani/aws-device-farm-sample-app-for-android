// Generated code from Butter Knife. Do not modify!
package com.amazonaws.devicefarm.android.referenceapp.Fragments.Tabs.Inputs;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class Input_Toggle_ButtonFragment$$ViewInjector<T extends com.amazonaws.devicefarm.android.referenceapp.Fragments.Tabs.Inputs.Input_Toggle_ButtonFragment> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624079, "field 'switchDisplay'");
    target.switchDisplay = view;
    view = finder.findRequiredView(source, 2131624078, "method 'onToggleClicked'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onToggleClicked(p0);
        }
      });
  }

  @Override public void reset(T target) {
    target.switchDisplay = null;
  }
}

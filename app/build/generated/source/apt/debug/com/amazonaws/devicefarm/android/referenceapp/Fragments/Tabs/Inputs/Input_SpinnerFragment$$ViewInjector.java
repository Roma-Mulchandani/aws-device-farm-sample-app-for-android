// Generated code from Butter Knife. Do not modify!
package com.amazonaws.devicefarm.android.referenceapp.Fragments.Tabs.Inputs;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class Input_SpinnerFragment$$ViewInjector<T extends com.amazonaws.devicefarm.android.referenceapp.Fragments.Tabs.Inputs.Input_SpinnerFragment> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624072, "field 'spinner'");
    target.spinner = finder.castView(view, 2131624072, "field 'spinner'");
    view = finder.findRequiredView(source, 2131624071, "field 'textView'");
    target.textView = finder.castView(view, 2131624071, "field 'textView'");
  }

  @Override public void reset(T target) {
    target.spinner = null;
    target.textView = null;
  }
}

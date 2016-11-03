// Generated code from Butter Knife. Do not modify!
package com.amazonaws.devicefarm.android.referenceapp.Fragments.Tabs.Inputs;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class Input_RefreshButtonFragment$$ViewInjector<T extends com.amazonaws.devicefarm.android.referenceapp.Fragments.Tabs.Inputs.Input_RefreshButtonFragment> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624068, "field 'swipeRefreshLayout'");
    target.swipeRefreshLayout = finder.castView(view, 2131624068, "field 'swipeRefreshLayout'");
    view = finder.findRequiredView(source, 2131624070, "field 'textView'");
    target.textView = finder.castView(view, 2131624070, "field 'textView'");
  }

  @Override public void reset(T target) {
    target.swipeRefreshLayout = null;
    target.textView = null;
  }
}

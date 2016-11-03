// Generated code from Butter Knife. Do not modify!
package com.amazonaws.devicefarm.android.referenceapp.Fragments;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class TabFragmentContainer$$ViewInjector<T extends com.amazonaws.devicefarm.android.referenceapp.Fragments.TabFragmentContainer> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624105, "field 'pager'");
    target.pager = finder.castView(view, 2131624105, "field 'pager'");
  }

  @Override public void reset(T target) {
    target.pager = null;
  }
}

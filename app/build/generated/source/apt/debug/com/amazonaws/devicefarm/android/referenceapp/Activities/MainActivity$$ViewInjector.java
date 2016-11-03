// Generated code from Butter Knife. Do not modify!
package com.amazonaws.devicefarm.android.referenceapp.Activities;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class MainActivity$$ViewInjector<T extends com.amazonaws.devicefarm.android.referenceapp.Activities.MainActivity> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624023, "field 'toolbar'");
    target.toolbar = finder.castView(view, 2131624023, "field 'toolbar'");
    view = finder.findRequiredView(source, 2131624107, "field 'toolbarTitle'");
    target.toolbarTitle = finder.castView(view, 2131624107, "field 'toolbarTitle'");
    view = finder.findRequiredView(source, 2131624021, "field 'drawerLayout'");
    target.drawerLayout = finder.castView(view, 2131624021, "field 'drawerLayout'");
  }

  @Override public void reset(T target) {
    target.toolbar = null;
    target.toolbarTitle = null;
    target.drawerLayout = null;
  }
}

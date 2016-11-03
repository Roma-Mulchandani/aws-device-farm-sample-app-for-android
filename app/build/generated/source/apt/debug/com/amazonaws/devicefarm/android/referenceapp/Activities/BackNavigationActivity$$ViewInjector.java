// Generated code from Butter Knife. Do not modify!
package com.amazonaws.devicefarm.android.referenceapp.Activities;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class BackNavigationActivity$$ViewInjector<T extends com.amazonaws.devicefarm.android.referenceapp.Activities.BackNavigationActivity> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624023, "field 'toolbar'");
    target.toolbar = finder.castView(view, 2131624023, "field 'toolbar'");
    view = finder.findRequiredView(source, 2131624026, "field 'counter'");
    target.counter = finder.castView(view, 2131624026, "field 'counter'");
    view = finder.findRequiredView(source, 2131624107, "field 'toolbarTitle'");
    target.toolbarTitle = finder.castView(view, 2131624107, "field 'toolbarTitle'");
    view = finder.findRequiredView(source, 2131624027, "method 'nextButtonOnClick'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.nextButtonOnClick();
        }
      });
  }

  @Override public void reset(T target) {
    target.toolbar = null;
    target.counter = null;
    target.toolbarTitle = null;
  }
}

// Generated code from Butter Knife. Do not modify!
package com.amazonaws.devicefarm.android.referenceapp.Fragments;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class NestedFragment$$ViewInjector<T extends com.amazonaws.devicefarm.android.referenceapp.Fragments.NestedFragment> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624089, "method 'backButtonOnClick'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.backButtonOnClick();
        }
      });
    view = finder.findRequiredView(source, 2131624088, "method 'upButtonOnClick'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.upButtonOnClick();
        }
      });
  }

  @Override public void reset(T target) {
  }
}

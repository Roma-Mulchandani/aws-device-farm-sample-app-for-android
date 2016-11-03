// Generated code from Butter Knife. Do not modify!
package com.amazonaws.devicefarm.android.referenceapp.Fragments;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class NotificationsFragment$$ViewInjector<T extends com.amazonaws.devicefarm.android.referenceapp.Fragments.NotificationsFragment> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624103, "method 'onToastButtonClick'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onToastButtonClick();
        }
      });
    view = finder.findRequiredView(source, 2131624104, "method 'onAlertButton'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onAlertButton();
        }
      });
  }

  @Override public void reset(T target) {
  }
}

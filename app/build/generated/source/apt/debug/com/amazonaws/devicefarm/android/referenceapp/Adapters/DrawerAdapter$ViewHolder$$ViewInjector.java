// Generated code from Butter Knife. Do not modify!
package com.amazonaws.devicefarm.android.referenceapp.Adapters;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class DrawerAdapter$ViewHolder$$ViewInjector<T extends com.amazonaws.devicefarm.android.referenceapp.Adapters.DrawerAdapter.ViewHolder> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624030, "field 'rowImage'");
    target.rowImage = finder.castView(view, 2131624030, "field 'rowImage'");
    view = finder.findRequiredView(source, 2131624031, "field 'rowTitle'");
    target.rowTitle = finder.castView(view, 2131624031, "field 'rowTitle'");
  }

  @Override public void reset(T target) {
    target.rowImage = null;
    target.rowTitle = null;
  }
}

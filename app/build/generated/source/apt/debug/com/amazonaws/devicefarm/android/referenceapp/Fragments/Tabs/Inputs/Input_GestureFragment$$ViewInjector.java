// Generated code from Butter Knife. Do not modify!
package com.amazonaws.devicefarm.android.referenceapp.Fragments.Tabs.Inputs;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class Input_GestureFragment$$ViewInjector<T extends com.amazonaws.devicefarm.android.referenceapp.Fragments.Tabs.Inputs.Input_GestureFragment> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624062, "field 'actionPad'");
    target.actionPad = finder.castView(view, 2131624062, "field 'actionPad'");
    view = finder.findRequiredView(source, 2131624061, "field 'gestureContent'");
    target.gestureContent = finder.castView(view, 2131624061, "field 'gestureContent'");
  }

  @Override public void reset(T target) {
    target.actionPad = null;
    target.gestureContent = null;
  }
}

// Generated code from Butter Knife. Do not modify!
package com.amazonaws.devicefarm.android.referenceapp.Fragments.Tabs.Native;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class Native_CameraFragment$$ViewInjector<T extends com.amazonaws.devicefarm.android.referenceapp.Fragments.Tabs.Native.Native_CameraFragment> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624080, "field 'surfaceView'");
    target.surfaceView = finder.castView(view, 2131624080, "field 'surfaceView'");
  }

  @Override public void reset(T target) {
    target.surfaceView = null;
  }
}

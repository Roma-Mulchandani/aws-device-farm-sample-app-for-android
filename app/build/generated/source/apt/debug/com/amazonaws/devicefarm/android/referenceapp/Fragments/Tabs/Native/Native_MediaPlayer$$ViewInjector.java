// Generated code from Butter Knife. Do not modify!
package com.amazonaws.devicefarm.android.referenceapp.Fragments.Tabs.Native;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class Native_MediaPlayer$$ViewInjector<T extends com.amazonaws.devicefarm.android.referenceapp.Fragments.Tabs.Native.Native_MediaPlayer> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624083, "field 'videoView'");
    target.videoView = finder.castView(view, 2131624083, "field 'videoView'");
  }

  @Override public void reset(T target) {
    target.videoView = null;
  }
}

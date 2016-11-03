// Generated code from Butter Knife. Do not modify!
package com.amazonaws.devicefarm.android.referenceapp.Fragments;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class LocalWebView$$ViewInjector<T extends com.amazonaws.devicefarm.android.referenceapp.Fragments.LocalWebView> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624109, "field 'websiteInput'");
    target.websiteInput = finder.castView(view, 2131624109, "field 'websiteInput'");
    view = finder.findRequiredView(source, 2131624110, "field 'webView'");
    target.webView = finder.castView(view, 2131624110, "field 'webView'");
  }

  @Override public void reset(T target) {
    target.websiteInput = null;
    target.webView = null;
  }
}

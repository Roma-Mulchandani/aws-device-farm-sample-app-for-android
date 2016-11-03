// Generated code from Butter Knife. Do not modify!
package com.amazonaws.devicefarm.android.referenceapp.Fragments;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class WebViewFragment$$ViewInjector<T extends com.amazonaws.devicefarm.android.referenceapp.Fragments.WebViewFragment> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624109, "field 'websiteInput' and method 'onEditorAction'");
    target.websiteInput = finder.castView(view, 2131624109, "field 'websiteInput'");
    ((android.widget.TextView) view).setOnEditorActionListener(
      new android.widget.TextView.OnEditorActionListener() {
        @Override public boolean onEditorAction(
          android.widget.TextView p0,
          int p1,
          android.view.KeyEvent p2
        ) {
          return target.onEditorAction(p0, p1);
        }
      });
    view = finder.findRequiredView(source, 2131624110, "field 'webView'");
    target.webView = finder.castView(view, 2131624110, "field 'webView'");
  }

  @Override public void reset(T target) {
    target.websiteInput = null;
    target.webView = null;
  }
}

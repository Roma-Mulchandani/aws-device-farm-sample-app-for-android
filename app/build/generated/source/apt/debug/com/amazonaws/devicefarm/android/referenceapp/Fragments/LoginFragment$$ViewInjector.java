// Generated code from Butter Knife. Do not modify!
package com.amazonaws.devicefarm.android.referenceapp.Fragments;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class LoginFragment$$ViewInjector<T extends com.amazonaws.devicefarm.android.referenceapp.Fragments.LoginFragment> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624046, "field 'mainView'");
    target.mainView = view;
    view = finder.findRequiredView(source, 2131624050, "field 'altView'");
    target.altView = view;
    view = finder.findRequiredView(source, 2131624047, "field 'usernameInput'");
    target.usernameInput = finder.castView(view, 2131624047, "field 'usernameInput'");
    view = finder.findRequiredView(source, 2131624048, "field 'passwordInput'");
    target.passwordInput = finder.castView(view, 2131624048, "field 'passwordInput'");
    view = finder.findRequiredView(source, 2131624049, "field 'loginButton' and method 'loginButtonPressed'");
    target.loginButton = finder.castView(view, 2131624049, "field 'loginButton'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.loginButtonPressed();
        }
      });
    view = finder.findRequiredView(source, 2131624051, "field 'altText'");
    target.altText = finder.castView(view, 2131624051, "field 'altText'");
    view = finder.findRequiredView(source, 2131624052, "field 'altButton' and method 'altButtonPressed'");
    target.altButton = finder.castView(view, 2131624052, "field 'altButton'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.altButtonPressed();
        }
      });
  }

  @Override public void reset(T target) {
    target.mainView = null;
    target.altView = null;
    target.usernameInput = null;
    target.passwordInput = null;
    target.loginButton = null;
    target.altText = null;
    target.altButton = null;
  }
}

// Generated code from Butter Knife. Do not modify!
package com.amazonaws.devicefarm.android.referenceapp.Fragments;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class FixturesFragment$$ViewInjector<T extends com.amazonaws.devicefarm.android.referenceapp.Fragments.FixturesFragment> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624033, "field 'longitude'");
    target.longitude = finder.castView(view, 2131624033, "field 'longitude'");
    view = finder.findRequiredView(source, 2131624035, "field 'lat'");
    target.lat = finder.castView(view, 2131624035, "field 'lat'");
    view = finder.findRequiredView(source, 2131624037, "field 'wifi'");
    target.wifi = finder.castView(view, 2131624037, "field 'wifi'");
    view = finder.findRequiredView(source, 2131624039, "field 'bluetooth'");
    target.bluetooth = finder.castView(view, 2131624039, "field 'bluetooth'");
    view = finder.findRequiredView(source, 2131624041, "field 'gps'");
    target.gps = finder.castView(view, 2131624041, "field 'gps'");
    view = finder.findRequiredView(source, 2131624043, "field 'nfc'");
    target.nfc = finder.castView(view, 2131624043, "field 'nfc'");
  }

  @Override public void reset(T target) {
    target.longitude = null;
    target.lat = null;
    target.wifi = null;
    target.bluetooth = null;
    target.gps = null;
    target.nfc = null;
  }
}

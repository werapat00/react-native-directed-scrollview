package com.rnds;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.bridge.JavaScriptModule;

public class DirectedScrollViewPackage implements ReactPackage {

  @Override
  public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
    return Collections.emptyList();
  }

  @Override
  public List<Class<? extends JavaScriptModule>> createJSModules() {
    return Collections.emptyList();
  }

  @Override
  public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
    ArrayList<ViewManager> viewManagers = new ArrayList<ViewManager>();
    viewManagers.add(new DirectedScrollViewManager());
    viewManagers.add(new DirectedScrollViewChildManager());
    return viewManagers;
  }
}

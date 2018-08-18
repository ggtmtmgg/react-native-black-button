
package com.reactlibrary;

import android.widget.Button;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;

public class RNBlackButtonManager extends SimpleViewManager<Button> {

  public static final String REACT_CLASS = "RNBlackButton";

  @Override
  public Button createViewInstance(ThemedReactContext context) {
    Button myButton = new Button(context);
    myButton.setText("Push Me");
    return myButton;
  }

  @Override
  public String getName() {
    return REACT_CLASS;
  }
}

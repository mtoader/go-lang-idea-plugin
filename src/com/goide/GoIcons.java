package com.goide;

import com.intellij.openapi.util.IconLoader;

import javax.swing.*;

public interface GoIcons {
  Icon ICON = IconLoader.findIcon("/icons/go.png");
  Icon TYPE = IconLoader.findIcon("/icons/type.png"); // todo: retina support
}
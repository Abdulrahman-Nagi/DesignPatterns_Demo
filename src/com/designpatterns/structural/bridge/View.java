package com.designpatterns.structural.bridge;

 abstract class View {

    IResource resource;

  View (IResource resource){
      this.resource=resource;
  }

 abstract String show();
}

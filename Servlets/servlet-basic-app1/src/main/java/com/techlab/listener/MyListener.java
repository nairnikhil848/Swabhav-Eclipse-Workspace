package com.techlab.listener;


import javax.servlet.ServletContext;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;


@WebListener
public class MyListener implements ServletRequestListener {

	public MyListener() {
	}
	  @Override
	  public void requestDestroyed(ServletRequestEvent sre) {
	    ServletContext servletContext = sre.getServletContext();
	    servletContext.log("Request destroyed");
	    System.out.println("Request destroyed");
	  }
	  @Override
	  public void requestInitialized(ServletRequestEvent sre) {
	    ServletContext servletContext = sre.getServletContext();
	    servletContext.log("New request initialized");
	    System.out.println("New request initialized");
	  }

}

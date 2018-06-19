package org.javacream.portlets.demo;

import java.io.IOException;

import javax.portlet.GenericPortlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

public class SharedRenderParameterPortlet2 extends GenericPortlet {

	@Override
	protected void doView(RenderRequest request, RenderResponse response)
			throws PortletException, IOException {
		System.out.println("doView");
		response.setContentType("text/html");
		response.getWriter().print("Hello from Javacream, public render parameter name=" + request.getParameter("name"));
	}

}
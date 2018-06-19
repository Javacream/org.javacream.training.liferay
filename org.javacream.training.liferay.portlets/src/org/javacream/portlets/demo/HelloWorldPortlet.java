package org.javacream.portlets.demo;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.GenericPortlet;
import javax.portlet.PortletConfig;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

public class HelloWorldPortlet extends GenericPortlet {
	@Override
	public void processAction(ActionRequest request, ActionResponse response)
			throws PortletException, IOException {
		System.out.println("processAction");
	}

	@Override
	protected void doEdit(RenderRequest request, RenderResponse response)
			throws PortletException, IOException {
		System.out.println("doEdit");
	}

	@Override
	protected void doHelp(RenderRequest request, RenderResponse response)
			throws PortletException, IOException {
		System.out.println("doHelp");
	}

	@Override
	public void init(PortletConfig config) throws PortletException {
		super.init(config);
	}

	@Override
	protected void doView(RenderRequest request, RenderResponse response)
			throws PortletException, IOException {
		System.out.println("doView");
		response.setContentType("text/html");
		response.getWriter().print("Hello from Javacream");
	}

	@Override
	public void render(RenderRequest request, RenderResponse response)
			throws PortletException, IOException {
		System.out.println("render");
		super.render(request, response);
	}


}
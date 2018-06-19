package org.javacream.portlets.demo;

import java.io.IOException;

import javax.portlet.EventRequest;
import javax.portlet.EventResponse;
import javax.portlet.GenericPortlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

public class EventConsumerPortlet extends GenericPortlet {

	private String message;
	@Override
	protected void doView(RenderRequest request, RenderResponse response)
			throws PortletException, IOException {
		System.out.println("doView");
		response.setContentType("text/html");
		response.getWriter().print("Hello from Javacream: " + message);
	}

	@Override
	public void processEvent(EventRequest request, EventResponse response)
			throws PortletException, IOException {
		System.out.println(request.getEvent());
		System.out.println(request.getEvent().getValue());
		message = (String) request.getEvent().getValue();
	}

	@Override
	public void render(RenderRequest request, RenderResponse response)
			throws PortletException, IOException {
		System.out.println("render");
		super.render(request, response);
	}


}
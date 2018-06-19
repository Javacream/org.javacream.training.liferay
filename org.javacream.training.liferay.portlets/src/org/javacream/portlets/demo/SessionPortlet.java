package org.javacream.portlets.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.GenericPortlet;
import javax.portlet.PortletException;
import javax.portlet.PortletSession;
import javax.portlet.PortletURL;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

public class SessionPortlet extends GenericPortlet {

	public static final String LOCAL_COUNTER = "localCounter";
	public static final String GLOBAL_COUNTER = "globalCounter";

	@Override
	public void doView(RenderRequest request, RenderResponse response)
			throws IOException {
		PrintWriter writer = response.getWriter();
		PortletSession session = request.getPortletSession();
		PortletURL url = response.createActionURL();
		writer.write("<a href='" + url + "'>do action!</a><p />");
		writer.write("ActionCounter local: "
				+ session.getAttribute(LOCAL_COUNTER,
						PortletSession.PORTLET_SCOPE) + "<p />");
		writer.write("ActionCounter global: "
				+ session.getAttribute(GLOBAL_COUNTER,
						PortletSession.APPLICATION_SCOPE) + "<p />");
		writer.close();
	}

	@Override
	public void processAction(ActionRequest request, ActionResponse response)
			throws PortletException, IOException {
		PortletSession session = request.getPortletSession();
		Integer localCounter = (Integer) session.getAttribute(LOCAL_COUNTER,
				PortletSession.PORTLET_SCOPE);
		Integer globalCounter = (Integer) session.getAttribute(GLOBAL_COUNTER,
				PortletSession.APPLICATION_SCOPE);
		localCounter = incrementCounter(localCounter);
		globalCounter = incrementCounter(globalCounter);
		session.setAttribute(LOCAL_COUNTER, localCounter,
				PortletSession.PORTLET_SCOPE);
		session.setAttribute(GLOBAL_COUNTER, globalCounter,
				PortletSession.APPLICATION_SCOPE);
	}

	private Integer incrementCounter(Integer counter) {
		if (counter == null) {
			return 1;
		}

		else {
			return new Integer(counter.intValue()+ 1);
		}
	}

}

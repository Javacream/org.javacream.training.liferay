package org.javacream.portlets.demo;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.GenericPortlet;
import javax.portlet.PortletException;
import javax.portlet.PortletRequestDispatcher;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.UnavailableException;

public class EventProducerPortlet extends GenericPortlet {
	public void doView(RenderRequest request, RenderResponse response)
			throws PortletException, IOException {
		System.out.println("doView in " + this);
		// set return content type
		response.setContentType("text/html");
		String name = (String) request.getParameter("name");
		if (name != null || name == "") {
			PortletRequestDispatcher reqDispatcher = getPortletContext()
					.getRequestDispatcher("/WEB-INF/jsp/greeting.jsp");
			request.setAttribute("name", name);
			reqDispatcher.include(request, response);
		} else {
			PortletRequestDispatcher reqDispatcher = getPortletContext()
					.getRequestDispatcher("/WEB-INF/jsp/enter.jsp");
			reqDispatcher.include(request, response);
		}
	}

	public void processAction(ActionRequest actionRequest,
			ActionResponse actionResponse) throws PortletException,
			IOException, UnavailableException {
		System.out.println("processAction in " + this);
		String name = (String) actionRequest.getParameter("name");
		// send name back to view
		actionResponse.setRenderParameter("name", name);
		actionResponse.setEvent("javacreamEvent", "Sending an event from Javacream, name=" + name);
	}

	protected void doHelp(RenderRequest renderRequest,
			RenderResponse renderResponse) throws PortletException,
			IOException, UnavailableException {
		System.out.println("doHelp in " + this);
		renderResponse.setContentType("text/html");
		PortletRequestDispatcher reqDispatcher = getPortletContext()
				.getRequestDispatcher("/WEB-INF/jsp/help.jsp");
		reqDispatcher.include(renderRequest, renderResponse);
	}

	protected void doEdit(RenderRequest renderRequest,
			RenderResponse renderResponse) throws PortletException,
			IOException, UnavailableException {
		System.out.println("doEdit in " + this);

		renderResponse.setContentType("text/html");
		PortletRequestDispatcher reqDispatcher = getPortletContext()
				.getRequestDispatcher("/WEB-INF/jsp/edit.jsp");
		reqDispatcher.include(renderRequest, renderResponse);
	}
}

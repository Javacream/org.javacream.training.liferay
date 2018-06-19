package org.javacream.portlets.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.GenericPortlet;
import javax.portlet.PortletException;
import javax.portlet.PortletURL;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

public class SimpleParamPortlet extends GenericPortlet{

private static int instanceCounter;

{
	instanceCounter++;
}

   @Override
   public void doView(RenderRequest request, RenderResponse response) throws IOException
   {
      PrintWriter writer = response.getWriter();
      writer.write("Hello World from View Mode, instanceCounter = " + instanceCounter + "<p />");
      PortletURL url = response.createActionURL();
      url.setParameter("lastname", "Sawitzki");
      url.setParameter("firstname", "Rainer");
      writer.write("<a href='" + url + "'>say hello!</a><p />");
      writer.write("action  url: " + url);
      writer.write("<p />");
      writer.write("Render parameters: action_lastname=" + request.getParameter("action_lastname") + ", action_firstname=" + request.getParameter("action_firstname") + "<p />");
      writer.close();
   }

    @Override
    public void processAction(ActionRequest request, ActionResponse response) throws PortletException, IOException {
    	String lastname = request.getParameter("lastname");
    	String firstname = request.getParameter("firstname");
    	System.out.println("processing action, lastname=" + lastname + ", firstname=" + firstname);
    	response.setRenderParameter("action_lastname", lastname);
    	response.setRenderParameter("action_firstname", firstname);
    }

}


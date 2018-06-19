package org.javacream.portlets.demo;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.GenericPortlet;
import javax.portlet.PortletException;
import javax.portlet.PortletRequestDispatcher;
import javax.portlet.RenderMode;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.javacream.business.demo.DemoBusiness;

public class SimpleJspPortlet extends GenericPortlet
{
//   private String result; SO NICHT, MULTI-BENUTZER UND MULTI_THREADING!

	private final String RESULT_RENDER_PARAMETER_NAME = "result";
@Override
   public void doView(RenderRequest request, RenderResponse response) throws IOException, PortletException
   {
	  String message = request.getParameter("message");
	  System.out.println("Message-Parameter: " + message);
	  String result = request.getParameter(RESULT_RENDER_PARAMETER_NAME);
      System.out.println("In doView using " + this + ", result=" + result);
      
      request.setAttribute("javaResult", result);
      request.setAttribute("data", DemoBusiness.getData());
      PortletRequestDispatcher dispatcher = getPortletContext().getRequestDispatcher("/WEB-INF/jsp/view.jsp");
      dispatcher.include(request, response);
   }
   @RenderMode(name="HELP")
   public void help(RenderRequest request, RenderResponse response) throws IOException, PortletException
   {
	      System.out.println("In HELP using " + this);
	      PortletRequestDispatcher dispatcher = getPortletContext().getRequestDispatcher("/WEB-INF/jsp/help.jsp");
	      dispatcher.include(request, response);
   }
   
   @RenderMode(name="EDIT")
   public void edit(RenderRequest request, RenderResponse response) throws IOException, PortletException
   {
	      
	      System.out.println("In EDIT using " + this);

	   PortletRequestDispatcher dispatcher = getPortletContext().getRequestDispatcher("/WEB-INF/jsp/edit.jsp");
	      dispatcher.include(request, response);
   }

    @Override
    public void processAction(ActionRequest request, ActionResponse response) throws PortletException, IOException {
    		String message = request.getParameter("message");
            System.out.println("ACTION, message=" + message);
            //Typischerweise: Datenbank-Aufruf, irgendwas komplexeres...
            String result = message;
            DemoBusiness.addData(message);
            response.setRenderParameter(RESULT_RENDER_PARAMETER_NAME, result);
    }

}


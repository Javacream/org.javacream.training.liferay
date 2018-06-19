package org.javacream.portlets.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.portlet.GenericPortlet;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

public class SimpleHelloWorldPortlet extends GenericPortlet {

	@Override
	public void doView(RenderRequest request, RenderResponse response)
			throws IOException {
		PrintWriter writer = response.getWriter();
		writer.write("Hello World from View Mode!");
		writer.close();
	}

	@Override
	public void doHelp(RenderRequest request, RenderResponse response)
			throws IOException {
		PrintWriter writer = response.getWriter();
		writer.write("Hello World from Help Mode!");
		writer.close();
	}

	@Override
	public void doEdit(RenderRequest request, RenderResponse response)
			throws IOException {
		PrintWriter writer = response.getWriter();
		writer.write("Hello World from Edit Mode!");
		writer.close();
	}


}

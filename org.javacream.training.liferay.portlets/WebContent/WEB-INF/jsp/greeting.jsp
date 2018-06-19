<%@ taglib uri="http://java.sun.com/portlet" prefix="portlet" %>
<portlet:defineObjects/>
<div align="center">
   Hi, <%= renderRequest.getAttribute("name_for_jsp") %>!
   <hr/>
   Hi2, ${name_for_jsp}
   <a href="<portlet:renderURL></portlet:renderURL>">Back</a>
</div>

<%@ taglib uri="http://java.sun.com/portlet" prefix="portlet" %>
<portlet:defineObjects/>
<div align="center">
   Using JSP for portal view. Please enter your name!
   <br/>
   <form action="<portlet:actionURL><portlet:param name="page"
    value="view"/></portlet:actionURL>" method="POST">
       Name: <input type="text" name="name"/>
   </form>
   <br/>
</div>

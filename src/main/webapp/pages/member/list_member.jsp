<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>

<html>
<head>
    <title>Struts Hibernate Example</title>
</head>
<body>

<h2>List All Members</h2>

<table border="1">
    <tr><td>Member Name</td><td>Email</td></tr>

    <logic:iterate id="member" name="dynaMemberListForm" property="memberList">
        <tr>
            <td><bean:write name="member" property="name"/></td>
            <td><bean:write name="member" property="email"/></td>
        </tr>
    </logic:iterate>

</table>

<br/>
<br/>
<html:link action="/AddMemberPage.do">Add Member</html:link>

</body>
</html>
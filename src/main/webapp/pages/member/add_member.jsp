<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>

<html>
<head>
    <title>Struts Hibernate Example</title>
</head>
<body>

<h2>Add Member</h2>
<div style="color:red">
    <html:errors/>
</div>

<html:form action="/AddMember.do">

    <div style="padding:16px">
        <div style="float:left;width:100px;">
            <bean:message key="member.label.name" /> :
        </div>

        <html:text property="name" size="50" maxlength="30"/>
    </div>

    <div style="padding:16px">
        <div style="float:left;width:100px;">
            <bean:message key="member.label.email" /> :
        </div>

        <html:text property="email" size="50" maxlength="30" />
    </div>

    <div style="padding:16px">
        <div style="float:left;padding-right:8px;">
            <html:submit>
                <bean:message key="member.label.button.submit" />
            </html:submit>
        </div>
        <html:reset>
            <bean:message key="member.label.button.reset" />
        </html:reset>
    </div>

</html:form>

<br/>
<html:link action="/ListMember.do">Member's List</html:link>

</body>
</html>
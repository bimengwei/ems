<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>update department</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/css/style.css"/>
</head>

<body>
<div id="wrap">
    <div id="top_content">
        <div id="header">
            <div id="rightheader">
                <p>
                    2009/11/20
                    <br/>
                </p>
            </div>
            <div id="topheader">
                <h1 id="title">
                    <a href="#">Main</a>
                </h1>
            </div>
            <div id="navigation">
            </div>
        </div>
        <div id="content">
            <p id="whereami">
            </p>
            <h1>
                update Department info:
            </h1>
            <form action="${pageContext.request.contextPath}/dept/updateDept" method="post">
                <table cellpadding="0" cellspacing="0" border="0"
                       class="form_table">
                    <tr>
                        <td valign="middle" align="right">
                            部门id:
                        </td>
                        <td valign="middle" align="left">
                            ${requestScope.department.id}
                        </td>
                        <input type="text" name="id" value="${requestScope.department.id}" hidden/>
                    </tr>
                    <tr>
                        <td valign="middle" align="right">
                            部门编号:
                        </td>
                        <td valign="middle" align="left">
                            <input type="text" class="inputgri" name="departmentNum"
                                   value="${requestScope.department.departmentNum}"/>
                        </td>
                    </tr>
                    <tr>
                        <td valign="middle" align="right">
                            部门名称:
                        </td>
                        <td valign="middle" align="left">
                            <input type="text" class="inputgri" name="departmentName"
                                   value="${requestScope.department.departmentName}"/>
                        </td>
                    </tr>
                </table>
                <p>
                    <input type="submit" class="button" value="修改"/>
                </p>
            </form>
        </div>
    </div>
    <div id="footer">
        <div id="footer_bg">
            ABC@126.com
        </div>
    </div>
</div>
</body>
</html>
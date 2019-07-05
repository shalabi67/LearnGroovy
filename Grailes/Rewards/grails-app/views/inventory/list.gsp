<%--
  Created by IntelliJ IDEA.
  User: mohammad
  Date: 7/2/2019
  Time: 9:10 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
</head>

<body>
<table border="1">
    <g:each in="${allProducts}" var="product">
        <tr>
            <td>${product.name}</td>
            <td>${product.sku}</td>
            <td>${product.price}</td>
        </tr>
    </g:each>
</table>
</body>
</html>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>List of Products</title>
</head>

<body>
    <table border="1">
        <tr>
            <td>SKU</td>
            <td>Name</td>
            <td>Price</td>
        </tr>
        <g:each in="${allProducts}" var="product">
            <tr>
                <td>${product.sku}</td>
                <td>${product.name}</td>
                <td>${product.price}</td>
            </tr>
        </g:each>
    </table>
</body>
</html>
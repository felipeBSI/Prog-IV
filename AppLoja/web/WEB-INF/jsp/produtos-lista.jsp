<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%-- 
    Document   : lista produtos
    Created on : 14/08/2015, 18:55:21
    Author     : chaves.felipe
--%>

<%@page import="java.util.List"%>
<%@page import="br.pucpr.prog4.lojaoldschool.models.Produto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Lista de Produtos</h1>
        <c:forEach var="produto" items="${produtos}">
 
            <div>
                <p>${produto.nome}</p>
                <a href='produto-detalhe?id=${produto.id}'>
                    <img  src='../imagens/${produto.nome}.jpg' alt='produto1' height='400' width='450' />
                </a>
                <p>R$ ${produto.preco}</p>
            </div>
        </c:forEach>
       
    </body>
</html>

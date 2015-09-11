<%-- 
    Document   : produtos-detalhes
    Created on : 21/08/2015, 20:49:33
    Author     : chaves.felipe
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
          <h1>${produto.nome}</h1>
        <div>
      
            <a href="produto-detalhe?id=${produto.id}">
                <img src="../imagens/tenis${produto.id}.jpg" width="150" height="150" />
            </a>
            <p>R$ ${produto.preco}</p>
        </div>
    </body>
</html>

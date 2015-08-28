<%-- 
    Document   : ClienteForm
    Created on : 28/08/2015, 18:18:21
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
        <h1>Meu Cadastro</h1>
        
        <form action='Cadastro' method='POST'>
            <input type="radio" name='Pessoa' id='pf' value='pf'><label for='pf'>Pessoa Física</label>
            <input type='radio' name='Pessoa' id='pj' value='pj' ><label for='pj'>Pessoa Juridica</label>
            <input type='text' name='nome' id='nome' ><label for='nome' >Nome:</label>
            <input type='text' name='dtN' id='dtN' /><label for='dtN'>Data Nascimento</label>
            <input type='text' name='cpf' id='cpf' /><label for='cpf'>CPF</label>
            <select name='sexo' id='sexo'>
                <option>
                    Selecione
                </option>
                <option>
                    Masculino
                </option>
                <option>
                    Feminino
                </option>
            </select><label for='sexo'>Sexo</label>
            <textarea name='cmt' id='cmt' rows='20' cols='20'></textarea><label for='cmt'>Comentario</label>
            <input type='submit' value='salvar'>
        </form>
    </body>
</html>

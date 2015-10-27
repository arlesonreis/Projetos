<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
	<link href="css/signin.css" rel='stylesheet' type='text/css' />
	
<title>Cadastro de Funcões</title>
</head>
<body>

<div class="container">

      <form class="form-signin" method="post" action="CadastroFuncaoServlet">
        <h2 class="form-signin-heading">Cadastro de Funções</h2>
        <br>
        <label for="inputNome" class="sr-only">Nome da Função</label>
        <input name="nome" type="nome" id="inputNome" class="form-control" placeholder="Nome da Função" required autofocus>
        <br>
        <h4 class="form-signin-heading">Descrição</h4>
        <label for="inputComente" class= "sr-only">Descrição </label>
        <textarea name="descricao" type="descrição" id="inputDescrição" class="form-control" required> </textarea>
        <br>   
        
        <button class="btn btn-lg btn-primary btn-block" type="submit">Cadastrar</button>
      </form>

    </div> <!-- /container -->

</body>
</html>
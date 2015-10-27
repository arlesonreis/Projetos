<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
	<link href="css/signin.css" rel='stylesheet' type='text/css' />


<title>Cadastro de Projeto</title>
</head>
<body>

<div class="container">

      <form class="form-signin" method="post" action="CadastroProjetoServlet">
        <h2 class="form-signin-heading">Cadastro de Projeto</h2>
        <br>
        <label for="inputNome" class="sr-only">Nome do Projeto</label>
        <input name="nome" type="nome" id="inputNome" class="form-control" placeholder="Nome do Projeto" required autofocus>
        <br>
        <label for="inputResponsavel" class="sr-only">Responsavel</label>
        <input name="responsavel" type="responsavel" id="inputResponsavel" class="form-control" placeholder="Responsavel" required autofocus>
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
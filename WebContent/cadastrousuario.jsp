<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
	<link href="css/signin.css" rel='stylesheet' type='text/css' />

<title>Cadastro de Usuário</title>
</head>
<body>

	<div class="container">

      <form class="form-signin" method="post" action="CadastroUsuarioServlet">
        <h2 class="form-signin-heading">Cadastro de Usuário</h2>
        <label for="inputNome" class="sr-only">Nome </label>
        <input name="nome" type="nome" id="inputNome" class="form-control" placeholder="Nome" required autofocus>
        <br>
        <label for="inputSobrenome" class="sr-only">Sobrenome </label>
        <input name="sobrenome" type="sobrenome" id="inputSobrenome" class="form-control" placeholder="Sobrenome" required autofocus>
        <br>
        <label for="inputEmail" class="sr-only">Email </label>
        <input name="email" type="email" id="inputEmail" class="form-control" placeholder="Email" required autofocus>
        <br>
        <label for="inputPassword" class= "sr-only">Senha </label>
        <input name="senha" type="password" id="inputPassword" class="form-control" placeholder="Senha" required>
        
        <button class="btn btn-lg btn-primary btn-block" type="submit">Cadastrar</button>
      </form>

    </div> <!-- /container -->
</body>
</html>
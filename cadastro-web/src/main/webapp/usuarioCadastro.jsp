<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadasgtro de Usuário</title>
<!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>


<body>
<%
 String nome = request.getParameter("nome");
  if(nome == null)
	  nome = "";
  
  String email = request.getParameter("email");
  if(email == null)
	  email = "";
%>

<div class="container-fluid">
        <h1>Cadastro de Usuário</h1>
        <form method="Post" action="cadastrousuario">


<label for="nome"> Nome </label>
<input type="text" name="nome" id="nome"  value="<%out.print(nome); %>">

 <label for = "email"> Email</label>
<input type="email" name="email" id="email" value="<%=email %>" ><br> <br>
<br>

<label for = "senha"> senha</label>
<input type ="password" name = "senha" id = "senha">

<label for = "senha2"> Confirmacao</label>
<input type ="password" name = "senha2" id ="senha2"> <br> <br>

<label for = "data"> Data de nascimento</label>
<input type = "Date" name = "data" id= "data">

<input type ="submit" value = "salvar">
<a class="btn btn-primary" href="cadastrousuario" role="button">listar Usuarios</a>
<a class="btn btn-primary" href="index.html" role="button">Voltar</a>
</form>

<%if(!nome.isEmpty()){ %>
			<hr>
			<div class="alert alert-danger" role="alert">
				<%=nome %> <span>as senhas informadas não são iguais</span>
			</div>
		<%} %>

    </div>

</body>

</html>
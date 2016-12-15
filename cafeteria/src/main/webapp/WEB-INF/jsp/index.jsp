<!DOCTYPE HTML>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>



<html>

<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="Cache-Control" content="no-cache">
<meta http-equiv="Expires" content="Sat, 01 Dec 2001 00:00:00 GMT">

<title>Cafeteria | Home</title>


<link href="static/css/bootstrap.min.css" rel="stylesheet">
<link href="static/css/style.css" rel="stylesheet">

<!--[if lt IE 9]>
<script src="static/js/html5shiv.min.js"> </script> 
<script src="static/js/respond.min.js"> </script>
<![endif] -->
</head>

<body>


	<div role="navigation">
		<div class="navbar navbar-inverse">

			<a href="/" class="navbar-brand">Cafeteria 
			
			<span class="glyphicon glyphicon-home"></span>
			
			</a>
			
			
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav">
					<li><a href="novos-pedidos"> Gerenciador de Pedidos</a></li>
					<li><a href="todos-pedidos"> Todos os Pedidos</a></li>

				</ul>
			</div>
		</div>
	</div>

	<c:choose>
		<c:when test="${mode ==  'MODE_HOME'}">

			<div class="container" id="homeDiv">
				<div class="jumbotron text-center">
					<h1>
						<b>Cafeteria</b>
					</h1>
					<h2>
						<b>Gerenciador de Pedidos</b>
					</h2>


				</div>
			</div>


		</c:when>

		<c:when test="${mode ==  'MODE_PEDIDOS'}">
			<div class="container text-center" id="pedidosDiv">
				<h3>Pedidos</h3>
				<hr>
				<div class="table-reponsive">
					<table class="table table-striped table-bordered text-left">
						<thead>
							<tr>

								<th style="text-align: center;">Id</th>
								<th style="text-align: center;">Nome</th>
								<th style="text-align: center;">Descrição</th>
								<th style="text-align: center;">Data do Pedido</th>
								<th style="text-align: center;">Finalizado</th>
								<th></th>
								<th></th>
							</tr>

						</thead>
						<tbody>

							<c:forEach var="categoria" items="${categoria}">
								<tr>

									<td style="text-align: center;">${categoria.id_Produto}</td>
									<td>${categoria.nome}</td>
									<td>${categoria.descricao}</td>
									<td style="text-align: center;"><fmt:formatDate
											pattern="yyyy-MM-dd HH:mm:ss"
											value="${categoria.data_pedido}" /></td>
									<td style="text-align: center;">${categoria.finalizado}</td>
									<td><a
										href="update-pedidos?id_Produto=${categoria.id_Produto}">
											<span class="glyphicon glyphicon-pencil"></span>
									</a></td>

									<td><a
										href="delete-pedidos?id_Produto=${categoria.id_Produto}">
											<span class="glyphicon glyphicon-trash"></span>
									</a></td>


								</tr>


							</c:forEach>


						</tbody>
					</table>

				</div>

			</div>


		</c:when>



		<c:when test="${mode == 'MODE_NOVO' || mode == 'MODE_UPDATE'}">
			<div class="container text-center">
				<h4>
					<b>Gerenciador de Pedidos</b>
				</h4>

				<hr>
				<form class="form-horizontal" method="POST" action="save-pedidos">
					<input type="hidden" name="id_Produto"
						value="${categoria.id_Produto}" />
					<div class="form-group">
						<label class="control-label col-md-3"> Nome</label>
						<div class="col-md-6">
							<input type="text" class="form-control" name="nome"
								value="${categoria.nome}" />
						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-md-3"> Descrição do Pedido</label>
						<div class="col-md-6">
							<input type="text" class="form-control" name="descricao"
								value="${categoria.descricao}" />

						</div>


					</div>

					<div class="form-group">
						<label class="control-label col-md-3"> Finalizado</label>
						<div class="col-md-6">
							<input type="radio" class="com-sm-1" name="finalizado"
								value="true" />
							<div class="col-sm-1">Sim</div>
							<hr>
							<input type="radio" class="com-sm-1" name="finalizado"
								value="true" />
							<div class="col-sm-1">Não</div>


						</div>


					</div>

					<div class="form-group">
						<br> <input type="submit" class="btn btn-primary"
							value="Salvar" />

					</div>
				</form>

			</div>

		</c:when>


	</c:choose>



	<script src="static/js/jquery-1.11.1.min.js"></script>
	<script src="static/js/bootstrap.min.js"></script>
</body>

</html>
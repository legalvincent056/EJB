<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Ajouter un produit</h2>
	<form action="ProduitServlet">
		Nom: <input type="text" name="nom"><br/> 
		Quantité: <input type="text" name="qte"><br/>
		Prix: <input type="text" name="prix"><br/>
		<input type="submit" value="Ajouter un produit">
	</form>
	<a href="SuppProduit.jsp">Supprimer un produit</a>
	<a href="ModifProduit.jsp">Modifier un produit</a>
	<h2>Lister les produits</h2>
		<c:if test="${!empty lesProduits}"> <!-- Affiche la liste des produits si elle n'est pas vide -->
			<table>
					<tr>
						<th>Id</th>
						<th>Nom</th>
						<th>Quantité</th>
						<th>Prix</th>
					</tr>
				<c:forEach var="p" items="${lesProduits}">
					<tr>
						<td><c:out value="${p.id}"></c:out></td>
						<td><c:out value="${p.nom}"></c:out></td>
						<td><c:out value="${p.qte}"></c:out></td>
						<td><c:out value="${p.prix}"></c:out></td>
					</tr>
				</c:forEach>				
			</table>
		</c:if>

</body>
</html>
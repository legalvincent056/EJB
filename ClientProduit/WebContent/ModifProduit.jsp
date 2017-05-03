<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Supprimer un produit</title>
</head>
<body>
<h2>Supprimer un produit</h2>
<h2>Formulaire pour modifier un produit</h2>
			<form method="get" action="ModifProduitServlet">
				<fieldset id="section-1">
					<legend>Suppression d'un produit</legend>
							Id :<input type="text" name="id" id="id"/><br/>
							Nom: <input type="text" name="nom"><br/> 
							Quantité: <input type="text" name="qte"><br/>
							Prix: <input type="text" name="prix"><br/>
	
				</fieldset>	
				
					<input type="submit" value="Valider">
						
			</form>
	
</body>
</html>
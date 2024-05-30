<%-- 
    Document   : Enregistrement
    Created on : 25 mai 2024, 07:06:14
    Author     : DIAW-TECH
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style.css">
    <title>Nouveau contact</title>
</head>
<body>
    <div class="formulaire">
        <h1>Ajouter un contact</h1>
        <form action="${pageContext.request.contextPath}/contact_servlet" method="POST">
            <input type="text" name="nom" placeholder="Votre nom" required>
            <input type="text" name="prenom" placeholder="Votre prenom" required>
            <input type="text" name="favComp" placeholder="Votre Compétance favorie" required>
            <input type="text" name="contact" placeholder="votre contact" required>
            <input type="submit" value="Enregistrer" name="valider" required>
        </form>
    </div>
    
</body>
</html>

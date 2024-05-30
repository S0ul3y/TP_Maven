<%-- 
    Document   : Liste
    Created on : 25 mai 2024, 07:05:50
    Author     : DIAW-TECH
--%>


<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="contact.liste.apprenant" %>
<%@ page import="java.util.List" %>

<%
    List<apprenant> apprenants = (List<apprenant>) request.getAttribute("apprenants");
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Liste des Contacts</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <div class="contenaire">
        <div class="btnAjout">
            <a href="index.jsp">Retour</a>
            <a href="Enregistrement.jsp">Ajouter un contact</a>
        </div>
        
        <div class="liste">
            <table>
                <tr>
                    <th>Id</th>
                    <th>Nom</th>
                    <th>Prénom</th>
                    <th>Compétence</th>
                    <th>Contact</th>
                    <th>Action</th>
                </tr>
                
                <% if (apprenants != null) { %>
                    <% for (apprenant apprenant : apprenants) { %>
                        <tr>
                            <td><%= apprenant.getId() %></td>
                            <td><%= apprenant.getNom() %></td>
                            <td><%= apprenant.getPrenom() %></td>
                            <td><%= apprenant.getFavComp() %></td>
                            <td><%= apprenant.getContact() %></td>
                            <td>
                                <a href="ContactServlet?id=<%= apprenant.getId() %>">Sup</a>
                            </td>
                        </tr>
                    <% } %>
                <% } %>
            </table>
        </div>
    </div>
</body>
</html>

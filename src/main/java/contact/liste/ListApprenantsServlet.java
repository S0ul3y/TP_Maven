/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package contact.liste;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ListApprenantsServlet")
public class ListApprenantsServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("Servlet initialized");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<apprenant> apprenants = new ArrayList<>();
        
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/contact", "root", "");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM contacts");
            
            while (rs.next()) {
                apprenant Ap = new apprenant();
                Ap.setId(rs.getInt("id"));
                Ap.setNom(rs.getString("nom"));
                Ap.setPrenom(rs.getString("prenom"));
                Ap.setFavComp(rs.getString("favcomp"));
                Ap.setContact(rs.getString("contact"));
                apprenants.add(Ap);
            }
            
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        request.setAttribute("apprenants", apprenants);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/Liste.jsp");
        dispatcher.forward(request, response);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contact.liste;
import java.io.Serializable;

/**
 *
 * @author DIAW-TECH
 */
public class apprenant {
    private int id;
    private String nom;
    private String prenom;
    private String favComp;
    private String contact;
    
     public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
   
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    
     public String getFavComp() {
        return favComp;
    }

    public void setFavComp(String favComp) {
        this.favComp = favComp;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}

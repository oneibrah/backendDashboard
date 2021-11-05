/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IbrahTiementa.dashboardapp.model;

/**
 *
 * @author brahima.konate
 */

import java.sql.Time;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author brahima.konate
 */
@Entity
public class Liste {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String prenom;
    private Date presence;
    private Time heureda;
    private Time heurede;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getPresence() {
        return presence;
    }

    public void setPresence(Date presence) {
        this.presence = presence;
    }

    public Time getHeureda() {
        return heureda;
    }

    public void setHeureda(Time heureda) {
        this.heureda = heureda;
    }

    public Time getHeurede() {
        return heurede;
    }

    public void setHeurede(Time heurede) {
        this.heurede = heurede;
    }
    
    @ManyToOne
    private Administrateur administrateur;
    @ManyToOne
    private Apprenant apprenant;
}

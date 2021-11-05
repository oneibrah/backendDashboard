/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IbrahTiementa.dashboardapp.services;

import IbrahTiementa.dashboardapp.model.Administrateur;
import IbrahTiementa.dashboardapp.model.Apprenant;
import IbrahTiementa.dashboardapp.model.Liste;
import java.util.List;

/**
 *
 * @author brahima.konate
 */
public interface GestionService {
    //Apprenant
    Apprenant addApprenant(Apprenant apprenant);
    List<Apprenant> listeApprenant();
    public Apprenant listebyId(long id);
    public Apprenant UpdateApprenant(Apprenant apprenant);
    public void deleteApprenant(long id);
    //

    Administrateur addAdministrateur(Administrateur administrateur);
    List<Administrateur> listeAdministrateur();
    public Administrateur listeId(long id);
    public Administrateur UpdateAdministrateur(Administrateur administrateur);
    public void deleteAdministrateur(long id);
    
    Administrateur addListe(Liste liste);
    List<Liste> listeListe();
    public Liste listeparId(long id);
    public Liste UpdateListe(Administrateur administrateur);
    public void deleteListe(long id);
}

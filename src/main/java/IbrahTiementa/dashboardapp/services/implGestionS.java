/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IbrahTiementa.dashboardapp.services;

import IbrahTiementa.dashboardapp.model.Administrateur;
import IbrahTiementa.dashboardapp.model.Apprenant;
import IbrahTiementa.dashboardapp.model.Liste;
import IbrahTiementa.dashboardapp.repository.AdministrateurRepository;
import IbrahTiementa.dashboardapp.repository.ApprenantRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author brahima.konate
 */
@Service
public class implGestionS implements GestionService {

     @Autowired
    private ApprenantRepository apprenantrepository;

    @Autowired
    private AdministrateurRepository administrateurrepository;

    @Override
    public Apprenant addApprenant(Apprenant apprenant) {
        return apprenantrepository.save(apprenant); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Apprenant> listeApprenant() {
        return apprenantrepository.findAll(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Apprenant listebyId(long id) {
        return apprenantrepository.findById(id).get(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Apprenant UpdateApprenant(Apprenant apprenant) {
       return apprenantrepository.save(apprenant); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteApprenant(long id) {
        apprenantrepository.deleteById(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Administrateur addAdministrateur(Administrateur administrateur) {
        return administrateurrepository.save(administrateur); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Administrateur> listeAdministrateur() {
         return administrateurrepository.findAll(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Administrateur listeId(long id) {
        return administrateurrepository.findById(id).get(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Administrateur UpdateAdministrateur(Administrateur administrateur) {
        return administrateurrepository.save(administrateur); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteAdministrateur(long id) {
        administrateurrepository.deleteById(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Administrateur addListe(Liste liste) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Liste> listeListe() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Liste listeparId(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Liste UpdateListe(Administrateur administrateur) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteListe(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}

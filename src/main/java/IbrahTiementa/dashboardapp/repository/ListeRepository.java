/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IbrahTiementa.dashboardapp.repository;

import IbrahTiementa.dashboardapp.model.Liste;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author brahima.konate
 */
public interface ListeRepository extends JpaRepository<Liste,Long> {
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IbrahTiementa.dashboardapp.controller;

import IbrahTiementa.dashboardapp.model.Apprenant;
import IbrahTiementa.dashboardapp.services.implGestionS;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author brahima.konate
 */

@Controller
@RequestMapping("/api")
@CrossOrigin("*")

public class ControllerDash {
     @Autowired
     private implGestionS impgestions;
     
    @GetMapping("/listeapprenant")
    @ResponseBody
    public ResponseEntity<List<Apprenant>> listeApprenant(){
        List<Apprenant> app = impgestions.listeApprenant();
        return new ResponseEntity<>(app, HttpStatus.OK);
    }

    @PostMapping("/addapprenant")
    @ResponseBody
    public Apprenant addApprenant(@RequestBody Apprenant apprenant){
        return impgestions.addApprenant(apprenant);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restful.session;

import com.restful.entidades.Multicines;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Carlos
 */
@Stateless
public class MulticinesFacade extends AbstractFacade<Multicines> {
    @PersistenceContext(unitName = "com.mycompany_WebServicesREST_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MulticinesFacade() {
        super(Multicines.class);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jpa;

import Modelo.Tipopago;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Inpeca
 */
@Stateless
public class TipopagoFacade extends AbstractFacade<Tipopago> {
    @PersistenceContext(unitName = "InpecawebPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TipopagoFacade() {
        super(Tipopago.class);
    }
    
}

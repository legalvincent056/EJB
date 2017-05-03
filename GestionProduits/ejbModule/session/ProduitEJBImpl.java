package session;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import metier.Produit;

/**
 * Session Bean implementation class ProduitEJBImpl
 */
@Stateless
public class ProduitEJBImpl implements ProduitRemote, ProduitLocal {

    /**
     * Default constructor. 
     */
	@PersistenceContext(name="ejb-pu") // l'entity Manager Factory est déjà créé par wildfly.
	private EntityManager em;	//On crée juste l'entitymanager
	
    public ProduitEJBImpl() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public int ajouterProduit(Produit p) {
		em.persist(p);
		return p.getId();
	}

	@Override
	public Produit modifierProduit(Produit p) {
		em.merge(p);
		return p;
	}

	@Override
	public void supprimerProduit(Produit p) {
		
		em.remove(em.contains(p) ? p:em.merge(p));
		//em.remove(em.find(Produit.class, p.getId()));
		
	}

	@Override
	public Produit getProduit(int id) {
	
		return em.find(Produit.class, id);
	}

	@Override
	public List<Produit> findAllProduits() {
		
		return em.createQuery("SELECT p FROM Produit p").getResultList();
	}

}

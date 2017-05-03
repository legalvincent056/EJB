package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.Produit;
import session.ProduitRemote;

/**
 * Servlet implementation class ProduitServlet
 */
@WebServlet("/SupprimerProduitServlet")
public class SupprimerProduitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	@EJB
	private ProduitRemote produitRemote;
	

	private Produit p =new Produit();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SupprimerProduitServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		//supprimer un produit
			int id = Integer.parseInt(request.getParameter("id"));
			Produit p = produitRemote.getProduit(id);		
				
			produitRemote.supprimerProduit(p);
						
			request.getRequestDispatcher("intro.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

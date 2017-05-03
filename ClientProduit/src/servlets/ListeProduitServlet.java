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
@WebServlet("/ListeProduitServlet")
public class ListeProduitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	@EJB
	private ProduitRemote produitRemote;
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListeProduitServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//lister un produit
		List<Produit> lesProduits = new ArrayList<Produit>();
		lesProduits = (List<Produit>) produitRemote.findAllProduits();
		request.setAttribute("lesProduits", lesProduits);
		
		request.getRequestDispatcher("index.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

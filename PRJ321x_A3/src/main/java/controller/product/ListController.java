package controller.product;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.System.Logger;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import com.mysql.cj.x.protobuf.MysqlxNotice.Warning.Level;

import dao.ListProductDAO;
import model.Product;

/**
 * Servlet implementation class ListController
 */
@WebServlet("/ListController")
public class ListController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ListController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		response.setContentType("text/html; charset=UTF-8");

		try (PrintWriter out = response.getWriter()) {
//			List<Product> ls = new ListProductDAO().search("");
//			request.setAttribute("products", ls);
			RequestDispatcher rd = request.getRequestDispatcher("list.jsp");
			rd.forward(request, response);

		} catch (Exception ex) {
			response.getWriter().println(ex);
			// Logger.getLogger(ListController.class.getName()).log(Level.SEVERE, null, ex);

		}
	}

}

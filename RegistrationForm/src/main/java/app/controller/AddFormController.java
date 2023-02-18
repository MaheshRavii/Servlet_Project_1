package app.controller;

import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import app.dao.FormDAO;
import app.dto.FormDTO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddFormController
 */
@WebServlet("/AddFormController")
public class AddFormController extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		FormDAO dao = new FormDAO();
		response.setContentType("text/html");
		PrintWriter fw = response.getWriter();
		fw.print("<h1><p>**********************************</p></h1>");
		fw.print("<h1> Thank you......:)</h1><h1><a href = 'Form.html'>Click</a></h1>");
		fw.print("<h1><p>**********************************</p></h1>");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		int age = Integer.parseInt( request.getParameter("age"));
		String occupation = request.getParameter("occupation");
		String ans = request.getParameter("ans");
		String [] skills = request.getParameterValues("skill");
		String cmds = request.getParameter("message");
		FormDTO dto  = new FormDTO(name, email, age, occupation, skills, cmds);
		dao.addDetails(dto);
		
		System.out.println(name);
		System.out.println(email);
		System.out.println(age);
		System.out.println(occupation);
		System.out.println(ans);
		System.out.println(Arrays.toString(skills));
		System.out.println(cmds);
	}

}

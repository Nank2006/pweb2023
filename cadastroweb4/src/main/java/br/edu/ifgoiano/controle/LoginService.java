package br.edu.ifgoiano.controle;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login")
public class LoginService extends HttpServlet {

	private static final long serialVersionUID = 7036815389008473423L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(req.getParameter("email"));
		System.out.println(req.getParameter("senha"));
	
		
		if(req.getParameter("senha").equals("123456") ) {
			String html = new String();
			         html = "<html><body><h1>Login realizado com sucesso!</h1></body></html>";
					
			         PrintWriter writer = resp.getWriter();
			 		writer.println(html);
			}else {
				String html2 = new String();
		         html2 = "<html><body><h1>Falha no login: email e/ou senha inv�lido(s)</h1></body></html>";
				
		         PrintWriter writer = resp.getWriter();
			 		writer.println(html2);
			}

	}
}


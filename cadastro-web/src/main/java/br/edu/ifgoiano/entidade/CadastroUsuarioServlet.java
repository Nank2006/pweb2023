package br.edu.ifgoiano.entidade;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cadastroUsuario")
public class CadastroUsuarioServlet extends HttpServlet {

	 @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String senha1 =  req.getParameter("senha1");
       String senha2 =  req.getParameter("senha2");
       
       //verificar se as senhas sao iguais
       if (senha1.equals(senha2)) {
    	   //redrecionar o usuario para a pagina de login
    	  resp.sendRedirect("index.html"); 
       }else{
    	   //redrecionar o usuario para a mesma pagina de cadastro de usuario
    	   req.getRequestDispatcher("NewFile.html").forward(req, resp);
    	   
       }
	}
}

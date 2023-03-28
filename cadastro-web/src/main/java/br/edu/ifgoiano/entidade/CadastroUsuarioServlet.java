package br.edu.ifgoiano.entidade;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cadastroUsuario")
public class CadastroUsuarioServlet extends HttpServlet {

	//Simulando o banco de dados 
	private List<usuario> IstDeUsuario;
	
	@Override
	public void init() throws ServletException {
		this.IstDeUsuario = new ArrayList<usuario>();
	}
	
	 @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String senha1 =  req.getParameter("senha1");
       String senha2 =  req.getParameter("senha2");
       
       //verificar se as senhas sao iguais
       if (senha1.equals(senha2)) {
    	   usuario usu = new usuario();
    	   usu.setNome(req.getParameter("nome"));
    	   usu.setEmail(req.getParameter("email"));
    	   usu.setSenha (senha1);
    	   //redrecionar o usuario para a pagina de login
    	  resp.sendRedirect("index.html"); 
       }else{
    	   //redrecionar o usuario para a mesma pagina de cadastro de usuario
    	   req.getRequestDispatcher("NewFile.html").forward(req, resp);
    	   
       }
	}
	 
	 @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	  for (usuario usuario : IstDeUsuario) {
		 System.out.println(usuario.getNome().concat("-").concat(usuario.getEmail()));
	}
	}
	
	 
	 @Override
	public void destroy() {
		this.IstDeUsuario.clear();
		}
	 
}

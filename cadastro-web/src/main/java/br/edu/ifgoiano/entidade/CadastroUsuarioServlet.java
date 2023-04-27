
	
package br.edu.ifgoiano.entidade;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse; 

@WebServlet("/cadastrousuario")
public class CadastroUsuarioServlet extends HttpServlet {

	private static final long serialVersionUID = 7869758393435911873L;
	
	//Simular o banco de dados
	private List<usuario> lstDeUsuario;
	
	@Override
	public void init() throws ServletException {
		this.lstDeUsuario = new ArrayList<usuario>();
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String senha = req.getParameter("senha");
		String senha2 = req.getParameter("senha2");
		
		//Verificar se as senhas são iguais
		if(senha.equals(senha2)) {
			usuario usu = new usuario();
			usu.setNome(req.getParameter("nome"));
			usu.setEmail(req.getParameter("email"));
			usu.setSenha(senha);
			
			lstDeUsuario.add(usu);
			
			//redirecionar o usuário para a página de login
			resp.sendRedirect("index.html");
		}else {
			//redirecionar o usuário para a mesma página de cadastro do usuário.
			req.getRequestDispatcher("usuarioCadastro.jsp").forward(req, resp);
		}
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		for (usuario usuario : lstDeUsuario) {
			System.out.println(usuario.getNome().concat(" - ").concat(usuario.getEmail()));
		}
	}
	
	@Override
	public void destroy() {
		this.lstDeUsuario.clear();
	}
}

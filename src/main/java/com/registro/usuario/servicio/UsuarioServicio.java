package com.registro.usuario.servicio;
import java.util.List;

 import org.springframework.security.core.userdetails.UserDetailsService;

//import org.springframework.security.core.userdetails.UserDetailsService;

import com.registro.usuario.dto.UsuarioRegistroDTO;
import com.registro.usuario.modelo.Usuario;

public interface UsuarioServicio extends UserDetailsService  {
	public Usuario guardar(UsuarioRegistroDTO registroDTO);
	public List<Usuario> listarUsuarios();

}

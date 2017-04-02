package ar.com.escuela.novedades;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NovedadController {
	
	@RequestMapping("/novedades")
	public List<Novedad> getAllNovedades(){
		return Arrays.asList(
				new Novedad(1, "Aviso", "Avisos generales para los padres"),
				new Novedad(2, "Reunion", "Reunion de padres"),
				new Novedad(3, "Acto", "Acto en conmemoracion de fecha especial")
				);
	}
	
}

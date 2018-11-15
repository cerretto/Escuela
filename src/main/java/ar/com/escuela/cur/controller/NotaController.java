package ar.com.escuela.cur.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ar.com.escuela.cur.bean.Nota;
import ar.com.escuela.cur.service.CursadoService;

@RestController
@RequestMapping("/notas")
public class NotaController {

	@Autowired
	private CursadoService cursadoService;
		
	@RequestMapping("/")
	public List<Nota> getAllNotas(){
		return cursadoService.getAllNotas();
	}
	
	@RequestMapping("/{id}") // otra forma "/nota/{foo}" y poner @PathVariable("foo")
	public Nota getNota(@PathVariable Long id){
		return cursadoService.getNotaById(id);
	}
	
	@RequestMapping(method=RequestMethod.POST , value="/")
	public void addNota(@RequestBody Nota nota){
		cursadoService.addNota(nota);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/{id}")
	public void updateNota(@RequestBody Nota nota, @PathVariable Long id){
		cursadoService.updateNota(nota, id);
		
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/{id}")
	public void deleteNota(@PathVariable Long id){
		cursadoService.deleteNota(id);
	}
	
	@GetMapping("/getNotasByAlumnoCurso/{idAlumnoCurso}")
    public ResponseEntity<List<Nota>> getNotasByAlumnoCurso(@PathVariable Long idAlumnoCurso) {

        List<Nota> listAlumnoCurso = cursadoService.getNotasByAlumnoCurso(idAlumnoCurso);

        return new ResponseEntity<List<Nota>>(listAlumnoCurso, HttpStatus.OK);
    }
	
	@GetMapping("/getNotasByEvaluacion/{idEvaluacion}")
    public ResponseEntity<List<Nota>> getNotasByEvaluacion(@PathVariable Long idEvaluacion) {

        List<Nota> listNotas = cursadoService.getNotasByEvaluacion(idEvaluacion);

        return new ResponseEntity<List<Nota>>(listNotas, HttpStatus.OK);
    }
	

}

package ar.com.escuela.cur.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ar.com.escuela.cur.bean.Evaluacion;
import ar.com.escuela.cur.service.CursadoService;
import ar.com.escuela.exceptions.EscuelaException;
import ar.com.escuela.exceptions.EscuelaRestErrorCode;

@RestController
@RequestMapping("/evaluaciones")
public class EvaluacionController {

	@Autowired
    private CursadoService cursadoService;

    @RequestMapping("")
    public ResponseEntity<List<Evaluacion>> getAllEvaluaciones() {
        List<Evaluacion> listEvaluacion = cursadoService.getAllEvaluaciones();
        return new ResponseEntity<List<Evaluacion>>(listEvaluacion, HttpStatus.OK);
    }

    @RequestMapping("/{id}") // otra forma "/alumnoCurso/{foo}" y poner @PathVariable("foo")
    public ResponseEntity<Evaluacion> getEvaluacion(@PathVariable Long id) {
    	Evaluacion evaluacion = cursadoService.getEvaluacionById(id);

        return new ResponseEntity<Evaluacion>(evaluacion, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Void> addEvaluacion(@RequestBody Evaluacion evaluacion) {
    	
    	// Validaciones de campos requeridos
        if (evaluacion.getDescripcion() == null) {
            throw new EscuelaException(EscuelaRestErrorCode.REQUERIDO, "La descripción es requerida.");
        }

        if (evaluacion.getMateria() == null) {
            throw new EscuelaException(EscuelaRestErrorCode.REQUERIDO, "La materia es requerida.");
        }

        cursadoService.addEvaluacion(evaluacion);

        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public ResponseEntity<Void> updateEvaluacion(@RequestBody Evaluacion evaluacion, @PathVariable Long id) {
        cursadoService.updateEvaluacion(evaluacion, id);

        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public ResponseEntity<Void> deleteEvaluacion(@PathVariable Long id) {
        cursadoService.deleteEvaluacion(id);

        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }
    
    @RequestMapping(method=RequestMethod.GET, value="/{idMateria}")
	public ResponseEntity<List<Evaluacion>> getEvaluacionesByMateria(@PathVariable Long idMateria){
		List<Evaluacion> evaluaciones = cursadoService.getEvaluacionesByMateria(idMateria);
		return new ResponseEntity<List<Evaluacion>>(evaluaciones, HttpStatus.OK);
	}

}

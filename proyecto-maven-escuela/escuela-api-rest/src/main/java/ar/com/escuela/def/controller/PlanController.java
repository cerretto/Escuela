package ar.com.escuela.def.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ar.com.escuela.def.bean.Plan;
import ar.com.escuela.def.service.DefinicionService;

@RestController
@RequestMapping("/planes")
@CrossOrigin(origins = "http://localhost:4200")
public class PlanController {
	
	@Autowired
	private DefinicionService planService;
	
	@RequestMapping("")
	public ResponseEntity<List<Plan>> getAllPlanes(){
		List<Plan> planes = planService.getAllPlanes();
		
		return new ResponseEntity<List<Plan>>(planes, HttpStatus.OK);
	}
	
	@RequestMapping("/{id}")
	public ResponseEntity<Plan> getPlan(@PathVariable Long id){
		Plan plan = planService.getPlanById(id);
		
		return new ResponseEntity<Plan>(plan, HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Void> addPlan(@RequestBody Plan plan){
		planService.addPlan(plan);
		
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/{id}")
	public ResponseEntity<Void> updatePlan(@RequestBody Plan plan, @PathVariable Long id){
		planService.updatePlan(plan, id);
		
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/{id}")
	private ResponseEntity<Void> deletePlan(@PathVariable Long id){
		planService.deletePlan(id);
		
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
}

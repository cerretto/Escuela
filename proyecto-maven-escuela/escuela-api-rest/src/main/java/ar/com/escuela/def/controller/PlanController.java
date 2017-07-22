package ar.com.escuela.def.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ar.com.escuela.def.bean.Plan;
import ar.com.escuela.def.service.DefinicionService;

@RestController
@RequestMapping("/planes")
public class PlanController {
	
	@Autowired
	private DefinicionService planService;
	
	@RequestMapping("/")
	public List<Plan> getAllPlanes(){
		return planService.getAllPlanes();
	}
	
	@RequestMapping("/{id}")
	public Plan getPlan(@PathVariable Long id){
		return planService.getPlanById(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/")
	public void addPlan(@RequestBody Plan plan){
		planService.addPlan(plan);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/{id}")
	public void updatePlan(@RequestBody Plan plan, @PathVariable Long id){
		planService.updatePlan(plan, id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/{id}")
	private void deletePlan(@PathVariable Long id){
		planService.deletePlan(id);
	}
}

package ar.com.escuela.def.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.com.escuela.def.bean.Plan;

public interface PlanRepository extends JpaRepository<Plan, Long>{

}

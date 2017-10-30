package ar.com.escuela.def.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.com.escuela.def.bean.Plan;

@Repository
public interface PlanRepository extends JpaRepository<Plan, Long>{

}

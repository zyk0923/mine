package com.oc.mine.controller.program;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oc.mine.entity.base.GetPageEntity;
import com.oc.mine.entity.program.Plan;
import com.oc.mine.service.program.PlanService;

@RestController
@RequestMapping("plan")
public class PlanController {

	@Autowired
	private PlanService pService;

	@PostMapping("list")
	public Object list(@RequestBody GetPageEntity<Plan> entity) {
		System.out.println(entity.getEntity().getPlan_name());
		return pService.listPage(entity);
	}

	@PostMapping("insert")
	public Object insert(@RequestBody Plan entity) {
		pService.insert(entity);
		return true;
	}

	@PostMapping("update")
	public Object update(@RequestBody Plan entity) {
		pService.update(entity);
		return true;
	}

	@PostMapping("delete")
	public Object delete(@RequestBody Map<String, Object> map) {
		pService.delete(map);
		return true;
	}
	
	@PostMapping("deleteAll")
	public Object deleteAll(@RequestBody Integer[] id) {
		pService.deleteAll(id);
		return true;
	}
}

package com.oc.mine.controller.account;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oc.mine.entity.account.Expenditure;
import com.oc.mine.entity.base.GetPageEntity;
import com.oc.mine.service.account.ExpenditureService;

@RestController
@RequestMapping("expenditure")
public class ExpenditureController {

	@Autowired
	private ExpenditureService eService;
	
	@PostMapping("listPage")
	public Object listPage(@RequestBody GetPageEntity<Expenditure> entity) {
		return eService.listPage(entity);
	}
	
	@PostMapping("getThisMonthAmount")
	public Object getThisMonthAmount() {
		return eService.getThisMonthAmount();
	}

	@PostMapping("insert")
	public Object insert(@RequestBody Expenditure entity) {
		eService.insert(entity);
		return true;
	}

	@PostMapping("update")
	public Object update(@RequestBody Expenditure entity) {
		eService.update(entity);
		return true;
	}

	@PostMapping("delete")
	public Object delete(@RequestBody Map<String, Object> map) {
		eService.delete(map);
		return true;
	}
	
	@PostMapping("deleteAll")
	public Object deleteAll(@RequestBody Integer[] id) {
		eService.deleteAll(id);
		return true;
	}

}

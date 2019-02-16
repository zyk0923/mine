package com.oc.mine.controller.ency;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oc.mine.entity.base.GetPageEntity;
import com.oc.mine.entity.ency.EncyLabel;
import com.oc.mine.service.ency.EncyLabelService;

@RestController
@RequestMapping("encyLabel")
public class EncyLabelController {
	
	@Autowired
	private EncyLabelService elService;

	@PostMapping("list")
	public Object list(@RequestBody EncyLabel entity) {
		return elService.list(entity);
	}
	
	@PostMapping("listPage")
	public Object listPage(@RequestBody GetPageEntity<EncyLabel> entity) {
		return elService.listPage(entity);
	}

	@PostMapping("insert")
	public Object insert(@RequestBody EncyLabel entity) {
		elService.insert(entity);
		return true;
	}

	@PostMapping("update")
	public Object update(@RequestBody EncyLabel entity) {
		elService.update(entity);
		return true;
	}

	@PostMapping("delete")
	public Object delete(@RequestBody Map<String, Object> map) {
		elService.delete(map);
		return true;
	}
	
	@PostMapping("deleteAll")
	public Object deleteAll(@RequestBody Integer[] id) {
		elService.deleteAll(id);
		return true;
	}
}

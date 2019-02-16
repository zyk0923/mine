package com.oc.mine.controller.ency;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oc.mine.entity.base.GetPageEntity;
import com.oc.mine.entity.ency.EncyInfo;
import com.oc.mine.service.ency.EncyInfoService;

@RestController
@RequestMapping("encyInfo")
public class EncyInfoController {
	
	@Autowired
	private EncyInfoService eiService;

	@PostMapping("list")
	public Object list(@RequestBody EncyInfo entity) {
		return eiService.list(entity);
	}
	
	@PostMapping("listPage")
	public Object listPage(@RequestBody GetPageEntity<EncyInfo> entity) {
		return eiService.listPage(entity);
	}

	@PostMapping("insert")
	public Object insert(@RequestBody EncyInfo entity) {
		eiService.insert(entity);
		return true;
	}

	@PostMapping("update")
	public Object update(@RequestBody EncyInfo entity) {
		eiService.update(entity);
		return true;
	}

	@PostMapping("delete")
	public Object delete(@RequestBody Map<String, Object> map) {
		eiService.delete(map);
		return true;
	}
	
	@PostMapping("deleteAll")
	public Object deleteAll(@RequestBody Integer[] id) {
		eiService.deleteAll(id);
		return true;
	}
	

}

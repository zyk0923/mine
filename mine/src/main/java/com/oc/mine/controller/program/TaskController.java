package com.oc.mine.controller.program;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oc.mine.entity.base.GetPageEntity;
import com.oc.mine.entity.program.Task;
import com.oc.mine.service.program.TaskService;

@RestController
@RequestMapping("task")
public class TaskController {

	@Autowired
	private TaskService tService;
	
	@PostMapping("listPage")
	public Object list(@RequestBody GetPageEntity<Task> entity) {
		return tService.listPage(entity);
	}
	
	@PostMapping("getUnfinishedTask")
	public Object getUnfinishedTask() {
		return tService.findForList("getUnfinishedTask", null);
	}
	
	@PostMapping("getTodayTask")
	public Object getTodayTask() {
		return tService.findForList("getTodayTask", null);
	}
	
	@PostMapping("insert")
	public Object insert(@RequestBody Task entity) {
		tService.insert(entity);
		return true;
	}
	
	@PostMapping("update")
	public Object update(@RequestBody Task entity) {
		tService.update(entity);
		return true;
	}

	@PostMapping("delete")
	public Object delete(@RequestBody Map<String, Object> map) {
		tService.delete(map);
		return true;
	}
	
	@PostMapping("deleteAll")
	public Object deleteAll(@RequestBody Integer[] id) {
		tService.deleteAll(id);
		return true;
	}
}

package com.oc.mine.controller.account;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oc.mine.entity.account.Purchase;
import com.oc.mine.entity.base.GetPageEntity;
import com.oc.mine.service.account.PurchaseService;

@RestController
@RequestMapping("purchase")
public class PurchaseController {
	
	@Autowired
	private PurchaseService pService;
	
	@PostMapping("list")
	public Object list(@RequestBody GetPageEntity<Purchase> entity) {
		return pService.listPage(entity);
	}

	@PostMapping("insert")
	public Object insert(@RequestBody Purchase entity) {
		pService.insert(entity);
		return true;
	}

	@PostMapping("update")
	public Object update(@RequestBody Purchase entity) {
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

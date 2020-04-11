package com.SpringApp.SpringApplication;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@RestController
public class RestCalculator  {
    @Autowired
	RestTemplate restTemplate;
	
	List<Map<String, Object>> historyList = new ArrayList<Map<String, Object>>();

    @RequestMapping(path = {"/sum/{n1}",
	"/sum/{n1}/{n2}",
	"/sum/{n1}/{n2}/{n3}",
	"/sum/{n1}/{n2}/{n3}/{n4}",
	"/sum/{n1}/{n2}/{n3}/{n4}/{n5}",
	"/sum/{n1}/{n2}/{n3}/{n4}/{n5}/{n6}",
	"/sum/{n1}/{n2}/{n3}/{n4}/{n5}/{n6}/{n7}",
	"/sum/{n1}/{n2}/{n3}/{n4}/{n5}/{n6}/{n7}/{n8}",
	"/sum/{n1}/{n2}/{n3}/{n4}/{n5}/{n6}/{n7}/{n8}/{n9}",
	"/sum/{n1}/{n2}/{n3}/{n4}/{n5}/{n6}/{n7}/{n8}/{n9}/{n10}"}, 
	produces = "application/json; charset=UTF-8")
	@ResponseBody
	public Map<String, Integer> sum(@PathVariable(required = false) Integer n1 , 
	@PathVariable(required = false) Integer n2, 
	@PathVariable(required = false) Integer n3, 
	@PathVariable(required = false) Integer n4, 
	@PathVariable(required = false) Integer n5,
	@PathVariable(required = false) Integer n6,
	@PathVariable(required = false) Integer n7,
	@PathVariable(required = false) Integer n8,
	@PathVariable(required = false) Integer n9,
	@PathVariable(required = false) Integer n10)
						{

		
		
		List<Integer> parameters = new ArrayList<Integer>();					

		
		Integer result = 0;
		
		if (n1 != null) {
			result += n1;
			parameters.add(n1);
		}
		if (n2 != null) {
			result += n2;
			parameters.add(n2);
		}
		if (n3 != null) {
			result += n3;
			parameters.add(n3);
		}
		if (n4 != null) {
			result += n4;
			parameters.add(n4);
		}
		if (n5 != null) {
			result += n5;
			parameters.add(n5);
		}
		if (n6 != null) {
			result += n6;
			parameters.add(n6);
		}
		if (n7 != null) {
			result += n7;
			parameters.add(n7);
		}
		if (n8 != null) {
			result += n8;
			parameters.add(n8);
		}
		if (n9 != null) {
			result += n9;
			parameters.add(n9);
		}
		if (n10 != null) {
			result += n10;
			parameters.add(n10);
		}

		// push history element
		Map<String, Object> historyElement = new HashMap<String, Object>();
		historyElement.put("operation", "sum");
		historyElement.put("result", result);
		historyElement.put("parameters", parameters);
		historyList.add(historyElement);
		// craft response
		Map<String, Integer> response = new HashMap<String, Integer>();
		response.put("result", result);
		return response;
		
	}


	@RequestMapping(path = {"/sub/{n1}",
	"/sub/{n1}/{n2}",
	"/sub/{n1}/{n2}/{n3}",
	"/sub/{n1}/{n2}/{n3}/{n4}",
	"/sub/{n1}/{n2}/{n3}/{n4}/{n5}",
	"/sub/{n1}/{n2}/{n3}/{n4}/{n5}/{n6}",
	"/sub/{n1}/{n2}/{n3}/{n4}/{n5}/{n6}/{n7}",
	"/sub/{n1}/{n2}/{n3}/{n4}/{n5}/{n6}/{n7}/{n8}",
	"/sub/{n1}/{n2}/{n3}/{n4}/{n5}/{n6}/{n7}/{n8}/{n9}",
	"/sub/{n1}/{n2}/{n3}/{n4}/{n5}/{n6}/{n7}/{n8}/{n9}/{n10}"}, 
	produces = "application/json; charset=UTF-8")
	@ResponseBody
	public Map<String, Integer> sub(@PathVariable(required = false) Integer n1 , 
	@PathVariable(required = false) Integer n2, 
	@PathVariable(required = false) Integer n3, 
	@PathVariable(required = false) Integer n4, 
	@PathVariable(required = false) Integer n5,
	@PathVariable(required = false) Integer n6,
	@PathVariable(required = false) Integer n7,
	@PathVariable(required = false) Integer n8,
	@PathVariable(required = false) Integer n9,
	@PathVariable(required = false) Integer n10)
						{

		List<Integer> parameters = new ArrayList<Integer>();
		Integer result = 0;
		
		if (n1 != null) {
			result -= n1;
			parameters.add(n1);
		}
		if (n2 != null) {
			result -= n2;
			parameters.add(n2);
		}
		if (n3 != null) {
			result -= n3;
			parameters.add(n3);
		}
		if (n4 != null) {
			result -= n4;
			parameters.add(n4);
		}
		if (n5 != null) {
			result -= n5;
			parameters.add(n5);
		}
		if (n6 != null) {
			result -= n6;
			parameters.add(n6);
		}
		if (n7 != null) {
			result -= n7;
			parameters.add(n7);
		}
		if (n8 != null) {
			result -= n8;
			parameters.add(n8);
		}
		if (n9 != null) {
			result -= n9;
			parameters.add(n9);
		}
		if (n10 != null) {
			result -= n10;
			parameters.add(n10);
		}

		// push history element
		Map<String, Object> historyElement = new HashMap<String, Object>();
		historyElement.put("operation", "sub");
		historyElement.put("result", result);
		historyElement.put("parameters", parameters);
		historyList.add(historyElement);
		// craft response
		Map<String, Integer> response = new HashMap<String, Integer>();
		response.put("result", result);
		return response;
		
	}



	@RequestMapping(path = {"/mul/{n1}",
	"/mul/{n1}/{n2}",
	"/mul/{n1}/{n2}/{n3}",
	"/mul/{n1}/{n2}/{n3}/{n4}",
	"/mul/{n1}/{n2}/{n3}/{n4}/{n5}",
	"/mul/{n1}/{n2}/{n3}/{n4}/{n5}/{n6}",
	"/mul/{n1}/{n2}/{n3}/{n4}/{n5}/{n6}/{n7}",
	"/mul/{n1}/{n2}/{n3}/{n4}/{n5}/{n6}/{n7}/{n8}",
	"/mul/{n1}/{n2}/{n3}/{n4}/{n5}/{n6}/{n7}/{n8}/{n9}",
	"/mul/{n1}/{n2}/{n3}/{n4}/{n5}/{n6}/{n7}/{n8}/{n9}/{n10}"}, 
	produces = "application/json; charset=UTF-8")
	@ResponseBody
	public Map<String, Integer> mul(@PathVariable(required = false) Integer n1 , 
	@PathVariable(required = false) Integer n2, 
	@PathVariable(required = false) Integer n3, 
	@PathVariable(required = false) Integer n4, 
	@PathVariable(required = false) Integer n5,
	@PathVariable(required = false) Integer n6,
	@PathVariable(required = false) Integer n7,
	@PathVariable(required = false) Integer n8,
	@PathVariable(required = false) Integer n9,
	@PathVariable(required = false) Integer n10)
						{
		List<Integer> parameters = new ArrayList<Integer>();
		Integer result = 1;
		
		if (n1 != null) {
			result *= n1;
			parameters.add(n1);
		}
		if (n2 != null) {
			result *= n2;
			parameters.add(n2);
		}
		if (n3 != null) {
			result *= n3;
			parameters.add(n3);
		}
		if (n4 != null) {
			result *= n4;
			parameters.add(n4);
		}
		if (n5 != null) {
			result *= n5;
			parameters.add(n5);
		}
		if (n6 != null) {
			result *= n6;
			parameters.add(n6);
		}
		if (n7 != null) {
			result *= n7;
			parameters.add(n7);
		}
		if (n8 != null) {
			result *= n8;
			parameters.add(n8);
		}
		if (n9 != null) {
			result *= n9;
			parameters.add(n9);
		}
		if (n10 != null) {
			result *= n10;
			parameters.add(n10);
		}

		// push history element
		Map<String, Object> historyElement = new HashMap<String, Object>();
		historyElement.put("operation", "mul");
		historyElement.put("result", result);
		historyElement.put("parameters", parameters);
		historyList.add(historyElement);
		// craft response
		Map<String, Integer> response = new HashMap<String, Integer>();
		response.put("result", result);
		return response;
		
	}



	@RequestMapping(path = "/history", produces = "application/json; charset=UTF-8")
	@ResponseBody
	public List<Map<String, Object>> history() {
		return historyList;
	}
}
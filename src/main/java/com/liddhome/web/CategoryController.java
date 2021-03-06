package com.liddhome.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.liddhome.entity.Category;
import com.liddhome.service.CategoryService;

@Controller
@RequestMapping("category")
public class CategoryController {
	@Autowired
	private CategoryService categoryService;
	
	@RequestMapping("/findAll.do")
	public String findAll(ModelMap map){
		List<Category> parents = categoryService.findAll();
		map.addAttribute("parents", parents);
		return "/jsps/left";
	}
}

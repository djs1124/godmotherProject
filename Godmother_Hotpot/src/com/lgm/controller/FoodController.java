package com.lgm.controller;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.swing.JOptionPane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.aliyun.oss.OSSClient;
import com.lgm.model.Food;
import com.lgm.service.FoodService;


@Controller
@RequestMapping("/food")
public class FoodController {
	
	@Autowired
	@Qualifier("foodService")
	private FoodService foodService;
	
	@RequestMapping(value="/addFood.do",method=RequestMethod.POST) 
	public ModelAndView uploadPic(@RequestParam("mfile")MultipartFile file,
			Food food,HttpServletRequest request) throws IOException{ 
		ModelAndView mv = new ModelAndView();
		
		String path = request.getSession().getServletContext().getRealPath("/files/");
		String fileName =file.getOriginalFilename();
		
		File f = new File(path+fileName);
		System.out.println(path+fileName);
		file.transferTo(f);
		
		String endpoint = "http://oss-cn-beijing.aliyuncs.com";
		String accessKeyId = "LTAItXszNV4gxFoY";
		String accessKeySecret = "YFNki8GsUxpro8hqghMbEdUvfXgj0B";
		OSSClient ossClient = new OSSClient(endpoint, accessKeyId, accessKeySecret);
		
		ossClient.putObject("dajisi", fileName, f);
		
		ossClient.shutdown();
		Date expiration = new Date(new Date().getTime()+3600l * 1000 * 24 * 365 * 10);
		String url = ossClient.generatePresignedUrl("dajisi", fileName, expiration).toString();
		System.out.println(url);
		
		food.setfPic(url);
		if(foodService.addFood(food)){
			
			JOptionPane.showMessageDialog(null, "添加成功！");
			mv.setViewName("foodList");
		
		}
		return mv;
	 }
	
	
	@RequestMapping("/getFood.do")
	public ModelAndView getFood(){
		ModelAndView mv = new ModelAndView();
		List<Food> list = foodService.getFood();
		
		mv.addObject("foodList", list);
		mv.setViewName("foodList");
		return mv;
	}
}

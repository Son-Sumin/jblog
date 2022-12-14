package com.bitacademy.jblog.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.bitacademy.jblog.security.Auth;
import com.bitacademy.jblog.service.BlogService;
import com.bitacademy.jblog.service.CategoryService;
import com.bitacademy.jblog.service.FileUploadService;
import com.bitacademy.jblog.service.PostService;
import com.bitacademy.jblog.vo.BlogVo;
import com.bitacademy.jblog.vo.CategoryVo;
import com.bitacademy.jblog.vo.PostVo;


@Controller
@RequestMapping("/{id:(?!assets).*}")  // assets 없어도되고 있어도되고 assets으로 시작하지 않는 모든 것
public class BlogController {
	@Autowired
	private BlogService blogService;
	
	@Autowired
	private CategoryService categoryService;
	
	@Autowired
	private PostService postService;
	
	@Autowired
	private FileUploadService fileUploadService;
	
	@RequestMapping({"", "/{pathNo1}", "/{pathNo1}/{pathNo2}"})
	public String index(
			@PathVariable("id") String id,
			@PathVariable("pathNo1") Optional<Long> pathNo1,
			@PathVariable("pathNo2") Optional<Long> pathNo2) {
		Long categoryNo = 0L;
		Long postNo = 0L;
		
		if(pathNo1.isPresent()) {
			categoryNo = pathNo1.get();
		} else if (pathNo2.isPresent()) {
			categoryNo = pathNo1.get();
			postNo = pathNo2.get();
		}
		return "blog/index";
	}
	
	@Auth
	@RequestMapping({"/admin", "/admin/basic"})
	public String adminBasic(@PathVariable("id") String id) {
		return "blog/admin-basic";
	}
	
	@Auth
	@RequestMapping(value="/admin/category", method=RequestMethod.GET)
	public String adminCategory(@PathVariable("id") String id, Model model) {
		model.addAttribute("categorylist", categoryService.getCategoryList());
		System.out.println(id);
		return "blog/admin-category";
	}
	
	@Auth
	@RequestMapping(value="/admin/category", method=RequestMethod.POST)
	public String adminCategory(@PathVariable("id") String id, CategoryVo categoryVo) {
		categoryService.addCategory(categoryVo);
		//System.out.println(categoryVo);
		return "redirect:/" + id + "/admin/category";
	}
	
	@Auth
	@RequestMapping("/admin/category/delete/{no}")
	public String adminCategory(
			@PathVariable("id") String id,
			@PathVariable("no") Long no) {
		categoryService.deleteCategory(no);
		return "redirect:/" + id + "/admin/category";
	}
	
	@Auth
	@RequestMapping(value="/admin/write", method=RequestMethod.GET)
	public String adminWrite(@PathVariable("id") String id) {
		System.out.println(id);
		return "blog/admin-write";
	}
	
	@Auth
	@RequestMapping(value="/admin/write", method=RequestMethod.POST)
	public String adminWrite(
			@PathVariable("id") String id,
			PostVo postVo,
			@RequestParam(value="categoryNo", required=true) Long no) {
		postVo.setCategoryNo(no);
		categoryService.updateNumPost(no);
		postService.addContents(postVo);
		return "redirect:/" + id + "/admin/category";
	}
	
	@Auth
	@RequestMapping("/upload")
	public String upload(
			@RequestParam("file") MultipartFile multipartFile,
			BlogVo blogVo) {
		String profile = fileUploadService.restore(multipartFile);
		
		blogVo.setProfile(profile);
		blogService.updateImages(blogVo);
		
		//model.addAttribute("url", url);
		//model.addAttribute("galleryVo", galleryVo);
		return "redirect:/gallery";
	}
}

package com.ssafy.mvc.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.ui.Model;

import org.springframework.core.io.Resource;

@Controller
public class FileController {
	
	// 스프링에서 파일이나 클래스 등 리소스를 로드할 때는 리소스로더 인터페이스를 이용해서 가져옴
	private ResourceLoader resourceLoader;
	
//	@Autowired	// 이거 없어도 들어있음 
	public FileController(ResourceLoader resourceLoader) {
		this.resourceLoader = resourceLoader;
	}
	
	@GetMapping("/singleFileForm")
	public String singleFileForm() {
		return "singleFileForm";
	}
	
	@PostMapping("/singleFileUpload")
	public String singleFileUpload(@RequestParam("file") MultipartFile file, Model model) throws IllegalStateException, IOException {
		
		if(file != null && file.getSize() > 0) {
			String fileName = file.getOriginalFilename();
			
			Resource resource = resourceLoader.getResource("classpath:/static/img");
					
			
			 file.transferTo(new File(resource.getFile(), fileName));
			 
			 model.addAttribute("fileName", fileName);
		}

		return "result";
	}
	
	@GetMapping("/download")
	public String fileDownload(@RequestParam("fileName") String fileName, Model model) {
		model.addAttribute("fileName", fileName);
		return "fileDownloadView";
	}
	
	@GetMapping("/multiFileForm")
	public String multiFileForm() {
		return "singleFileForm";
	}
	
	@PostMapping("/multiFileUpload")
	public String multiFileUpload(@RequestParam("files") MultipartFile[] files, Model model) throws IllegalStateException, IOException {
		
		for(MultipartFile file : files)  {
			System.out.println(file.getOriginalFilename());
		}
		return "result";
	}
	
	
}

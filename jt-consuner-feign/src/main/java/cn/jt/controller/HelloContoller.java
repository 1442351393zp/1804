package cn.jt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import cn.jt.feign.EurekaServiceFeign;

@RestController
public class HelloContoller {
	@Autowired
	private EurekaServiceFeign  eurekaServiceFeign;
	

}

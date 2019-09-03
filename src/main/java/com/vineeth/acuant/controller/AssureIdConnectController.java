package com.vineeth.acuant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AssureIdConnectController {

	@Autowired
	AssureIdConnectControllerHelper assureIdHelper;

	@PostMapping
	public ModelAndView getDocumentInstance() {
		int instanceId = assureIdHelper.getDocumentInstance();
		return null;
	}

}

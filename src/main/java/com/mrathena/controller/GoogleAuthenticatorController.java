package com.mrathena.controller;

import com.warrenstrange.googleauth.GoogleAuthenticator;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("google")
public class GoogleAuthenticatorController {

	private final GoogleAuthenticator ga = new GoogleAuthenticator();

	@RequestMapping("captcha")
	public int captcha(String secretKey) {
		return ga.getTotpPassword(secretKey);
	}

}

package com.srccodes.tools.domain;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/**
* @author Abhijit Ghosh
* @version 1.0
*/
public class UrlDeobfuscator {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String complexUrl = "http://www.google.co.in/url?url=http%3A%2F%2Fwww.srccodes.com%2F";
        String simplifiedUrl = URLDecoder.decode(complexUrl, "UTF-8");
        System.out.println("Simplified URL: " + simplifiedUrl);
	}
}

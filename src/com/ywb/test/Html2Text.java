package com.ywb.test;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.parser.ParserDelegator;
/**
 * Title: html转text
 * @description
 * @author yuwb
 * @date 2017年6月2日
 */
public class Html2Text extends HTMLEditorKit.ParserCallback{

	
	
	StringBuffer sb=new StringBuffer();
	public static void main(String[] args) {
		String str="<ul class='nav'><li><a href='http://www.mkfree.com'>index</a></li>"+  
	            "<li class='active'><a href='http://blog.mkfree.com'>blog</a></li>"+  
	            "<li><a href='#'>RSS</a></li></ul>"; 
		StringReader sr=new StringReader(str);
		Html2Text parser=new Html2Text();
		parser.parse(sr);
		sr.close();
	    System.out.println(parser.getText());
	}
	public void parse(Reader in){
		ParserDelegator delegator = new ParserDelegator();
		try {
			delegator.parse(in, this, true);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void handleText(char[] text, int pos) {
	    sb.append(text);
	}

	public String getText() {
	    return sb.toString();
	}

}

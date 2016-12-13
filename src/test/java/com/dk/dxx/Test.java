package com.dk.dxx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
	public static void main(String[] args) {
		
		String str = "sdfsd13*[112323]fdfs-34*[11111]dd";
		String regex = "\\[(.*?)\\]";
	    Pattern pattern = Pattern.compile(regex); //截取中括号里面的字符串
//		Pattern pattern = Pattern.compile("\\[([^\\]]*)\\]");
        Matcher matcher = pattern.matcher(str);
        while(matcher.find()){
            System.out.println(matcher.group(1));
        }
		
	}

}

package com.example.jnidemo;

public class JniClient {
	
	static public native String AddStr(String strA, String strB);
	static public native int AddInt(int a, int b);

}

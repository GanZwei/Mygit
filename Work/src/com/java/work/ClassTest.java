package com.java.work;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

import org.junit.Test;

public class ClassTest {
	@Test
	public void test(){
		try {
			Class<?> cla=Class.forName("com.java.work.Product");
			Constructor<?> cs=cla.getConstructor();
			Object o=cs.newInstance();
			Field[] field=cla.getFields();
			for(Field f:field){
				String s=f.getType().getSimpleName();
				System.out.println(s);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
		System.out.println();
	}
}

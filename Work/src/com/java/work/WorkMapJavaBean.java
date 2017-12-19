package com.java.work;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class WorkMapJavaBean {
	@Test
	public void test() throws Exception{
		Map<String,Object> m=new HashMap<String,Object>();	
		m.put("name","����");
		m.put("age", 21);
		m.put("id", 1);
		m.put("addres", "�Ĵ��ɶ�");
		Class<?> classType= Class.forName("com.java.work.Product");
		System.out.println(format(m,classType));
	}
	
	public static<T> T format(Map<String, Object> map, Class<? extends T> classType){
		Set<Map.Entry<String,Object>> set=map.entrySet();
		Iterator<Map.Entry<String,Object>> entrys=set.iterator();
		//����ʵ��
		Object obj = null;
		try {
			obj = classType.newInstance();
			while(entrys.hasNext()){
					Map.Entry<String,Object> entry=entrys.next();
					//���K,Vֵ
					String key=entry.getKey();
					Object value=entry.getValue();
//					System.out.println(key+"------"+value);
					//�������
					//String className=classType.getSimpleName();
					//System.out.println(className);
					
				//key����Ӧget�ķ�����
				String getmethodName="get"
				+key.substring(0, 1).toUpperCase()
				+key.substring(1);
				//key����Ӧset�ķ�����
				String setmethodName="set"
						+key.substring(0, 1).toUpperCase()
						+key.substring(1);
				for(Field field:classType.getDeclaredFields()){
					String setfieldName="set"
							+field.getName().substring(0, 1).toUpperCase()
							+field.getName().substring(1);
					//�Ƚ�key-set��field-set
					if(setmethodName.equals(setfieldName)){
						Method getMethod=classType.getMethod(getmethodName);
						Method setMethod=classType.getMethod(setmethodName,getMethod.getReturnType());
						setMethod.invoke(obj,value);					
						//System.out.println(obj);
					}
				}
				//System.out.println(field.getType());
//				System.out.println(int.class);
					}
		} catch (Exception e) {
			e.printStackTrace();
		} 
		//System.out.println(obj);
		return (T) obj;
	}
	
}

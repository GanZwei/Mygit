package com.java.work;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;

public class JSONWork {
	public <T> T format(Map<String, Object> map, Class<T> cls){
		return null;
	} 
	public Person parsePerson(String str){
		Person person = null;
		try {
			JSONObject json=new JSONObject(str);
			if(json.getBoolean("status")==true){
				JSONObject info=json.getJSONObject("info");
				String name=info.getString("name");
				int age=info.getInt("age");
				String address=info.getString("addres");
				person=new Person(name,age,address);
			}
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return person;
	}

	public List<Person> parsePersonList(String str){
		List<Person> li=new ArrayList<Person>();
		try {
			JSONObject json=new JSONObject(str);
			if(json.getBoolean("status")==true){
			JSONArray info=json.getJSONArray("info");
				for(int i=0;i<info.length();i++){
					JSONObject obj=info.getJSONObject(i);
					String name=obj.getString("name");
					int age=obj.getInt("age");
					String address=obj.getString("addres");
					Person person=new Person(name,age,address);
					li.add(person);
				}
			}
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return li;
	}
	
	@Test
	public void test1(){
		String str="{status:true, info:{name:'张三', age:22,addres:'四川成都'}}";
		System.out.println(parsePerson(str));
	}
	@Test
	public void test2(){
		String str="{status:true, info:[{name:'张三', age:22,addres:'四川成都'},{name:'张三', age:22,addres:'四川成都'},{name:'张三', age:22,addres:'四川成都'}]}";
		System.out.println(parsePersonList(str));
	} 
	@Test
	public void test(){
		
	}
}


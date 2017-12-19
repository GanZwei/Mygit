package com.w3c.xml;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.junit.Test;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class UserSaxparse {
	
	@Test
	public void test(){
		SAXParserFactory fac = SAXParserFactory.newInstance();
		fac.setNamespaceAware(true);
		try {
			SAXParser parser = fac.newSAXParser();
			InputStream in = UserSaxparse.class.getResourceAsStream("user.xml");
			parser.parse(in, new MyHandler());
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	class MyHandler extends DefaultHandler{
		private DatabaseConnection dbc;
		private PreparedStatement stat;
		private Connection con;
		private String name;
		private int userid;
		@Override
		public void startDocument() throws SAXException {
			System.out.println("开始读取文档");
		}
		@Override
		public void endDocument() throws SAXException {
			System.out.println("文档读取结束");
		}
		@Override
		public void startElement(String uri, String localName, String qName, Attributes attributes)
				throws SAXException {
			String sql="insert into user(id) values(?)";
			name=localName;
			if (localName.equalsIgnoreCase("user")){
				String attr= attributes.getValue("id");
				userid=Integer.parseInt(attr);
				System.out.println("属性：" + attr);
				try {
					dbc=new DatabaseConnection();
					con=dbc.getConnection();
					stat=con.prepareStatement(sql);
					stat.setInt(1, userid);
					stat.executeUpdate();
					dbc.close();
					stat.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			
		}
		@Override
		public void endElement(String uri, String localName, String qName) throws SAXException {
			
			if (localName.equalsIgnoreCase("user")){
				System.out.println("------------------");
			}
		}
		@Override
		public void characters(char[] ch, int start, int length) throws SAXException {
			String str = new String(ch, start, length).trim();
			String sql="update user set ?=? where id=?";
			if (!str.isEmpty()){
				System.out.println(name+"-->" + str);
				try {
					dbc=new DatabaseConnection();
					con=dbc.getConnection();
					stat=con.prepareStatement(sql);
					stat.setString(1, name);
					stat.setString(2, str);
					stat.setInt(3,userid);
					stat.executeUpdate();
					dbc.close();
					stat.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		}
	}
}

package com.text;

import java.io.File;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class Xpathtext {

	public static void main(String[] args) {
		try {
			//1 创建sax读取对象
			SAXReader reader = new SAXReader();
			//2 指定解析xml源
			Document document = reader.read(new File("src/xml/stu.xml"));
			
			//3 得到元素
			//得到根元素
			Element rootElement = document.getRootElement();
			
			//要想使用xpath 添加支持的jar包 
			//获取第一个元素
			Element nameElement = (Element)rootElement.selectSingleNode("//name");
			System.out.println(nameElement.getText());
			
			System.out.println("-----------------------");
			
			//获取所有元素
			List<Element> list= rootElement.selectNodes("//name");
			for (Element element : list) {
				System.out.println(element.getText());
			}
			
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

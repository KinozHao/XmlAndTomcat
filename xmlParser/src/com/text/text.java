package com.text;

import java.io.File;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class text {

	public static void main(String[] args) {
		try {
			//1 创建sax读取对象
			SAXReader reader = new SAXReader();
			//2 指定解析xml源
			Document document = reader.read(new File("src/xml/stu.xml"));
			
			//3 得到元素
			//得到根元素
			Element rootElement = document.getRootElement();

			//获取根元素下面的子元素age
//			rootElement.element(age)args;
//			System.out.println(rootElement.element("stu").element("age").getText());
			
			//获取根元素下的所有子元素
			java.util.List<Element> elements = rootElement.elements();
			
			//遍历所有的stu元素
			for (Element element : elements) {
				//获取stu下的name元素
				String name =element.element("name").getText();
				String age =element.element("age").getText();
				String address =element.element("address").getText();
				
				
				System.out.println(name+age+address);
			}
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

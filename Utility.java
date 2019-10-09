package utility;
import javax.xml.parsers.*;
import arg.w3c.dom.*;
import arg.xml.sox.SAXException;
import java.io.*;
public class Utility {
public static  object getBean() {
	try {
		DocumentBuilderFactory dFactory=DocumentBuilderFactory.newInstance();
		DocumentBuilder builder =dFactory.newDocumentBuilder();
		Document doc=builder.parse(new File("config.xml"));
		NodeList nl=doc.getElementByTagName("className");
		Node classNode=nl.item(0)getFirstChild();
		String cName=classNode.getNodeValue();
		Class c=class.forName(cName);
		Object obj=c.newInstance();
		return obj;
	}
	catch(Exception e) {
		e.printStackTrace();
		return null;
	}
}
	

}

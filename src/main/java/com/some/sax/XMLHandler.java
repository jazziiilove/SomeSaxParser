/* 
 * Assignment: Some Sax		                 *
 * Programmer: Baran Topal                   *
 * File name: XMLHandler.java                *
 *                                           *      
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * 
 *	                                                                                         *
 *  LICENSE: This source file is subject to have the protection of GNU General               *
 *	Public License. You can distribute the code freely but storing this license information. *
 *	Contact Baran Topal if you have any questions. barantopal@barantopal.com                 *
 *	                                                                                         *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *  
 */

package com.some.sax;
import java.util.ArrayList;
import java.util.Iterator;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class XMLHandler {

	public ArrayList<Employee> al = new ArrayList<Employee>();
	public Employee employee = null;
	public String tempVal = null;

	public void parseDocument()
	{
		SAXParserFactory spf = SAXParserFactory.newInstance();
		try
		{
			SAXParser sp = spf.newSAXParser();
			DefaultHandler dh = new DefaultHandler() 
			{
				public void startElement(String uri, String localName,String qName,
						Attributes attributes) throws SAXException 
				{

					System.out.println("QName: " + qName);
					tempVal = "";
					if(("Employee").equalsIgnoreCase(qName))
					{

						employee = new Employee();
						employee.setType(attributes.getValue("type"));
						System.out.println("Val:" + attributes.getValue("type"));
					}
				}
				public void characters(char [] ch, int start, int length)
				{		
					tempVal = new String(ch, start, length);				
				}

				public void endElement(String uri, String localName,
						String qName) throws SAXException {
					System.out.println("QNameE: " + qName);
					if(("Employee").equalsIgnoreCase(qName))
					{
						al.add(employee);		
					}
					else if(("Name").equalsIgnoreCase(qName))
					{
						employee.setName(tempVal);	
					}
					else if(("Id").equalsIgnoreCase(qName))
					{
						employee.setId(Integer.parseInt(tempVal));
					}
					else if(("Age").equalsIgnoreCase(qName))
					{
						employee.setAge(Integer.parseInt(tempVal));
					}
				}	
			};

			sp.parse("my.xml", dh);					

		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}



	public void printData()
	{
		System.out.println("Number of employees: " + al.size());

		Iterator<Employee> it = al.iterator();
		while(it.hasNext())
		{
			System.out.println((Employee)it.next());
		}
	}
}

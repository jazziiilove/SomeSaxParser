/* 
 * Assignment: Some Sax		                 *
 * Programmer: Baran Topal                   *
 * File name: Employee.java                  *
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

public class Employee {

	public String name;
	public int id;
	public int age;
	public String type;

	public void setName(String name)
	{
		this.name = name;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	public String toString()
	{
		return "Name: " + name + " Id: " + id + " Age: " + age + " Type: " + type + "\n";
	}
}

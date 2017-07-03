/* 
 * Assignment: Some Sax		                 *
 * Programmer: Baran Topal                   *
 * File name: SAXEx.java 	                 *
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

public class SAXEx {

	/**
	 * @param args
	 */
	public static void main (String[] args) {
		// TODO Auto-generated method stub
		XMLHandler xml = new XMLHandler();
		xml.parseDocument();			
		xml.printData();		
	}
}

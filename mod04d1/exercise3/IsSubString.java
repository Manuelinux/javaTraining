/*
 *      IsSubString.java
 *      
 *      Copyright 2010 Manuel Aguirre <manuel.aguirre@phsistemas.net>
 *      
 *      This program is free software; you can redistribute it and/or modify
 *      it under the terms of the GNU General Public License as published by
 *      the Free Software Foundation; either version 2 of the License, or
 *      (at your option) any later version.
 *      
 *      This program is distributed in the hope that it will be useful,
 *      but WITHOUT ANY WARRANTY; without even the implied warranty of
 *      MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *      GNU General Public License for more details.
 *      
 *      You should have received a copy of the GNU General Public License
 *      along with this program; if not, write to the Free Software
 *      Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 *      MA 02110-1301, USA.
 */


public class IsSubString {
	public boolean isSubString(String word, String sentence)
	{
		boolean found=false;
		int j=0;
		for(int i=0; i<sentence.length();i++)
		{
			found=false;			
				for(j=0;j<word.length();j++)
				{
					if((j+i) < sentence.length())
					{
					if(word.charAt(j)==sentence.charAt(i+j))
					{
						found=true;	
					}
					else
					{
					    found=false;
					    break;
				    }
				    }
				    else
				    {found=false;
				    break;}
				    if(found) break;
				}
				if(found) break;
			
		}
		return found;
	}
	public static void main (String args[]) {
		IsSubString str=new IsSubString();
		System.out.println(str.isSubString("Jane","Tommorow, Jane will take Bill to the concert"));
	}
}


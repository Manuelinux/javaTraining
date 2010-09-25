/*
 *      TestMyPoint.java
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


public class TestMyPoint {
	
	public static void main (String args[]) {
		MyPoint start = new MyPoint();
		MyPoint end = new MyPoint();
		start.x=10;
		start.y=10;
		end.x=20;
		end.y=30;
		System.out.println("Start point is " + start);
		System.out.println("End point is " + end);
		MyPoint stray = new MyPoint();
		stray=end;
		System.out.println("Stray point is " + stray);
		System.out.println("End point is " + end);
		stray.x=50;
		stray.y=80;
		System.out.println("Stray point is " + stray);
		System.out.println("End point is " + end);
		System.out.println("Start point is " + start);
	}
}


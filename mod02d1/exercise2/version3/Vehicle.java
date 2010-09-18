/*
 *      Vehicle.java
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


public class Vehicle {

	private double load;
	private double maxLoad;
	public Vehicle(double max_load)
	{
		maxLoad = kiloToNewts(max_load);
	}
	public double getLoad()
	{
		return newtsToKilo(load);
	}
	public double getMaxLoad()
	{
		return newtsToKilo(maxLoad);
	}
	public boolean addBox(double weight)
	{
		if((load + kiloToNewts(weight))<maxLoad)
		{
			load+=kiloToNewts(weight);
			return true;
		}
		else
		return false;
	}
	private double newtsToKilo(double weight)
	{
		return(weight / 9.8);
	}
	private double kiloToNewts(double weight)
	{
		return(weight*9.8);
	}
}

/*
 *      CheckingAccount.java
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

package banking;
public class CheckingAccount {
	private double overdraftProtection;
	public CheckingAccount(double balance)
	{
		super(balance);
	}
	public CheckingAccount(double balance, double protect)
	{
		super(balance);
		overdraftProtection=protect;
	}
	public boolean withdraw(double amt)
	{
		if(balance<amt)
		{
			if((balance-amt)<overdraftProtection)
			{
				balance=0.0;
				return true;
			}
			else
			return false;
		}
		else
		{
			balance-=amt;
			return true;
		}
	}
}


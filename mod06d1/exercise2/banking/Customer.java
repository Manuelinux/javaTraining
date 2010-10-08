/*
 *      Customer.java
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

public class Customer {
	private String firstName;
	private String lastName;
	private Account[] accounts= new Account[5];
	private int numberOfAccounts =-1;
	public Customer(String f, String l)
	{
		firstName=f;
		lastName=l;
	}
	public String getFirstName()
	{
		return firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public Account getAccount(int index)
	{
		return accounts[index];
	}
	public void addAccount(Account acct)
	{
		numberOfAccounts++;
		accounts[numberOfAccounts]=acct;
	}
	public int getNumOfAccounts()
	{
		return numberOfAccounts+1;
	}
}


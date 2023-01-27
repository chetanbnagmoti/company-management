package org.fi.program;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.fi.employee.Display;
import org.fi.employee.Employee;
import org.fi.employee.Engineer;
import org.fi.employee.Manager;
import org.fi.employee.SalePerson;

import Calculator.in.ConsolInput;
import cdac.in.linkedlist.nodeinteface.LinkedList;



public class MainProgram {

	public static void main(String[] args) {

		try {
			LinkedList<Employee> objList = new LinkedList<>();

			int choice = 1;

			while (choice != 10) {
				System.out.println("1)Add Manager.\n2)Add Engineer\n3)Add Sales Person.\n4)Display All.\n5)Sort By Name.\n"
						+ "6)Sort By Designation.\n7)Delete.\n8)Save.\n9)Load.\n10)Exit.");
				System.out.println("Enter the choice:-");
				choice = ConsolInput.getInteger();

				switch (choice) {

				case 1:
				case 2:
				case 3:

				{

					try {
						System.out.println("Enter the Name:-");
						String name = ConsolInput.getString();

						System.out.println("Enter the Address:-");
						String address = ConsolInput.getString();

						System.out.println("Enter the Age:-");
						int age = ConsolInput.getInteger();

						System.out.println("Enter the Gender:-");

						boolean gender = ConsolInput.getBoolean();

						System.out.println("Enter the Basic Salary:-");
						float basicSalary = ConsolInput.getFloat();

						if (choice == 1) {

							System.out.println("Enter the HRA:-");
							float hra = ConsolInput.getFloat();

							Manager objManager = new Manager(name, address, age, gender, basicSalary, hra);
							objList.add(objManager);

						} else if (choice == 2) {
							System.out.println("Enter the Over Time:-");
							float overTime = ConsolInput.getFloat();

							Engineer objEnginner = new Engineer(name, address, age, gender, basicSalary, overTime);
							objList.add(objEnginner);

						} else {
							System.out.println("Enter the commision:-");
							float commision = ConsolInput.getFloat();

							SalePerson objSalePerson = new SalePerson(name, address, age, gender, basicSalary, commision);
							objList.add(objSalePerson);

						}
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}

					break;

				case 4: {

					
					Display objDispaly=new Display();
					objDispaly.show(objList);
					

				}

					break;

				case 5: {
					int ch;
					do {
						System.out.println(
								"Enter Your Choice :-\na)By Name Asending\nb)By Name Desending.\nc)Exit Form This Menu");
						choice = ConsolInput.getString().charAt(0);
						switch (choice) {

						case 'a':
							int index = 0;
							Employee objEmployee = objList.getFirst();
							String[] name = new String[objList.getCount()];

							while (objEmployee != null) {

								name[index] = (String) objEmployee.getName();
								index++;

								objEmployee = (Employee) objList.getNext();
							}
							
							System.out.println("Normal Arrays");
							for (String str1 : name) {
								System.out.print(str1+" ");
							
							}
							
							System.out.println("Sorting Arrays");
							
							for (int j = 0; j < name.length; j++) {
							   	   for (int i = j + 1; i < name.length; i++) {
									// comparing adjacent strings
									if (name[i].compareTo(name[j]) < 0) {
										String temp;
										temp = name[j];
										name[j] = name[i];
										name[i] = temp;
									}
								   }
								   System.out.print(name[j]);
								}
							
							
							
							break;
						case 'b':
							index = 0;
							 objEmployee =  objList.getFirst();
							 name = new String[objList.getCount()];

							while (objEmployee != null) {

								name[index] = (String) objEmployee.getName();
								index++;

								objEmployee = (Employee) objList.getNext();
							}
							
							System.out.println("Normal Arrays");
							for (String str1 : name) {
								System.out.print(str1+" ");
							
							}
							
							System.out.println("Sorting Arrays");
							
							for (int j = 0; j < name.length; j++) {
							   	   for (int i = j + 1; i < name.length; i++) {
									// comparing adjacent strings
									if (name[i].compareTo(name[j]) < 0) {
										String temp;
										temp = name[i];
										name[i] = name[j+1];
										name[j+1] = temp;
									}
								   }
								   System.out.print(name[j]);
								}
							
							break;
						case 'c':
							
							break;
						}

						System.out
								.println("Do you Have Continue this Menu:-\nThen Please Enter (1 for Yes) and (2 for No)");
						 ch = ConsolInput.getInteger();
					} while (ch != 2);
				}
				

					break;
				case 6: {
					int option = 1;
					{
						while (option != 4) {
							System.out.println("1)Manager.\n2)Engineer.\n3)Sales Person.\n4)Exi");
							System.out.println("Enter the choice:-");
							option = ConsolInput.getInteger();
							switch (option) {
							case 1: {
								Employee objEmployee = objList.getFirst();

								while (objEmployee != null) {
									if (objEmployee instanceof Manager) {
										Manager objManager = (Manager) objEmployee;
										System.out.println(objManager.getName());
										System.out.println(objManager.getAddress());
										System.out.println(objManager.getAge());
										if (objManager.isGender())
											System.out.println("Male");
										else
											System.out.println("Female");

										System.out.println(objManager.getBasicSalary());
										System.out.println(objManager.computeSalry());
										System.out.println(objManager.totalSalary());
										System.out.println(" HRA:- " + objManager.getHra());
										System.out.println("-----------------------------------------");

									}
									objEmployee = objList.getNext();

								}

							}

								break;
							case 2: {
								Employee objEmployee = objList.getFirst();

								while (objEmployee != null) {
									if (objEmployee instanceof Engineer) {
										Engineer objEngineer = (Engineer) objEmployee;
										System.out.println(objEngineer.getName());
										System.out.println(objEngineer.getAddress());
										System.out.println(objEngineer.getAge());
										if (objEngineer.isGender())
											System.out.println("Male");
										else
											System.out.println("Female");

										System.out.println(objEngineer.getBasicSalary());
										System.out.println(objEngineer.computeSalry());
										System.out.println(objEngineer.totalSalary());

										System.out.println(" OverTime:- " + objEngineer.getOverTime());
										System.out.println("-----------------------------------------");

									}
									objEmployee =  objList.getNext();

								}

							}

								break;
							case 3: {
								Employee objEmployee =  objList.getFirst();

								while (objEmployee != null) {
									if (objEmployee instanceof SalePerson) {
										SalePerson objSalePerson = (SalePerson) objEmployee;
										System.out.println(objEmployee.getName());
										System.out.println(objEmployee.getAddress());
										System.out.println(objEmployee.getAge());
										if (objEmployee.isGender())
											System.out.println("Male");
										else
											System.out.println("Female");

										System.out.println(objEmployee.getBasicSalary());
										System.out.println(objEmployee.computeSalry());
										System.out.println(objEmployee.totalSalary());
										System.out.println(" Commision:- " + objSalePerson.getCommision());
										System.out.println("-----------------------------------------");

									}
									objEmployee =  objList.getNext();
								}

							}

								break;

							}
						}

					}

				}

					break;
				case 7:{
					System.out.println("Enter the Name of Employee :-");
					String name = ConsolInput.getString();
					Employee objEmployee = objList.getFirst();
					int index = 0;
					while(objEmployee!=null)
					{
						if(name.equals(objEmployee.getName()))
						{
							objList.remove(index);
							break;
						}
						objEmployee = objList.getNext();
						index++;
					}
					
					
				}
				
			
				break;
				case 8: {
					
					if(objList.getCount() > 0)
					{
						FileOutputStream fileOutputStream = null;
						ObjectOutputStream objectOutputStream = null;
						
						System.out.println("Enter the file name");
						String fileName = ConsolInput.getString();
						
						try {
							fileOutputStream = new FileOutputStream(fileName);
							objectOutputStream = new ObjectOutputStream(fileOutputStream);
							
							Object data = objList.getFirst();
							while(data!=null)
							{
								objectOutputStream.writeObject(data);
								data = objList.getNext();
							}
							System.out.println("Objects saved in the file " + fileName);
						} catch (FileNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						finally
						{
							try {
								if(objectOutputStream!=null)
									objectOutputStream.close();
								if(fileOutputStream!=null)
									fileOutputStream.close();
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					}
				
				}
					break;
				case 9: {
					FileInputStream fileInputStream = null;
					ObjectInputStream objectInputStream = null;
					
					try {
						System.out.println("Enter the filename to load");
						String fileName = ConsolInput.getString();
						
						fileInputStream  = new FileInputStream(fileName);
						objectInputStream = new ObjectInputStream(fileInputStream);
						
						try {
							do
							{
								Object data = objectInputStream.readObject();
								objList.add((Employee)data);
								
							}while(true);							
						} catch (ClassNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
							
						}
						catch(EOFException e)
						{
							System.out.println("File Loaded successfully...");
						}
						catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}						
					finally
					{
						try {
							if(objectInputStream!=null)
								objectInputStream.close();
							if(fileInputStream!=null)
								fileInputStream.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					
				}
					break;
				case 10: {
					System.exit(0);
				}
					break;
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
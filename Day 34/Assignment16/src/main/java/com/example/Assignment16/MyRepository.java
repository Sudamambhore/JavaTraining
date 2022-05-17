package com.example.Assignment16;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

@Repository
public class MyRepository {
	@PersistenceUnit
	private EntityManagerFactory emf;
	void getData()
	{
		EntityManager em;
		em=emf.createEntityManager();
		String jsql=" ";
		Query q;
		int ch;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println();
			System.out.println();
			System.out.println("****************************");
			System.out.println("Select operation you want to perform?: ");
			System.out.println("1 - UPDATE");
			System.out.println("2 - DELETE");
			System.out.println("3 - SELECT");
			System.out.println("Enter you choice: ");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					try 
					{
						System.out.println("You have selected UPDATE option");
						em.getTransaction().begin();
						System.out.println("Enter ID to Upadate record");
						int id1=sc.nextInt();
						System.out.println("Enter student name to be updated");
						String name1=sc.next();
						jsql="update Student e set e.name='"+name1+"'where e.id="+id1+"";
						q=em.createQuery(jsql);
						q.executeUpdate();
						em.getTransaction().commit();
						System.out.println("Record UPADATED successfully!!");
						
					} 
					catch (Exception e) 
					{
						System.out.println("No such record found");
					}
					break;
					
				case 2:
					
					System.out.println("You have selected DELETE operation");
					try
					{
						em.getTransaction().begin();
						System.out.println("Enter ID to Upadate record");
						int id2=sc.nextInt();
						jsql="delete from Student e where e.id="+id2+"";
						q=em.createQuery(jsql);
						q.executeUpdate();				
						em.getTransaction().commit();
						System.out.println("Record deleted Successfully!!");
						
					}
					catch (Exception e) {
						System.out.println("Sorry!,No such Data Found in table to update!!");
					}
					break;
					
				case 3:
					
					System.out.println("You have selected SELECT operation");
					System.out.println("Press 1 for SelectAll");
					System.out.println("Press 2 for Select Perticular Record");
					System.out.println("Please enter your choice:");
					int c=sc.nextInt();
					if(c==1)
					{
						
						em.getTransaction().begin();
						jsql="select e from Student as e";
						q = em.createQuery(jsql);
						List<Student> stdlist=q.getResultList();
						System.out.println("Printing all Record from Table: ");
						for(Student s1:stdlist)
						{
							System.out.println("  Sudent ID: "+s1.getId()+"  Student name is: "+s1.getName());
						}
						
					}
					else if (c==2) 
					{
						
						try 
						{
							System.out.println("Enter ID whose data you want?: ");
							int i11=sc.nextInt();
							jsql = "select e from Student e where e.id="+i11+"";
							q=em.createQuery(jsql);
							Student s2=(Student)q.getSingleResult();
							System.out.println("Record selected for given ID "+i11+" and ");
							System.out.println("Student name is: "+s2.getName());
							em.getTransaction().commit();
							
						}
						catch (Exception e)
						{
							//System.out.println("No data To select for this ID");
						}
					}
					else 
					{
						System.out.println("Invalid choice");
					}
					break;
					
				case 4:
					{
						
						System.out.println("You have EXIT the Application");
						System.exit(0);
						
					}
					
				default:
					{
						
						System.out.println("You Entered Wrong Option");
						
					}
					System.out.println("****************************");
					System.out.println();
					System.out.println();
				}
			}while(true);
	}
}



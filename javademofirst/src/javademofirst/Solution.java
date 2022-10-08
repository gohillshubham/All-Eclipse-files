package javademofirst;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        @SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);

        College[] colleges=new College[4];

        int in=sc.nextInt();sc.nextLine();

        for (int i = 0; i <in ; i++) {

            int a=sc.nextInt();sc.nextLine();

            String b=sc.nextLine();

            int c=sc.nextInt();sc.nextLine();

            String d=sc.nextLine();

            int e=sc.nextInt();sc.nextLine();



            colleges[i]=new College(a,b,c,d,e);



        }

        String  input=sc.nextLine();



       College ans1= findCollegeWithMaximumPincode(colleges);

      if(ans1==null)

      {

          System.out.println("No college found with mentioned attribute");

      }

      else

      {

          System.out.println("id-"+ans1.id);

          System.out.println("name-"+ans1.name);

          System.out.println("contactNo-"+ans1.contactNo);

          System.out.println("address-"+ans1.address);

          System.out.println("pincode-"+ans1.pincode);

      }





       College ans2= searchCollegeByAddress(colleges,input);

       if(ans2==null)

       {

           System.out.println("No college found with mentioned attribute");

       }

       else

       {

           System.out.println("id-"+ans2.id);

           System.out.println("name-"+ans2.name);

           System.out.println("contactNo-"+ans2.contactNo);

           System.out.println("address-"+ans2.address);

           System.out.println("pincode-"+ans2.pincode);

       }

    }

   public static College findCollegeWithMaximumPincode(College[] colleges)

    {

        int maxx=colleges[0].pincode;

        for (int i = 1; i <colleges.length ; i++) {

            if(colleges[i].pincode>maxx)

            {

                maxx=colleges[i].pincode;

            }

        }

        for (int i = 0; i <colleges.length ; i++) {

            if(colleges[i].pincode==maxx)

            {

                return colleges[i];

            }

        }



        return null;

    }



   public static College searchCollegeByAddress(College[] colleges,String input)

    {

        for (int i = 0; i < colleges.length; i++) {

            if(colleges[i].address.equalsIgnoreCase(input))

            {

                return colleges[i];

            }

        }



        return null;

    }





}





class College{

    int id;

    String name;

    int contactNo;

    String address;

    int pincode;



    //constructor





    public College(int id, String name, int contactNo, String address, int pincode) {

        this.id = id;

        this.name = name;

        this.contactNo = contactNo;

        this.address = address;

        this.pincode = pincode;

    }



    //getter and setter



    public int getId() {

        return id;

    }



    public void setId(int id) {

        this.id = id;

    }



    public String getName() {

        return name;

    }



    public void setName(String name) {

        this.name = name;

    }



    public int getContactNo() {

        return contactNo;

    }



    public void setContactNo(int contactNo) {

        this.contactNo = contactNo;

    }



    public String getAddress() {

        return address;

    }



    public void setAddress(String address) {

        this.address = address;

    }



    public int getPincode() {

        return pincode;

    }



    public void setPincode(int pincode) {

        this.pincode = pincode;

    }

}


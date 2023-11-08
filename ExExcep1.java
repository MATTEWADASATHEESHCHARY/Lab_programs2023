/*
Exception Handling :
--------------------

        * To handle the runtime error to prevent from    
            prgram termination or loss of data.

        * java language have collection of built-in exception
          classes for most of the runtime errors.

        * java throws the built-in exception automatically
          according to the runtime errors occured in your program,
          and displays the runtime error in console and stops the
          program execution.

         * same way User can handle the exceptions using inbuilt 
		 exception classes or user defined one.

User defined Exception Handling :
---------------------------------
        * used to continue the remaining part of the program
          execution even runtime error occured in your program.

Types of Exception Handling in java :
-------------------------------------
        1) Block Level (or) Statement Level Exception Handling
        2) Method (or) Function Level Exception Handling

Syntax for Handling a Block or Statement Level Exception :
-----------------------------------------------------------

try :
---
        * keyword - used to define the error block in your program

try
{
        Error Block Statements;
        ..
        ..
        }
catch(Exception e)
{
        Display the runtime error message with help of the Exception object;
        }
finally
{
        Remaining part of the program;
        }

we must define the catch function after defining a try block.
a catch function is called by the system automatically during the error occured in try block,
 otherwise the system skips the catch function.

*/

import java.lang.*;

class ExExcep1
{
        public static void main(String argv[])
        {
                int a,b,c,d;

                a = Integer.parseInt(argv[0]);
                b = Integer.parseInt(argv[1]);
        try
        {
                c = a/b;
                System.out.println(a + "/" + b + "=" + c);
                }
        catch(Exception e)
        {
		System.out.println(e);
		b=1;
		c = a/b;
                System.out.println(a + "/" + b + "=" + c);
                
               
          }

                d = a*b;
                System.out.println(a + "*" + b + "=" + d);
                }
        }
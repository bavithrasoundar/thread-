import java.util.*;
class Cake implements Runnable{
public void run()
{
System.out.println("mixing...."+Thread.currentThread().getId());
System.out.println("backing...."+Thread.currentThread().getId());
System.out.println("decoration...."+Thread.currentThread().getId());
}}
class ThreadBaking
{
public static void main(String []args)
{
int cakecount=4;
for(int i=0;i<=cakecount;i++);
{
Cake cake=new Cake();
Thread thread1=new Thread(cake);
Thread thread2=new Thread(cake);
Thread thread3=new Thread(cake);
thread1.setPriority(1);
thread2.setPriority(5);
thread3.setPriority(10);
thread1.start();
thread2.start();
thread3.start();
}}}
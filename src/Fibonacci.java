/*
def Fibo(n):
    try:
        n = int(n)
    except:
        print("Your Num is not a number")
    if n<0:
        print("Incorrect input")
    elif n==1:
        return 0
    elif n==2:
        return 1
    else:
        return Fibonacci(n-1)+Fibonacci(n-2)
number = input("Enter a Number ")
print(Fibo(number))
 */
class fibo
{
    static int fib(int n)
    {
        if (n == 0) {
            return 0;
        } else if (n ==1) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static void main (String args[])
    {
        int n = 3;
        System.out.println(fib(n));
    }
}
public class example {
    public static void main(String args[]) {
        int a[] = new int[1];
                try {
                    System.out.println("a :" + a[0]);
                }
                    catch(ArrayIndexOutOfBoundsException e)
                    {
                        System.out.println("Exception thrown" +e);
                    }
                finally{
                    a[0]= 10;
                    System.out.println("first element value: " +a[0]);
                    System.out.println("Finally statement is executed");
                }
    }
}


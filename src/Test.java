class Test
{
    public static void main(String[] args)
    {
        testSum();
        testDiv();
        testSub();
        testMul();
    }

    private static void testSum()
    {
        int a = 5;
        int b = 6;
        int expected = 11;
        BasicMath bm = new BasicMath();
        int result = bm.sum(a, b);
        if (result == expected)
        {
            System.out.println("Sum: OK");
        }
        else
        {
            System.out.println("Sum: Failed, expected = " + expected + ", result = " + result);
        }
    }    
    private static void testDiv()
    {
        int a = 5;
        int b = 5;
        int expected = 1;
        BasicMath bm = new BasicMath();
        int result = bm.div(a, b);
        if (result == expected)
        {
            System.out.println("Div: OK");
        }
        else
        {
            System.out.println("Div: Failed, expected = " + expected + ", result = " + result);
        }
    }
    private static void testSub()
    {
        int a = 5;
        int b = 6;
        int expected = -1;
        BasicMath bm = new BasicMath();
        int result = bm.subtract(a, b);
        if (result == expected)
        {
            System.out.println("Subtraction: OK");
        }
        else
        {
            System.out.println("Subtraction: Failed, expected = " + expected + ", result = " + result);
        }
    }
    
    private static void testMul()
    {
        int a = 5;
        int b = 6;
        int expected = 30;
        BasicMath bm = new BasicMath();
        int result = bm.multiply(a, b);
        if (result == expected)
        {
            System.out.println("Multiply: OK");
        }
        else
        {
            System.out.println("Multiply: Failed, expected = " + expected + ", result = " + result);
        }
    }
}

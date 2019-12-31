public class Main {
    public static void main(String[] args) {

        //es1();
        es2();

    }

    private static void es2()
    {
        for (int i = 0; i < 10; i++) {
            System.out.println("from for loop : "+i);
        }

        int count = 0;

        while (true)
        {
            count++;

            System.out.println("from while loop : "+count);
            if (count == 10)
            {
                break;
            }
        }

        count = -1;
        do {
            count++;
            System.out.println("from do while loop : "+count);
        }
        while (count < 10);

    }

    private static void es1()
    {
        String value = "amir";
        if(value.equals("amir") )
        {
            System.out.println("are shart doroste");
        }else
        {
            System.out.println("are shart eshtebahe");
        }

        switch (value)
        {
            case "amir":
            {
                System.out.println("value amir e");
                break;
            }
            case "gholi" :
            {
                System.out.println("value gholie");
                break;
            }

            case "mamad" :
            {
                System.out.println("value mamad e");
            }

            default:{
                System.out.println("value namoshakhas e");
                break;
            }
        }
    }
}

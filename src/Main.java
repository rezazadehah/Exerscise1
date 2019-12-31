public class Main {
    public static void main(String[] args) {

        es1();

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

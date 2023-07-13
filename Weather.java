public class Weather {
    public static void main(String[] args) {
        String weather = "Sunny";
        // int A = 10;
        // int result = A%2;
        // switch(result)
        // {
        //     case 0:
        //     {

        //     }
        // }

        switch(weather)
        {
            case "Rainy":
                {
                    System.out.println("Take Umbrella");
                    break;
                }
            case "Sunny":
            case "Playing Cricket":
                {
                    System.out.println("Wear Sunglass");
                    break;
                }
            // case "Playing Cricket":
            // {
            //     System.out.println("Wear Sunglass");
            //     break;
            // }    
            default:{
                System.out.println("Check Weather");
                //break;
            }   
        }
    }
}

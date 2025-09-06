public class TestSwitch 
{
    public static void main(String[] args) 
    {
        int month = 2;
        
        switch(month)
        {
            case 2:
                System.out.println("28 Days");
                break;
            case 4:
                System.out.println("30 Days");
                break;
            case 6:
                System.out.println("30 Days");
                break;
            case 9:
                System.out.println("30 Days");
                break;
            case 11:
                System.out.println("30 Days");
                break;
            default:
                System.out.println("31 Days");
                break;
        }
    }
}

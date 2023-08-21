public class App 
{
    public static void main(String[] args) 
    {
        
        if(args.length == 0)
        {
            System.out.println("\nType 'java App help' for help menu");
            Methods_adv.printHelp();
            return;
        }
        
        Methods_adv mt=new Methods_adv();
        switch(args[0])
        {
            case "-create":
            {
                mt.tableformation();
                break;
            }
            case "-add":
            {
                mt.add_data(args);
                break;
            }
            case "-del":
            {
                mt.delete_data(args);
                break;
            }
            case "-upd":
            {
                mt.update_data(args);
                break;
            }
            case "-avg":
            {
                mt.average_data(args);
                break;
            }
            case "-disp":
            {
              mt.display_data();
              break;
            }
            case "-ret_id":
            {
                mt.retrieve_data_id(args);
                break;
            }
            case "-ret_zone":
            {
                mt.retrieve_data_zone(args);
                break;
            }
            case "-ret_tc":
            {
                mt.retrieve_data_tc(args);
                break;
            }
            case "-ztc":
            {
                mt.sumtcbyzone(args);
                break;
            }
            case "help":
            {
                Methods_adv.printHelp();
                break;
            }
            default:
            {
                System.out.println("\nInvalid command");
                System.out.println("Type 'java App help' for help menu\n");
                Methods_adv.printHelp();
            }
        }
    }
}

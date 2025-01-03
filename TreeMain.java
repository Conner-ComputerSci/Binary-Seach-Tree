import java.util.*;
public class TreeMain {
    public static void main(String args[]){
        //Runs the main method

        //Creates initial values
        TreeManager manager = new TreeManager();
        Scanner console = new Scanner(System.in);
        int userInput = 0;
        int userID = 0;
        boolean quit = false;

        //Program starts, goes until user quits
        while (!quit) {
            System.out.println("Welcome to the data base.\nWhat would you like to do?\nPress 1 to search\nPress 2 to add");
            System.out.println("Press 3 to print\nPress 5 to quit");

            userInput = console.nextInt();

            //Activates user input
            switch (userInput) {

                case 1: //Search
                    System.out.println("Enter User ID: ");
                    userID = console.nextInt();
                    if(manager.searchNode(userID)){
                        System.out.println("User Found!\n\n");
                    }else{
                        System.out.println("User does not exist\n\n");
                    }
                    break;


                case 2: //Insert
                    System.out.println("Enter User ID: ");
                    userID = console.nextInt();
                    if(manager.InsertNode(userID)){
                        System.out.println("User has been added\n\n");
                    }else{
                        System.out.println("No Duplicate IDs\n\n");
                    }
                    break;


                case 3:
                    System.out.println("Press 1 for Preorder\nPress 2 for Postorder\nPress 3 for Inorder");
                    userInput = console.nextInt();
                    switch (userInput) {
                        case 1:
                            System.out.println();
                            manager.preorderTraversal(manager.root);
                            System.out.println();
                            break;
                        case 2:
                            System.out.println();
                            manager.postorderTraversal(manager.root);
                            System.out.println();
                            break;
                        case 3:
                            System.out.println();
                            manager.inorderTraversal(manager.root);
                            System.out.println();
                            break;
                        default:
                            break;
                    }
                    break;


                case 5:
                    quit = true;

                    
                default:
                    break;
            }
    
        }
    }
}

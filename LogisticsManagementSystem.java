package collections;
import java.util.*;

 class LogisticsManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        List<String> users = new ArrayList<>();
        Set<String> locations = new HashSet<>();
        List<String> products = new ArrayList<>();

        Map<Integer, String> deliveryCompany = new HashMap<>();
        Map<Integer, String> deliveryStatus = new HashMap<>();

        Queue<Integer> deliveryQueue = new LinkedList<>();

        int orderIdCounter = 1;

        while (true) {
            System.out.println("\n===== LOGISTICS MANAGEMENT SYSTEM =====");
            System.out.println("1. Add User");
            System.out.println("2. Add Location");
            System.out.println("3. Add Product");
            System.out.println("4. Create Delivery Order");
            System.out.println("5. Process Delivery");
            System.out.println("6. View Delivery Status");
            System.out.println("7. Exit");

            int choice = sc.nextInt();
            sc.nextLine();


            if (choice == 1) {
                System.out.println("Enter User Name:");
                users.add(sc.nextLine());
                System.out.println("User added!");

            }


            else if (choice == 2) {
                System.out.println("Enter Location:");
                locations.add(sc.nextLine());
                System.out.println("Location added!");

            }


            else if (choice == 3) {
                System.out.println("Enter Product Name:");
                products.add(sc.nextLine());
                System.out.println("Product added!");

            }


            else if (choice == 4) {
                if (users.isEmpty() || locations.isEmpty() || products.isEmpty()) {
                    System.out.println("Add user, location, and product first!");
                    continue;
                }

                int orderId = orderIdCounter++;

                System.out.println("Select User:");
                for (int i = 0; i < users.size(); i++)
                    System.out.println(i + " - " + users.get(i));
                String user = users.get(sc.nextInt());
                sc.nextLine();

                System.out.println("Select Location:");
                for (String loc : locations)
                    System.out.println(loc);
                String location = sc.nextLine();

                System.out.println("Select Product:");
                for (int i = 0; i < products.size(); i++)
                    System.out.println(i + " - " + products.get(i));
                String product = products.get(sc.nextInt());
                sc.nextLine();

                System.out.println("Enter Delivery Company:");
                String company = sc.nextLine();

                deliveryCompany.put(orderId, company);
                deliveryStatus.put(orderId, "Order Placed");
                deliveryQueue.add(orderId);

                System.out.println("Order Created! Order ID: " + orderId);
            }


            else if (choice == 5) {
                if (deliveryQueue.isEmpty()) {
                    System.out.println("No deliveries pending!");
                    continue;
                }

                int orderId = deliveryQueue.poll();

                System.out.println("Processing Order ID: " + orderId);
                System.out.println("Enter Status (Picked / In Transit / Delivered):");
                String status = sc.nextLine();

                deliveryStatus.put(orderId, status);
                System.out.println("Status updated!");
            }


            else if (choice == 6) {
                System.out.println("Enter Order ID:");
                int id = sc.nextInt();

                if (deliveryStatus.containsKey(id)) {
                    System.out.println("Company: " + deliveryCompany.get(id));
                    System.out.println("Status: " + deliveryStatus.get(id));
                } else {
                    System.out.println("Order not found!");
                }
            }


            else if (choice == 7) {
                System.out.println("Exiting Logistics System...");
                break;
            }

            else {
                System.out.println("Invalid Choice!");
            }
        }

        sc.close();
    }
}
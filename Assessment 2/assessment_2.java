import java.util.ArrayList;
import java.util.Scanner;

class Product {
    private String id;
    private String name;
    private double price;
    private int quantity;
    private String company;

    // Constructor
    public Product(String id, String name, double price, int quantity, String company) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.company = company;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getCompany() {
        return company;
    }

    // Setters
    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setCompany(String company) {
        this.company = company;
    }

	public void setName(String newName) {
		// TODO Auto-generated method stub
		
	}
}

public class assessment_2 {
    private static ArrayList<Product> productList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Main Menu:");
            System.out.println("1. Add Stock\n2. View Stock\n3. Search Stock\n4. Edit Stock\n5. Delete Stock\n6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addStock();
                    break;
                case 2:
                    viewStock();
                    break;
                case 3:
                    searchStock();
                    break;
                case 4:
                    editStock();
                    break;
                case 5:
                    deleteStock();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addStock() {
        System.out.println("Adding Stock:");
        System.out.print("Product ID: ");
        String id = scanner.nextLine();
        System.out.print("Product Name: ");
        String name = scanner.nextLine();
        System.out.print("Product Price: ");
        double price = scanner.nextDouble();
        System.out.print("Product Quantity: ");
        int quantity = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Product Company: ");
        String company = scanner.nextLine();

        Product product = new Product(id, name, price, quantity, company);
        productList.add(product);

        System.out.println("Product added successfully!");
    }

    private static void viewStock() {
        System.out.println("Viewing Stock:");
        if (productList.isEmpty()) {
            System.out.println("No products available.");
        } else {
            for (Product product : productList) {
                System.out.println("ID: " + product.getId() + ", Name: " + product.getName() +
                                   ", Price: " + product.getPrice() + ", Quantity: " + product.getQuantity() +
                                   ", Company: " + product.getCompany());
            }
        }
    }

    private static void searchStock() {
        System.out.println("Searching Stock:");
        System.out.print("Enter Product ID to search: ");
        String searchId = scanner.nextLine();
        boolean found = false;
        for (Product product : productList) {
            if (product.getId().equals(searchId)) {
                System.out.println("Product found:");
                System.out.println("ID: " + product.getId() + ", Name: " + product.getName() +
                                   ", Price: " + product.getPrice() + ", Quantity: " + product.getQuantity() +
                                   ", Company: " + product.getCompany());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Product not found.");
        }
    }

    private static void editStock() {
        System.out.println("Editing Stock:");
        System.out.print("Enter Product ID to edit: ");
        String editId = scanner.nextLine();
        boolean found = false;
        for (Product product : productList) {
            if (product.getId().equals(editId)) {
                System.out.println("Product found. Enter new information:");
                System.out.print("New Product Name: ");
                String newName = scanner.nextLine();
                System.out.print("New Product Price: ");
                double newPrice = scanner.nextDouble();
                System.out.print("New Product Quantity: ");
                int newQuantity = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                System.out.print("New Product Company: ");
                String newCompany = scanner.nextLine();

                product.setName(newName);
                product.setPrice(newPrice);
                product.setQuantity(newQuantity);
                product.setCompany(newCompany);

                System.out.println("Product updated successfully!");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Product not found.");
        }
    }

    private static void deleteStock() {
        System.out.println("Deleting Stock:");
        System.out.print("Enter Product ID to delete: ");
        String deleteId = scanner.nextLine();
        boolean found = false;
        for (Product product : productList) {
            if (product.getId().equals(deleteId)) {
                productList.remove(product);
                System.out.println("Product deleted successfully!");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Product not found.");
        }
    }
}

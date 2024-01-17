#include <iostream>
#include <vector>

// Base class
class Person {
protected:
    std::string name;

public:
    Person(const std::string& n) : name(n) {}
    virtual ~Person() {}

    std::string getName() const {
        return name;
    }
};

// Derived class from Person
class Seller : public Person {
private:
    int sellerID;

public:
    Seller(const std::string& n, int id) : Person(n), sellerID(id) {}

    int getSellerID() const {
        return sellerID;
    }
};

// Another derived class from Seller
class Product : public Seller {
private:
    int productID;
    std::string productName;
    double price;

public:
    Product(const std::string& n, int sellerID, int pID, const std::string& pName, double pPrice)
        : Seller(n, sellerID), productID(pID), productName(pName), price(pPrice) {}

    void displayProduct() const {

        std::cout << "Product ID: " << productID << ", Seller: " << getName() << ", Seller ID: " << getSellerID()
                  << ", Product Name: " << productName << ", Price: $" << price << std::endl;
    }
};

int main() {
    std::vector<Seller> sellers;
    std::vector<Product> products;

    while (true) {
        std::cout << "\nMenu:\n1. Add Product\n2. Display Products Sold by a Seller\n"
                     "3. Display All Sellers\n4. Display All Products\n5. Exit\nEnter your choice: ";

        int choice;
        std::cin >> choice;

        switch (choice) {
            case 1: {
                std::string sellerName, productName;
                int sellerID, productID;
                double price;

                std::cout << "Enter Seller Name: ";
                std::cin >> sellerName;
                std::cout << "Enter Seller ID: ";
                std::cin >> sellerID;
                std::cout << "Enter Product Name: ";
                std::cin >> productName;
                std::cout << "Enter Product ID: ";
                std::cin >> productID;
                std::cout << "Enter Product Price: $";
                std::cin >> price;


                sellers.push_back(Seller(sellerName, sellerID));
                products.push_back(Product(sellerName, sellerID, productID, productName, price));

                std::cout << "Product added successfully!\n";
                std::cout << "==================================";
                break;
            }
            case 2: {
                int sellerID;
                std::cout << "Enter Seller ID: ";
                std::cin >> sellerID;

                for (const auto& product : products) {
                    if (product.getSellerID() == sellerID) {
                        product.displayProduct();
                    }
                }
                break;
            }
            case 3: {
                std::cout << "All Sellers:\n";
                for (const auto& seller : sellers) {
                    std::cout << "Seller: " << seller.getName() << ", Seller ID: " << seller.getSellerID() << std::endl;
                }
                break;
            }
            case 4: {
                std::cout << "All Products:\n";
                for (const auto& product : products) {
                    product.displayProduct();
                }
                break;
            }
            case 5:
                
                std::cout << "Exiting the program.\n";

                return 0;
            default:

                std::cout << "Invalid choice. Please try again.\n";


        }
    }

    return 0;
}

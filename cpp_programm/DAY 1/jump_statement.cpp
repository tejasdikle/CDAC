#include <iostream>

int main() {
    int choice;

    while (true) {
        std::cout << "Menu:\n";
        std::cout << "1. Print Hello\n";
        std::cout << "2. Print World\n";
        std::cout << "3. Exit\n";
        std::cout << "Enter your choice: ";
        std::cin >> choice;

        switch (choice) {
            case 1:
                std::cout << "Hello\n";
                break; 
            case 2:
                std::cout << "World\n";
                continue; 
            case 3:
                return 0; 

            default:
                std::cout << "Invalid choice\n";
                break; 
        }
    }

    
    std::cout << "This will never be printed.\n";
    return 0;


}
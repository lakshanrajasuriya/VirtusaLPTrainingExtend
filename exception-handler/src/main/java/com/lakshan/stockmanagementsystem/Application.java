package com.lakshan.stockmanagementsystem;

import com.lakshan.stockmanagementsystem.services.command.CommandService;
import com.lakshan.stockmanagementsystem.services.exceptions.AddItemException;
import com.lakshan.stockmanagementsystem.services.exceptions.DBNotFoundException;
import com.lakshan.stockmanagementsystem.services.exceptions.RemoveItemException;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("Stock Management System\n");
        Scanner scanner = new Scanner(System.in);
        CommandService commandService = new CommandService();

        try {
            while (true) {
                System.out.println("Select an option:");
                System.out.println("A - Get available stock count, B - Add a new item,  C - Remove an item, D - Modify items, Q - Exit");
                String selectedOption = scanner.nextLine();
                switch (selectedOption.toLowerCase()) {
                    case "a":
                        commandService.getStockCount();
                        break;
                    case "b":
                        commandService.addItem();
                        break;
                    case "c":
                        commandService.removeItem();
                        break;
                    case "d":
                        commandService.modifyItem();
                        break;
                    case "q":
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid Command");
                }
            }
        } catch (DBNotFoundException e) {
            System.out.println(e);
        } catch (AddItemException e) {
            e.printStackTrace();
        } catch (RemoveItemException e) {
            System.out.println(e);
        }
    }
}

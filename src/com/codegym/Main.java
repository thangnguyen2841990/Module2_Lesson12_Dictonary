package com.codegym;


import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        int choice = -1;
        do {
            System.out.println("----TỪ ĐIỂN----");
            System.out.println("1. Thêm từ.");
            System.out.println("2. Xóa từ.");
            System.out.println("3. Tra từ.");
            System.out.println("4. In ra danh sách từ.");
            System.out.println("5. In ra số lượng từ.");
            System.out.println("6. Xóa tất cả các từ khóa");
            System.out.println("7. Thoát");
            System.out.println("Mời bạn lựa chon: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            if (choice == 7){
                break;
            }
            if (choice > 7){
                System.out.println("Menu chỉ có từ 1 - 7");
            }
            switch (choice){
                case 1 : {
                    System.out.println("----Thêm từ----");
                    System.out.println("Nhặp Key: ");
                    String key = scanner.nextLine();
                    System.out.println("Nhập Value: ");
                    String value = scanner.nextLine();
                    dictionary.addEntry(key,value);
                    System.out.println("Thêm thành công!");
                    break;
                }
                case 2 : {
                    System.out.println("----Xóa từ----");
                    System.out.println("Nhặp từ cần xóa: ");
                    String key = scanner.nextLine();
                    dictionary.removeEntry(key);
                    System.out.println("Đã xóa!");
                    break;
                }
                case 3 : {
                    System.out.println("----Tra từ----");
                    System.out.println("Nhặp từ cần tra: ");
                    String key = scanner.nextLine();
                    System.out.println("Ý nghĩa của "+key+" là: "+dictionary.lookupWord(key));
                    break;
                }
                case 4 : {
                    System.out.println("----In ra danh sách từ khóa----");
                    dictionary.displayAllKeys();
                    if (dictionary.getSize() == 0){
                        System.out.println("Không có từ nào để in!");
                    }
                    break;
                }
                case 5 : {
                    System.out.println("----Lấy ra số lượng từ khóa----");
                    System.out.println("Số lượng từ khóa là: "+ dictionary.getSize());
                    break;
                }
                case 6 : {
                    System.out.println("----Xóa tất cả các từ khóa----");
                    dictionary.removeAll();
                    System.out.println("Đã xóa tất cả!");
                    break;
                }
            }
        } while (choice != 7);


    }
}

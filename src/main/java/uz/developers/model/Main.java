package uz.developers.model;

import uz.developers.service.BankServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankServiceImpl aloqaBank = new BankServiceImpl();
        Card card = new Card();
        while (true){
            System.out.println("0 => Exit, 1 => New Create Card, 2 => Unlock Card, 0 => Exit, 0 => Exit, ");
        switch (scanner.nextInt()){
            case 0:
                return;
            case 1:
                if (aloqaBank.createCard()) {
                    System.out.println("yaratildi");
                }else {
                    System.out.println("yaratilmadi");
                }
                break;
            case 2:
                aloqaBank.unblockCard();
                break;
        }

        }

    }
}

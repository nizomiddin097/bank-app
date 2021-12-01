package uz.developers.service;

import uz.developers.model.Bank;
import uz.developers.model.Card;

import java.util.Date;
import java.util.Scanner;

public class BankServiceImpl extends Bank implements BankService {
    public BankServiceImpl() {
        setCards(new Card[8]);
    }

    @Override
    public boolean createCard() {
        for (int i = 0; i < getCards().length; i++) {
            if (getCards()[i] == null) {
                getCards()[i] = createNewCard();
                System.out.println(getCards()[i]);
                return true;
            }
        }
        return false;
    }

    @Override
    public void unblockCard() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("id ni kiritin");
        String id = scanner.nextLine();
        for (Card card : getCards()) {
            if (card.getId().equals(id)) {
                if (card.isState()) {
                    System.out.println(" cartangiz bloklanmagan");
                } else {
                    System.out.println(" FullName");
                    if (scanner.nextLine().equalsIgnoreCase(card.getOwner())) {
                        card.setState(true);
                        System.out.println("card blokdan chiqarildi");
                    } else {
                        System.out.println("Bu Card egasi siz emas , egasi kelsin");
                    }
                    return;
                }
            }
        }
        System.out.println(" bu boshqa bankni kartasi ");
    }

    @Override
    public void exchange() {
    }

    private String generateId() {
        Scanner scanner = new Scanner(System.in);
        Date date = new Date();
        String str = String.valueOf(date.getTime());
        str = str.substring(0, 3) + str;
        str = str.substring(0, 4) + " " + str.substring(4, 8) + " " +
                str.substring(8, 12) + " " + str.substring(12, 16);
        return str;
    }

    public Card createNewCard() {
        Scanner scanner = new Scanner(System.in);
        Card card = new Card();
        card.setId(generateId());
        System.out.println("fullname");
        card.setOwner(scanner.next());
        card.setState(true);
        card.setOwner("UzCard");
        card.setPin("8888");
        return card;
    }
}

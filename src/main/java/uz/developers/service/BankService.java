package uz.developers.service;

import uz.developers.model.Card;

public interface BankService {
    boolean createCard();
    void unblockCard();
    void exchange();

}

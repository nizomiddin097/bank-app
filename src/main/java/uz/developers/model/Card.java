package uz.developers.model;

public class Card {
    private String id;
    private double balanse;
    private String owner;
    private String bankName;
    private String pin;
    private String system;
    private boolean state;

    public Card() {
    }

    public Card(String id, double balanse, String owner, String bankName, String pin, String system, boolean state) {
        this.id = id;
        this.balanse = balanse;
        this.owner = owner;
        this.bankName = bankName;
        this.pin = pin;
        this.system = system;
        this.state = state;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getBalanse() {
        return balanse;
    }

    public void setBalanse(double balanse) {
        this.balanse = balanse;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Card{" +
                "id='" + id + '\'' +
                ", balanse=" + balanse +
                ", owner='" + owner + '\'' +
                ", bankName='" + bankName + '\'' +
                ", pin='" + pin + '\'' +
                ", system='" + system + '\'' +
                ", state=" + state +
                '}';
    }
}

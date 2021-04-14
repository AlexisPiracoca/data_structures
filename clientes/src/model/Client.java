package model;

public class Client {

    private int idClient;
    private String name;
    private int cardNumber;
    private String phone;

    public Client() {
    }

    public Client(int idClient, String name, int cardNumber, String phone) {
        this.idClient = idClient;
        this.name = name;
        this.cardNumber = cardNumber;
        this.phone = phone;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", cardNumber=" + cardNumber +
                ", phone=" + phone +
                '}';
    }
}

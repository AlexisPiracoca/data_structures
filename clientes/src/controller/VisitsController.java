package controller;

import model.Client;

import java.util.Arrays;
import java.util.Objects;

public class VisitsController {

    public  final int CLIENTS_NUMBER = 40;
    public  final int DAYS_NUMBER = 7;
    
    private final int[][] visitsClients;
    private final Client[] clients;
    private int positionClient;

    public VisitsController() {
        visitsClients = new int[CLIENTS_NUMBER][DAYS_NUMBER];
        clients = new Client[CLIENTS_NUMBER];
        positionClient = 0;

        initVisitsClients();
        initClients();
    }

    public int getPositionClient() {
        return positionClient;
    }

    public void setPositionClient(int positionClient) {
        this.positionClient = positionClient;
    }

    private void initVisitsClients() {
        for (int i = 0; i < CLIENTS_NUMBER; i++) {
            for (int j = 0; j < DAYS_NUMBER; j++) {
                visitsClients[i][j] = 0;
            }
        }
    }

    private void initClients() {
        Arrays.fill(clients, new Client());
    }

    public void addClient(Client client) {
        try {
            clients[positionClient] = client;
            positionClient++;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(" ¡Lista de cliente llena!");
        }
    }

    public void registerVisitClient(Client client, int currentDay) {
        try {
            visitsClients[client.getIdClient()][currentDay] += 1;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(" ¡Lista de visitas llena!");
        }
    }

    public void printVisitsByDay(int clientCardNumber, int day, String dayName) {
        Client client = getClientByCardNumber(clientCardNumber);
        for (int i = 0; i < CLIENTS_NUMBER; i++) {
            for (int j = 0; j < DAYS_NUMBER; j++) {
                if (client.getIdClient() == i && day == j) {
                    System.out.print("  Número de visitas del cliente " + client.getName() + " el " + dayName + ": ");
                    System.out.println(visitsClients[i][j]);
                }
            }
        }
    }

    public Client getClientByCardNumber(int cardNumber) {
        for (Client client : clients) {
            if (client.getCardNumber() == cardNumber) {
                return client;
            }
        }
        return null;
    }

    public Client getClientById(int id) {
        for (Client client : clients) {
            if (client.getIdClient() == id) {
                return client;
            }
        }
        return null;
    }

    public boolean isClientRegistered(int cardNumber) {
        for (Client client : clients) {
            if (client.getCardNumber() == cardNumber) {
                return true;
            }
        }
        return false;
    }

    public void printVisits() {
        try {
            System.out.println("\n");
            for (int i = 0; i < CLIENTS_NUMBER; i++) {
                System.out.print("Cliente " + Objects.requireNonNull(getClientById(i)).getName() + " [ ");
                for (int j = 0; j < DAYS_NUMBER; j++) {
                    System.out.print(visitsClients[i][j] + " ");
                }
                System.out.println(" ]\n");
            }
        } catch (NullPointerException ignored) {
        }
    }
}

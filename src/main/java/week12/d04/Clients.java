package week12.d04;

import java.util.*;

public class Clients
{
    Map<String,Client> clientMap = new HashMap<>();

    public void addClient(String name, String regNumber)
    {
        clientMap.put(regNumber, new Client(name, regNumber));
    }

    public Client findByRegNumber(String regNumber) {
        checkString(regNumber, "registration number ");
        if (!clientMap.containsKey(regNumber)){
            throw new IllegalArgumentException("Not find Clients" + regNumber);
        }
        return clientMap.get(regNumber);
    }

    public List<Client> findByName(String namePart)
    {
        checkString(namePart, "name part ");
        List<Client> foundList = new ArrayList<>();
        for (Client client : clientMap.values()) {
            if (client.getName().toUpperCase().contains(namePart.toUpperCase())) {
                foundList.add(client);
            }
        }
        if (foundList.isEmpty()) {
            throw new IllegalArgumentException("Client not found with this name part");
        }
        return foundList;
    }

    private void checkString (String toCheck, String paramName)
    {
        if (toCheck == null || toCheck.isBlank())
        {
            throw new IllegalArgumentException(paramName + " must not null or empty");
        }
    }
}

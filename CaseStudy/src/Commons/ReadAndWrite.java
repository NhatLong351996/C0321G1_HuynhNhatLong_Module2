package Commons;

import Models.services.House;
import Models.services.Room;
import Models.services.Villa;
import Models.users.Customer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static List<String> readCSV(String filepath) {
        List<String> list = new ArrayList<>();
        try {
            File file = new File(filepath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                list.add(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static List<Villa> readCSV_Villa(String path) {
        List<Villa> villas = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split(",");
                villas.add(new Villa(strings[0], strings[1], Double.parseDouble(strings[2]), Integer.parseInt(strings[3])
                        , Integer.parseInt(strings[4]), strings[5], strings[6], strings[7], Double.parseDouble(strings[8])
                        , Integer.parseInt(strings[9])));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return villas;
    }


    public static void writeCSV_Villa(String path, List<Villa> list) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true));
            for (Villa villa : list) {
                bufferedWriter.write(villa.toString() + "\n");
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<House> readCSV_House(String path) {
        List<House> houses = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split(",");
                houses.add(new House(strings[0], strings[1], Double.parseDouble(strings[2]), Integer.parseInt(strings[3])
                        , Integer.parseInt(strings[4]), strings[5], strings[6], strings[7], Integer.parseInt(strings[8])));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return houses;
    }

    public static void writeCSV_House(String path, List<House> list) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true));
            for (House house : list) {
                bufferedWriter.write(house.toString() + "\n");
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Room> readCSV_Room(String path) {
        List<Room> rooms = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split(",");
                new Room(strings[0], strings[1], Double.parseDouble(strings[2]), Integer.parseInt(strings[3]),
                        Integer.parseInt(strings[4]), strings[5], strings[6]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return rooms;
    }

    public static void writeCSV_Room(String path, List<Room> list) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true));
            for (Room room : list) {
                bufferedWriter.write(room.toString() + "\n");
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeCSV_Customer(String path, List<Customer> list) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true));
            for (Customer customer : list) {
                bufferedWriter.write(customer.toString() + "\n");
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Customer> readCSV_Customer(String path) throws IOException {
        List<Customer> customers = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] stringArray = line.split(",");
                customers.add(new Customer(stringArray[0], stringArray[1], stringArray[2], stringArray[3], stringArray[4], stringArray[5], stringArray[6], stringArray[7]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return customers;
    }

    public static void writeCustomer_Booking(String path, Customer customer) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true));
            bufferedWriter.write(customer.toString() + "\n");
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void writeVilla_Booking(String path, Villa villa) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true));
            bufferedWriter.write(villa.toString() + "\n");
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void writeHouse_Booking(String path, House house) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true));
            bufferedWriter.write(house.toString() + "\n");
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void writeRoom_Booking(String path, Room room) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true));
            bufferedWriter.write(room.toString() + "\n");
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

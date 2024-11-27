package pckg_arrayList_cmd_problem;

import java.util.ArrayList;

public class TestArrayListController {
    public static void main(String[] args) {
        User user1 = new User("John");
        User user2 = new User("Jane");
        User user3 = new User("Jack");
        User user4 = new User("Jill");
        ArrayList<User> userList = new ArrayList<>();

        Car car1 = new Car("Car1", "Model1");
        Car car2 = new Car("Car2", "Model2");
        Car car3 = new Car("Car3", "Model3");
        Car car4 = new Car("Car4", "Model4");
        ArrayList<Car> carList = new ArrayList<>();

        ArrayListController alc = new ArrayListController();
        AddNewElementToList<User> addNewUser = new AddNewElementToList<>(userList, user1);
        AddNewElementToList<User> addNewUser2 = new AddNewElementToList<>(userList, user1);
        AddNewElementToList<User> addNewUser3 = new AddNewElementToList<>(userList, user2);
        InsertElementAtIndexPosition<User> insertUser1 = new InsertElementAtIndexPosition<>(userList, user3, 1);

        AddNewElementToList<Car> addNewCar2 = new AddNewElementToList<>(carList, car2);
        AddNewElementToList<Car> addNewCar = new AddNewElementToList<>(carList, car1);

        alc.setCommand(addNewUser);
        alc.runCommand();
        alc.setCommand(addNewUser2);
        alc.runCommand();
        alc.setCommand(addNewUser3);
        alc.runCommand();
        alc.setCommand(insertUser1);
        alc.runCommand();

        alc.setCommand(addNewCar);
        alc.runCommand();
        alc.setCommand(addNewCar2);
        alc.runCommand();
        alc.undoCommand();
        alc.undoCommand();
        alc.redoCommand();

        ClearAllElements<User> clearAllUserElements = new ClearAllElements<>(userList);
        alc.setCommand(clearAllUserElements);
        alc.runCommand();


    }

    private static <E> void listElements(ArrayList<E> list){
        if (list.isEmpty()) {
            System.out.println("List is empty - nothing to list!");
        }
        else{
            for (E element : list) {
                System.out.println(element);
            }
        }
    }
}

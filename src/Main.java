import java.util.ArrayList;
import java.util.List;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Main {

    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        setupLogger();

        List<Worker> workersList = new ArrayList<>();
        workersList.add(new Worker("Иван", 30, 50000));
        workersList.add(new Worker("Петр", 25, 45000));
        workersList.add(new Worker("Мария", 35, 55000));

        addWorker(workersList);
        editWorker(workersList);

        List<Integer> idList = new ArrayList<>();
        idList.add(1);
        idList.add(2);
        removeWorker(workersList, idList);

        double avgSalary = getAverageSalary(workersList);
        logger.info("Средняя зарплата: " + avgSalary);

        String workerToFind = "Петр";
        int foundIndex = findWorker(workersList, workerToFind);
        if (foundIndex != -1) {
            logger.info("Сотрудник " + workerToFind + " найден под индексом " + foundIndex);
        } else {
            logger.info("Сотрудник " + workerToFind + " не найден");
        }
    }

    static void addWorker(List<Worker> workersList) {
        for (Worker worker : workersList) {
            logger.info("Добавлен сотрудник " + worker.getName() + " с возрастом " + worker.getAge() + " с зарлатой " + worker.getSalary());
        }
    }

    static void editWorker(List<Worker> workersList) {
        for (Worker worker : workersList) {
            logger.info("Изменён сотрудник " + worker.getName() + ". Возраст: " + worker.getAge() + ". Зарплата: " + worker.getSalary());
        }
    }

    static void removeWorker(List<Worker> workersList, List<Integer> idList) {
        for (int id : idList) {
            if (id >= 0 && id < workersList.size()) {
                Worker removedWorker = workersList.remove(id);
                logger.info("Удалён сотрудник " + removedWorker.getName());
            }
        }
    }

    static double getAverageSalary(List<Worker> workersList) {
        double totalSalary = 0;
        for (Worker worker : workersList) {
            totalSalary += worker.getSalary();
        }
        return totalSalary / workersList.size();
    }

    static int findWorker(List<Worker> workersList, String name) {
        for (int i = 0; i < workersList.size(); i++) {
            if (workersList.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    private static void setupLogger() {
        try {
            Handler fileHandler = new FileHandler("Main.log");
            Handler consoleHandler = new ConsoleHandler();

            fileHandler.setFormatter(new SimpleFormatter());
            consoleHandler.setFormatter(new SimpleFormatter());

            logger.addHandler(fileHandler);
            logger.addHandler(consoleHandler);

            fileHandler.setLevel(Level.ALL);
            consoleHandler.setLevel(Level.INFO);
            logger.setLevel(Level.ALL);
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error setting up logger", e);
        }
    }
}

class Worker {
    private String name;
    private int age;
    private int salary;

    public Worker(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() { return name; }

    public int getAge() { return age; }

    public int getSalary() { return salary; }
}
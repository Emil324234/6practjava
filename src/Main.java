import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Worker> workersList = new ArrayList<>();
        workersList.add(new Worker("Иван", 30, 50000));
        workersList.add(new Worker("Петр", 25, 45000));
        workersList.add(new Worker("Мария", 35, 55000));

        addWorker(workersList);
        editWorker(workersList);

        ArrayList<Integer> idList = new ArrayList<>();
        idList.add(1);
        idList.add(2);
        removeWorker(workersList, idList);

        double avgSalary = getAverageSalary(workersList);
        System.out.println("Средняя зарплата: " + avgSalary);

        String workerToFind = "Петр";
        int foundIndex = findWorker(workersList, workerToFind);
        if (foundIndex != -1) {
            System.out.println("Сотрудник " + workerToFind + " найден под индексом " + foundIndex);
        } else {
            System.out.println("Сотрудник " + workerToFind + " не найден");
        }
    }

    static void addWorker(ArrayList<Worker> workersList) {
        for (Worker worker : workersList) {
            System.out.println("Добавлен сотрудник " + worker.getName() + " с возрастом " + worker.getAge() + " с зарлатой " + worker.getSalary());
        }
    }

    static void editWorker(ArrayList<Worker> workersList) {
        for (Worker worker : workersList) {
            System.out.println("Изменён сотрудник " + worker.getName() + ". Возраст: " + worker.getAge() + ". Зарплата: " + worker.getSalary());
        }
    }

    static void removeWorker(ArrayList<Worker> workersList, ArrayList<Integer> idList) {
        for (int id : idList) {
            if (id >= 0 && id < workersList.size()) {
                Worker removedWorker = workersList.remove(id);
                System.out.println("Удалён сотрудник " + removedWorker.getName());
            }
        }
    }

    static double getAverageSalary(ArrayList<Worker> workersList) {
        double totalSalary = 0;
        for (Worker worker : workersList) {
            totalSalary += worker.getSalary();
        }
        return totalSalary / workersList.size();
    }

    static int findWorker(ArrayList<Worker> workersList, String name) {
        for (int i = 0; i < workersList.size(); i++) {
            if (workersList.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
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

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }
}

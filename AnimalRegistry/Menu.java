package AnimalRegistry;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    public static void menu() {
        List<Animal> animals = new ArrayList<>();

        try (Counter counter = new Counter()) {
            Scanner scanner = new Scanner(System.in, "CP866");
            int choice;

            do {
                System.out.println("----- Реестр животных -----");
                System.out.println("1. Добавить новое животное");
                System.out.println("2. Список команд");
                System.out.println("3. Тренировать животных");
                System.out.println("4. Выполняемые команды животными");
                System.out.println("5. Выход");
                System.out.print("Введите свой выбор =>  ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Введите имя животного: ");
                        String name = scanner.next();
                        System.out.print(
                                "Выберите тип животного (1 - Собака, 2 - Кошка, 3 - Хомяк, 4 - Лошадь, 5 - Верблюд, 6 - Осел): ");
                        int type = scanner.nextInt();

                        Animal animal;

                        switch (type) {
                            case 1:
                                animal = new Dog(name);
                                break;
                            case 2:
                                animal = new Cat(name);
                                break;
                            case 3:
                                animal = new Hamster(name);
                                break;
                            case 4:
                                animal = new Horse(name);
                                break;
                            case 5:
                                animal = new Camel(name);
                                break;
                            case 6:
                                animal = new Donkey(name);
                                break;
                            default:
                                System.out.println("Недопустимый тип животного.");
                                continue;
                        }

                        animals.add(animal);
                        counter.add();
                        System.out.println("Животное добавлено в реестр");
                        break;

                    case 2:
                        if (animals.isEmpty()) {
                            System.out.println("Нет животных в реестре.");
                        } else {
                            System.out.println("----- Команды животных -----");
                            for (Animal a : animals) {
                                System.out.println(a.getName() + ":");
                                if (a instanceof Pet) {
                                    System.out.println("- играть");
                                    System.out.println("- выучить команду");
                                    System.out.println("- выполнить команду");
                                }
                                if (a instanceof Dog) {
                                    System.out.println("- лаять");
                                }
                                if (a instanceof Cat) {
                                    System.out.println("- мяукать");
                                }
                                if (a instanceof Hamster) {
                                    System.out.println("- бежать");
                                }
                                if (a instanceof PackAnimal) {
                                    System.out.println("- нести груз");
                                }
                                if (a instanceof Horse) {
                                    System.out.println("- скакать");
                                }
                                if (a instanceof Camel) {
                                    System.out.println("- идти по пустыне");
                                }
                                if (a instanceof Donkey) {
                                    System.out.println("- работать");
                                }
                            }
                        }
                        break;

                    case 3:
                        if (animals.isEmpty()) {
                            System.out.println("Нет животных в реестре.");
                        } else {
                            System.out.print("Введите имя животного: ");
                            String animalName = scanner.next();
                            System.out.print("Введите команду для изучения: ");
                            String trick = scanner.next();

                            for (Animal a : animals) {
                                if (a.getName().equals(animalName) && a instanceof Pet) {
                                    ((Pet) a).learnTrick(trick);
                                    System.out.println("Команда была изучена.");
                                    break;
                                }
                            }
                        }
                        break;

                    case 4:
                        if (animals.isEmpty()) {
                            System.out.println("Нет животных в реестре.");
                        } else {
                            System.out.print("Введите имя животного: ");
                            String animalName = scanner.next();
                            System.out.print("Введите команду для выполнения: ");
                            String trick = scanner.next();

                            for (Animal a : animals) {
                                if (a.getName().equals(animalName) && a instanceof Pet) {
                                    ((Pet) a).performTrick(trick);
                                    break;
                                }
                            }
                        }
                        break;

                    case 5:
                        System.out.println("Выход из программы...");
                        break;

                    default:
                        System.out.println("Неверный выбор.");
                }

                System.out.println();
            } while (choice != 5);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

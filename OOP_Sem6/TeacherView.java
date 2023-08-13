package OOP_Sem4;

import java.util.Scanner;

public class TeacherView {
    private TeacherService teacherService;
    private Scanner scanner;

    public TeacherView(){
        this.teacherService = new TeacherService();
        this.scanner = new Scanner(System.in);
    }
    
    public void run(){
        boolean running = true;

        while (running){
            System.out.println();
            System.out.println("Учителя");
            System.out.println("1. Создание");
            System.out.println("2. Редактирование");
            System.out.println("3. Вывести список учителей");
            System.out.println("0. Выйти");
            System.out.println();

            System.out.println("Выбрать опцию");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 1:
                create();
                break;

                case 2:
                edit();
                break;

                case 3:
                display();
                break;

                case 0:
                running = false;
                break;
                
                default:
                System.out.println("Недопустимая опция");
            }
        }
    }

    private void edit() {
    }

//Здесь можно разделить на несколько классов по принципу : 
//createTeacher, editTeachet и displayTeachers
//В каждый отдельный класс можно будет вносить изменения и не бояться, 
//что можем повлиять на другие объекты.
    private void create(){
        System.out.println("Имя учителя: ");
        String name = scanner.nextLine();
        System.out.println("Предмет учителя: ");
        String subject = scanner.nextLine();

        teacherService.create(name, subject);
    }


    //Здесь используется принцип открытости/закрытости. 
    //В отдельном классе мы создали необходимый список
    //после этого, мы можем внести изменения в список, не меняя при этом сам класс.
    private void edit(int index){
        System.out.println("Новое имя учителя: ");
        String name = scanner.nextLine();
        System.out.println("Новый предмет учителя: ");
        String subject = scanner.nextLine();

        teacherService.edit(index - 1, name, subject);
    }

    private void display(){
        teacherService.display();
    }
}

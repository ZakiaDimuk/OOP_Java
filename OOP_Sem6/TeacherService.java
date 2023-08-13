package OOP_Sem4;

import java.util.ArrayList;
import java.util.List;

//Здесь можно создать подклассы для проверки создания нового учителя,
//редактирования и корректного отображения списка с учителями.
//За данный принцип отвечает принцип подстановки Барбары Лисков.
public class TeacherService {
    private List teachers;

    public TeacherService(){
        this.teachers = new ArrayList();
    }

    public void createTeacher(String name, String subject){
        Teacher teacher = new Teacher(name, subject);
        teachers.add(teacher);
        System.out.println("Вы создали учителя");
    }
    public void editTeachet(int index, String name, String subject){
        if (index >= 0 && index < teachers.size()){
            Teacher teacher = teachers.get(index);
            teacher.setName(name);
            teacher.setSubject(subject);
            System.out.println(" Редактирование прошло успешно");
        } else {
            System.out.println("Данный индекс является недействительным");
        }
    }

    public void displayTeachers(){
        if (teachers.isEmpty()){
            System.out.println("Список с учителями пустой");
        } else {
            System.out.println("Список учителей");
            for (int i = 0; i< teachers.size(); i++){
                Teacher teacher = teachers.get(i);
                System.out.println((i+1) + "." + teacher.getName() + "-" + teacher.getSubject());
            }
        }
    }

    public void create(String name, String subject) {
    }

    public void edit(int i, String name, String subject) {
    }

    public void display() {
    }
}

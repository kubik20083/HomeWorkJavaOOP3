import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Stream stream = new Stream(1);

        StreamComparator group1 = new StreamComparator("№3", 25);
        StreamComparator group2 = new StreamComparator("№2", 20);
        StreamComparator group3 = new StreamComparator("№1", 30);
        StreamComparator group4 = new StreamComparator("№6", 15);
        StreamComparator group5 = new StreamComparator("№5", 10);
        StreamComparator group6 = new StreamComparator("№4", 40);

        System.out.println("Группы");

        List<StreamComparator> groupList = new ArrayList<>(List.of(group1,group2,group3,group4,group5,group6));
        StudentGroupIterator studentGroupIterator = new StudentGroupIterator(groupList);


        while (studentGroupIterator.hasNext()){
            System.out.println(studentGroupIterator
            .getGroup(studentGroupIterator
            .getCount())
            .toString());
            studentGroupIterator.next();
        }

        System.out.println("-".repeat(99));

       System.out.println("Сортировка груп по количеству студентов");
       

        Collections.sort(groupList);
        
        System.out.println(groupList.toString()
                .replace("[", "")
                .replace("]", "")
                .replace(",",""));


}

}                
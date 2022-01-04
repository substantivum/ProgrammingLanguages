public static void main(String[] ags) {
    Person man1 = new Person("man1",34,30000);
    Person man2 = new Person("man2",32,40000);
    Person man3 = new Person("man3",33,50000);
    LinkedList<Person> list1 = new LinkedList<Person>();
    list1.add(man1);
    list1.add(man2);
    list1.add(man3);
    ArrayDeque<Person> list2 = new ArrayDeque<Person>(list1);

    for (int i = 0; i <list1.size();i++){
        list1.get(i).display();}
        for (Person a:
             list2) {
            a.display();
        }

        list2.getFirst();
        list2.getLast();
        list2.pollLast();
        list2.pollFirst();
        list2.pop();
        list2.removeFirstOccurrence(man2);
        list2.removeLastOccurrence(man1);


        int AvgSal = 0;
        int AvgAge = 0;


        for (Person a:
                list2) {
            AvgAge += a.getAge();
            AvgSal += a.getSalary();
        }
        System.out.println("Sum of Age: " + AvgAge);
        System.out.println("Sum of Salary: " + AvgSal);
        System.out.println("Avg of Age: " + AvgSal/ list2.size());
        System.out.println("Avg of Salary: " + AvgSal/ list2.size());

    }
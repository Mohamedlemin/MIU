package MPP.Week3;

import java.util.*;
import java.util.function.Consumer;

public class Main {
   static List<Employee> removeR(List<Employee> er){
      List<Employee> url = new ArrayList<>();
      Map<Employee, Employee> Emps = new HashMap<>();
      for(Employee e : er){
         if(!Emps.containsKey(e)){
            Emps.put(e,e);
            url.add(e);
         }
      }
      return  url;

   }

   public static void main(String[] args) {
      List<Employee> list = new ArrayList<>();
      list.add(new Employee("Med", 5000));
     list.add(new Employee("Med",5000));
     list.add( new Employee("Ahmed",3000));
      List<Employee> rl = removeR(list);

      Iterator<Employee> iterator = rl.iterator();
      while (iterator.hasNext()){
         System.out.println(iterator.next());
      }

      rl.forEach(new Consumer<Employee>() {
         @Override
         public void accept(Employee employee) {
            System.out.println(employee);
         }
      });
   }








}

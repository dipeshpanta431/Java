//Serialization is the process of writing state of an object to a bytecode to make it easier to transmit and store. Later through deserialization process we can obtain the orginal form of code.

import java.io.*;

class student implements Serializable {
   String name;

   student(String name) {
      this.name = name;
   }
}

class serializationDemo {
   public static void main(String[] args) {
      try {
         student s1 = new student("Dipesh");
         FileOutputStream fout = new FileOutputStream("name.txt");
         ObjectOutputStream out = new ObjectOutputStream(fout);
         out.writeObject(s1);
         out.flush();
      } catch (Exception e) {
         e.printStackTrace();
      }
      System.out.println("Successful");
   }
}
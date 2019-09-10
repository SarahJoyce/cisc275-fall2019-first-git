public class Animal implements Comparable<Animal>{
 String name;
 int legs;
 public Animal(){
   name = "Spot";
   legs = 4;
 }
 public Animal(String n, int l){
   name = n;
   legs = l;
 }
 public int getLegs(){
   return legs;
}
 @Override
 public int compareTo(Animal a){
   if(this.legs-a.legs==0)
     return this.name.compareTo(a.name);
   return this.legs-a.legs;
 }
}

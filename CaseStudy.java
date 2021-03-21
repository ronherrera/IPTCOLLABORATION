package nameage;

public class Nameage {

   

        static void Names(String Name) {
        System.out.println (Name + "/21 years of age ");
}
        static void Address(String Address) {
        System.out.println (Address);
} 
       static void Year(String Year) {
        System.out.println (Year);
}  
       public static void main (String[] args) {
       Names ("Ron Hendrick Herrera/July 24"); 
       Names ("Emmanuel Tolentino/September 1");  
       Names ("Carl Emmanuel Hipolito/December 24");     
           
       System.out.println ();
       Address ("Their Addresses");
       Address ("Cristo Rey, Capas,Tarlac");  
       Address ("Filomena,San rafael,Tarlac");  
       Address ("Talaga,Capas,Tarlac");        
       Year ("3rd year College");
       Year ("From Tarlac State University College of Computer Studies");
       Year ("TSM3C")
}
}

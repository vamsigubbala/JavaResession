public class ASCIICodes
{
     public static void main(String...args) 
     {
            for(char c ='A'; c <= 'Z'; c++)
             {
               int asciiCode = (int) c;
               System.out.println(c + ":" + asciiCode);
             } 
            for(char c ='a'; c <= 'z'; c++)
             {
               int asciiCode = (int) c;
               System.out.println(c + ":" + asciiCode);
             } 
      }
}
            
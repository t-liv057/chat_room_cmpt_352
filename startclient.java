public class startclient{
     
        public static void main(String [] args){
            	   try{
            	        System.out.println("Hello, " + args[1] + " welcome to the chatroom");             
                            chat c=new chat(args[0], args[1]); 
                            Thread t1=new Thread(c);
                            t1.start();
    	   }
    	   catch(Exception e){e.printStackTrace();}
            
        }
    }
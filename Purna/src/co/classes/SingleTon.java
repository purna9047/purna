package co.classes;

public class SingleTon {
    
    private static SingleTon myObj;
    /**
     * Create private constructor
     */
    private SingleTon(){
         
    }
    /**
     * Create a static method to get instance.
     */
    public static SingleTon getInstance(){
        if(myObj == null){
            myObj = new SingleTon();
        }
        return myObj;
    }
     
    public void getSomeThing(){
        // do something here
        System.out.println("Welcome to java");
    }
     
    public static void main(String[]args){
        SingleTon st = SingleTon.getInstance();
        st.getSomeThing();
    }
}

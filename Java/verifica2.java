public class verifica2{
    public static void main(String[] args){
        int x=0;
        try{
            throw(java.lang.Error);
        }
        catch(java.lang.Error e){
            System.out.println(e);
        }
    }
}

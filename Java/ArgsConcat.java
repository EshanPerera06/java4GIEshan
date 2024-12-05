public class ArgsConcat {
    public static void main(String[] args){
        String str1="", str2="", strfn="";
        str1 = args[0];
        str2= args[1];
        strfn = str1+str2;

        System.out.println("L'unione tra \"" + str1 + "\" e \"" + str2 + "\" da come stringa finale : \"" + strfn + "\"");
    }
}

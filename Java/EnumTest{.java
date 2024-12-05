public class EnumTest {
    public enum GiornoSettimana 
    { 
        LUNEDI, 
        MARTEDI, 
        MERCOLEDI, 
        GIOVEDI, 
        VENERDI, 
        SABATO, 
        DOMENICA; 
        
        private static boolean isWeekend(GiornoSettimana giorno)
        {
            if((giorno == GiornoSettimana.SABATO) || (giorno == GiornoSettimana.DOMENICA))
            {
                return true;
            }
            else
            {
                return false;
            }
        }

        public static int getNumeroGiorno()
        {

        }
    };

    public static void main(String[] args) 
    {    
    }
}
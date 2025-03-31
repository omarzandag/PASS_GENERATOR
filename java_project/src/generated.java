import java.math.*;

public class generated {
        String Upper = "AZERTYUIOPQSDFGHJKKLMWXCVBN";
        String Lower = "azertyuiopqsdfghjklmwxcvbn";
        String numbers = "0123456789";
        String Symbols = "°+&é(-è_ç)$^*ù!:;,|[{#~/.§µ%^@}]";

        public String generatedPass(){
            int length = 12;
            String allchars = Upper + Lower + numbers + Symbols;
            StringBuilder generated_Pass = new StringBuilder();

        while (generated_Pass.length() < length) {
            int index = (int) (Math.random() * allchars.length());
            generated_Pass.append(allchars.charAt(index));
        }

            return generated_Pass.toString();

        }
    
}

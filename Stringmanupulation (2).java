public class Stringmanupulation {// Class
    public static String conversion(String x) {
        String answer= "";//intializing variable

        boolean underscoreFound = false;// checks if underscore is found



        for(int i = 0; i < x.length();i++) {
            // go through all characters of string
            if(x.charAt(i) == '_' && i+1 < x.length()) {

                // if an underscore is found, then convert next character to uppercase
             w

                    answer += Character.toUpperCase(x.charAt(i + 1)); // convert next character to uppercase
                    underscoreFound = true;






                    // set underscoreFound to true


                }


            else if(i == 0 || x.charAt(i-1) != '_'){  // if it's not an underscore then add this character to result
                answer +=x.charAt(i);
            }

        }
        if(!underscoreFound) {  // if no underscore is found
            answer = Character.toUpperCase(x.charAt(0)) + x.substring(1);   // then, convert first letter to uppercase
        }


        return answer;  // return the calculated result.
    }

}

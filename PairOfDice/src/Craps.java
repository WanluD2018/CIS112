public class Craps {

    public static void main(String[] args) {
        
        PairOfDice passLineBet = new PairOfDice();
        // shooter makes the "come-out roll", and get the number of the pair of dice.
        passLineBet.value();                                
                
        int numPassLineBet = 100000;                        // how many pass-line bets played.
        int value;  
        int win = 0;
        int loss = 0;         

        for (int i = 0; i < numPassLineBet; i++){
        
            value = passLineBet.value();
            
            if (value == 2 || value == 3 || value == 12){   // "craps", shooter loses
                
                loss++;
                
            } else if (value == 7 || value == 11){          // "natural", shooter wins
                
                win++;
                
            } else {                                        // "point", needs to roll again
            
                int point = value;  
                
                do {
                     passLineBet.roll();
                     value = passLineBet.value();
                }  while (value != 7 && value != point);
                
                if (value == 7){
                     loss++;
                }else if(value == point){
                     win++;
                }                              
            }
            passLineBet.roll();
        }        
        System.out.println(win + " times win and " + loss + " times loss.");
    }
}

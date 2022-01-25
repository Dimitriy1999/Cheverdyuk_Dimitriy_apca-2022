//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

class TriangleFive
    {
        private char letter;
        private int amount;

        public TriangleFive()
        {
            setLetterAndAmount('A', 4);
        }

        public TriangleFive(char c, int amt)
        {
            setLetterAndAmount(c, amt);
        }

        public void setLetterAndAmount(char c, int amt)
        {
            letter = c;
            amount = amt;
        }


        public String toString()
        {
            String output = "";
            for (int i = 0; i < amount; i++)
            {
                char saveChar = letter;
                //After we go through the first letter we start to subtract by I so that it renders less and less text
                for (int j = 0; j < amount - i; j++)
                {
                    for (int k = j; k < amount; k++)
                    {
                        output = output + saveChar;
                    }
                    if (saveChar == 'Z' || saveChar == 'z')
                    {
                        saveChar = 'A';
                    }
                    else
                    {
                        //Increments char
                        saveChar++;
                    }
                    output = output + " ";
                }
                output = output + "\n";
            }
            return output;
        }
    }
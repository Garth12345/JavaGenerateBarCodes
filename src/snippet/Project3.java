//////////////////////////////////////
//GARTH ADCOCK                      //
//IT-313                            //
//PROJECT 3 PART A POSTNET BAR CODES//
//////////////////////////////////////
package snippet; //open the created labels.txt file after running application!
import java.io.*;
import java.util.Scanner;
import javax.swing.JFileChooser;
    public class Project3 {
        public static void main(String[] args) throws IOException
        {
            new Project3();
            Project3.getBarCode();
        } //end of main method
        public static void getBarCode() throws IOException
        {
            JFileChooser chooser = new JFileChooser( );
            chooser.showOpenDialog(null);
            File fileObj = chooser.getSelectedFile( ); 
           //Read the file                                          
            Scanner in = new Scanner(fileObj);
            while (in.hasNextLine()) {
                String data_text = in.nextLine();
                //System.out.println(data_text);
                //print out all of the info per person
                //display the zip code alone
                data_text = data_text + " ";
                data_text = data_text.trim();
                String zipCodeVal = data_text.substring(data_text.length()-10, data_text.length());
                //System.out.println(zipCodeVal); //this is the unchanged zip code
                zipCodeVal = zipCodeVal.replace("-", "");      
                //System.out.println(zipCodeVal);
                //For each line write out an address like this to the output file labels.txt:   
                String val0, val1, val2, val3, val4, val5, val6, val7, val8 = "";
                File file = new File("labels.txt");
                FileWriter fileWriter = new FileWriter(file, true) ;          
                val0 = zipCodeVal.substring(0, 1);
                //int zipCodeVal2 = Integer.parseInt(zipCodeVal); //converted to type int
                int digitVal0 = Integer.parseInt(val0); //converted to type int
                int myDigit = digitVal0;
                String digitAsBars = "";
                switch(myDigit)
                {
                    case 0: digitAsBars = "||:::";   break;
                    case 1: digitAsBars = ":::||"; break;
                    case 2: digitAsBars = "::|:|"; break;
                    case 3: digitAsBars = "::||:"; break;
                    case 4: digitAsBars = ":|::|"; break;
                    case 5: digitAsBars = ":|:|:"; break;
                    case 6: digitAsBars = ":||::"; break;
                    case 7: digitAsBars = "|:::|"; break;
                    case 8: digitAsBars = "|::|:"; break;
                    case 9: digitAsBars = "|:|::"; break;
                }
                //fileWriter.write(System.getProperty( "line.separator" ));
                //System.out.println(digitAsBars);
                //data_text = data_text.replace(",", System.lineSeparator()); 
                String[] portions = data_text.split(",");
                String part1 = portions[0];
                String part2 = portions[1];
                String part3 = portions[2];
                String part4 = portions[3];
                String part5 = portions[4];
                String result_data = part1 + System.getProperty( "line.separator" ) + part2 + System.getProperty( "line.separator" ) + part3 + " " + part4 + " " + part5;
                //System.out.println(part1);
                //System.out.println(part4 + " " + zipCodeValWithDash);
                fileWriter.write(result_data); //display names, etc
                fileWriter.write(System.getProperty( "line.separator" ));
                fileWriter.write(digitAsBars); //display converted zip               
    //////////////////////////////////////////////////////////////////////////////////////
                val1 = zipCodeVal.substring(1, 2);
                int digitVal1 = Integer.parseInt(val1); //converted to type int
                int myDigit2 = digitVal1;
                String digitAsBars2 = "";
                switch(myDigit2)
                {
                    case 0: digitAsBars2 = "||:::"; break;
                    case 1: digitAsBars2 = ":::||"; break;
                    case 2: digitAsBars2 = "::|:|"; break;
                    case 3: digitAsBars2 = "::||:"; break;
                    case 4: digitAsBars2 = ":|::|"; break;
                    case 5: digitAsBars2 = ":|:|:"; break;
                    case 6: digitAsBars2 = ":||::"; break;
                    case 7: digitAsBars2 = "|:::|"; break;
                    case 8: digitAsBars2 = "|::|:"; break;
                    case 9: digitAsBars2 = "|:|::"; break;
                }
                //System.out.println(digitAsBars2);
                fileWriter.write(digitAsBars2);            
    //////////////////////////////////////////////////////////////////////////////////////
                val2 = zipCodeVal.substring(2, 3);
                int digitVal2 = Integer.parseInt(val2); //converted to type int
                int myDigit3 = digitVal2;
                String digitAsBars3 = "";
                switch(myDigit3)
                {
                    case 0: digitAsBars3 = "||:::"; break;
                    case 1: digitAsBars3 = ":::||"; break;
                    case 2: digitAsBars3 = "::|:|"; break;
                    case 3: digitAsBars3 = "::||:"; break;
                    case 4: digitAsBars3 = ":|::|"; break;
                    case 5: digitAsBars3 = ":|:|:"; break;
                    case 6: digitAsBars3 = ":||::"; break;
                    case 7: digitAsBars3 = "|:::|"; break;
                    case 8: digitAsBars3 = "|::|:"; break;
                    case 9: digitAsBars3 = "|:|::"; break;
                }
                //System.out.println(digitAsBars3);
                fileWriter.write(digitAsBars3);
    //////////////////////////////////////////////////////////////////////////////////////
                val3 = zipCodeVal.substring(3, 4);
                int digitVal3 = Integer.parseInt(val3); //converted to type int
                int myDigit4 = digitVal3;
                String digitAsBars4 = "";
                switch(myDigit4)
                {
                    case 0: digitAsBars4 = "||:::"; break;
                    case 1: digitAsBars4 = ":::||"; break;
                    case 2: digitAsBars4 = "::|:|"; break;
                    case 3: digitAsBars4 = "::||:"; break;
                    case 4: digitAsBars4 = ":|::|"; break;
                    case 5: digitAsBars4 = ":|:|:"; break;
                    case 6: digitAsBars4 = ":||::"; break;
                    case 7: digitAsBars4 = "|:::|"; break;
                    case 8: digitAsBars4 = "|::|:"; break;
                    case 9: digitAsBars4 = "|:|::"; break;
                }
                //System.out.println(digitAsBars4);
                fileWriter.write(digitAsBars4);
    //////////////////////////////////////////////////////////////////////////////////////
                val4 = zipCodeVal.substring(4, 5);
                int digitVal4 = Integer.parseInt(val4); //converted to type int
                int myDigit5 = digitVal4;
                String digitAsBars5 = "";
                switch(myDigit5)
                {
                    case 0: digitAsBars5 = "||:::"; break;
                    case 1: digitAsBars5 = ":::||"; break;
                    case 2: digitAsBars5 = "::|:|"; break;
                    case 3: digitAsBars5 = "::||:"; break;
                    case 4: digitAsBars5 = ":|::|"; break;
                    case 5: digitAsBars5 = ":|:|:"; break;
                    case 6: digitAsBars5 = ":||::"; break;
                    case 7: digitAsBars5 = "|:::|"; break;
                    case 8: digitAsBars5 = "|::|:"; break;
                    case 9: digitAsBars5 = "|:|::"; break;
                }
                //System.out.println(digitAsBars5);

                fileWriter.write(digitAsBars5);
    //////////////////////////////////////////////////////////////////////////////////////
                val5 = zipCodeVal.substring(5, 6);
                int digitVal5 = Integer.parseInt(val5); //converted to type int
                int myDigit6 = digitVal5;
                String digitAsBars6 = "";
                switch(myDigit6)
                {
                    case 0: digitAsBars6 = "||:::"; break;
                    case 1: digitAsBars6 = ":::||"; break;
                    case 2: digitAsBars6 = "::|:|"; break;
                    case 3: digitAsBars6 = "::||:"; break;
                    case 4: digitAsBars6 = ":|::|"; break;
                    case 5: digitAsBars6 = ":|:|:"; break;
                    case 6: digitAsBars6 = ":||::"; break;
                    case 7: digitAsBars6 = "|:::|"; break;
                    case 8: digitAsBars6 = "|::|:"; break;
                    case 9: digitAsBars6 = "|:|::"; break;
                }
                //System.out.println(digitAsBars6);

                fileWriter.write(digitAsBars6);
    //////////////////////////////////////////////////////////////////////////////////////
                val6 = zipCodeVal.substring(6, 7);
                int digitVal6 = Integer.parseInt(val6); //converted to type int
                int myDigit7 = digitVal6;
                String digitAsBars7 = "";
                switch(myDigit7)
                {
                    case 0: digitAsBars7 = "||:::"; break;
                    case 1: digitAsBars7 = ":::||"; break;
                    case 2: digitAsBars7 = "::|:|"; break;
                    case 3: digitAsBars7 = "::||:"; break;
                    case 4: digitAsBars7 = ":|::|"; break;
                    case 5: digitAsBars7 = ":|:|:"; break;
                    case 6: digitAsBars7 = ":||::"; break;
                    case 7: digitAsBars7 = "|:::|"; break;
                    case 8: digitAsBars7 = "|::|:"; break;
                    case 9: digitAsBars7 = "|:|::"; break;
                }
                //System.out.println(digitAsBars7);
                fileWriter.write(digitAsBars7);
    //////////////////////////////////////////////////////////////////////////////////////
                val7 = zipCodeVal.substring(7, 8);
                int digitVal7 = Integer.parseInt(val7); //converted to type int
                int myDigit8 = digitVal7;
                String digitAsBars8 = "";
                switch(myDigit8)
                {
                    case 0: digitAsBars8 = "||:::"; break;
                    case 1: digitAsBars8 = ":::||"; break;
                    case 2: digitAsBars8 = "::|:|"; break;
                    case 3: digitAsBars8 = "::||:"; break;
                    case 4: digitAsBars8 = ":|::|"; break;
                    case 5: digitAsBars8 = ":|:|:"; break;
                    case 6: digitAsBars8 = ":||::"; break;
                    case 7: digitAsBars8 = "|:::|"; break;
                    case 8: digitAsBars8 = "|::|:"; break;
                    case 9: digitAsBars8 = "|:|::"; break;
                }
                //System.out.println(digitAsBars8);

                fileWriter.write(digitAsBars8);
    //////////////////////////////////////////////////////////////////////////////////////
                val8 = zipCodeVal.substring(8);
                int digitVal8 = Integer.parseInt(val8); //converted to type int
                int myDigit9 = digitVal8;
                String digitAsBars9 = "";
                switch(myDigit9)
                {
                    case 0: digitAsBars9 = "||:::"; break;
                    case 1: digitAsBars9 = ":::||"; break;
                    case 2: digitAsBars9 = "::|:|"; break;
                    case 3: digitAsBars9 = "::||:"; break;
                    case 4: digitAsBars9 = ":|::|"; break;
                    case 5: digitAsBars9 = ":|:|:"; break;
                    case 6: digitAsBars9 = ":||::"; break;
                    case 7: digitAsBars9 = "|:::|"; break;
                    case 8: digitAsBars9 = "|::|:"; break;
                    case 9: digitAsBars9 = "|:|::"; break;
                }
                //System.out.println(digitAsBars8);

                fileWriter.write(digitAsBars9 + System.lineSeparator());
  //////////////////////////////////////////////////////////////////////////////////////
                fileWriter.close();
            }
            in.close( ); //close the scanner
        }
}
package WorkingWithData;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class Data {

    // Function for reading files

    /**
     * @param file Passing a file to read for the function
     * @param row Which row of the file will be read
     * @return Returns an array of string values
     */

    static String[] readString(String file, int row) {
        // Array for storing String values
        String[] values = new String[0];
        // Trying to access passed file
        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line = br.readLine();
            while(line != null) {
                // Splitting Strings and adding them to the Array
                String[] lineItems = line.split(" ");
                values = addElement(values, lineItems[row]);
                line = br.readLine();
            }
        } catch(FileNotFoundException ex) {
            System.out.println(
                    "File '" + file + "' not found!"
            );

            ex.fillInStackTrace();
        } catch (Exception e) {
            System.out.println(
                    "Something wrong happened!"
            );

            e.fillInStackTrace();
        }

        return values;
    }

    /**
     * @param file Passing a file to read for the function
     * @param row Which row of the file will be read
     * @return Returns an array of integer values
     */

    static int[] readInt(String file, int row) {
        int[] values = new int[0];
        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line = br.readLine();
            while(line != null) {
                String[] lineItems = line.split(" ");
                values = addElement(values, Integer.parseInt(lineItems[row]));
                line = br.readLine();
            }
        } catch (FileNotFoundException ex) {
            System.out.println(
                    "File '" + file + "' not found!"
            );

            ex.fillInStackTrace();
        } catch (Exception e) {
            System.out.println(
                    "Something went wrong!"
            );

            e.fillInStackTrace();
        }

        return values;
    }

    static void write(String file, String[] names, String[] lastNames, int[] ages, String[] professions) {
        int oldest = findOldest(ages);
        int managerCount = countProfessions(professions, professions[0]);
        int plumberCount = countProfessions(professions, professions[1]);
        int builderCount = countProfessions(professions, professions[2]);
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            for(int i = 0; i < names.length; i++) {
                bw.write(
                        "\nName: " + names[i] + "| Lastname: " + lastNames[i] + "| age: " + ages[i] + "| profession: " + professions[i]
                );
            }

            for(int i = 0; i < ages.length; i++) {
                if(oldest == ages[i]) {
                    bw.write(
                            "\nOldest is " + names[i] + " " + lastNames[i]
                    );
                }
            }

            bw.write(
                    "\nAmount of managers: " + managerCount +
                        "\nAmount of plumbers: " + plumberCount +
                        "\nAmount of builders: " + builderCount
            );
        } catch (IOException ex) {
            System.out.println(
                    "Invalid input"
            );
            ex.fillInStackTrace();
        } catch (Exception e) {
            System.out.println(
                    "Something went wrong!"
            );

            e.fillInStackTrace();
        }
    }

    /**
     * @param arr Passing an array of strings
     * @param string Passing a string element to add to the array
     * @return Returns a string array with the added element
     */

    static String[] addElement(String[] arr, String string) {
        arr = Arrays.copyOf(arr, arr.length + 1);
        arr[arr.length - 1] = string;
        return arr;
    }

    /**
     * @param arr Passing an array of integers
     * @param number Passing an integer element to add to the array
     * @return Returns an integer array with the added element
     */

    static int[] addElement(int[] arr, int number) {
        arr = Arrays.copyOf(arr, arr.length + 1);
        arr[arr.length - 1] = number;
        return arr;
    }

    /**
     * @param first Passing the first array of strings
     * @param second Passing the second array of strings
     * @return Returns a fused string array
     */

    static String[] concat(String[] first, String[] second) {
        String[] result = Arrays.copyOf(first, first.length + second.length);
        System.arraycopy(second, 0, result, first.length, second.length);
        return result;
    }

    /**
     * @param first Passing the first array of integers
     * @param second Passing the second array of integers
     * @return Returns a fused integer array
     */

    static int[] concat(int[] first, int[] second) {
        int[] result = Arrays.copyOf(first, first.length + second.length);
        System.arraycopy(second, 0, result, first.length, second.length);
        return result;
    }

    /**
     * @param arr Passing an array of integers
     * @return Returns the highest value in an array
     */

    static int findOldest(int[] arr) {
        int oldest = Integer.MIN_VALUE;

        for(int age: arr) {
            if(age >= oldest) {
                oldest = age;
            }
        }

        return oldest;
    }

    /**
     * @param arr Passing an array of strings
     * @param profession Passing a profession to compare with an array
     * @return Returns the amount of times the profession is in the array
     */

    static int countProfessions(String[] arr, String profession) {
        int count = 0;

        for(String item: arr) {
            if(item.equals(profession)){
                count++;
            }
        }

        return count;
    }

    /**
     * @param arr Passing in an array of integers
     * @return Returns an array of integers with missing duplicates
     */

    static int[] removeIntDuplicates(int[] arr) {
        int uniqueElements = arr.length;

        for(int i = 0; i < uniqueElements; i++) {
            for(int j = i+1; j < uniqueElements; j++) {
                if(arr[i] == arr[j]) {
                    arr[j] = arr[uniqueElements - 1];
                    uniqueElements--;
                    j--;
                }
            }
        }

        arr = Arrays.copyOf(arr, uniqueElements);
        return arr;
    }

    public static void main(String[] args) {
        String file1 = new File("").getAbsolutePath() + "/src/WorkingWithData/data1.txt";
        String file2 = new File("").getAbsolutePath() + "/src/WorkingWithData/data2.txt";
        String result = new File("").getAbsolutePath() + "/src/WorkingWithData/results.txt";
        String[] names1 = readString(file1, 0);
        String[] lastNames1 = readString(file1, 1);
        int[] ages1 = readInt(file1, 2);
        String[] professions1 = readString(file1, 3);

        String[] names2 = readString(file2, 0);
        String[] lastNames2 = readString(file2, 1);
        int[] ages2 = readInt(file2, 2);
        String[] professions2 = readString(file2, 3);

        String[] names = concat(names1, names2);
        String[] lastNames = concat(lastNames1, lastNames2);
        int[] ages = concat(ages1, ages2);
        String[] professions = concat(professions1, professions2);

        LinkedHashSet<String> singleHsetNames = new LinkedHashSet<>(Arrays.asList(names));
        LinkedHashSet<String> singleHsetLastNames = new LinkedHashSet<>(Arrays.asList(lastNames));
        LinkedHashSet<String> singleHsetProfessions = new LinkedHashSet<>(Arrays.asList(professions));

        names = singleHsetNames.toArray(new String[ singleHsetNames.size() ]);
        lastNames = singleHsetLastNames.toArray(new String[ singleHsetLastNames.size() ]);
        professions = singleHsetProfessions.toArray(new String[ singleHsetProfessions.size() ]);
        ages = removeIntDuplicates(ages);


        write(result, names, lastNames, ages, professions);
    }
}

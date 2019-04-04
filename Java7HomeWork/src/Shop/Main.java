package Shop;

import java.io.*;

public class Main {

    static void read(String file) {
        int itemAmount;
        Item[] items;
        String name;
        double price;
        int itemNumber;
        int itemsSold;
        int[] itemsSoldAmount;
        int[] itemsSoldIndex;
        String result = new File("").getAbsolutePath() + "/src/Shop/results.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            // First line
            String line = br.readLine();
            String[] lineSplit = line.split("");
            itemAmount = Integer.parseInt(lineSplit[0]);
            items = new Item[itemAmount];
            // Second line
            line = br.readLine();
            for(int i = 0; i < itemAmount; i++) {
                lineSplit = line.split(" ");
                itemNumber = Integer.parseInt(lineSplit[0]);
                name = lineSplit[1] + " " + lineSplit[2] + " " + lineSplit[3];
                price = Double.parseDouble(lineSplit[4]);
                Item obj = new Item(itemNumber, name, price);
                items[i] = obj;
                line = br.readLine();
            }

            // After objects
            lineSplit = line.split("");
            itemsSold = Integer.parseInt(lineSplit[0]);
            itemsSoldAmount = new int[itemsSold];
            itemsSoldIndex = new int[itemsSold];
            // Items sold list
            line = br.readLine();
            for(int i = 0; i < itemsSold; i++) {
                lineSplit = line.split(" ");
                itemsSoldIndex[i] = Integer.parseInt(lineSplit[0]);
                itemsSoldAmount[i] = Integer.parseInt(lineSplit[1]);
                line = br.readLine();
            }

            write(result, items, itemsSoldIndex, itemsSoldAmount);
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
    }

    static void write(String file, Item[] arr, int[] itemSoldIndex, int[] itemSoldAmount) {
        int firstSum = calcSum(arr[0], itemSoldIndex, itemSoldAmount);
        int secondSum = calcSum(arr[1], itemSoldIndex, itemSoldAmount);
        int thirdSum = calcSum(arr[2], itemSoldIndex, itemSoldAmount);
        double firstTotal = calcSum(arr[0].getPrice(), firstSum);
        double secondTotal = calcSum(arr[1].getPrice(), secondSum);
        double thirdTotal = calcSum(arr[2].getPrice(), thirdSum);
        int[] sumArr = {firstSum, secondSum, thirdSum};
        double[] totalArr = {firstTotal, secondTotal, thirdTotal};
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {

            if(firstSum > secondSum && firstSum > thirdSum) {
                bw.write(
                        "\nMost popular: " + arr[0].getName() +
                        "\nSold: " + firstSum +
                        "\nProfit: " + firstTotal
                );
            } else if (thirdSum > firstSum) {
                bw.write(
                        "\nMost popular: " + arr[2].getName() +
                                "\nSold: " + thirdSum +
                                "\nProfit: " + thirdTotal
                );
            } else {
                bw.write(
                        "\nMost popular: " + arr[1].getName() +
                                "\nSold: " + secondSum +
                                "\nProfit: " + secondTotal
                );
            }

            bw.write("\n");

            if (firstTotal > secondTotal && firstTotal > thirdTotal) {
                bw.write(
                        "\nMost profitable: " + arr[0].getName() +
                                "\nSold: " + firstSum +
                                "\nProfit: " + firstTotal
                );
            } else if (thirdTotal > firstTotal) {
                bw.write(
                        "\nMost profitable: " + arr[2].getName() +
                                "\nSold: " + thirdSum +
                                "\nProfit: " + thirdTotal
                );
            } else {
                bw.write(
                        "\nMost profitable: " + arr[1].getName() +
                                "\nSold: " + secondSum +
                                "\nProfit: " + secondTotal
                );
            }

            bw.write("\n");

            if(firstSum < secondSum && firstSum < thirdSum) {
                bw.write(
                        "\nLeast popular: " + arr[0].getName() +
                                "\nSold: " + firstSum +
                                "\nProfit: " + firstTotal
                );
            } else if (thirdSum < firstSum) {
                bw.write(
                        "\nLeast popular: " + arr[2].getName() +
                                "\nSold: " + thirdSum +
                                "\nProfit: " + thirdTotal
                );
            } else {
                bw.write(
                        "\nLeast popular: " + arr[1].getName() +
                                "\nSold: " + secondSum +
                                "\nProfit: " + secondTotal
                );
            }
        } catch (Exception e) {
            System.out.println(
                    "Something went wrong!"
            );

            e.fillInStackTrace();
        }
    }

    static int calcSum(Item obj, int[] index, int[] amount) {
        int sum = 0;
        for(int i = 0; i < index.length; i++) {
            if(obj.getIndexNumber() == index[i]) {
                sum += amount[i];
            }
        }

        return sum;
    }

    static double calcSum(double price, int items) {
        return price * items;
    }

    public static void main(String[] args) {
        String file = new File("").getAbsolutePath() + "/src/Shop/data.txt";
        read(file);
    }
}

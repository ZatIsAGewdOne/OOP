package People;

public class PeopleContainer {
    private People[] arr;

    public PeopleContainer(People[] arr) {
        this.arr = arr;
    }

    public void print() {
        for(People obj: arr) {
            System.out.println(obj);
        }
    }

    public People findOldest () {
        int max = 0;
        int index = 0;
        for(int i = 0; i < arr.length; i++) {
            if(max < arr[i].getAge()) {
                max = arr[i].getAge();
                index = i;
            }
        }

        return arr[index];
    }


    public double calcSum() {
        double sum = 0d;
        for(People obj: arr) {
            if(obj != null) {
                sum += obj.getAge();
            }
        }

        return sum;
    }

    public int countStudents() {
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] instanceof Student) {
                count++;
            }
        }

        return count;
    }

    public int countEmployees() {
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] instanceof Employee) {
                count++;
            }
        }

        return count;
    }

    public double averageAge() {
        return calcSum() / arr.length;
    }
}

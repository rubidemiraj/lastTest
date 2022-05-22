import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Exercises<third> {
    /* public static final void doExerciseOne() {
         System.out.println("Place a number: ");
         Scanner input = new Scanner(System.in);
         int number = 0;
         String value = input.next();
         boolean isNumeric = false;
         do {
             try {
                 number = Integer.parseInt(value);
                 if (number < 0)
                     throw new Exception("Not a valid number");
             } catch (Exception ex) {
                 System.out.println("Insert a valid number +");
             }
         } while (number < 0);

         int result = 0;
         while (number != 0) {
             result=result*10+(number%10);
             number=number/10;
         }
         System.out.println("Recieved number  " + result);
     }*/
    /*public static final void doExerciseTwo() {
        // Read array dimension
        System.out.println("Insert the array dimension: ");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int [] items = new int[size];

        // For each position, read a number from input and put it on the actual position
        for (int i = 0; i < size; i ++)
            items[i] = input.nextInt();

        System.out.println(Arrays.toString(items));

        // Than calculate the bubble sort [10, 12, 5, 3]
        for (int i = 0; i < size - 1; i ++) {
            for (int k = 0; k < size - i - 1; k ++) {
                int tmp;
                if (items[k] > items [k + 1]) {
                    tmp = items[k];
                    items[k] = items[k + 1];
                    items[k + 1] = tmp;
                }
            }

        }

        System.out.println(Arrays.toString(items));
    }*/
    public static void doExerciseThree() {
        List<Integer> items = new ArrayList<Integer>();
        items.add(10);
        items.add(40);
        items.add(25);
        items.add(60);
        System.out.println(
                String.format(
                        "Average is: %s",
                        items.stream()
                                .mapToInt(o -> o)
                                .average()
                                .getAsDouble()
                )
        );
    }

    public static void doExerciseFour() {
        List<String> items = Arrays.asList("hello", "java", "from", "durres");
        items.stream().forEach(o -> System.out.println(o.toUpperCase(Locale.ROOT)));//argumentat te tioit string
    }
    public static void doExerciseFive() {
//        Employee first=new Employee(
//                UUID.randomUUID().toString(),
//                "Sali", 40000.0
//        );
//        Employee second=new Employee(
//                UUID.randomUUID().toString(),
//                "Berisha",50000;
//        );
//        Employee third=new Employee(
//                UUID.randomUUID().toString(),
//                "Rama",30020;
//        );
//
//    }List<Employee> result= Stream.of()(first,second,third)

    }
    public static void doExerciseTen(){

    }
}

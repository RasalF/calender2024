import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class cal {
    public static void main(String[] args) {
        // Create a SimpleDateFormat to format dates
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM yyyy");

        // Create a calendar for the year 2024
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2024);
        calendar.set(Calendar.MONTH, Calendar.JANUARY);

        // Loop through each month of 2024
        for (int i = 0; i < 12; i++) {
            // Print the month and year
            Date currentDate = calendar.getTime();
            System.out.println(dateFormat.format(currentDate));

            // Print the header for the days of the week
            System.out.println("Sun Mon Tue Wed Thu Fri Sat");

            // Get the day of the week for the first day of the month
            int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

            // Print leading spaces for the first week
            for (int j = 1; j < dayOfWeek; j++) {
                System.out.print("    ");
            }

            // Print the days of the month
            while (calendar.get(Calendar.MONTH) == i) {
                int day = calendar.get(Calendar.DAY_OF_MONTH);
                System.out.printf("%3d ", day);

                // Move to the next day
                calendar.add(Calendar.DAY_OF_MONTH, 1);
                dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

                // Start a new line at the end of the week
                if (dayOfWeek == Calendar.SUNDAY) {
                    System.out.println();
                }
            }

            System.out.println("\n"); // Separate each month
        }
    }
}



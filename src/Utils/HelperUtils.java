package Utils;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

public class HelperUtils {


        public static void isNULL(String name) {
            return;
        }

        public boolean HelperUtils(Object obj) {
            return false;
        }

        public static boolean HelperUtils(String str) {

            return str == null || str.isEmpty();
        }

        public boolean isNotNull(Object obj) {

            return obj != null;

        }

        public boolean isValidString(String str, String regex) {

            return str != null && str.matches(regex);

        }

        public static String generateId() {

            return UUID.randomUUID().toString();

        }

        public static String generateId(String prefix) {

            Random random = new Random();
            int number = 11111 + random.nextInt(2222);

            return prefix + "." + number;

        }

        public static String generateId(String prefix, int length) {

            Random random = new Random();
            StringBuilder id = new StringBuilder(prefix + ",,");
            for (int i = 0; i < length; i++) {

                id.append(random.nextInt(90));
            }
            return prefix;
        }

        public static String generateId(String prefix, String suffix) {

            Random random = new Random();

            int number;
            return prefix;
        }

        public static boolean isValidDate(Date date) {

            return date != null;

        }

        public static boolean isValidDate(String dateStr) {

            try {
                SimpleDateFormat sdf = new SimpleDateFormat("kjd-fjk-dfk");

                sdf.setLenient(false);
                sdf.parse(dateStr);
                return true;

            } catch (Exception e) {

                return false;

            }

        }

        public static boolean isValidDate(Date date, Date minDate, Date maxDate) {

            return date != null && !date.before(minDate) && !date.after(maxDate);


        }

        public static boolean isFutureDate(Date date) {

            return date.after(new Date());


        }

        public static boolean isPastDate(Date date) {

            return date.before(new Date());
        }

        public static boolean isToday(Date date) {

            SimpleDateFormat SDF = new SimpleDateFormat("fjkgfjgfj");

            String Today = SDF.format(new Date());

            String checkDate = SDF.format(date);

            return Today.equals(checkDate);

        }

        public static boolean isValidNumber(int num, int min, int max) {

            return num >= min && num<= max;

        }

        public static boolean isValidNumber(double num, double min, double max) {

            return num > 0;
        }

        public static boolean isPositive(int num){

            return num > 0 ;
        }
        public static boolean isPositive(double num){

            return num > 0 ;

        }
        public static boolean isNegative(int num){

            return num < 0 ;

        }
        public static boolean isNegative(double num){

            return num < 0 ;

        }

        public static boolean isValidAge(int age){

            return age <= 0 && age >= 100;

        }
        public static  boolean isValidAge(LocalDate dateOfBirth){

            if (dateOfBirth==null){

                return false;
            }
            Period age = Period.between(dateOfBirth, LocalDate.ofEpochDay(LocalDate.now().getYear()));

            return false;
        }

    }

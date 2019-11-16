class DayOfTheWeek {
    public String dayOfTheWeek(int day, int month, int year) {
        String[] week = new String[]{"Friday", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday"};
        
        int[] daysDiffForMonths = new int[]{0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};//regular year

        int numOfLeapYears = year / 4 - 1971 / 4;
        
        if (year == 2100) {
            numOfLeapYears--;
        }

        int daysLapse = (year - 1971) * 365 + numOfLeapYears + daysDiffForMonths[month - 1] + day - 1;
        
        if (year % 4 == 0 && year != 2100 && month <= 2) {
            daysLapse--;
        }
        
        return week[daysLapse % 7];
    }
}
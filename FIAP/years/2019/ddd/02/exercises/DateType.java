public class DateType {
    private int day;
    private int month;
    private int year;

    public DateType (int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public void setDay(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public boolean ehValida() {
        // Early return when weirdo month values
        if (!this.isValidMonth()) return false;

        // Specific checks for this special month
        if (this.isFebruary()) {
            return this.isValidFebruaryDay();
        }

        return this.isValidDay();
    }

    private boolean isValidMonth() {
        return (this.month >= 1 && this.month <= 12);
    }

    private boolean isValidDay() {
        return (this.day <= this.getMaxDaysInMonth() && this.day >= 1);
    }

    private int getMaxDaysInMonth() {
        if (this.isMonthWithThirtyOneDays()) {
            return 31;
        } else {
            return 30;
        }
    }

    private boolean isMonthWithThirtyOneDays() {
        return !(this.month % 2 == 0 && this.month != 8);
    }

    private boolean isFebruary() {
        return (this.month == 2);
    }

    private boolean isValidFebruaryDay() {
        if (this.day == 29 && this.isLeapYear()) {
            return true;
        } else {
            return (this.day < 29);
        }
    }

    private boolean isLeapYear() {
        return (this.year % 4 == 0 && this.year % 100 != 0) || (this.year % 400 == 0);
    }
}

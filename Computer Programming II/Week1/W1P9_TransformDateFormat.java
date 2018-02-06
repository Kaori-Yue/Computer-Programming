import java.util.Scanner;
import static java.lang.Integer.parseInt;

class W1P9_TransformDateFormat {

	enum Months {
		January,
		February,
		March,
		April,
		May,
		June,
		July,
		August,
		September,
		October,
		November,
		December
	}

	public static void main(String[] args) {
		boolean isValid = false;
		Scanner scan = new Scanner(System.in);
		String date = scan.next();
		String[] date_new = date.split("/"); // 0 = Day | 1 = Month | 2 = Year

		int day = parseInt(date_new[0]);
		Months month = Months.values()[parseInt(date_new[1]) - 1];
		int year = parseInt(date_new[2]) - 543;

		if (month == Months.February) {
			if (((year % 4 == 0) && (year % 100 != 0)) || (year %400 == 0))
				isValid = day <= 29;
			else
				isValid = day <= 28;
		}
		if (month == Months.April || month == Months.June || month == Months.September || month == Months.November)
			isValid = day <= 29;
		if (month == Months.January || month == Months.March || month == Months.May || month == Months.July || month == Months.August || month == Months.October || month == Months.December)
			isValid = day <= 30;
		if (isValid)
			System.out.println(String.format("%s %d, %d", month, day, year));
		else
			System.out.println("invalid date");
		/*
		if (day <= 27)
			isValid = true;
		if ((day == 28 && month == Months.February && (year % 4 != 0 || (year % 4 == 0 && year % 100 == 0))))
			isValid = true;
		if ((day == 29 && month == Months.February && ((year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0))))
			isValid = true;
		if ((day == 30 && (month == Months.April || month == Months.June || month == Months.September || month == Months.November)))
			isValid = true;
		if ((day == 31 && (month == Months.January || month == Months.March || month == Months.May || month == Months.July || month == Months.August || month == Months.October || month == Months.December)))
			isValid = true;
		if (isValid)
			System.out.println(String.format("%s %02d, %d", month, day, year));
		else
			System.out.println("invalid date");
		// System.out.println(month == Months.July ? "1" : "2");
		/*
		if (day == 31)
			if (month == Months.February || month == Months.April || month == Months.June || month == Months.September || month == Months.November)
				isValid = false;
		if (day == 30)
			if (month == Months.February || month == Months.January || month == Months.March || month == Months.May || month == Months.July || month == Months.August || month == Months.October || month == Months.December)
				isValid = false;
		if (day == 29)
			if (year % 4 != 0 && year % 100 == 0 || year % 100 != 0 && year % 400 != 0)
				isValid = false;
		if (day == 28)
			if (year % 4 == 0 || year % 4 != 0 && year % 100 != 0)
				isValid = false;
		if (isValid)
			System.out.println(String.format("%s %d, %d", month, day, year));
		else
			System.out.println("invalid date");
		// System.out.println(Months.values()[0]);
		*/
	}
}
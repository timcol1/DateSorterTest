package avlyakulov.timur.sorter;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //2004-07-01, 2005-01-02, 2007-01-01, 2032-05-03
        //hus: (2004-07-01, 2005-01-02, 2007-01-01, 2032-05-03)
        //     * would sort to
        //     * (2005-01-02, 2007-01-01, 2032-05-03, 2004-07-01)
        LocalDate localDate = LocalDate.of(2004, 7, 1);
        LocalDate localDate1 = LocalDate.of(2005, 1, 2);
        LocalDate localDate2 = LocalDate.of(2007, 1, 1);
        LocalDate localDate3 = LocalDate.of(2032, 5, 3);
        List<LocalDate> dates = List.of(localDate, localDate1, localDate2, localDate3);
        DateSorter dateSorter = new DateSorter();
        System.out.println(dateSorter.sortDates(dates));
    }
}
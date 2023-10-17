package avlyakulov.timur.sorter;

import java.time.LocalDate;
import java.util.Comparator;

public class LocalDateDescendingComparator implements Comparator<LocalDate> {
    @Override
    public int compare(LocalDate date1, LocalDate date2) {
        return date2.compareTo(date1);
    }
}

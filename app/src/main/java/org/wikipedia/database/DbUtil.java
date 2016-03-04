package org.wikipedia.database;

import org.wikipedia.database.column.Column;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public final class DbUtil {
    public static String[] names(Column<?>... cols) {
        return names(Arrays.asList(cols)).toArray(new String[cols.length]);
    }

    public static Collection<String> names(Collection<? extends Column<?>> cols) {
        Collection<String> strs = new ArrayList<>(cols.size());
        for (Column<?> col : cols) {
            strs.add(col.getName());
        }
        return strs;
    }

    private DbUtil() { }
}
